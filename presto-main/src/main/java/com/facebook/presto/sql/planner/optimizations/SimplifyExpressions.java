/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.sql.planner.optimizations;

import com.facebook.presto.metadata.Metadata;
import com.facebook.presto.sql.analyzer.Session;
import com.facebook.presto.sql.analyzer.Type;
import com.facebook.presto.sql.planner.ExpressionInterpreter;
import com.facebook.presto.sql.planner.LiteralInterpreter;
import com.facebook.presto.sql.planner.NoOpSymbolResolver;
import com.facebook.presto.sql.planner.PlanNodeIdAllocator;
import com.facebook.presto.sql.planner.Symbol;
import com.facebook.presto.sql.planner.SymbolAllocator;
import com.facebook.presto.sql.planner.plan.FilterNode;
import com.facebook.presto.sql.planner.plan.PlanNode;
import com.facebook.presto.sql.planner.plan.PlanNodeRewriter;
import com.facebook.presto.sql.planner.plan.PlanRewriter;
import com.facebook.presto.sql.planner.plan.ProjectNode;
import com.facebook.presto.sql.planner.plan.TableScanNode;
import com.facebook.presto.sql.tree.BooleanLiteral;
import com.facebook.presto.sql.tree.Expression;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

public class SimplifyExpressions
        extends PlanOptimizer
{
    private final Metadata metadata;

    public SimplifyExpressions(Metadata metadata)
    {
        this.metadata = checkNotNull(metadata, "metadata is null");
    }

    @Override
    public PlanNode optimize(PlanNode plan, Session session, Map<Symbol, Type> types, SymbolAllocator symbolAllocator, PlanNodeIdAllocator idAllocator)
    {
        checkNotNull(plan, "plan is null");
        checkNotNull(session, "session is null");
        checkNotNull(types, "types is null");
        checkNotNull(symbolAllocator, "symbolAllocator is null");
        checkNotNull(idAllocator, "idAllocator is null");

        return PlanRewriter.rewriteWith(new Rewriter(metadata, session), plan);
    }

    private static class Rewriter
            extends PlanNodeRewriter<Void>
    {
        private final Metadata metadata;
        private final Session session;

        public Rewriter(Metadata metadata, Session session)
        {
            this.metadata = metadata;
            this.session = session;
        }

        /**
         * Tao Yang
         * 2014/3/26
         * call this recursively through planRewriter.rewrite() and return a new copy of source
         * apply simplifyExpression on node.getOutputMap(Map<Symbol, Expression>) for each projectNode in plan
         */
        @Override
        public PlanNode rewriteProject(ProjectNode node, Void context, PlanRewriter<Void> planRewriter)
        {
            PlanNode source = planRewriter.rewrite(node.getSource(), context);
            /**
             * Tao Yang
             * 2014/3/25
             * Maps.transformValues:
             * public static <K, V1, V2> Map<K, V2> transformValues(Map<K,V1> fromMap, Function<? super V1, V2> function)
             * Returns a view of a map where each value is transformed by a function.
             * So the following code is simplify the node's output
             * 2014/3/26
             * transform a <K, V1> map into a <K, V2> map using Function, which contains an "apply" function who takes V1 as parameter and returns V2
             */
            Map<Symbol, Expression> assignments = ImmutableMap.copyOf(Maps.transformValues(node.getOutputMap(), simplifyExpressionFunction()));
            return new ProjectNode(node.getId(), source, assignments);
        }

        // call rewriteFilter only if the query plan has a filterNode. Simplify it's predicate
        @Override
        public PlanNode rewriteFilter(FilterNode node, Void context, PlanRewriter<Void> planRewriter)
        {
            PlanNode source = planRewriter.rewrite(node.getSource(), context);
            Expression simplified = simplifyExpression(node.getPredicate());
            if (simplified.equals(BooleanLiteral.TRUE_LITERAL)) {
                return source;
            }
            return new FilterNode(node.getId(), source, simplified);
        }

        @Override
        public PlanNode rewriteTableScan(TableScanNode node, Void context, PlanRewriter<Void> planRewriter)
        {
            Expression originalConstraint = null;
            if (node.getOriginalConstraint() != null) {
                originalConstraint = simplifyExpression(node.getOriginalConstraint());
            }
            return new TableScanNode(node.getId(), node.getTable(), node.getOutputSymbols(), node.getAssignments(), originalConstraint, node.getGeneratedPartitions());
        }

        private Function<Expression, Expression> simplifyExpressionFunction()
        {
            return new Function<Expression, Expression>()
            {
                @Override
                public Expression apply(Expression input)
                {
                    return simplifyExpression(input);
                }
            };
        }

        /**
         * Tao Yang
         * 2014/3/25
         * this is the key point of this SimplyfyExpressions optimizer
         * use ExpressionInterpreter.optimize() to optimize the input expressions
         */
        private Expression simplifyExpression(Expression input)
        {
            // expressionOptimizer: static method for returning an instance of ExpressionInterpreter
            ExpressionInterpreter interpreter = ExpressionInterpreter.expressionOptimizer(input, metadata, session);
            // parameter is a static final instance of NoOpSymbolResolver
            return LiteralInterpreter.toExpression(interpreter.optimize(NoOpSymbolResolver.INSTANCE));
        }
    }
}
