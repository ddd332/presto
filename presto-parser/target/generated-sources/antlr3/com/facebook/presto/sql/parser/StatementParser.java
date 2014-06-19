// $ANTLR 3.4 com/facebook/presto/sql/parser/Statement.g 2014-05-07 14:42:04

    package com.facebook.presto.sql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class StatementParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "ALIASED_COLUMNS", "ALIASED_RELATION", "ALL", "ALL_COLUMNS", "AND", "AS", "ASC", "BACKQUOTED_IDENT", "BERNOULLI", "BETWEEN", "BIGINT", "BOOLEAN", "BY", "CASE", "CAST", "CATALOGS", "CHAR", "CHARACTER", "COALESCE", "COLON_IDENT", "COLUMNS", "COLUMN_DEF", "COMMENT", "COMPARE", "CONSTRAINT", "CREATE", "CREATE_ALIAS", "CREATE_MATERIALIZED_VIEW", "CREATE_TABLE", "CROSS", "CROSS_JOIN", "CURRENT", "CURRENT_DATE", "CURRENT_ROW", "CURRENT_TIME", "CURRENT_TIMESTAMP", "DATE", "DAY", "DEC", "DECIMAL", "DECIMAL_VALUE", "DESC", "DESCRIBE", "DIGIT", "DIGIT_IDENT", "DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", "DROP_ALIAS", "DROP_TABLE", "ELSE", "END", "EQ", "ESCAPE", "EXCEPT", "EXISTS", "EXPLAIN", "EXPLAIN_FORMAT", "EXPLAIN_OPTIONS", "EXPLAIN_TYPE", "EXPONENT", "EXTRACT", "FALSE", "FIRST", "FOLLOWING", "FOR", "FORMAT", "FROM", "FULL", "FULL_JOIN", "FUNCTIONS", "FUNCTION_CALL", "GRAPHVIZ", "GROUP", "GROUP_BY", "GT", "GTE", "HAVING", "HOUR", "IDENT", "IF", "IN", "INNER", "INNER_JOIN", "INT", "INTEGER", "INTEGER_VALUE", "INTERSECT", "INTERVAL", "IN_LIST", "IS", "IS_DISTINCT_FROM", "IS_NOT_NULL", "IS_NULL", "JOIN", "JOINED_TABLE", "LAST", "LEFT", "LEFT_JOIN", "LETTER", "LEXER_ERROR", "LIKE", "LIMIT", "LOGICAL", "LT", "LTE", "MATERIALIZED", "MINUTE", "MONTH", "NATURAL", "NEGATIVE", "NEQ", "NOT", "NOT_NULL", "NULL", "NULLIF", "NULLS", "NUMBER", "NUMERIC", "ON", "OR", "ORDER", "ORDER_BY", "OUTER", "OVER", "PARTITION", "PARTITIONS", "PARTITION_BY", "PRECEDING", "QNAME", "QUALIFIED_JOIN", "QUERY", "QUERY_SPEC", "QUOTED_IDENT", "RANGE", "RECURSIVE", "REFRESH", "REFRESH_MATERIALIZED_VIEW", "RIGHT", "RIGHT_JOIN", "ROW", "ROWS", "SAMPLED_RELATION", "SCHEMAS", "SEARCHED_CASE", "SECOND", "SELECT", "SELECT_ITEM", "SELECT_LIST", "SHOW", "SHOW_CATALOGS", "SHOW_COLUMNS", "SHOW_FUNCTIONS", "SHOW_PARTITIONS", "SHOW_SCHEMAS", "SHOW_TABLES", "SIMPLE_CASE", "SORT_ITEM", "STATEMENT_LIST", "STRATIFY", "STRATIFY_ON", "STRING", "SUBSTRING", "SYSTEM", "TABLE", "TABLES", "TABLESAMPLE", "TABLE_ELEMENT_LIST", "TABLE_SUBQUERY", "TERMINATOR", "TEXT", "THEN", "TIME", "TIMESTAMP", "TRUE", "TYPE", "UNBOUNDED", "UNBOUNDED_FOLLOWING", "UNBOUNDED_PRECEDING", "UNION", "USING", "VARCHAR", "VARYING", "VIEW", "VIEW_REFRESH", "WHEN", "WHERE", "WINDOW", "WITH", "WITH_LIST", "WITH_QUERY", "WS", "YEAR", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__199=199;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int ALIAS=4;
    public static final int ALIASED_COLUMNS=5;
    public static final int ALIASED_RELATION=6;
    public static final int ALL=7;
    public static final int ALL_COLUMNS=8;
    public static final int AND=9;
    public static final int AS=10;
    public static final int ASC=11;
    public static final int BACKQUOTED_IDENT=12;
    public static final int BERNOULLI=13;
    public static final int BETWEEN=14;
    public static final int BIGINT=15;
    public static final int BOOLEAN=16;
    public static final int BY=17;
    public static final int CASE=18;
    public static final int CAST=19;
    public static final int CATALOGS=20;
    public static final int CHAR=21;
    public static final int CHARACTER=22;
    public static final int COALESCE=23;
    public static final int COLON_IDENT=24;
    public static final int COLUMNS=25;
    public static final int COLUMN_DEF=26;
    public static final int COMMENT=27;
    public static final int COMPARE=28;
    public static final int CONSTRAINT=29;
    public static final int CREATE=30;
    public static final int CREATE_ALIAS=31;
    public static final int CREATE_MATERIALIZED_VIEW=32;
    public static final int CREATE_TABLE=33;
    public static final int CROSS=34;
    public static final int CROSS_JOIN=35;
    public static final int CURRENT=36;
    public static final int CURRENT_DATE=37;
    public static final int CURRENT_ROW=38;
    public static final int CURRENT_TIME=39;
    public static final int CURRENT_TIMESTAMP=40;
    public static final int DATE=41;
    public static final int DAY=42;
    public static final int DEC=43;
    public static final int DECIMAL=44;
    public static final int DECIMAL_VALUE=45;
    public static final int DESC=46;
    public static final int DESCRIBE=47;
    public static final int DIGIT=48;
    public static final int DIGIT_IDENT=49;
    public static final int DISTINCT=50;
    public static final int DISTRIBUTED=51;
    public static final int DOUBLE=52;
    public static final int DROP=53;
    public static final int DROP_ALIAS=54;
    public static final int DROP_TABLE=55;
    public static final int ELSE=56;
    public static final int END=57;
    public static final int EQ=58;
    public static final int ESCAPE=59;
    public static final int EXCEPT=60;
    public static final int EXISTS=61;
    public static final int EXPLAIN=62;
    public static final int EXPLAIN_FORMAT=63;
    public static final int EXPLAIN_OPTIONS=64;
    public static final int EXPLAIN_TYPE=65;
    public static final int EXPONENT=66;
    public static final int EXTRACT=67;
    public static final int FALSE=68;
    public static final int FIRST=69;
    public static final int FOLLOWING=70;
    public static final int FOR=71;
    public static final int FORMAT=72;
    public static final int FROM=73;
    public static final int FULL=74;
    public static final int FULL_JOIN=75;
    public static final int FUNCTIONS=76;
    public static final int FUNCTION_CALL=77;
    public static final int GRAPHVIZ=78;
    public static final int GROUP=79;
    public static final int GROUP_BY=80;
    public static final int GT=81;
    public static final int GTE=82;
    public static final int HAVING=83;
    public static final int HOUR=84;
    public static final int IDENT=85;
    public static final int IF=86;
    public static final int IN=87;
    public static final int INNER=88;
    public static final int INNER_JOIN=89;
    public static final int INT=90;
    public static final int INTEGER=91;
    public static final int INTEGER_VALUE=92;
    public static final int INTERSECT=93;
    public static final int INTERVAL=94;
    public static final int IN_LIST=95;
    public static final int IS=96;
    public static final int IS_DISTINCT_FROM=97;
    public static final int IS_NOT_NULL=98;
    public static final int IS_NULL=99;
    public static final int JOIN=100;
    public static final int JOINED_TABLE=101;
    public static final int LAST=102;
    public static final int LEFT=103;
    public static final int LEFT_JOIN=104;
    public static final int LETTER=105;
    public static final int LEXER_ERROR=106;
    public static final int LIKE=107;
    public static final int LIMIT=108;
    public static final int LOGICAL=109;
    public static final int LT=110;
    public static final int LTE=111;
    public static final int MATERIALIZED=112;
    public static final int MINUTE=113;
    public static final int MONTH=114;
    public static final int NATURAL=115;
    public static final int NEGATIVE=116;
    public static final int NEQ=117;
    public static final int NOT=118;
    public static final int NOT_NULL=119;
    public static final int NULL=120;
    public static final int NULLIF=121;
    public static final int NULLS=122;
    public static final int NUMBER=123;
    public static final int NUMERIC=124;
    public static final int ON=125;
    public static final int OR=126;
    public static final int ORDER=127;
    public static final int ORDER_BY=128;
    public static final int OUTER=129;
    public static final int OVER=130;
    public static final int PARTITION=131;
    public static final int PARTITIONS=132;
    public static final int PARTITION_BY=133;
    public static final int PRECEDING=134;
    public static final int QNAME=135;
    public static final int QUALIFIED_JOIN=136;
    public static final int QUERY=137;
    public static final int QUERY_SPEC=138;
    public static final int QUOTED_IDENT=139;
    public static final int RANGE=140;
    public static final int RECURSIVE=141;
    public static final int REFRESH=142;
    public static final int REFRESH_MATERIALIZED_VIEW=143;
    public static final int RIGHT=144;
    public static final int RIGHT_JOIN=145;
    public static final int ROW=146;
    public static final int ROWS=147;
    public static final int SAMPLED_RELATION=148;
    public static final int SCHEMAS=149;
    public static final int SEARCHED_CASE=150;
    public static final int SECOND=151;
    public static final int SELECT=152;
    public static final int SELECT_ITEM=153;
    public static final int SELECT_LIST=154;
    public static final int SHOW=155;
    public static final int SHOW_CATALOGS=156;
    public static final int SHOW_COLUMNS=157;
    public static final int SHOW_FUNCTIONS=158;
    public static final int SHOW_PARTITIONS=159;
    public static final int SHOW_SCHEMAS=160;
    public static final int SHOW_TABLES=161;
    public static final int SIMPLE_CASE=162;
    public static final int SORT_ITEM=163;
    public static final int STATEMENT_LIST=164;
    public static final int STRATIFY=165;
    public static final int STRATIFY_ON=166;
    public static final int STRING=167;
    public static final int SUBSTRING=168;
    public static final int SYSTEM=169;
    public static final int TABLE=170;
    public static final int TABLES=171;
    public static final int TABLESAMPLE=172;
    public static final int TABLE_ELEMENT_LIST=173;
    public static final int TABLE_SUBQUERY=174;
    public static final int TERMINATOR=175;
    public static final int TEXT=176;
    public static final int THEN=177;
    public static final int TIME=178;
    public static final int TIMESTAMP=179;
    public static final int TRUE=180;
    public static final int TYPE=181;
    public static final int UNBOUNDED=182;
    public static final int UNBOUNDED_FOLLOWING=183;
    public static final int UNBOUNDED_PRECEDING=184;
    public static final int UNION=185;
    public static final int USING=186;
    public static final int VARCHAR=187;
    public static final int VARYING=188;
    public static final int VIEW=189;
    public static final int VIEW_REFRESH=190;
    public static final int WHEN=191;
    public static final int WHERE=192;
    public static final int WINDOW=193;
    public static final int WITH=194;
    public static final int WITH_LIST=195;
    public static final int WITH_QUERY=196;
    public static final int WS=197;
    public static final int YEAR=198;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public StatementParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public StatementParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[112+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return StatementParser.tokenNames; }
    public String getGrammarFileName() { return "com/facebook/presto/sql/parser/Statement.g"; }


        @Override
        protected Object recoverFromMismatchedToken(IntStream input, int tokenType, BitSet follow)
                throws RecognitionException
        {
            throw new MismatchedTokenException(tokenType, input);
        }

        @Override
        public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
                throws RecognitionException
        {
            throw e;
        }

        @Override
        public String getErrorMessage(RecognitionException e, String[] tokenNames)
        {
            if (e.token.getType() == BACKQUOTED_IDENT) {
                return "backquoted identifiers are not supported; use double quotes to quote identifiers";
            }
            if (e.token.getType() == DIGIT_IDENT) {
                return "identifiers must not start with a digit; surround the identifier with double quotes";
            }
            if (e.token.getType() == COLON_IDENT) {
                return "identifiers must not contain a colon; use '@' instead of ':' for table links";
            }
            return super.getErrorMessage(e, tokenNames);
        }


    public static class singleStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleStatement"
    // com/facebook/presto/sql/parser/Statement.g:140:1: singleStatement : statement EOF -> statement ;
    public final StatementParser.singleStatement_return singleStatement() throws RecognitionException {
        StatementParser.singleStatement_return retval = new StatementParser.singleStatement_return();
        retval.start = input.LT(1);

        int singleStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EOF2=null;
        StatementParser.statement_return statement1 =null;


        CommonTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:141:5: ( statement EOF -> statement )
            // com/facebook/presto/sql/parser/Statement.g:141:7: statement EOF
            {
            pushFollow(FOLLOW_statement_in_singleStatement515);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_singleStatement517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:21: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, singleStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "singleStatement"


    public static class singleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleExpression"
    // com/facebook/presto/sql/parser/Statement.g:144:1: singleExpression : expr EOF -> expr ;
    public final StatementParser.singleExpression_return singleExpression() throws RecognitionException {
        StatementParser.singleExpression_return retval = new StatementParser.singleExpression_return();
        retval.start = input.LT(1);

        int singleExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EOF4=null;
        StatementParser.expr_return expr3 =null;


        CommonTree EOF4_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:145:5: ( expr EOF -> expr )
            // com/facebook/presto/sql/parser/Statement.g:145:7: expr EOF
            {
            pushFollow(FOLLOW_expr_in_singleExpression538);
            expr3=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr3.getTree());

            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_singleExpression540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF4);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:16: -> expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, singleExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "singleExpression"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // com/facebook/presto/sql/parser/Statement.g:148:1: statement : ( query | explainStmt | showTablesStmt | showSchemasStmt | showCatalogsStmt | showColumnsStmt | showPartitionsStmt | showFunctionsStmt | createTableStmt | dropTableStmt | createMaterializedViewStmt | refreshMaterializedViewStmt | createAliasStmt | dropAliasStmt );
    public final StatementParser.statement_return statement() throws RecognitionException {
        StatementParser.statement_return retval = new StatementParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.query_return query5 =null;

        StatementParser.explainStmt_return explainStmt6 =null;

        StatementParser.showTablesStmt_return showTablesStmt7 =null;

        StatementParser.showSchemasStmt_return showSchemasStmt8 =null;

        StatementParser.showCatalogsStmt_return showCatalogsStmt9 =null;

        StatementParser.showColumnsStmt_return showColumnsStmt10 =null;

        StatementParser.showPartitionsStmt_return showPartitionsStmt11 =null;

        StatementParser.showFunctionsStmt_return showFunctionsStmt12 =null;

        StatementParser.createTableStmt_return createTableStmt13 =null;

        StatementParser.dropTableStmt_return dropTableStmt14 =null;

        StatementParser.createMaterializedViewStmt_return createMaterializedViewStmt15 =null;

        StatementParser.refreshMaterializedViewStmt_return refreshMaterializedViewStmt16 =null;

        StatementParser.createAliasStmt_return createAliasStmt17 =null;

        StatementParser.dropAliasStmt_return dropAliasStmt18 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:149:5: ( query | explainStmt | showTablesStmt | showSchemasStmt | showCatalogsStmt | showColumnsStmt | showPartitionsStmt | showFunctionsStmt | createTableStmt | dropTableStmt | createMaterializedViewStmt | refreshMaterializedViewStmt | createAliasStmt | dropAliasStmt )
            int alt1=14;
            switch ( input.LA(1) ) {
            case SELECT:
            case TABLE:
            case WITH:
            case 200:
                {
                alt1=1;
                }
                break;
            case EXPLAIN:
                {
                alt1=2;
                }
                break;
            case SHOW:
                {
                switch ( input.LA(2) ) {
                case TABLES:
                    {
                    alt1=3;
                    }
                    break;
                case SCHEMAS:
                    {
                    alt1=4;
                    }
                    break;
                case CATALOGS:
                    {
                    alt1=5;
                    }
                    break;
                case COLUMNS:
                    {
                    alt1=6;
                    }
                    break;
                case PARTITIONS:
                    {
                    alt1=7;
                    }
                    break;
                case FUNCTIONS:
                    {
                    alt1=8;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }

                }
                break;
            case DESC:
            case DESCRIBE:
                {
                alt1=6;
                }
                break;
            case CREATE:
                {
                switch ( input.LA(2) ) {
                case TABLE:
                    {
                    alt1=9;
                    }
                    break;
                case MATERIALIZED:
                    {
                    alt1=11;
                    }
                    break;
                case ALIAS:
                    {
                    alt1=13;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }

                }
                break;
            case DROP:
                {
                switch ( input.LA(2) ) {
                case TABLE:
                    {
                    alt1=10;
                    }
                    break;
                case ALIAS:
                    {
                    alt1=14;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;

                }

                }
                break;
            case REFRESH:
                {
                alt1=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:149:7: query
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_query_in_statement561);
                    query5=query();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, query5.getTree());

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:150:7: explainStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_explainStmt_in_statement569);
                    explainStmt6=explainStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explainStmt6.getTree());

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:151:7: showTablesStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showTablesStmt_in_statement577);
                    showTablesStmt7=showTablesStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showTablesStmt7.getTree());

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:152:7: showSchemasStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showSchemasStmt_in_statement585);
                    showSchemasStmt8=showSchemasStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showSchemasStmt8.getTree());

                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/Statement.g:153:7: showCatalogsStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showCatalogsStmt_in_statement593);
                    showCatalogsStmt9=showCatalogsStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showCatalogsStmt9.getTree());

                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/Statement.g:154:7: showColumnsStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showColumnsStmt_in_statement601);
                    showColumnsStmt10=showColumnsStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showColumnsStmt10.getTree());

                    }
                    break;
                case 7 :
                    // com/facebook/presto/sql/parser/Statement.g:155:7: showPartitionsStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showPartitionsStmt_in_statement609);
                    showPartitionsStmt11=showPartitionsStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showPartitionsStmt11.getTree());

                    }
                    break;
                case 8 :
                    // com/facebook/presto/sql/parser/Statement.g:156:7: showFunctionsStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showFunctionsStmt_in_statement617);
                    showFunctionsStmt12=showFunctionsStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showFunctionsStmt12.getTree());

                    }
                    break;
                case 9 :
                    // com/facebook/presto/sql/parser/Statement.g:157:7: createTableStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createTableStmt_in_statement625);
                    createTableStmt13=createTableStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createTableStmt13.getTree());

                    }
                    break;
                case 10 :
                    // com/facebook/presto/sql/parser/Statement.g:158:7: dropTableStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dropTableStmt_in_statement633);
                    dropTableStmt14=dropTableStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dropTableStmt14.getTree());

                    }
                    break;
                case 11 :
                    // com/facebook/presto/sql/parser/Statement.g:159:7: createMaterializedViewStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createMaterializedViewStmt_in_statement641);
                    createMaterializedViewStmt15=createMaterializedViewStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createMaterializedViewStmt15.getTree());

                    }
                    break;
                case 12 :
                    // com/facebook/presto/sql/parser/Statement.g:160:7: refreshMaterializedViewStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_refreshMaterializedViewStmt_in_statement649);
                    refreshMaterializedViewStmt16=refreshMaterializedViewStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, refreshMaterializedViewStmt16.getTree());

                    }
                    break;
                case 13 :
                    // com/facebook/presto/sql/parser/Statement.g:161:7: createAliasStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createAliasStmt_in_statement657);
                    createAliasStmt17=createAliasStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createAliasStmt17.getTree());

                    }
                    break;
                case 14 :
                    // com/facebook/presto/sql/parser/Statement.g:162:7: dropAliasStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dropAliasStmt_in_statement665);
                    dropAliasStmt18=dropAliasStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dropAliasStmt18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class query_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // com/facebook/presto/sql/parser/Statement.g:165:1: query : queryExpr -> ^( QUERY queryExpr ) ;
    public final StatementParser.query_return query() throws RecognitionException {
        StatementParser.query_return retval = new StatementParser.query_return();
        retval.start = input.LT(1);

        int query_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.queryExpr_return queryExpr19 =null;


        RewriteRuleSubtreeStream stream_queryExpr=new RewriteRuleSubtreeStream(adaptor,"rule queryExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:166:5: ( queryExpr -> ^( QUERY queryExpr ) )
            // com/facebook/presto/sql/parser/Statement.g:166:7: queryExpr
            {
            pushFollow(FOLLOW_queryExpr_in_query682);
            queryExpr19=queryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryExpr.add(queryExpr19.getTree());

            // AST REWRITE
            // elements: queryExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 166:17: -> ^( QUERY queryExpr )
            {
                // com/facebook/presto/sql/parser/Statement.g:166:20: ^( QUERY queryExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QUERY, "QUERY")
                , root_1);

                adaptor.addChild(root_1, stream_queryExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, query_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "query"


    public static class queryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryExpr"
    // com/facebook/presto/sql/parser/Statement.g:169:1: queryExpr : ( withClause )? ( ( orderOrLimitQuerySpec )=> orderOrLimitQuerySpec | queryExprBody ( orderClause )? ( limitClause )? ) ;
    public final StatementParser.queryExpr_return queryExpr() throws RecognitionException {
        StatementParser.queryExpr_return retval = new StatementParser.queryExpr_return();
        retval.start = input.LT(1);

        int queryExpr_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.withClause_return withClause20 =null;

        StatementParser.orderOrLimitQuerySpec_return orderOrLimitQuerySpec21 =null;

        StatementParser.queryExprBody_return queryExprBody22 =null;

        StatementParser.orderClause_return orderClause23 =null;

        StatementParser.limitClause_return limitClause24 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:170:5: ( ( withClause )? ( ( orderOrLimitQuerySpec )=> orderOrLimitQuerySpec | queryExprBody ( orderClause )? ( limitClause )? ) )
            // com/facebook/presto/sql/parser/Statement.g:170:7: ( withClause )? ( ( orderOrLimitQuerySpec )=> orderOrLimitQuerySpec | queryExprBody ( orderClause )? ( limitClause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/Statement.g:170:7: ( withClause )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case WITH:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:170:7: withClause
                    {
                    pushFollow(FOLLOW_withClause_in_queryExpr707);
                    withClause20=withClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withClause20.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:171:7: ( ( orderOrLimitQuerySpec )=> orderOrLimitQuerySpec | queryExprBody ( orderClause )? ( limitClause )? )
            int alt5=2;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred1_Statement()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case TABLE:
            case 200:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:171:9: ( orderOrLimitQuerySpec )=> orderOrLimitQuerySpec
                    {
                    pushFollow(FOLLOW_orderOrLimitQuerySpec_in_queryExpr724);
                    orderOrLimitQuerySpec21=orderOrLimitQuerySpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orderOrLimitQuerySpec21.getTree());

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:172:9: queryExprBody ( orderClause )? ( limitClause )?
                    {
                    pushFollow(FOLLOW_queryExprBody_in_queryExpr734);
                    queryExprBody22=queryExprBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, queryExprBody22.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:172:23: ( orderClause )?
                    int alt3=2;
                    switch ( input.LA(1) ) {
                        case ORDER:
                            {
                            alt3=1;
                            }
                            break;
                    }

                    switch (alt3) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:172:23: orderClause
                            {
                            pushFollow(FOLLOW_orderClause_in_queryExpr736);
                            orderClause23=orderClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, orderClause23.getTree());

                            }
                            break;

                    }


                    // com/facebook/presto/sql/parser/Statement.g:172:36: ( limitClause )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case LIMIT:
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:172:36: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_queryExpr739);
                            limitClause24=limitClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, limitClause24.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, queryExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "queryExpr"


    public static class orderOrLimitQuerySpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderOrLimitQuerySpec"
    // com/facebook/presto/sql/parser/Statement.g:176:1: orderOrLimitQuerySpec : simpleQuery ( orderClause ( limitClause )? | limitClause ) -> ^( QUERY_SPEC simpleQuery ( orderClause )? ( limitClause )? ) ;
    public final StatementParser.orderOrLimitQuerySpec_return orderOrLimitQuerySpec() throws RecognitionException {
        StatementParser.orderOrLimitQuerySpec_return retval = new StatementParser.orderOrLimitQuerySpec_return();
        retval.start = input.LT(1);

        int orderOrLimitQuerySpec_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.simpleQuery_return simpleQuery25 =null;

        StatementParser.orderClause_return orderClause26 =null;

        StatementParser.limitClause_return limitClause27 =null;

        StatementParser.limitClause_return limitClause28 =null;


        RewriteRuleSubtreeStream stream_simpleQuery=new RewriteRuleSubtreeStream(adaptor,"rule simpleQuery");
        RewriteRuleSubtreeStream stream_orderClause=new RewriteRuleSubtreeStream(adaptor,"rule orderClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:177:5: ( simpleQuery ( orderClause ( limitClause )? | limitClause ) -> ^( QUERY_SPEC simpleQuery ( orderClause )? ( limitClause )? ) )
            // com/facebook/presto/sql/parser/Statement.g:177:7: simpleQuery ( orderClause ( limitClause )? | limitClause )
            {
            pushFollow(FOLLOW_simpleQuery_in_orderOrLimitQuerySpec765);
            simpleQuery25=simpleQuery();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleQuery.add(simpleQuery25.getTree());

            // com/facebook/presto/sql/parser/Statement.g:177:19: ( orderClause ( limitClause )? | limitClause )
            int alt7=2;
            switch ( input.LA(1) ) {
            case ORDER:
                {
                alt7=1;
                }
                break;
            case LIMIT:
                {
                alt7=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:177:20: orderClause ( limitClause )?
                    {
                    pushFollow(FOLLOW_orderClause_in_orderOrLimitQuerySpec768);
                    orderClause26=orderClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderClause.add(orderClause26.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:177:32: ( limitClause )?
                    int alt6=2;
                    switch ( input.LA(1) ) {
                        case LIMIT:
                            {
                            alt6=1;
                            }
                            break;
                    }

                    switch (alt6) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:177:32: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_orderOrLimitQuerySpec770);
                            limitClause27=limitClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_limitClause.add(limitClause27.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:177:47: limitClause
                    {
                    pushFollow(FOLLOW_limitClause_in_orderOrLimitQuerySpec775);
                    limitClause28=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_limitClause.add(limitClause28.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: limitClause, orderClause, simpleQuery
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:60: -> ^( QUERY_SPEC simpleQuery ( orderClause )? ( limitClause )? )
            {
                // com/facebook/presto/sql/parser/Statement.g:177:63: ^( QUERY_SPEC simpleQuery ( orderClause )? ( limitClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QUERY_SPEC, "QUERY_SPEC")
                , root_1);

                adaptor.addChild(root_1, stream_simpleQuery.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:177:88: ( orderClause )?
                if ( stream_orderClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderClause.nextTree());

                }
                stream_orderClause.reset();

                // com/facebook/presto/sql/parser/Statement.g:177:101: ( limitClause )?
                if ( stream_limitClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_limitClause.nextTree());

                }
                stream_limitClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, orderOrLimitQuerySpec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "orderOrLimitQuerySpec"


    public static class queryExprBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryExprBody"
    // com/facebook/presto/sql/parser/Statement.g:180:1: queryExprBody : ( queryTerm -> queryTerm ) ( UNION ( setQuant )? queryTerm -> ^( UNION $queryExprBody queryTerm ( setQuant )? ) | EXCEPT ( setQuant )? queryTerm -> ^( EXCEPT $queryExprBody queryTerm ( setQuant )? ) )* ;
    public final StatementParser.queryExprBody_return queryExprBody() throws RecognitionException {
        StatementParser.queryExprBody_return retval = new StatementParser.queryExprBody_return();
        retval.start = input.LT(1);

        int queryExprBody_StartIndex = input.index();

        CommonTree root_0 = null;

        Token UNION30=null;
        Token EXCEPT33=null;
        StatementParser.queryTerm_return queryTerm29 =null;

        StatementParser.setQuant_return setQuant31 =null;

        StatementParser.queryTerm_return queryTerm32 =null;

        StatementParser.setQuant_return setQuant34 =null;

        StatementParser.queryTerm_return queryTerm35 =null;


        CommonTree UNION30_tree=null;
        CommonTree EXCEPT33_tree=null;
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
        RewriteRuleSubtreeStream stream_setQuant=new RewriteRuleSubtreeStream(adaptor,"rule setQuant");
        RewriteRuleSubtreeStream stream_queryTerm=new RewriteRuleSubtreeStream(adaptor,"rule queryTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:181:5: ( ( queryTerm -> queryTerm ) ( UNION ( setQuant )? queryTerm -> ^( UNION $queryExprBody queryTerm ( setQuant )? ) | EXCEPT ( setQuant )? queryTerm -> ^( EXCEPT $queryExprBody queryTerm ( setQuant )? ) )* )
            // com/facebook/presto/sql/parser/Statement.g:181:7: ( queryTerm -> queryTerm ) ( UNION ( setQuant )? queryTerm -> ^( UNION $queryExprBody queryTerm ( setQuant )? ) | EXCEPT ( setQuant )? queryTerm -> ^( EXCEPT $queryExprBody queryTerm ( setQuant )? ) )*
            {
            // com/facebook/presto/sql/parser/Statement.g:181:7: ( queryTerm -> queryTerm )
            // com/facebook/presto/sql/parser/Statement.g:181:9: queryTerm
            {
            pushFollow(FOLLOW_queryTerm_in_queryExprBody809);
            queryTerm29=queryTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryTerm.add(queryTerm29.getTree());

            // AST REWRITE
            // elements: queryTerm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 181:19: -> queryTerm
            {
                adaptor.addChild(root_0, stream_queryTerm.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:182:7: ( UNION ( setQuant )? queryTerm -> ^( UNION $queryExprBody queryTerm ( setQuant )? ) | EXCEPT ( setQuant )? queryTerm -> ^( EXCEPT $queryExprBody queryTerm ( setQuant )? ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case UNION:
                    {
                    alt10=1;
                    }
                    break;
                case EXCEPT:
                    {
                    alt10=2;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:182:9: UNION ( setQuant )? queryTerm
            	    {
            	    UNION30=(Token)match(input,UNION,FOLLOW_UNION_in_queryExprBody825); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_UNION.add(UNION30);


            	    // com/facebook/presto/sql/parser/Statement.g:182:15: ( setQuant )?
            	    int alt8=2;
            	    switch ( input.LA(1) ) {
            	        case ALL:
            	        case DISTINCT:
            	            {
            	            alt8=1;
            	            }
            	            break;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // com/facebook/presto/sql/parser/Statement.g:182:15: setQuant
            	            {
            	            pushFollow(FOLLOW_setQuant_in_queryExprBody827);
            	            setQuant31=setQuant();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_setQuant.add(setQuant31.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_queryTerm_in_queryExprBody830);
            	    queryTerm32=queryTerm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_queryTerm.add(queryTerm32.getTree());

            	    // AST REWRITE
            	    // elements: UNION, queryExprBody, queryTerm, setQuant
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 182:41: -> ^( UNION $queryExprBody queryTerm ( setQuant )? )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:182:44: ^( UNION $queryExprBody queryTerm ( setQuant )? )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_UNION.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_queryTerm.nextTree());

            	        // com/facebook/presto/sql/parser/Statement.g:182:77: ( setQuant )?
            	        if ( stream_setQuant.hasNext() ) {
            	            adaptor.addChild(root_1, stream_setQuant.nextTree());

            	        }
            	        stream_setQuant.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // com/facebook/presto/sql/parser/Statement.g:183:9: EXCEPT ( setQuant )? queryTerm
            	    {
            	    EXCEPT33=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_queryExprBody860); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT33);


            	    // com/facebook/presto/sql/parser/Statement.g:183:16: ( setQuant )?
            	    int alt9=2;
            	    switch ( input.LA(1) ) {
            	        case ALL:
            	        case DISTINCT:
            	            {
            	            alt9=1;
            	            }
            	            break;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // com/facebook/presto/sql/parser/Statement.g:183:16: setQuant
            	            {
            	            pushFollow(FOLLOW_setQuant_in_queryExprBody862);
            	            setQuant34=setQuant();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_setQuant.add(setQuant34.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_queryTerm_in_queryExprBody865);
            	    queryTerm35=queryTerm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_queryTerm.add(queryTerm35.getTree());

            	    // AST REWRITE
            	    // elements: queryTerm, EXCEPT, queryExprBody, setQuant
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 183:41: -> ^( EXCEPT $queryExprBody queryTerm ( setQuant )? )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:183:44: ^( EXCEPT $queryExprBody queryTerm ( setQuant )? )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_EXCEPT.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_queryTerm.nextTree());

            	        // com/facebook/presto/sql/parser/Statement.g:183:78: ( setQuant )?
            	        if ( stream_setQuant.hasNext() ) {
            	            adaptor.addChild(root_1, stream_setQuant.nextTree());

            	        }
            	        stream_setQuant.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, queryExprBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "queryExprBody"


    public static class queryTerm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryTerm"
    // com/facebook/presto/sql/parser/Statement.g:187:1: queryTerm : ( queryPrimary -> queryPrimary ) ( INTERSECT ( setQuant )? queryPrimary -> ^( INTERSECT $queryTerm queryPrimary ( setQuant )? ) )* ;
    public final StatementParser.queryTerm_return queryTerm() throws RecognitionException {
        StatementParser.queryTerm_return retval = new StatementParser.queryTerm_return();
        retval.start = input.LT(1);

        int queryTerm_StartIndex = input.index();

        CommonTree root_0 = null;

        Token INTERSECT37=null;
        StatementParser.queryPrimary_return queryPrimary36 =null;

        StatementParser.setQuant_return setQuant38 =null;

        StatementParser.queryPrimary_return queryPrimary39 =null;


        CommonTree INTERSECT37_tree=null;
        RewriteRuleTokenStream stream_INTERSECT=new RewriteRuleTokenStream(adaptor,"token INTERSECT");
        RewriteRuleSubtreeStream stream_setQuant=new RewriteRuleSubtreeStream(adaptor,"rule setQuant");
        RewriteRuleSubtreeStream stream_queryPrimary=new RewriteRuleSubtreeStream(adaptor,"rule queryPrimary");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:188:5: ( ( queryPrimary -> queryPrimary ) ( INTERSECT ( setQuant )? queryPrimary -> ^( INTERSECT $queryTerm queryPrimary ( setQuant )? ) )* )
            // com/facebook/presto/sql/parser/Statement.g:188:7: ( queryPrimary -> queryPrimary ) ( INTERSECT ( setQuant )? queryPrimary -> ^( INTERSECT $queryTerm queryPrimary ( setQuant )? ) )*
            {
            // com/facebook/presto/sql/parser/Statement.g:188:7: ( queryPrimary -> queryPrimary )
            // com/facebook/presto/sql/parser/Statement.g:188:9: queryPrimary
            {
            pushFollow(FOLLOW_queryPrimary_in_queryTerm912);
            queryPrimary36=queryPrimary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryPrimary.add(queryPrimary36.getTree());

            // AST REWRITE
            // elements: queryPrimary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 188:22: -> queryPrimary
            {
                adaptor.addChild(root_0, stream_queryPrimary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:189:7: ( INTERSECT ( setQuant )? queryPrimary -> ^( INTERSECT $queryTerm queryPrimary ( setQuant )? ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case INTERSECT:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:189:9: INTERSECT ( setQuant )? queryPrimary
            	    {
            	    INTERSECT37=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_queryTerm928); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_INTERSECT.add(INTERSECT37);


            	    // com/facebook/presto/sql/parser/Statement.g:189:19: ( setQuant )?
            	    int alt11=2;
            	    switch ( input.LA(1) ) {
            	        case ALL:
            	        case DISTINCT:
            	            {
            	            alt11=1;
            	            }
            	            break;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // com/facebook/presto/sql/parser/Statement.g:189:19: setQuant
            	            {
            	            pushFollow(FOLLOW_setQuant_in_queryTerm930);
            	            setQuant38=setQuant();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_setQuant.add(setQuant38.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_queryPrimary_in_queryTerm933);
            	    queryPrimary39=queryPrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_queryPrimary.add(queryPrimary39.getTree());

            	    // AST REWRITE
            	    // elements: INTERSECT, queryTerm, queryPrimary, setQuant
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 189:42: -> ^( INTERSECT $queryTerm queryPrimary ( setQuant )? )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:189:45: ^( INTERSECT $queryTerm queryPrimary ( setQuant )? )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_INTERSECT.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_queryPrimary.nextTree());

            	        // com/facebook/presto/sql/parser/Statement.g:189:81: ( setQuant )?
            	        if ( stream_setQuant.hasNext() ) {
            	            adaptor.addChild(root_1, stream_setQuant.nextTree());

            	        }
            	        stream_setQuant.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, queryTerm_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "queryTerm"


    public static class queryPrimary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryPrimary"
    // com/facebook/presto/sql/parser/Statement.g:192:1: queryPrimary : ( simpleQuery -> ^( QUERY_SPEC simpleQuery ) | tableSubquery | explicitTable );
    public final StatementParser.queryPrimary_return queryPrimary() throws RecognitionException {
        StatementParser.queryPrimary_return retval = new StatementParser.queryPrimary_return();
        retval.start = input.LT(1);

        int queryPrimary_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.simpleQuery_return simpleQuery40 =null;

        StatementParser.tableSubquery_return tableSubquery41 =null;

        StatementParser.explicitTable_return explicitTable42 =null;


        RewriteRuleSubtreeStream stream_simpleQuery=new RewriteRuleSubtreeStream(adaptor,"rule simpleQuery");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:193:5: ( simpleQuery -> ^( QUERY_SPEC simpleQuery ) | tableSubquery | explicitTable )
            int alt13=3;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt13=1;
                }
                break;
            case 200:
                {
                alt13=2;
                }
                break;
            case TABLE:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:193:7: simpleQuery
                    {
                    pushFollow(FOLLOW_simpleQuery_in_queryPrimary967);
                    simpleQuery40=simpleQuery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleQuery.add(simpleQuery40.getTree());

                    // AST REWRITE
                    // elements: simpleQuery
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 193:19: -> ^( QUERY_SPEC simpleQuery )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:193:22: ^( QUERY_SPEC simpleQuery )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QUERY_SPEC, "QUERY_SPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_simpleQuery.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:194:7: tableSubquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableSubquery_in_queryPrimary983);
                    tableSubquery41=tableSubquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSubquery41.getTree());

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:195:7: explicitTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_explicitTable_in_queryPrimary991);
                    explicitTable42=explicitTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitTable42.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, queryPrimary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "queryPrimary"


    public static class explicitTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explicitTable"
    // com/facebook/presto/sql/parser/Statement.g:198:1: explicitTable : TABLE table -> table ;
    public final StatementParser.explicitTable_return explicitTable() throws RecognitionException {
        StatementParser.explicitTable_return retval = new StatementParser.explicitTable_return();
        retval.start = input.LT(1);

        int explicitTable_StartIndex = input.index();

        CommonTree root_0 = null;

        Token TABLE43=null;
        StatementParser.table_return table44 =null;


        CommonTree TABLE43_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:199:5: ( TABLE table -> table )
            // com/facebook/presto/sql/parser/Statement.g:199:7: TABLE table
            {
            TABLE43=(Token)match(input,TABLE,FOLLOW_TABLE_in_explicitTable1008); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE43);


            pushFollow(FOLLOW_table_in_explicitTable1010);
            table44=table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table.add(table44.getTree());

            // AST REWRITE
            // elements: table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 199:19: -> table
            {
                adaptor.addChild(root_0, stream_table.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, explicitTable_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "explicitTable"


    public static class simpleQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleQuery"
    // com/facebook/presto/sql/parser/Statement.g:202:1: simpleQuery : selectClause ( fromClause )? ( whereClause )? ( groupClause )? ( havingClause )? ;
    public final StatementParser.simpleQuery_return simpleQuery() throws RecognitionException {
        StatementParser.simpleQuery_return retval = new StatementParser.simpleQuery_return();
        retval.start = input.LT(1);

        int simpleQuery_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.selectClause_return selectClause45 =null;

        StatementParser.fromClause_return fromClause46 =null;

        StatementParser.whereClause_return whereClause47 =null;

        StatementParser.groupClause_return groupClause48 =null;

        StatementParser.havingClause_return havingClause49 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:203:5: ( selectClause ( fromClause )? ( whereClause )? ( groupClause )? ( havingClause )? )
            // com/facebook/presto/sql/parser/Statement.g:203:7: selectClause ( fromClause )? ( whereClause )? ( groupClause )? ( havingClause )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_selectClause_in_simpleQuery1031);
            selectClause45=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectClause45.getTree());

            // com/facebook/presto/sql/parser/Statement.g:204:7: ( fromClause )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:204:7: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_simpleQuery1039);
                    fromClause46=fromClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromClause46.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:205:7: ( whereClause )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case WHERE:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:205:7: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_simpleQuery1048);
                    whereClause47=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whereClause47.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:206:7: ( groupClause )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case GROUP:
                    {
                    alt16=1;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:206:7: groupClause
                    {
                    pushFollow(FOLLOW_groupClause_in_simpleQuery1057);
                    groupClause48=groupClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupClause48.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:207:7: ( havingClause )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case HAVING:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:207:7: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_simpleQuery1066);
                    havingClause49=havingClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, havingClause49.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, simpleQuery_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "simpleQuery"


    public static class restrictedSelectStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "restrictedSelectStmt"
    // com/facebook/presto/sql/parser/Statement.g:210:1: restrictedSelectStmt : selectClause fromClause ;
    public final StatementParser.restrictedSelectStmt_return restrictedSelectStmt() throws RecognitionException {
        StatementParser.restrictedSelectStmt_return retval = new StatementParser.restrictedSelectStmt_return();
        retval.start = input.LT(1);

        int restrictedSelectStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.selectClause_return selectClause50 =null;

        StatementParser.fromClause_return fromClause51 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:211:5: ( selectClause fromClause )
            // com/facebook/presto/sql/parser/Statement.g:211:7: selectClause fromClause
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_selectClause_in_restrictedSelectStmt1084);
            selectClause50=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectClause50.getTree());

            pushFollow(FOLLOW_fromClause_in_restrictedSelectStmt1092);
            fromClause51=fromClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fromClause51.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, restrictedSelectStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "restrictedSelectStmt"


    public static class withClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withClause"
    // com/facebook/presto/sql/parser/Statement.g:215:1: withClause : WITH (r= RECURSIVE )? withList -> ^( WITH ( $r)? withList ) ;
    public final StatementParser.withClause_return withClause() throws RecognitionException {
        StatementParser.withClause_return retval = new StatementParser.withClause_return();
        retval.start = input.LT(1);

        int withClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token r=null;
        Token WITH52=null;
        StatementParser.withList_return withList53 =null;


        CommonTree r_tree=null;
        CommonTree WITH52_tree=null;
        RewriteRuleTokenStream stream_RECURSIVE=new RewriteRuleTokenStream(adaptor,"token RECURSIVE");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_withList=new RewriteRuleSubtreeStream(adaptor,"rule withList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:216:5: ( WITH (r= RECURSIVE )? withList -> ^( WITH ( $r)? withList ) )
            // com/facebook/presto/sql/parser/Statement.g:216:7: WITH (r= RECURSIVE )? withList
            {
            WITH52=(Token)match(input,WITH,FOLLOW_WITH_in_withClause1109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(WITH52);


            // com/facebook/presto/sql/parser/Statement.g:216:13: (r= RECURSIVE )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case RECURSIVE:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:216:13: r= RECURSIVE
                    {
                    r=(Token)match(input,RECURSIVE,FOLLOW_RECURSIVE_in_withClause1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECURSIVE.add(r);


                    }
                    break;

            }


            pushFollow(FOLLOW_withList_in_withClause1116);
            withList53=withList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_withList.add(withList53.getTree());

            // AST REWRITE
            // elements: withList, r, WITH
            // token labels: r
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 216:34: -> ^( WITH ( $r)? withList )
            {
                // com/facebook/presto/sql/parser/Statement.g:216:37: ^( WITH ( $r)? withList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_WITH.nextNode()
                , root_1);

                // com/facebook/presto/sql/parser/Statement.g:216:45: ( $r)?
                if ( stream_r.hasNext() ) {
                    adaptor.addChild(root_1, stream_r.nextNode());

                }
                stream_r.reset();

                adaptor.addChild(root_1, stream_withList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, withClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "withClause"


    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // com/facebook/presto/sql/parser/Statement.g:219:1: selectClause : SELECT selectExpr -> ^( SELECT selectExpr ) ;
    public final StatementParser.selectClause_return selectClause() throws RecognitionException {
        StatementParser.selectClause_return retval = new StatementParser.selectClause_return();
        retval.start = input.LT(1);

        int selectClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SELECT54=null;
        StatementParser.selectExpr_return selectExpr55 =null;


        CommonTree SELECT54_tree=null;
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_selectExpr=new RewriteRuleSubtreeStream(adaptor,"rule selectExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:220:5: ( SELECT selectExpr -> ^( SELECT selectExpr ) )
            // com/facebook/presto/sql/parser/Statement.g:220:7: SELECT selectExpr
            {
            SELECT54=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause1145); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT54);


            pushFollow(FOLLOW_selectExpr_in_selectClause1147);
            selectExpr55=selectExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectExpr.add(selectExpr55.getTree());

            // AST REWRITE
            // elements: SELECT, selectExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 220:25: -> ^( SELECT selectExpr )
            {
                // com/facebook/presto/sql/parser/Statement.g:220:28: ^( SELECT selectExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_SELECT.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_selectExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, selectClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class fromClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // com/facebook/presto/sql/parser/Statement.g:223:1: fromClause : FROM tableRef ( ',' tableRef )* -> ^( FROM ( tableRef )+ ) ;
    public final StatementParser.fromClause_return fromClause() throws RecognitionException {
        StatementParser.fromClause_return retval = new StatementParser.fromClause_return();
        retval.start = input.LT(1);

        int fromClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FROM56=null;
        Token char_literal58=null;
        StatementParser.tableRef_return tableRef57 =null;

        StatementParser.tableRef_return tableRef59 =null;


        CommonTree FROM56_tree=null;
        CommonTree char_literal58_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleSubtreeStream stream_tableRef=new RewriteRuleSubtreeStream(adaptor,"rule tableRef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:224:5: ( FROM tableRef ( ',' tableRef )* -> ^( FROM ( tableRef )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:224:7: FROM tableRef ( ',' tableRef )*
            {
            FROM56=(Token)match(input,FROM,FOLLOW_FROM_in_fromClause1172); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM56);


            pushFollow(FOLLOW_tableRef_in_fromClause1174);
            tableRef57=tableRef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableRef.add(tableRef57.getTree());

            // com/facebook/presto/sql/parser/Statement.g:224:21: ( ',' tableRef )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:224:22: ',' tableRef
            	    {
            	    char_literal58=(Token)match(input,204,FOLLOW_204_in_fromClause1177); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal58);


            	    pushFollow(FOLLOW_tableRef_in_fromClause1179);
            	    tableRef59=tableRef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tableRef.add(tableRef59.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: tableRef, FROM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 224:37: -> ^( FROM ( tableRef )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:224:40: ^( FROM ( tableRef )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FROM.nextNode()
                , root_1);

                if ( !(stream_tableRef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tableRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableRef.nextTree());

                }
                stream_tableRef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, fromClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fromClause"


    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // com/facebook/presto/sql/parser/Statement.g:227:1: whereClause : WHERE expr -> ^( WHERE expr ) ;
    public final StatementParser.whereClause_return whereClause() throws RecognitionException {
        StatementParser.whereClause_return retval = new StatementParser.whereClause_return();
        retval.start = input.LT(1);

        int whereClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHERE60=null;
        StatementParser.expr_return expr61 =null;


        CommonTree WHERE60_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:228:5: ( WHERE expr -> ^( WHERE expr ) )
            // com/facebook/presto/sql/parser/Statement.g:228:7: WHERE expr
            {
            WHERE60=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause1207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE60);


            pushFollow(FOLLOW_expr_in_whereClause1209);
            expr61=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr61.getTree());

            // AST REWRITE
            // elements: WHERE, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 228:18: -> ^( WHERE expr )
            {
                // com/facebook/presto/sql/parser/Statement.g:228:21: ^( WHERE expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_WHERE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, whereClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class groupClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupClause"
    // com/facebook/presto/sql/parser/Statement.g:231:1: groupClause : GROUP BY expr ( ',' expr )* -> ^( GROUP_BY ( expr )+ ) ;
    public final StatementParser.groupClause_return groupClause() throws RecognitionException {
        StatementParser.groupClause_return retval = new StatementParser.groupClause_return();
        retval.start = input.LT(1);

        int groupClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token GROUP62=null;
        Token BY63=null;
        Token char_literal65=null;
        StatementParser.expr_return expr64 =null;

        StatementParser.expr_return expr66 =null;


        CommonTree GROUP62_tree=null;
        CommonTree BY63_tree=null;
        CommonTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:232:5: ( GROUP BY expr ( ',' expr )* -> ^( GROUP_BY ( expr )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:232:7: GROUP BY expr ( ',' expr )*
            {
            GROUP62=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupClause1234); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GROUP.add(GROUP62);


            BY63=(Token)match(input,BY,FOLLOW_BY_in_groupClause1236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BY.add(BY63);


            pushFollow(FOLLOW_expr_in_groupClause1238);
            expr64=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr64.getTree());

            // com/facebook/presto/sql/parser/Statement.g:232:21: ( ',' expr )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:232:22: ',' expr
            	    {
            	    char_literal65=(Token)match(input,204,FOLLOW_204_in_groupClause1241); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal65);


            	    pushFollow(FOLLOW_expr_in_groupClause1243);
            	    expr66=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr66.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 232:33: -> ^( GROUP_BY ( expr )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:232:36: ^( GROUP_BY ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(GROUP_BY, "GROUP_BY")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, groupClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "groupClause"


    public static class havingClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // com/facebook/presto/sql/parser/Statement.g:235:1: havingClause : HAVING expr -> ^( HAVING expr ) ;
    public final StatementParser.havingClause_return havingClause() throws RecognitionException {
        StatementParser.havingClause_return retval = new StatementParser.havingClause_return();
        retval.start = input.LT(1);

        int havingClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token HAVING67=null;
        StatementParser.expr_return expr68 =null;


        CommonTree HAVING67_tree=null;
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:236:5: ( HAVING expr -> ^( HAVING expr ) )
            // com/facebook/presto/sql/parser/Statement.g:236:7: HAVING expr
            {
            HAVING67=(Token)match(input,HAVING,FOLLOW_HAVING_in_havingClause1271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HAVING.add(HAVING67);


            pushFollow(FOLLOW_expr_in_havingClause1273);
            expr68=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr68.getTree());

            // AST REWRITE
            // elements: expr, HAVING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 236:19: -> ^( HAVING expr )
            {
                // com/facebook/presto/sql/parser/Statement.g:236:22: ^( HAVING expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_HAVING.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, havingClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class orderClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderClause"
    // com/facebook/presto/sql/parser/Statement.g:239:1: orderClause : ORDER BY sortItem ( ',' sortItem )* -> ^( ORDER_BY ( sortItem )+ ) ;
    public final StatementParser.orderClause_return orderClause() throws RecognitionException {
        StatementParser.orderClause_return retval = new StatementParser.orderClause_return();
        retval.start = input.LT(1);

        int orderClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ORDER69=null;
        Token BY70=null;
        Token char_literal72=null;
        StatementParser.sortItem_return sortItem71 =null;

        StatementParser.sortItem_return sortItem73 =null;


        CommonTree ORDER69_tree=null;
        CommonTree BY70_tree=null;
        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleSubtreeStream stream_sortItem=new RewriteRuleSubtreeStream(adaptor,"rule sortItem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:240:5: ( ORDER BY sortItem ( ',' sortItem )* -> ^( ORDER_BY ( sortItem )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:240:7: ORDER BY sortItem ( ',' sortItem )*
            {
            ORDER69=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderClause1298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ORDER.add(ORDER69);


            BY70=(Token)match(input,BY,FOLLOW_BY_in_orderClause1300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BY.add(BY70);


            pushFollow(FOLLOW_sortItem_in_orderClause1302);
            sortItem71=sortItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sortItem.add(sortItem71.getTree());

            // com/facebook/presto/sql/parser/Statement.g:240:25: ( ',' sortItem )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:240:26: ',' sortItem
            	    {
            	    char_literal72=(Token)match(input,204,FOLLOW_204_in_orderClause1305); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal72);


            	    pushFollow(FOLLOW_sortItem_in_orderClause1307);
            	    sortItem73=sortItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sortItem.add(sortItem73.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // AST REWRITE
            // elements: sortItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 240:41: -> ^( ORDER_BY ( sortItem )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:240:44: ^( ORDER_BY ( sortItem )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ORDER_BY, "ORDER_BY")
                , root_1);

                if ( !(stream_sortItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sortItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_sortItem.nextTree());

                }
                stream_sortItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, orderClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "orderClause"


    public static class limitClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitClause"
    // com/facebook/presto/sql/parser/Statement.g:243:1: limitClause : LIMIT integer -> ^( LIMIT integer ) ;
    public final StatementParser.limitClause_return limitClause() throws RecognitionException {
        StatementParser.limitClause_return retval = new StatementParser.limitClause_return();
        retval.start = input.LT(1);

        int limitClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LIMIT74=null;
        StatementParser.integer_return integer75 =null;


        CommonTree LIMIT74_tree=null;
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:244:5: ( LIMIT integer -> ^( LIMIT integer ) )
            // com/facebook/presto/sql/parser/Statement.g:244:7: LIMIT integer
            {
            LIMIT74=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limitClause1335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT74);


            pushFollow(FOLLOW_integer_in_limitClause1337);
            integer75=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_integer.add(integer75.getTree());

            // AST REWRITE
            // elements: LIMIT, integer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:21: -> ^( LIMIT integer )
            {
                // com/facebook/presto/sql/parser/Statement.g:244:24: ^( LIMIT integer )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_LIMIT.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_integer.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, limitClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "limitClause"


    public static class withList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withList"
    // com/facebook/presto/sql/parser/Statement.g:247:1: withList : withQuery ( ',' withQuery )* -> ^( WITH_LIST ( withQuery )+ ) ;
    public final StatementParser.withList_return withList() throws RecognitionException {
        StatementParser.withList_return retval = new StatementParser.withList_return();
        retval.start = input.LT(1);

        int withList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal77=null;
        StatementParser.withQuery_return withQuery76 =null;

        StatementParser.withQuery_return withQuery78 =null;


        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleSubtreeStream stream_withQuery=new RewriteRuleSubtreeStream(adaptor,"rule withQuery");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:248:5: ( withQuery ( ',' withQuery )* -> ^( WITH_LIST ( withQuery )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:248:7: withQuery ( ',' withQuery )*
            {
            pushFollow(FOLLOW_withQuery_in_withList1362);
            withQuery76=withQuery();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_withQuery.add(withQuery76.getTree());

            // com/facebook/presto/sql/parser/Statement.g:248:17: ( ',' withQuery )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:248:18: ',' withQuery
            	    {
            	    char_literal77=(Token)match(input,204,FOLLOW_204_in_withList1365); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal77);


            	    pushFollow(FOLLOW_withQuery_in_withList1367);
            	    withQuery78=withQuery();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_withQuery.add(withQuery78.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // AST REWRITE
            // elements: withQuery
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 248:34: -> ^( WITH_LIST ( withQuery )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:248:37: ^( WITH_LIST ( withQuery )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WITH_LIST, "WITH_LIST")
                , root_1);

                if ( !(stream_withQuery.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_withQuery.hasNext() ) {
                    adaptor.addChild(root_1, stream_withQuery.nextTree());

                }
                stream_withQuery.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, withList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "withList"


    public static class withQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withQuery"
    // com/facebook/presto/sql/parser/Statement.g:251:1: withQuery : ident ( aliasedColumns )? AS subquery -> ^( WITH_QUERY ident subquery ( aliasedColumns )? ) ;
    public final StatementParser.withQuery_return withQuery() throws RecognitionException {
        StatementParser.withQuery_return retval = new StatementParser.withQuery_return();
        retval.start = input.LT(1);

        int withQuery_StartIndex = input.index();

        CommonTree root_0 = null;

        Token AS81=null;
        StatementParser.ident_return ident79 =null;

        StatementParser.aliasedColumns_return aliasedColumns80 =null;

        StatementParser.subquery_return subquery82 =null;


        CommonTree AS81_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_aliasedColumns=new RewriteRuleSubtreeStream(adaptor,"rule aliasedColumns");
        RewriteRuleSubtreeStream stream_subquery=new RewriteRuleSubtreeStream(adaptor,"rule subquery");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:252:5: ( ident ( aliasedColumns )? AS subquery -> ^( WITH_QUERY ident subquery ( aliasedColumns )? ) )
            // com/facebook/presto/sql/parser/Statement.g:252:7: ident ( aliasedColumns )? AS subquery
            {
            pushFollow(FOLLOW_ident_in_withQuery1395);
            ident79=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident79.getTree());

            // com/facebook/presto/sql/parser/Statement.g:252:13: ( aliasedColumns )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case 200:
                    {
                    alt23=1;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:252:13: aliasedColumns
                    {
                    pushFollow(FOLLOW_aliasedColumns_in_withQuery1397);
                    aliasedColumns80=aliasedColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_aliasedColumns.add(aliasedColumns80.getTree());

                    }
                    break;

            }


            AS81=(Token)match(input,AS,FOLLOW_AS_in_withQuery1400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AS.add(AS81);


            pushFollow(FOLLOW_subquery_in_withQuery1402);
            subquery82=subquery();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_subquery.add(subquery82.getTree());

            // AST REWRITE
            // elements: aliasedColumns, ident, subquery
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 252:41: -> ^( WITH_QUERY ident subquery ( aliasedColumns )? )
            {
                // com/facebook/presto/sql/parser/Statement.g:252:44: ^( WITH_QUERY ident subquery ( aliasedColumns )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WITH_QUERY, "WITH_QUERY")
                , root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());

                adaptor.addChild(root_1, stream_subquery.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:252:72: ( aliasedColumns )?
                if ( stream_aliasedColumns.hasNext() ) {
                    adaptor.addChild(root_1, stream_aliasedColumns.nextTree());

                }
                stream_aliasedColumns.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, withQuery_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "withQuery"


    public static class selectExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectExpr"
    // com/facebook/presto/sql/parser/Statement.g:255:1: selectExpr : ( setQuant )? selectList ;
    public final StatementParser.selectExpr_return selectExpr() throws RecognitionException {
        StatementParser.selectExpr_return retval = new StatementParser.selectExpr_return();
        retval.start = input.LT(1);

        int selectExpr_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.setQuant_return setQuant83 =null;

        StatementParser.selectList_return selectList84 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:256:5: ( ( setQuant )? selectList )
            // com/facebook/presto/sql/parser/Statement.g:256:7: ( setQuant )? selectList
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/Statement.g:256:7: ( setQuant )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case ALL:
                case DISTINCT:
                    {
                    alt24=1;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:256:7: setQuant
                    {
                    pushFollow(FOLLOW_setQuant_in_selectExpr1432);
                    setQuant83=setQuant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setQuant83.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_selectList_in_selectExpr1435);
            selectList84=selectList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectList84.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, selectExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selectExpr"


    public static class setQuant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setQuant"
    // com/facebook/presto/sql/parser/Statement.g:259:1: setQuant : ( DISTINCT | ALL );
    public final StatementParser.setQuant_return setQuant() throws RecognitionException {
        StatementParser.setQuant_return retval = new StatementParser.setQuant_return();
        retval.start = input.LT(1);

        int setQuant_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set85=null;

        CommonTree set85_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:260:5: ( DISTINCT | ALL )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set85=(Token)input.LT(1);

            if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set85)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, setQuant_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "setQuant"


    public static class selectList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectList"
    // com/facebook/presto/sql/parser/Statement.g:264:1: selectList : selectSublist ( ',' selectSublist )* -> ^( SELECT_LIST ( selectSublist )+ ) ;
    public final StatementParser.selectList_return selectList() throws RecognitionException {
        StatementParser.selectList_return retval = new StatementParser.selectList_return();
        retval.start = input.LT(1);

        int selectList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal87=null;
        StatementParser.selectSublist_return selectSublist86 =null;

        StatementParser.selectSublist_return selectSublist88 =null;


        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleSubtreeStream stream_selectSublist=new RewriteRuleSubtreeStream(adaptor,"rule selectSublist");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:265:5: ( selectSublist ( ',' selectSublist )* -> ^( SELECT_LIST ( selectSublist )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:265:7: selectSublist ( ',' selectSublist )*
            {
            pushFollow(FOLLOW_selectSublist_in_selectList1477);
            selectSublist86=selectSublist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectSublist.add(selectSublist86.getTree());

            // com/facebook/presto/sql/parser/Statement.g:265:21: ( ',' selectSublist )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:265:22: ',' selectSublist
            	    {
            	    char_literal87=(Token)match(input,204,FOLLOW_204_in_selectList1480); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal87);


            	    pushFollow(FOLLOW_selectSublist_in_selectList1482);
            	    selectSublist88=selectSublist();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_selectSublist.add(selectSublist88.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // AST REWRITE
            // elements: selectSublist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:42: -> ^( SELECT_LIST ( selectSublist )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:265:45: ^( SELECT_LIST ( selectSublist )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_LIST, "SELECT_LIST")
                , root_1);

                if ( !(stream_selectSublist.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectSublist.hasNext() ) {
                    adaptor.addChild(root_1, stream_selectSublist.nextTree());

                }
                stream_selectSublist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, selectList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selectList"


    public static class selectSublist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectSublist"
    // com/facebook/presto/sql/parser/Statement.g:268:1: selectSublist : ( expr ( ( AS )? ident )? -> ^( SELECT_ITEM expr ( ident )? ) | qname '.' '*' -> ^( ALL_COLUMNS qname ) | '*' -> ALL_COLUMNS );
    public final StatementParser.selectSublist_return selectSublist() throws RecognitionException {
        StatementParser.selectSublist_return retval = new StatementParser.selectSublist_return();
        retval.start = input.LT(1);

        int selectSublist_StartIndex = input.index();

        CommonTree root_0 = null;

        Token AS90=null;
        Token char_literal93=null;
        Token char_literal94=null;
        Token char_literal95=null;
        StatementParser.expr_return expr89 =null;

        StatementParser.ident_return ident91 =null;

        StatementParser.qname_return qname92 =null;


        CommonTree AS90_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:269:5: ( expr ( ( AS )? ident )? -> ^( SELECT_ITEM expr ( ident )? ) | qname '.' '*' -> ^( ALL_COLUMNS qname ) | '*' -> ALL_COLUMNS )
            int alt28=3;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:269:7: expr ( ( AS )? ident )?
                    {
                    pushFollow(FOLLOW_expr_in_selectSublist1510);
                    expr89=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr89.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:269:12: ( ( AS )? ident )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case ALIAS:
                        case AS:
                        case BERNOULLI:
                        case CATALOGS:
                        case COLUMNS:
                        case CURRENT:
                        case DAY:
                        case DISTRIBUTED:
                        case EXPLAIN:
                        case FOLLOWING:
                        case FORMAT:
                        case FUNCTIONS:
                        case GRAPHVIZ:
                        case HOUR:
                        case IDENT:
                        case LOGICAL:
                        case MATERIALIZED:
                        case MINUTE:
                        case MONTH:
                        case OVER:
                        case PARTITION:
                        case PARTITIONS:
                        case PRECEDING:
                        case QUOTED_IDENT:
                        case RANGE:
                        case REFRESH:
                        case ROW:
                        case ROWS:
                        case SCHEMAS:
                        case SECOND:
                        case SHOW:
                        case SYSTEM:
                        case TABLES:
                        case TABLESAMPLE:
                        case TEXT:
                        case TYPE:
                        case VIEW:
                        case YEAR:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:269:13: ( AS )? ident
                            {
                            // com/facebook/presto/sql/parser/Statement.g:269:13: ( AS )?
                            int alt26=2;
                            switch ( input.LA(1) ) {
                                case AS:
                                    {
                                    alt26=1;
                                    }
                                    break;
                            }

                            switch (alt26) {
                                case 1 :
                                    // com/facebook/presto/sql/parser/Statement.g:269:13: AS
                                    {
                                    AS90=(Token)match(input,AS,FOLLOW_AS_in_selectSublist1513); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_AS.add(AS90);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_ident_in_selectSublist1516);
                            ident91=ident();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ident.add(ident91.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ident, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 269:25: -> ^( SELECT_ITEM expr ( ident )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:269:28: ^( SELECT_ITEM expr ( ident )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SELECT_ITEM, "SELECT_ITEM")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:269:47: ( ident )?
                        if ( stream_ident.hasNext() ) {
                            adaptor.addChild(root_1, stream_ident.nextTree());

                        }
                        stream_ident.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:270:7: qname '.' '*'
                    {
                    pushFollow(FOLLOW_qname_in_selectSublist1537);
                    qname92=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qname.add(qname92.getTree());

                    char_literal93=(Token)match(input,206,FOLLOW_206_in_selectSublist1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_206.add(char_literal93);


                    char_literal94=(Token)match(input,202,FOLLOW_202_in_selectSublist1541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_202.add(char_literal94);


                    // AST REWRITE
                    // elements: qname
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 270:25: -> ^( ALL_COLUMNS qname )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:270:28: ^( ALL_COLUMNS qname )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ALL_COLUMNS, "ALL_COLUMNS")
                        , root_1);

                        adaptor.addChild(root_1, stream_qname.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:271:7: '*'
                    {
                    char_literal95=(Token)match(input,202,FOLLOW_202_in_selectSublist1561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_202.add(char_literal95);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 271:25: -> ALL_COLUMNS
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(ALL_COLUMNS, "ALL_COLUMNS")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, selectSublist_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selectSublist"


    public static class tableRef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableRef"
    // com/facebook/presto/sql/parser/Statement.g:274:1: tableRef : ( tableFactor -> tableFactor ) ( CROSS JOIN tableFactor -> ^( CROSS_JOIN $tableRef tableFactor ) | joinType JOIN tableFactor joinCriteria -> ^( QUALIFIED_JOIN joinType joinCriteria $tableRef tableFactor ) | NATURAL joinType JOIN tableFactor -> ^( QUALIFIED_JOIN joinType NATURAL $tableRef tableFactor ) )* ;
    public final StatementParser.tableRef_return tableRef() throws RecognitionException {
        StatementParser.tableRef_return retval = new StatementParser.tableRef_return();
        retval.start = input.LT(1);

        int tableRef_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CROSS97=null;
        Token JOIN98=null;
        Token JOIN101=null;
        Token NATURAL104=null;
        Token JOIN106=null;
        StatementParser.tableFactor_return tableFactor96 =null;

        StatementParser.tableFactor_return tableFactor99 =null;

        StatementParser.joinType_return joinType100 =null;

        StatementParser.tableFactor_return tableFactor102 =null;

        StatementParser.joinCriteria_return joinCriteria103 =null;

        StatementParser.joinType_return joinType105 =null;

        StatementParser.tableFactor_return tableFactor107 =null;


        CommonTree CROSS97_tree=null;
        CommonTree JOIN98_tree=null;
        CommonTree JOIN101_tree=null;
        CommonTree NATURAL104_tree=null;
        CommonTree JOIN106_tree=null;
        RewriteRuleTokenStream stream_NATURAL=new RewriteRuleTokenStream(adaptor,"token NATURAL");
        RewriteRuleTokenStream stream_CROSS=new RewriteRuleTokenStream(adaptor,"token CROSS");
        RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
        RewriteRuleSubtreeStream stream_tableFactor=new RewriteRuleSubtreeStream(adaptor,"rule tableFactor");
        RewriteRuleSubtreeStream stream_joinType=new RewriteRuleSubtreeStream(adaptor,"rule joinType");
        RewriteRuleSubtreeStream stream_joinCriteria=new RewriteRuleSubtreeStream(adaptor,"rule joinCriteria");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:275:5: ( ( tableFactor -> tableFactor ) ( CROSS JOIN tableFactor -> ^( CROSS_JOIN $tableRef tableFactor ) | joinType JOIN tableFactor joinCriteria -> ^( QUALIFIED_JOIN joinType joinCriteria $tableRef tableFactor ) | NATURAL joinType JOIN tableFactor -> ^( QUALIFIED_JOIN joinType NATURAL $tableRef tableFactor ) )* )
            // com/facebook/presto/sql/parser/Statement.g:275:7: ( tableFactor -> tableFactor ) ( CROSS JOIN tableFactor -> ^( CROSS_JOIN $tableRef tableFactor ) | joinType JOIN tableFactor joinCriteria -> ^( QUALIFIED_JOIN joinType joinCriteria $tableRef tableFactor ) | NATURAL joinType JOIN tableFactor -> ^( QUALIFIED_JOIN joinType NATURAL $tableRef tableFactor ) )*
            {
            // com/facebook/presto/sql/parser/Statement.g:275:7: ( tableFactor -> tableFactor )
            // com/facebook/presto/sql/parser/Statement.g:275:9: tableFactor
            {
            pushFollow(FOLLOW_tableFactor_in_tableRef1598);
            tableFactor96=tableFactor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableFactor.add(tableFactor96.getTree());

            // AST REWRITE
            // elements: tableFactor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 275:21: -> tableFactor
            {
                adaptor.addChild(root_0, stream_tableFactor.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:276:7: ( CROSS JOIN tableFactor -> ^( CROSS_JOIN $tableRef tableFactor ) | joinType JOIN tableFactor joinCriteria -> ^( QUALIFIED_JOIN joinType joinCriteria $tableRef tableFactor ) | NATURAL joinType JOIN tableFactor -> ^( QUALIFIED_JOIN joinType NATURAL $tableRef tableFactor ) )*
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case CROSS:
                    {
                    alt29=1;
                    }
                    break;
                case FULL:
                case INNER:
                case JOIN:
                case LEFT:
                case RIGHT:
                    {
                    alt29=2;
                    }
                    break;
                case NATURAL:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:276:9: CROSS JOIN tableFactor
            	    {
            	    CROSS97=(Token)match(input,CROSS,FOLLOW_CROSS_in_tableRef1614); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CROSS.add(CROSS97);


            	    JOIN98=(Token)match(input,JOIN,FOLLOW_JOIN_in_tableRef1616); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_JOIN.add(JOIN98);


            	    pushFollow(FOLLOW_tableFactor_in_tableRef1618);
            	    tableFactor99=tableFactor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tableFactor.add(tableFactor99.getTree());

            	    // AST REWRITE
            	    // elements: tableFactor, tableRef
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 276:48: -> ^( CROSS_JOIN $tableRef tableFactor )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:276:51: ^( CROSS_JOIN $tableRef tableFactor )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(CROSS_JOIN, "CROSS_JOIN")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_tableFactor.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // com/facebook/presto/sql/parser/Statement.g:277:9: joinType JOIN tableFactor joinCriteria
            	    {
            	    pushFollow(FOLLOW_joinType_in_tableRef1655);
            	    joinType100=joinType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_joinType.add(joinType100.getTree());

            	    JOIN101=(Token)match(input,JOIN,FOLLOW_JOIN_in_tableRef1657); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_JOIN.add(JOIN101);


            	    pushFollow(FOLLOW_tableFactor_in_tableRef1659);
            	    tableFactor102=tableFactor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tableFactor.add(tableFactor102.getTree());

            	    pushFollow(FOLLOW_joinCriteria_in_tableRef1661);
            	    joinCriteria103=joinCriteria();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_joinCriteria.add(joinCriteria103.getTree());

            	    // AST REWRITE
            	    // elements: joinCriteria, tableFactor, tableRef, joinType
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 277:48: -> ^( QUALIFIED_JOIN joinType joinCriteria $tableRef tableFactor )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:277:51: ^( QUALIFIED_JOIN joinType joinCriteria $tableRef tableFactor )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(QUALIFIED_JOIN, "QUALIFIED_JOIN")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_joinType.nextTree());

            	        adaptor.addChild(root_1, stream_joinCriteria.nextTree());

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_tableFactor.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 3 :
            	    // com/facebook/presto/sql/parser/Statement.g:278:9: NATURAL joinType JOIN tableFactor
            	    {
            	    NATURAL104=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_tableRef1686); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NATURAL.add(NATURAL104);


            	    pushFollow(FOLLOW_joinType_in_tableRef1688);
            	    joinType105=joinType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_joinType.add(joinType105.getTree());

            	    JOIN106=(Token)match(input,JOIN,FOLLOW_JOIN_in_tableRef1690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_JOIN.add(JOIN106);


            	    pushFollow(FOLLOW_tableFactor_in_tableRef1692);
            	    tableFactor107=tableFactor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tableFactor.add(tableFactor107.getTree());

            	    // AST REWRITE
            	    // elements: tableRef, joinType, NATURAL, tableFactor
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 278:48: -> ^( QUALIFIED_JOIN joinType NATURAL $tableRef tableFactor )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:278:51: ^( QUALIFIED_JOIN joinType NATURAL $tableRef tableFactor )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(QUALIFIED_JOIN, "QUALIFIED_JOIN")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_joinType.nextTree());

            	        adaptor.addChild(root_1, 
            	        stream_NATURAL.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_tableFactor.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, tableRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tableRef"


    public static class sampleType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sampleType"
    // com/facebook/presto/sql/parser/Statement.g:282:1: sampleType : ( BERNOULLI | SYSTEM );
    public final StatementParser.sampleType_return sampleType() throws RecognitionException {
        StatementParser.sampleType_return retval = new StatementParser.sampleType_return();
        retval.start = input.LT(1);

        int sampleType_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set108=null;

        CommonTree set108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:283:5: ( BERNOULLI | SYSTEM )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set108=(Token)input.LT(1);

            if ( input.LA(1)==BERNOULLI||input.LA(1)==SYSTEM ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set108)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, sampleType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "sampleType"


    public static class stratifyOn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stratifyOn"
    // com/facebook/presto/sql/parser/Statement.g:287:1: stratifyOn : STRATIFY ON '(' expr ( ',' expr )* ')' -> ^( STRATIFY_ON ( expr )+ ) ;
    public final StatementParser.stratifyOn_return stratifyOn() throws RecognitionException {
        StatementParser.stratifyOn_return retval = new StatementParser.stratifyOn_return();
        retval.start = input.LT(1);

        int stratifyOn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token STRATIFY109=null;
        Token ON110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        Token char_literal115=null;
        StatementParser.expr_return expr112 =null;

        StatementParser.expr_return expr114 =null;


        CommonTree STRATIFY109_tree=null;
        CommonTree ON110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_STRATIFY=new RewriteRuleTokenStream(adaptor,"token STRATIFY");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:288:5: ( STRATIFY ON '(' expr ( ',' expr )* ')' -> ^( STRATIFY_ON ( expr )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:288:7: STRATIFY ON '(' expr ( ',' expr )* ')'
            {
            STRATIFY109=(Token)match(input,STRATIFY,FOLLOW_STRATIFY_in_stratifyOn1763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRATIFY.add(STRATIFY109);


            ON110=(Token)match(input,ON,FOLLOW_ON_in_stratifyOn1765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ON.add(ON110);


            char_literal111=(Token)match(input,200,FOLLOW_200_in_stratifyOn1767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal111);


            pushFollow(FOLLOW_expr_in_stratifyOn1769);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr112.getTree());

            // com/facebook/presto/sql/parser/Statement.g:288:28: ( ',' expr )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:288:29: ',' expr
            	    {
            	    char_literal113=(Token)match(input,204,FOLLOW_204_in_stratifyOn1772); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal113);


            	    pushFollow(FOLLOW_expr_in_stratifyOn1774);
            	    expr114=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr114.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            char_literal115=(Token)match(input,201,FOLLOW_201_in_stratifyOn1778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal115);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 288:44: -> ^( STRATIFY_ON ( expr )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:288:47: ^( STRATIFY_ON ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STRATIFY_ON, "STRATIFY_ON")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, stratifyOn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stratifyOn"


    public static class tableFactor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableFactor"
    // com/facebook/presto/sql/parser/Statement.g:291:1: tableFactor : ( tablePrimary -> tablePrimary ) ( TABLESAMPLE sampleType '(' expr ')' ( stratifyOn )? -> ^( SAMPLED_RELATION $tableFactor sampleType expr ( stratifyOn )? ) )? ;
    public final StatementParser.tableFactor_return tableFactor() throws RecognitionException {
        StatementParser.tableFactor_return retval = new StatementParser.tableFactor_return();
        retval.start = input.LT(1);

        int tableFactor_StartIndex = input.index();

        CommonTree root_0 = null;

        Token TABLESAMPLE117=null;
        Token char_literal119=null;
        Token char_literal121=null;
        StatementParser.tablePrimary_return tablePrimary116 =null;

        StatementParser.sampleType_return sampleType118 =null;

        StatementParser.expr_return expr120 =null;

        StatementParser.stratifyOn_return stratifyOn122 =null;


        CommonTree TABLESAMPLE117_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal121_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token TABLESAMPLE");
        RewriteRuleSubtreeStream stream_stratifyOn=new RewriteRuleSubtreeStream(adaptor,"rule stratifyOn");
        RewriteRuleSubtreeStream stream_tablePrimary=new RewriteRuleSubtreeStream(adaptor,"rule tablePrimary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_sampleType=new RewriteRuleSubtreeStream(adaptor,"rule sampleType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:292:5: ( ( tablePrimary -> tablePrimary ) ( TABLESAMPLE sampleType '(' expr ')' ( stratifyOn )? -> ^( SAMPLED_RELATION $tableFactor sampleType expr ( stratifyOn )? ) )? )
            // com/facebook/presto/sql/parser/Statement.g:292:7: ( tablePrimary -> tablePrimary ) ( TABLESAMPLE sampleType '(' expr ')' ( stratifyOn )? -> ^( SAMPLED_RELATION $tableFactor sampleType expr ( stratifyOn )? ) )?
            {
            // com/facebook/presto/sql/parser/Statement.g:292:7: ( tablePrimary -> tablePrimary )
            // com/facebook/presto/sql/parser/Statement.g:292:9: tablePrimary
            {
            pushFollow(FOLLOW_tablePrimary_in_tableFactor1806);
            tablePrimary116=tablePrimary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tablePrimary.add(tablePrimary116.getTree());

            // AST REWRITE
            // elements: tablePrimary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 292:22: -> tablePrimary
            {
                adaptor.addChild(root_0, stream_tablePrimary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:293:7: ( TABLESAMPLE sampleType '(' expr ')' ( stratifyOn )? -> ^( SAMPLED_RELATION $tableFactor sampleType expr ( stratifyOn )? ) )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case TABLESAMPLE:
                    {
                    alt32=1;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:293:9: TABLESAMPLE sampleType '(' expr ')' ( stratifyOn )?
                    {
                    TABLESAMPLE117=(Token)match(input,TABLESAMPLE,FOLLOW_TABLESAMPLE_in_tableFactor1822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TABLESAMPLE.add(TABLESAMPLE117);


                    pushFollow(FOLLOW_sampleType_in_tableFactor1824);
                    sampleType118=sampleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sampleType.add(sampleType118.getTree());

                    char_literal119=(Token)match(input,200,FOLLOW_200_in_tableFactor1826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal119);


                    pushFollow(FOLLOW_expr_in_tableFactor1828);
                    expr120=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr120.getTree());

                    char_literal121=(Token)match(input,201,FOLLOW_201_in_tableFactor1830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal121);


                    // com/facebook/presto/sql/parser/Statement.g:293:45: ( stratifyOn )?
                    int alt31=2;
                    switch ( input.LA(1) ) {
                        case STRATIFY:
                            {
                            alt31=1;
                            }
                            break;
                    }

                    switch (alt31) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:293:45: stratifyOn
                            {
                            pushFollow(FOLLOW_stratifyOn_in_tableFactor1832);
                            stratifyOn122=stratifyOn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_stratifyOn.add(stratifyOn122.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, tableFactor, stratifyOn, sampleType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 293:57: -> ^( SAMPLED_RELATION $tableFactor sampleType expr ( stratifyOn )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:293:60: ^( SAMPLED_RELATION $tableFactor sampleType expr ( stratifyOn )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SAMPLED_RELATION, "SAMPLED_RELATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_sampleType.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:293:108: ( stratifyOn )?
                        if ( stream_stratifyOn.hasNext() ) {
                            adaptor.addChild(root_1, stream_stratifyOn.nextTree());

                        }
                        stream_stratifyOn.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, tableFactor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tableFactor"


    public static class tablePrimary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tablePrimary"
    // com/facebook/presto/sql/parser/Statement.g:296:1: tablePrimary : ( relation -> relation ) ( ( AS )? ident ( aliasedColumns )? -> ^( ALIASED_RELATION $tablePrimary ident ( aliasedColumns )? ) )? ;
    public final StatementParser.tablePrimary_return tablePrimary() throws RecognitionException {
        StatementParser.tablePrimary_return retval = new StatementParser.tablePrimary_return();
        retval.start = input.LT(1);

        int tablePrimary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token AS124=null;
        StatementParser.relation_return relation123 =null;

        StatementParser.ident_return ident125 =null;

        StatementParser.aliasedColumns_return aliasedColumns126 =null;


        CommonTree AS124_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_aliasedColumns=new RewriteRuleSubtreeStream(adaptor,"rule aliasedColumns");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:297:5: ( ( relation -> relation ) ( ( AS )? ident ( aliasedColumns )? -> ^( ALIASED_RELATION $tablePrimary ident ( aliasedColumns )? ) )? )
            // com/facebook/presto/sql/parser/Statement.g:297:7: ( relation -> relation ) ( ( AS )? ident ( aliasedColumns )? -> ^( ALIASED_RELATION $tablePrimary ident ( aliasedColumns )? ) )?
            {
            // com/facebook/presto/sql/parser/Statement.g:297:7: ( relation -> relation )
            // com/facebook/presto/sql/parser/Statement.g:297:9: relation
            {
            pushFollow(FOLLOW_relation_in_tablePrimary1871);
            relation123=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relation.add(relation123.getTree());

            // AST REWRITE
            // elements: relation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:18: -> relation
            {
                adaptor.addChild(root_0, stream_relation.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:298:7: ( ( AS )? ident ( aliasedColumns )? -> ^( ALIASED_RELATION $tablePrimary ident ( aliasedColumns )? ) )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case ALIAS:
                case AS:
                case BERNOULLI:
                case CATALOGS:
                case COLUMNS:
                case CURRENT:
                case DAY:
                case DISTRIBUTED:
                case EXPLAIN:
                case FOLLOWING:
                case FORMAT:
                case FUNCTIONS:
                case GRAPHVIZ:
                case HOUR:
                case IDENT:
                case LOGICAL:
                case MATERIALIZED:
                case MINUTE:
                case MONTH:
                case OVER:
                case PARTITION:
                case PARTITIONS:
                case PRECEDING:
                case QUOTED_IDENT:
                case RANGE:
                case REFRESH:
                case ROW:
                case ROWS:
                case SCHEMAS:
                case SECOND:
                case SHOW:
                case SYSTEM:
                case TABLES:
                case TEXT:
                case TYPE:
                case VIEW:
                case YEAR:
                    {
                    alt35=1;
                    }
                    break;
                case TABLESAMPLE:
                    {
                    switch ( input.LA(2) ) {
                        case EOF:
                        case CROSS:
                        case EXCEPT:
                        case FULL:
                        case GROUP:
                        case HAVING:
                        case INNER:
                        case INTERSECT:
                        case JOIN:
                        case LEFT:
                        case LIMIT:
                        case NATURAL:
                        case ON:
                        case ORDER:
                        case RIGHT:
                        case TABLESAMPLE:
                        case UNION:
                        case USING:
                        case WHERE:
                        case 200:
                        case 201:
                        case 204:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:298:9: ( AS )? ident ( aliasedColumns )?
                    {
                    // com/facebook/presto/sql/parser/Statement.g:298:9: ( AS )?
                    int alt33=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt33=1;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:298:9: AS
                            {
                            AS124=(Token)match(input,AS,FOLLOW_AS_in_tablePrimary1887); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS124);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_ident_in_tablePrimary1890);
                    ident125=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident125.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:298:19: ( aliasedColumns )?
                    int alt34=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt34=1;
                            }
                            break;
                    }

                    switch (alt34) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:298:19: aliasedColumns
                            {
                            pushFollow(FOLLOW_aliasedColumns_in_tablePrimary1892);
                            aliasedColumns126=aliasedColumns();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_aliasedColumns.add(aliasedColumns126.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: aliasedColumns, tablePrimary, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 298:35: -> ^( ALIASED_RELATION $tablePrimary ident ( aliasedColumns )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:298:38: ^( ALIASED_RELATION $tablePrimary ident ( aliasedColumns )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ALIASED_RELATION, "ALIASED_RELATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_ident.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:298:77: ( aliasedColumns )?
                        if ( stream_aliasedColumns.hasNext() ) {
                            adaptor.addChild(root_1, stream_aliasedColumns.nextTree());

                        }
                        stream_aliasedColumns.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, tablePrimary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tablePrimary"


    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // com/facebook/presto/sql/parser/Statement.g:301:1: relation : ( table | ( '(' tableRef ')' )=> joinedTable | tableSubquery );
    public final StatementParser.relation_return relation() throws RecognitionException {
        StatementParser.relation_return retval = new StatementParser.relation_return();
        retval.start = input.LT(1);

        int relation_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.table_return table127 =null;

        StatementParser.joinedTable_return joinedTable128 =null;

        StatementParser.tableSubquery_return tableSubquery129 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:302:5: ( table | ( '(' tableRef ')' )=> joinedTable | tableSubquery )
            int alt36=3;
            switch ( input.LA(1) ) {
            case ALIAS:
            case BERNOULLI:
            case CATALOGS:
            case COLUMNS:
            case CURRENT:
            case DAY:
            case DISTRIBUTED:
            case EXPLAIN:
            case FOLLOWING:
            case FORMAT:
            case FUNCTIONS:
            case GRAPHVIZ:
            case HOUR:
            case IDENT:
            case LOGICAL:
            case MATERIALIZED:
            case MINUTE:
            case MONTH:
            case OVER:
            case PARTITION:
            case PARTITIONS:
            case PRECEDING:
            case QUOTED_IDENT:
            case RANGE:
            case REFRESH:
            case ROW:
            case ROWS:
            case SCHEMAS:
            case SECOND:
            case SHOW:
            case SYSTEM:
            case TABLES:
            case TABLESAMPLE:
            case TEXT:
            case TYPE:
            case VIEW:
            case YEAR:
                {
                alt36=1;
                }
                break;
            case 200:
                {
                int LA36_4 = input.LA(2);

                if ( (synpred2_Statement()) ) {
                    alt36=2;
                }
                else if ( (true) ) {
                    alt36=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:302:7: table
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_table_in_relation1927);
                    table127=table();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table127.getTree());

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:303:7: ( '(' tableRef ')' )=> joinedTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_joinedTable_in_relation1945);
                    joinedTable128=joinedTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinedTable128.getTree());

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:304:7: tableSubquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableSubquery_in_relation1953);
                    tableSubquery129=tableSubquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSubquery129.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, relation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table"
    // com/facebook/presto/sql/parser/Statement.g:307:1: table : qname -> ^( TABLE qname ) ;
    public final StatementParser.table_return table() throws RecognitionException {
        StatementParser.table_return retval = new StatementParser.table_return();
        retval.start = input.LT(1);

        int table_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.qname_return qname130 =null;


        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:308:5: ( qname -> ^( TABLE qname ) )
            // com/facebook/presto/sql/parser/Statement.g:308:7: qname
            {
            pushFollow(FOLLOW_qname_in_table1970);
            qname130=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname130.getTree());

            // AST REWRITE
            // elements: qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:13: -> ^( TABLE qname )
            {
                // com/facebook/presto/sql/parser/Statement.g:308:16: ^( TABLE qname )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TABLE, "TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, table_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "table"


    public static class tableSubquery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSubquery"
    // com/facebook/presto/sql/parser/Statement.g:311:1: tableSubquery : '(' query ')' -> ^( TABLE_SUBQUERY query ) ;
    public final StatementParser.tableSubquery_return tableSubquery() throws RecognitionException {
        StatementParser.tableSubquery_return retval = new StatementParser.tableSubquery_return();
        retval.start = input.LT(1);

        int tableSubquery_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal131=null;
        Token char_literal133=null;
        StatementParser.query_return query132 =null;


        CommonTree char_literal131_tree=null;
        CommonTree char_literal133_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:312:5: ( '(' query ')' -> ^( TABLE_SUBQUERY query ) )
            // com/facebook/presto/sql/parser/Statement.g:312:7: '(' query ')'
            {
            char_literal131=(Token)match(input,200,FOLLOW_200_in_tableSubquery1995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal131);


            pushFollow(FOLLOW_query_in_tableSubquery1997);
            query132=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_query.add(query132.getTree());

            char_literal133=(Token)match(input,201,FOLLOW_201_in_tableSubquery1999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal133);


            // AST REWRITE
            // elements: query
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 312:21: -> ^( TABLE_SUBQUERY query )
            {
                // com/facebook/presto/sql/parser/Statement.g:312:24: ^( TABLE_SUBQUERY query )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TABLE_SUBQUERY, "TABLE_SUBQUERY")
                , root_1);

                adaptor.addChild(root_1, stream_query.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, tableSubquery_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tableSubquery"


    public static class joinedTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinedTable"
    // com/facebook/presto/sql/parser/Statement.g:315:1: joinedTable : '(' tableRef ')' -> ^( JOINED_TABLE tableRef ) ;
    public final StatementParser.joinedTable_return joinedTable() throws RecognitionException {
        StatementParser.joinedTable_return retval = new StatementParser.joinedTable_return();
        retval.start = input.LT(1);

        int joinedTable_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal134=null;
        Token char_literal136=null;
        StatementParser.tableRef_return tableRef135 =null;


        CommonTree char_literal134_tree=null;
        CommonTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_tableRef=new RewriteRuleSubtreeStream(adaptor,"rule tableRef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:316:5: ( '(' tableRef ')' -> ^( JOINED_TABLE tableRef ) )
            // com/facebook/presto/sql/parser/Statement.g:316:7: '(' tableRef ')'
            {
            char_literal134=(Token)match(input,200,FOLLOW_200_in_joinedTable2024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal134);


            pushFollow(FOLLOW_tableRef_in_joinedTable2026);
            tableRef135=tableRef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableRef.add(tableRef135.getTree());

            char_literal136=(Token)match(input,201,FOLLOW_201_in_joinedTable2028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal136);


            // AST REWRITE
            // elements: tableRef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 316:24: -> ^( JOINED_TABLE tableRef )
            {
                // com/facebook/presto/sql/parser/Statement.g:316:27: ^( JOINED_TABLE tableRef )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(JOINED_TABLE, "JOINED_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_tableRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, joinedTable_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "joinedTable"


    public static class joinType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinType"
    // com/facebook/presto/sql/parser/Statement.g:319:1: joinType : ( ( INNER )? -> INNER_JOIN | LEFT ( OUTER )? -> LEFT_JOIN | RIGHT ( OUTER )? -> RIGHT_JOIN | FULL ( OUTER )? -> FULL_JOIN );
    public final StatementParser.joinType_return joinType() throws RecognitionException {
        StatementParser.joinType_return retval = new StatementParser.joinType_return();
        retval.start = input.LT(1);

        int joinType_StartIndex = input.index();

        CommonTree root_0 = null;

        Token INNER137=null;
        Token LEFT138=null;
        Token OUTER139=null;
        Token RIGHT140=null;
        Token OUTER141=null;
        Token FULL142=null;
        Token OUTER143=null;

        CommonTree INNER137_tree=null;
        CommonTree LEFT138_tree=null;
        CommonTree OUTER139_tree=null;
        CommonTree RIGHT140_tree=null;
        CommonTree OUTER141_tree=null;
        CommonTree FULL142_tree=null;
        CommonTree OUTER143_tree=null;
        RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
        RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
        RewriteRuleTokenStream stream_FULL=new RewriteRuleTokenStream(adaptor,"token FULL");
        RewriteRuleTokenStream stream_INNER=new RewriteRuleTokenStream(adaptor,"token INNER");
        RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:320:5: ( ( INNER )? -> INNER_JOIN | LEFT ( OUTER )? -> LEFT_JOIN | RIGHT ( OUTER )? -> RIGHT_JOIN | FULL ( OUTER )? -> FULL_JOIN )
            int alt41=4;
            switch ( input.LA(1) ) {
            case INNER:
            case JOIN:
                {
                alt41=1;
                }
                break;
            case LEFT:
                {
                alt41=2;
                }
                break;
            case RIGHT:
                {
                alt41=3;
                }
                break;
            case FULL:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:320:7: ( INNER )?
                    {
                    // com/facebook/presto/sql/parser/Statement.g:320:7: ( INNER )?
                    int alt37=2;
                    switch ( input.LA(1) ) {
                        case INNER:
                            {
                            alt37=1;
                            }
                            break;
                    }

                    switch (alt37) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:320:7: INNER
                            {
                            INNER137=(Token)match(input,INNER,FOLLOW_INNER_in_joinType2053); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INNER.add(INNER137);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 320:20: -> INNER_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(INNER_JOIN, "INNER_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:321:7: LEFT ( OUTER )?
                    {
                    LEFT138=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinType2072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT.add(LEFT138);


                    // com/facebook/presto/sql/parser/Statement.g:321:12: ( OUTER )?
                    int alt38=2;
                    switch ( input.LA(1) ) {
                        case OUTER:
                            {
                            alt38=1;
                            }
                            break;
                    }

                    switch (alt38) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:321:12: OUTER
                            {
                            OUTER139=(Token)match(input,OUTER,FOLLOW_OUTER_in_joinType2074); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OUTER.add(OUTER139);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 321:20: -> LEFT_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(LEFT_JOIN, "LEFT_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:322:7: RIGHT ( OUTER )?
                    {
                    RIGHT140=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_joinType2088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT.add(RIGHT140);


                    // com/facebook/presto/sql/parser/Statement.g:322:13: ( OUTER )?
                    int alt39=2;
                    switch ( input.LA(1) ) {
                        case OUTER:
                            {
                            alt39=1;
                            }
                            break;
                    }

                    switch (alt39) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:322:13: OUTER
                            {
                            OUTER141=(Token)match(input,OUTER,FOLLOW_OUTER_in_joinType2090); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OUTER.add(OUTER141);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 322:20: -> RIGHT_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(RIGHT_JOIN, "RIGHT_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:323:7: FULL ( OUTER )?
                    {
                    FULL142=(Token)match(input,FULL,FOLLOW_FULL_in_joinType2103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FULL.add(FULL142);


                    // com/facebook/presto/sql/parser/Statement.g:323:12: ( OUTER )?
                    int alt40=2;
                    switch ( input.LA(1) ) {
                        case OUTER:
                            {
                            alt40=1;
                            }
                            break;
                    }

                    switch (alt40) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:323:12: OUTER
                            {
                            OUTER143=(Token)match(input,OUTER,FOLLOW_OUTER_in_joinType2105); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OUTER.add(OUTER143);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 323:20: -> FULL_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(FULL_JOIN, "FULL_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, joinType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "joinType"


    public static class joinCriteria_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinCriteria"
    // com/facebook/presto/sql/parser/Statement.g:326:1: joinCriteria : ( ON expr -> ^( ON expr ) | USING '(' ident ( ',' ident )* ')' -> ^( USING ( ident )+ ) );
    public final StatementParser.joinCriteria_return joinCriteria() throws RecognitionException {
        StatementParser.joinCriteria_return retval = new StatementParser.joinCriteria_return();
        retval.start = input.LT(1);

        int joinCriteria_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ON144=null;
        Token USING146=null;
        Token char_literal147=null;
        Token char_literal149=null;
        Token char_literal151=null;
        StatementParser.expr_return expr145 =null;

        StatementParser.ident_return ident148 =null;

        StatementParser.ident_return ident150 =null;


        CommonTree ON144_tree=null;
        CommonTree USING146_tree=null;
        CommonTree char_literal147_tree=null;
        CommonTree char_literal149_tree=null;
        CommonTree char_literal151_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:327:5: ( ON expr -> ^( ON expr ) | USING '(' ident ( ',' ident )* ')' -> ^( USING ( ident )+ ) )
            int alt43=2;
            switch ( input.LA(1) ) {
            case ON:
                {
                alt43=1;
                }
                break;
            case USING:
                {
                alt43=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:327:7: ON expr
                    {
                    ON144=(Token)match(input,ON,FOLLOW_ON_in_joinCriteria2128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ON.add(ON144);


                    pushFollow(FOLLOW_expr_in_joinCriteria2130);
                    expr145=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr145.getTree());

                    // AST REWRITE
                    // elements: expr, ON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:40: -> ^( ON expr )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:327:43: ^( ON expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ON.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:328:7: USING '(' ident ( ',' ident )* ')'
                    {
                    USING146=(Token)match(input,USING,FOLLOW_USING_in_joinCriteria2171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USING.add(USING146);


                    char_literal147=(Token)match(input,200,FOLLOW_200_in_joinCriteria2173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal147);


                    pushFollow(FOLLOW_ident_in_joinCriteria2175);
                    ident148=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident148.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:328:23: ( ',' ident )*
                    loop42:
                    do {
                        int alt42=2;
                        switch ( input.LA(1) ) {
                        case 204:
                            {
                            alt42=1;
                            }
                            break;

                        }

                        switch (alt42) {
                    	case 1 :
                    	    // com/facebook/presto/sql/parser/Statement.g:328:24: ',' ident
                    	    {
                    	    char_literal149=(Token)match(input,204,FOLLOW_204_in_joinCriteria2178); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_204.add(char_literal149);


                    	    pushFollow(FOLLOW_ident_in_joinCriteria2180);
                    	    ident150=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident150.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    char_literal151=(Token)match(input,201,FOLLOW_201_in_joinCriteria2184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal151);


                    // AST REWRITE
                    // elements: ident, USING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:40: -> ^( USING ( ident )+ )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:328:43: ^( USING ( ident )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_USING.nextNode()
                        , root_1);

                        if ( !(stream_ident.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ident.hasNext() ) {
                            adaptor.addChild(root_1, stream_ident.nextTree());

                        }
                        stream_ident.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, joinCriteria_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "joinCriteria"


    public static class aliasedColumns_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasedColumns"
    // com/facebook/presto/sql/parser/Statement.g:331:1: aliasedColumns : '(' ident ( ',' ident )* ')' -> ^( ALIASED_COLUMNS ( ident )+ ) ;
    public final StatementParser.aliasedColumns_return aliasedColumns() throws RecognitionException {
        StatementParser.aliasedColumns_return retval = new StatementParser.aliasedColumns_return();
        retval.start = input.LT(1);

        int aliasedColumns_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal152=null;
        Token char_literal154=null;
        Token char_literal156=null;
        StatementParser.ident_return ident153 =null;

        StatementParser.ident_return ident155 =null;


        CommonTree char_literal152_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal156_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:332:5: ( '(' ident ( ',' ident )* ')' -> ^( ALIASED_COLUMNS ( ident )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:332:7: '(' ident ( ',' ident )* ')'
            {
            char_literal152=(Token)match(input,200,FOLLOW_200_in_aliasedColumns2210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal152);


            pushFollow(FOLLOW_ident_in_aliasedColumns2212);
            ident153=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident153.getTree());

            // com/facebook/presto/sql/parser/Statement.g:332:17: ( ',' ident )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt44=1;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:332:18: ',' ident
            	    {
            	    char_literal154=(Token)match(input,204,FOLLOW_204_in_aliasedColumns2215); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal154);


            	    pushFollow(FOLLOW_ident_in_aliasedColumns2217);
            	    ident155=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident155.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            char_literal156=(Token)match(input,201,FOLLOW_201_in_aliasedColumns2221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal156);


            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 332:34: -> ^( ALIASED_COLUMNS ( ident )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:332:37: ^( ALIASED_COLUMNS ( ident )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ALIASED_COLUMNS, "ALIASED_COLUMNS")
                , root_1);

                if ( !(stream_ident.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ident.hasNext() ) {
                    adaptor.addChild(root_1, stream_ident.nextTree());

                }
                stream_ident.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, aliasedColumns_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "aliasedColumns"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // com/facebook/presto/sql/parser/Statement.g:335:1: expr : orExpression ;
    public final StatementParser.expr_return expr() throws RecognitionException {
        StatementParser.expr_return retval = new StatementParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.orExpression_return orExpression157 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:336:5: ( orExpression )
            // com/facebook/presto/sql/parser/Statement.g:336:7: orExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_orExpression_in_expr2247);
            orExpression157=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpression157.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class orExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExpression"
    // com/facebook/presto/sql/parser/Statement.g:339:1: orExpression : andExpression ( OR ^ andExpression )* ;
    public final StatementParser.orExpression_return orExpression() throws RecognitionException {
        StatementParser.orExpression_return retval = new StatementParser.orExpression_return();
        retval.start = input.LT(1);

        int orExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OR159=null;
        StatementParser.andExpression_return andExpression158 =null;

        StatementParser.andExpression_return andExpression160 =null;


        CommonTree OR159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:340:5: ( andExpression ( OR ^ andExpression )* )
            // com/facebook/presto/sql/parser/Statement.g:340:7: andExpression ( OR ^ andExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_andExpression_in_orExpression2264);
            andExpression158=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression158.getTree());

            // com/facebook/presto/sql/parser/Statement.g:340:21: ( OR ^ andExpression )*
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt45=1;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:340:22: OR ^ andExpression
            	    {
            	    OR159=(Token)match(input,OR,FOLLOW_OR_in_orExpression2267); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR159_tree = 
            	    (CommonTree)adaptor.create(OR159)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR159_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2270);
            	    andExpression160=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression160.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, orExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "orExpression"


    public static class andExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpression"
    // com/facebook/presto/sql/parser/Statement.g:343:1: andExpression : notExpression ( AND ^ notExpression )* ;
    public final StatementParser.andExpression_return andExpression() throws RecognitionException {
        StatementParser.andExpression_return retval = new StatementParser.andExpression_return();
        retval.start = input.LT(1);

        int andExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token AND162=null;
        StatementParser.notExpression_return notExpression161 =null;

        StatementParser.notExpression_return notExpression163 =null;


        CommonTree AND162_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:344:5: ( notExpression ( AND ^ notExpression )* )
            // com/facebook/presto/sql/parser/Statement.g:344:7: notExpression ( AND ^ notExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_notExpression_in_andExpression2289);
            notExpression161=notExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression161.getTree());

            // com/facebook/presto/sql/parser/Statement.g:344:21: ( AND ^ notExpression )*
            loop46:
            do {
                int alt46=2;
                switch ( input.LA(1) ) {
                case AND:
                    {
                    alt46=1;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:344:22: AND ^ notExpression
            	    {
            	    AND162=(Token)match(input,AND,FOLLOW_AND_in_andExpression2292); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND162_tree = 
            	    (CommonTree)adaptor.create(AND162)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND162_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_notExpression_in_andExpression2295);
            	    notExpression163=notExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression163.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, andExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "andExpression"


    public static class notExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notExpression"
    // com/facebook/presto/sql/parser/Statement.g:347:1: notExpression : ( NOT ^)* booleanTest ;
    public final StatementParser.notExpression_return notExpression() throws RecognitionException {
        StatementParser.notExpression_return retval = new StatementParser.notExpression_return();
        retval.start = input.LT(1);

        int notExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token NOT164=null;
        StatementParser.booleanTest_return booleanTest165 =null;


        CommonTree NOT164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:348:5: ( ( NOT ^)* booleanTest )
            // com/facebook/presto/sql/parser/Statement.g:348:7: ( NOT ^)* booleanTest
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/Statement.g:348:7: ( NOT ^)*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:348:8: NOT ^
            	    {
            	    NOT164=(Token)match(input,NOT,FOLLOW_NOT_in_notExpression2315); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NOT164_tree = 
            	    (CommonTree)adaptor.create(NOT164)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT164_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            pushFollow(FOLLOW_booleanTest_in_notExpression2320);
            booleanTest165=booleanTest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanTest165.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, notExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "notExpression"


    public static class booleanTest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanTest"
    // com/facebook/presto/sql/parser/Statement.g:351:1: booleanTest : booleanPrimary ;
    public final StatementParser.booleanTest_return booleanTest() throws RecognitionException {
        StatementParser.booleanTest_return retval = new StatementParser.booleanTest_return();
        retval.start = input.LT(1);

        int booleanTest_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.booleanPrimary_return booleanPrimary166 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:352:5: ( booleanPrimary )
            // com/facebook/presto/sql/parser/Statement.g:352:7: booleanPrimary
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_booleanPrimary_in_booleanTest2337);
            booleanPrimary166=booleanPrimary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanPrimary166.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, booleanTest_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "booleanTest"


    public static class booleanPrimary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanPrimary"
    // com/facebook/presto/sql/parser/Statement.g:355:1: booleanPrimary : ( predicate | EXISTS subquery -> ^( EXISTS subquery ) );
    public final StatementParser.booleanPrimary_return booleanPrimary() throws RecognitionException {
        StatementParser.booleanPrimary_return retval = new StatementParser.booleanPrimary_return();
        retval.start = input.LT(1);

        int booleanPrimary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EXISTS168=null;
        StatementParser.predicate_return predicate167 =null;

        StatementParser.subquery_return subquery169 =null;


        CommonTree EXISTS168_tree=null;
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleSubtreeStream stream_subquery=new RewriteRuleSubtreeStream(adaptor,"rule subquery");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:356:5: ( predicate | EXISTS subquery -> ^( EXISTS subquery ) )
            int alt48=2;
            switch ( input.LA(1) ) {
            case ALIAS:
            case BERNOULLI:
            case CASE:
            case CAST:
            case CATALOGS:
            case COALESCE:
            case COLUMNS:
            case CURRENT:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case DATE:
            case DAY:
            case DECIMAL_VALUE:
            case DISTRIBUTED:
            case EXPLAIN:
            case EXTRACT:
            case FALSE:
            case FOLLOWING:
            case FORMAT:
            case FUNCTIONS:
            case GRAPHVIZ:
            case HOUR:
            case IDENT:
            case IF:
            case INTEGER_VALUE:
            case INTERVAL:
            case LOGICAL:
            case MATERIALIZED:
            case MINUTE:
            case MONTH:
            case NULL:
            case NULLIF:
            case OVER:
            case PARTITION:
            case PARTITIONS:
            case PRECEDING:
            case QUOTED_IDENT:
            case RANGE:
            case REFRESH:
            case ROW:
            case ROWS:
            case SCHEMAS:
            case SECOND:
            case SHOW:
            case STRING:
            case SUBSTRING:
            case SYSTEM:
            case TABLES:
            case TABLESAMPLE:
            case TEXT:
            case TIME:
            case TIMESTAMP:
            case TRUE:
            case TYPE:
            case VIEW:
            case YEAR:
            case 200:
            case 203:
            case 205:
                {
                alt48=1;
                }
                break;
            case EXISTS:
                {
                alt48=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:356:7: predicate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_predicate_in_booleanPrimary2354);
                    predicate167=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate167.getTree());

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:357:7: EXISTS subquery
                    {
                    EXISTS168=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_booleanPrimary2362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXISTS.add(EXISTS168);


                    pushFollow(FOLLOW_subquery_in_booleanPrimary2364);
                    subquery169=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subquery.add(subquery169.getTree());

                    // AST REWRITE
                    // elements: subquery, EXISTS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 357:23: -> ^( EXISTS subquery )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:357:26: ^( EXISTS subquery )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EXISTS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_subquery.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, booleanPrimary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "booleanPrimary"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // com/facebook/presto/sql/parser/Statement.g:360:1: predicate : ( predicatePrimary -> predicatePrimary ) ( cmpOp e= predicatePrimary -> ^( cmpOp $predicate $e) | IS DISTINCT FROM e= predicatePrimary -> ^( IS_DISTINCT_FROM $predicate $e) | IS NOT DISTINCT FROM e= predicatePrimary -> ^( NOT ^( IS_DISTINCT_FROM $predicate $e) ) | BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( BETWEEN $predicate $min $max) | NOT BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( NOT ^( BETWEEN $predicate $min $max) ) | LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( LIKE $predicate $e ( $x)? ) | NOT LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( NOT ^( LIKE $predicate $e ( $x)? ) ) | IS NULL -> ^( IS_NULL $predicate) | IS NOT NULL -> ^( IS_NOT_NULL $predicate) | IN inList -> ^( IN $predicate inList ) | NOT IN inList -> ^( NOT ^( IN $predicate inList ) ) )* ;
    public final StatementParser.predicate_return predicate() throws RecognitionException {
        StatementParser.predicate_return retval = new StatementParser.predicate_return();
        retval.start = input.LT(1);

        int predicate_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IS172=null;
        Token DISTINCT173=null;
        Token FROM174=null;
        Token IS175=null;
        Token NOT176=null;
        Token DISTINCT177=null;
        Token FROM178=null;
        Token BETWEEN179=null;
        Token AND180=null;
        Token NOT181=null;
        Token BETWEEN182=null;
        Token AND183=null;
        Token LIKE184=null;
        Token ESCAPE185=null;
        Token NOT186=null;
        Token LIKE187=null;
        Token ESCAPE188=null;
        Token IS189=null;
        Token NULL190=null;
        Token IS191=null;
        Token NOT192=null;
        Token NULL193=null;
        Token IN194=null;
        Token NOT196=null;
        Token IN197=null;
        StatementParser.predicatePrimary_return e =null;

        StatementParser.predicatePrimary_return min =null;

        StatementParser.predicatePrimary_return max =null;

        StatementParser.predicatePrimary_return x =null;

        StatementParser.predicatePrimary_return predicatePrimary170 =null;

        StatementParser.cmpOp_return cmpOp171 =null;

        StatementParser.inList_return inList195 =null;

        StatementParser.inList_return inList198 =null;


        CommonTree IS172_tree=null;
        CommonTree DISTINCT173_tree=null;
        CommonTree FROM174_tree=null;
        CommonTree IS175_tree=null;
        CommonTree NOT176_tree=null;
        CommonTree DISTINCT177_tree=null;
        CommonTree FROM178_tree=null;
        CommonTree BETWEEN179_tree=null;
        CommonTree AND180_tree=null;
        CommonTree NOT181_tree=null;
        CommonTree BETWEEN182_tree=null;
        CommonTree AND183_tree=null;
        CommonTree LIKE184_tree=null;
        CommonTree ESCAPE185_tree=null;
        CommonTree NOT186_tree=null;
        CommonTree LIKE187_tree=null;
        CommonTree ESCAPE188_tree=null;
        CommonTree IS189_tree=null;
        CommonTree NULL190_tree=null;
        CommonTree IS191_tree=null;
        CommonTree NOT192_tree=null;
        CommonTree NULL193_tree=null;
        CommonTree IN194_tree=null;
        CommonTree NOT196_tree=null;
        CommonTree IN197_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
        RewriteRuleSubtreeStream stream_cmpOp=new RewriteRuleSubtreeStream(adaptor,"rule cmpOp");
        RewriteRuleSubtreeStream stream_predicatePrimary=new RewriteRuleSubtreeStream(adaptor,"rule predicatePrimary");
        RewriteRuleSubtreeStream stream_inList=new RewriteRuleSubtreeStream(adaptor,"rule inList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:361:5: ( ( predicatePrimary -> predicatePrimary ) ( cmpOp e= predicatePrimary -> ^( cmpOp $predicate $e) | IS DISTINCT FROM e= predicatePrimary -> ^( IS_DISTINCT_FROM $predicate $e) | IS NOT DISTINCT FROM e= predicatePrimary -> ^( NOT ^( IS_DISTINCT_FROM $predicate $e) ) | BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( BETWEEN $predicate $min $max) | NOT BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( NOT ^( BETWEEN $predicate $min $max) ) | LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( LIKE $predicate $e ( $x)? ) | NOT LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( NOT ^( LIKE $predicate $e ( $x)? ) ) | IS NULL -> ^( IS_NULL $predicate) | IS NOT NULL -> ^( IS_NOT_NULL $predicate) | IN inList -> ^( IN $predicate inList ) | NOT IN inList -> ^( NOT ^( IN $predicate inList ) ) )* )
            // com/facebook/presto/sql/parser/Statement.g:361:7: ( predicatePrimary -> predicatePrimary ) ( cmpOp e= predicatePrimary -> ^( cmpOp $predicate $e) | IS DISTINCT FROM e= predicatePrimary -> ^( IS_DISTINCT_FROM $predicate $e) | IS NOT DISTINCT FROM e= predicatePrimary -> ^( NOT ^( IS_DISTINCT_FROM $predicate $e) ) | BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( BETWEEN $predicate $min $max) | NOT BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( NOT ^( BETWEEN $predicate $min $max) ) | LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( LIKE $predicate $e ( $x)? ) | NOT LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( NOT ^( LIKE $predicate $e ( $x)? ) ) | IS NULL -> ^( IS_NULL $predicate) | IS NOT NULL -> ^( IS_NOT_NULL $predicate) | IN inList -> ^( IN $predicate inList ) | NOT IN inList -> ^( NOT ^( IN $predicate inList ) ) )*
            {
            // com/facebook/presto/sql/parser/Statement.g:361:7: ( predicatePrimary -> predicatePrimary )
            // com/facebook/presto/sql/parser/Statement.g:361:8: predicatePrimary
            {
            pushFollow(FOLLOW_predicatePrimary_in_predicate2390);
            predicatePrimary170=predicatePrimary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicatePrimary.add(predicatePrimary170.getTree());

            // AST REWRITE
            // elements: predicatePrimary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 361:25: -> predicatePrimary
            {
                adaptor.addChild(root_0, stream_predicatePrimary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:362:7: ( cmpOp e= predicatePrimary -> ^( cmpOp $predicate $e) | IS DISTINCT FROM e= predicatePrimary -> ^( IS_DISTINCT_FROM $predicate $e) | IS NOT DISTINCT FROM e= predicatePrimary -> ^( NOT ^( IS_DISTINCT_FROM $predicate $e) ) | BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( BETWEEN $predicate $min $max) | NOT BETWEEN min= predicatePrimary AND max= predicatePrimary -> ^( NOT ^( BETWEEN $predicate $min $max) ) | LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( LIKE $predicate $e ( $x)? ) | NOT LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )? -> ^( NOT ^( LIKE $predicate $e ( $x)? ) ) | IS NULL -> ^( IS_NULL $predicate) | IS NOT NULL -> ^( IS_NOT_NULL $predicate) | IN inList -> ^( IN $predicate inList ) | NOT IN inList -> ^( NOT ^( IN $predicate inList ) ) )*
            loop51:
            do {
                int alt51=12;
                switch ( input.LA(1) ) {
                case EQ:
                case GT:
                case GTE:
                case LT:
                case LTE:
                case NEQ:
                    {
                    alt51=1;
                    }
                    break;
                case IS:
                    {
                    switch ( input.LA(2) ) {
                    case DISTINCT:
                        {
                        alt51=2;
                        }
                        break;
                    case NOT:
                        {
                        switch ( input.LA(3) ) {
                        case DISTINCT:
                            {
                            alt51=3;
                            }
                            break;
                        case NULL:
                            {
                            alt51=9;
                            }
                            break;

                        }

                        }
                        break;
                    case NULL:
                        {
                        alt51=8;
                        }
                        break;

                    }

                    }
                    break;
                case BETWEEN:
                    {
                    alt51=4;
                    }
                    break;
                case NOT:
                    {
                    switch ( input.LA(2) ) {
                    case BETWEEN:
                        {
                        alt51=5;
                        }
                        break;
                    case LIKE:
                        {
                        alt51=7;
                        }
                        break;
                    case IN:
                        {
                        alt51=11;
                        }
                        break;

                    }

                    }
                    break;
                case LIKE:
                    {
                    alt51=6;
                    }
                    break;
                case IN:
                    {
                    alt51=10;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:362:9: cmpOp e= predicatePrimary
            	    {
            	    pushFollow(FOLLOW_cmpOp_in_predicate2405);
            	    cmpOp171=cmpOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cmpOp.add(cmpOp171.getTree());

            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2409);
            	    e=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(e.getTree());

            	    // AST REWRITE
            	    // elements: e, predicate, cmpOp
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 362:67: -> ^( cmpOp $predicate $e)
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:362:70: ^( cmpOp $predicate $e)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_cmpOp.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_e.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // com/facebook/presto/sql/parser/Statement.g:363:9: IS DISTINCT FROM e= predicatePrimary
            	    {
            	    IS172=(Token)match(input,IS,FOLLOW_IS_in_predicate2464); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IS.add(IS172);


            	    DISTINCT173=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_predicate2466); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT173);


            	    FROM174=(Token)match(input,FROM,FOLLOW_FROM_in_predicate2468); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_FROM.add(FROM174);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2472);
            	    e=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(e.getTree());

            	    // AST REWRITE
            	    // elements: predicate, e
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 363:67: -> ^( IS_DISTINCT_FROM $predicate $e)
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:363:70: ^( IS_DISTINCT_FROM $predicate $e)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(IS_DISTINCT_FROM, "IS_DISTINCT_FROM")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_e.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 3 :
            	    // com/facebook/presto/sql/parser/Statement.g:364:9: IS NOT DISTINCT FROM e= predicatePrimary
            	    {
            	    IS175=(Token)match(input,IS,FOLLOW_IS_in_predicate2516); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IS.add(IS175);


            	    NOT176=(Token)match(input,NOT,FOLLOW_NOT_in_predicate2518); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NOT.add(NOT176);


            	    DISTINCT177=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_predicate2520); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT177);


            	    FROM178=(Token)match(input,FROM,FOLLOW_FROM_in_predicate2522); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_FROM.add(FROM178);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2526);
            	    e=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(e.getTree());

            	    // AST REWRITE
            	    // elements: NOT, predicate, e
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 364:67: -> ^( NOT ^( IS_DISTINCT_FROM $predicate $e) )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:364:70: ^( NOT ^( IS_DISTINCT_FROM $predicate $e) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_NOT.nextNode()
            	        , root_1);

            	        // com/facebook/presto/sql/parser/Statement.g:364:76: ^( IS_DISTINCT_FROM $predicate $e)
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(IS_DISTINCT_FROM, "IS_DISTINCT_FROM")
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, stream_e.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 4 :
            	    // com/facebook/presto/sql/parser/Statement.g:365:9: BETWEEN min= predicatePrimary AND max= predicatePrimary
            	    {
            	    BETWEEN179=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_predicate2570); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BETWEEN.add(BETWEEN179);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2574);
            	    min=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(min.getTree());

            	    AND180=(Token)match(input,AND,FOLLOW_AND_in_predicate2576); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND180);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2580);
            	    max=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(max.getTree());

            	    // AST REWRITE
            	    // elements: min, predicate, max, BETWEEN
            	    // token labels: 
            	    // rule labels: min, retval, max
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 365:67: -> ^( BETWEEN $predicate $min $max)
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:365:70: ^( BETWEEN $predicate $min $max)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_BETWEEN.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_min.nextTree());

            	        adaptor.addChild(root_1, stream_max.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 5 :
            	    // com/facebook/presto/sql/parser/Statement.g:366:9: NOT BETWEEN min= predicatePrimary AND max= predicatePrimary
            	    {
            	    NOT181=(Token)match(input,NOT,FOLLOW_NOT_in_predicate2609); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NOT.add(NOT181);


            	    BETWEEN182=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_predicate2611); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BETWEEN.add(BETWEEN182);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2615);
            	    min=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(min.getTree());

            	    AND183=(Token)match(input,AND,FOLLOW_AND_in_predicate2617); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND183);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2621);
            	    max=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(max.getTree());

            	    // AST REWRITE
            	    // elements: min, NOT, BETWEEN, predicate, max
            	    // token labels: 
            	    // rule labels: min, retval, max
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 366:67: -> ^( NOT ^( BETWEEN $predicate $min $max) )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:366:70: ^( NOT ^( BETWEEN $predicate $min $max) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_NOT.nextNode()
            	        , root_1);

            	        // com/facebook/presto/sql/parser/Statement.g:366:76: ^( BETWEEN $predicate $min $max)
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(
            	        stream_BETWEEN.nextNode()
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, stream_min.nextTree());

            	        adaptor.addChild(root_2, stream_max.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 6 :
            	    // com/facebook/presto/sql/parser/Statement.g:367:9: LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )?
            	    {
            	    LIKE184=(Token)match(input,LIKE,FOLLOW_LIKE_in_predicate2650); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LIKE.add(LIKE184);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2654);
            	    e=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(e.getTree());

            	    // com/facebook/presto/sql/parser/Statement.g:367:33: ( ESCAPE x= predicatePrimary )?
            	    int alt49=2;
            	    switch ( input.LA(1) ) {
            	        case ESCAPE:
            	            {
            	            alt49=1;
            	            }
            	            break;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // com/facebook/presto/sql/parser/Statement.g:367:34: ESCAPE x= predicatePrimary
            	            {
            	            ESCAPE185=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_predicate2657); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_ESCAPE.add(ESCAPE185);


            	            pushFollow(FOLLOW_predicatePrimary_in_predicate2661);
            	            x=predicatePrimary();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_predicatePrimary.add(x.getTree());

            	            }
            	            break;

            	    }


            	    // AST REWRITE
            	    // elements: e, predicate, LIKE, x
            	    // token labels: 
            	    // rule labels: retval, e, x
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 367:67: -> ^( LIKE $predicate $e ( $x)? )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:367:70: ^( LIKE $predicate $e ( $x)? )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_LIKE.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_e.nextTree());

            	        // com/facebook/presto/sql/parser/Statement.g:367:92: ( $x)?
            	        if ( stream_x.hasNext() ) {
            	            adaptor.addChild(root_1, stream_x.nextTree());

            	        }
            	        stream_x.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 7 :
            	    // com/facebook/presto/sql/parser/Statement.g:368:9: NOT LIKE e= predicatePrimary ( ESCAPE x= predicatePrimary )?
            	    {
            	    NOT186=(Token)match(input,NOT,FOLLOW_NOT_in_predicate2694); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NOT.add(NOT186);


            	    LIKE187=(Token)match(input,LIKE,FOLLOW_LIKE_in_predicate2696); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LIKE.add(LIKE187);


            	    pushFollow(FOLLOW_predicatePrimary_in_predicate2700);
            	    e=predicatePrimary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_predicatePrimary.add(e.getTree());

            	    // com/facebook/presto/sql/parser/Statement.g:368:37: ( ESCAPE x= predicatePrimary )?
            	    int alt50=2;
            	    switch ( input.LA(1) ) {
            	        case ESCAPE:
            	            {
            	            alt50=1;
            	            }
            	            break;
            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // com/facebook/presto/sql/parser/Statement.g:368:38: ESCAPE x= predicatePrimary
            	            {
            	            ESCAPE188=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_predicate2703); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_ESCAPE.add(ESCAPE188);


            	            pushFollow(FOLLOW_predicatePrimary_in_predicate2707);
            	            x=predicatePrimary();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_predicatePrimary.add(x.getTree());

            	            }
            	            break;

            	    }


            	    // AST REWRITE
            	    // elements: predicate, LIKE, NOT, x, e
            	    // token labels: 
            	    // rule labels: retval, e, x
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 368:67: -> ^( NOT ^( LIKE $predicate $e ( $x)? ) )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:368:70: ^( NOT ^( LIKE $predicate $e ( $x)? ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_NOT.nextNode()
            	        , root_1);

            	        // com/facebook/presto/sql/parser/Statement.g:368:76: ^( LIKE $predicate $e ( $x)? )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(
            	        stream_LIKE.nextNode()
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, stream_e.nextTree());

            	        // com/facebook/presto/sql/parser/Statement.g:368:98: ( $x)?
            	        if ( stream_x.hasNext() ) {
            	            adaptor.addChild(root_2, stream_x.nextTree());

            	        }
            	        stream_x.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 8 :
            	    // com/facebook/presto/sql/parser/Statement.g:369:9: IS NULL
            	    {
            	    IS189=(Token)match(input,IS,FOLLOW_IS_in_predicate2740); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IS.add(IS189);


            	    NULL190=(Token)match(input,NULL,FOLLOW_NULL_in_predicate2742); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NULL.add(NULL190);


            	    // AST REWRITE
            	    // elements: predicate
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 369:67: -> ^( IS_NULL $predicate)
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:369:70: ^( IS_NULL $predicate)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(IS_NULL, "IS_NULL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 9 :
            	    // com/facebook/presto/sql/parser/Statement.g:370:9: IS NOT NULL
            	    {
            	    IS191=(Token)match(input,IS,FOLLOW_IS_in_predicate2811); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IS.add(IS191);


            	    NOT192=(Token)match(input,NOT,FOLLOW_NOT_in_predicate2813); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NOT.add(NOT192);


            	    NULL193=(Token)match(input,NULL,FOLLOW_NULL_in_predicate2815); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NULL.add(NULL193);


            	    // AST REWRITE
            	    // elements: predicate
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 370:67: -> ^( IS_NOT_NULL $predicate)
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:370:70: ^( IS_NOT_NULL $predicate)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(IS_NOT_NULL, "IS_NOT_NULL")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 10 :
            	    // com/facebook/presto/sql/parser/Statement.g:371:9: IN inList
            	    {
            	    IN194=(Token)match(input,IN,FOLLOW_IN_in_predicate2880); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IN.add(IN194);


            	    pushFollow(FOLLOW_inList_in_predicate2882);
            	    inList195=inList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inList.add(inList195.getTree());

            	    // AST REWRITE
            	    // elements: IN, inList, predicate
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 371:67: -> ^( IN $predicate inList )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:371:70: ^( IN $predicate inList )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_IN.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_inList.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 11 :
            	    // com/facebook/presto/sql/parser/Statement.g:372:9: NOT IN inList
            	    {
            	    NOT196=(Token)match(input,NOT,FOLLOW_NOT_in_predicate2951); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NOT.add(NOT196);


            	    IN197=(Token)match(input,IN,FOLLOW_IN_in_predicate2953); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IN.add(IN197);


            	    pushFollow(FOLLOW_inList_in_predicate2955);
            	    inList198=inList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inList.add(inList198.getTree());

            	    // AST REWRITE
            	    // elements: inList, NOT, IN, predicate
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 372:67: -> ^( NOT ^( IN $predicate inList ) )
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:372:70: ^( NOT ^( IN $predicate inList ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_NOT.nextNode()
            	        , root_1);

            	        // com/facebook/presto/sql/parser/Statement.g:372:76: ^( IN $predicate inList )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(
            	        stream_IN.nextNode()
            	        , root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, stream_inList.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, predicate_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class predicatePrimary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicatePrimary"
    // com/facebook/presto/sql/parser/Statement.g:376:1: predicatePrimary : ( numericExpr -> numericExpr ) ( '||' e= numericExpr -> ^( FUNCTION_CALL ^( QNAME IDENT[\"concat\"] ) $predicatePrimary $e) )* ;
    public final StatementParser.predicatePrimary_return predicatePrimary() throws RecognitionException {
        StatementParser.predicatePrimary_return retval = new StatementParser.predicatePrimary_return();
        retval.start = input.LT(1);

        int predicatePrimary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal200=null;
        StatementParser.numericExpr_return e =null;

        StatementParser.numericExpr_return numericExpr199 =null;


        CommonTree string_literal200_tree=null;
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleSubtreeStream stream_numericExpr=new RewriteRuleSubtreeStream(adaptor,"rule numericExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:377:5: ( ( numericExpr -> numericExpr ) ( '||' e= numericExpr -> ^( FUNCTION_CALL ^( QNAME IDENT[\"concat\"] ) $predicatePrimary $e) )* )
            // com/facebook/presto/sql/parser/Statement.g:377:7: ( numericExpr -> numericExpr ) ( '||' e= numericExpr -> ^( FUNCTION_CALL ^( QNAME IDENT[\"concat\"] ) $predicatePrimary $e) )*
            {
            // com/facebook/presto/sql/parser/Statement.g:377:7: ( numericExpr -> numericExpr )
            // com/facebook/presto/sql/parser/Statement.g:377:8: numericExpr
            {
            pushFollow(FOLLOW_numericExpr_in_predicatePrimary3041);
            numericExpr199=numericExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_numericExpr.add(numericExpr199.getTree());

            // AST REWRITE
            // elements: numericExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:20: -> numericExpr
            {
                adaptor.addChild(root_0, stream_numericExpr.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:378:7: ( '||' e= numericExpr -> ^( FUNCTION_CALL ^( QNAME IDENT[\"concat\"] ) $predicatePrimary $e) )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case 208:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:378:9: '||' e= numericExpr
            	    {
            	    string_literal200=(Token)match(input,208,FOLLOW_208_in_predicatePrimary3056); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_208.add(string_literal200);


            	    pushFollow(FOLLOW_numericExpr_in_predicatePrimary3060);
            	    e=numericExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_numericExpr.add(e.getTree());

            	    // AST REWRITE
            	    // elements: e, predicatePrimary
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 378:28: -> ^( FUNCTION_CALL ^( QNAME IDENT[\"concat\"] ) $predicatePrimary $e)
            	    {
            	        // com/facebook/presto/sql/parser/Statement.g:378:31: ^( FUNCTION_CALL ^( QNAME IDENT[\"concat\"] ) $predicatePrimary $e)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
            	        , root_1);

            	        // com/facebook/presto/sql/parser/Statement.g:378:47: ^( QNAME IDENT[\"concat\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(QNAME, "QNAME")
            	        , root_2);

            	        adaptor.addChild(root_2, 
            	        (CommonTree)adaptor.create(IDENT, "concat")
            	        );

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_e.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, predicatePrimary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "predicatePrimary"


    public static class numericExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericExpr"
    // com/facebook/presto/sql/parser/Statement.g:381:1: numericExpr : numericTerm ( ( '+' | '-' ) ^ numericTerm )* ;
    public final StatementParser.numericExpr_return numericExpr() throws RecognitionException {
        StatementParser.numericExpr_return retval = new StatementParser.numericExpr_return();
        retval.start = input.LT(1);

        int numericExpr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set202=null;
        StatementParser.numericTerm_return numericTerm201 =null;

        StatementParser.numericTerm_return numericTerm203 =null;


        CommonTree set202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:382:5: ( numericTerm ( ( '+' | '-' ) ^ numericTerm )* )
            // com/facebook/presto/sql/parser/Statement.g:382:7: numericTerm ( ( '+' | '-' ) ^ numericTerm )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_numericTerm_in_numericExpr3099);
            numericTerm201=numericTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, numericTerm201.getTree());

            // com/facebook/presto/sql/parser/Statement.g:382:19: ( ( '+' | '-' ) ^ numericTerm )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case 203:
                case 205:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:382:20: ( '+' | '-' ) ^ numericTerm
            	    {
            	    set202=(Token)input.LT(1);

            	    set202=(Token)input.LT(1);

            	    if ( input.LA(1)==203||input.LA(1)==205 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set202)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_numericTerm_in_numericExpr3111);
            	    numericTerm203=numericTerm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericTerm203.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, numericExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numericExpr"


    public static class numericTerm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericTerm"
    // com/facebook/presto/sql/parser/Statement.g:385:1: numericTerm : numericFactor ( ( '*' | '/' | '%' ) ^ numericFactor )* ;
    public final StatementParser.numericTerm_return numericTerm() throws RecognitionException {
        StatementParser.numericTerm_return retval = new StatementParser.numericTerm_return();
        retval.start = input.LT(1);

        int numericTerm_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set205=null;
        StatementParser.numericFactor_return numericFactor204 =null;

        StatementParser.numericFactor_return numericFactor206 =null;


        CommonTree set205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:386:5: ( numericFactor ( ( '*' | '/' | '%' ) ^ numericFactor )* )
            // com/facebook/presto/sql/parser/Statement.g:386:7: numericFactor ( ( '*' | '/' | '%' ) ^ numericFactor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_numericFactor_in_numericTerm3130);
            numericFactor204=numericFactor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, numericFactor204.getTree());

            // com/facebook/presto/sql/parser/Statement.g:386:21: ( ( '*' | '/' | '%' ) ^ numericFactor )*
            loop54:
            do {
                int alt54=2;
                switch ( input.LA(1) ) {
                case 199:
                case 202:
                case 207:
                    {
                    alt54=1;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:386:22: ( '*' | '/' | '%' ) ^ numericFactor
            	    {
            	    set205=(Token)input.LT(1);

            	    set205=(Token)input.LT(1);

            	    if ( input.LA(1)==199||input.LA(1)==202||input.LA(1)==207 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set205)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_numericFactor_in_numericTerm3146);
            	    numericFactor206=numericFactor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericFactor206.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, numericTerm_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numericTerm"


    public static class numericFactor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericFactor"
    // com/facebook/presto/sql/parser/Statement.g:389:1: numericFactor : ( ( '+' )? exprPrimary -> exprPrimary | '-' exprPrimary -> ^( NEGATIVE exprPrimary ) );
    public final StatementParser.numericFactor_return numericFactor() throws RecognitionException {
        StatementParser.numericFactor_return retval = new StatementParser.numericFactor_return();
        retval.start = input.LT(1);

        int numericFactor_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal207=null;
        Token char_literal209=null;
        StatementParser.exprPrimary_return exprPrimary208 =null;

        StatementParser.exprPrimary_return exprPrimary210 =null;


        CommonTree char_literal207_tree=null;
        CommonTree char_literal209_tree=null;
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleSubtreeStream stream_exprPrimary=new RewriteRuleSubtreeStream(adaptor,"rule exprPrimary");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:390:5: ( ( '+' )? exprPrimary -> exprPrimary | '-' exprPrimary -> ^( NEGATIVE exprPrimary ) )
            int alt56=2;
            switch ( input.LA(1) ) {
            case ALIAS:
            case BERNOULLI:
            case CASE:
            case CAST:
            case CATALOGS:
            case COALESCE:
            case COLUMNS:
            case CURRENT:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case DATE:
            case DAY:
            case DECIMAL_VALUE:
            case DISTRIBUTED:
            case EXPLAIN:
            case EXTRACT:
            case FALSE:
            case FOLLOWING:
            case FORMAT:
            case FUNCTIONS:
            case GRAPHVIZ:
            case HOUR:
            case IDENT:
            case IF:
            case INTEGER_VALUE:
            case INTERVAL:
            case LOGICAL:
            case MATERIALIZED:
            case MINUTE:
            case MONTH:
            case NULL:
            case NULLIF:
            case OVER:
            case PARTITION:
            case PARTITIONS:
            case PRECEDING:
            case QUOTED_IDENT:
            case RANGE:
            case REFRESH:
            case ROW:
            case ROWS:
            case SCHEMAS:
            case SECOND:
            case SHOW:
            case STRING:
            case SUBSTRING:
            case SYSTEM:
            case TABLES:
            case TABLESAMPLE:
            case TEXT:
            case TIME:
            case TIMESTAMP:
            case TRUE:
            case TYPE:
            case VIEW:
            case YEAR:
            case 200:
            case 203:
                {
                alt56=1;
                }
                break;
            case 205:
                {
                alt56=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:390:7: ( '+' )? exprPrimary
                    {
                    // com/facebook/presto/sql/parser/Statement.g:390:7: ( '+' )?
                    int alt55=2;
                    switch ( input.LA(1) ) {
                        case 203:
                            {
                            alt55=1;
                            }
                            break;
                    }

                    switch (alt55) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:390:7: '+'
                            {
                            char_literal207=(Token)match(input,203,FOLLOW_203_in_numericFactor3165); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_203.add(char_literal207);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_exprPrimary_in_numericFactor3168);
                    exprPrimary208=exprPrimary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprPrimary.add(exprPrimary208.getTree());

                    // AST REWRITE
                    // elements: exprPrimary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 390:24: -> exprPrimary
                    {
                        adaptor.addChild(root_0, stream_exprPrimary.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:391:7: '-' exprPrimary
                    {
                    char_literal209=(Token)match(input,205,FOLLOW_205_in_numericFactor3180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_205.add(char_literal209);


                    pushFollow(FOLLOW_exprPrimary_in_numericFactor3182);
                    exprPrimary210=exprPrimary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprPrimary.add(exprPrimary210.getTree());

                    // AST REWRITE
                    // elements: exprPrimary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 391:24: -> ^( NEGATIVE exprPrimary )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:391:27: ^( NEGATIVE exprPrimary )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEGATIVE, "NEGATIVE")
                        , root_1);

                        adaptor.addChild(root_1, stream_exprPrimary.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, numericFactor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numericFactor"


    public static class exprPrimary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprPrimary"
    // com/facebook/presto/sql/parser/Statement.g:394:1: exprPrimary : ( NULL | qnameOrFunction | specialFunction | number | bool | STRING | dateValue | intervalValue | caseExpression | ( '(' expr ')' )=> ( '(' expr ')' -> expr ) | subquery );
    public final StatementParser.exprPrimary_return exprPrimary() throws RecognitionException {
        StatementParser.exprPrimary_return retval = new StatementParser.exprPrimary_return();
        retval.start = input.LT(1);

        int exprPrimary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token NULL211=null;
        Token STRING216=null;
        Token char_literal220=null;
        Token char_literal222=null;
        StatementParser.qnameOrFunction_return qnameOrFunction212 =null;

        StatementParser.specialFunction_return specialFunction213 =null;

        StatementParser.number_return number214 =null;

        StatementParser.bool_return bool215 =null;

        StatementParser.dateValue_return dateValue217 =null;

        StatementParser.intervalValue_return intervalValue218 =null;

        StatementParser.caseExpression_return caseExpression219 =null;

        StatementParser.expr_return expr221 =null;

        StatementParser.subquery_return subquery223 =null;


        CommonTree NULL211_tree=null;
        CommonTree STRING216_tree=null;
        CommonTree char_literal220_tree=null;
        CommonTree char_literal222_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:395:5: ( NULL | qnameOrFunction | specialFunction | number | bool | STRING | dateValue | intervalValue | caseExpression | ( '(' expr ')' )=> ( '(' expr ')' -> expr ) | subquery )
            int alt57=11;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt57=1;
                }
                break;
            case ALIAS:
            case BERNOULLI:
            case CATALOGS:
            case COLUMNS:
            case CURRENT:
            case DAY:
            case DISTRIBUTED:
            case EXPLAIN:
            case FOLLOWING:
            case FORMAT:
            case FUNCTIONS:
            case GRAPHVIZ:
            case HOUR:
            case IDENT:
            case LOGICAL:
            case MATERIALIZED:
            case MINUTE:
            case MONTH:
            case OVER:
            case PARTITION:
            case PARTITIONS:
            case PRECEDING:
            case QUOTED_IDENT:
            case RANGE:
            case REFRESH:
            case ROW:
            case ROWS:
            case SCHEMAS:
            case SECOND:
            case SHOW:
            case SYSTEM:
            case TABLES:
            case TABLESAMPLE:
            case TEXT:
            case TYPE:
            case VIEW:
            case YEAR:
                {
                alt57=2;
                }
                break;
            case CAST:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case EXTRACT:
            case SUBSTRING:
                {
                alt57=3;
                }
                break;
            case DECIMAL_VALUE:
            case INTEGER_VALUE:
                {
                alt57=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt57=5;
                }
                break;
            case STRING:
                {
                alt57=6;
                }
                break;
            case DATE:
            case TIME:
            case TIMESTAMP:
                {
                alt57=7;
                }
                break;
            case INTERVAL:
                {
                alt57=8;
                }
                break;
            case CASE:
            case COALESCE:
            case IF:
            case NULLIF:
                {
                alt57=9;
                }
                break;
            case 200:
                {
                int LA57_22 = input.LA(2);

                if ( (synpred3_Statement()) ) {
                    alt57=10;
                }
                else if ( (true) ) {
                    alt57=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 22, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:395:7: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NULL211=(Token)match(input,NULL,FOLLOW_NULL_in_exprPrimary3208); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL211_tree = 
                    (CommonTree)adaptor.create(NULL211)
                    ;
                    adaptor.addChild(root_0, NULL211_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:396:7: qnameOrFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_qnameOrFunction_in_exprPrimary3216);
                    qnameOrFunction212=qnameOrFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qnameOrFunction212.getTree());

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:397:7: specialFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_specialFunction_in_exprPrimary3224);
                    specialFunction213=specialFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, specialFunction213.getTree());

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:398:7: number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_in_exprPrimary3232);
                    number214=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number214.getTree());

                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/Statement.g:399:7: bool
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_bool_in_exprPrimary3240);
                    bool215=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool215.getTree());

                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/Statement.g:400:7: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING216=(Token)match(input,STRING,FOLLOW_STRING_in_exprPrimary3248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING216_tree = 
                    (CommonTree)adaptor.create(STRING216)
                    ;
                    adaptor.addChild(root_0, STRING216_tree);
                    }

                    }
                    break;
                case 7 :
                    // com/facebook/presto/sql/parser/Statement.g:401:7: dateValue
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateValue_in_exprPrimary3256);
                    dateValue217=dateValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateValue217.getTree());

                    }
                    break;
                case 8 :
                    // com/facebook/presto/sql/parser/Statement.g:402:7: intervalValue
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intervalValue_in_exprPrimary3264);
                    intervalValue218=intervalValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intervalValue218.getTree());

                    }
                    break;
                case 9 :
                    // com/facebook/presto/sql/parser/Statement.g:403:7: caseExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_caseExpression_in_exprPrimary3272);
                    caseExpression219=caseExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression219.getTree());

                    }
                    break;
                case 10 :
                    // com/facebook/presto/sql/parser/Statement.g:404:7: ( '(' expr ')' )=> ( '(' expr ')' -> expr )
                    {
                    // com/facebook/presto/sql/parser/Statement.g:404:25: ( '(' expr ')' -> expr )
                    // com/facebook/presto/sql/parser/Statement.g:404:26: '(' expr ')'
                    {
                    char_literal220=(Token)match(input,200,FOLLOW_200_in_exprPrimary3291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal220);


                    pushFollow(FOLLOW_expr_in_exprPrimary3293);
                    expr221=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr221.getTree());

                    char_literal222=(Token)match(input,201,FOLLOW_201_in_exprPrimary3295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal222);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 404:39: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;
                case 11 :
                    // com/facebook/presto/sql/parser/Statement.g:405:7: subquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_subquery_in_exprPrimary3308);
                    subquery223=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery223.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, exprPrimary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprPrimary"


    public static class qnameOrFunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qnameOrFunction"
    // com/facebook/presto/sql/parser/Statement.g:408:1: qnameOrFunction : ( qname -> qname ) ( ( '(' '*' ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ) ) | ( '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* ) ) )? ;
    public final StatementParser.qnameOrFunction_return qnameOrFunction() throws RecognitionException {
        StatementParser.qnameOrFunction_return retval = new StatementParser.qnameOrFunction_return();
        retval.start = input.LT(1);

        int qnameOrFunction_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal225=null;
        Token char_literal226=null;
        Token char_literal227=null;
        Token char_literal229=null;
        Token char_literal232=null;
        Token char_literal234=null;
        StatementParser.qname_return qname224 =null;

        StatementParser.over_return over228 =null;

        StatementParser.setQuant_return setQuant230 =null;

        StatementParser.expr_return expr231 =null;

        StatementParser.expr_return expr233 =null;

        StatementParser.over_return over235 =null;


        CommonTree char_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal227_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree char_literal232_tree=null;
        CommonTree char_literal234_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_setQuant=new RewriteRuleSubtreeStream(adaptor,"rule setQuant");
        RewriteRuleSubtreeStream stream_over=new RewriteRuleSubtreeStream(adaptor,"rule over");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:409:5: ( ( qname -> qname ) ( ( '(' '*' ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ) ) | ( '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* ) ) )? )
            // com/facebook/presto/sql/parser/Statement.g:409:7: ( qname -> qname ) ( ( '(' '*' ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ) ) | ( '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* ) ) )?
            {
            // com/facebook/presto/sql/parser/Statement.g:409:7: ( qname -> qname )
            // com/facebook/presto/sql/parser/Statement.g:409:8: qname
            {
            pushFollow(FOLLOW_qname_in_qnameOrFunction3326);
            qname224=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname224.getTree());

            // AST REWRITE
            // elements: qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 409:14: -> qname
            {
                adaptor.addChild(root_0, stream_qname.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // com/facebook/presto/sql/parser/Statement.g:410:7: ( ( '(' '*' ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ) ) | ( '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* ) ) )?
            int alt63=3;
            switch ( input.LA(1) ) {
                case 200:
                    {
                    switch ( input.LA(2) ) {
                        case 202:
                            {
                            alt63=1;
                            }
                            break;
                        case ALIAS:
                        case ALL:
                        case BERNOULLI:
                        case CASE:
                        case CAST:
                        case CATALOGS:
                        case COALESCE:
                        case COLUMNS:
                        case CURRENT:
                        case CURRENT_DATE:
                        case CURRENT_TIME:
                        case CURRENT_TIMESTAMP:
                        case DATE:
                        case DAY:
                        case DECIMAL_VALUE:
                        case DISTINCT:
                        case DISTRIBUTED:
                        case EXISTS:
                        case EXPLAIN:
                        case EXTRACT:
                        case FALSE:
                        case FOLLOWING:
                        case FORMAT:
                        case FUNCTIONS:
                        case GRAPHVIZ:
                        case HOUR:
                        case IDENT:
                        case IF:
                        case INTEGER_VALUE:
                        case INTERVAL:
                        case LOGICAL:
                        case MATERIALIZED:
                        case MINUTE:
                        case MONTH:
                        case NOT:
                        case NULL:
                        case NULLIF:
                        case OVER:
                        case PARTITION:
                        case PARTITIONS:
                        case PRECEDING:
                        case QUOTED_IDENT:
                        case RANGE:
                        case REFRESH:
                        case ROW:
                        case ROWS:
                        case SCHEMAS:
                        case SECOND:
                        case SHOW:
                        case STRING:
                        case SUBSTRING:
                        case SYSTEM:
                        case TABLES:
                        case TABLESAMPLE:
                        case TEXT:
                        case TIME:
                        case TIMESTAMP:
                        case TRUE:
                        case TYPE:
                        case VIEW:
                        case YEAR:
                        case 200:
                        case 201:
                        case 203:
                        case 204:
                        case 205:
                            {
                            alt63=2;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:410:9: ( '(' '*' ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ) )
                    {
                    // com/facebook/presto/sql/parser/Statement.g:410:9: ( '(' '*' ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ) )
                    // com/facebook/presto/sql/parser/Statement.g:410:10: '(' '*' ')' ( over )?
                    {
                    char_literal225=(Token)match(input,200,FOLLOW_200_in_qnameOrFunction3342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal225);


                    char_literal226=(Token)match(input,202,FOLLOW_202_in_qnameOrFunction3344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_202.add(char_literal226);


                    char_literal227=(Token)match(input,201,FOLLOW_201_in_qnameOrFunction3346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal227);


                    // com/facebook/presto/sql/parser/Statement.g:410:22: ( over )?
                    int alt58=2;
                    switch ( input.LA(1) ) {
                        case OVER:
                            {
                            switch ( input.LA(2) ) {
                                case 200:
                                    {
                                    alt58=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt58) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:410:22: over
                            {
                            pushFollow(FOLLOW_over_in_qnameOrFunction3348);
                            over228=over();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_over.add(over228.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: qnameOrFunction, over
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 410:53: -> ^( FUNCTION_CALL $qnameOrFunction ( over )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:410:56: ^( FUNCTION_CALL $qnameOrFunction ( over )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:410:89: ( over )?
                        if ( stream_over.hasNext() ) {
                            adaptor.addChild(root_1, stream_over.nextTree());

                        }
                        stream_over.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:411:9: ( '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* ) )
                    {
                    // com/facebook/presto/sql/parser/Statement.g:411:9: ( '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )? -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* ) )
                    // com/facebook/presto/sql/parser/Statement.g:411:10: '(' ( setQuant )? ( expr )? ( ',' expr )* ')' ( over )?
                    {
                    char_literal229=(Token)match(input,200,FOLLOW_200_in_qnameOrFunction3398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal229);


                    // com/facebook/presto/sql/parser/Statement.g:411:14: ( setQuant )?
                    int alt59=2;
                    switch ( input.LA(1) ) {
                        case ALL:
                        case DISTINCT:
                            {
                            alt59=1;
                            }
                            break;
                    }

                    switch (alt59) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:411:14: setQuant
                            {
                            pushFollow(FOLLOW_setQuant_in_qnameOrFunction3400);
                            setQuant230=setQuant();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_setQuant.add(setQuant230.getTree());

                            }
                            break;

                    }


                    // com/facebook/presto/sql/parser/Statement.g:411:24: ( expr )?
                    int alt60=2;
                    switch ( input.LA(1) ) {
                        case ALIAS:
                        case BERNOULLI:
                        case CASE:
                        case CAST:
                        case CATALOGS:
                        case COALESCE:
                        case COLUMNS:
                        case CURRENT:
                        case CURRENT_DATE:
                        case CURRENT_TIME:
                        case CURRENT_TIMESTAMP:
                        case DATE:
                        case DAY:
                        case DECIMAL_VALUE:
                        case DISTRIBUTED:
                        case EXISTS:
                        case EXPLAIN:
                        case EXTRACT:
                        case FALSE:
                        case FOLLOWING:
                        case FORMAT:
                        case FUNCTIONS:
                        case GRAPHVIZ:
                        case HOUR:
                        case IDENT:
                        case IF:
                        case INTEGER_VALUE:
                        case INTERVAL:
                        case LOGICAL:
                        case MATERIALIZED:
                        case MINUTE:
                        case MONTH:
                        case NOT:
                        case NULL:
                        case NULLIF:
                        case OVER:
                        case PARTITION:
                        case PARTITIONS:
                        case PRECEDING:
                        case QUOTED_IDENT:
                        case RANGE:
                        case REFRESH:
                        case ROW:
                        case ROWS:
                        case SCHEMAS:
                        case SECOND:
                        case SHOW:
                        case STRING:
                        case SUBSTRING:
                        case SYSTEM:
                        case TABLES:
                        case TABLESAMPLE:
                        case TEXT:
                        case TIME:
                        case TIMESTAMP:
                        case TRUE:
                        case TYPE:
                        case VIEW:
                        case YEAR:
                        case 200:
                        case 203:
                        case 205:
                            {
                            alt60=1;
                            }
                            break;
                    }

                    switch (alt60) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:411:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_qnameOrFunction3403);
                            expr231=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr231.getTree());

                            }
                            break;

                    }


                    // com/facebook/presto/sql/parser/Statement.g:411:30: ( ',' expr )*
                    loop61:
                    do {
                        int alt61=2;
                        switch ( input.LA(1) ) {
                        case 204:
                            {
                            alt61=1;
                            }
                            break;

                        }

                        switch (alt61) {
                    	case 1 :
                    	    // com/facebook/presto/sql/parser/Statement.g:411:31: ',' expr
                    	    {
                    	    char_literal232=(Token)match(input,204,FOLLOW_204_in_qnameOrFunction3407); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_204.add(char_literal232);


                    	    pushFollow(FOLLOW_expr_in_qnameOrFunction3409);
                    	    expr233=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr233.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    char_literal234=(Token)match(input,201,FOLLOW_201_in_qnameOrFunction3413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal234);


                    // com/facebook/presto/sql/parser/Statement.g:411:46: ( over )?
                    int alt62=2;
                    switch ( input.LA(1) ) {
                        case OVER:
                            {
                            switch ( input.LA(2) ) {
                                case 200:
                                    {
                                    alt62=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:411:46: over
                            {
                            pushFollow(FOLLOW_over_in_qnameOrFunction3415);
                            over235=over();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_over.add(over235.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: qnameOrFunction, setQuant, expr, over
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 411:53: -> ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:411:56: ^( FUNCTION_CALL $qnameOrFunction ( over )? ( setQuant )? ( expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:411:89: ( over )?
                        if ( stream_over.hasNext() ) {
                            adaptor.addChild(root_1, stream_over.nextTree());

                        }
                        stream_over.reset();

                        // com/facebook/presto/sql/parser/Statement.g:411:95: ( setQuant )?
                        if ( stream_setQuant.hasNext() ) {
                            adaptor.addChild(root_1, stream_setQuant.nextTree());

                        }
                        stream_setQuant.reset();

                        // com/facebook/presto/sql/parser/Statement.g:411:105: ( expr )*
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, qnameOrFunction_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qnameOrFunction"


    public static class inList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inList"
    // com/facebook/presto/sql/parser/Statement.g:415:1: inList : ( ( '(' expr )=> ( '(' expr ( ',' expr )* ')' -> ^( IN_LIST ( expr )+ ) ) | subquery );
    public final StatementParser.inList_return inList() throws RecognitionException {
        StatementParser.inList_return retval = new StatementParser.inList_return();
        retval.start = input.LT(1);

        int inList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        Token char_literal240=null;
        StatementParser.expr_return expr237 =null;

        StatementParser.expr_return expr239 =null;

        StatementParser.subquery_return subquery241 =null;


        CommonTree char_literal236_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal240_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:416:5: ( ( '(' expr )=> ( '(' expr ( ',' expr )* ')' -> ^( IN_LIST ( expr )+ ) ) | subquery )
            int alt65=2;
            switch ( input.LA(1) ) {
            case 200:
                {
                int LA65_1 = input.LA(2);

                if ( (synpred4_Statement()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:416:7: ( '(' expr )=> ( '(' expr ( ',' expr )* ')' -> ^( IN_LIST ( expr )+ ) )
                    {
                    // com/facebook/presto/sql/parser/Statement.g:416:21: ( '(' expr ( ',' expr )* ')' -> ^( IN_LIST ( expr )+ ) )
                    // com/facebook/presto/sql/parser/Statement.g:416:22: '(' expr ( ',' expr )* ')'
                    {
                    char_literal236=(Token)match(input,200,FOLLOW_200_in_inList3471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal236);


                    pushFollow(FOLLOW_expr_in_inList3473);
                    expr237=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr237.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:416:31: ( ',' expr )*
                    loop64:
                    do {
                        int alt64=2;
                        switch ( input.LA(1) ) {
                        case 204:
                            {
                            alt64=1;
                            }
                            break;

                        }

                        switch (alt64) {
                    	case 1 :
                    	    // com/facebook/presto/sql/parser/Statement.g:416:32: ',' expr
                    	    {
                    	    char_literal238=(Token)match(input,204,FOLLOW_204_in_inList3476); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_204.add(char_literal238);


                    	    pushFollow(FOLLOW_expr_in_inList3478);
                    	    expr239=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr239.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    char_literal240=(Token)match(input,201,FOLLOW_201_in_inList3482); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal240);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 416:47: -> ^( IN_LIST ( expr )+ )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:416:50: ^( IN_LIST ( expr )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IN_LIST, "IN_LIST")
                        , root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:417:7: subquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_subquery_in_inList3500);
                    subquery241=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery241.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, inList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inList"


    public static class sortItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sortItem"
    // com/facebook/presto/sql/parser/Statement.g:420:1: sortItem : expr ordering ( nullOrdering )? -> ^( SORT_ITEM expr ordering ( nullOrdering )? ) ;
    public final StatementParser.sortItem_return sortItem() throws RecognitionException {
        StatementParser.sortItem_return retval = new StatementParser.sortItem_return();
        retval.start = input.LT(1);

        int sortItem_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.expr_return expr242 =null;

        StatementParser.ordering_return ordering243 =null;

        StatementParser.nullOrdering_return nullOrdering244 =null;


        RewriteRuleSubtreeStream stream_ordering=new RewriteRuleSubtreeStream(adaptor,"rule ordering");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_nullOrdering=new RewriteRuleSubtreeStream(adaptor,"rule nullOrdering");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:421:5: ( expr ordering ( nullOrdering )? -> ^( SORT_ITEM expr ordering ( nullOrdering )? ) )
            // com/facebook/presto/sql/parser/Statement.g:421:7: expr ordering ( nullOrdering )?
            {
            pushFollow(FOLLOW_expr_in_sortItem3517);
            expr242=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr242.getTree());

            pushFollow(FOLLOW_ordering_in_sortItem3519);
            ordering243=ordering();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ordering.add(ordering243.getTree());

            // com/facebook/presto/sql/parser/Statement.g:421:21: ( nullOrdering )?
            int alt66=2;
            switch ( input.LA(1) ) {
                case NULLS:
                    {
                    alt66=1;
                    }
                    break;
            }

            switch (alt66) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:421:21: nullOrdering
                    {
                    pushFollow(FOLLOW_nullOrdering_in_sortItem3521);
                    nullOrdering244=nullOrdering();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullOrdering.add(nullOrdering244.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: nullOrdering, expr, ordering
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 421:35: -> ^( SORT_ITEM expr ordering ( nullOrdering )? )
            {
                // com/facebook/presto/sql/parser/Statement.g:421:38: ^( SORT_ITEM expr ordering ( nullOrdering )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SORT_ITEM, "SORT_ITEM")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_ordering.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:421:64: ( nullOrdering )?
                if ( stream_nullOrdering.hasNext() ) {
                    adaptor.addChild(root_1, stream_nullOrdering.nextTree());

                }
                stream_nullOrdering.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, sortItem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "sortItem"


    public static class ordering_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ordering"
    // com/facebook/presto/sql/parser/Statement.g:424:1: ordering : ( -> ASC | ASC | DESC );
    public final StatementParser.ordering_return ordering() throws RecognitionException {
        StatementParser.ordering_return retval = new StatementParser.ordering_return();
        retval.start = input.LT(1);

        int ordering_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ASC245=null;
        Token DESC246=null;

        CommonTree ASC245_tree=null;
        CommonTree DESC246_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:425:5: ( -> ASC | ASC | DESC )
            int alt67=3;
            switch ( input.LA(1) ) {
            case EOF:
            case LIMIT:
            case NULLS:
            case RANGE:
            case ROWS:
            case 201:
            case 204:
                {
                alt67=1;
                }
                break;
            case ASC:
                {
                alt67=2;
                }
                break;
            case DESC:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:425:7: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 425:7: -> ASC
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(ASC, "ASC")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:426:7: ASC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ASC245=(Token)match(input,ASC,FOLLOW_ASC_in_ordering3562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASC245_tree = 
                    (CommonTree)adaptor.create(ASC245)
                    ;
                    adaptor.addChild(root_0, ASC245_tree);
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:427:7: DESC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DESC246=(Token)match(input,DESC,FOLLOW_DESC_in_ordering3570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DESC246_tree = 
                    (CommonTree)adaptor.create(DESC246)
                    ;
                    adaptor.addChild(root_0, DESC246_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, ordering_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ordering"


    public static class nullOrdering_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullOrdering"
    // com/facebook/presto/sql/parser/Statement.g:430:1: nullOrdering : ( NULLS FIRST -> FIRST | NULLS LAST -> LAST );
    public final StatementParser.nullOrdering_return nullOrdering() throws RecognitionException {
        StatementParser.nullOrdering_return retval = new StatementParser.nullOrdering_return();
        retval.start = input.LT(1);

        int nullOrdering_StartIndex = input.index();

        CommonTree root_0 = null;

        Token NULLS247=null;
        Token FIRST248=null;
        Token NULLS249=null;
        Token LAST250=null;

        CommonTree NULLS247_tree=null;
        CommonTree FIRST248_tree=null;
        CommonTree NULLS249_tree=null;
        CommonTree LAST250_tree=null;
        RewriteRuleTokenStream stream_NULLS=new RewriteRuleTokenStream(adaptor,"token NULLS");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:431:5: ( NULLS FIRST -> FIRST | NULLS LAST -> LAST )
            int alt68=2;
            switch ( input.LA(1) ) {
            case NULLS:
                {
                switch ( input.LA(2) ) {
                case FIRST:
                    {
                    alt68=1;
                    }
                    break;
                case LAST:
                    {
                    alt68=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:431:7: NULLS FIRST
                    {
                    NULLS247=(Token)match(input,NULLS,FOLLOW_NULLS_in_nullOrdering3587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULLS.add(NULLS247);


                    FIRST248=(Token)match(input,FIRST,FOLLOW_FIRST_in_nullOrdering3589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST248);


                    // AST REWRITE
                    // elements: FIRST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 431:19: -> FIRST
                    {
                        adaptor.addChild(root_0, 
                        stream_FIRST.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:432:7: NULLS LAST
                    {
                    NULLS249=(Token)match(input,NULLS,FOLLOW_NULLS_in_nullOrdering3601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULLS.add(NULLS249);


                    LAST250=(Token)match(input,LAST,FOLLOW_LAST_in_nullOrdering3603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST250);


                    // AST REWRITE
                    // elements: LAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 432:19: -> LAST
                    {
                        adaptor.addChild(root_0, 
                        stream_LAST.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, nullOrdering_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nullOrdering"


    public static class cmpOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpOp"
    // com/facebook/presto/sql/parser/Statement.g:435:1: cmpOp : ( EQ | NEQ | LT | LTE | GT | GTE );
    public final StatementParser.cmpOp_return cmpOp() throws RecognitionException {
        StatementParser.cmpOp_return retval = new StatementParser.cmpOp_return();
        retval.start = input.LT(1);

        int cmpOp_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set251=null;

        CommonTree set251_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:436:5: ( EQ | NEQ | LT | LTE | GT | GTE )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set251=(Token)input.LT(1);

            if ( input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NEQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set251)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, cmpOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cmpOp"


    public static class subquery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subquery"
    // com/facebook/presto/sql/parser/Statement.g:439:1: subquery : '(' query ')' -> query ;
    public final StatementParser.subquery_return subquery() throws RecognitionException {
        StatementParser.subquery_return retval = new StatementParser.subquery_return();
        retval.start = input.LT(1);

        int subquery_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal252=null;
        Token char_literal254=null;
        StatementParser.query_return query253 =null;


        CommonTree char_literal252_tree=null;
        CommonTree char_literal254_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:440:5: ( '(' query ')' -> query )
            // com/facebook/presto/sql/parser/Statement.g:440:7: '(' query ')'
            {
            char_literal252=(Token)match(input,200,FOLLOW_200_in_subquery3662); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal252);


            pushFollow(FOLLOW_query_in_subquery3664);
            query253=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_query.add(query253.getTree());

            char_literal254=(Token)match(input,201,FOLLOW_201_in_subquery3666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal254);


            // AST REWRITE
            // elements: query
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 440:21: -> query
            {
                adaptor.addChild(root_0, stream_query.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, subquery_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "subquery"


    public static class dateValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateValue"
    // com/facebook/presto/sql/parser/Statement.g:443:1: dateValue : ( DATE STRING -> ^( DATE STRING ) | TIME STRING -> ^( TIME STRING ) | TIMESTAMP STRING -> ^( TIMESTAMP STRING ) );
    public final StatementParser.dateValue_return dateValue() throws RecognitionException {
        StatementParser.dateValue_return retval = new StatementParser.dateValue_return();
        retval.start = input.LT(1);

        int dateValue_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DATE255=null;
        Token STRING256=null;
        Token TIME257=null;
        Token STRING258=null;
        Token TIMESTAMP259=null;
        Token STRING260=null;

        CommonTree DATE255_tree=null;
        CommonTree STRING256_tree=null;
        CommonTree TIME257_tree=null;
        CommonTree STRING258_tree=null;
        CommonTree TIMESTAMP259_tree=null;
        CommonTree STRING260_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");
        RewriteRuleTokenStream stream_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token TIMESTAMP");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:444:5: ( DATE STRING -> ^( DATE STRING ) | TIME STRING -> ^( TIME STRING ) | TIMESTAMP STRING -> ^( TIMESTAMP STRING ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case DATE:
                {
                alt69=1;
                }
                break;
            case TIME:
                {
                alt69=2;
                }
                break;
            case TIMESTAMP:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:444:7: DATE STRING
                    {
                    DATE255=(Token)match(input,DATE,FOLLOW_DATE_in_dateValue3687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATE.add(DATE255);


                    STRING256=(Token)match(input,STRING,FOLLOW_STRING_in_dateValue3689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING256);


                    // AST REWRITE
                    // elements: STRING, DATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 444:24: -> ^( DATE STRING )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:444:27: ^( DATE STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_DATE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:445:7: TIME STRING
                    {
                    TIME257=(Token)match(input,TIME,FOLLOW_TIME_in_dateValue3710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIME.add(TIME257);


                    STRING258=(Token)match(input,STRING,FOLLOW_STRING_in_dateValue3712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING258);


                    // AST REWRITE
                    // elements: STRING, TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 445:24: -> ^( TIME STRING )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:445:27: ^( TIME STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_TIME.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:446:7: TIMESTAMP STRING
                    {
                    TIMESTAMP259=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_dateValue3733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP259);


                    STRING260=(Token)match(input,STRING,FOLLOW_STRING_in_dateValue3735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING260);


                    // AST REWRITE
                    // elements: STRING, TIMESTAMP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 446:24: -> ^( TIMESTAMP STRING )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:446:27: ^( TIMESTAMP STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_TIMESTAMP.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, dateValue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dateValue"


    public static class intervalValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalValue"
    // com/facebook/presto/sql/parser/Statement.g:449:1: intervalValue : INTERVAL ( intervalSign )? STRING intervalQualifier -> ^( INTERVAL STRING intervalQualifier ( intervalSign )? ) ;
    public final StatementParser.intervalValue_return intervalValue() throws RecognitionException {
        StatementParser.intervalValue_return retval = new StatementParser.intervalValue_return();
        retval.start = input.LT(1);

        int intervalValue_StartIndex = input.index();

        CommonTree root_0 = null;

        Token INTERVAL261=null;
        Token STRING263=null;
        StatementParser.intervalSign_return intervalSign262 =null;

        StatementParser.intervalQualifier_return intervalQualifier264 =null;


        CommonTree INTERVAL261_tree=null;
        CommonTree STRING263_tree=null;
        RewriteRuleTokenStream stream_INTERVAL=new RewriteRuleTokenStream(adaptor,"token INTERVAL");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_intervalQualifier=new RewriteRuleSubtreeStream(adaptor,"rule intervalQualifier");
        RewriteRuleSubtreeStream stream_intervalSign=new RewriteRuleSubtreeStream(adaptor,"rule intervalSign");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:450:5: ( INTERVAL ( intervalSign )? STRING intervalQualifier -> ^( INTERVAL STRING intervalQualifier ( intervalSign )? ) )
            // com/facebook/presto/sql/parser/Statement.g:450:7: INTERVAL ( intervalSign )? STRING intervalQualifier
            {
            INTERVAL261=(Token)match(input,INTERVAL,FOLLOW_INTERVAL_in_intervalValue3760); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERVAL.add(INTERVAL261);


            // com/facebook/presto/sql/parser/Statement.g:450:16: ( intervalSign )?
            int alt70=2;
            switch ( input.LA(1) ) {
                case 203:
                case 205:
                    {
                    alt70=1;
                    }
                    break;
            }

            switch (alt70) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:450:16: intervalSign
                    {
                    pushFollow(FOLLOW_intervalSign_in_intervalValue3762);
                    intervalSign262=intervalSign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_intervalSign.add(intervalSign262.getTree());

                    }
                    break;

            }


            STRING263=(Token)match(input,STRING,FOLLOW_STRING_in_intervalValue3765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(STRING263);


            pushFollow(FOLLOW_intervalQualifier_in_intervalValue3767);
            intervalQualifier264=intervalQualifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_intervalQualifier.add(intervalQualifier264.getTree());

            // AST REWRITE
            // elements: intervalSign, intervalQualifier, INTERVAL, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 450:55: -> ^( INTERVAL STRING intervalQualifier ( intervalSign )? )
            {
                // com/facebook/presto/sql/parser/Statement.g:450:58: ^( INTERVAL STRING intervalQualifier ( intervalSign )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_INTERVAL.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, stream_intervalQualifier.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:450:94: ( intervalSign )?
                if ( stream_intervalSign.hasNext() ) {
                    adaptor.addChild(root_1, stream_intervalSign.nextTree());

                }
                stream_intervalSign.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, intervalValue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "intervalValue"


    public static class intervalSign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalSign"
    // com/facebook/presto/sql/parser/Statement.g:453:1: intervalSign : ( '+' ->| '-' -> NEGATIVE );
    public final StatementParser.intervalSign_return intervalSign() throws RecognitionException {
        StatementParser.intervalSign_return retval = new StatementParser.intervalSign_return();
        retval.start = input.LT(1);

        int intervalSign_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal265=null;
        Token char_literal266=null;

        CommonTree char_literal265_tree=null;
        CommonTree char_literal266_tree=null;
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:454:5: ( '+' ->| '-' -> NEGATIVE )
            int alt71=2;
            switch ( input.LA(1) ) {
            case 203:
                {
                alt71=1;
                }
                break;
            case 205:
                {
                alt71=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:454:7: '+'
                    {
                    char_literal265=(Token)match(input,203,FOLLOW_203_in_intervalSign3797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_203.add(char_literal265);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:11: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:455:7: '-'
                    {
                    char_literal266=(Token)match(input,205,FOLLOW_205_in_intervalSign3807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_205.add(char_literal266);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 455:11: -> NEGATIVE
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(NEGATIVE, "NEGATIVE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, intervalSign_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "intervalSign"


    public static class intervalQualifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalQualifier"
    // com/facebook/presto/sql/parser/Statement.g:458:1: intervalQualifier : ( nonSecond ( '(' integer ')' )? -> ^( nonSecond ( integer )? ) | SECOND ( '(' p= integer ( ',' s= integer )? ')' )? -> ^( SECOND ( $p)? ( $s)? ) );
    public final StatementParser.intervalQualifier_return intervalQualifier() throws RecognitionException {
        StatementParser.intervalQualifier_return retval = new StatementParser.intervalQualifier_return();
        retval.start = input.LT(1);

        int intervalQualifier_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal268=null;
        Token char_literal270=null;
        Token SECOND271=null;
        Token char_literal272=null;
        Token char_literal273=null;
        Token char_literal274=null;
        StatementParser.integer_return p =null;

        StatementParser.integer_return s =null;

        StatementParser.nonSecond_return nonSecond267 =null;

        StatementParser.integer_return integer269 =null;


        CommonTree char_literal268_tree=null;
        CommonTree char_literal270_tree=null;
        CommonTree SECOND271_tree=null;
        CommonTree char_literal272_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree char_literal274_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_SECOND=new RewriteRuleTokenStream(adaptor,"token SECOND");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        RewriteRuleSubtreeStream stream_nonSecond=new RewriteRuleSubtreeStream(adaptor,"rule nonSecond");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:459:5: ( nonSecond ( '(' integer ')' )? -> ^( nonSecond ( integer )? ) | SECOND ( '(' p= integer ( ',' s= integer )? ')' )? -> ^( SECOND ( $p)? ( $s)? ) )
            int alt75=2;
            switch ( input.LA(1) ) {
            case DAY:
            case HOUR:
            case MINUTE:
            case MONTH:
            case YEAR:
                {
                alt75=1;
                }
                break;
            case SECOND:
                {
                alt75=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:459:7: nonSecond ( '(' integer ')' )?
                    {
                    pushFollow(FOLLOW_nonSecond_in_intervalQualifier3828);
                    nonSecond267=nonSecond();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonSecond.add(nonSecond267.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:459:17: ( '(' integer ')' )?
                    int alt72=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt72=1;
                            }
                            break;
                    }

                    switch (alt72) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:459:18: '(' integer ')'
                            {
                            char_literal268=(Token)match(input,200,FOLLOW_200_in_intervalQualifier3831); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_200.add(char_literal268);


                            pushFollow(FOLLOW_integer_in_intervalQualifier3833);
                            integer269=integer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_integer.add(integer269.getTree());

                            char_literal270=(Token)match(input,201,FOLLOW_201_in_intervalQualifier3835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_201.add(char_literal270);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: integer, nonSecond
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 459:52: -> ^( nonSecond ( integer )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:459:55: ^( nonSecond ( integer )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_nonSecond.nextNode(), root_1);

                        // com/facebook/presto/sql/parser/Statement.g:459:67: ( integer )?
                        if ( stream_integer.hasNext() ) {
                            adaptor.addChild(root_1, stream_integer.nextTree());

                        }
                        stream_integer.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:460:7: SECOND ( '(' p= integer ( ',' s= integer )? ')' )?
                    {
                    SECOND271=(Token)match(input,SECOND,FOLLOW_SECOND_in_intervalQualifier3870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND271);


                    // com/facebook/presto/sql/parser/Statement.g:460:14: ( '(' p= integer ( ',' s= integer )? ')' )?
                    int alt74=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt74=1;
                            }
                            break;
                    }

                    switch (alt74) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:460:15: '(' p= integer ( ',' s= integer )? ')'
                            {
                            char_literal272=(Token)match(input,200,FOLLOW_200_in_intervalQualifier3873); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_200.add(char_literal272);


                            pushFollow(FOLLOW_integer_in_intervalQualifier3877);
                            p=integer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_integer.add(p.getTree());

                            // com/facebook/presto/sql/parser/Statement.g:460:29: ( ',' s= integer )?
                            int alt73=2;
                            switch ( input.LA(1) ) {
                                case 204:
                                    {
                                    alt73=1;
                                    }
                                    break;
                            }

                            switch (alt73) {
                                case 1 :
                                    // com/facebook/presto/sql/parser/Statement.g:460:30: ',' s= integer
                                    {
                                    char_literal273=(Token)match(input,204,FOLLOW_204_in_intervalQualifier3880); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_204.add(char_literal273);


                                    pushFollow(FOLLOW_integer_in_intervalQualifier3884);
                                    s=integer();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_integer.add(s.getTree());

                                    }
                                    break;

                            }


                            char_literal274=(Token)match(input,201,FOLLOW_201_in_intervalQualifier3888); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_201.add(char_literal274);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: s, SECOND, p
                    // token labels: 
                    // rule labels: retval, s, p
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
                    RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 460:52: -> ^( SECOND ( $p)? ( $s)? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:460:55: ^( SECOND ( $p)? ( $s)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_SECOND.nextNode()
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:460:65: ( $p)?
                        if ( stream_p.hasNext() ) {
                            adaptor.addChild(root_1, stream_p.nextTree());

                        }
                        stream_p.reset();

                        // com/facebook/presto/sql/parser/Statement.g:460:69: ( $s)?
                        if ( stream_s.hasNext() ) {
                            adaptor.addChild(root_1, stream_s.nextTree());

                        }
                        stream_s.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, intervalQualifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "intervalQualifier"


    public static class nonSecond_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonSecond"
    // com/facebook/presto/sql/parser/Statement.g:463:1: nonSecond : ( YEAR | MONTH | DAY | HOUR | MINUTE );
    public final StatementParser.nonSecond_return nonSecond() throws RecognitionException {
        StatementParser.nonSecond_return retval = new StatementParser.nonSecond_return();
        retval.start = input.LT(1);

        int nonSecond_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set275=null;

        CommonTree set275_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:464:5: ( YEAR | MONTH | DAY | HOUR | MINUTE )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set275=(Token)input.LT(1);

            if ( input.LA(1)==DAY||input.LA(1)==HOUR||(input.LA(1) >= MINUTE && input.LA(1) <= MONTH)||input.LA(1)==YEAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set275)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, nonSecond_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nonSecond"


    public static class specialFunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specialFunction"
    // com/facebook/presto/sql/parser/Statement.g:467:1: specialFunction : ( CURRENT_DATE | CURRENT_TIME ( '(' integer ')' )? -> ^( CURRENT_TIME ( integer )? ) | CURRENT_TIMESTAMP ( '(' integer ')' )? -> ^( CURRENT_TIMESTAMP ( integer )? ) | SUBSTRING '(' expr FROM expr ( FOR expr )? ')' -> ^( FUNCTION_CALL ^( QNAME IDENT[\"substr\"] ) expr expr ( expr )? ) | EXTRACT '(' ident FROM expr ')' -> ^( EXTRACT ident expr ) | CAST '(' expr AS type ')' -> ^( CAST expr IDENT[$type.text] ) );
    public final StatementParser.specialFunction_return specialFunction() throws RecognitionException {
        StatementParser.specialFunction_return retval = new StatementParser.specialFunction_return();
        retval.start = input.LT(1);

        int specialFunction_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CURRENT_DATE276=null;
        Token CURRENT_TIME277=null;
        Token char_literal278=null;
        Token char_literal280=null;
        Token CURRENT_TIMESTAMP281=null;
        Token char_literal282=null;
        Token char_literal284=null;
        Token SUBSTRING285=null;
        Token char_literal286=null;
        Token FROM288=null;
        Token FOR290=null;
        Token char_literal292=null;
        Token EXTRACT293=null;
        Token char_literal294=null;
        Token FROM296=null;
        Token char_literal298=null;
        Token CAST299=null;
        Token char_literal300=null;
        Token AS302=null;
        Token char_literal304=null;
        StatementParser.integer_return integer279 =null;

        StatementParser.integer_return integer283 =null;

        StatementParser.expr_return expr287 =null;

        StatementParser.expr_return expr289 =null;

        StatementParser.expr_return expr291 =null;

        StatementParser.ident_return ident295 =null;

        StatementParser.expr_return expr297 =null;

        StatementParser.expr_return expr301 =null;

        StatementParser.type_return type303 =null;


        CommonTree CURRENT_DATE276_tree=null;
        CommonTree CURRENT_TIME277_tree=null;
        CommonTree char_literal278_tree=null;
        CommonTree char_literal280_tree=null;
        CommonTree CURRENT_TIMESTAMP281_tree=null;
        CommonTree char_literal282_tree=null;
        CommonTree char_literal284_tree=null;
        CommonTree SUBSTRING285_tree=null;
        CommonTree char_literal286_tree=null;
        CommonTree FROM288_tree=null;
        CommonTree FOR290_tree=null;
        CommonTree char_literal292_tree=null;
        CommonTree EXTRACT293_tree=null;
        CommonTree char_literal294_tree=null;
        CommonTree FROM296_tree=null;
        CommonTree char_literal298_tree=null;
        CommonTree CAST299_tree=null;
        CommonTree char_literal300_tree=null;
        CommonTree AS302_tree=null;
        CommonTree char_literal304_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_EXTRACT=new RewriteRuleTokenStream(adaptor,"token EXTRACT");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_SUBSTRING=new RewriteRuleTokenStream(adaptor,"token SUBSTRING");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:468:5: ( CURRENT_DATE | CURRENT_TIME ( '(' integer ')' )? -> ^( CURRENT_TIME ( integer )? ) | CURRENT_TIMESTAMP ( '(' integer ')' )? -> ^( CURRENT_TIMESTAMP ( integer )? ) | SUBSTRING '(' expr FROM expr ( FOR expr )? ')' -> ^( FUNCTION_CALL ^( QNAME IDENT[\"substr\"] ) expr expr ( expr )? ) | EXTRACT '(' ident FROM expr ')' -> ^( EXTRACT ident expr ) | CAST '(' expr AS type ')' -> ^( CAST expr IDENT[$type.text] ) )
            int alt79=6;
            switch ( input.LA(1) ) {
            case CURRENT_DATE:
                {
                alt79=1;
                }
                break;
            case CURRENT_TIME:
                {
                alt79=2;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt79=3;
                }
                break;
            case SUBSTRING:
                {
                alt79=4;
                }
                break;
            case EXTRACT:
                {
                alt79=5;
                }
                break;
            case CAST:
                {
                alt79=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:468:7: CURRENT_DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CURRENT_DATE276=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_specialFunction3954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_DATE276_tree = 
                    (CommonTree)adaptor.create(CURRENT_DATE276)
                    ;
                    adaptor.addChild(root_0, CURRENT_DATE276_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:469:7: CURRENT_TIME ( '(' integer ')' )?
                    {
                    CURRENT_TIME277=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_specialFunction3962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURRENT_TIME.add(CURRENT_TIME277);


                    // com/facebook/presto/sql/parser/Statement.g:469:20: ( '(' integer ')' )?
                    int alt76=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt76=1;
                            }
                            break;
                    }

                    switch (alt76) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:469:21: '(' integer ')'
                            {
                            char_literal278=(Token)match(input,200,FOLLOW_200_in_specialFunction3965); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_200.add(char_literal278);


                            pushFollow(FOLLOW_integer_in_specialFunction3967);
                            integer279=integer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_integer.add(integer279.getTree());

                            char_literal280=(Token)match(input,201,FOLLOW_201_in_specialFunction3969); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_201.add(char_literal280);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: CURRENT_TIME, integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 469:52: -> ^( CURRENT_TIME ( integer )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:469:55: ^( CURRENT_TIME ( integer )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CURRENT_TIME.nextNode()
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:469:70: ( integer )?
                        if ( stream_integer.hasNext() ) {
                            adaptor.addChild(root_1, stream_integer.nextTree());

                        }
                        stream_integer.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:470:7: CURRENT_TIMESTAMP ( '(' integer ')' )?
                    {
                    CURRENT_TIMESTAMP281=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_specialFunction4001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP281);


                    // com/facebook/presto/sql/parser/Statement.g:470:25: ( '(' integer ')' )?
                    int alt77=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt77=1;
                            }
                            break;
                    }

                    switch (alt77) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:470:26: '(' integer ')'
                            {
                            char_literal282=(Token)match(input,200,FOLLOW_200_in_specialFunction4004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_200.add(char_literal282);


                            pushFollow(FOLLOW_integer_in_specialFunction4006);
                            integer283=integer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_integer.add(integer283.getTree());

                            char_literal284=(Token)match(input,201,FOLLOW_201_in_specialFunction4008); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_201.add(char_literal284);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: integer, CURRENT_TIMESTAMP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 470:52: -> ^( CURRENT_TIMESTAMP ( integer )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:470:55: ^( CURRENT_TIMESTAMP ( integer )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CURRENT_TIMESTAMP.nextNode()
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:470:75: ( integer )?
                        if ( stream_integer.hasNext() ) {
                            adaptor.addChild(root_1, stream_integer.nextTree());

                        }
                        stream_integer.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:471:7: SUBSTRING '(' expr FROM expr ( FOR expr )? ')'
                    {
                    SUBSTRING285=(Token)match(input,SUBSTRING,FOLLOW_SUBSTRING_in_specialFunction4035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSTRING.add(SUBSTRING285);


                    char_literal286=(Token)match(input,200,FOLLOW_200_in_specialFunction4037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal286);


                    pushFollow(FOLLOW_expr_in_specialFunction4039);
                    expr287=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr287.getTree());

                    FROM288=(Token)match(input,FROM,FOLLOW_FROM_in_specialFunction4041); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM288);


                    pushFollow(FOLLOW_expr_in_specialFunction4043);
                    expr289=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr289.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:471:36: ( FOR expr )?
                    int alt78=2;
                    switch ( input.LA(1) ) {
                        case FOR:
                            {
                            alt78=1;
                            }
                            break;
                    }

                    switch (alt78) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:471:37: FOR expr
                            {
                            FOR290=(Token)match(input,FOR,FOLLOW_FOR_in_specialFunction4046); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOR.add(FOR290);


                            pushFollow(FOLLOW_expr_in_specialFunction4048);
                            expr291=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr291.getTree());

                            }
                            break;

                    }


                    char_literal292=(Token)match(input,201,FOLLOW_201_in_specialFunction4052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal292);


                    // AST REWRITE
                    // elements: expr, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 471:52: -> ^( FUNCTION_CALL ^( QNAME IDENT[\"substr\"] ) expr expr ( expr )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:471:55: ^( FUNCTION_CALL ^( QNAME IDENT[\"substr\"] ) expr expr ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:471:71: ^( QNAME IDENT[\"substr\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QNAME, "QNAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        (CommonTree)adaptor.create(IDENT, "substr")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:471:106: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/Statement.g:472:7: EXTRACT '(' ident FROM expr ')'
                    {
                    EXTRACT293=(Token)match(input,EXTRACT,FOLLOW_EXTRACT_in_specialFunction4080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTRACT.add(EXTRACT293);


                    char_literal294=(Token)match(input,200,FOLLOW_200_in_specialFunction4082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal294);


                    pushFollow(FOLLOW_ident_in_specialFunction4084);
                    ident295=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident295.getTree());

                    FROM296=(Token)match(input,FROM,FOLLOW_FROM_in_specialFunction4086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM296);


                    pushFollow(FOLLOW_expr_in_specialFunction4088);
                    expr297=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr297.getTree());

                    char_literal298=(Token)match(input,201,FOLLOW_201_in_specialFunction4090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal298);


                    // AST REWRITE
                    // elements: ident, expr, EXTRACT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 472:52: -> ^( EXTRACT ident expr )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:472:55: ^( EXTRACT ident expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EXTRACT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/Statement.g:473:7: CAST '(' expr AS type ')'
                    {
                    CAST299=(Token)match(input,CAST,FOLLOW_CAST_in_specialFunction4121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST299);


                    char_literal300=(Token)match(input,200,FOLLOW_200_in_specialFunction4123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal300);


                    pushFollow(FOLLOW_expr_in_specialFunction4125);
                    expr301=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr301.getTree());

                    AS302=(Token)match(input,AS,FOLLOW_AS_in_specialFunction4127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS302);


                    pushFollow(FOLLOW_type_in_specialFunction4129);
                    type303=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type303.getTree());

                    char_literal304=(Token)match(input,201,FOLLOW_201_in_specialFunction4131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal304);


                    // AST REWRITE
                    // elements: expr, CAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 473:52: -> ^( CAST expr IDENT[$type.text] )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:473:55: ^( CAST expr IDENT[$type.text] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CAST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(IDENT, (type303!=null?input.toString(type303.start,type303.stop):null))
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, specialFunction_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specialFunction"


    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // com/facebook/presto/sql/parser/Statement.g:477:1: type : ( VARCHAR | BIGINT | DOUBLE | BOOLEAN );
    public final StatementParser.type_return type() throws RecognitionException {
        StatementParser.type_return retval = new StatementParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set305=null;

        CommonTree set305_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:478:5: ( VARCHAR | BIGINT | DOUBLE | BOOLEAN )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set305=(Token)input.LT(1);

            if ( (input.LA(1) >= BIGINT && input.LA(1) <= BOOLEAN)||input.LA(1)==DOUBLE||input.LA(1)==VARCHAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set305)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type"


    public static class caseExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseExpression"
    // com/facebook/presto/sql/parser/Statement.g:484:1: caseExpression : ( NULLIF '(' expr ',' expr ')' -> ^( NULLIF expr expr ) | COALESCE '(' expr ( ',' expr )* ')' -> ^( COALESCE ( expr )+ ) | CASE expr ( whenClause )+ ( elseClause )? END -> ^( SIMPLE_CASE expr ( whenClause )+ ( elseClause )? ) | CASE ( whenClause )+ ( elseClause )? END -> ^( SEARCHED_CASE ( whenClause )+ ( elseClause )? ) | IF '(' expr ',' expr ( ',' expr )? ')' -> ^( IF expr expr ( expr )? ) );
    public final StatementParser.caseExpression_return caseExpression() throws RecognitionException {
        StatementParser.caseExpression_return retval = new StatementParser.caseExpression_return();
        retval.start = input.LT(1);

        int caseExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token NULLIF306=null;
        Token char_literal307=null;
        Token char_literal309=null;
        Token char_literal311=null;
        Token COALESCE312=null;
        Token char_literal313=null;
        Token char_literal315=null;
        Token char_literal317=null;
        Token CASE318=null;
        Token END322=null;
        Token CASE323=null;
        Token END326=null;
        Token IF327=null;
        Token char_literal328=null;
        Token char_literal330=null;
        Token char_literal332=null;
        Token char_literal334=null;
        StatementParser.expr_return expr308 =null;

        StatementParser.expr_return expr310 =null;

        StatementParser.expr_return expr314 =null;

        StatementParser.expr_return expr316 =null;

        StatementParser.expr_return expr319 =null;

        StatementParser.whenClause_return whenClause320 =null;

        StatementParser.elseClause_return elseClause321 =null;

        StatementParser.whenClause_return whenClause324 =null;

        StatementParser.elseClause_return elseClause325 =null;

        StatementParser.expr_return expr329 =null;

        StatementParser.expr_return expr331 =null;

        StatementParser.expr_return expr333 =null;


        CommonTree NULLIF306_tree=null;
        CommonTree char_literal307_tree=null;
        CommonTree char_literal309_tree=null;
        CommonTree char_literal311_tree=null;
        CommonTree COALESCE312_tree=null;
        CommonTree char_literal313_tree=null;
        CommonTree char_literal315_tree=null;
        CommonTree char_literal317_tree=null;
        CommonTree CASE318_tree=null;
        CommonTree END322_tree=null;
        CommonTree CASE323_tree=null;
        CommonTree END326_tree=null;
        CommonTree IF327_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree char_literal330_tree=null;
        CommonTree char_literal332_tree=null;
        CommonTree char_literal334_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_COALESCE=new RewriteRuleTokenStream(adaptor,"token COALESCE");
        RewriteRuleTokenStream stream_NULLIF=new RewriteRuleTokenStream(adaptor,"token NULLIF");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_whenClause=new RewriteRuleSubtreeStream(adaptor,"rule whenClause");
        RewriteRuleSubtreeStream stream_elseClause=new RewriteRuleSubtreeStream(adaptor,"rule elseClause");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:485:5: ( NULLIF '(' expr ',' expr ')' -> ^( NULLIF expr expr ) | COALESCE '(' expr ( ',' expr )* ')' -> ^( COALESCE ( expr )+ ) | CASE expr ( whenClause )+ ( elseClause )? END -> ^( SIMPLE_CASE expr ( whenClause )+ ( elseClause )? ) | CASE ( whenClause )+ ( elseClause )? END -> ^( SEARCHED_CASE ( whenClause )+ ( elseClause )? ) | IF '(' expr ',' expr ( ',' expr )? ')' -> ^( IF expr expr ( expr )? ) )
            int alt86=5;
            switch ( input.LA(1) ) {
            case NULLIF:
                {
                alt86=1;
                }
                break;
            case COALESCE:
                {
                alt86=2;
                }
                break;
            case CASE:
                {
                switch ( input.LA(2) ) {
                case ALIAS:
                case BERNOULLI:
                case CASE:
                case CAST:
                case CATALOGS:
                case COALESCE:
                case COLUMNS:
                case CURRENT:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case DATE:
                case DAY:
                case DECIMAL_VALUE:
                case DISTRIBUTED:
                case EXISTS:
                case EXPLAIN:
                case EXTRACT:
                case FALSE:
                case FOLLOWING:
                case FORMAT:
                case FUNCTIONS:
                case GRAPHVIZ:
                case HOUR:
                case IDENT:
                case IF:
                case INTEGER_VALUE:
                case INTERVAL:
                case LOGICAL:
                case MATERIALIZED:
                case MINUTE:
                case MONTH:
                case NOT:
                case NULL:
                case NULLIF:
                case OVER:
                case PARTITION:
                case PARTITIONS:
                case PRECEDING:
                case QUOTED_IDENT:
                case RANGE:
                case REFRESH:
                case ROW:
                case ROWS:
                case SCHEMAS:
                case SECOND:
                case SHOW:
                case STRING:
                case SUBSTRING:
                case SYSTEM:
                case TABLES:
                case TABLESAMPLE:
                case TEXT:
                case TIME:
                case TIMESTAMP:
                case TRUE:
                case TYPE:
                case VIEW:
                case YEAR:
                case 200:
                case 203:
                case 205:
                    {
                    alt86=3;
                    }
                    break;
                case WHEN:
                    {
                    alt86=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 3, input);

                    throw nvae;

                }

                }
                break;
            case IF:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:485:7: NULLIF '(' expr ',' expr ')'
                    {
                    NULLIF306=(Token)match(input,NULLIF,FOLLOW_NULLIF_in_caseExpression4220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULLIF.add(NULLIF306);


                    char_literal307=(Token)match(input,200,FOLLOW_200_in_caseExpression4222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal307);


                    pushFollow(FOLLOW_expr_in_caseExpression4224);
                    expr308=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr308.getTree());

                    char_literal309=(Token)match(input,204,FOLLOW_204_in_caseExpression4226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_204.add(char_literal309);


                    pushFollow(FOLLOW_expr_in_caseExpression4228);
                    expr310=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr310.getTree());

                    char_literal311=(Token)match(input,201,FOLLOW_201_in_caseExpression4230); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal311);


                    // AST REWRITE
                    // elements: expr, expr, NULLIF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 485:45: -> ^( NULLIF expr expr )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:485:48: ^( NULLIF expr expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_NULLIF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:486:7: COALESCE '(' expr ( ',' expr )* ')'
                    {
                    COALESCE312=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_caseExpression4257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COALESCE.add(COALESCE312);


                    char_literal313=(Token)match(input,200,FOLLOW_200_in_caseExpression4259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal313);


                    pushFollow(FOLLOW_expr_in_caseExpression4261);
                    expr314=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr314.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:486:25: ( ',' expr )*
                    loop80:
                    do {
                        int alt80=2;
                        switch ( input.LA(1) ) {
                        case 204:
                            {
                            alt80=1;
                            }
                            break;

                        }

                        switch (alt80) {
                    	case 1 :
                    	    // com/facebook/presto/sql/parser/Statement.g:486:26: ',' expr
                    	    {
                    	    char_literal315=(Token)match(input,204,FOLLOW_204_in_caseExpression4264); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_204.add(char_literal315);


                    	    pushFollow(FOLLOW_expr_in_caseExpression4266);
                    	    expr316=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr316.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    char_literal317=(Token)match(input,201,FOLLOW_201_in_caseExpression4270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal317);


                    // AST REWRITE
                    // elements: COALESCE, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 486:45: -> ^( COALESCE ( expr )+ )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:486:48: ^( COALESCE ( expr )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_COALESCE.nextNode()
                        , root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:487:7: CASE expr ( whenClause )+ ( elseClause )? END
                    {
                    CASE318=(Token)match(input,CASE,FOLLOW_CASE_in_caseExpression4291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE318);


                    pushFollow(FOLLOW_expr_in_caseExpression4293);
                    expr319=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr319.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:487:17: ( whenClause )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        switch ( input.LA(1) ) {
                        case WHEN:
                            {
                            alt81=1;
                            }
                            break;

                        }

                        switch (alt81) {
                    	case 1 :
                    	    // com/facebook/presto/sql/parser/Statement.g:487:17: whenClause
                    	    {
                    	    pushFollow(FOLLOW_whenClause_in_caseExpression4295);
                    	    whenClause320=whenClause();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_whenClause.add(whenClause320.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
                    } while (true);


                    // com/facebook/presto/sql/parser/Statement.g:487:29: ( elseClause )?
                    int alt82=2;
                    switch ( input.LA(1) ) {
                        case ELSE:
                            {
                            alt82=1;
                            }
                            break;
                    }

                    switch (alt82) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:487:29: elseClause
                            {
                            pushFollow(FOLLOW_elseClause_in_caseExpression4298);
                            elseClause321=elseClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elseClause.add(elseClause321.getTree());

                            }
                            break;

                    }


                    END322=(Token)match(input,END,FOLLOW_END_in_caseExpression4301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END322);


                    // AST REWRITE
                    // elements: expr, elseClause, whenClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 487:45: -> ^( SIMPLE_CASE expr ( whenClause )+ ( elseClause )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:487:48: ^( SIMPLE_CASE expr ( whenClause )+ ( elseClause )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SIMPLE_CASE, "SIMPLE_CASE")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        if ( !(stream_whenClause.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_whenClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_whenClause.nextTree());

                        }
                        stream_whenClause.reset();

                        // com/facebook/presto/sql/parser/Statement.g:487:79: ( elseClause )?
                        if ( stream_elseClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_elseClause.nextTree());

                        }
                        stream_elseClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:488:7: CASE ( whenClause )+ ( elseClause )? END
                    {
                    CASE323=(Token)match(input,CASE,FOLLOW_CASE_in_caseExpression4323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE323);


                    // com/facebook/presto/sql/parser/Statement.g:488:12: ( whenClause )+
                    int cnt83=0;
                    loop83:
                    do {
                        int alt83=2;
                        switch ( input.LA(1) ) {
                        case WHEN:
                            {
                            alt83=1;
                            }
                            break;

                        }

                        switch (alt83) {
                    	case 1 :
                    	    // com/facebook/presto/sql/parser/Statement.g:488:12: whenClause
                    	    {
                    	    pushFollow(FOLLOW_whenClause_in_caseExpression4325);
                    	    whenClause324=whenClause();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_whenClause.add(whenClause324.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt83 >= 1 ) break loop83;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(83, input);
                                throw eee;
                        }
                        cnt83++;
                    } while (true);


                    // com/facebook/presto/sql/parser/Statement.g:488:24: ( elseClause )?
                    int alt84=2;
                    switch ( input.LA(1) ) {
                        case ELSE:
                            {
                            alt84=1;
                            }
                            break;
                    }

                    switch (alt84) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:488:24: elseClause
                            {
                            pushFollow(FOLLOW_elseClause_in_caseExpression4328);
                            elseClause325=elseClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_elseClause.add(elseClause325.getTree());

                            }
                            break;

                    }


                    END326=(Token)match(input,END,FOLLOW_END_in_caseExpression4331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END326);


                    // AST REWRITE
                    // elements: whenClause, elseClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 488:45: -> ^( SEARCHED_CASE ( whenClause )+ ( elseClause )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:488:48: ^( SEARCHED_CASE ( whenClause )+ ( elseClause )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SEARCHED_CASE, "SEARCHED_CASE")
                        , root_1);

                        if ( !(stream_whenClause.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_whenClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_whenClause.nextTree());

                        }
                        stream_whenClause.reset();

                        // com/facebook/presto/sql/parser/Statement.g:488:76: ( elseClause )?
                        if ( stream_elseClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_elseClause.nextTree());

                        }
                        stream_elseClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/Statement.g:489:7: IF '(' expr ',' expr ( ',' expr )? ')'
                    {
                    IF327=(Token)match(input,IF,FOLLOW_IF_in_caseExpression4356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF327);


                    char_literal328=(Token)match(input,200,FOLLOW_200_in_caseExpression4358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal328);


                    pushFollow(FOLLOW_expr_in_caseExpression4360);
                    expr329=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr329.getTree());

                    char_literal330=(Token)match(input,204,FOLLOW_204_in_caseExpression4362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_204.add(char_literal330);


                    pushFollow(FOLLOW_expr_in_caseExpression4364);
                    expr331=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr331.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:489:28: ( ',' expr )?
                    int alt85=2;
                    switch ( input.LA(1) ) {
                        case 204:
                            {
                            alt85=1;
                            }
                            break;
                    }

                    switch (alt85) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:489:29: ',' expr
                            {
                            char_literal332=(Token)match(input,204,FOLLOW_204_in_caseExpression4367); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_204.add(char_literal332);


                            pushFollow(FOLLOW_expr_in_caseExpression4369);
                            expr333=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr333.getTree());

                            }
                            break;

                    }


                    char_literal334=(Token)match(input,201,FOLLOW_201_in_caseExpression4373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_201.add(char_literal334);


                    // AST REWRITE
                    // elements: expr, IF, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 489:45: -> ^( IF expr expr ( expr )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:489:48: ^( IF expr expr ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // com/facebook/presto/sql/parser/Statement.g:489:63: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, caseExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseExpression"


    public static class whenClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whenClause"
    // com/facebook/presto/sql/parser/Statement.g:492:1: whenClause : WHEN expr THEN expr -> ^( WHEN expr expr ) ;
    public final StatementParser.whenClause_return whenClause() throws RecognitionException {
        StatementParser.whenClause_return retval = new StatementParser.whenClause_return();
        retval.start = input.LT(1);

        int whenClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token WHEN335=null;
        Token THEN337=null;
        StatementParser.expr_return expr336 =null;

        StatementParser.expr_return expr338 =null;


        CommonTree WHEN335_tree=null;
        CommonTree THEN337_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:493:5: ( WHEN expr THEN expr -> ^( WHEN expr expr ) )
            // com/facebook/presto/sql/parser/Statement.g:493:7: WHEN expr THEN expr
            {
            WHEN335=(Token)match(input,WHEN,FOLLOW_WHEN_in_whenClause4404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHEN.add(WHEN335);


            pushFollow(FOLLOW_expr_in_whenClause4406);
            expr336=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr336.getTree());

            THEN337=(Token)match(input,THEN,FOLLOW_THEN_in_whenClause4408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN337);


            pushFollow(FOLLOW_expr_in_whenClause4410);
            expr338=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr338.getTree());

            // AST REWRITE
            // elements: WHEN, expr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 493:27: -> ^( WHEN expr expr )
            {
                // com/facebook/presto/sql/parser/Statement.g:493:30: ^( WHEN expr expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_WHEN.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, whenClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whenClause"


    public static class elseClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseClause"
    // com/facebook/presto/sql/parser/Statement.g:496:1: elseClause : ELSE expr -> expr ;
    public final StatementParser.elseClause_return elseClause() throws RecognitionException {
        StatementParser.elseClause_return retval = new StatementParser.elseClause_return();
        retval.start = input.LT(1);

        int elseClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ELSE339=null;
        StatementParser.expr_return expr340 =null;


        CommonTree ELSE339_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:497:5: ( ELSE expr -> expr )
            // com/facebook/presto/sql/parser/Statement.g:497:7: ELSE expr
            {
            ELSE339=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseClause4437); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE339);


            pushFollow(FOLLOW_expr_in_elseClause4439);
            expr340=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr340.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 497:17: -> expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, elseClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elseClause"


    public static class over_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "over"
    // com/facebook/presto/sql/parser/Statement.g:500:1: over : OVER '(' window ')' -> window ;
    public final StatementParser.over_return over() throws RecognitionException {
        StatementParser.over_return retval = new StatementParser.over_return();
        retval.start = input.LT(1);

        int over_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OVER341=null;
        Token char_literal342=null;
        Token char_literal344=null;
        StatementParser.window_return window343 =null;


        CommonTree OVER341_tree=null;
        CommonTree char_literal342_tree=null;
        CommonTree char_literal344_tree=null;
        RewriteRuleTokenStream stream_OVER=new RewriteRuleTokenStream(adaptor,"token OVER");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_window=new RewriteRuleSubtreeStream(adaptor,"rule window");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:501:5: ( OVER '(' window ')' -> window )
            // com/facebook/presto/sql/parser/Statement.g:501:7: OVER '(' window ')'
            {
            OVER341=(Token)match(input,OVER,FOLLOW_OVER_in_over4460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OVER.add(OVER341);


            char_literal342=(Token)match(input,200,FOLLOW_200_in_over4462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal342);


            pushFollow(FOLLOW_window_in_over4464);
            window343=window();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_window.add(window343.getTree());

            char_literal344=(Token)match(input,201,FOLLOW_201_in_over4466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal344);


            // AST REWRITE
            // elements: window
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 501:27: -> window
            {
                adaptor.addChild(root_0, stream_window.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, over_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "over"


    public static class window_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window"
    // com/facebook/presto/sql/parser/Statement.g:504:1: window : (p= windowPartition )? (o= orderClause )? (f= windowFrame )? -> ^( WINDOW ( $p)? ( $o)? ( $f)? ) ;
    public final StatementParser.window_return window() throws RecognitionException {
        StatementParser.window_return retval = new StatementParser.window_return();
        retval.start = input.LT(1);

        int window_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.windowPartition_return p =null;

        StatementParser.orderClause_return o =null;

        StatementParser.windowFrame_return f =null;


        RewriteRuleSubtreeStream stream_orderClause=new RewriteRuleSubtreeStream(adaptor,"rule orderClause");
        RewriteRuleSubtreeStream stream_windowPartition=new RewriteRuleSubtreeStream(adaptor,"rule windowPartition");
        RewriteRuleSubtreeStream stream_windowFrame=new RewriteRuleSubtreeStream(adaptor,"rule windowFrame");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:505:5: ( (p= windowPartition )? (o= orderClause )? (f= windowFrame )? -> ^( WINDOW ( $p)? ( $o)? ( $f)? ) )
            // com/facebook/presto/sql/parser/Statement.g:505:7: (p= windowPartition )? (o= orderClause )? (f= windowFrame )?
            {
            // com/facebook/presto/sql/parser/Statement.g:505:8: (p= windowPartition )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case PARTITION:
                    {
                    alt87=1;
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:505:8: p= windowPartition
                    {
                    pushFollow(FOLLOW_windowPartition_in_window4489);
                    p=windowPartition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowPartition.add(p.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:505:27: (o= orderClause )?
            int alt88=2;
            switch ( input.LA(1) ) {
                case ORDER:
                    {
                    alt88=1;
                    }
                    break;
            }

            switch (alt88) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:505:27: o= orderClause
                    {
                    pushFollow(FOLLOW_orderClause_in_window4494);
                    o=orderClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderClause.add(o.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:505:42: (f= windowFrame )?
            int alt89=2;
            switch ( input.LA(1) ) {
                case RANGE:
                case ROWS:
                    {
                    alt89=1;
                    }
                    break;
            }

            switch (alt89) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:505:42: f= windowFrame
                    {
                    pushFollow(FOLLOW_windowFrame_in_window4499);
                    f=windowFrame();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowFrame.add(f.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: o, p, f
            // token labels: 
            // rule labels: f, retval, p, o
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);
            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 505:56: -> ^( WINDOW ( $p)? ( $o)? ( $f)? )
            {
                // com/facebook/presto/sql/parser/Statement.g:505:59: ^( WINDOW ( $p)? ( $o)? ( $f)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WINDOW, "WINDOW")
                , root_1);

                // com/facebook/presto/sql/parser/Statement.g:505:69: ( $p)?
                if ( stream_p.hasNext() ) {
                    adaptor.addChild(root_1, stream_p.nextTree());

                }
                stream_p.reset();

                // com/facebook/presto/sql/parser/Statement.g:505:73: ( $o)?
                if ( stream_o.hasNext() ) {
                    adaptor.addChild(root_1, stream_o.nextTree());

                }
                stream_o.reset();

                // com/facebook/presto/sql/parser/Statement.g:505:77: ( $f)?
                if ( stream_f.hasNext() ) {
                    adaptor.addChild(root_1, stream_f.nextTree());

                }
                stream_f.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, window_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "window"


    public static class windowPartition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "windowPartition"
    // com/facebook/presto/sql/parser/Statement.g:508:1: windowPartition : PARTITION BY expr ( ',' expr )* -> ^( PARTITION_BY ( expr )+ ) ;
    public final StatementParser.windowPartition_return windowPartition() throws RecognitionException {
        StatementParser.windowPartition_return retval = new StatementParser.windowPartition_return();
        retval.start = input.LT(1);

        int windowPartition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token PARTITION345=null;
        Token BY346=null;
        Token char_literal348=null;
        StatementParser.expr_return expr347 =null;

        StatementParser.expr_return expr349 =null;


        CommonTree PARTITION345_tree=null;
        CommonTree BY346_tree=null;
        CommonTree char_literal348_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_PARTITION=new RewriteRuleTokenStream(adaptor,"token PARTITION");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:509:5: ( PARTITION BY expr ( ',' expr )* -> ^( PARTITION_BY ( expr )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:509:7: PARTITION BY expr ( ',' expr )*
            {
            PARTITION345=(Token)match(input,PARTITION,FOLLOW_PARTITION_in_windowPartition4535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PARTITION.add(PARTITION345);


            BY346=(Token)match(input,BY,FOLLOW_BY_in_windowPartition4537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BY.add(BY346);


            pushFollow(FOLLOW_expr_in_windowPartition4539);
            expr347=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr347.getTree());

            // com/facebook/presto/sql/parser/Statement.g:509:25: ( ',' expr )*
            loop90:
            do {
                int alt90=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt90=1;
                    }
                    break;

                }

                switch (alt90) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:509:26: ',' expr
            	    {
            	    char_literal348=(Token)match(input,204,FOLLOW_204_in_windowPartition4542); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal348);


            	    pushFollow(FOLLOW_expr_in_windowPartition4544);
            	    expr349=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr349.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 509:37: -> ^( PARTITION_BY ( expr )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:509:40: ^( PARTITION_BY ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARTITION_BY, "PARTITION_BY")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, windowPartition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "windowPartition"


    public static class windowFrame_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "windowFrame"
    // com/facebook/presto/sql/parser/Statement.g:512:1: windowFrame : ( RANGE frameBound -> ^( RANGE frameBound ) | ROWS frameBound -> ^( ROWS frameBound ) | RANGE BETWEEN frameBound AND frameBound -> ^( RANGE frameBound frameBound ) | ROWS BETWEEN frameBound AND frameBound -> ^( ROWS frameBound frameBound ) );
    public final StatementParser.windowFrame_return windowFrame() throws RecognitionException {
        StatementParser.windowFrame_return retval = new StatementParser.windowFrame_return();
        retval.start = input.LT(1);

        int windowFrame_StartIndex = input.index();

        CommonTree root_0 = null;

        Token RANGE350=null;
        Token ROWS352=null;
        Token RANGE354=null;
        Token BETWEEN355=null;
        Token AND357=null;
        Token ROWS359=null;
        Token BETWEEN360=null;
        Token AND362=null;
        StatementParser.frameBound_return frameBound351 =null;

        StatementParser.frameBound_return frameBound353 =null;

        StatementParser.frameBound_return frameBound356 =null;

        StatementParser.frameBound_return frameBound358 =null;

        StatementParser.frameBound_return frameBound361 =null;

        StatementParser.frameBound_return frameBound363 =null;


        CommonTree RANGE350_tree=null;
        CommonTree ROWS352_tree=null;
        CommonTree RANGE354_tree=null;
        CommonTree BETWEEN355_tree=null;
        CommonTree AND357_tree=null;
        CommonTree ROWS359_tree=null;
        CommonTree BETWEEN360_tree=null;
        CommonTree AND362_tree=null;
        RewriteRuleTokenStream stream_ROWS=new RewriteRuleTokenStream(adaptor,"token ROWS");
        RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleSubtreeStream stream_frameBound=new RewriteRuleSubtreeStream(adaptor,"rule frameBound");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:513:5: ( RANGE frameBound -> ^( RANGE frameBound ) | ROWS frameBound -> ^( ROWS frameBound ) | RANGE BETWEEN frameBound AND frameBound -> ^( RANGE frameBound frameBound ) | ROWS BETWEEN frameBound AND frameBound -> ^( ROWS frameBound frameBound ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case RANGE:
                {
                switch ( input.LA(2) ) {
                case BETWEEN:
                    {
                    alt91=3;
                    }
                    break;
                case ALIAS:
                case BERNOULLI:
                case CASE:
                case CAST:
                case CATALOGS:
                case COALESCE:
                case COLUMNS:
                case CURRENT:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case DATE:
                case DAY:
                case DECIMAL_VALUE:
                case DISTRIBUTED:
                case EXISTS:
                case EXPLAIN:
                case EXTRACT:
                case FALSE:
                case FOLLOWING:
                case FORMAT:
                case FUNCTIONS:
                case GRAPHVIZ:
                case HOUR:
                case IDENT:
                case IF:
                case INTEGER_VALUE:
                case INTERVAL:
                case LOGICAL:
                case MATERIALIZED:
                case MINUTE:
                case MONTH:
                case NOT:
                case NULL:
                case NULLIF:
                case OVER:
                case PARTITION:
                case PARTITIONS:
                case PRECEDING:
                case QUOTED_IDENT:
                case RANGE:
                case REFRESH:
                case ROW:
                case ROWS:
                case SCHEMAS:
                case SECOND:
                case SHOW:
                case STRING:
                case SUBSTRING:
                case SYSTEM:
                case TABLES:
                case TABLESAMPLE:
                case TEXT:
                case TIME:
                case TIMESTAMP:
                case TRUE:
                case TYPE:
                case UNBOUNDED:
                case VIEW:
                case YEAR:
                case 200:
                case 203:
                case 205:
                    {
                    alt91=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;

                }

                }
                break;
            case ROWS:
                {
                switch ( input.LA(2) ) {
                case BETWEEN:
                    {
                    alt91=4;
                    }
                    break;
                case ALIAS:
                case BERNOULLI:
                case CASE:
                case CAST:
                case CATALOGS:
                case COALESCE:
                case COLUMNS:
                case CURRENT:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case DATE:
                case DAY:
                case DECIMAL_VALUE:
                case DISTRIBUTED:
                case EXISTS:
                case EXPLAIN:
                case EXTRACT:
                case FALSE:
                case FOLLOWING:
                case FORMAT:
                case FUNCTIONS:
                case GRAPHVIZ:
                case HOUR:
                case IDENT:
                case IF:
                case INTEGER_VALUE:
                case INTERVAL:
                case LOGICAL:
                case MATERIALIZED:
                case MINUTE:
                case MONTH:
                case NOT:
                case NULL:
                case NULLIF:
                case OVER:
                case PARTITION:
                case PARTITIONS:
                case PRECEDING:
                case QUOTED_IDENT:
                case RANGE:
                case REFRESH:
                case ROW:
                case ROWS:
                case SCHEMAS:
                case SECOND:
                case SHOW:
                case STRING:
                case SUBSTRING:
                case SYSTEM:
                case TABLES:
                case TABLESAMPLE:
                case TEXT:
                case TIME:
                case TIMESTAMP:
                case TRUE:
                case TYPE:
                case UNBOUNDED:
                case VIEW:
                case YEAR:
                case 200:
                case 203:
                case 205:
                    {
                    alt91=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }

            switch (alt91) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:513:7: RANGE frameBound
                    {
                    RANGE350=(Token)match(input,RANGE,FOLLOW_RANGE_in_windowFrame4572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RANGE.add(RANGE350);


                    pushFollow(FOLLOW_frameBound_in_windowFrame4574);
                    frameBound351=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_frameBound.add(frameBound351.getTree());

                    // AST REWRITE
                    // elements: RANGE, frameBound
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 513:47: -> ^( RANGE frameBound )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:513:50: ^( RANGE frameBound )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_RANGE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_frameBound.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:514:7: ROWS frameBound
                    {
                    ROWS352=(Token)match(input,ROWS,FOLLOW_ROWS_in_windowFrame4613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROWS.add(ROWS352);


                    pushFollow(FOLLOW_frameBound_in_windowFrame4615);
                    frameBound353=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_frameBound.add(frameBound353.getTree());

                    // AST REWRITE
                    // elements: ROWS, frameBound
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 514:47: -> ^( ROWS frameBound )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:514:50: ^( ROWS frameBound )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ROWS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_frameBound.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:515:7: RANGE BETWEEN frameBound AND frameBound
                    {
                    RANGE354=(Token)match(input,RANGE,FOLLOW_RANGE_in_windowFrame4655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RANGE.add(RANGE354);


                    BETWEEN355=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_windowFrame4657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BETWEEN.add(BETWEEN355);


                    pushFollow(FOLLOW_frameBound_in_windowFrame4659);
                    frameBound356=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_frameBound.add(frameBound356.getTree());

                    AND357=(Token)match(input,AND,FOLLOW_AND_in_windowFrame4661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND357);


                    pushFollow(FOLLOW_frameBound_in_windowFrame4663);
                    frameBound358=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_frameBound.add(frameBound358.getTree());

                    // AST REWRITE
                    // elements: frameBound, RANGE, frameBound
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 515:47: -> ^( RANGE frameBound frameBound )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:515:50: ^( RANGE frameBound frameBound )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_RANGE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_frameBound.nextTree());

                        adaptor.addChild(root_1, stream_frameBound.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:516:7: ROWS BETWEEN frameBound AND frameBound
                    {
                    ROWS359=(Token)match(input,ROWS,FOLLOW_ROWS_in_windowFrame4681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROWS.add(ROWS359);


                    BETWEEN360=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_windowFrame4683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BETWEEN.add(BETWEEN360);


                    pushFollow(FOLLOW_frameBound_in_windowFrame4685);
                    frameBound361=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_frameBound.add(frameBound361.getTree());

                    AND362=(Token)match(input,AND,FOLLOW_AND_in_windowFrame4687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND362);


                    pushFollow(FOLLOW_frameBound_in_windowFrame4689);
                    frameBound363=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_frameBound.add(frameBound363.getTree());

                    // AST REWRITE
                    // elements: frameBound, frameBound, ROWS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 516:47: -> ^( ROWS frameBound frameBound )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:516:50: ^( ROWS frameBound frameBound )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ROWS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_frameBound.nextTree());

                        adaptor.addChild(root_1, stream_frameBound.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, windowFrame_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "windowFrame"


    public static class frameBound_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frameBound"
    // com/facebook/presto/sql/parser/Statement.g:519:1: frameBound : ( UNBOUNDED PRECEDING -> UNBOUNDED_PRECEDING | UNBOUNDED FOLLOWING -> UNBOUNDED_FOLLOWING | CURRENT ROW -> CURRENT_ROW | expr ( PRECEDING -> ^( PRECEDING expr ) | FOLLOWING -> ^( FOLLOWING expr ) ) );
    public final StatementParser.frameBound_return frameBound() throws RecognitionException {
        StatementParser.frameBound_return retval = new StatementParser.frameBound_return();
        retval.start = input.LT(1);

        int frameBound_StartIndex = input.index();

        CommonTree root_0 = null;

        Token UNBOUNDED364=null;
        Token PRECEDING365=null;
        Token UNBOUNDED366=null;
        Token FOLLOWING367=null;
        Token CURRENT368=null;
        Token ROW369=null;
        Token PRECEDING371=null;
        Token FOLLOWING372=null;
        StatementParser.expr_return expr370 =null;


        CommonTree UNBOUNDED364_tree=null;
        CommonTree PRECEDING365_tree=null;
        CommonTree UNBOUNDED366_tree=null;
        CommonTree FOLLOWING367_tree=null;
        CommonTree CURRENT368_tree=null;
        CommonTree ROW369_tree=null;
        CommonTree PRECEDING371_tree=null;
        CommonTree FOLLOWING372_tree=null;
        RewriteRuleTokenStream stream_ROW=new RewriteRuleTokenStream(adaptor,"token ROW");
        RewriteRuleTokenStream stream_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token FOLLOWING");
        RewriteRuleTokenStream stream_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token UNBOUNDED");
        RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");
        RewriteRuleTokenStream stream_PRECEDING=new RewriteRuleTokenStream(adaptor,"token PRECEDING");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:520:5: ( UNBOUNDED PRECEDING -> UNBOUNDED_PRECEDING | UNBOUNDED FOLLOWING -> UNBOUNDED_FOLLOWING | CURRENT ROW -> CURRENT_ROW | expr ( PRECEDING -> ^( PRECEDING expr ) | FOLLOWING -> ^( FOLLOWING expr ) ) )
            int alt93=4;
            switch ( input.LA(1) ) {
            case UNBOUNDED:
                {
                switch ( input.LA(2) ) {
                case PRECEDING:
                    {
                    alt93=1;
                    }
                    break;
                case FOLLOWING:
                    {
                    alt93=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;

                }

                }
                break;
            case CURRENT:
                {
                switch ( input.LA(2) ) {
                case ROW:
                    {
                    alt93=3;
                    }
                    break;
                case AND:
                case BETWEEN:
                case EQ:
                case FOLLOWING:
                case GT:
                case GTE:
                case IN:
                case IS:
                case LIKE:
                case LT:
                case LTE:
                case NEQ:
                case NOT:
                case OR:
                case PRECEDING:
                case 199:
                case 200:
                case 202:
                case 203:
                case 205:
                case 206:
                case 207:
                case 208:
                    {
                    alt93=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    throw nvae;

                }

                }
                break;
            case ALIAS:
            case BERNOULLI:
            case CASE:
            case CAST:
            case CATALOGS:
            case COALESCE:
            case COLUMNS:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case DATE:
            case DAY:
            case DECIMAL_VALUE:
            case DISTRIBUTED:
            case EXISTS:
            case EXPLAIN:
            case EXTRACT:
            case FALSE:
            case FOLLOWING:
            case FORMAT:
            case FUNCTIONS:
            case GRAPHVIZ:
            case HOUR:
            case IDENT:
            case IF:
            case INTEGER_VALUE:
            case INTERVAL:
            case LOGICAL:
            case MATERIALIZED:
            case MINUTE:
            case MONTH:
            case NOT:
            case NULL:
            case NULLIF:
            case OVER:
            case PARTITION:
            case PARTITIONS:
            case PRECEDING:
            case QUOTED_IDENT:
            case RANGE:
            case REFRESH:
            case ROW:
            case ROWS:
            case SCHEMAS:
            case SECOND:
            case SHOW:
            case STRING:
            case SUBSTRING:
            case SYSTEM:
            case TABLES:
            case TABLESAMPLE:
            case TEXT:
            case TIME:
            case TIMESTAMP:
            case TRUE:
            case TYPE:
            case VIEW:
            case YEAR:
            case 200:
            case 203:
            case 205:
                {
                alt93=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:520:7: UNBOUNDED PRECEDING
                    {
                    UNBOUNDED364=(Token)match(input,UNBOUNDED,FOLLOW_UNBOUNDED_in_frameBound4717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNBOUNDED.add(UNBOUNDED364);


                    PRECEDING365=(Token)match(input,PRECEDING,FOLLOW_PRECEDING_in_frameBound4719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRECEDING.add(PRECEDING365);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 520:27: -> UNBOUNDED_PRECEDING
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(UNBOUNDED_PRECEDING, "UNBOUNDED_PRECEDING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:521:7: UNBOUNDED FOLLOWING
                    {
                    UNBOUNDED366=(Token)match(input,UNBOUNDED,FOLLOW_UNBOUNDED_in_frameBound4731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNBOUNDED.add(UNBOUNDED366);


                    FOLLOWING367=(Token)match(input,FOLLOWING,FOLLOW_FOLLOWING_in_frameBound4733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOLLOWING.add(FOLLOWING367);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 521:27: -> UNBOUNDED_FOLLOWING
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(UNBOUNDED_FOLLOWING, "UNBOUNDED_FOLLOWING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:522:7: CURRENT ROW
                    {
                    CURRENT368=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_frameBound4745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURRENT.add(CURRENT368);


                    ROW369=(Token)match(input,ROW,FOLLOW_ROW_in_frameBound4747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROW.add(ROW369);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 522:27: -> CURRENT_ROW
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(CURRENT_ROW, "CURRENT_ROW")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:523:7: expr ( PRECEDING -> ^( PRECEDING expr ) | FOLLOWING -> ^( FOLLOWING expr ) )
                    {
                    pushFollow(FOLLOW_expr_in_frameBound4767);
                    expr370=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr370.getTree());

                    // com/facebook/presto/sql/parser/Statement.g:524:7: ( PRECEDING -> ^( PRECEDING expr ) | FOLLOWING -> ^( FOLLOWING expr ) )
                    int alt92=2;
                    switch ( input.LA(1) ) {
                    case PRECEDING:
                        {
                        alt92=1;
                        }
                        break;
                    case FOLLOWING:
                        {
                        alt92=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;

                    }

                    switch (alt92) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:524:9: PRECEDING
                            {
                            PRECEDING371=(Token)match(input,PRECEDING,FOLLOW_PRECEDING_in_frameBound4777); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PRECEDING.add(PRECEDING371);


                            // AST REWRITE
                            // elements: PRECEDING, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 524:19: -> ^( PRECEDING expr )
                            {
                                // com/facebook/presto/sql/parser/Statement.g:524:22: ^( PRECEDING expr )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_PRECEDING.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // com/facebook/presto/sql/parser/Statement.g:525:9: FOLLOWING
                            {
                            FOLLOWING372=(Token)match(input,FOLLOWING,FOLLOW_FOLLOWING_in_frameBound4795); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWING.add(FOLLOWING372);


                            // AST REWRITE
                            // elements: FOLLOWING, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 525:19: -> ^( FOLLOWING expr )
                            {
                                // com/facebook/presto/sql/parser/Statement.g:525:22: ^( FOLLOWING expr )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_FOLLOWING.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, frameBound_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "frameBound"


    public static class explainStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explainStmt"
    // com/facebook/presto/sql/parser/Statement.g:529:1: explainStmt : EXPLAIN ( explainOptions )? query -> ^( EXPLAIN ( explainOptions )? query ) ;
    public final StatementParser.explainStmt_return explainStmt() throws RecognitionException {
        StatementParser.explainStmt_return retval = new StatementParser.explainStmt_return();
        retval.start = input.LT(1);

        int explainStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EXPLAIN373=null;
        StatementParser.explainOptions_return explainOptions374 =null;

        StatementParser.query_return query375 =null;


        CommonTree EXPLAIN373_tree=null;
        RewriteRuleTokenStream stream_EXPLAIN=new RewriteRuleTokenStream(adaptor,"token EXPLAIN");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_explainOptions=new RewriteRuleSubtreeStream(adaptor,"rule explainOptions");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:530:5: ( EXPLAIN ( explainOptions )? query -> ^( EXPLAIN ( explainOptions )? query ) )
            // com/facebook/presto/sql/parser/Statement.g:530:7: EXPLAIN ( explainOptions )? query
            {
            EXPLAIN373=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_explainStmt4828); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXPLAIN.add(EXPLAIN373);


            // com/facebook/presto/sql/parser/Statement.g:530:15: ( explainOptions )?
            int alt94=2;
            switch ( input.LA(1) ) {
                case 200:
                    {
                    switch ( input.LA(2) ) {
                        case FORMAT:
                        case TYPE:
                            {
                            alt94=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt94) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:530:15: explainOptions
                    {
                    pushFollow(FOLLOW_explainOptions_in_explainStmt4830);
                    explainOptions374=explainOptions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explainOptions.add(explainOptions374.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_query_in_explainStmt4833);
            query375=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_query.add(query375.getTree());

            // AST REWRITE
            // elements: explainOptions, query, EXPLAIN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 530:37: -> ^( EXPLAIN ( explainOptions )? query )
            {
                // com/facebook/presto/sql/parser/Statement.g:530:40: ^( EXPLAIN ( explainOptions )? query )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EXPLAIN.nextNode()
                , root_1);

                // com/facebook/presto/sql/parser/Statement.g:530:50: ( explainOptions )?
                if ( stream_explainOptions.hasNext() ) {
                    adaptor.addChild(root_1, stream_explainOptions.nextTree());

                }
                stream_explainOptions.reset();

                adaptor.addChild(root_1, stream_query.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, explainStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "explainStmt"


    public static class explainOptions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explainOptions"
    // com/facebook/presto/sql/parser/Statement.g:533:1: explainOptions : '(' explainOption ( ',' explainOption )* ')' -> ^( EXPLAIN_OPTIONS ( explainOption )+ ) ;
    public final StatementParser.explainOptions_return explainOptions() throws RecognitionException {
        StatementParser.explainOptions_return retval = new StatementParser.explainOptions_return();
        retval.start = input.LT(1);

        int explainOptions_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal376=null;
        Token char_literal378=null;
        Token char_literal380=null;
        StatementParser.explainOption_return explainOption377 =null;

        StatementParser.explainOption_return explainOption379 =null;


        CommonTree char_literal376_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree char_literal380_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_explainOption=new RewriteRuleSubtreeStream(adaptor,"rule explainOption");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:534:5: ( '(' explainOption ( ',' explainOption )* ')' -> ^( EXPLAIN_OPTIONS ( explainOption )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:534:7: '(' explainOption ( ',' explainOption )* ')'
            {
            char_literal376=(Token)match(input,200,FOLLOW_200_in_explainOptions4861); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal376);


            pushFollow(FOLLOW_explainOption_in_explainOptions4863);
            explainOption377=explainOption();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_explainOption.add(explainOption377.getTree());

            // com/facebook/presto/sql/parser/Statement.g:534:25: ( ',' explainOption )*
            loop95:
            do {
                int alt95=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt95=1;
                    }
                    break;

                }

                switch (alt95) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:534:26: ',' explainOption
            	    {
            	    char_literal378=(Token)match(input,204,FOLLOW_204_in_explainOptions4866); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal378);


            	    pushFollow(FOLLOW_explainOption_in_explainOptions4868);
            	    explainOption379=explainOption();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_explainOption.add(explainOption379.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            char_literal380=(Token)match(input,201,FOLLOW_201_in_explainOptions4872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal380);


            // AST REWRITE
            // elements: explainOption
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 534:50: -> ^( EXPLAIN_OPTIONS ( explainOption )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:534:53: ^( EXPLAIN_OPTIONS ( explainOption )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPLAIN_OPTIONS, "EXPLAIN_OPTIONS")
                , root_1);

                if ( !(stream_explainOption.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_explainOption.hasNext() ) {
                    adaptor.addChild(root_1, stream_explainOption.nextTree());

                }
                stream_explainOption.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, explainOptions_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "explainOptions"


    public static class explainOption_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explainOption"
    // com/facebook/presto/sql/parser/Statement.g:537:1: explainOption : ( FORMAT TEXT -> ^( EXPLAIN_FORMAT TEXT ) | FORMAT GRAPHVIZ -> ^( EXPLAIN_FORMAT GRAPHVIZ ) | TYPE LOGICAL -> ^( EXPLAIN_TYPE LOGICAL ) | TYPE DISTRIBUTED -> ^( EXPLAIN_TYPE DISTRIBUTED ) );
    public final StatementParser.explainOption_return explainOption() throws RecognitionException {
        StatementParser.explainOption_return retval = new StatementParser.explainOption_return();
        retval.start = input.LT(1);

        int explainOption_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FORMAT381=null;
        Token TEXT382=null;
        Token FORMAT383=null;
        Token GRAPHVIZ384=null;
        Token TYPE385=null;
        Token LOGICAL386=null;
        Token TYPE387=null;
        Token DISTRIBUTED388=null;

        CommonTree FORMAT381_tree=null;
        CommonTree TEXT382_tree=null;
        CommonTree FORMAT383_tree=null;
        CommonTree GRAPHVIZ384_tree=null;
        CommonTree TYPE385_tree=null;
        CommonTree LOGICAL386_tree=null;
        CommonTree TYPE387_tree=null;
        CommonTree DISTRIBUTED388_tree=null;
        RewriteRuleTokenStream stream_DISTRIBUTED=new RewriteRuleTokenStream(adaptor,"token DISTRIBUTED");
        RewriteRuleTokenStream stream_LOGICAL=new RewriteRuleTokenStream(adaptor,"token LOGICAL");
        RewriteRuleTokenStream stream_GRAPHVIZ=new RewriteRuleTokenStream(adaptor,"token GRAPHVIZ");
        RewriteRuleTokenStream stream_FORMAT=new RewriteRuleTokenStream(adaptor,"token FORMAT");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:538:5: ( FORMAT TEXT -> ^( EXPLAIN_FORMAT TEXT ) | FORMAT GRAPHVIZ -> ^( EXPLAIN_FORMAT GRAPHVIZ ) | TYPE LOGICAL -> ^( EXPLAIN_TYPE LOGICAL ) | TYPE DISTRIBUTED -> ^( EXPLAIN_TYPE DISTRIBUTED ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case FORMAT:
                {
                switch ( input.LA(2) ) {
                case TEXT:
                    {
                    alt96=1;
                    }
                    break;
                case GRAPHVIZ:
                    {
                    alt96=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;

                }

                }
                break;
            case TYPE:
                {
                switch ( input.LA(2) ) {
                case LOGICAL:
                    {
                    alt96=3;
                    }
                    break;
                case DISTRIBUTED:
                    {
                    alt96=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }

            switch (alt96) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:538:7: FORMAT TEXT
                    {
                    FORMAT381=(Token)match(input,FORMAT,FOLLOW_FORMAT_in_explainOption4898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FORMAT.add(FORMAT381);


                    TEXT382=(Token)match(input,TEXT,FOLLOW_TEXT_in_explainOption4900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEXT.add(TEXT382);


                    // AST REWRITE
                    // elements: TEXT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 538:24: -> ^( EXPLAIN_FORMAT TEXT )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:538:27: ^( EXPLAIN_FORMAT TEXT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPLAIN_FORMAT, "EXPLAIN_FORMAT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TEXT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:539:7: FORMAT GRAPHVIZ
                    {
                    FORMAT383=(Token)match(input,FORMAT,FOLLOW_FORMAT_in_explainOption4921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FORMAT.add(FORMAT383);


                    GRAPHVIZ384=(Token)match(input,GRAPHVIZ,FOLLOW_GRAPHVIZ_in_explainOption4923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GRAPHVIZ.add(GRAPHVIZ384);


                    // AST REWRITE
                    // elements: GRAPHVIZ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 539:24: -> ^( EXPLAIN_FORMAT GRAPHVIZ )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:539:27: ^( EXPLAIN_FORMAT GRAPHVIZ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPLAIN_FORMAT, "EXPLAIN_FORMAT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_GRAPHVIZ.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:540:7: TYPE LOGICAL
                    {
                    TYPE385=(Token)match(input,TYPE,FOLLOW_TYPE_in_explainOption4940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE385);


                    LOGICAL386=(Token)match(input,LOGICAL,FOLLOW_LOGICAL_in_explainOption4942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOGICAL.add(LOGICAL386);


                    // AST REWRITE
                    // elements: LOGICAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 540:24: -> ^( EXPLAIN_TYPE LOGICAL )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:540:27: ^( EXPLAIN_TYPE LOGICAL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPLAIN_TYPE, "EXPLAIN_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_LOGICAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:541:7: TYPE DISTRIBUTED
                    {
                    TYPE387=(Token)match(input,TYPE,FOLLOW_TYPE_in_explainOption4962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE387);


                    DISTRIBUTED388=(Token)match(input,DISTRIBUTED,FOLLOW_DISTRIBUTED_in_explainOption4964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DISTRIBUTED.add(DISTRIBUTED388);


                    // AST REWRITE
                    // elements: DISTRIBUTED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 541:24: -> ^( EXPLAIN_TYPE DISTRIBUTED )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:541:27: ^( EXPLAIN_TYPE DISTRIBUTED )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPLAIN_TYPE, "EXPLAIN_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DISTRIBUTED.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, explainOption_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "explainOption"


    public static class showTablesStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showTablesStmt"
    // com/facebook/presto/sql/parser/Statement.g:544:1: showTablesStmt : SHOW TABLES (from= showTablesFrom )? (like= showTablesLike )? -> ^( SHOW_TABLES ( $from)? ( $like)? ) ;
    public final StatementParser.showTablesStmt_return showTablesStmt() throws RecognitionException {
        StatementParser.showTablesStmt_return retval = new StatementParser.showTablesStmt_return();
        retval.start = input.LT(1);

        int showTablesStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SHOW389=null;
        Token TABLES390=null;
        StatementParser.showTablesFrom_return from =null;

        StatementParser.showTablesLike_return like =null;


        CommonTree SHOW389_tree=null;
        CommonTree TABLES390_tree=null;
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_TABLES=new RewriteRuleTokenStream(adaptor,"token TABLES");
        RewriteRuleSubtreeStream stream_showTablesFrom=new RewriteRuleSubtreeStream(adaptor,"rule showTablesFrom");
        RewriteRuleSubtreeStream stream_showTablesLike=new RewriteRuleSubtreeStream(adaptor,"rule showTablesLike");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:545:5: ( SHOW TABLES (from= showTablesFrom )? (like= showTablesLike )? -> ^( SHOW_TABLES ( $from)? ( $like)? ) )
            // com/facebook/presto/sql/parser/Statement.g:545:7: SHOW TABLES (from= showTablesFrom )? (like= showTablesLike )?
            {
            SHOW389=(Token)match(input,SHOW,FOLLOW_SHOW_in_showTablesStmt4989); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW389);


            TABLES390=(Token)match(input,TABLES,FOLLOW_TABLES_in_showTablesStmt4991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLES.add(TABLES390);


            // com/facebook/presto/sql/parser/Statement.g:545:23: (from= showTablesFrom )?
            int alt97=2;
            switch ( input.LA(1) ) {
                case FROM:
                case IN:
                    {
                    alt97=1;
                    }
                    break;
            }

            switch (alt97) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:545:23: from= showTablesFrom
                    {
                    pushFollow(FOLLOW_showTablesFrom_in_showTablesStmt4995);
                    from=showTablesFrom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_showTablesFrom.add(from.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:545:44: (like= showTablesLike )?
            int alt98=2;
            switch ( input.LA(1) ) {
                case LIKE:
                    {
                    alt98=1;
                    }
                    break;
            }

            switch (alt98) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:545:44: like= showTablesLike
                    {
                    pushFollow(FOLLOW_showTablesLike_in_showTablesStmt5000);
                    like=showTablesLike();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_showTablesLike.add(like.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: from, like
            // token labels: 
            // rule labels: retval, from, like
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);
            RewriteRuleSubtreeStream stream_like=new RewriteRuleSubtreeStream(adaptor,"rule like",like!=null?like.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 545:61: -> ^( SHOW_TABLES ( $from)? ( $like)? )
            {
                // com/facebook/presto/sql/parser/Statement.g:545:64: ^( SHOW_TABLES ( $from)? ( $like)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SHOW_TABLES, "SHOW_TABLES")
                , root_1);

                // com/facebook/presto/sql/parser/Statement.g:545:79: ( $from)?
                if ( stream_from.hasNext() ) {
                    adaptor.addChild(root_1, stream_from.nextTree());

                }
                stream_from.reset();

                // com/facebook/presto/sql/parser/Statement.g:545:86: ( $like)?
                if ( stream_like.hasNext() ) {
                    adaptor.addChild(root_1, stream_like.nextTree());

                }
                stream_like.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, showTablesStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showTablesStmt"


    public static class showTablesFrom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showTablesFrom"
    // com/facebook/presto/sql/parser/Statement.g:548:1: showTablesFrom : ( FROM | IN ) qname -> ^( FROM qname ) ;
    public final StatementParser.showTablesFrom_return showTablesFrom() throws RecognitionException {
        StatementParser.showTablesFrom_return retval = new StatementParser.showTablesFrom_return();
        retval.start = input.LT(1);

        int showTablesFrom_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FROM391=null;
        Token IN392=null;
        StatementParser.qname_return qname393 =null;


        CommonTree FROM391_tree=null;
        CommonTree IN392_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:549:5: ( ( FROM | IN ) qname -> ^( FROM qname ) )
            // com/facebook/presto/sql/parser/Statement.g:549:7: ( FROM | IN ) qname
            {
            // com/facebook/presto/sql/parser/Statement.g:549:7: ( FROM | IN )
            int alt99=2;
            switch ( input.LA(1) ) {
            case FROM:
                {
                alt99=1;
                }
                break;
            case IN:
                {
                alt99=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:549:8: FROM
                    {
                    FROM391=(Token)match(input,FROM,FOLLOW_FROM_in_showTablesFrom5033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM391);


                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:549:15: IN
                    {
                    IN392=(Token)match(input,IN,FOLLOW_IN_in_showTablesFrom5037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN392);


                    }
                    break;

            }


            pushFollow(FOLLOW_qname_in_showTablesFrom5040);
            qname393=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname393.getTree());

            // AST REWRITE
            // elements: FROM, qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 549:25: -> ^( FROM qname )
            {
                // com/facebook/presto/sql/parser/Statement.g:549:28: ^( FROM qname )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FROM.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, showTablesFrom_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showTablesFrom"


    public static class showTablesLike_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showTablesLike"
    // com/facebook/presto/sql/parser/Statement.g:552:1: showTablesLike : LIKE s= STRING -> ^( LIKE $s) ;
    public final StatementParser.showTablesLike_return showTablesLike() throws RecognitionException {
        StatementParser.showTablesLike_return retval = new StatementParser.showTablesLike_return();
        retval.start = input.LT(1);

        int showTablesLike_StartIndex = input.index();

        CommonTree root_0 = null;

        Token s=null;
        Token LIKE394=null;

        CommonTree s_tree=null;
        CommonTree LIKE394_tree=null;
        RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:553:5: ( LIKE s= STRING -> ^( LIKE $s) )
            // com/facebook/presto/sql/parser/Statement.g:553:7: LIKE s= STRING
            {
            LIKE394=(Token)match(input,LIKE,FOLLOW_LIKE_in_showTablesLike5065); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIKE.add(LIKE394);


            s=(Token)match(input,STRING,FOLLOW_STRING_in_showTablesLike5069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(s);


            // AST REWRITE
            // elements: LIKE, s
            // token labels: s
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 553:21: -> ^( LIKE $s)
            {
                // com/facebook/presto/sql/parser/Statement.g:553:24: ^( LIKE $s)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_LIKE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_s.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, showTablesLike_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showTablesLike"


    public static class showSchemasStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showSchemasStmt"
    // com/facebook/presto/sql/parser/Statement.g:556:1: showSchemasStmt : SHOW SCHEMAS -> SHOW_SCHEMAS ;
    public final StatementParser.showSchemasStmt_return showSchemasStmt() throws RecognitionException {
        StatementParser.showSchemasStmt_return retval = new StatementParser.showSchemasStmt_return();
        retval.start = input.LT(1);

        int showSchemasStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SHOW395=null;
        Token SCHEMAS396=null;

        CommonTree SHOW395_tree=null;
        CommonTree SCHEMAS396_tree=null;
        RewriteRuleTokenStream stream_SCHEMAS=new RewriteRuleTokenStream(adaptor,"token SCHEMAS");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:557:5: ( SHOW SCHEMAS -> SHOW_SCHEMAS )
            // com/facebook/presto/sql/parser/Statement.g:557:7: SHOW SCHEMAS
            {
            SHOW395=(Token)match(input,SHOW,FOLLOW_SHOW_in_showSchemasStmt5095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW395);


            SCHEMAS396=(Token)match(input,SCHEMAS,FOLLOW_SCHEMAS_in_showSchemasStmt5097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SCHEMAS.add(SCHEMAS396);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 557:20: -> SHOW_SCHEMAS
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(SHOW_SCHEMAS, "SHOW_SCHEMAS")
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, showSchemasStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showSchemasStmt"


    public static class showCatalogsStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showCatalogsStmt"
    // com/facebook/presto/sql/parser/Statement.g:560:1: showCatalogsStmt : SHOW CATALOGS -> SHOW_CATALOGS ;
    public final StatementParser.showCatalogsStmt_return showCatalogsStmt() throws RecognitionException {
        StatementParser.showCatalogsStmt_return retval = new StatementParser.showCatalogsStmt_return();
        retval.start = input.LT(1);

        int showCatalogsStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SHOW397=null;
        Token CATALOGS398=null;

        CommonTree SHOW397_tree=null;
        CommonTree CATALOGS398_tree=null;
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_CATALOGS=new RewriteRuleTokenStream(adaptor,"token CATALOGS");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:561:5: ( SHOW CATALOGS -> SHOW_CATALOGS )
            // com/facebook/presto/sql/parser/Statement.g:561:7: SHOW CATALOGS
            {
            SHOW397=(Token)match(input,SHOW,FOLLOW_SHOW_in_showCatalogsStmt5118); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW397);


            CATALOGS398=(Token)match(input,CATALOGS,FOLLOW_CATALOGS_in_showCatalogsStmt5120); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATALOGS.add(CATALOGS398);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 561:21: -> SHOW_CATALOGS
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(SHOW_CATALOGS, "SHOW_CATALOGS")
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, showCatalogsStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showCatalogsStmt"


    public static class showColumnsStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showColumnsStmt"
    // com/facebook/presto/sql/parser/Statement.g:564:1: showColumnsStmt : ( SHOW COLUMNS ( FROM | IN ) qname -> ^( SHOW_COLUMNS qname ) | DESCRIBE qname -> ^( SHOW_COLUMNS qname ) | DESC qname -> ^( SHOW_COLUMNS qname ) );
    public final StatementParser.showColumnsStmt_return showColumnsStmt() throws RecognitionException {
        StatementParser.showColumnsStmt_return retval = new StatementParser.showColumnsStmt_return();
        retval.start = input.LT(1);

        int showColumnsStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SHOW399=null;
        Token COLUMNS400=null;
        Token FROM401=null;
        Token IN402=null;
        Token DESCRIBE404=null;
        Token DESC406=null;
        StatementParser.qname_return qname403 =null;

        StatementParser.qname_return qname405 =null;

        StatementParser.qname_return qname407 =null;


        CommonTree SHOW399_tree=null;
        CommonTree COLUMNS400_tree=null;
        CommonTree FROM401_tree=null;
        CommonTree IN402_tree=null;
        CommonTree DESCRIBE404_tree=null;
        CommonTree DESC406_tree=null;
        RewriteRuleTokenStream stream_COLUMNS=new RewriteRuleTokenStream(adaptor,"token COLUMNS");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:565:5: ( SHOW COLUMNS ( FROM | IN ) qname -> ^( SHOW_COLUMNS qname ) | DESCRIBE qname -> ^( SHOW_COLUMNS qname ) | DESC qname -> ^( SHOW_COLUMNS qname ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case SHOW:
                {
                alt101=1;
                }
                break;
            case DESCRIBE:
                {
                alt101=2;
                }
                break;
            case DESC:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }

            switch (alt101) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:565:7: SHOW COLUMNS ( FROM | IN ) qname
                    {
                    SHOW399=(Token)match(input,SHOW,FOLLOW_SHOW_in_showColumnsStmt5141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW399);


                    COLUMNS400=(Token)match(input,COLUMNS,FOLLOW_COLUMNS_in_showColumnsStmt5143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMNS.add(COLUMNS400);


                    // com/facebook/presto/sql/parser/Statement.g:565:20: ( FROM | IN )
                    int alt100=2;
                    switch ( input.LA(1) ) {
                    case FROM:
                        {
                        alt100=1;
                        }
                        break;
                    case IN:
                        {
                        alt100=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;

                    }

                    switch (alt100) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:565:21: FROM
                            {
                            FROM401=(Token)match(input,FROM,FOLLOW_FROM_in_showColumnsStmt5146); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FROM.add(FROM401);


                            }
                            break;
                        case 2 :
                            // com/facebook/presto/sql/parser/Statement.g:565:28: IN
                            {
                            IN402=(Token)match(input,IN,FOLLOW_IN_in_showColumnsStmt5150); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN402);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_qname_in_showColumnsStmt5153);
                    qname403=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qname.add(qname403.getTree());

                    // AST REWRITE
                    // elements: qname
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 565:38: -> ^( SHOW_COLUMNS qname )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:565:41: ^( SHOW_COLUMNS qname )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SHOW_COLUMNS, "SHOW_COLUMNS")
                        , root_1);

                        adaptor.addChild(root_1, stream_qname.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:566:7: DESCRIBE qname
                    {
                    DESCRIBE404=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_showColumnsStmt5169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE404);


                    pushFollow(FOLLOW_qname_in_showColumnsStmt5171);
                    qname405=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qname.add(qname405.getTree());

                    // AST REWRITE
                    // elements: qname
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 566:38: -> ^( SHOW_COLUMNS qname )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:566:41: ^( SHOW_COLUMNS qname )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SHOW_COLUMNS, "SHOW_COLUMNS")
                        , root_1);

                        adaptor.addChild(root_1, stream_qname.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:567:7: DESC qname
                    {
                    DESC406=(Token)match(input,DESC,FOLLOW_DESC_in_showColumnsStmt5203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESC.add(DESC406);


                    pushFollow(FOLLOW_qname_in_showColumnsStmt5205);
                    qname407=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qname.add(qname407.getTree());

                    // AST REWRITE
                    // elements: qname
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 567:38: -> ^( SHOW_COLUMNS qname )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:567:41: ^( SHOW_COLUMNS qname )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SHOW_COLUMNS, "SHOW_COLUMNS")
                        , root_1);

                        adaptor.addChild(root_1, stream_qname.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, showColumnsStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showColumnsStmt"


    public static class showPartitionsStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showPartitionsStmt"
    // com/facebook/presto/sql/parser/Statement.g:570:1: showPartitionsStmt : SHOW PARTITIONS ( FROM | IN ) qname (w= whereClause )? (o= orderClause )? (l= limitClause )? -> ^( SHOW_PARTITIONS qname ( $w)? ( $o)? ( $l)? ) ;
    public final StatementParser.showPartitionsStmt_return showPartitionsStmt() throws RecognitionException {
        StatementParser.showPartitionsStmt_return retval = new StatementParser.showPartitionsStmt_return();
        retval.start = input.LT(1);

        int showPartitionsStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SHOW408=null;
        Token PARTITIONS409=null;
        Token FROM410=null;
        Token IN411=null;
        StatementParser.whereClause_return w =null;

        StatementParser.orderClause_return o =null;

        StatementParser.limitClause_return l =null;

        StatementParser.qname_return qname412 =null;


        CommonTree SHOW408_tree=null;
        CommonTree PARTITIONS409_tree=null;
        CommonTree FROM410_tree=null;
        CommonTree IN411_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_PARTITIONS=new RewriteRuleTokenStream(adaptor,"token PARTITIONS");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        RewriteRuleSubtreeStream stream_orderClause=new RewriteRuleSubtreeStream(adaptor,"rule orderClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:571:5: ( SHOW PARTITIONS ( FROM | IN ) qname (w= whereClause )? (o= orderClause )? (l= limitClause )? -> ^( SHOW_PARTITIONS qname ( $w)? ( $o)? ( $l)? ) )
            // com/facebook/presto/sql/parser/Statement.g:571:7: SHOW PARTITIONS ( FROM | IN ) qname (w= whereClause )? (o= orderClause )? (l= limitClause )?
            {
            SHOW408=(Token)match(input,SHOW,FOLLOW_SHOW_in_showPartitionsStmt5250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW408);


            PARTITIONS409=(Token)match(input,PARTITIONS,FOLLOW_PARTITIONS_in_showPartitionsStmt5252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PARTITIONS.add(PARTITIONS409);


            // com/facebook/presto/sql/parser/Statement.g:571:23: ( FROM | IN )
            int alt102=2;
            switch ( input.LA(1) ) {
            case FROM:
                {
                alt102=1;
                }
                break;
            case IN:
                {
                alt102=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:571:24: FROM
                    {
                    FROM410=(Token)match(input,FROM,FOLLOW_FROM_in_showPartitionsStmt5255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM410);


                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:571:31: IN
                    {
                    IN411=(Token)match(input,IN,FOLLOW_IN_in_showPartitionsStmt5259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN411);


                    }
                    break;

            }


            pushFollow(FOLLOW_qname_in_showPartitionsStmt5262);
            qname412=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname412.getTree());

            // com/facebook/presto/sql/parser/Statement.g:571:42: (w= whereClause )?
            int alt103=2;
            switch ( input.LA(1) ) {
                case WHERE:
                    {
                    alt103=1;
                    }
                    break;
            }

            switch (alt103) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:571:42: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_showPartitionsStmt5266);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(w.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:571:57: (o= orderClause )?
            int alt104=2;
            switch ( input.LA(1) ) {
                case ORDER:
                    {
                    alt104=1;
                    }
                    break;
            }

            switch (alt104) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:571:57: o= orderClause
                    {
                    pushFollow(FOLLOW_orderClause_in_showPartitionsStmt5271);
                    o=orderClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderClause.add(o.getTree());

                    }
                    break;

            }


            // com/facebook/presto/sql/parser/Statement.g:571:72: (l= limitClause )?
            int alt105=2;
            switch ( input.LA(1) ) {
                case LIMIT:
                    {
                    alt105=1;
                    }
                    break;
            }

            switch (alt105) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:571:72: l= limitClause
                    {
                    pushFollow(FOLLOW_limitClause_in_showPartitionsStmt5276);
                    l=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_limitClause.add(l.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: l, o, qname, w
            // token labels: 
            // rule labels: w, retval, o, l
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_w=new RewriteRuleSubtreeStream(adaptor,"rule w",w!=null?w.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);
            RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 571:86: -> ^( SHOW_PARTITIONS qname ( $w)? ( $o)? ( $l)? )
            {
                // com/facebook/presto/sql/parser/Statement.g:571:89: ^( SHOW_PARTITIONS qname ( $w)? ( $o)? ( $l)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SHOW_PARTITIONS, "SHOW_PARTITIONS")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:571:114: ( $w)?
                if ( stream_w.hasNext() ) {
                    adaptor.addChild(root_1, stream_w.nextTree());

                }
                stream_w.reset();

                // com/facebook/presto/sql/parser/Statement.g:571:118: ( $o)?
                if ( stream_o.hasNext() ) {
                    adaptor.addChild(root_1, stream_o.nextTree());

                }
                stream_o.reset();

                // com/facebook/presto/sql/parser/Statement.g:571:122: ( $l)?
                if ( stream_l.hasNext() ) {
                    adaptor.addChild(root_1, stream_l.nextTree());

                }
                stream_l.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 82, showPartitionsStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showPartitionsStmt"


    public static class showFunctionsStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showFunctionsStmt"
    // com/facebook/presto/sql/parser/Statement.g:574:1: showFunctionsStmt : SHOW FUNCTIONS -> SHOW_FUNCTIONS ;
    public final StatementParser.showFunctionsStmt_return showFunctionsStmt() throws RecognitionException {
        StatementParser.showFunctionsStmt_return retval = new StatementParser.showFunctionsStmt_return();
        retval.start = input.LT(1);

        int showFunctionsStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SHOW413=null;
        Token FUNCTIONS414=null;

        CommonTree SHOW413_tree=null;
        CommonTree FUNCTIONS414_tree=null;
        RewriteRuleTokenStream stream_FUNCTIONS=new RewriteRuleTokenStream(adaptor,"token FUNCTIONS");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:575:5: ( SHOW FUNCTIONS -> SHOW_FUNCTIONS )
            // com/facebook/presto/sql/parser/Statement.g:575:7: SHOW FUNCTIONS
            {
            SHOW413=(Token)match(input,SHOW,FOLLOW_SHOW_in_showFunctionsStmt5314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW413);


            FUNCTIONS414=(Token)match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_showFunctionsStmt5316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTIONS.add(FUNCTIONS414);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 575:22: -> SHOW_FUNCTIONS
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(SHOW_FUNCTIONS, "SHOW_FUNCTIONS")
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 83, showFunctionsStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "showFunctionsStmt"


    public static class dropTableStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropTableStmt"
    // com/facebook/presto/sql/parser/Statement.g:578:1: dropTableStmt : DROP TABLE qname -> ^( DROP_TABLE qname ) ;
    public final StatementParser.dropTableStmt_return dropTableStmt() throws RecognitionException {
        StatementParser.dropTableStmt_return retval = new StatementParser.dropTableStmt_return();
        retval.start = input.LT(1);

        int dropTableStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DROP415=null;
        Token TABLE416=null;
        StatementParser.qname_return qname417 =null;


        CommonTree DROP415_tree=null;
        CommonTree TABLE416_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:579:5: ( DROP TABLE qname -> ^( DROP_TABLE qname ) )
            // com/facebook/presto/sql/parser/Statement.g:579:7: DROP TABLE qname
            {
            DROP415=(Token)match(input,DROP,FOLLOW_DROP_in_dropTableStmt5337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP415);


            TABLE416=(Token)match(input,TABLE,FOLLOW_TABLE_in_dropTableStmt5339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE416);


            pushFollow(FOLLOW_qname_in_dropTableStmt5341);
            qname417=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname417.getTree());

            // AST REWRITE
            // elements: qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 579:24: -> ^( DROP_TABLE qname )
            {
                // com/facebook/presto/sql/parser/Statement.g:579:27: ^( DROP_TABLE qname )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DROP_TABLE, "DROP_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 84, dropTableStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dropTableStmt"


    public static class createMaterializedViewStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createMaterializedViewStmt"
    // com/facebook/presto/sql/parser/Statement.g:582:1: createMaterializedViewStmt : CREATE MATERIALIZED VIEW qname (r= viewRefresh )? AS s= restrictedSelectStmt -> ^( CREATE_MATERIALIZED_VIEW qname ( $r)? $s) ;
    public final StatementParser.createMaterializedViewStmt_return createMaterializedViewStmt() throws RecognitionException {
        StatementParser.createMaterializedViewStmt_return retval = new StatementParser.createMaterializedViewStmt_return();
        retval.start = input.LT(1);

        int createMaterializedViewStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CREATE418=null;
        Token MATERIALIZED419=null;
        Token VIEW420=null;
        Token AS422=null;
        StatementParser.viewRefresh_return r =null;

        StatementParser.restrictedSelectStmt_return s =null;

        StatementParser.qname_return qname421 =null;


        CommonTree CREATE418_tree=null;
        CommonTree MATERIALIZED419_tree=null;
        CommonTree VIEW420_tree=null;
        CommonTree AS422_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
        RewriteRuleTokenStream stream_MATERIALIZED=new RewriteRuleTokenStream(adaptor,"token MATERIALIZED");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        RewriteRuleSubtreeStream stream_restrictedSelectStmt=new RewriteRuleSubtreeStream(adaptor,"rule restrictedSelectStmt");
        RewriteRuleSubtreeStream stream_viewRefresh=new RewriteRuleSubtreeStream(adaptor,"rule viewRefresh");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:583:5: ( CREATE MATERIALIZED VIEW qname (r= viewRefresh )? AS s= restrictedSelectStmt -> ^( CREATE_MATERIALIZED_VIEW qname ( $r)? $s) )
            // com/facebook/presto/sql/parser/Statement.g:583:7: CREATE MATERIALIZED VIEW qname (r= viewRefresh )? AS s= restrictedSelectStmt
            {
            CREATE418=(Token)match(input,CREATE,FOLLOW_CREATE_in_createMaterializedViewStmt5366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE418);


            MATERIALIZED419=(Token)match(input,MATERIALIZED,FOLLOW_MATERIALIZED_in_createMaterializedViewStmt5368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MATERIALIZED.add(MATERIALIZED419);


            VIEW420=(Token)match(input,VIEW,FOLLOW_VIEW_in_createMaterializedViewStmt5370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VIEW.add(VIEW420);


            pushFollow(FOLLOW_qname_in_createMaterializedViewStmt5372);
            qname421=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname421.getTree());

            // com/facebook/presto/sql/parser/Statement.g:583:39: (r= viewRefresh )?
            int alt106=2;
            switch ( input.LA(1) ) {
                case REFRESH:
                    {
                    alt106=1;
                    }
                    break;
            }

            switch (alt106) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:583:39: r= viewRefresh
                    {
                    pushFollow(FOLLOW_viewRefresh_in_createMaterializedViewStmt5376);
                    r=viewRefresh();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_viewRefresh.add(r.getTree());

                    }
                    break;

            }


            AS422=(Token)match(input,AS,FOLLOW_AS_in_createMaterializedViewStmt5379); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AS.add(AS422);


            pushFollow(FOLLOW_restrictedSelectStmt_in_createMaterializedViewStmt5383);
            s=restrictedSelectStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_restrictedSelectStmt.add(s.getTree());

            // AST REWRITE
            // elements: r, qname, s
            // token labels: 
            // rule labels: retval, s, r
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 583:79: -> ^( CREATE_MATERIALIZED_VIEW qname ( $r)? $s)
            {
                // com/facebook/presto/sql/parser/Statement.g:583:82: ^( CREATE_MATERIALIZED_VIEW qname ( $r)? $s)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CREATE_MATERIALIZED_VIEW, "CREATE_MATERIALIZED_VIEW")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:583:116: ( $r)?
                if ( stream_r.hasNext() ) {
                    adaptor.addChild(root_1, stream_r.nextTree());

                }
                stream_r.reset();

                adaptor.addChild(root_1, stream_s.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 85, createMaterializedViewStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "createMaterializedViewStmt"


    public static class refreshMaterializedViewStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "refreshMaterializedViewStmt"
    // com/facebook/presto/sql/parser/Statement.g:586:1: refreshMaterializedViewStmt : REFRESH MATERIALIZED VIEW qname -> ^( REFRESH_MATERIALIZED_VIEW qname ) ;
    public final StatementParser.refreshMaterializedViewStmt_return refreshMaterializedViewStmt() throws RecognitionException {
        StatementParser.refreshMaterializedViewStmt_return retval = new StatementParser.refreshMaterializedViewStmt_return();
        retval.start = input.LT(1);

        int refreshMaterializedViewStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token REFRESH423=null;
        Token MATERIALIZED424=null;
        Token VIEW425=null;
        StatementParser.qname_return qname426 =null;


        CommonTree REFRESH423_tree=null;
        CommonTree MATERIALIZED424_tree=null;
        CommonTree VIEW425_tree=null;
        RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
        RewriteRuleTokenStream stream_REFRESH=new RewriteRuleTokenStream(adaptor,"token REFRESH");
        RewriteRuleTokenStream stream_MATERIALIZED=new RewriteRuleTokenStream(adaptor,"token MATERIALIZED");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:587:5: ( REFRESH MATERIALIZED VIEW qname -> ^( REFRESH_MATERIALIZED_VIEW qname ) )
            // com/facebook/presto/sql/parser/Statement.g:587:7: REFRESH MATERIALIZED VIEW qname
            {
            REFRESH423=(Token)match(input,REFRESH,FOLLOW_REFRESH_in_refreshMaterializedViewStmt5415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REFRESH.add(REFRESH423);


            MATERIALIZED424=(Token)match(input,MATERIALIZED,FOLLOW_MATERIALIZED_in_refreshMaterializedViewStmt5417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MATERIALIZED.add(MATERIALIZED424);


            VIEW425=(Token)match(input,VIEW,FOLLOW_VIEW_in_refreshMaterializedViewStmt5419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VIEW.add(VIEW425);


            pushFollow(FOLLOW_qname_in_refreshMaterializedViewStmt5421);
            qname426=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname426.getTree());

            // AST REWRITE
            // elements: qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 587:39: -> ^( REFRESH_MATERIALIZED_VIEW qname )
            {
                // com/facebook/presto/sql/parser/Statement.g:587:42: ^( REFRESH_MATERIALIZED_VIEW qname )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REFRESH_MATERIALIZED_VIEW, "REFRESH_MATERIALIZED_VIEW")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 86, refreshMaterializedViewStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "refreshMaterializedViewStmt"


    public static class viewRefresh_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "viewRefresh"
    // com/facebook/presto/sql/parser/Statement.g:590:1: viewRefresh : REFRESH r= integer -> ^( REFRESH $r) ;
    public final StatementParser.viewRefresh_return viewRefresh() throws RecognitionException {
        StatementParser.viewRefresh_return retval = new StatementParser.viewRefresh_return();
        retval.start = input.LT(1);

        int viewRefresh_StartIndex = input.index();

        CommonTree root_0 = null;

        Token REFRESH427=null;
        StatementParser.integer_return r =null;


        CommonTree REFRESH427_tree=null;
        RewriteRuleTokenStream stream_REFRESH=new RewriteRuleTokenStream(adaptor,"token REFRESH");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:591:5: ( REFRESH r= integer -> ^( REFRESH $r) )
            // com/facebook/presto/sql/parser/Statement.g:591:7: REFRESH r= integer
            {
            REFRESH427=(Token)match(input,REFRESH,FOLLOW_REFRESH_in_viewRefresh5446); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REFRESH.add(REFRESH427);


            pushFollow(FOLLOW_integer_in_viewRefresh5450);
            r=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_integer.add(r.getTree());

            // AST REWRITE
            // elements: REFRESH, r
            // token labels: 
            // rule labels: retval, r
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 591:25: -> ^( REFRESH $r)
            {
                // com/facebook/presto/sql/parser/Statement.g:591:28: ^( REFRESH $r)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_REFRESH.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_r.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 87, viewRefresh_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "viewRefresh"


    public static class createAliasStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createAliasStmt"
    // com/facebook/presto/sql/parser/Statement.g:594:1: createAliasStmt : CREATE ALIAS qname forRemote -> ^( CREATE_ALIAS qname forRemote ) ;
    public final StatementParser.createAliasStmt_return createAliasStmt() throws RecognitionException {
        StatementParser.createAliasStmt_return retval = new StatementParser.createAliasStmt_return();
        retval.start = input.LT(1);

        int createAliasStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CREATE428=null;
        Token ALIAS429=null;
        StatementParser.qname_return qname430 =null;

        StatementParser.forRemote_return forRemote431 =null;


        CommonTree CREATE428_tree=null;
        CommonTree ALIAS429_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_ALIAS=new RewriteRuleTokenStream(adaptor,"token ALIAS");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        RewriteRuleSubtreeStream stream_forRemote=new RewriteRuleSubtreeStream(adaptor,"rule forRemote");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:595:5: ( CREATE ALIAS qname forRemote -> ^( CREATE_ALIAS qname forRemote ) )
            // com/facebook/presto/sql/parser/Statement.g:595:7: CREATE ALIAS qname forRemote
            {
            CREATE428=(Token)match(input,CREATE,FOLLOW_CREATE_in_createAliasStmt5476); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE428);


            ALIAS429=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_createAliasStmt5478); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ALIAS.add(ALIAS429);


            pushFollow(FOLLOW_qname_in_createAliasStmt5480);
            qname430=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname430.getTree());

            pushFollow(FOLLOW_forRemote_in_createAliasStmt5482);
            forRemote431=forRemote();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forRemote.add(forRemote431.getTree());

            // AST REWRITE
            // elements: qname, forRemote
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 595:36: -> ^( CREATE_ALIAS qname forRemote )
            {
                // com/facebook/presto/sql/parser/Statement.g:595:39: ^( CREATE_ALIAS qname forRemote )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CREATE_ALIAS, "CREATE_ALIAS")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_1, stream_forRemote.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 88, createAliasStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "createAliasStmt"


    public static class dropAliasStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropAliasStmt"
    // com/facebook/presto/sql/parser/Statement.g:598:1: dropAliasStmt : DROP ALIAS qname -> ^( DROP_ALIAS qname ) ;
    public final StatementParser.dropAliasStmt_return dropAliasStmt() throws RecognitionException {
        StatementParser.dropAliasStmt_return retval = new StatementParser.dropAliasStmt_return();
        retval.start = input.LT(1);

        int dropAliasStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DROP432=null;
        Token ALIAS433=null;
        StatementParser.qname_return qname434 =null;


        CommonTree DROP432_tree=null;
        CommonTree ALIAS433_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_ALIAS=new RewriteRuleTokenStream(adaptor,"token ALIAS");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:599:5: ( DROP ALIAS qname -> ^( DROP_ALIAS qname ) )
            // com/facebook/presto/sql/parser/Statement.g:599:7: DROP ALIAS qname
            {
            DROP432=(Token)match(input,DROP,FOLLOW_DROP_in_dropAliasStmt5509); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP432);


            ALIAS433=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_dropAliasStmt5511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ALIAS.add(ALIAS433);


            pushFollow(FOLLOW_qname_in_dropAliasStmt5513);
            qname434=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname434.getTree());

            // AST REWRITE
            // elements: qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 599:24: -> ^( DROP_ALIAS qname )
            {
                // com/facebook/presto/sql/parser/Statement.g:599:27: ^( DROP_ALIAS qname )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DROP_ALIAS, "DROP_ALIAS")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 89, dropAliasStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dropAliasStmt"


    public static class forRemote_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forRemote"
    // com/facebook/presto/sql/parser/Statement.g:602:1: forRemote : FOR qname -> ^( FOR qname ) ;
    public final StatementParser.forRemote_return forRemote() throws RecognitionException {
        StatementParser.forRemote_return retval = new StatementParser.forRemote_return();
        retval.start = input.LT(1);

        int forRemote_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FOR435=null;
        StatementParser.qname_return qname436 =null;


        CommonTree FOR435_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:603:5: ( FOR qname -> ^( FOR qname ) )
            // com/facebook/presto/sql/parser/Statement.g:603:7: FOR qname
            {
            FOR435=(Token)match(input,FOR,FOLLOW_FOR_in_forRemote5538); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR435);


            pushFollow(FOLLOW_qname_in_forRemote5540);
            qname436=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname436.getTree());

            // AST REWRITE
            // elements: FOR, qname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 603:17: -> ^( FOR qname )
            {
                // com/facebook/presto/sql/parser/Statement.g:603:20: ^( FOR qname )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOR.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 90, forRemote_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forRemote"


    public static class createTableStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createTableStmt"
    // com/facebook/presto/sql/parser/Statement.g:606:1: createTableStmt : CREATE TABLE qname s= tableContentsSource -> ^( CREATE_TABLE qname $s) ;
    public final StatementParser.createTableStmt_return createTableStmt() throws RecognitionException {
        StatementParser.createTableStmt_return retval = new StatementParser.createTableStmt_return();
        retval.start = input.LT(1);

        int createTableStmt_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CREATE437=null;
        Token TABLE438=null;
        StatementParser.tableContentsSource_return s =null;

        StatementParser.qname_return qname439 =null;


        CommonTree CREATE437_tree=null;
        CommonTree TABLE438_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleSubtreeStream stream_tableContentsSource=new RewriteRuleSubtreeStream(adaptor,"rule tableContentsSource");
        RewriteRuleSubtreeStream stream_qname=new RewriteRuleSubtreeStream(adaptor,"rule qname");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:607:5: ( CREATE TABLE qname s= tableContentsSource -> ^( CREATE_TABLE qname $s) )
            // com/facebook/presto/sql/parser/Statement.g:607:7: CREATE TABLE qname s= tableContentsSource
            {
            CREATE437=(Token)match(input,CREATE,FOLLOW_CREATE_in_createTableStmt5565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE437);


            TABLE438=(Token)match(input,TABLE,FOLLOW_TABLE_in_createTableStmt5567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE438);


            pushFollow(FOLLOW_qname_in_createTableStmt5569);
            qname439=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qname.add(qname439.getTree());

            pushFollow(FOLLOW_tableContentsSource_in_createTableStmt5573);
            s=tableContentsSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableContentsSource.add(s.getTree());

            // AST REWRITE
            // elements: qname, s
            // token labels: 
            // rule labels: retval, s
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 607:48: -> ^( CREATE_TABLE qname $s)
            {
                // com/facebook/presto/sql/parser/Statement.g:607:51: ^( CREATE_TABLE qname $s)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CREATE_TABLE, "CREATE_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_qname.nextTree());

                adaptor.addChild(root_1, stream_s.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 91, createTableStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "createTableStmt"


    public static class tableContentsSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableContentsSource"
    // com/facebook/presto/sql/parser/Statement.g:610:1: tableContentsSource : AS query -> query ;
    public final StatementParser.tableContentsSource_return tableContentsSource() throws RecognitionException {
        StatementParser.tableContentsSource_return retval = new StatementParser.tableContentsSource_return();
        retval.start = input.LT(1);

        int tableContentsSource_StartIndex = input.index();

        CommonTree root_0 = null;

        Token AS440=null;
        StatementParser.query_return query441 =null;


        CommonTree AS440_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:611:5: ( AS query -> query )
            // com/facebook/presto/sql/parser/Statement.g:611:7: AS query
            {
            AS440=(Token)match(input,AS,FOLLOW_AS_in_tableContentsSource5601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AS.add(AS440);


            pushFollow(FOLLOW_query_in_tableContentsSource5603);
            query441=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_query.add(query441.getTree());

            // AST REWRITE
            // elements: query
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 611:16: -> query
            {
                adaptor.addChild(root_0, stream_query.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 92, tableContentsSource_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tableContentsSource"


    public static class tableElementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableElementList"
    // com/facebook/presto/sql/parser/Statement.g:614:1: tableElementList : '(' tableElement ( ',' tableElement )* ')' -> ^( TABLE_ELEMENT_LIST ( tableElement )+ ) ;
    public final StatementParser.tableElementList_return tableElementList() throws RecognitionException {
        StatementParser.tableElementList_return retval = new StatementParser.tableElementList_return();
        retval.start = input.LT(1);

        int tableElementList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal442=null;
        Token char_literal444=null;
        Token char_literal446=null;
        StatementParser.tableElement_return tableElement443 =null;

        StatementParser.tableElement_return tableElement445 =null;


        CommonTree char_literal442_tree=null;
        CommonTree char_literal444_tree=null;
        CommonTree char_literal446_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_tableElement=new RewriteRuleSubtreeStream(adaptor,"rule tableElement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:615:5: ( '(' tableElement ( ',' tableElement )* ')' -> ^( TABLE_ELEMENT_LIST ( tableElement )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:615:7: '(' tableElement ( ',' tableElement )* ')'
            {
            char_literal442=(Token)match(input,200,FOLLOW_200_in_tableElementList5624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal442);


            pushFollow(FOLLOW_tableElement_in_tableElementList5626);
            tableElement443=tableElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableElement.add(tableElement443.getTree());

            // com/facebook/presto/sql/parser/Statement.g:615:24: ( ',' tableElement )*
            loop107:
            do {
                int alt107=2;
                switch ( input.LA(1) ) {
                case 204:
                    {
                    alt107=1;
                    }
                    break;

                }

                switch (alt107) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:615:25: ',' tableElement
            	    {
            	    char_literal444=(Token)match(input,204,FOLLOW_204_in_tableElementList5629); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_204.add(char_literal444);


            	    pushFollow(FOLLOW_tableElement_in_tableElementList5631);
            	    tableElement445=tableElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tableElement.add(tableElement445.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            char_literal446=(Token)match(input,201,FOLLOW_201_in_tableElementList5635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal446);


            // AST REWRITE
            // elements: tableElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 615:48: -> ^( TABLE_ELEMENT_LIST ( tableElement )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:615:51: ^( TABLE_ELEMENT_LIST ( tableElement )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TABLE_ELEMENT_LIST, "TABLE_ELEMENT_LIST")
                , root_1);

                if ( !(stream_tableElement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tableElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableElement.nextTree());

                }
                stream_tableElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 93, tableElementList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tableElementList"


    public static class tableElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableElement"
    // com/facebook/presto/sql/parser/Statement.g:618:1: tableElement : ident dataType ( columnConstDef )* -> ^( COLUMN_DEF ident dataType ( columnConstDef )* ) ;
    public final StatementParser.tableElement_return tableElement() throws RecognitionException {
        StatementParser.tableElement_return retval = new StatementParser.tableElement_return();
        retval.start = input.LT(1);

        int tableElement_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.ident_return ident447 =null;

        StatementParser.dataType_return dataType448 =null;

        StatementParser.columnConstDef_return columnConstDef449 =null;


        RewriteRuleSubtreeStream stream_dataType=new RewriteRuleSubtreeStream(adaptor,"rule dataType");
        RewriteRuleSubtreeStream stream_columnConstDef=new RewriteRuleSubtreeStream(adaptor,"rule columnConstDef");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:619:5: ( ident dataType ( columnConstDef )* -> ^( COLUMN_DEF ident dataType ( columnConstDef )* ) )
            // com/facebook/presto/sql/parser/Statement.g:619:7: ident dataType ( columnConstDef )*
            {
            pushFollow(FOLLOW_ident_in_tableElement5661);
            ident447=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident447.getTree());

            pushFollow(FOLLOW_dataType_in_tableElement5663);
            dataType448=dataType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dataType.add(dataType448.getTree());

            // com/facebook/presto/sql/parser/Statement.g:619:22: ( columnConstDef )*
            loop108:
            do {
                int alt108=2;
                switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt108=1;
                    }
                    break;

                }

                switch (alt108) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:619:22: columnConstDef
            	    {
            	    pushFollow(FOLLOW_columnConstDef_in_tableElement5665);
            	    columnConstDef449=columnConstDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_columnConstDef.add(columnConstDef449.getTree());

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            // AST REWRITE
            // elements: dataType, columnConstDef, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 619:38: -> ^( COLUMN_DEF ident dataType ( columnConstDef )* )
            {
                // com/facebook/presto/sql/parser/Statement.g:619:41: ^( COLUMN_DEF ident dataType ( columnConstDef )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN_DEF, "COLUMN_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());

                adaptor.addChild(root_1, stream_dataType.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:619:69: ( columnConstDef )*
                while ( stream_columnConstDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnConstDef.nextTree());

                }
                stream_columnConstDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 94, tableElement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tableElement"


    public static class dataType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dataType"
    // com/facebook/presto/sql/parser/Statement.g:622:1: dataType : ( charType | exactNumType | dateType );
    public final StatementParser.dataType_return dataType() throws RecognitionException {
        StatementParser.dataType_return retval = new StatementParser.dataType_return();
        retval.start = input.LT(1);

        int dataType_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.charType_return charType450 =null;

        StatementParser.exactNumType_return exactNumType451 =null;

        StatementParser.dateType_return dateType452 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:623:5: ( charType | exactNumType | dateType )
            int alt109=3;
            switch ( input.LA(1) ) {
            case CHAR:
            case CHARACTER:
            case VARCHAR:
                {
                alt109=1;
                }
                break;
            case DEC:
            case DECIMAL:
            case INT:
            case INTEGER:
            case NUMERIC:
                {
                alt109=2;
                }
                break;
            case DATE:
                {
                alt109=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;

            }

            switch (alt109) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:623:7: charType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_charType_in_dataType5696);
                    charType450=charType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, charType450.getTree());

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:624:7: exactNumType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_exactNumType_in_dataType5704);
                    exactNumType451=exactNumType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exactNumType451.getTree());

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:625:7: dateType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateType_in_dataType5712);
                    dateType452=dateType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateType452.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 95, dataType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dataType"


    public static class charType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charType"
    // com/facebook/presto/sql/parser/Statement.g:628:1: charType : ( CHAR ( charlen )? -> ^( CHAR ( charlen )? ) | CHARACTER ( charlen )? -> ^( CHAR ( charlen )? ) | VARCHAR ( charlen )? -> ^( VARCHAR ( charlen )? ) | CHAR VARYING ( charlen )? -> ^( VARCHAR ( charlen )? ) | CHARACTER VARYING ( charlen )? -> ^( VARCHAR ( charlen )? ) );
    public final StatementParser.charType_return charType() throws RecognitionException {
        StatementParser.charType_return retval = new StatementParser.charType_return();
        retval.start = input.LT(1);

        int charType_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CHAR453=null;
        Token CHARACTER455=null;
        Token VARCHAR457=null;
        Token CHAR459=null;
        Token VARYING460=null;
        Token CHARACTER462=null;
        Token VARYING463=null;
        StatementParser.charlen_return charlen454 =null;

        StatementParser.charlen_return charlen456 =null;

        StatementParser.charlen_return charlen458 =null;

        StatementParser.charlen_return charlen461 =null;

        StatementParser.charlen_return charlen464 =null;


        CommonTree CHAR453_tree=null;
        CommonTree CHARACTER455_tree=null;
        CommonTree VARCHAR457_tree=null;
        CommonTree CHAR459_tree=null;
        CommonTree VARYING460_tree=null;
        CommonTree CHARACTER462_tree=null;
        CommonTree VARYING463_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_VARCHAR=new RewriteRuleTokenStream(adaptor,"token VARCHAR");
        RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
        RewriteRuleSubtreeStream stream_charlen=new RewriteRuleSubtreeStream(adaptor,"rule charlen");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:629:5: ( CHAR ( charlen )? -> ^( CHAR ( charlen )? ) | CHARACTER ( charlen )? -> ^( CHAR ( charlen )? ) | VARCHAR ( charlen )? -> ^( VARCHAR ( charlen )? ) | CHAR VARYING ( charlen )? -> ^( VARCHAR ( charlen )? ) | CHARACTER VARYING ( charlen )? -> ^( VARCHAR ( charlen )? ) )
            int alt115=5;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                switch ( input.LA(2) ) {
                case VARYING:
                    {
                    alt115=4;
                    }
                    break;
                case NOT:
                case 200:
                case 201:
                case 204:
                    {
                    alt115=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 1, input);

                    throw nvae;

                }

                }
                break;
            case CHARACTER:
                {
                switch ( input.LA(2) ) {
                case VARYING:
                    {
                    alt115=5;
                    }
                    break;
                case NOT:
                case 200:
                case 201:
                case 204:
                    {
                    alt115=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 2, input);

                    throw nvae;

                }

                }
                break;
            case VARCHAR:
                {
                alt115=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:629:7: CHAR ( charlen )?
                    {
                    CHAR453=(Token)match(input,CHAR,FOLLOW_CHAR_in_charType5729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(CHAR453);


                    // com/facebook/presto/sql/parser/Statement.g:629:12: ( charlen )?
                    int alt110=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt110=1;
                            }
                            break;
                    }

                    switch (alt110) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:629:12: charlen
                            {
                            pushFollow(FOLLOW_charlen_in_charType5731);
                            charlen454=charlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_charlen.add(charlen454.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: charlen, CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 629:34: -> ^( CHAR ( charlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:629:37: ^( CHAR ( charlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CHAR.nextNode()
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:629:44: ( charlen )?
                        if ( stream_charlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_charlen.nextTree());

                        }
                        stream_charlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:630:7: CHARACTER ( charlen )?
                    {
                    CHARACTER455=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_charType5762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER455);


                    // com/facebook/presto/sql/parser/Statement.g:630:17: ( charlen )?
                    int alt111=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt111=1;
                            }
                            break;
                    }

                    switch (alt111) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:630:17: charlen
                            {
                            pushFollow(FOLLOW_charlen_in_charType5764);
                            charlen456=charlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_charlen.add(charlen456.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: charlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 630:34: -> ^( CHAR ( charlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:630:37: ^( CHAR ( charlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHAR, "CHAR")
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:630:44: ( charlen )?
                        if ( stream_charlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_charlen.nextTree());

                        }
                        stream_charlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:631:7: VARCHAR ( charlen )?
                    {
                    VARCHAR457=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_charType5790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARCHAR.add(VARCHAR457);


                    // com/facebook/presto/sql/parser/Statement.g:631:15: ( charlen )?
                    int alt112=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt112=1;
                            }
                            break;
                    }

                    switch (alt112) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:631:15: charlen
                            {
                            pushFollow(FOLLOW_charlen_in_charType5792);
                            charlen458=charlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_charlen.add(charlen458.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: VARCHAR, charlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 631:34: -> ^( VARCHAR ( charlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:631:37: ^( VARCHAR ( charlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_VARCHAR.nextNode()
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:631:47: ( charlen )?
                        if ( stream_charlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_charlen.nextTree());

                        }
                        stream_charlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:632:7: CHAR VARYING ( charlen )?
                    {
                    CHAR459=(Token)match(input,CHAR,FOLLOW_CHAR_in_charType5820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(CHAR459);


                    VARYING460=(Token)match(input,VARYING,FOLLOW_VARYING_in_charType5822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARYING.add(VARYING460);


                    // com/facebook/presto/sql/parser/Statement.g:632:20: ( charlen )?
                    int alt113=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt113=1;
                            }
                            break;
                    }

                    switch (alt113) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:632:20: charlen
                            {
                            pushFollow(FOLLOW_charlen_in_charType5824);
                            charlen461=charlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_charlen.add(charlen461.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: charlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 632:34: -> ^( VARCHAR ( charlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:632:37: ^( VARCHAR ( charlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VARCHAR, "VARCHAR")
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:632:47: ( charlen )?
                        if ( stream_charlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_charlen.nextTree());

                        }
                        stream_charlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/Statement.g:633:7: CHARACTER VARYING ( charlen )?
                    {
                    CHARACTER462=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_charType5847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER462);


                    VARYING463=(Token)match(input,VARYING,FOLLOW_VARYING_in_charType5849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARYING.add(VARYING463);


                    // com/facebook/presto/sql/parser/Statement.g:633:25: ( charlen )?
                    int alt114=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt114=1;
                            }
                            break;
                    }

                    switch (alt114) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:633:25: charlen
                            {
                            pushFollow(FOLLOW_charlen_in_charType5851);
                            charlen464=charlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_charlen.add(charlen464.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: charlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 633:34: -> ^( VARCHAR ( charlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:633:37: ^( VARCHAR ( charlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VARCHAR, "VARCHAR")
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:633:47: ( charlen )?
                        if ( stream_charlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_charlen.nextTree());

                        }
                        stream_charlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 96, charType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "charType"


    public static class charlen_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charlen"
    // com/facebook/presto/sql/parser/Statement.g:636:1: charlen : '(' integer ')' -> integer ;
    public final StatementParser.charlen_return charlen() throws RecognitionException {
        StatementParser.charlen_return retval = new StatementParser.charlen_return();
        retval.start = input.LT(1);

        int charlen_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal465=null;
        Token char_literal467=null;
        StatementParser.integer_return integer466 =null;


        CommonTree char_literal465_tree=null;
        CommonTree char_literal467_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:637:5: ( '(' integer ')' -> integer )
            // com/facebook/presto/sql/parser/Statement.g:637:7: '(' integer ')'
            {
            char_literal465=(Token)match(input,200,FOLLOW_200_in_charlen5878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal465);


            pushFollow(FOLLOW_integer_in_charlen5880);
            integer466=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_integer.add(integer466.getTree());

            char_literal467=(Token)match(input,201,FOLLOW_201_in_charlen5882); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal467);


            // AST REWRITE
            // elements: integer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 637:23: -> integer
            {
                adaptor.addChild(root_0, stream_integer.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 97, charlen_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "charlen"


    public static class exactNumType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exactNumType"
    // com/facebook/presto/sql/parser/Statement.g:640:1: exactNumType : ( NUMERIC ( numlen )? -> ^( NUMERIC ( numlen )? ) | DECIMAL ( numlen )? -> ^( NUMERIC ( numlen )? ) | DEC ( numlen )? -> ^( NUMERIC ( numlen )? ) | INTEGER -> ^( INTEGER ) | INT -> ^( INTEGER ) );
    public final StatementParser.exactNumType_return exactNumType() throws RecognitionException {
        StatementParser.exactNumType_return retval = new StatementParser.exactNumType_return();
        retval.start = input.LT(1);

        int exactNumType_StartIndex = input.index();

        CommonTree root_0 = null;

        Token NUMERIC468=null;
        Token DECIMAL470=null;
        Token DEC472=null;
        Token INTEGER474=null;
        Token INT475=null;
        StatementParser.numlen_return numlen469 =null;

        StatementParser.numlen_return numlen471 =null;

        StatementParser.numlen_return numlen473 =null;


        CommonTree NUMERIC468_tree=null;
        CommonTree DECIMAL470_tree=null;
        CommonTree DEC472_tree=null;
        CommonTree INTEGER474_tree=null;
        CommonTree INT475_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_DECIMAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL");
        RewriteRuleTokenStream stream_NUMERIC=new RewriteRuleTokenStream(adaptor,"token NUMERIC");
        RewriteRuleSubtreeStream stream_numlen=new RewriteRuleSubtreeStream(adaptor,"rule numlen");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:641:5: ( NUMERIC ( numlen )? -> ^( NUMERIC ( numlen )? ) | DECIMAL ( numlen )? -> ^( NUMERIC ( numlen )? ) | DEC ( numlen )? -> ^( NUMERIC ( numlen )? ) | INTEGER -> ^( INTEGER ) | INT -> ^( INTEGER ) )
            int alt119=5;
            switch ( input.LA(1) ) {
            case NUMERIC:
                {
                alt119=1;
                }
                break;
            case DECIMAL:
                {
                alt119=2;
                }
                break;
            case DEC:
                {
                alt119=3;
                }
                break;
            case INTEGER:
                {
                alt119=4;
                }
                break;
            case INT:
                {
                alt119=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }

            switch (alt119) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:641:7: NUMERIC ( numlen )?
                    {
                    NUMERIC468=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_exactNumType5903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC.add(NUMERIC468);


                    // com/facebook/presto/sql/parser/Statement.g:641:15: ( numlen )?
                    int alt116=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt116=1;
                            }
                            break;
                    }

                    switch (alt116) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:641:15: numlen
                            {
                            pushFollow(FOLLOW_numlen_in_exactNumType5905);
                            numlen469=numlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_numlen.add(numlen469.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: NUMERIC, numlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 641:23: -> ^( NUMERIC ( numlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:641:26: ^( NUMERIC ( numlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_NUMERIC.nextNode()
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:641:36: ( numlen )?
                        if ( stream_numlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_numlen.nextTree());

                        }
                        stream_numlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:642:7: DECIMAL ( numlen )?
                    {
                    DECIMAL470=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_exactNumType5923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECIMAL.add(DECIMAL470);


                    // com/facebook/presto/sql/parser/Statement.g:642:15: ( numlen )?
                    int alt117=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt117=1;
                            }
                            break;
                    }

                    switch (alt117) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:642:15: numlen
                            {
                            pushFollow(FOLLOW_numlen_in_exactNumType5925);
                            numlen471=numlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_numlen.add(numlen471.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: numlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 642:23: -> ^( NUMERIC ( numlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:642:26: ^( NUMERIC ( numlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUMERIC, "NUMERIC")
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:642:36: ( numlen )?
                        if ( stream_numlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_numlen.nextTree());

                        }
                        stream_numlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:643:7: DEC ( numlen )?
                    {
                    DEC472=(Token)match(input,DEC,FOLLOW_DEC_in_exactNumType5943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEC.add(DEC472);


                    // com/facebook/presto/sql/parser/Statement.g:643:11: ( numlen )?
                    int alt118=2;
                    switch ( input.LA(1) ) {
                        case 200:
                            {
                            alt118=1;
                            }
                            break;
                    }

                    switch (alt118) {
                        case 1 :
                            // com/facebook/presto/sql/parser/Statement.g:643:11: numlen
                            {
                            pushFollow(FOLLOW_numlen_in_exactNumType5945);
                            numlen473=numlen();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_numlen.add(numlen473.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: numlen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 643:23: -> ^( NUMERIC ( numlen )? )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:643:26: ^( NUMERIC ( numlen )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUMERIC, "NUMERIC")
                        , root_1);

                        // com/facebook/presto/sql/parser/Statement.g:643:36: ( numlen )?
                        if ( stream_numlen.hasNext() ) {
                            adaptor.addChild(root_1, stream_numlen.nextTree());

                        }
                        stream_numlen.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/Statement.g:644:7: INTEGER
                    {
                    INTEGER474=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_exactNumType5967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTEGER.add(INTEGER474);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 644:23: -> ^( INTEGER )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:644:26: ^( INTEGER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_INTEGER.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/Statement.g:645:7: INT
                    {
                    INT475=(Token)match(input,INT,FOLLOW_INT_in_exactNumType5989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT475);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 645:23: -> ^( INTEGER )
                    {
                        // com/facebook/presto/sql/parser/Statement.g:645:26: ^( INTEGER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 98, exactNumType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exactNumType"


    public static class numlen_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numlen"
    // com/facebook/presto/sql/parser/Statement.g:648:1: numlen : '(' p= integer ( ',' s= integer )? ')' -> $p ( $s)? ;
    public final StatementParser.numlen_return numlen() throws RecognitionException {
        StatementParser.numlen_return retval = new StatementParser.numlen_return();
        retval.start = input.LT(1);

        int numlen_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal476=null;
        Token char_literal477=null;
        Token char_literal478=null;
        StatementParser.integer_return p =null;

        StatementParser.integer_return s =null;


        CommonTree char_literal476_tree=null;
        CommonTree char_literal477_tree=null;
        CommonTree char_literal478_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:649:5: ( '(' p= integer ( ',' s= integer )? ')' -> $p ( $s)? )
            // com/facebook/presto/sql/parser/Statement.g:649:7: '(' p= integer ( ',' s= integer )? ')'
            {
            char_literal476=(Token)match(input,200,FOLLOW_200_in_numlen6024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal476);


            pushFollow(FOLLOW_integer_in_numlen6028);
            p=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_integer.add(p.getTree());

            // com/facebook/presto/sql/parser/Statement.g:649:21: ( ',' s= integer )?
            int alt120=2;
            switch ( input.LA(1) ) {
                case 204:
                    {
                    alt120=1;
                    }
                    break;
            }

            switch (alt120) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:649:22: ',' s= integer
                    {
                    char_literal477=(Token)match(input,204,FOLLOW_204_in_numlen6031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_204.add(char_literal477);


                    pushFollow(FOLLOW_integer_in_numlen6035);
                    s=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integer.add(s.getTree());

                    }
                    break;

            }


            char_literal478=(Token)match(input,201,FOLLOW_201_in_numlen6039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_201.add(char_literal478);


            // AST REWRITE
            // elements: s, p
            // token labels: 
            // rule labels: retval, s, p
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 649:42: -> $p ( $s)?
            {
                adaptor.addChild(root_0, stream_p.nextTree());

                // com/facebook/presto/sql/parser/Statement.g:649:49: ( $s)?
                if ( stream_s.hasNext() ) {
                    adaptor.addChild(root_0, stream_s.nextTree());

                }
                stream_s.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 99, numlen_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numlen"


    public static class dateType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateType"
    // com/facebook/presto/sql/parser/Statement.g:652:1: dateType : DATE -> ^( DATE ) ;
    public final StatementParser.dateType_return dateType() throws RecognitionException {
        StatementParser.dateType_return retval = new StatementParser.dateType_return();
        retval.start = input.LT(1);

        int dateType_StartIndex = input.index();

        CommonTree root_0 = null;

        Token DATE479=null;

        CommonTree DATE479_tree=null;
        RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:653:5: ( DATE -> ^( DATE ) )
            // com/facebook/presto/sql/parser/Statement.g:653:7: DATE
            {
            DATE479=(Token)match(input,DATE,FOLLOW_DATE_in_dateType6065); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATE.add(DATE479);


            // AST REWRITE
            // elements: DATE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 653:12: -> ^( DATE )
            {
                // com/facebook/presto/sql/parser/Statement.g:653:15: ^( DATE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_DATE.nextNode()
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 100, dateType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dateType"


    public static class columnConstDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnConstDef"
    // com/facebook/presto/sql/parser/Statement.g:656:1: columnConstDef : columnConst -> ^( CONSTRAINT columnConst ) ;
    public final StatementParser.columnConstDef_return columnConstDef() throws RecognitionException {
        StatementParser.columnConstDef_return retval = new StatementParser.columnConstDef_return();
        retval.start = input.LT(1);

        int columnConstDef_StartIndex = input.index();

        CommonTree root_0 = null;

        StatementParser.columnConst_return columnConst480 =null;


        RewriteRuleSubtreeStream stream_columnConst=new RewriteRuleSubtreeStream(adaptor,"rule columnConst");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:657:5: ( columnConst -> ^( CONSTRAINT columnConst ) )
            // com/facebook/presto/sql/parser/Statement.g:657:7: columnConst
            {
            pushFollow(FOLLOW_columnConst_in_columnConstDef6088);
            columnConst480=columnConst();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnConst.add(columnConst480.getTree());

            // AST REWRITE
            // elements: columnConst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 657:19: -> ^( CONSTRAINT columnConst )
            {
                // com/facebook/presto/sql/parser/Statement.g:657:22: ^( CONSTRAINT columnConst )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONSTRAINT, "CONSTRAINT")
                , root_1);

                adaptor.addChild(root_1, stream_columnConst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 101, columnConstDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "columnConstDef"


    public static class columnConst_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnConst"
    // com/facebook/presto/sql/parser/Statement.g:660:1: columnConst : NOT NULL -> NOT_NULL ;
    public final StatementParser.columnConst_return columnConst() throws RecognitionException {
        StatementParser.columnConst_return retval = new StatementParser.columnConst_return();
        retval.start = input.LT(1);

        int columnConst_StartIndex = input.index();

        CommonTree root_0 = null;

        Token NOT481=null;
        Token NULL482=null;

        CommonTree NOT481_tree=null;
        CommonTree NULL482_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:661:5: ( NOT NULL -> NOT_NULL )
            // com/facebook/presto/sql/parser/Statement.g:661:7: NOT NULL
            {
            NOT481=(Token)match(input,NOT,FOLLOW_NOT_in_columnConst6113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NOT.add(NOT481);


            NULL482=(Token)match(input,NULL,FOLLOW_NULL_in_columnConst6115); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NULL.add(NULL482);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 661:16: -> NOT_NULL
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(NOT_NULL, "NOT_NULL")
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 102, columnConst_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "columnConst"


    public static class qname_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qname"
    // com/facebook/presto/sql/parser/Statement.g:664:1: qname : ident ( '.' ident )* -> ^( QNAME ( ident )+ ) ;
    public final StatementParser.qname_return qname() throws RecognitionException {
        StatementParser.qname_return retval = new StatementParser.qname_return();
        retval.start = input.LT(1);

        int qname_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal484=null;
        StatementParser.ident_return ident483 =null;

        StatementParser.ident_return ident485 =null;


        CommonTree char_literal484_tree=null;
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:665:5: ( ident ( '.' ident )* -> ^( QNAME ( ident )+ ) )
            // com/facebook/presto/sql/parser/Statement.g:665:7: ident ( '.' ident )*
            {
            pushFollow(FOLLOW_ident_in_qname6136);
            ident483=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident483.getTree());

            // com/facebook/presto/sql/parser/Statement.g:665:13: ( '.' ident )*
            loop121:
            do {
                int alt121=2;
                switch ( input.LA(1) ) {
                case 206:
                    {
                    switch ( input.LA(2) ) {
                    case ALIAS:
                    case BERNOULLI:
                    case CATALOGS:
                    case COLUMNS:
                    case CURRENT:
                    case DAY:
                    case DISTRIBUTED:
                    case EXPLAIN:
                    case FOLLOWING:
                    case FORMAT:
                    case FUNCTIONS:
                    case GRAPHVIZ:
                    case HOUR:
                    case IDENT:
                    case LOGICAL:
                    case MATERIALIZED:
                    case MINUTE:
                    case MONTH:
                    case OVER:
                    case PARTITION:
                    case PARTITIONS:
                    case PRECEDING:
                    case QUOTED_IDENT:
                    case RANGE:
                    case REFRESH:
                    case ROW:
                    case ROWS:
                    case SCHEMAS:
                    case SECOND:
                    case SHOW:
                    case SYSTEM:
                    case TABLES:
                    case TABLESAMPLE:
                    case TEXT:
                    case TYPE:
                    case VIEW:
                    case YEAR:
                        {
                        alt121=1;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt121) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/Statement.g:665:14: '.' ident
            	    {
            	    char_literal484=(Token)match(input,206,FOLLOW_206_in_qname6139); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_206.add(char_literal484);


            	    pushFollow(FOLLOW_ident_in_qname6141);
            	    ident485=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident485.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 665:26: -> ^( QNAME ( ident )+ )
            {
                // com/facebook/presto/sql/parser/Statement.g:665:29: ^( QNAME ( ident )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QNAME, "QNAME")
                , root_1);

                if ( !(stream_ident.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ident.hasNext() ) {
                    adaptor.addChild(root_1, stream_ident.nextTree());

                }
                stream_ident.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 103, qname_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qname"


    public static class ident_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ident"
    // com/facebook/presto/sql/parser/Statement.g:668:1: ident : ( IDENT | QUOTED_IDENT | nonReserved -> IDENT[$nonReserved.text] );
    public final StatementParser.ident_return ident() throws RecognitionException {
        StatementParser.ident_return retval = new StatementParser.ident_return();
        retval.start = input.LT(1);

        int ident_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IDENT486=null;
        Token QUOTED_IDENT487=null;
        StatementParser.nonReserved_return nonReserved488 =null;


        CommonTree IDENT486_tree=null;
        CommonTree QUOTED_IDENT487_tree=null;
        RewriteRuleSubtreeStream stream_nonReserved=new RewriteRuleSubtreeStream(adaptor,"rule nonReserved");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:669:5: ( IDENT | QUOTED_IDENT | nonReserved -> IDENT[$nonReserved.text] )
            int alt122=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt122=1;
                }
                break;
            case QUOTED_IDENT:
                {
                alt122=2;
                }
                break;
            case ALIAS:
            case BERNOULLI:
            case CATALOGS:
            case COLUMNS:
            case CURRENT:
            case DAY:
            case DISTRIBUTED:
            case EXPLAIN:
            case FOLLOWING:
            case FORMAT:
            case FUNCTIONS:
            case GRAPHVIZ:
            case HOUR:
            case LOGICAL:
            case MATERIALIZED:
            case MINUTE:
            case MONTH:
            case OVER:
            case PARTITION:
            case PARTITIONS:
            case PRECEDING:
            case RANGE:
            case REFRESH:
            case ROW:
            case ROWS:
            case SCHEMAS:
            case SECOND:
            case SHOW:
            case SYSTEM:
            case TABLES:
            case TABLESAMPLE:
            case TEXT:
            case TYPE:
            case VIEW:
            case YEAR:
                {
                alt122=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }

            switch (alt122) {
                case 1 :
                    // com/facebook/presto/sql/parser/Statement.g:669:7: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT486=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident6169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT486_tree = 
                    (CommonTree)adaptor.create(IDENT486)
                    ;
                    adaptor.addChild(root_0, IDENT486_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/Statement.g:670:7: QUOTED_IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    QUOTED_IDENT487=(Token)match(input,QUOTED_IDENT,FOLLOW_QUOTED_IDENT_in_ident6177); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUOTED_IDENT487_tree = 
                    (CommonTree)adaptor.create(QUOTED_IDENT487)
                    ;
                    adaptor.addChild(root_0, QUOTED_IDENT487_tree);
                    }

                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/Statement.g:671:7: nonReserved
                    {
                    pushFollow(FOLLOW_nonReserved_in_ident6185);
                    nonReserved488=nonReserved();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonReserved.add(nonReserved488.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 671:20: -> IDENT[$nonReserved.text]
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(IDENT, (nonReserved488!=null?input.toString(nonReserved488.start,nonReserved488.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 104, ident_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ident"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // com/facebook/presto/sql/parser/Statement.g:674:1: number : ( DECIMAL_VALUE | INTEGER_VALUE );
    public final StatementParser.number_return number() throws RecognitionException {
        StatementParser.number_return retval = new StatementParser.number_return();
        retval.start = input.LT(1);

        int number_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set489=null;

        CommonTree set489_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:675:5: ( DECIMAL_VALUE | INTEGER_VALUE )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set489=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_VALUE||input.LA(1)==INTEGER_VALUE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set489)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 105, number_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "number"


    public static class bool_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool"
    // com/facebook/presto/sql/parser/Statement.g:679:1: bool : ( TRUE | FALSE );
    public final StatementParser.bool_return bool() throws RecognitionException {
        StatementParser.bool_return retval = new StatementParser.bool_return();
        retval.start = input.LT(1);

        int bool_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set490=null;

        CommonTree set490_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:680:5: ( TRUE | FALSE )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set490=(Token)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set490)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 106, bool_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bool"


    public static class integer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integer"
    // com/facebook/presto/sql/parser/Statement.g:684:1: integer : INTEGER_VALUE ;
    public final StatementParser.integer_return integer() throws RecognitionException {
        StatementParser.integer_return retval = new StatementParser.integer_return();
        retval.start = input.LT(1);

        int integer_StartIndex = input.index();

        CommonTree root_0 = null;

        Token INTEGER_VALUE491=null;

        CommonTree INTEGER_VALUE491_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:685:5: ( INTEGER_VALUE )
            // com/facebook/presto/sql/parser/Statement.g:685:7: INTEGER_VALUE
            {
            root_0 = (CommonTree)adaptor.nil();


            INTEGER_VALUE491=(Token)match(input,INTEGER_VALUE,FOLLOW_INTEGER_VALUE_in_integer6258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_VALUE491_tree = 
            (CommonTree)adaptor.create(INTEGER_VALUE491)
            ;
            adaptor.addChild(root_0, INTEGER_VALUE491_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 107, integer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "integer"


    public static class nonReserved_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonReserved"
    // com/facebook/presto/sql/parser/Statement.g:688:1: nonReserved : ( SHOW | TABLES | COLUMNS | PARTITIONS | FUNCTIONS | SCHEMAS | CATALOGS | OVER | PARTITION | RANGE | ROWS | PRECEDING | FOLLOWING | CURRENT | ROW | REFRESH | MATERIALIZED | VIEW | ALIAS | YEAR | MONTH | DAY | HOUR | MINUTE | SECOND | EXPLAIN | FORMAT | TYPE | TEXT | GRAPHVIZ | LOGICAL | DISTRIBUTED | TABLESAMPLE | SYSTEM | BERNOULLI );
    public final StatementParser.nonReserved_return nonReserved() throws RecognitionException {
        StatementParser.nonReserved_return retval = new StatementParser.nonReserved_return();
        retval.start = input.LT(1);

        int nonReserved_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set492=null;

        CommonTree set492_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

            // com/facebook/presto/sql/parser/Statement.g:689:5: ( SHOW | TABLES | COLUMNS | PARTITIONS | FUNCTIONS | SCHEMAS | CATALOGS | OVER | PARTITION | RANGE | ROWS | PRECEDING | FOLLOWING | CURRENT | ROW | REFRESH | MATERIALIZED | VIEW | ALIAS | YEAR | MONTH | DAY | HOUR | MINUTE | SECOND | EXPLAIN | FORMAT | TYPE | TEXT | GRAPHVIZ | LOGICAL | DISTRIBUTED | TABLESAMPLE | SYSTEM | BERNOULLI )
            // com/facebook/presto/sql/parser/Statement.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set492=(Token)input.LT(1);

            if ( input.LA(1)==ALIAS||input.LA(1)==BERNOULLI||input.LA(1)==CATALOGS||input.LA(1)==COLUMNS||input.LA(1)==CURRENT||input.LA(1)==DAY||input.LA(1)==DISTRIBUTED||input.LA(1)==EXPLAIN||input.LA(1)==FOLLOWING||input.LA(1)==FORMAT||input.LA(1)==FUNCTIONS||input.LA(1)==GRAPHVIZ||input.LA(1)==HOUR||input.LA(1)==LOGICAL||(input.LA(1) >= MATERIALIZED && input.LA(1) <= MONTH)||(input.LA(1) >= OVER && input.LA(1) <= PARTITIONS)||input.LA(1)==PRECEDING||input.LA(1)==RANGE||input.LA(1)==REFRESH||(input.LA(1) >= ROW && input.LA(1) <= ROWS)||input.LA(1)==SCHEMAS||input.LA(1)==SECOND||input.LA(1)==SHOW||input.LA(1)==SYSTEM||(input.LA(1) >= TABLES && input.LA(1) <= TABLESAMPLE)||input.LA(1)==TEXT||input.LA(1)==TYPE||input.LA(1)==VIEW||input.LA(1)==YEAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set492)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re) {
                throw new ParsingException(getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 108, nonReserved_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nonReserved"

    // $ANTLR start synpred1_Statement
    public final void synpred1_Statement_fragment() throws RecognitionException {
        // com/facebook/presto/sql/parser/Statement.g:171:9: ( orderOrLimitQuerySpec )
        // com/facebook/presto/sql/parser/Statement.g:171:10: orderOrLimitQuerySpec
        {
        pushFollow(FOLLOW_orderOrLimitQuerySpec_in_synpred1_Statement719);
        orderOrLimitQuerySpec();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Statement

    // $ANTLR start synpred2_Statement
    public final void synpred2_Statement_fragment() throws RecognitionException {
        // com/facebook/presto/sql/parser/Statement.g:303:7: ( '(' tableRef ')' )
        // com/facebook/presto/sql/parser/Statement.g:303:8: '(' tableRef ')'
        {
        match(input,200,FOLLOW_200_in_synpred2_Statement1936); if (state.failed) return ;

        pushFollow(FOLLOW_tableRef_in_synpred2_Statement1938);
        tableRef();

        state._fsp--;
        if (state.failed) return ;

        match(input,201,FOLLOW_201_in_synpred2_Statement1940); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Statement

    // $ANTLR start synpred3_Statement
    public final void synpred3_Statement_fragment() throws RecognitionException {
        // com/facebook/presto/sql/parser/Statement.g:404:7: ( '(' expr ')' )
        // com/facebook/presto/sql/parser/Statement.g:404:8: '(' expr ')'
        {
        match(input,200,FOLLOW_200_in_synpred3_Statement3281); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred3_Statement3283);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,201,FOLLOW_201_in_synpred3_Statement3285); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Statement

    // $ANTLR start synpred4_Statement
    public final void synpred4_Statement_fragment() throws RecognitionException {
        // com/facebook/presto/sql/parser/Statement.g:416:7: ( '(' expr )
        // com/facebook/presto/sql/parser/Statement.g:416:8: '(' expr
        {
        match(input,200,FOLLOW_200_in_synpred4_Statement3463); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred4_Statement3465);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Statement

    // Delegated rules

    public final boolean synpred1_Statement() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Statement_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Statement() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Statement_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Statement() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Statement_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Statement() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Statement_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\2\uffff\3\1\3\uffff\3\1";
    static final String DFA28_minS =
        "\1\4\1\uffff\3\4\1\uffff\1\4\1\uffff\3\4";
    static final String DFA28_maxS =
        "\1\u00cd\1\uffff\3\u00d0\1\uffff\1\u00ca\1\uffff\3\u00d0";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\uffff\1\2\3\uffff";
    static final String DFA28_specialS =
        "\13\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\4\10\uffff\1\4\4\uffff\2\1\1\4\2\uffff\1\1\1\uffff\1\4\12"+
            "\uffff\1\4\1\1\1\uffff\3\1\1\4\2\uffff\1\1\5\uffff\1\4\11\uffff"+
            "\1\1\1\4\4\uffff\2\1\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\5\uffff\1\4\1\2\1\1\5\uffff\1\1\1\uffff\1\1\16\uffff\1"+
            "\4\2\uffff\3\4\3\uffff\1\1\1\uffff\2\1\10\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\1\3\1\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\13\uffff\2\1\1\4\1\uffff\2\4\3\uffff\1\4\1"+
            "\uffff\3\1\1\4\7\uffff\1\4\10\uffff\1\4\1\uffff\1\1\1\uffff"+
            "\1\5\1\1\1\uffff\1\1",
            "",
            "\1\1\4\uffff\2\1\2\uffff\2\1\5\uffff\1\1\4\uffff\1\1\12\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\5\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1\12\uffff\10\1\2\uffff"+
            "\2\1\7\uffff\2\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\15\uffff"+
            "\1\1\1\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\5\uffff\10\1\1\6\2\1",
            "\1\1\4\uffff\2\1\2\uffff\2\1\5\uffff\1\1\4\uffff\1\1\12\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\5\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1\12\uffff\10\1\2\uffff"+
            "\2\1\7\uffff\2\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\15\uffff"+
            "\1\1\1\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\5\uffff\10\1\1\6\2\1",
            "\1\1\4\uffff\2\1\2\uffff\2\1\5\uffff\1\1\4\uffff\1\1\12\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\5\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1\12\uffff\10\1\2\uffff"+
            "\2\1\7\uffff\2\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\15\uffff"+
            "\1\1\1\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\5\uffff\10\1\1\6\2\1",
            "",
            "\1\12\10\uffff\1\12\6\uffff\1\12\4\uffff\1\12\12\uffff\1\12"+
            "\5\uffff\1\12\10\uffff\1\12\12\uffff\1\12\7\uffff\1\12\1\uffff"+
            "\1\12\3\uffff\1\12\1\uffff\1\12\5\uffff\1\12\1\10\27\uffff\1"+
            "\12\2\uffff\3\12\17\uffff\3\12\1\uffff\1\12\4\uffff\1\11\1\12"+
            "\1\uffff\1\12\3\uffff\2\12\1\uffff\1\12\1\uffff\1\12\3\uffff"+
            "\1\12\15\uffff\1\12\1\uffff\2\12\3\uffff\1\12\4\uffff\1\12\7"+
            "\uffff\1\12\10\uffff\1\12\3\uffff\1\7",
            "",
            "\1\1\4\uffff\2\1\2\uffff\2\1\5\uffff\1\1\4\uffff\1\1\12\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\5\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1\12\uffff\10\1\2\uffff"+
            "\2\1\7\uffff\2\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\15\uffff"+
            "\1\1\1\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\5\uffff\10\1\1\6\2\1",
            "\1\1\4\uffff\2\1\2\uffff\2\1\5\uffff\1\1\4\uffff\1\1\12\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\5\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1\12\uffff\10\1\2\uffff"+
            "\2\1\7\uffff\2\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\15\uffff"+
            "\1\1\1\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\5\uffff\10\1\1\6\2\1",
            "\1\1\4\uffff\2\1\2\uffff\2\1\5\uffff\1\1\4\uffff\1\1\12\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\5\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1\12\uffff\10\1\2\uffff"+
            "\2\1\7\uffff\2\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\15\uffff"+
            "\1\1\1\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\5\uffff\10\1\1\6\2\1"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "268:1: selectSublist : ( expr ( ( AS )? ident )? -> ^( SELECT_ITEM expr ( ident )? ) | qname '.' '*' -> ^( ALL_COLUMNS qname ) | '*' -> ALL_COLUMNS );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_singleStatement515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_singleStatement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_singleExpression538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_singleExpression540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explainStmt_in_statement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showTablesStmt_in_statement577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showSchemasStmt_in_statement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showCatalogsStmt_in_statement593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showColumnsStmt_in_statement601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showPartitionsStmt_in_statement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showFunctionsStmt_in_statement617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTableStmt_in_statement625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTableStmt_in_statement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createMaterializedViewStmt_in_statement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refreshMaterializedViewStmt_in_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createAliasStmt_in_statement657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropAliasStmt_in_statement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpr_in_query682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withClause_in_queryExpr707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_orderOrLimitQuerySpec_in_queryExpr724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExprBody_in_queryExpr734 = new BitSet(new long[]{0x0000000000000002L,0x8000100000000000L});
    public static final BitSet FOLLOW_orderClause_in_queryExpr736 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_limitClause_in_queryExpr739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleQuery_in_orderOrLimitQuerySpec765 = new BitSet(new long[]{0x0000000000000000L,0x8000100000000000L});
    public static final BitSet FOLLOW_orderClause_in_orderOrLimitQuerySpec768 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_limitClause_in_orderOrLimitQuerySpec770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_orderOrLimitQuerySpec775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryTerm_in_queryExprBody809 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_UNION_in_queryExprBody825 = new BitSet(new long[]{0x0004000000000080L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_setQuant_in_queryExprBody827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_queryTerm_in_queryExprBody830 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_EXCEPT_in_queryExprBody860 = new BitSet(new long[]{0x0004000000000080L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_setQuant_in_queryExprBody862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_queryTerm_in_queryExprBody865 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_queryPrimary_in_queryTerm912 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_INTERSECT_in_queryTerm928 = new BitSet(new long[]{0x0004000000000080L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_setQuant_in_queryTerm930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_queryPrimary_in_queryTerm933 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_simpleQuery_in_queryPrimary967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSubquery_in_queryPrimary983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitTable_in_queryPrimary991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_explicitTable1008 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_table_in_explicitTable1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_simpleQuery1031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000088200L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fromClause_in_simpleQuery1039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000088000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_whereClause_in_simpleQuery1048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000088000L});
    public static final BitSet FOLLOW_groupClause_in_simpleQuery1057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_havingClause_in_simpleQuery1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_restrictedSelectStmt1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_fromClause_in_restrictedSelectStmt1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withClause1109 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC785CL,0x0000000000000040L});
    public static final BitSet FOLLOW_RECURSIVE_in_withClause1113 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_withList_in_withClause1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectClause1145 = new BitSet(new long[]{0x600C27B0029C2090L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002D40L});
    public static final BitSet FOLLOW_selectExpr_in_selectClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_fromClause1172 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableRef_in_fromClause1174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_fromClause1177 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableRef_in_fromClause1179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_WHERE_in_whereClause1207 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_whereClause1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_groupClause1234 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_BY_in_groupClause1236 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_groupClause1238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_groupClause1241 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_groupClause1243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1271 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_havingClause1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderClause1298 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_BY_in_orderClause1300 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_sortItem_in_orderClause1302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_orderClause1305 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_sortItem_in_orderClause1307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause1335 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_limitClause1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withQuery_in_withList1362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_withList1365 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_withQuery_in_withList1367 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ident_in_withQuery1395 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_aliasedColumns_in_withQuery1397 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_AS_in_withQuery1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_subquery_in_withQuery1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setQuant_in_selectExpr1432 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002D40L});
    public static final BitSet FOLLOW_selectList_in_selectExpr1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectSublist_in_selectList1477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_selectList1480 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002D40L});
    public static final BitSet FOLLOW_selectSublist_in_selectList1482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_expr_in_selectSublist1510 = new BitSet(new long[]{0x4008041002102412L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_selectSublist1513 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_selectSublist1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_selectSublist1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_206_in_selectSublist1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_selectSublist1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_selectSublist1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableFactor_in_tableRef1598 = new BitSet(new long[]{0x0000000400000002L,0x0008009001000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_CROSS_in_tableRef1614 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_JOIN_in_tableRef1616 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableFactor_in_tableRef1618 = new BitSet(new long[]{0x0000000400000002L,0x0008009001000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_joinType_in_tableRef1655 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_JOIN_in_tableRef1657 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableFactor_in_tableRef1659 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_joinCriteria_in_tableRef1661 = new BitSet(new long[]{0x0000000400000002L,0x0008009001000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_NATURAL_in_tableRef1686 = new BitSet(new long[]{0x0000000000000000L,0x0000009001000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_joinType_in_tableRef1688 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_JOIN_in_tableRef1690 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableFactor_in_tableRef1692 = new BitSet(new long[]{0x0000000400000002L,0x0008009001000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRATIFY_in_stratifyOn1763 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_ON_in_stratifyOn1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_stratifyOn1767 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_stratifyOn1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_stratifyOn1772 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_stratifyOn1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_stratifyOn1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tablePrimary_in_tableFactor1806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_TABLESAMPLE_in_tableFactor1822 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_sampleType_in_tableFactor1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_tableFactor1826 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_tableFactor1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_tableFactor1830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_stratifyOn_in_tableFactor1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_tablePrimary1871 = new BitSet(new long[]{0x4008041002102412L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_tablePrimary1887 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_tablePrimary1890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_aliasedColumns_in_tablePrimary1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_relation1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinedTable_in_relation1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSubquery_in_relation1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_table1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_tableSubquery1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_query_in_tableSubquery1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_tableSubquery1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_joinedTable2024 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableRef_in_joinedTable2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_joinedTable2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INNER_in_joinType2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_joinType2072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_OUTER_in_joinType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_joinType2088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_OUTER_in_joinType2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_in_joinType2103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_OUTER_in_joinType2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_joinCriteria2128 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_joinCriteria2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_joinCriteria2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_joinCriteria2173 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_joinCriteria2175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_joinCriteria2178 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_joinCriteria2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_joinCriteria2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_aliasedColumns2210 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_aliasedColumns2212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_aliasedColumns2215 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_aliasedColumns2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_aliasedColumns2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expr2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2264 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_OR_in_orExpression2267 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2270 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_notExpression_in_andExpression2289 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AND_in_andExpression2292 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_notExpression_in_andExpression2295 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NOT_in_notExpression2315 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_booleanTest_in_notExpression2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanPrimary_in_booleanTest2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_booleanPrimary2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_booleanPrimary2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_subquery_in_booleanPrimary2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2390 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_cmpOp_in_predicate2405 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2409 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_IS_in_predicate2464 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_DISTINCT_in_predicate2466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FROM_in_predicate2468 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2472 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_IS_in_predicate2516 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_NOT_in_predicate2518 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_DISTINCT_in_predicate2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FROM_in_predicate2522 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2526 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_BETWEEN_in_predicate2570 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2574 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AND_in_predicate2576 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2580 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_NOT_in_predicate2609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BETWEEN_in_predicate2611 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2615 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AND_in_predicate2617 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2621 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_LIKE_in_predicate2650 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2654 = new BitSet(new long[]{0x0C00000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_ESCAPE_in_predicate2657 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2661 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_NOT_in_predicate2694 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_LIKE_in_predicate2696 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2700 = new BitSet(new long[]{0x0C00000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_ESCAPE_in_predicate2703 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_predicatePrimary_in_predicate2707 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_IS_in_predicate2740 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_NULL_in_predicate2742 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_IS_in_predicate2811 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_NOT_in_predicate2813 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_NULL_in_predicate2815 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_IN_in_predicate2880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inList_in_predicate2882 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_NOT_in_predicate2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_predicate2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inList_in_predicate2955 = new BitSet(new long[]{0x0400000000004002L,0x0060C80100860000L});
    public static final BitSet FOLLOW_numericExpr_in_predicatePrimary3041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_208_in_predicatePrimary3056 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_numericExpr_in_predicatePrimary3060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_numericTerm_in_numericExpr3099 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_set_in_numericExpr3102 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_numericTerm_in_numericExpr3111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_numericFactor_in_numericTerm3130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000008480L});
    public static final BitSet FOLLOW_set_in_numericTerm3133 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_numericFactor_in_numericTerm3146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000008480L});
    public static final BitSet FOLLOW_203_in_numericFactor3165 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_exprPrimary_in_numericFactor3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_numericFactor3180 = new BitSet(new long[]{0x400827B0029C2010L,0x0307200050705158L,0x203D1B8008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_exprPrimary_in_numericFactor3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_exprPrimary3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qnameOrFunction_in_exprPrimary3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialFunction_in_exprPrimary3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_exprPrimary3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_exprPrimary3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_exprPrimary3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateValue_in_exprPrimary3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalValue_in_exprPrimary3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpression_in_exprPrimary3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_exprPrimary3291 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_exprPrimary3293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_exprPrimary3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_exprPrimary3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_qnameOrFunction3326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_qnameOrFunction3342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_qnameOrFunction3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_qnameOrFunction3346 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_over_in_qnameOrFunction3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_qnameOrFunction3398 = new BitSet(new long[]{0x600C27B0029C2090L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000003B40L});
    public static final BitSet FOLLOW_setQuant_in_qnameOrFunction3400 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000003B40L});
    public static final BitSet FOLLOW_expr_in_qnameOrFunction3403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_qnameOrFunction3407 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_qnameOrFunction3409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_qnameOrFunction3413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_over_in_qnameOrFunction3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_inList3471 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_inList3473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_inList3476 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_inList3478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_inList3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_inList3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sortItem3517 = new BitSet(new long[]{0x0000400000000800L,0x0400000000000000L});
    public static final BitSet FOLLOW_ordering_in_sortItem3519 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_nullOrdering_in_sortItem3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_ordering3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLS_in_nullOrdering3587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FIRST_in_nullOrdering3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLS_in_nullOrdering3601 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LAST_in_nullOrdering3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_subquery3662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_query_in_subquery3664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_subquery3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_dateValue3687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STRING_in_dateValue3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_dateValue3710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STRING_in_dateValue3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_dateValue3733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STRING_in_dateValue3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVAL_in_intervalValue3760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_intervalSign_in_intervalValue3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STRING_in_intervalValue3765 = new BitSet(new long[]{0x0000040000000000L,0x0006000000100000L,0x0000000000800000L,0x0000000000000040L});
    public static final BitSet FOLLOW_intervalQualifier_in_intervalValue3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_intervalSign3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_intervalSign3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonSecond_in_intervalQualifier3828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_intervalQualifier3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_intervalQualifier3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_intervalQualifier3870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_intervalQualifier3873 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_intervalQualifier3880 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_intervalQualifier3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_specialFunction3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_specialFunction3962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specialFunction3965 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_specialFunction3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_specialFunction3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_specialFunction4001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specialFunction4004 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_specialFunction4006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_specialFunction4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSTRING_in_specialFunction4035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specialFunction4037 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_specialFunction4039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FROM_in_specialFunction4041 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_specialFunction4043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FOR_in_specialFunction4046 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_specialFunction4048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_specialFunction4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTRACT_in_specialFunction4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specialFunction4082 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_specialFunction4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FROM_in_specialFunction4086 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_specialFunction4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_specialFunction4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_specialFunction4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specialFunction4123 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_specialFunction4125 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_AS_in_specialFunction4127 = new BitSet(new long[]{0x0010000000018000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_type_in_specialFunction4129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_specialFunction4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLIF_in_caseExpression4220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_caseExpression4222 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_caseExpression4226 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_caseExpression4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COALESCE_in_caseExpression4257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_caseExpression4259 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_caseExpression4264 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_caseExpression4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseExpression4291 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_whenClause_in_caseExpression4295 = new BitSet(new long[]{0x0300000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_elseClause_in_caseExpression4298 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_END_in_caseExpression4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseExpression4323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_whenClause_in_caseExpression4325 = new BitSet(new long[]{0x0300000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_elseClause_in_caseExpression4328 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_END_in_caseExpression4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_caseExpression4356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_caseExpression4358 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_caseExpression4362 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_caseExpression4367 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_caseExpression4369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_caseExpression4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_whenClause4404 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_whenClause4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_THEN_in_whenClause4408 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_whenClause4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseClause4437 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_elseClause4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVER_in_over4460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_over4462 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000081008L,0x0000000000000200L});
    public static final BitSet FOLLOW_window_in_over4464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_over4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowPartition_in_window4489 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000081000L});
    public static final BitSet FOLLOW_orderClause_in_window4494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000081000L});
    public static final BitSet FOLLOW_windowFrame_in_window4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARTITION_in_windowPartition4535 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_BY_in_windowPartition4537 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_windowPartition4539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_204_in_windowPartition4542 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_windowPartition4544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RANGE_in_windowFrame4572 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x207D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWS_in_windowFrame4613 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x207D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_windowFrame4655 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BETWEEN_in_windowFrame4657 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x207D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame4659 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AND_in_windowFrame4661 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x207D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWS_in_windowFrame4681 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BETWEEN_in_windowFrame4683 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x207D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame4685 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AND_in_windowFrame4687 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x207D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNBOUNDED_in_frameBound4717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PRECEDING_in_frameBound4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNBOUNDED_in_frameBound4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FOLLOWING_in_frameBound4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_in_frameBound4745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ROW_in_frameBound4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_frameBound4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_PRECEDING_in_frameBound4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOLLOWING_in_frameBound4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLAIN_in_explainStmt4828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_explainOptions_in_explainStmt4830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_query_in_explainStmt4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_explainOptions4861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0020000000000000L});
    public static final BitSet FOLLOW_explainOption_in_explainOptions4863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_explainOptions4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0020000000000000L});
    public static final BitSet FOLLOW_explainOption_in_explainOptions4868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_explainOptions4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORMAT_in_explainOption4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_TEXT_in_explainOption4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORMAT_in_explainOption4921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_GRAPHVIZ_in_explainOption4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_explainOption4940 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LOGICAL_in_explainOption4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_explainOption4962 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DISTRIBUTED_in_explainOption4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showTablesStmt4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_TABLES_in_showTablesStmt4991 = new BitSet(new long[]{0x0000000000000002L,0x0000080000800200L});
    public static final BitSet FOLLOW_showTablesFrom_in_showTablesStmt4995 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_showTablesLike_in_showTablesStmt5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_showTablesFrom5033 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_showTablesFrom5037 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_showTablesFrom5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIKE_in_showTablesLike5065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STRING_in_showTablesLike5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showSchemasStmt5095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SCHEMAS_in_showSchemasStmt5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showCatalogsStmt5118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CATALOGS_in_showCatalogsStmt5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showColumnsStmt5141 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLUMNS_in_showColumnsStmt5143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800200L});
    public static final BitSet FOLLOW_FROM_in_showColumnsStmt5146 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_showColumnsStmt5150 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_showColumnsStmt5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_showColumnsStmt5169 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_showColumnsStmt5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_showColumnsStmt5203 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_showColumnsStmt5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showPartitionsStmt5250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PARTITIONS_in_showPartitionsStmt5252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800200L});
    public static final BitSet FOLLOW_FROM_in_showPartitionsStmt5255 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_showPartitionsStmt5259 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_showPartitionsStmt5262 = new BitSet(new long[]{0x0000000000000002L,0x8000100000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_whereClause_in_showPartitionsStmt5266 = new BitSet(new long[]{0x0000000000000002L,0x8000100000000000L});
    public static final BitSet FOLLOW_orderClause_in_showPartitionsStmt5271 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_limitClause_in_showPartitionsStmt5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showFunctionsStmt5314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_FUNCTIONS_in_showFunctionsStmt5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_dropTableStmt5337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_TABLE_in_dropTableStmt5339 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_dropTableStmt5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createMaterializedViewStmt5366 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_MATERIALIZED_in_createMaterializedViewStmt5368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_VIEW_in_createMaterializedViewStmt5370 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_createMaterializedViewStmt5372 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_viewRefresh_in_createMaterializedViewStmt5376 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_AS_in_createMaterializedViewStmt5379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_restrictedSelectStmt_in_createMaterializedViewStmt5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFRESH_in_refreshMaterializedViewStmt5415 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_MATERIALIZED_in_refreshMaterializedViewStmt5417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_VIEW_in_refreshMaterializedViewStmt5419 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_refreshMaterializedViewStmt5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFRESH_in_viewRefresh5446 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_viewRefresh5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createAliasStmt5476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIAS_in_createAliasStmt5478 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_createAliasStmt5480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_forRemote_in_createAliasStmt5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_dropAliasStmt5509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIAS_in_dropAliasStmt5511 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_dropAliasStmt5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forRemote5538 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_forRemote5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createTableStmt5565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_TABLE_in_createTableStmt5567 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_qname_in_createTableStmt5569 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_tableContentsSource_in_createTableStmt5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_tableContentsSource5601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040001000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_query_in_tableContentsSource5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_tableElementList5624 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_tableElement_in_tableElementList5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_tableElementList5629 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_tableElement_in_tableElementList5631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_201_in_tableElementList5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_tableElement5661 = new BitSet(new long[]{0x00001A0000600000L,0x100000000C000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_dataType_in_tableElement5663 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_columnConstDef_in_tableElement5665 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_charType_in_dataType5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exactNumType_in_dataType5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateType_in_dataType5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_charType5729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_charlen_in_charType5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_charType5762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_charlen_in_charType5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_charType5790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_charlen_in_charType5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_charType5820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_VARYING_in_charType5822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_charlen_in_charType5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_charType5847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_VARYING_in_charType5849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_charlen_in_charType5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_charlen5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_charlen5880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_charlen5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_in_exactNumType5903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_numlen_in_exactNumType5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_exactNumType5923 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_numlen_in_exactNumType5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_exactNumType5943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_numlen_in_exactNumType5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_exactNumType5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_exactNumType5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_numlen6024 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_numlen6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_204_in_numlen6031 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_numlen6035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_numlen6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_dateType6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnConst_in_columnConstDef6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_columnConst6113 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_NULL_in_columnConst6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_qname6136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_206_in_qname6139 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000040L});
    public static final BitSet FOLLOW_ident_in_qname6141 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_ident6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_IDENT_in_ident6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonReserved_in_ident6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_VALUE_in_integer6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderOrLimitQuerySpec_in_synpred1_Statement719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_synpred2_Statement1936 = new BitSet(new long[]{0x4008041002102010L,0x0007200000305140L,0x20211A0008AC585CL,0x0000000000000140L});
    public static final BitSet FOLLOW_tableRef_in_synpred2_Statement1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_synpred2_Statement1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_synpred3_Statement3281 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_synpred3_Statement3283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_synpred3_Statement3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_synpred4_Statement3463 = new BitSet(new long[]{0x600827B0029C2010L,0x0347200050705158L,0x203D1B8008AC585CL,0x0000000000002940L});
    public static final BitSet FOLLOW_expr_in_synpred4_Statement3465 = new BitSet(new long[]{0x0000000000000002L});

}