// $ANTLR 3.4 com/facebook/presto/sql/parser/StatementBuilder.g 2014-05-07 14:42:05

    package com.facebook.presto.sql.parser;

    import com.facebook.presto.sql.tree.*;

    import java.util.ArrayList;
    import java.util.List;
    import com.google.common.collect.ImmutableList;
    import com.google.common.base.Objects;
    import com.google.common.base.Optional;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class StatementBuilder extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public StatementBuilder(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public StatementBuilder(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return StatementBuilder.tokenNames; }
    public String getGrammarFileName() { return "com/facebook/presto/sql/parser/StatementBuilder.g"; }


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


    public static class statement_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // com/facebook/presto/sql/parser/StatementBuilder.g:58:1: statement returns [Statement value] : ( query | explain | showTables | showSchemas | showCatalogs | showColumns | showPartitions | showFunctions | createTable | createMaterializedView | refreshMaterializedView | createAlias | dropAlias | dropTable );
    public final StatementBuilder.statement_return statement() throws RecognitionException {
        StatementBuilder.statement_return retval = new StatementBuilder.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.query_return query1 =null;

        StatementBuilder.explain_return explain2 =null;

        StatementBuilder.showTables_return showTables3 =null;

        StatementBuilder.showSchemas_return showSchemas4 =null;

        StatementBuilder.showCatalogs_return showCatalogs5 =null;

        StatementBuilder.showColumns_return showColumns6 =null;

        StatementBuilder.showPartitions_return showPartitions7 =null;

        StatementBuilder.showFunctions_return showFunctions8 =null;

        StatementBuilder.createTable_return createTable9 =null;

        StatementBuilder.createMaterializedView_return createMaterializedView10 =null;

        StatementBuilder.refreshMaterializedView_return refreshMaterializedView11 =null;

        StatementBuilder.createAlias_return createAlias12 =null;

        StatementBuilder.dropAlias_return dropAlias13 =null;

        StatementBuilder.dropTable_return dropTable14 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:59:5: ( query | explain | showTables | showSchemas | showCatalogs | showColumns | showPartitions | showFunctions | createTable | createMaterializedView | refreshMaterializedView | createAlias | dropAlias | dropTable )
            int alt1=14;
            switch ( input.LA(1) ) {
            case QUERY:
                {
                alt1=1;
                }
                break;
            case EXPLAIN:
                {
                alt1=2;
                }
                break;
            case SHOW_TABLES:
                {
                alt1=3;
                }
                break;
            case SHOW_SCHEMAS:
                {
                alt1=4;
                }
                break;
            case SHOW_CATALOGS:
                {
                alt1=5;
                }
                break;
            case SHOW_COLUMNS:
                {
                alt1=6;
                }
                break;
            case SHOW_PARTITIONS:
                {
                alt1=7;
                }
                break;
            case SHOW_FUNCTIONS:
                {
                alt1=8;
                }
                break;
            case CREATE_TABLE:
                {
                alt1=9;
                }
                break;
            case CREATE_MATERIALIZED_VIEW:
                {
                alt1=10;
                }
                break;
            case REFRESH_MATERIALIZED_VIEW:
                {
                alt1=11;
                }
                break;
            case CREATE_ALIAS:
                {
                alt1=12;
                }
                break;
            case DROP_ALIAS:
                {
                alt1=13;
                }
                break;
            case DROP_TABLE:
                {
                alt1=14;
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:59:7: query
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_query_in_statement80);
                    query1=query();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, query1.getTree());


                    if ( state.backtracking==0 ) { retval.value = (query1!=null?query1.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:60:7: explain
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_explain_in_statement110);
                    explain2=explain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, explain2.getTree());


                    if ( state.backtracking==0 ) { retval.value = (explain2!=null?explain2.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:61:7: showTables
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_showTables_in_statement138);
                    showTables3=showTables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, showTables3.getTree());


                    if ( state.backtracking==0 ) { retval.value = (showTables3!=null?showTables3.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:62:7: showSchemas
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_showSchemas_in_statement163);
                    showSchemas4=showSchemas();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, showSchemas4.getTree());


                    if ( state.backtracking==0 ) { retval.value = (showSchemas4!=null?showSchemas4.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:63:7: showCatalogs
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_showCatalogs_in_statement187);
                    showCatalogs5=showCatalogs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, showCatalogs5.getTree());


                    if ( state.backtracking==0 ) { retval.value = (showCatalogs5!=null?showCatalogs5.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:64:7: showColumns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_showColumns_in_statement210);
                    showColumns6=showColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, showColumns6.getTree());


                    if ( state.backtracking==0 ) { retval.value = (showColumns6!=null?showColumns6.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:65:7: showPartitions
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_showPartitions_in_statement234);
                    showPartitions7=showPartitions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, showPartitions7.getTree());


                    if ( state.backtracking==0 ) { retval.value = (showPartitions7!=null?showPartitions7.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:66:7: showFunctions
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_showFunctions_in_statement255);
                    showFunctions8=showFunctions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, showFunctions8.getTree());


                    if ( state.backtracking==0 ) { retval.value = (showFunctions8!=null?showFunctions8.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:67:7: createTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_createTable_in_statement277);
                    createTable9=createTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, createTable9.getTree());


                    if ( state.backtracking==0 ) { retval.value = (createTable9!=null?createTable9.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:68:7: createMaterializedView
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_createMaterializedView_in_statement301);
                    createMaterializedView10=createMaterializedView();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, createMaterializedView10.getTree());


                    if ( state.backtracking==0 ) { retval.value = (createMaterializedView10!=null?createMaterializedView10.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:69:7: refreshMaterializedView
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_refreshMaterializedView_in_statement314);
                    refreshMaterializedView11=refreshMaterializedView();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, refreshMaterializedView11.getTree());


                    if ( state.backtracking==0 ) { retval.value = (refreshMaterializedView11!=null?refreshMaterializedView11.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:70:7: createAlias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_createAlias_in_statement326);
                    createAlias12=createAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, createAlias12.getTree());


                    if ( state.backtracking==0 ) { retval.value = (createAlias12!=null?createAlias12.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:71:7: dropAlias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_dropAlias_in_statement350);
                    dropAlias13=dropAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, dropAlias13.getTree());


                    if ( state.backtracking==0 ) { retval.value = (dropAlias13!=null?dropAlias13.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:72:7: dropTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_dropTable_in_statement376);
                    dropTable14=dropTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, dropTable14.getTree());


                    if ( state.backtracking==0 ) { retval.value = (dropTable14!=null?dropTable14.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class query_return extends TreeRuleReturnScope {
        public Query value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // com/facebook/presto/sql/parser/StatementBuilder.g:75:1: query returns [Query value] : ^( QUERY queryExpr ) ;
    public final StatementBuilder.query_return query() throws RecognitionException {
        StatementBuilder.query_return retval = new StatementBuilder.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUERY15=null;
        StatementBuilder.queryExpr_return queryExpr16 =null;


        CommonTree QUERY15_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:76:5: ( ^( QUERY queryExpr ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:76:7: ^( QUERY queryExpr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUERY15=(CommonTree)match(input,QUERY,FOLLOW_QUERY_in_query416); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUERY15_tree = (CommonTree)adaptor.dupNode(QUERY15);


            root_1 = (CommonTree)adaptor.becomeRoot(QUERY15_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_queryExpr_in_query418);
            queryExpr16=queryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, queryExpr16.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (queryExpr16!=null?queryExpr16.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class queryExpr_return extends TreeRuleReturnScope {
        public Query value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryExpr"
    // com/facebook/presto/sql/parser/StatementBuilder.g:79:1: queryExpr returns [Query value] : ( withClause )? queryBody ( orderClause )? ( limitClause )? ;
    public final StatementBuilder.queryExpr_return queryExpr() throws RecognitionException {
        StatementBuilder.queryExpr_return retval = new StatementBuilder.queryExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.withClause_return withClause17 =null;

        StatementBuilder.queryBody_return queryBody18 =null;

        StatementBuilder.orderClause_return orderClause19 =null;

        StatementBuilder.limitClause_return limitClause20 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:80:5: ( ( withClause )? queryBody ( orderClause )? ( limitClause )? )
            // com/facebook/presto/sql/parser/StatementBuilder.g:80:7: ( withClause )? queryBody ( orderClause )? ( limitClause )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/StatementBuilder.g:80:7: ( withClause )?
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:80:7: withClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_withClause_in_queryExpr442);
                    withClause17=withClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, withClause17.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_queryBody_in_queryExpr451);
            queryBody18=queryBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, queryBody18.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:82:7: ( orderClause )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case ORDER_BY:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:82:7: orderClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderClause_in_queryExpr459);
                    orderClause19=orderClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, orderClause19.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:83:7: ( limitClause )?
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:83:7: limitClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_queryExpr468);
                    limitClause20=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, limitClause20.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            if ( state.backtracking==0 ) { retval.value = new Query(
                        Optional.fromNullable((withClause17!=null?withClause17.value:null)),
                        (queryBody18!=null?queryBody18.value:null),
                        Objects.firstNonNull((orderClause19!=null?orderClause19.value:null), ImmutableList.<SortItem>of()),
                        Optional.fromNullable((limitClause20!=null?limitClause20.value:null)));
                    }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "queryExpr"


    public static class queryBody_return extends TreeRuleReturnScope {
        public QueryBody value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryBody"
    // com/facebook/presto/sql/parser/StatementBuilder.g:92:1: queryBody returns [QueryBody value] : ( querySpec | setOperation | tableSubquery | namedTable );
    public final StatementBuilder.queryBody_return queryBody() throws RecognitionException {
        StatementBuilder.queryBody_return retval = new StatementBuilder.queryBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.querySpec_return querySpec21 =null;

        StatementBuilder.setOperation_return setOperation22 =null;

        StatementBuilder.tableSubquery_return tableSubquery23 =null;

        StatementBuilder.namedTable_return namedTable24 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:93:5: ( querySpec | setOperation | tableSubquery | namedTable )
            int alt5=4;
            switch ( input.LA(1) ) {
            case QUERY_SPEC:
                {
                alt5=1;
                }
                break;
            case EXCEPT:
            case INTERSECT:
            case UNION:
                {
                alt5=2;
                }
                break;
            case TABLE_SUBQUERY:
                {
                alt5=3;
                }
                break;
            case TABLE:
                {
                alt5=4;
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:93:7: querySpec
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_querySpec_in_queryBody500);
                    querySpec21=querySpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, querySpec21.getTree());


                    if ( state.backtracking==0 ) { retval.value = (querySpec21!=null?querySpec21.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:94:7: setOperation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_setOperation_in_queryBody522);
                    setOperation22=setOperation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, setOperation22.getTree());


                    if ( state.backtracking==0 ) { retval.value = (setOperation22!=null?setOperation22.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:95:7: tableSubquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tableSubquery_in_queryBody541);
                    tableSubquery23=tableSubquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, tableSubquery23.getTree());


                    if ( state.backtracking==0 ) { retval.value = (tableSubquery23!=null?tableSubquery23.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:96:7: namedTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_namedTable_in_queryBody559);
                    namedTable24=namedTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, namedTable24.getTree());


                    if ( state.backtracking==0 ) { retval.value = (namedTable24!=null?namedTable24.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "queryBody"


    public static class querySpec_return extends TreeRuleReturnScope {
        public QuerySpecification value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "querySpec"
    // com/facebook/presto/sql/parser/StatementBuilder.g:99:1: querySpec returns [QuerySpecification value] : ^( QUERY_SPEC selectClause ( fromClause )? ( whereClause )? ( groupClause )? ( havingClause )? ( orderClause )? ( limitClause )? ) ;
    public final StatementBuilder.querySpec_return querySpec() throws RecognitionException {
        StatementBuilder.querySpec_return retval = new StatementBuilder.querySpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUERY_SPEC25=null;
        StatementBuilder.selectClause_return selectClause26 =null;

        StatementBuilder.fromClause_return fromClause27 =null;

        StatementBuilder.whereClause_return whereClause28 =null;

        StatementBuilder.groupClause_return groupClause29 =null;

        StatementBuilder.havingClause_return havingClause30 =null;

        StatementBuilder.orderClause_return orderClause31 =null;

        StatementBuilder.limitClause_return limitClause32 =null;


        CommonTree QUERY_SPEC25_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:100:5: ( ^( QUERY_SPEC selectClause ( fromClause )? ( whereClause )? ( groupClause )? ( havingClause )? ( orderClause )? ( limitClause )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:100:7: ^( QUERY_SPEC selectClause ( fromClause )? ( whereClause )? ( groupClause )? ( havingClause )? ( orderClause )? ( limitClause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUERY_SPEC25=(CommonTree)match(input,QUERY_SPEC,FOLLOW_QUERY_SPEC_in_querySpec594); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUERY_SPEC25_tree = (CommonTree)adaptor.dupNode(QUERY_SPEC25);


            root_1 = (CommonTree)adaptor.becomeRoot(QUERY_SPEC25_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_querySpec604);
            selectClause26=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, selectClause26.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:102:9: ( fromClause )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:102:9: fromClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fromClause_in_querySpec614);
                    fromClause27=fromClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, fromClause27.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:103:9: ( whereClause )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case WHERE:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:103:9: whereClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_querySpec625);
                    whereClause28=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, whereClause28.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:104:9: ( groupClause )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case GROUP_BY:
                    {
                    alt8=1;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:104:9: groupClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupClause_in_querySpec636);
                    groupClause29=groupClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, groupClause29.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:105:9: ( havingClause )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case HAVING:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:105:9: havingClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_havingClause_in_querySpec647);
                    havingClause30=havingClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, havingClause30.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:106:9: ( orderClause )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case ORDER_BY:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:106:9: orderClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderClause_in_querySpec658);
                    orderClause31=orderClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, orderClause31.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:107:9: ( limitClause )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case LIMIT:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:107:9: limitClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_querySpec669);
                    limitClause32=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, limitClause32.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new QuerySpecification(
                        (selectClause26!=null?selectClause26.value:null),
                        (fromClause27!=null?fromClause27.value:null),
                        Optional.fromNullable((whereClause28!=null?whereClause28.value:null)),
                        Objects.firstNonNull((groupClause29!=null?groupClause29.value:null), ImmutableList.<Expression>of()),
                        Optional.fromNullable((havingClause30!=null?havingClause30.value:null)),
                        Objects.firstNonNull((orderClause31!=null?orderClause31.value:null), ImmutableList.<SortItem>of()),
                        Optional.fromNullable((limitClause32!=null?limitClause32.value:null)));
                    }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "querySpec"


    public static class setOperation_return extends TreeRuleReturnScope {
        public SetOperation value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setOperation"
    // com/facebook/presto/sql/parser/StatementBuilder.g:119:1: setOperation returns [SetOperation value] : ( ^( UNION q1= queryBody q2= queryBody d= distinct[true] ) | ^( INTERSECT q1= queryBody q2= queryBody d= distinct[true] ) | ^( EXCEPT q1= queryBody q2= queryBody d= distinct[true] ) );
    public final StatementBuilder.setOperation_return setOperation() throws RecognitionException {
        StatementBuilder.setOperation_return retval = new StatementBuilder.setOperation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNION33=null;
        CommonTree INTERSECT34=null;
        CommonTree EXCEPT35=null;
        StatementBuilder.queryBody_return q1 =null;

        StatementBuilder.queryBody_return q2 =null;

        StatementBuilder.distinct_return d =null;


        CommonTree UNION33_tree=null;
        CommonTree INTERSECT34_tree=null;
        CommonTree EXCEPT35_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:120:5: ( ^( UNION q1= queryBody q2= queryBody d= distinct[true] ) | ^( INTERSECT q1= queryBody q2= queryBody d= distinct[true] ) | ^( EXCEPT q1= queryBody q2= queryBody d= distinct[true] ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt12=1;
                }
                break;
            case INTERSECT:
                {
                alt12=2;
                }
                break;
            case EXCEPT:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:120:7: ^( UNION q1= queryBody q2= queryBody d= distinct[true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UNION33=(CommonTree)match(input,UNION,FOLLOW_UNION_in_setOperation703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNION33_tree = (CommonTree)adaptor.dupNode(UNION33);


                    root_1 = (CommonTree)adaptor.becomeRoot(UNION33_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_queryBody_in_setOperation707);
                    q1=queryBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_queryBody_in_setOperation711);
                    q2=queryBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q2.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_distinct_in_setOperation715);
                    d=distinct(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, d.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new Union(ImmutableList.<Relation>of((q1!=null?q1.value:null), (q2!=null?q2.value:null)), (d!=null?d.value:false)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:121:7: ^( INTERSECT q1= queryBody q2= queryBody d= distinct[true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    INTERSECT34=(CommonTree)match(input,INTERSECT,FOLLOW_INTERSECT_in_setOperation734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERSECT34_tree = (CommonTree)adaptor.dupNode(INTERSECT34);


                    root_1 = (CommonTree)adaptor.becomeRoot(INTERSECT34_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_queryBody_in_setOperation738);
                    q1=queryBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_queryBody_in_setOperation742);
                    q2=queryBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q2.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_distinct_in_setOperation746);
                    d=distinct(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, d.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new Intersect(ImmutableList.<Relation>of((q1!=null?q1.value:null), (q2!=null?q2.value:null)), (d!=null?d.value:false)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:122:7: ^( EXCEPT q1= queryBody q2= queryBody d= distinct[true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXCEPT35=(CommonTree)match(input,EXCEPT,FOLLOW_EXCEPT_in_setOperation761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXCEPT35_tree = (CommonTree)adaptor.dupNode(EXCEPT35);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXCEPT35_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_queryBody_in_setOperation765);
                    q1=queryBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_queryBody_in_setOperation769);
                    q2=queryBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q2.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_distinct_in_setOperation773);
                    d=distinct(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, d.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new Except((q1!=null?q1.value:null), (q2!=null?q2.value:null), (d!=null?d.value:false)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "setOperation"


    public static class restrictedSelectStmt_return extends TreeRuleReturnScope {
        public Query value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "restrictedSelectStmt"
    // com/facebook/presto/sql/parser/StatementBuilder.g:125:1: restrictedSelectStmt returns [Query value] : selectClause fromClause ;
    public final StatementBuilder.restrictedSelectStmt_return restrictedSelectStmt() throws RecognitionException {
        StatementBuilder.restrictedSelectStmt_return retval = new StatementBuilder.restrictedSelectStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.selectClause_return selectClause36 =null;

        StatementBuilder.fromClause_return fromClause37 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:126:5: ( selectClause fromClause )
            // com/facebook/presto/sql/parser/StatementBuilder.g:126:7: selectClause fromClause
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_restrictedSelectStmt803);
            selectClause36=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, selectClause36.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_fromClause_in_restrictedSelectStmt805);
            fromClause37=fromClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, fromClause37.getTree());


            if ( state.backtracking==0 ) { retval.value = new Query(
                        Optional.<With>absent(),
                        new QuerySpecification(
                            (selectClause36!=null?selectClause36.value:null),
                            (fromClause37!=null?fromClause37.value:null),
                            Optional.<Expression>absent(),
                            ImmutableList.<Expression>of(),
                            Optional.<Expression>absent(),
                            ImmutableList.<SortItem>of(),
                            Optional.<String>absent()),
                        ImmutableList.<SortItem>of(),
                        Optional.<String>absent());
                    }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "restrictedSelectStmt"


    public static class withClause_return extends TreeRuleReturnScope {
        public With value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:142:1: withClause returns [With value] : ^( WITH recursive withList ) ;
    public final StatementBuilder.withClause_return withClause() throws RecognitionException {
        StatementBuilder.withClause_return retval = new StatementBuilder.withClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WITH38=null;
        StatementBuilder.recursive_return recursive39 =null;

        StatementBuilder.withList_return withList40 =null;


        CommonTree WITH38_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:143:5: ( ^( WITH recursive withList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:143:7: ^( WITH recursive withList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WITH38=(CommonTree)match(input,WITH,FOLLOW_WITH_in_withClause837); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WITH38_tree = (CommonTree)adaptor.dupNode(WITH38);


            root_1 = (CommonTree)adaptor.becomeRoot(WITH38_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_recursive_in_withClause839);
            recursive39=recursive();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, recursive39.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_withList_in_withClause841);
            withList40=withList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, withList40.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new With((recursive39!=null?recursive39.value:false), (withList40!=null?withList40.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "withClause"


    public static class recursive_return extends TreeRuleReturnScope {
        public boolean value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "recursive"
    // com/facebook/presto/sql/parser/StatementBuilder.g:146:1: recursive returns [boolean value] : ( RECURSIVE |);
    public final StatementBuilder.recursive_return recursive() throws RecognitionException {
        StatementBuilder.recursive_return retval = new StatementBuilder.recursive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RECURSIVE41=null;

        CommonTree RECURSIVE41_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:147:5: ( RECURSIVE |)
            int alt13=2;
            switch ( input.LA(1) ) {
            case RECURSIVE:
                {
                alt13=1;
                }
                break;
            case WITH_LIST:
                {
                alt13=2;
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:147:7: RECURSIVE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    RECURSIVE41=(CommonTree)match(input,RECURSIVE,FOLLOW_RECURSIVE_in_recursive865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RECURSIVE41_tree = (CommonTree)adaptor.dupNode(RECURSIVE41);


                    adaptor.addChild(root_0, RECURSIVE41_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = true; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:148:17: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) { retval.value = false; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "recursive"


    public static class withList_return extends TreeRuleReturnScope {
        public List<WithQuery> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withList"
    // com/facebook/presto/sql/parser/StatementBuilder.g:151:1: withList returns [List<WithQuery> value = new ArrayList<>()] : ^( WITH_LIST ( withQuery )+ ) ;
    public final StatementBuilder.withList_return withList() throws RecognitionException {
        StatementBuilder.withList_return retval = new StatementBuilder.withList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WITH_LIST42=null;
        StatementBuilder.withQuery_return withQuery43 =null;


        CommonTree WITH_LIST42_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:152:5: ( ^( WITH_LIST ( withQuery )+ ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:152:7: ^( WITH_LIST ( withQuery )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WITH_LIST42=(CommonTree)match(input,WITH_LIST,FOLLOW_WITH_LIST_in_withList907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WITH_LIST42_tree = (CommonTree)adaptor.dupNode(WITH_LIST42);


            root_1 = (CommonTree)adaptor.becomeRoot(WITH_LIST42_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // com/facebook/presto/sql/parser/StatementBuilder.g:152:19: ( withQuery )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case WITH_QUERY:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:152:21: withQuery
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_withQuery_in_withList911);
            	    withQuery43=withQuery();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, withQuery43.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((withQuery43!=null?withQuery43.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "withList"


    public static class withQuery_return extends TreeRuleReturnScope {
        public WithQuery value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withQuery"
    // com/facebook/presto/sql/parser/StatementBuilder.g:155:1: withQuery returns [WithQuery value] : ^( WITH_QUERY i= ident q= query (c= aliasedColumns )? ) ;
    public final StatementBuilder.withQuery_return withQuery() throws RecognitionException {
        StatementBuilder.withQuery_return retval = new StatementBuilder.withQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WITH_QUERY44=null;
        StatementBuilder.ident_return i =null;

        StatementBuilder.query_return q =null;

        StatementBuilder.aliasedColumns_return c =null;


        CommonTree WITH_QUERY44_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:156:5: ( ^( WITH_QUERY i= ident q= query (c= aliasedColumns )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:156:7: ^( WITH_QUERY i= ident q= query (c= aliasedColumns )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WITH_QUERY44=(CommonTree)match(input,WITH_QUERY,FOLLOW_WITH_QUERY_in_withQuery940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WITH_QUERY44_tree = (CommonTree)adaptor.dupNode(WITH_QUERY44);


            root_1 = (CommonTree)adaptor.becomeRoot(WITH_QUERY44_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ident_in_withQuery944);
            i=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, i.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_query_in_withQuery948);
            q=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, q.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:156:37: (c= aliasedColumns )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case ALIASED_COLUMNS:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:156:37: c= aliasedColumns
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_aliasedColumns_in_withQuery952);
                    c=aliasedColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, c.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new WithQuery((i!=null?i.value:null), (q!=null?q.value:null), (c!=null?c.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "withQuery"


    public static class selectClause_return extends TreeRuleReturnScope {
        public Select value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:159:1: selectClause returns [Select value] : ^( SELECT d= distinct[false] s= selectList ) ;
    public final StatementBuilder.selectClause_return selectClause() throws RecognitionException {
        StatementBuilder.selectClause_return retval = new StatementBuilder.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT45=null;
        StatementBuilder.distinct_return d =null;

        StatementBuilder.selectList_return s =null;


        CommonTree SELECT45_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:160:5: ( ^( SELECT d= distinct[false] s= selectList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:160:7: ^( SELECT d= distinct[false] s= selectList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT45=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectClause978); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SELECT45_tree = (CommonTree)adaptor.dupNode(SELECT45);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT45_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_distinct_in_selectClause982);
                d=distinct(false);

                state._fsp--;
                if (state.failed) return retval;
                if ( state.backtracking==0 ) 
                adaptor.addChild(root_1, d.getTree());


                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_selectList_in_selectClause987);
                s=selectList();

                state._fsp--;
                if (state.failed) return retval;
                if ( state.backtracking==0 ) 
                adaptor.addChild(root_1, s.getTree());


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new Select((d!=null?d.value:false), (s!=null?s.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class distinct_return extends TreeRuleReturnScope {
        public boolean value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "distinct"
    // com/facebook/presto/sql/parser/StatementBuilder.g:163:1: distinct[boolean defaultValue] returns [boolean value] : ( DISTINCT | ALL |);
    public final StatementBuilder.distinct_return distinct(boolean defaultValue) throws RecognitionException {
        StatementBuilder.distinct_return retval = new StatementBuilder.distinct_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTINCT46=null;
        CommonTree ALL47=null;

        CommonTree DISTINCT46_tree=null;
        CommonTree ALL47_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:164:5: ( DISTINCT | ALL |)
            int alt16=3;
            switch ( input.LA(1) ) {
            case DISTINCT:
                {
                alt16=1;
                }
                break;
            case ALL:
                {
                alt16=2;
                }
                break;
            case UP:
            case AND:
            case BETWEEN:
            case CAST:
            case COALESCE:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case DATE:
            case DECIMAL_VALUE:
            case EQ:
            case EXISTS:
            case EXTRACT:
            case FALSE:
            case FUNCTION_CALL:
            case GT:
            case GTE:
            case IF:
            case IN:
            case INTEGER_VALUE:
            case INTERVAL:
            case IN_LIST:
            case IS_DISTINCT_FROM:
            case IS_NOT_NULL:
            case IS_NULL:
            case LIKE:
            case LT:
            case LTE:
            case NEGATIVE:
            case NEQ:
            case NOT:
            case NULL:
            case NULLIF:
            case OR:
            case QNAME:
            case QUERY:
            case SEARCHED_CASE:
            case SELECT_LIST:
            case SIMPLE_CASE:
            case STRING:
            case TIME:
            case TIMESTAMP:
            case TRUE:
            case 199:
            case 202:
            case 203:
            case 205:
            case 207:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:164:7: DISTINCT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DISTINCT46=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_distinct1012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DISTINCT46_tree = (CommonTree)adaptor.dupNode(DISTINCT46);


                    adaptor.addChild(root_0, DISTINCT46_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = true; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:165:7: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ALL47=(CommonTree)match(input,ALL,FOLLOW_ALL_in_distinct1023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ALL47_tree = (CommonTree)adaptor.dupNode(ALL47);


                    adaptor.addChild(root_0, ALL47_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = false; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:166:17: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) { retval.value = defaultValue; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "distinct"


    public static class selectList_return extends TreeRuleReturnScope {
        public List<SelectItem> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectList"
    // com/facebook/presto/sql/parser/StatementBuilder.g:169:1: selectList returns [List<SelectItem> value = new ArrayList<>()] : ^( SELECT_LIST ( selectItem )+ ) ;
    public final StatementBuilder.selectList_return selectList() throws RecognitionException {
        StatementBuilder.selectList_return retval = new StatementBuilder.selectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_LIST48=null;
        StatementBuilder.selectItem_return selectItem49 =null;


        CommonTree SELECT_LIST48_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:170:5: ( ^( SELECT_LIST ( selectItem )+ ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:170:7: ^( SELECT_LIST ( selectItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT_LIST48=(CommonTree)match(input,SELECT_LIST,FOLLOW_SELECT_LIST_in_selectList1071); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SELECT_LIST48_tree = (CommonTree)adaptor.dupNode(SELECT_LIST48);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_LIST48_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // com/facebook/presto/sql/parser/StatementBuilder.g:170:21: ( selectItem )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case ALL_COLUMNS:
                case SELECT_ITEM:
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:170:23: selectItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_selectItem_in_selectList1075);
            	    selectItem49=selectItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, selectItem49.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((selectItem49!=null?selectItem49.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectList"


    public static class selectItem_return extends TreeRuleReturnScope {
        public SelectItem value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectItem"
    // com/facebook/presto/sql/parser/StatementBuilder.g:173:1: selectItem returns [SelectItem value] : ( ^( SELECT_ITEM expr ( ident )? ) | ( ^( ALL_COLUMNS qname ) )=> ^( ALL_COLUMNS qname ) | ALL_COLUMNS );
    public final StatementBuilder.selectItem_return selectItem() throws RecognitionException {
        StatementBuilder.selectItem_return retval = new StatementBuilder.selectItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_ITEM50=null;
        CommonTree ALL_COLUMNS53=null;
        CommonTree ALL_COLUMNS55=null;
        StatementBuilder.expr_return expr51 =null;

        StatementBuilder.ident_return ident52 =null;

        StatementBuilder.qname_return qname54 =null;


        CommonTree SELECT_ITEM50_tree=null;
        CommonTree ALL_COLUMNS53_tree=null;
        CommonTree ALL_COLUMNS55_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:174:5: ( ^( SELECT_ITEM expr ( ident )? ) | ( ^( ALL_COLUMNS qname ) )=> ^( ALL_COLUMNS qname ) | ALL_COLUMNS )
            int alt19=3;
            switch ( input.LA(1) ) {
            case SELECT_ITEM:
                {
                alt19=1;
                }
                break;
            case ALL_COLUMNS:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==DOWN) && (synpred1_StatementBuilder())) {
                    alt19=2;
                }
                else if ( (LA19_2==UP||LA19_2==ALL_COLUMNS||LA19_2==SELECT_ITEM) ) {
                    alt19=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:175:7: ^( SELECT_ITEM expr ( ident )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_ITEM50=(CommonTree)match(input,SELECT_ITEM,FOLLOW_SELECT_ITEM_in_selectItem1110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SELECT_ITEM50_tree = (CommonTree)adaptor.dupNode(SELECT_ITEM50);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_ITEM50_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_selectItem1112);
                    expr51=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr51.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:175:26: ( ident )?
                    int alt18=2;
                    switch ( input.LA(1) ) {
                        case IDENT:
                        case QUOTED_IDENT:
                            {
                            alt18=1;
                            }
                            break;
                    }

                    switch (alt18) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:175:26: ident
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_ident_in_selectItem1114);
                            ident52=ident();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, ident52.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new SingleColumn((expr51!=null?expr51.value:null), Optional.fromNullable((ident52!=null?ident52.value:null))); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:176:7: ( ^( ALL_COLUMNS qname ) )=> ^( ALL_COLUMNS qname )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ALL_COLUMNS53=(CommonTree)match(input,ALL_COLUMNS,FOLLOW_ALL_COLUMNS_in_selectItem1159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ALL_COLUMNS53_tree = (CommonTree)adaptor.dupNode(ALL_COLUMNS53);


                    root_1 = (CommonTree)adaptor.becomeRoot(ALL_COLUMNS53_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_qname_in_selectItem1161);
                    qname54=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, qname54.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new AllColumns((qname54!=null?qname54.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:177:7: ALL_COLUMNS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ALL_COLUMNS55=(CommonTree)match(input,ALL_COLUMNS,FOLLOW_ALL_COLUMNS_in_selectItem1174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ALL_COLUMNS55_tree = (CommonTree)adaptor.dupNode(ALL_COLUMNS55);


                    adaptor.addChild(root_0, ALL_COLUMNS55_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new AllColumns(); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectItem"


    public static class fromClause_return extends TreeRuleReturnScope {
        public List<Relation> value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:180:1: fromClause returns [List<Relation> value] : ^( FROM t= relationList ) ;
    public final StatementBuilder.fromClause_return fromClause() throws RecognitionException {
        StatementBuilder.fromClause_return retval = new StatementBuilder.fromClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FROM56=null;
        StatementBuilder.relationList_return t =null;


        CommonTree FROM56_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:181:5: ( ^( FROM t= relationList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:181:7: ^( FROM t= relationList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FROM56=(CommonTree)match(input,FROM,FOLLOW_FROM_in_fromClause1235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FROM56_tree = (CommonTree)adaptor.dupNode(FROM56);


            root_1 = (CommonTree)adaptor.becomeRoot(FROM56_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_relationList_in_fromClause1239);
            t=relationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, t.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (t!=null?t.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fromClause"


    public static class whereClause_return extends TreeRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:184:1: whereClause returns [Expression value] : ^( WHERE expr ) ;
    public final StatementBuilder.whereClause_return whereClause() throws RecognitionException {
        StatementBuilder.whereClause_return retval = new StatementBuilder.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE57=null;
        StatementBuilder.expr_return expr58 =null;


        CommonTree WHERE57_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:185:5: ( ^( WHERE expr ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:185:7: ^( WHERE expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE57=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_whereClause1264); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHERE57_tree = (CommonTree)adaptor.dupNode(WHERE57);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE57_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_whereClause1266);
            expr58=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr58.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (expr58!=null?expr58.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class groupClause_return extends TreeRuleReturnScope {
        public List<Expression> value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:188:1: groupClause returns [List<Expression> value] : ^( GROUP_BY exprList ) ;
    public final StatementBuilder.groupClause_return groupClause() throws RecognitionException {
        StatementBuilder.groupClause_return retval = new StatementBuilder.groupClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_BY59=null;
        StatementBuilder.exprList_return exprList60 =null;


        CommonTree GROUP_BY59_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:189:5: ( ^( GROUP_BY exprList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:189:7: ^( GROUP_BY exprList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GROUP_BY59=(CommonTree)match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause1291); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GROUP_BY59_tree = (CommonTree)adaptor.dupNode(GROUP_BY59);


            root_1 = (CommonTree)adaptor.becomeRoot(GROUP_BY59_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_exprList_in_groupClause1293);
                exprList60=exprList();

                state._fsp--;
                if (state.failed) return retval;
                if ( state.backtracking==0 ) 
                adaptor.addChild(root_1, exprList60.getTree());


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (exprList60!=null?exprList60.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupClause"


    public static class havingClause_return extends TreeRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:192:1: havingClause returns [Expression value] : ^( HAVING expr ) ;
    public final StatementBuilder.havingClause_return havingClause() throws RecognitionException {
        StatementBuilder.havingClause_return retval = new StatementBuilder.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree HAVING61=null;
        StatementBuilder.expr_return expr62 =null;


        CommonTree HAVING61_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:193:5: ( ^( HAVING expr ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:193:7: ^( HAVING expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            HAVING61=(CommonTree)match(input,HAVING,FOLLOW_HAVING_in_havingClause1318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HAVING61_tree = (CommonTree)adaptor.dupNode(HAVING61);


            root_1 = (CommonTree)adaptor.becomeRoot(HAVING61_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_havingClause1320);
            expr62=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr62.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (expr62!=null?expr62.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class orderClause_return extends TreeRuleReturnScope {
        public List<SortItem> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:196:1: orderClause returns [List<SortItem> value = new ArrayList<>()] : ^( ORDER_BY ( sortItem )+ ) ;
    public final StatementBuilder.orderClause_return orderClause() throws RecognitionException {
        StatementBuilder.orderClause_return retval = new StatementBuilder.orderClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDER_BY63=null;
        StatementBuilder.sortItem_return sortItem64 =null;


        CommonTree ORDER_BY63_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:197:5: ( ^( ORDER_BY ( sortItem )+ ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:197:7: ^( ORDER_BY ( sortItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ORDER_BY63=(CommonTree)match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause1345); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ORDER_BY63_tree = (CommonTree)adaptor.dupNode(ORDER_BY63);


            root_1 = (CommonTree)adaptor.becomeRoot(ORDER_BY63_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // com/facebook/presto/sql/parser/StatementBuilder.g:197:18: ( sortItem )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case SORT_ITEM:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:197:20: sortItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sortItem_in_orderClause1349);
            	    sortItem64=sortItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, sortItem64.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((sortItem64!=null?sortItem64.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderClause"


    public static class sortItem_return extends TreeRuleReturnScope {
        public SortItem value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sortItem"
    // com/facebook/presto/sql/parser/StatementBuilder.g:200:1: sortItem returns [SortItem value] : ^( SORT_ITEM expr o= ordering n= nullOrdering ) ;
    public final StatementBuilder.sortItem_return sortItem() throws RecognitionException {
        StatementBuilder.sortItem_return retval = new StatementBuilder.sortItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SORT_ITEM65=null;
        StatementBuilder.ordering_return o =null;

        StatementBuilder.nullOrdering_return n =null;

        StatementBuilder.expr_return expr66 =null;


        CommonTree SORT_ITEM65_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:201:5: ( ^( SORT_ITEM expr o= ordering n= nullOrdering ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:201:7: ^( SORT_ITEM expr o= ordering n= nullOrdering )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SORT_ITEM65=(CommonTree)match(input,SORT_ITEM,FOLLOW_SORT_ITEM_in_sortItem1378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SORT_ITEM65_tree = (CommonTree)adaptor.dupNode(SORT_ITEM65);


            root_1 = (CommonTree)adaptor.becomeRoot(SORT_ITEM65_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_sortItem1380);
            expr66=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr66.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ordering_in_sortItem1384);
            o=ordering();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, o.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_nullOrdering_in_sortItem1388);
            n=nullOrdering();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, n.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new SortItem((expr66!=null?expr66.value:null), (o!=null?o.value:null), (n!=null?n.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sortItem"


    public static class ordering_return extends TreeRuleReturnScope {
        public SortItem.Ordering value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ordering"
    // com/facebook/presto/sql/parser/StatementBuilder.g:204:1: ordering returns [SortItem.Ordering value] : ( ASC | DESC );
    public final StatementBuilder.ordering_return ordering() throws RecognitionException {
        StatementBuilder.ordering_return retval = new StatementBuilder.ordering_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC67=null;
        CommonTree DESC68=null;

        CommonTree ASC67_tree=null;
        CommonTree DESC68_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:205:5: ( ASC | DESC )
            int alt21=2;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt21=1;
                }
                break;
            case DESC:
                {
                alt21=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:205:7: ASC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ASC67=(CommonTree)match(input,ASC,FOLLOW_ASC_in_ordering1412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASC67_tree = (CommonTree)adaptor.dupNode(ASC67);


                    adaptor.addChild(root_0, ASC67_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = SortItem.Ordering.ASCENDING; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:206:7: DESC
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DESC68=(CommonTree)match(input,DESC,FOLLOW_DESC_in_ordering1423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DESC68_tree = (CommonTree)adaptor.dupNode(DESC68);


                    adaptor.addChild(root_0, DESC68_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = SortItem.Ordering.DESCENDING; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ordering"


    public static class nullOrdering_return extends TreeRuleReturnScope {
        public SortItem.NullOrdering value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullOrdering"
    // com/facebook/presto/sql/parser/StatementBuilder.g:209:1: nullOrdering returns [SortItem.NullOrdering value] : ( FIRST | LAST |);
    public final StatementBuilder.nullOrdering_return nullOrdering() throws RecognitionException {
        StatementBuilder.nullOrdering_return retval = new StatementBuilder.nullOrdering_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FIRST69=null;
        CommonTree LAST70=null;

        CommonTree FIRST69_tree=null;
        CommonTree LAST70_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:210:5: ( FIRST | LAST |)
            int alt22=3;
            switch ( input.LA(1) ) {
            case FIRST:
                {
                alt22=1;
                }
                break;
            case LAST:
                {
                alt22=2;
                }
                break;
            case UP:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:210:7: FIRST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FIRST69=(CommonTree)match(input,FIRST,FOLLOW_FIRST_in_nullOrdering1446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FIRST69_tree = (CommonTree)adaptor.dupNode(FIRST69);


                    adaptor.addChild(root_0, FIRST69_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = SortItem.NullOrdering.FIRST; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:211:7: LAST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LAST70=(CommonTree)match(input,LAST,FOLLOW_LAST_in_nullOrdering1456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LAST70_tree = (CommonTree)adaptor.dupNode(LAST70);


                    adaptor.addChild(root_0, LAST70_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = SortItem.NullOrdering.LAST; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:212:13: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) { retval.value = SortItem.NullOrdering.UNDEFINED; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nullOrdering"


    public static class limitClause_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitClause"
    // com/facebook/presto/sql/parser/StatementBuilder.g:215:1: limitClause returns [String value] : ^( LIMIT integer ) ;
    public final StatementBuilder.limitClause_return limitClause() throws RecognitionException {
        StatementBuilder.limitClause_return retval = new StatementBuilder.limitClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LIMIT71=null;
        StatementBuilder.integer_return integer72 =null;


        CommonTree LIMIT71_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:216:5: ( ^( LIMIT integer ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:216:7: ^( LIMIT integer )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LIMIT71=(CommonTree)match(input,LIMIT,FOLLOW_LIMIT_in_limitClause1495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LIMIT71_tree = (CommonTree)adaptor.dupNode(LIMIT71);


            root_1 = (CommonTree)adaptor.becomeRoot(LIMIT71_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_integer_in_limitClause1497);
            integer72=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, integer72.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (integer72!=null?integer72.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitClause"


    public static class sampleType_return extends TreeRuleReturnScope {
        public SampledRelation.Type value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sampleType"
    // com/facebook/presto/sql/parser/StatementBuilder.g:219:1: sampleType returns [SampledRelation.Type value] : ( BERNOULLI | SYSTEM );
    public final StatementBuilder.sampleType_return sampleType() throws RecognitionException {
        StatementBuilder.sampleType_return retval = new StatementBuilder.sampleType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BERNOULLI73=null;
        CommonTree SYSTEM74=null;

        CommonTree BERNOULLI73_tree=null;
        CommonTree SYSTEM74_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:220:5: ( BERNOULLI | SYSTEM )
            int alt23=2;
            switch ( input.LA(1) ) {
            case BERNOULLI:
                {
                alt23=1;
                }
                break;
            case SYSTEM:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:220:7: BERNOULLI
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BERNOULLI73=(CommonTree)match(input,BERNOULLI,FOLLOW_BERNOULLI_in_sampleType1521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BERNOULLI73_tree = (CommonTree)adaptor.dupNode(BERNOULLI73);


                    adaptor.addChild(root_0, BERNOULLI73_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = SampledRelation.Type.BERNOULLI; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:221:7: SYSTEM
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    SYSTEM74=(CommonTree)match(input,SYSTEM,FOLLOW_SYSTEM_in_sampleType1531); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SYSTEM74_tree = (CommonTree)adaptor.dupNode(SYSTEM74);


                    adaptor.addChild(root_0, SYSTEM74_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = SampledRelation.Type.SYSTEM; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sampleType"


    public static class stratifyOn_return extends TreeRuleReturnScope {
        public List<Expression> value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stratifyOn"
    // com/facebook/presto/sql/parser/StatementBuilder.g:224:1: stratifyOn returns [List<Expression> value] : ^( STRATIFY_ON exprList ) ;
    public final StatementBuilder.stratifyOn_return stratifyOn() throws RecognitionException {
        StatementBuilder.stratifyOn_return retval = new StatementBuilder.stratifyOn_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRATIFY_ON75=null;
        StatementBuilder.exprList_return exprList76 =null;


        CommonTree STRATIFY_ON75_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:225:5: ( ^( STRATIFY_ON exprList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:225:7: ^( STRATIFY_ON exprList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STRATIFY_ON75=(CommonTree)match(input,STRATIFY_ON,FOLLOW_STRATIFY_ON_in_stratifyOn1558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRATIFY_ON75_tree = (CommonTree)adaptor.dupNode(STRATIFY_ON75);


            root_1 = (CommonTree)adaptor.becomeRoot(STRATIFY_ON75_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_exprList_in_stratifyOn1560);
                exprList76=exprList();

                state._fsp--;
                if (state.failed) return retval;
                if ( state.backtracking==0 ) 
                adaptor.addChild(root_1, exprList76.getTree());


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (exprList76!=null?exprList76.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stratifyOn"


    public static class relationList_return extends TreeRuleReturnScope {
        public List<Relation> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationList"
    // com/facebook/presto/sql/parser/StatementBuilder.g:228:1: relationList returns [List<Relation> value = new ArrayList<>()] : ( relation )+ ;
    public final StatementBuilder.relationList_return relationList() throws RecognitionException {
        StatementBuilder.relationList_return retval = new StatementBuilder.relationList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.relation_return relation77 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:229:5: ( ( relation )+ )
            // com/facebook/presto/sql/parser/StatementBuilder.g:229:7: ( relation )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/StatementBuilder.g:229:7: ( relation )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case ALIASED_RELATION:
                case CROSS_JOIN:
                case JOINED_TABLE:
                case QUALIFIED_JOIN:
                case SAMPLED_RELATION:
                case TABLE:
                case TABLE_SUBQUERY:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:229:9: relation
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_relation_in_relationList1586);
            	    relation77=relation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, relation77.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((relation77!=null?relation77.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationList"


    public static class relation_return extends TreeRuleReturnScope {
        public Relation value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // com/facebook/presto/sql/parser/StatementBuilder.g:232:1: relation returns [Relation value] : ( relationType | aliasedRelation | sampledRelation );
    public final StatementBuilder.relation_return relation() throws RecognitionException {
        StatementBuilder.relation_return retval = new StatementBuilder.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.relationType_return relationType78 =null;

        StatementBuilder.aliasedRelation_return aliasedRelation79 =null;

        StatementBuilder.sampledRelation_return sampledRelation80 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:233:5: ( relationType | aliasedRelation | sampledRelation )
            int alt25=3;
            switch ( input.LA(1) ) {
            case CROSS_JOIN:
            case JOINED_TABLE:
            case QUALIFIED_JOIN:
            case TABLE:
            case TABLE_SUBQUERY:
                {
                alt25=1;
                }
                break;
            case ALIASED_RELATION:
                {
                alt25=2;
                }
                break;
            case SAMPLED_RELATION:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:233:7: relationType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relationType_in_relation1612);
                    relationType78=relationType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, relationType78.getTree());


                    if ( state.backtracking==0 ) { retval.value = (relationType78!=null?relationType78.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:234:7: aliasedRelation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_aliasedRelation_in_relation1627);
                    aliasedRelation79=aliasedRelation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, aliasedRelation79.getTree());


                    if ( state.backtracking==0 ) { retval.value = (aliasedRelation79!=null?aliasedRelation79.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:235:7: sampledRelation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_sampledRelation_in_relation1639);
                    sampledRelation80=sampledRelation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sampledRelation80.getTree());


                    if ( state.backtracking==0 ) { retval.value = (sampledRelation80!=null?sampledRelation80.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class relationType_return extends TreeRuleReturnScope {
        public Relation value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationType"
    // com/facebook/presto/sql/parser/StatementBuilder.g:238:1: relationType returns [Relation value] : ( namedTable | tableSubquery | joinedTable | joinRelation );
    public final StatementBuilder.relationType_return relationType() throws RecognitionException {
        StatementBuilder.relationType_return retval = new StatementBuilder.relationType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.namedTable_return namedTable81 =null;

        StatementBuilder.tableSubquery_return tableSubquery82 =null;

        StatementBuilder.joinedTable_return joinedTable83 =null;

        StatementBuilder.joinRelation_return joinRelation84 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:239:5: ( namedTable | tableSubquery | joinedTable | joinRelation )
            int alt26=4;
            switch ( input.LA(1) ) {
            case TABLE:
                {
                alt26=1;
                }
                break;
            case TABLE_SUBQUERY:
                {
                alt26=2;
                }
                break;
            case JOINED_TABLE:
                {
                alt26=3;
                }
                break;
            case CROSS_JOIN:
            case QUALIFIED_JOIN:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:239:7: namedTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_namedTable_in_relationType1664);
                    namedTable81=namedTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, namedTable81.getTree());


                    if ( state.backtracking==0 ) { retval.value = (namedTable81!=null?namedTable81.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:240:7: tableSubquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tableSubquery_in_relationType1680);
                    tableSubquery82=tableSubquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, tableSubquery82.getTree());


                    if ( state.backtracking==0 ) { retval.value = (tableSubquery82!=null?tableSubquery82.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:241:7: joinedTable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_joinedTable_in_relationType1693);
                    joinedTable83=joinedTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, joinedTable83.getTree());


                    if ( state.backtracking==0 ) { retval.value = (joinedTable83!=null?joinedTable83.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:242:7: joinRelation
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_joinRelation_in_relationType1708);
                    joinRelation84=joinRelation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, joinRelation84.getTree());


                    if ( state.backtracking==0 ) { retval.value = (joinRelation84!=null?joinRelation84.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationType"


    public static class namedTable_return extends TreeRuleReturnScope {
        public Table value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedTable"
    // com/facebook/presto/sql/parser/StatementBuilder.g:245:1: namedTable returns [Table value] : ^( TABLE qname ) ;
    public final StatementBuilder.namedTable_return namedTable() throws RecognitionException {
        StatementBuilder.namedTable_return retval = new StatementBuilder.namedTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLE85=null;
        StatementBuilder.qname_return qname86 =null;


        CommonTree TABLE85_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:246:5: ( ^( TABLE qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:246:7: ^( TABLE qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLE85=(CommonTree)match(input,TABLE,FOLLOW_TABLE_in_namedTable1736); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TABLE85_tree = (CommonTree)adaptor.dupNode(TABLE85);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLE85_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_namedTable1738);
            qname86=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname86.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new Table((qname86!=null?qname86.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namedTable"


    public static class joinedTable_return extends TreeRuleReturnScope {
        public Relation value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinedTable"
    // com/facebook/presto/sql/parser/StatementBuilder.g:249:1: joinedTable returns [Relation value] : ^( JOINED_TABLE relation ) ;
    public final StatementBuilder.joinedTable_return joinedTable() throws RecognitionException {
        StatementBuilder.joinedTable_return retval = new StatementBuilder.joinedTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JOINED_TABLE87=null;
        StatementBuilder.relation_return relation88 =null;


        CommonTree JOINED_TABLE87_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:250:5: ( ^( JOINED_TABLE relation ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:250:7: ^( JOINED_TABLE relation )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            JOINED_TABLE87=(CommonTree)match(input,JOINED_TABLE,FOLLOW_JOINED_TABLE_in_joinedTable1763); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            JOINED_TABLE87_tree = (CommonTree)adaptor.dupNode(JOINED_TABLE87);


            root_1 = (CommonTree)adaptor.becomeRoot(JOINED_TABLE87_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_relation_in_joinedTable1765);
            relation88=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, relation88.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (relation88!=null?relation88.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinedTable"


    public static class joinRelation_return extends TreeRuleReturnScope {
        public Join value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinRelation"
    // com/facebook/presto/sql/parser/StatementBuilder.g:253:1: joinRelation returns [Join value] : ( ^( CROSS_JOIN a= relation b= relation ) | ^( QUALIFIED_JOIN t= joinType c= joinCriteria a= relation b= relation ) );
    public final StatementBuilder.joinRelation_return joinRelation() throws RecognitionException {
        StatementBuilder.joinRelation_return retval = new StatementBuilder.joinRelation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CROSS_JOIN89=null;
        CommonTree QUALIFIED_JOIN90=null;
        StatementBuilder.relation_return a =null;

        StatementBuilder.relation_return b =null;

        StatementBuilder.joinType_return t =null;

        StatementBuilder.joinCriteria_return c =null;


        CommonTree CROSS_JOIN89_tree=null;
        CommonTree QUALIFIED_JOIN90_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:254:5: ( ^( CROSS_JOIN a= relation b= relation ) | ^( QUALIFIED_JOIN t= joinType c= joinCriteria a= relation b= relation ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case CROSS_JOIN:
                {
                alt27=1;
                }
                break;
            case QUALIFIED_JOIN:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:254:7: ^( CROSS_JOIN a= relation b= relation )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CROSS_JOIN89=(CommonTree)match(input,CROSS_JOIN,FOLLOW_CROSS_JOIN_in_joinRelation1790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CROSS_JOIN89_tree = (CommonTree)adaptor.dupNode(CROSS_JOIN89);


                    root_1 = (CommonTree)adaptor.becomeRoot(CROSS_JOIN89_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relation_in_joinRelation1794);
                    a=relation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relation_in_joinRelation1798);
                    b=relation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new Join(Join.Type.CROSS, (a!=null?a.value:null), (b!=null?b.value:null), null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:255:7: ^( QUALIFIED_JOIN t= joinType c= joinCriteria a= relation b= relation )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    QUALIFIED_JOIN90=(CommonTree)match(input,QUALIFIED_JOIN,FOLLOW_QUALIFIED_JOIN_in_joinRelation1840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUALIFIED_JOIN90_tree = (CommonTree)adaptor.dupNode(QUALIFIED_JOIN90);


                    root_1 = (CommonTree)adaptor.becomeRoot(QUALIFIED_JOIN90_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_joinType_in_joinRelation1844);
                    t=joinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, t.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_joinCriteria_in_joinRelation1848);
                    c=joinCriteria();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, c.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relation_in_joinRelation1852);
                    a=relation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relation_in_joinRelation1856);
                    b=relation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new Join((t!=null?t.value:null), (a!=null?a.value:null), (b!=null?b.value:null), (c!=null?c.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinRelation"


    public static class aliasedRelation_return extends TreeRuleReturnScope {
        public AliasedRelation value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasedRelation"
    // com/facebook/presto/sql/parser/StatementBuilder.g:258:1: aliasedRelation returns [AliasedRelation value] : ^( ALIASED_RELATION r= relation i= ident (c= aliasedColumns )? ) ;
    public final StatementBuilder.aliasedRelation_return aliasedRelation() throws RecognitionException {
        StatementBuilder.aliasedRelation_return retval = new StatementBuilder.aliasedRelation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALIASED_RELATION91=null;
        StatementBuilder.relation_return r =null;

        StatementBuilder.ident_return i =null;

        StatementBuilder.aliasedColumns_return c =null;


        CommonTree ALIASED_RELATION91_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:259:5: ( ^( ALIASED_RELATION r= relation i= ident (c= aliasedColumns )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:259:7: ^( ALIASED_RELATION r= relation i= ident (c= aliasedColumns )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ALIASED_RELATION91=(CommonTree)match(input,ALIASED_RELATION,FOLLOW_ALIASED_RELATION_in_aliasedRelation1881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALIASED_RELATION91_tree = (CommonTree)adaptor.dupNode(ALIASED_RELATION91);


            root_1 = (CommonTree)adaptor.becomeRoot(ALIASED_RELATION91_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_relation_in_aliasedRelation1885);
            r=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, r.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ident_in_aliasedRelation1889);
            i=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, i.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:259:46: (c= aliasedColumns )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case ALIASED_COLUMNS:
                    {
                    alt28=1;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:259:46: c= aliasedColumns
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_aliasedColumns_in_aliasedRelation1893);
                    c=aliasedColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, c.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new AliasedRelation((r!=null?r.value:null), (i!=null?i.value:null), (c!=null?c.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aliasedRelation"


    public static class sampledRelation_return extends TreeRuleReturnScope {
        public SampledRelation value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sampledRelation"
    // com/facebook/presto/sql/parser/StatementBuilder.g:262:1: sampledRelation returns [SampledRelation value] : ^( SAMPLED_RELATION r= relation t= sampleType p= expr (st= stratifyOn )? ) ;
    public final StatementBuilder.sampledRelation_return sampledRelation() throws RecognitionException {
        StatementBuilder.sampledRelation_return retval = new StatementBuilder.sampledRelation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SAMPLED_RELATION92=null;
        StatementBuilder.relation_return r =null;

        StatementBuilder.sampleType_return t =null;

        StatementBuilder.expr_return p =null;

        StatementBuilder.stratifyOn_return st =null;


        CommonTree SAMPLED_RELATION92_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:263:5: ( ^( SAMPLED_RELATION r= relation t= sampleType p= expr (st= stratifyOn )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:263:7: ^( SAMPLED_RELATION r= relation t= sampleType p= expr (st= stratifyOn )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SAMPLED_RELATION92=(CommonTree)match(input,SAMPLED_RELATION,FOLLOW_SAMPLED_RELATION_in_sampledRelation1919); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SAMPLED_RELATION92_tree = (CommonTree)adaptor.dupNode(SAMPLED_RELATION92);


            root_1 = (CommonTree)adaptor.becomeRoot(SAMPLED_RELATION92_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_relation_in_sampledRelation1923);
            r=relation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, r.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sampleType_in_sampledRelation1927);
            t=sampleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, t.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_sampledRelation1931);
            p=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, p.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:263:59: (st= stratifyOn )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case STRATIFY_ON:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:263:59: st= stratifyOn
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stratifyOn_in_sampledRelation1935);
                    st=stratifyOn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, st.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new SampledRelation((r!=null?r.value:null), (t!=null?t.value:null), (p!=null?p.value:null), Optional.fromNullable((st!=null?st.value:null))); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sampledRelation"


    public static class aliasedColumns_return extends TreeRuleReturnScope {
        public List<String> value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasedColumns"
    // com/facebook/presto/sql/parser/StatementBuilder.g:266:1: aliasedColumns returns [List<String> value] : ^( ALIASED_COLUMNS identList ) ;
    public final StatementBuilder.aliasedColumns_return aliasedColumns() throws RecognitionException {
        StatementBuilder.aliasedColumns_return retval = new StatementBuilder.aliasedColumns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALIASED_COLUMNS93=null;
        StatementBuilder.identList_return identList94 =null;


        CommonTree ALIASED_COLUMNS93_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:267:5: ( ^( ALIASED_COLUMNS identList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:267:7: ^( ALIASED_COLUMNS identList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ALIASED_COLUMNS93=(CommonTree)match(input,ALIASED_COLUMNS,FOLLOW_ALIASED_COLUMNS_in_aliasedColumns1961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALIASED_COLUMNS93_tree = (CommonTree)adaptor.dupNode(ALIASED_COLUMNS93);


            root_1 = (CommonTree)adaptor.becomeRoot(ALIASED_COLUMNS93_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identList_in_aliasedColumns1963);
            identList94=identList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, identList94.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (identList94!=null?identList94.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aliasedColumns"


    public static class joinType_return extends TreeRuleReturnScope {
        public Join.Type value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinType"
    // com/facebook/presto/sql/parser/StatementBuilder.g:270:1: joinType returns [Join.Type value] : ( INNER_JOIN | LEFT_JOIN | RIGHT_JOIN | FULL_JOIN );
    public final StatementBuilder.joinType_return joinType() throws RecognitionException {
        StatementBuilder.joinType_return retval = new StatementBuilder.joinType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INNER_JOIN95=null;
        CommonTree LEFT_JOIN96=null;
        CommonTree RIGHT_JOIN97=null;
        CommonTree FULL_JOIN98=null;

        CommonTree INNER_JOIN95_tree=null;
        CommonTree LEFT_JOIN96_tree=null;
        CommonTree RIGHT_JOIN97_tree=null;
        CommonTree FULL_JOIN98_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:271:5: ( INNER_JOIN | LEFT_JOIN | RIGHT_JOIN | FULL_JOIN )
            int alt30=4;
            switch ( input.LA(1) ) {
            case INNER_JOIN:
                {
                alt30=1;
                }
                break;
            case LEFT_JOIN:
                {
                alt30=2;
                }
                break;
            case RIGHT_JOIN:
                {
                alt30=3;
                }
                break;
            case FULL_JOIN:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:271:7: INNER_JOIN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INNER_JOIN95=(CommonTree)match(input,INNER_JOIN,FOLLOW_INNER_JOIN_in_joinType1987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INNER_JOIN95_tree = (CommonTree)adaptor.dupNode(INNER_JOIN95);


                    adaptor.addChild(root_0, INNER_JOIN95_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = Join.Type.INNER; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:272:7: LEFT_JOIN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LEFT_JOIN96=(CommonTree)match(input,LEFT_JOIN,FOLLOW_LEFT_JOIN_in_joinType1997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LEFT_JOIN96_tree = (CommonTree)adaptor.dupNode(LEFT_JOIN96);


                    adaptor.addChild(root_0, LEFT_JOIN96_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = Join.Type.LEFT; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:273:7: RIGHT_JOIN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    RIGHT_JOIN97=(CommonTree)match(input,RIGHT_JOIN,FOLLOW_RIGHT_JOIN_in_joinType2008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RIGHT_JOIN97_tree = (CommonTree)adaptor.dupNode(RIGHT_JOIN97);


                    adaptor.addChild(root_0, RIGHT_JOIN97_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = Join.Type.RIGHT; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:274:7: FULL_JOIN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FULL_JOIN98=(CommonTree)match(input,FULL_JOIN,FOLLOW_FULL_JOIN_in_joinType2018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FULL_JOIN98_tree = (CommonTree)adaptor.dupNode(FULL_JOIN98);


                    adaptor.addChild(root_0, FULL_JOIN98_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = Join.Type.FULL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinType"


    public static class joinCriteria_return extends TreeRuleReturnScope {
        public JoinCriteria value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinCriteria"
    // com/facebook/presto/sql/parser/StatementBuilder.g:277:1: joinCriteria returns [JoinCriteria value] : ( NATURAL | ^( ON expr ) | ^( USING identList ) );
    public final StatementBuilder.joinCriteria_return joinCriteria() throws RecognitionException {
        StatementBuilder.joinCriteria_return retval = new StatementBuilder.joinCriteria_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NATURAL99=null;
        CommonTree ON100=null;
        CommonTree USING102=null;
        StatementBuilder.expr_return expr101 =null;

        StatementBuilder.identList_return identList103 =null;


        CommonTree NATURAL99_tree=null;
        CommonTree ON100_tree=null;
        CommonTree USING102_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:278:5: ( NATURAL | ^( ON expr ) | ^( USING identList ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case NATURAL:
                {
                alt31=1;
                }
                break;
            case ON:
                {
                alt31=2;
                }
                break;
            case USING:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:278:7: NATURAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NATURAL99=(CommonTree)match(input,NATURAL,FOLLOW_NATURAL_in_joinCriteria2042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NATURAL99_tree = (CommonTree)adaptor.dupNode(NATURAL99);


                    adaptor.addChild(root_0, NATURAL99_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new NaturalJoin(); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:279:7: ^( ON expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ON100=(CommonTree)match(input,ON,FOLLOW_ON_in_joinCriteria2064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ON100_tree = (CommonTree)adaptor.dupNode(ON100);


                    root_1 = (CommonTree)adaptor.becomeRoot(ON100_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_joinCriteria2066);
                    expr101=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr101.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new JoinOn((expr101!=null?expr101.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:280:7: ^( USING identList )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    USING102=(CommonTree)match(input,USING,FOLLOW_USING_in_joinCriteria2086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING102_tree = (CommonTree)adaptor.dupNode(USING102);


                    root_1 = (CommonTree)adaptor.becomeRoot(USING102_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identList_in_joinCriteria2088);
                    identList103=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, identList103.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new JoinUsing((identList103!=null?identList103.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinCriteria"


    public static class tableSubquery_return extends TreeRuleReturnScope {
        public TableSubquery value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSubquery"
    // com/facebook/presto/sql/parser/StatementBuilder.g:283:1: tableSubquery returns [TableSubquery value] : ^( TABLE_SUBQUERY query ) ;
    public final StatementBuilder.tableSubquery_return tableSubquery() throws RecognitionException {
        StatementBuilder.tableSubquery_return retval = new StatementBuilder.tableSubquery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLE_SUBQUERY104=null;
        StatementBuilder.query_return query105 =null;


        CommonTree TABLE_SUBQUERY104_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:284:5: ( ^( TABLE_SUBQUERY query ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:284:7: ^( TABLE_SUBQUERY query )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLE_SUBQUERY104=(CommonTree)match(input,TABLE_SUBQUERY,FOLLOW_TABLE_SUBQUERY_in_tableSubquery2113); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TABLE_SUBQUERY104_tree = (CommonTree)adaptor.dupNode(TABLE_SUBQUERY104);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLE_SUBQUERY104_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_query_in_tableSubquery2115);
            query105=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, query105.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new TableSubquery((query105!=null?query105.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableSubquery"


    public static class singleExpression_return extends TreeRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleExpression"
    // com/facebook/presto/sql/parser/StatementBuilder.g:287:1: singleExpression returns [Expression value] : expr EOF ;
    public final StatementBuilder.singleExpression_return singleExpression() throws RecognitionException {
        StatementBuilder.singleExpression_return retval = new StatementBuilder.singleExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EOF107=null;
        StatementBuilder.expr_return expr106 =null;


        CommonTree EOF107_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:288:5: ( expr EOF )
            // com/facebook/presto/sql/parser/StatementBuilder.g:288:7: expr EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_singleExpression2139);
            expr106=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, expr106.getTree());


            _last = (CommonTree)input.LT(1);
            EOF107=(CommonTree)match(input,EOF,FOLLOW_EOF_in_singleExpression2141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF107_tree = (CommonTree)adaptor.dupNode(EOF107);


            adaptor.addChild(root_0, EOF107_tree);
            }


            if ( state.backtracking==0 ) { retval.value = (expr106!=null?expr106.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "singleExpression"


    public static class expr_return extends TreeRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // com/facebook/presto/sql/parser/StatementBuilder.g:291:1: expr returns [Expression value] : ( NULL | qname | functionCall | arithmeticExpression | comparisonExpression | ^( AND a= expr b= expr ) | ^( OR a= expr b= expr ) | ^( NOT e= expr ) | ^( DATE string ) | ^( TIME string ) | ^( TIMESTAMP string ) | string | integer | decimal | TRUE | FALSE | intervalValue | predicate | ^( IN_LIST exprList ) | ^( NEGATIVE e= expr ) | caseExpression | query | extract | current_time | cast );
    public final StatementBuilder.expr_return expr() throws RecognitionException {
        StatementBuilder.expr_return retval = new StatementBuilder.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NULL108=null;
        CommonTree AND113=null;
        CommonTree OR114=null;
        CommonTree NOT115=null;
        CommonTree DATE116=null;
        CommonTree TIME118=null;
        CommonTree TIMESTAMP120=null;
        CommonTree TRUE125=null;
        CommonTree FALSE126=null;
        CommonTree IN_LIST129=null;
        CommonTree NEGATIVE131=null;
        StatementBuilder.expr_return a =null;

        StatementBuilder.expr_return b =null;

        StatementBuilder.expr_return e =null;

        StatementBuilder.qname_return qname109 =null;

        StatementBuilder.functionCall_return functionCall110 =null;

        StatementBuilder.arithmeticExpression_return arithmeticExpression111 =null;

        StatementBuilder.comparisonExpression_return comparisonExpression112 =null;

        StatementBuilder.string_return string117 =null;

        StatementBuilder.string_return string119 =null;

        StatementBuilder.string_return string121 =null;

        StatementBuilder.string_return string122 =null;

        StatementBuilder.integer_return integer123 =null;

        StatementBuilder.decimal_return decimal124 =null;

        StatementBuilder.intervalValue_return intervalValue127 =null;

        StatementBuilder.predicate_return predicate128 =null;

        StatementBuilder.exprList_return exprList130 =null;

        StatementBuilder.caseExpression_return caseExpression132 =null;

        StatementBuilder.query_return query133 =null;

        StatementBuilder.extract_return extract134 =null;

        StatementBuilder.current_time_return current_time135 =null;

        StatementBuilder.cast_return cast136 =null;


        CommonTree NULL108_tree=null;
        CommonTree AND113_tree=null;
        CommonTree OR114_tree=null;
        CommonTree NOT115_tree=null;
        CommonTree DATE116_tree=null;
        CommonTree TIME118_tree=null;
        CommonTree TIMESTAMP120_tree=null;
        CommonTree TRUE125_tree=null;
        CommonTree FALSE126_tree=null;
        CommonTree IN_LIST129_tree=null;
        CommonTree NEGATIVE131_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:292:5: ( NULL | qname | functionCall | arithmeticExpression | comparisonExpression | ^( AND a= expr b= expr ) | ^( OR a= expr b= expr ) | ^( NOT e= expr ) | ^( DATE string ) | ^( TIME string ) | ^( TIMESTAMP string ) | string | integer | decimal | TRUE | FALSE | intervalValue | predicate | ^( IN_LIST exprList ) | ^( NEGATIVE e= expr ) | caseExpression | query | extract | current_time | cast )
            int alt32=25;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt32=1;
                }
                break;
            case QNAME:
                {
                alt32=2;
                }
                break;
            case FUNCTION_CALL:
                {
                alt32=3;
                }
                break;
            case 199:
            case 202:
            case 203:
            case 205:
            case 207:
                {
                alt32=4;
                }
                break;
            case EQ:
            case GT:
            case GTE:
            case IS_DISTINCT_FROM:
            case LT:
            case LTE:
            case NEQ:
                {
                alt32=5;
                }
                break;
            case AND:
                {
                alt32=6;
                }
                break;
            case OR:
                {
                alt32=7;
                }
                break;
            case NOT:
                {
                alt32=8;
                }
                break;
            case DATE:
                {
                alt32=9;
                }
                break;
            case TIME:
                {
                alt32=10;
                }
                break;
            case TIMESTAMP:
                {
                alt32=11;
                }
                break;
            case STRING:
                {
                alt32=12;
                }
                break;
            case INTEGER_VALUE:
                {
                alt32=13;
                }
                break;
            case DECIMAL_VALUE:
                {
                alt32=14;
                }
                break;
            case TRUE:
                {
                alt32=15;
                }
                break;
            case FALSE:
                {
                alt32=16;
                }
                break;
            case INTERVAL:
                {
                alt32=17;
                }
                break;
            case BETWEEN:
            case EXISTS:
            case IN:
            case IS_NOT_NULL:
            case IS_NULL:
            case LIKE:
                {
                alt32=18;
                }
                break;
            case IN_LIST:
                {
                alt32=19;
                }
                break;
            case NEGATIVE:
                {
                alt32=20;
                }
                break;
            case COALESCE:
            case IF:
            case NULLIF:
            case SEARCHED_CASE:
            case SIMPLE_CASE:
                {
                alt32=21;
                }
                break;
            case QUERY:
                {
                alt32=22;
                }
                break;
            case EXTRACT:
                {
                alt32=23;
                }
                break;
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
                {
                alt32=24;
                }
                break;
            case CAST:
                {
                alt32=25;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:292:7: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NULL108=(CommonTree)match(input,NULL,FOLLOW_NULL_in_expr2164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL108_tree = (CommonTree)adaptor.dupNode(NULL108);


                    adaptor.addChild(root_0, NULL108_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new NullLiteral(); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:293:7: qname
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_qname_in_expr2191);
                    qname109=qname();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, qname109.getTree());


                    if ( state.backtracking==0 ) { retval.value = new QualifiedNameReference((qname109!=null?qname109.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:294:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_expr2217);
                    functionCall110=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, functionCall110.getTree());


                    if ( state.backtracking==0 ) { retval.value = (functionCall110!=null?functionCall110.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:295:7: arithmeticExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arithmeticExpression_in_expr2236);
                    arithmeticExpression111=arithmeticExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arithmeticExpression111.getTree());


                    if ( state.backtracking==0 ) { retval.value = (arithmeticExpression111!=null?arithmeticExpression111.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:296:7: comparisonExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comparisonExpression_in_expr2247);
                    comparisonExpression112=comparisonExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, comparisonExpression112.getTree());


                    if ( state.backtracking==0 ) { retval.value = (comparisonExpression112!=null?comparisonExpression112.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:297:7: ^( AND a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AND113=(CommonTree)match(input,AND,FOLLOW_AND_in_expr2259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND113_tree = (CommonTree)adaptor.dupNode(AND113);


                    root_1 = (CommonTree)adaptor.becomeRoot(AND113_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr2263);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr2267);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = LogicalBinaryExpression.and((a!=null?a.value:null), (b!=null?b.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:298:7: ^( OR a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    OR114=(CommonTree)match(input,OR,FOLLOW_OR_in_expr2280); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR114_tree = (CommonTree)adaptor.dupNode(OR114);


                    root_1 = (CommonTree)adaptor.becomeRoot(OR114_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr2284);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr2288);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = LogicalBinaryExpression.or((a!=null?a.value:null), (b!=null?b.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:299:7: ^( NOT e= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT115=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expr2302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT115_tree = (CommonTree)adaptor.dupNode(NOT115);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT115_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr2306);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new NotExpression((e!=null?e.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:300:7: ^( DATE string )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DATE116=(CommonTree)match(input,DATE,FOLLOW_DATE_in_expr2326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE116_tree = (CommonTree)adaptor.dupNode(DATE116);


                    root_1 = (CommonTree)adaptor.becomeRoot(DATE116_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_in_expr2328);
                    string117=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, string117.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new DateLiteral((string117!=null?string117.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:301:7: ^( TIME string )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TIME118=(CommonTree)match(input,TIME,FOLLOW_TIME_in_expr2347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME118_tree = (CommonTree)adaptor.dupNode(TIME118);


                    root_1 = (CommonTree)adaptor.becomeRoot(TIME118_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_in_expr2349);
                    string119=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, string119.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new TimeLiteral((string119!=null?string119.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:302:7: ^( TIMESTAMP string )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TIMESTAMP120=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_expr2368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMESTAMP120_tree = (CommonTree)adaptor.dupNode(TIMESTAMP120);


                    root_1 = (CommonTree)adaptor.becomeRoot(TIMESTAMP120_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_in_expr2370);
                    string121=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, string121.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new TimestampLiteral((string121!=null?string121.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:303:7: string
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_in_expr2383);
                    string122=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, string122.getTree());


                    if ( state.backtracking==0 ) { retval.value = new StringLiteral((string122!=null?string122.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:304:7: integer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_expr2408);
                    integer123=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, integer123.getTree());


                    if ( state.backtracking==0 ) { retval.value = new LongLiteral((integer123!=null?integer123.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:305:7: decimal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_decimal_in_expr2432);
                    decimal124=decimal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, decimal124.getTree());


                    if ( state.backtracking==0 ) { retval.value = new DoubleLiteral((decimal124!=null?decimal124.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 15 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:306:7: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    TRUE125=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_expr2456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE125_tree = (CommonTree)adaptor.dupNode(TRUE125);


                    adaptor.addChild(root_0, TRUE125_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = BooleanLiteral.TRUE_LITERAL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 16 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:307:7: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FALSE126=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_expr2483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE126_tree = (CommonTree)adaptor.dupNode(FALSE126);


                    adaptor.addChild(root_0, FALSE126_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = BooleanLiteral.FALSE_LITERAL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 17 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:308:7: intervalValue
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_intervalValue_in_expr2509);
                    intervalValue127=intervalValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, intervalValue127.getTree());


                    if ( state.backtracking==0 ) { retval.value = (intervalValue127!=null?intervalValue127.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 18 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:309:7: predicate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_predicate_in_expr2527);
                    predicate128=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, predicate128.getTree());


                    if ( state.backtracking==0 ) { retval.value = (predicate128!=null?predicate128.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 19 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:310:7: ^( IN_LIST exprList )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IN_LIST129=(CommonTree)match(input,IN_LIST,FOLLOW_IN_LIST_in_expr2550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN_LIST129_tree = (CommonTree)adaptor.dupNode(IN_LIST129);


                    root_1 = (CommonTree)adaptor.becomeRoot(IN_LIST129_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_exprList_in_expr2552);
                        exprList130=exprList();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, exprList130.getTree());


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new InListExpression((exprList130!=null?exprList130.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 20 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:311:7: ^( NEGATIVE e= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE131=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_expr2566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEGATIVE131_tree = (CommonTree)adaptor.dupNode(NEGATIVE131);


                    root_1 = (CommonTree)adaptor.becomeRoot(NEGATIVE131_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr2570);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new NegativeExpression((e!=null?e.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 21 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:312:7: caseExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_caseExpression_in_expr2584);
                    caseExpression132=caseExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, caseExpression132.getTree());


                    if ( state.backtracking==0 ) { retval.value = (caseExpression132!=null?caseExpression132.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 22 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:313:7: query
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_query_in_expr2601);
                    query133=query();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, query133.getTree());


                    if ( state.backtracking==0 ) { retval.value = new SubqueryExpression((query133!=null?query133.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 23 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:314:7: extract
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_extract_in_expr2627);
                    extract134=extract();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, extract134.getTree());


                    if ( state.backtracking==0 ) { retval.value = (extract134!=null?extract134.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 24 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:315:7: current_time
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_current_time_in_expr2651);
                    current_time135=current_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, current_time135.getTree());


                    if ( state.backtracking==0 ) { retval.value = (current_time135!=null?current_time135.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 25 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:316:7: cast
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_cast_in_expr2670);
                    cast136=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, cast136.getTree());


                    if ( state.backtracking==0 ) { retval.value = (cast136!=null?cast136.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class exprList_return extends TreeRuleReturnScope {
        public List<Expression> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // com/facebook/presto/sql/parser/StatementBuilder.g:319:1: exprList returns [List<Expression> value = new ArrayList<>()] : ( expr )* ;
    public final StatementBuilder.exprList_return exprList() throws RecognitionException {
        StatementBuilder.exprList_return retval = new StatementBuilder.exprList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.expr_return expr137 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:320:5: ( ( expr )* )
            // com/facebook/presto/sql/parser/StatementBuilder.g:320:7: ( expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/StatementBuilder.g:320:7: ( expr )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case AND:
                case BETWEEN:
                case CAST:
                case COALESCE:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case DATE:
                case DECIMAL_VALUE:
                case EQ:
                case EXISTS:
                case EXTRACT:
                case FALSE:
                case FUNCTION_CALL:
                case GT:
                case GTE:
                case IF:
                case IN:
                case INTEGER_VALUE:
                case INTERVAL:
                case IN_LIST:
                case IS_DISTINCT_FROM:
                case IS_NOT_NULL:
                case IS_NULL:
                case LIKE:
                case LT:
                case LTE:
                case NEGATIVE:
                case NEQ:
                case NOT:
                case NULL:
                case NULLIF:
                case OR:
                case QNAME:
                case QUERY:
                case SEARCHED_CASE:
                case SIMPLE_CASE:
                case STRING:
                case TIME:
                case TIMESTAMP:
                case TRUE:
                case 199:
                case 202:
                case 203:
                case 205:
                case 207:
                    {
                    alt33=1;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:320:9: expr
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_exprList2712);
            	    expr137=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, expr137.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((expr137!=null?expr137.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class qname_return extends TreeRuleReturnScope {
        public QualifiedName value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qname"
    // com/facebook/presto/sql/parser/StatementBuilder.g:323:1: qname returns [QualifiedName value] : ^( QNAME i= identList ) ;
    public final StatementBuilder.qname_return qname() throws RecognitionException {
        StatementBuilder.qname_return retval = new StatementBuilder.qname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QNAME138=null;
        StatementBuilder.identList_return i =null;


        CommonTree QNAME138_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:324:5: ( ^( QNAME i= identList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:324:7: ^( QNAME i= identList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QNAME138=(CommonTree)match(input,QNAME,FOLLOW_QNAME_in_qname2739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QNAME138_tree = (CommonTree)adaptor.dupNode(QNAME138);


            root_1 = (CommonTree)adaptor.becomeRoot(QNAME138_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identList_in_qname2743);
            i=identList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, i.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new QualifiedName((i!=null?i.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qname"


    public static class identList_return extends TreeRuleReturnScope {
        public List<String> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identList"
    // com/facebook/presto/sql/parser/StatementBuilder.g:327:1: identList returns [List<String> value = new ArrayList<>()] : ( ident )+ ;
    public final StatementBuilder.identList_return identList() throws RecognitionException {
        StatementBuilder.identList_return retval = new StatementBuilder.identList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.ident_return ident139 =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:328:5: ( ( ident )+ )
            // com/facebook/presto/sql/parser/StatementBuilder.g:328:7: ( ident )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/StatementBuilder.g:328:7: ( ident )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case IDENT:
                case QUOTED_IDENT:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:328:9: ident
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_ident_in_identList2769);
            	    ident139=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, ident139.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((ident139!=null?ident139.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identList"


    public static class ident_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ident"
    // com/facebook/presto/sql/parser/StatementBuilder.g:331:1: ident returns [String value] : (i= IDENT |q= QUOTED_IDENT );
    public final StatementBuilder.ident_return ident() throws RecognitionException {
        StatementBuilder.ident_return retval = new StatementBuilder.ident_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i=null;
        CommonTree q=null;

        CommonTree i_tree=null;
        CommonTree q_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:332:5: (i= IDENT |q= QUOTED_IDENT )
            int alt35=2;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt35=1;
                }
                break;
            case QUOTED_IDENT:
                {
                alt35=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:332:7: i= IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_ident2797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    i_tree = (CommonTree)adaptor.dupNode(i);


                    adaptor.addChild(root_0, i_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = (i!=null?i.getText():null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:333:7: q= QUOTED_IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    q=(CommonTree)match(input,QUOTED_IDENT,FOLLOW_QUOTED_IDENT_in_ident2816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    q_tree = (CommonTree)adaptor.dupNode(q);


                    adaptor.addChild(root_0, q_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = (q!=null?q.getText():null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ident"


    public static class string_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // com/facebook/presto/sql/parser/StatementBuilder.g:336:1: string returns [String value] : s= STRING ;
    public final StatementBuilder.string_return string() throws RecognitionException {
        StatementBuilder.string_return retval = new StatementBuilder.string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s=null;

        CommonTree s_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:337:5: (s= STRING )
            // com/facebook/presto/sql/parser/StatementBuilder.g:337:7: s= STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_string2841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (CommonTree)adaptor.dupNode(s);


            adaptor.addChild(root_0, s_tree);
            }


            if ( state.backtracking==0 ) { retval.value = (s!=null?s.getText():null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class integer_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integer"
    // com/facebook/presto/sql/parser/StatementBuilder.g:340:1: integer returns [String value] : s= INTEGER_VALUE ;
    public final StatementBuilder.integer_return integer() throws RecognitionException {
        StatementBuilder.integer_return retval = new StatementBuilder.integer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s=null;

        CommonTree s_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:341:5: (s= INTEGER_VALUE )
            // com/facebook/presto/sql/parser/StatementBuilder.g:341:7: s= INTEGER_VALUE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            s=(CommonTree)match(input,INTEGER_VALUE,FOLLOW_INTEGER_VALUE_in_integer2866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (CommonTree)adaptor.dupNode(s);


            adaptor.addChild(root_0, s_tree);
            }


            if ( state.backtracking==0 ) { retval.value = (s!=null?s.getText():null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "integer"


    public static class decimal_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decimal"
    // com/facebook/presto/sql/parser/StatementBuilder.g:344:1: decimal returns [String value] : s= DECIMAL_VALUE ;
    public final StatementBuilder.decimal_return decimal() throws RecognitionException {
        StatementBuilder.decimal_return retval = new StatementBuilder.decimal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s=null;

        CommonTree s_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:345:5: (s= DECIMAL_VALUE )
            // com/facebook/presto/sql/parser/StatementBuilder.g:345:7: s= DECIMAL_VALUE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            s=(CommonTree)match(input,DECIMAL_VALUE,FOLLOW_DECIMAL_VALUE_in_decimal2891); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (CommonTree)adaptor.dupNode(s);


            adaptor.addChild(root_0, s_tree);
            }


            if ( state.backtracking==0 ) { retval.value = (s!=null?s.getText():null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decimal"


    public static class functionCall_return extends TreeRuleReturnScope {
        public FunctionCall value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // com/facebook/presto/sql/parser/StatementBuilder.g:348:1: functionCall returns [FunctionCall value] : ^( FUNCTION_CALL n= qname (w= window )? d= distinct[false] a= exprList ) ;
    public final StatementBuilder.functionCall_return functionCall() throws RecognitionException {
        StatementBuilder.functionCall_return retval = new StatementBuilder.functionCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION_CALL140=null;
        StatementBuilder.qname_return n =null;

        StatementBuilder.window_return w =null;

        StatementBuilder.distinct_return d =null;

        StatementBuilder.exprList_return a =null;


        CommonTree FUNCTION_CALL140_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:349:5: ( ^( FUNCTION_CALL n= qname (w= window )? d= distinct[false] a= exprList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:349:7: ^( FUNCTION_CALL n= qname (w= window )? d= distinct[false] a= exprList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FUNCTION_CALL140=(CommonTree)match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_functionCall2915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION_CALL140_tree = (CommonTree)adaptor.dupNode(FUNCTION_CALL140);


            root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION_CALL140_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_functionCall2919);
            n=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, n.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:349:32: (w= window )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case WINDOW:
                    {
                    alt36=1;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:349:32: w= window
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_window_in_functionCall2923);
                    w=window();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, w.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_distinct_in_functionCall2928);
            d=distinct(false);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, d.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprList_in_functionCall2933);
            a=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, a.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new FunctionCall((n!=null?n.value:null), (w!=null?w.value:null), (d!=null?d.value:false), (a!=null?a.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class window_return extends TreeRuleReturnScope {
        public Window value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window"
    // com/facebook/presto/sql/parser/StatementBuilder.g:352:1: window returns [Window value] : ^( WINDOW ( windowPartition )? ( orderClause )? ( windowFrame )? ) ;
    public final StatementBuilder.window_return window() throws RecognitionException {
        StatementBuilder.window_return retval = new StatementBuilder.window_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WINDOW141=null;
        StatementBuilder.windowPartition_return windowPartition142 =null;

        StatementBuilder.orderClause_return orderClause143 =null;

        StatementBuilder.windowFrame_return windowFrame144 =null;


        CommonTree WINDOW141_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:353:5: ( ^( WINDOW ( windowPartition )? ( orderClause )? ( windowFrame )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:353:7: ^( WINDOW ( windowPartition )? ( orderClause )? ( windowFrame )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WINDOW141=(CommonTree)match(input,WINDOW,FOLLOW_WINDOW_in_window2958); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WINDOW141_tree = (CommonTree)adaptor.dupNode(WINDOW141);


            root_1 = (CommonTree)adaptor.becomeRoot(WINDOW141_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // com/facebook/presto/sql/parser/StatementBuilder.g:353:16: ( windowPartition )?
                int alt37=2;
                switch ( input.LA(1) ) {
                    case PARTITION_BY:
                        {
                        alt37=1;
                        }
                        break;
                }

                switch (alt37) {
                    case 1 :
                        // com/facebook/presto/sql/parser/StatementBuilder.g:353:16: windowPartition
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_windowPartition_in_window2960);
                        windowPartition142=windowPartition();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, windowPartition142.getTree());


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                // com/facebook/presto/sql/parser/StatementBuilder.g:353:33: ( orderClause )?
                int alt38=2;
                switch ( input.LA(1) ) {
                    case ORDER_BY:
                        {
                        alt38=1;
                        }
                        break;
                }

                switch (alt38) {
                    case 1 :
                        // com/facebook/presto/sql/parser/StatementBuilder.g:353:33: orderClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_orderClause_in_window2963);
                        orderClause143=orderClause();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, orderClause143.getTree());


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                // com/facebook/presto/sql/parser/StatementBuilder.g:353:46: ( windowFrame )?
                int alt39=2;
                switch ( input.LA(1) ) {
                    case RANGE:
                    case ROWS:
                        {
                        alt39=1;
                        }
                        break;
                }

                switch (alt39) {
                    case 1 :
                        // com/facebook/presto/sql/parser/StatementBuilder.g:353:46: windowFrame
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_windowFrame_in_window2966);
                        windowFrame144=windowFrame();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, windowFrame144.getTree());


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new Window(
                        Objects.firstNonNull((windowPartition142!=null?windowPartition142.value:null), ImmutableList.<Expression>of()),
                        Objects.firstNonNull((orderClause143!=null?orderClause143.value:null), ImmutableList.<SortItem>of()),
                        (windowFrame144!=null?windowFrame144.value:null));
                    }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window"


    public static class windowPartition_return extends TreeRuleReturnScope {
        public List<Expression> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "windowPartition"
    // com/facebook/presto/sql/parser/StatementBuilder.g:361:1: windowPartition returns [List<Expression> value = new ArrayList<>()] : ^( PARTITION_BY exprList ) ;
    public final StatementBuilder.windowPartition_return windowPartition() throws RecognitionException {
        StatementBuilder.windowPartition_return retval = new StatementBuilder.windowPartition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARTITION_BY145=null;
        StatementBuilder.exprList_return exprList146 =null;


        CommonTree PARTITION_BY145_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:362:5: ( ^( PARTITION_BY exprList ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:362:7: ^( PARTITION_BY exprList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PARTITION_BY145=(CommonTree)match(input,PARTITION_BY,FOLLOW_PARTITION_BY_in_windowPartition3000); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PARTITION_BY145_tree = (CommonTree)adaptor.dupNode(PARTITION_BY145);


            root_1 = (CommonTree)adaptor.becomeRoot(PARTITION_BY145_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_exprList_in_windowPartition3002);
                exprList146=exprList();

                state._fsp--;
                if (state.failed) return retval;
                if ( state.backtracking==0 ) 
                adaptor.addChild(root_1, exprList146.getTree());


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (exprList146!=null?exprList146.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "windowPartition"


    public static class windowFrame_return extends TreeRuleReturnScope {
        public WindowFrame value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "windowFrame"
    // com/facebook/presto/sql/parser/StatementBuilder.g:365:1: windowFrame returns [WindowFrame value] : ( ^( RANGE s= frameBound (e= frameBound )? ) | ^( ROWS s= frameBound (e= frameBound )? ) );
    public final StatementBuilder.windowFrame_return windowFrame() throws RecognitionException {
        StatementBuilder.windowFrame_return retval = new StatementBuilder.windowFrame_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RANGE147=null;
        CommonTree ROWS148=null;
        StatementBuilder.frameBound_return s =null;

        StatementBuilder.frameBound_return e =null;


        CommonTree RANGE147_tree=null;
        CommonTree ROWS148_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:366:5: ( ^( RANGE s= frameBound (e= frameBound )? ) | ^( ROWS s= frameBound (e= frameBound )? ) )
            int alt42=2;
            switch ( input.LA(1) ) {
            case RANGE:
                {
                alt42=1;
                }
                break;
            case ROWS:
                {
                alt42=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:366:7: ^( RANGE s= frameBound (e= frameBound )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    RANGE147=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_windowFrame3027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RANGE147_tree = (CommonTree)adaptor.dupNode(RANGE147);


                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE147_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_frameBound_in_windowFrame3031);
                    s=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, s.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:366:29: (e= frameBound )?
                    int alt40=2;
                    switch ( input.LA(1) ) {
                        case CURRENT_ROW:
                        case FOLLOWING:
                        case PRECEDING:
                        case UNBOUNDED_FOLLOWING:
                        case UNBOUNDED_PRECEDING:
                            {
                            alt40=1;
                            }
                            break;
                    }

                    switch (alt40) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:366:29: e= frameBound
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_frameBound_in_windowFrame3035);
                            e=frameBound();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, e.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new WindowFrame(WindowFrame.Type.RANGE, (s!=null?s.value:null), (e!=null?e.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:367:7: ^( ROWS s= frameBound (e= frameBound )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ROWS148=(CommonTree)match(input,ROWS,FOLLOW_ROWS_in_windowFrame3048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ROWS148_tree = (CommonTree)adaptor.dupNode(ROWS148);


                    root_1 = (CommonTree)adaptor.becomeRoot(ROWS148_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_frameBound_in_windowFrame3052);
                    s=frameBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, s.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:367:28: (e= frameBound )?
                    int alt41=2;
                    switch ( input.LA(1) ) {
                        case CURRENT_ROW:
                        case FOLLOWING:
                        case PRECEDING:
                        case UNBOUNDED_FOLLOWING:
                        case UNBOUNDED_PRECEDING:
                            {
                            alt41=1;
                            }
                            break;
                    }

                    switch (alt41) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:367:28: e= frameBound
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_frameBound_in_windowFrame3056);
                            e=frameBound();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, e.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new WindowFrame(WindowFrame.Type.ROWS, (s!=null?s.value:null), (e!=null?e.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "windowFrame"


    public static class frameBound_return extends TreeRuleReturnScope {
        public FrameBound value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frameBound"
    // com/facebook/presto/sql/parser/StatementBuilder.g:370:1: frameBound returns [FrameBound value] : ( UNBOUNDED_PRECEDING | UNBOUNDED_FOLLOWING | CURRENT_ROW | ^( PRECEDING expr ) | ^( FOLLOWING expr ) );
    public final StatementBuilder.frameBound_return frameBound() throws RecognitionException {
        StatementBuilder.frameBound_return retval = new StatementBuilder.frameBound_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNBOUNDED_PRECEDING149=null;
        CommonTree UNBOUNDED_FOLLOWING150=null;
        CommonTree CURRENT_ROW151=null;
        CommonTree PRECEDING152=null;
        CommonTree FOLLOWING154=null;
        StatementBuilder.expr_return expr153 =null;

        StatementBuilder.expr_return expr155 =null;


        CommonTree UNBOUNDED_PRECEDING149_tree=null;
        CommonTree UNBOUNDED_FOLLOWING150_tree=null;
        CommonTree CURRENT_ROW151_tree=null;
        CommonTree PRECEDING152_tree=null;
        CommonTree FOLLOWING154_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:371:5: ( UNBOUNDED_PRECEDING | UNBOUNDED_FOLLOWING | CURRENT_ROW | ^( PRECEDING expr ) | ^( FOLLOWING expr ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case UNBOUNDED_PRECEDING:
                {
                alt43=1;
                }
                break;
            case UNBOUNDED_FOLLOWING:
                {
                alt43=2;
                }
                break;
            case CURRENT_ROW:
                {
                alt43=3;
                }
                break;
            case PRECEDING:
                {
                alt43=4;
                }
                break;
            case FOLLOWING:
                {
                alt43=5;
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:371:7: UNBOUNDED_PRECEDING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UNBOUNDED_PRECEDING149=(CommonTree)match(input,UNBOUNDED_PRECEDING,FOLLOW_UNBOUNDED_PRECEDING_in_frameBound3082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNBOUNDED_PRECEDING149_tree = (CommonTree)adaptor.dupNode(UNBOUNDED_PRECEDING149);


                    adaptor.addChild(root_0, UNBOUNDED_PRECEDING149_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new FrameBound(FrameBound.Type.UNBOUNDED_PRECEDING); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:372:7: UNBOUNDED_FOLLOWING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UNBOUNDED_FOLLOWING150=(CommonTree)match(input,UNBOUNDED_FOLLOWING,FOLLOW_UNBOUNDED_FOLLOWING_in_frameBound3092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNBOUNDED_FOLLOWING150_tree = (CommonTree)adaptor.dupNode(UNBOUNDED_FOLLOWING150);


                    adaptor.addChild(root_0, UNBOUNDED_FOLLOWING150_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new FrameBound(FrameBound.Type.UNBOUNDED_FOLLOWING); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:373:7: CURRENT_ROW
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CURRENT_ROW151=(CommonTree)match(input,CURRENT_ROW,FOLLOW_CURRENT_ROW_in_frameBound3102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_ROW151_tree = (CommonTree)adaptor.dupNode(CURRENT_ROW151);


                    adaptor.addChild(root_0, CURRENT_ROW151_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new FrameBound(FrameBound.Type.CURRENT_ROW); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:374:7: ^( PRECEDING expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PRECEDING152=(CommonTree)match(input,PRECEDING,FOLLOW_PRECEDING_in_frameBound3121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRECEDING152_tree = (CommonTree)adaptor.dupNode(PRECEDING152);


                    root_1 = (CommonTree)adaptor.becomeRoot(PRECEDING152_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_frameBound3123);
                    expr153=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr153.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new FrameBound(FrameBound.Type.PRECEDING, (expr153!=null?expr153.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:375:7: ^( FOLLOWING expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FOLLOWING154=(CommonTree)match(input,FOLLOWING,FOLLOW_FOLLOWING_in_frameBound3137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOLLOWING154_tree = (CommonTree)adaptor.dupNode(FOLLOWING154);


                    root_1 = (CommonTree)adaptor.becomeRoot(FOLLOWING154_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_frameBound3139);
                    expr155=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr155.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new FrameBound(FrameBound.Type.FOLLOWING, (expr155!=null?expr155.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "frameBound"


    public static class extract_return extends TreeRuleReturnScope {
        public Extract value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extract"
    // com/facebook/presto/sql/parser/StatementBuilder.g:378:1: extract returns [Extract value] : ^( EXTRACT field= IDENT expr ) ;
    public final StatementBuilder.extract_return extract() throws RecognitionException {
        StatementBuilder.extract_return retval = new StatementBuilder.extract_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree field=null;
        CommonTree EXTRACT156=null;
        StatementBuilder.expr_return expr157 =null;


        CommonTree field_tree=null;
        CommonTree EXTRACT156_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:379:5: ( ^( EXTRACT field= IDENT expr ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:379:7: ^( EXTRACT field= IDENT expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTRACT156=(CommonTree)match(input,EXTRACT,FOLLOW_EXTRACT_in_extract3166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTRACT156_tree = (CommonTree)adaptor.dupNode(EXTRACT156);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTRACT156_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            field=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_extract3170); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            field_tree = (CommonTree)adaptor.dupNode(field);


            adaptor.addChild(root_1, field_tree);
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_extract3172);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr157.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new Extract((expr157!=null?expr157.value:null), Extract.Field.valueOf((field!=null?field.getText():null).toUpperCase())); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extract"


    public static class cast_return extends TreeRuleReturnScope {
        public Cast value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cast"
    // com/facebook/presto/sql/parser/StatementBuilder.g:382:1: cast returns [Cast value] : ^( CAST expr IDENT ) ;
    public final StatementBuilder.cast_return cast() throws RecognitionException {
        StatementBuilder.cast_return retval = new StatementBuilder.cast_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CAST158=null;
        CommonTree IDENT160=null;
        StatementBuilder.expr_return expr159 =null;


        CommonTree CAST158_tree=null;
        CommonTree IDENT160_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:383:5: ( ^( CAST expr IDENT ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:383:7: ^( CAST expr IDENT )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CAST158=(CommonTree)match(input,CAST,FOLLOW_CAST_in_cast3197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CAST158_tree = (CommonTree)adaptor.dupNode(CAST158);


            root_1 = (CommonTree)adaptor.becomeRoot(CAST158_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_cast3199);
            expr159=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr159.getTree());


            _last = (CommonTree)input.LT(1);
            IDENT160=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_cast3201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT160_tree = (CommonTree)adaptor.dupNode(IDENT160);


            adaptor.addChild(root_1, IDENT160_tree);
            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new Cast((expr159!=null?expr159.value:null), (IDENT160!=null?IDENT160.getText():null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cast"


    public static class current_time_return extends TreeRuleReturnScope {
        public CurrentTime value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "current_time"
    // com/facebook/presto/sql/parser/StatementBuilder.g:386:1: current_time returns [CurrentTime value] : ( CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | ^( CURRENT_TIME integer ) | ^( CURRENT_TIMESTAMP integer ) );
    public final StatementBuilder.current_time_return current_time() throws RecognitionException {
        StatementBuilder.current_time_return retval = new StatementBuilder.current_time_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CURRENT_DATE161=null;
        CommonTree CURRENT_TIME162=null;
        CommonTree CURRENT_TIMESTAMP163=null;
        CommonTree CURRENT_TIME164=null;
        CommonTree CURRENT_TIMESTAMP166=null;
        StatementBuilder.integer_return integer165 =null;

        StatementBuilder.integer_return integer167 =null;


        CommonTree CURRENT_DATE161_tree=null;
        CommonTree CURRENT_TIME162_tree=null;
        CommonTree CURRENT_TIMESTAMP163_tree=null;
        CommonTree CURRENT_TIME164_tree=null;
        CommonTree CURRENT_TIMESTAMP166_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:387:5: ( CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | ^( CURRENT_TIME integer ) | ^( CURRENT_TIMESTAMP integer ) )
            int alt44=5;
            switch ( input.LA(1) ) {
            case CURRENT_DATE:
                {
                alt44=1;
                }
                break;
            case CURRENT_TIME:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    alt44=4;
                    }
                    break;
                case EOF:
                case UP:
                case AND:
                case ASC:
                case BETWEEN:
                case CAST:
                case COALESCE:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case DATE:
                case DECIMAL_VALUE:
                case DESC:
                case EQ:
                case EXISTS:
                case EXTRACT:
                case FALSE:
                case FUNCTION_CALL:
                case GT:
                case GTE:
                case IDENT:
                case IF:
                case IN:
                case INTEGER_VALUE:
                case INTERVAL:
                case IN_LIST:
                case IS_DISTINCT_FROM:
                case IS_NOT_NULL:
                case IS_NULL:
                case LIKE:
                case LT:
                case LTE:
                case NEGATIVE:
                case NEQ:
                case NOT:
                case NULL:
                case NULLIF:
                case OR:
                case QNAME:
                case QUERY:
                case QUOTED_IDENT:
                case SEARCHED_CASE:
                case SIMPLE_CASE:
                case STRATIFY_ON:
                case STRING:
                case TIME:
                case TIMESTAMP:
                case TRUE:
                case WHEN:
                case 199:
                case 202:
                case 203:
                case 205:
                case 207:
                    {
                    alt44=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;

                }

                }
                break;
            case CURRENT_TIMESTAMP:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    alt44=5;
                    }
                    break;
                case EOF:
                case UP:
                case AND:
                case ASC:
                case BETWEEN:
                case CAST:
                case COALESCE:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case DATE:
                case DECIMAL_VALUE:
                case DESC:
                case EQ:
                case EXISTS:
                case EXTRACT:
                case FALSE:
                case FUNCTION_CALL:
                case GT:
                case GTE:
                case IDENT:
                case IF:
                case IN:
                case INTEGER_VALUE:
                case INTERVAL:
                case IN_LIST:
                case IS_DISTINCT_FROM:
                case IS_NOT_NULL:
                case IS_NULL:
                case LIKE:
                case LT:
                case LTE:
                case NEGATIVE:
                case NEQ:
                case NOT:
                case NULL:
                case NULLIF:
                case OR:
                case QNAME:
                case QUERY:
                case QUOTED_IDENT:
                case SEARCHED_CASE:
                case SIMPLE_CASE:
                case STRATIFY_ON:
                case STRING:
                case TIME:
                case TIMESTAMP:
                case TRUE:
                case WHEN:
                case 199:
                case 202:
                case 203:
                case 205:
                case 207:
                    {
                    alt44=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:387:7: CURRENT_DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CURRENT_DATE161=(CommonTree)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_current_time3225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_DATE161_tree = (CommonTree)adaptor.dupNode(CURRENT_DATE161);


                    adaptor.addChild(root_0, CURRENT_DATE161_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new CurrentTime(CurrentTime.Type.DATE); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:388:7: CURRENT_TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CURRENT_TIME162=(CommonTree)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_current_time3253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_TIME162_tree = (CommonTree)adaptor.dupNode(CURRENT_TIME162);


                    adaptor.addChild(root_0, CURRENT_TIME162_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new CurrentTime(CurrentTime.Type.TIME); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:389:7: CURRENT_TIMESTAMP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CURRENT_TIMESTAMP163=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_current_time3281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_TIMESTAMP163_tree = (CommonTree)adaptor.dupNode(CURRENT_TIMESTAMP163);


                    adaptor.addChild(root_0, CURRENT_TIMESTAMP163_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = new CurrentTime(CurrentTime.Type.TIMESTAMP); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:390:7: ^( CURRENT_TIME integer )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CURRENT_TIME164=(CommonTree)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_current_time3305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_TIME164_tree = (CommonTree)adaptor.dupNode(CURRENT_TIME164);


                    root_1 = (CommonTree)adaptor.becomeRoot(CURRENT_TIME164_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_current_time3307);
                    integer165=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, integer165.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new CurrentTime(CurrentTime.Type.TIME, Integer.valueOf((integer165!=null?integer165.value:null))); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:391:7: ^( CURRENT_TIMESTAMP integer )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CURRENT_TIMESTAMP166=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_current_time3326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CURRENT_TIMESTAMP166_tree = (CommonTree)adaptor.dupNode(CURRENT_TIMESTAMP166);


                    root_1 = (CommonTree)adaptor.becomeRoot(CURRENT_TIMESTAMP166_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_current_time3328);
                    integer167=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, integer167.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new CurrentTime(CurrentTime.Type.TIMESTAMP, Integer.valueOf((integer167!=null?integer167.value:null))); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "current_time"


    public static class arithmeticExpression_return extends TreeRuleReturnScope {
        public ArithmeticExpression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmeticExpression"
    // com/facebook/presto/sql/parser/StatementBuilder.g:394:1: arithmeticExpression returns [ArithmeticExpression value] : ^(t= arithmeticType a= expr b= expr ) ;
    public final StatementBuilder.arithmeticExpression_return arithmeticExpression() throws RecognitionException {
        StatementBuilder.arithmeticExpression_return retval = new StatementBuilder.arithmeticExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.arithmeticType_return t =null;

        StatementBuilder.expr_return a =null;

        StatementBuilder.expr_return b =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:395:5: ( ^(t= arithmeticType a= expr b= expr ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:395:7: ^(t= arithmeticType a= expr b= expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arithmeticType_in_arithmeticExpression3357);
            t=arithmeticType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_1 = (CommonTree)adaptor.becomeRoot(t.getTree(), root_1);


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_arithmeticExpression3361);
            a=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, a.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_arithmeticExpression3365);
            b=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, b.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new ArithmeticExpression((t!=null?t.value:null), (a!=null?a.value:null), (b!=null?b.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithmeticExpression"


    public static class arithmeticType_return extends TreeRuleReturnScope {
        public ArithmeticExpression.Type value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmeticType"
    // com/facebook/presto/sql/parser/StatementBuilder.g:398:1: arithmeticType returns [ArithmeticExpression.Type value] : ( '+' | '-' | '*' | '/' | '%' );
    public final StatementBuilder.arithmeticType_return arithmeticType() throws RecognitionException {
        StatementBuilder.arithmeticType_return retval = new StatementBuilder.arithmeticType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal168=null;
        CommonTree char_literal169=null;
        CommonTree char_literal170=null;
        CommonTree char_literal171=null;
        CommonTree char_literal172=null;

        CommonTree char_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree char_literal171_tree=null;
        CommonTree char_literal172_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:399:5: ( '+' | '-' | '*' | '/' | '%' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 203:
                {
                alt45=1;
                }
                break;
            case 205:
                {
                alt45=2;
                }
                break;
            case 202:
                {
                alt45=3;
                }
                break;
            case 207:
                {
                alt45=4;
                }
                break;
            case 199:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:399:7: '+'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal168=(CommonTree)match(input,203,FOLLOW_203_in_arithmeticType3389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal168_tree = (CommonTree)adaptor.dupNode(char_literal168);


                    adaptor.addChild(root_0, char_literal168_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ArithmeticExpression.Type.ADD; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:400:7: '-'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal169=(CommonTree)match(input,205,FOLLOW_205_in_arithmeticType3399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal169_tree = (CommonTree)adaptor.dupNode(char_literal169);


                    adaptor.addChild(root_0, char_literal169_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ArithmeticExpression.Type.SUBTRACT; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:401:7: '*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal170=(CommonTree)match(input,202,FOLLOW_202_in_arithmeticType3409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal170_tree = (CommonTree)adaptor.dupNode(char_literal170);


                    adaptor.addChild(root_0, char_literal170_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ArithmeticExpression.Type.MULTIPLY; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:402:7: '/'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal171=(CommonTree)match(input,207,FOLLOW_207_in_arithmeticType3419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal171_tree = (CommonTree)adaptor.dupNode(char_literal171);


                    adaptor.addChild(root_0, char_literal171_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ArithmeticExpression.Type.DIVIDE; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:403:7: '%'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal172=(CommonTree)match(input,199,FOLLOW_199_in_arithmeticType3429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal172_tree = (CommonTree)adaptor.dupNode(char_literal172);


                    adaptor.addChild(root_0, char_literal172_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ArithmeticExpression.Type.MODULUS; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithmeticType"


    public static class comparisonExpression_return extends TreeRuleReturnScope {
        public ComparisonExpression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonExpression"
    // com/facebook/presto/sql/parser/StatementBuilder.g:406:1: comparisonExpression returns [ComparisonExpression value] : ^(t= comparisonType a= expr b= expr ) ;
    public final StatementBuilder.comparisonExpression_return comparisonExpression() throws RecognitionException {
        StatementBuilder.comparisonExpression_return retval = new StatementBuilder.comparisonExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        StatementBuilder.comparisonType_return t =null;

        StatementBuilder.expr_return a =null;

        StatementBuilder.expr_return b =null;



        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:407:5: ( ^(t= comparisonType a= expr b= expr ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:407:7: ^(t= comparisonType a= expr b= expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_comparisonType_in_comparisonExpression3455);
            t=comparisonType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_1 = (CommonTree)adaptor.becomeRoot(t.getTree(), root_1);


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_comparisonExpression3459);
            a=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, a.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_comparisonExpression3463);
            b=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, b.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new ComparisonExpression((t!=null?t.value:null), (a!=null?a.value:null), (b!=null?b.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparisonExpression"


    public static class comparisonType_return extends TreeRuleReturnScope {
        public ComparisonExpression.Type value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonType"
    // com/facebook/presto/sql/parser/StatementBuilder.g:410:1: comparisonType returns [ComparisonExpression.Type value] : ( EQ | NEQ | LT | LTE | GT | GTE | IS_DISTINCT_FROM );
    public final StatementBuilder.comparisonType_return comparisonType() throws RecognitionException {
        StatementBuilder.comparisonType_return retval = new StatementBuilder.comparisonType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ173=null;
        CommonTree NEQ174=null;
        CommonTree LT175=null;
        CommonTree LTE176=null;
        CommonTree GT177=null;
        CommonTree GTE178=null;
        CommonTree IS_DISTINCT_FROM179=null;

        CommonTree EQ173_tree=null;
        CommonTree NEQ174_tree=null;
        CommonTree LT175_tree=null;
        CommonTree LTE176_tree=null;
        CommonTree GT177_tree=null;
        CommonTree GTE178_tree=null;
        CommonTree IS_DISTINCT_FROM179_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:411:5: ( EQ | NEQ | LT | LTE | GT | GTE | IS_DISTINCT_FROM )
            int alt46=7;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt46=1;
                }
                break;
            case NEQ:
                {
                alt46=2;
                }
                break;
            case LT:
                {
                alt46=3;
                }
                break;
            case LTE:
                {
                alt46=4;
                }
                break;
            case GT:
                {
                alt46=5;
                }
                break;
            case GTE:
                {
                alt46=6;
                }
                break;
            case IS_DISTINCT_FROM:
                {
                alt46=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:411:7: EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    EQ173=(CommonTree)match(input,EQ,FOLLOW_EQ_in_comparisonType3487); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ173_tree = (CommonTree)adaptor.dupNode(EQ173);


                    adaptor.addChild(root_0, EQ173_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.EQUAL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:412:7: NEQ
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NEQ174=(CommonTree)match(input,NEQ,FOLLOW_NEQ_in_comparisonType3516); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEQ174_tree = (CommonTree)adaptor.dupNode(NEQ174);


                    adaptor.addChild(root_0, NEQ174_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.NOT_EQUAL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:413:7: LT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LT175=(CommonTree)match(input,LT,FOLLOW_LT_in_comparisonType3544); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT175_tree = (CommonTree)adaptor.dupNode(LT175);


                    adaptor.addChild(root_0, LT175_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.LESS_THAN; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:414:7: LTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LTE176=(CommonTree)match(input,LTE,FOLLOW_LTE_in_comparisonType3573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LTE176_tree = (CommonTree)adaptor.dupNode(LTE176);


                    adaptor.addChild(root_0, LTE176_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.LESS_THAN_OR_EQUAL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:415:7: GT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    GT177=(CommonTree)match(input,GT,FOLLOW_GT_in_comparisonType3601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT177_tree = (CommonTree)adaptor.dupNode(GT177);


                    adaptor.addChild(root_0, GT177_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.GREATER_THAN; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:416:7: GTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    GTE178=(CommonTree)match(input,GTE,FOLLOW_GTE_in_comparisonType3630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GTE178_tree = (CommonTree)adaptor.dupNode(GTE178);


                    adaptor.addChild(root_0, GTE178_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.GREATER_THAN_OR_EQUAL; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:417:7: IS_DISTINCT_FROM
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IS_DISTINCT_FROM179=(CommonTree)match(input,IS_DISTINCT_FROM,FOLLOW_IS_DISTINCT_FROM_in_comparisonType3658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IS_DISTINCT_FROM179_tree = (CommonTree)adaptor.dupNode(IS_DISTINCT_FROM179);


                    adaptor.addChild(root_0, IS_DISTINCT_FROM179_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = ComparisonExpression.Type.IS_DISTINCT_FROM; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparisonType"


    public static class intervalValue_return extends TreeRuleReturnScope {
        public IntervalLiteral value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalValue"
    // com/facebook/presto/sql/parser/StatementBuilder.g:420:1: intervalValue returns [IntervalLiteral value] : ^( INTERVAL s= string q= intervalQualifier g= intervalSign ) ;
    public final StatementBuilder.intervalValue_return intervalValue() throws RecognitionException {
        StatementBuilder.intervalValue_return retval = new StatementBuilder.intervalValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERVAL180=null;
        StatementBuilder.string_return s =null;

        StatementBuilder.intervalQualifier_return q =null;

        StatementBuilder.intervalSign_return g =null;


        CommonTree INTERVAL180_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:421:5: ( ^( INTERVAL s= string q= intervalQualifier g= intervalSign ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:421:7: ^( INTERVAL s= string q= intervalQualifier g= intervalSign )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INTERVAL180=(CommonTree)match(input,INTERVAL,FOLLOW_INTERVAL_in_intervalValue3687); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERVAL180_tree = (CommonTree)adaptor.dupNode(INTERVAL180);


            root_1 = (CommonTree)adaptor.becomeRoot(INTERVAL180_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_in_intervalValue3691);
            s=string();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, s.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_intervalQualifier_in_intervalValue3695);
            q=intervalQualifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, q.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_intervalSign_in_intervalValue3699);
            g=intervalSign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, g.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new IntervalLiteral((s!=null?s.value:null), (q!=null?q.value:null), (g!=null?g.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intervalValue"


    public static class intervalQualifier_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalQualifier"
    // com/facebook/presto/sql/parser/StatementBuilder.g:425:1: intervalQualifier returns [String value] : (t= nonSecond | ^(t= nonSecond p= integer ) | SECOND | ^( SECOND p= integer ) | ^( SECOND p= integer s= integer ) );
    public final StatementBuilder.intervalQualifier_return intervalQualifier() throws RecognitionException {
        StatementBuilder.intervalQualifier_return retval = new StatementBuilder.intervalQualifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SECOND181=null;
        CommonTree SECOND182=null;
        CommonTree SECOND183=null;
        StatementBuilder.nonSecond_return t =null;

        StatementBuilder.integer_return p =null;

        StatementBuilder.integer_return s =null;


        CommonTree SECOND181_tree=null;
        CommonTree SECOND182_tree=null;
        CommonTree SECOND183_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:426:5: (t= nonSecond | ^(t= nonSecond p= integer ) | SECOND | ^( SECOND p= integer ) | ^( SECOND p= integer s= integer ) )
            int alt47=5;
            switch ( input.LA(1) ) {
            case DAY:
            case HOUR:
            case MINUTE:
            case MONTH:
            case YEAR:
                {
                switch ( input.LA(2) ) {
                case UP:
                case NEGATIVE:
                    {
                    alt47=1;
                    }
                    break;
                case DOWN:
                    {
                    alt47=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }

                }
                break;
            case SECOND:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case INTEGER_VALUE:
                        {
                        switch ( input.LA(4) ) {
                        case UP:
                            {
                            alt47=4;
                            }
                            break;
                        case INTEGER_VALUE:
                            {
                            alt47=5;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case UP:
                case NEGATIVE:
                    {
                    alt47=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:426:7: t= nonSecond
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nonSecond_in_intervalQualifier3726);
                    t=nonSecond();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, t.getTree());


                    if ( state.backtracking==0 ) { retval.value = (t!=null?t.value:null); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:427:7: ^(t= nonSecond p= integer )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nonSecond_in_intervalQualifier3757);
                    t=nonSecond();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_1 = (CommonTree)adaptor.becomeRoot(t.getTree(), root_1);


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_intervalQualifier3761);
                    p=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, p.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = String.format("%s (%s)", (t!=null?t.value:null), (p!=null?p.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:428:7: SECOND
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    SECOND181=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_intervalQualifier3777); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SECOND181_tree = (CommonTree)adaptor.dupNode(SECOND181);


                    adaptor.addChild(root_0, SECOND181_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = "SECOND"; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:429:7: ^( SECOND p= integer )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SECOND182=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_intervalQualifier3811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SECOND182_tree = (CommonTree)adaptor.dupNode(SECOND182);


                    root_1 = (CommonTree)adaptor.becomeRoot(SECOND182_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_intervalQualifier3815);
                    p=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, p.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = String.format("SECOND (%s)", (p!=null?p.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:430:7: ^( SECOND p= integer s= integer )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SECOND183=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_intervalQualifier3837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SECOND183_tree = (CommonTree)adaptor.dupNode(SECOND183);


                    root_1 = (CommonTree)adaptor.becomeRoot(SECOND183_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_intervalQualifier3841);
                    p=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, p.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integer_in_intervalQualifier3845);
                    s=integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, s.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = String.format("SECOND (%s, %s)", (p!=null?p.value:null), (s!=null?s.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intervalQualifier"


    public static class nonSecond_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonSecond"
    // com/facebook/presto/sql/parser/StatementBuilder.g:433:1: nonSecond returns [String value] : t= ( YEAR | MONTH | DAY | HOUR | MINUTE ) ;
    public final StatementBuilder.nonSecond_return nonSecond() throws RecognitionException {
        StatementBuilder.nonSecond_return retval = new StatementBuilder.nonSecond_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree t=null;

        CommonTree t_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:434:5: (t= ( YEAR | MONTH | DAY | HOUR | MINUTE ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:434:7: t= ( YEAR | MONTH | DAY | HOUR | MINUTE )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            t=(CommonTree)input.LT(1);

            if ( input.LA(1)==DAY||input.LA(1)==HOUR||(input.LA(1) >= MINUTE && input.LA(1) <= MONTH)||input.LA(1)==YEAR ) {
                input.consume();
                if ( state.backtracking==0 ) {
                t_tree = (CommonTree)adaptor.dupNode(t);


                adaptor.addChild(root_0, t_tree);
                }

                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { retval.value = (t!=null?t.getText():null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonSecond"


    public static class intervalSign_return extends TreeRuleReturnScope {
        public IntervalLiteral.Sign value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalSign"
    // com/facebook/presto/sql/parser/StatementBuilder.g:437:1: intervalSign returns [IntervalLiteral.Sign value] : ( NEGATIVE |);
    public final StatementBuilder.intervalSign_return intervalSign() throws RecognitionException {
        StatementBuilder.intervalSign_return retval = new StatementBuilder.intervalSign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NEGATIVE184=null;

        CommonTree NEGATIVE184_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:438:5: ( NEGATIVE |)
            int alt48=2;
            switch ( input.LA(1) ) {
            case NEGATIVE:
                {
                alt48=1;
                }
                break;
            case UP:
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
                    // com/facebook/presto/sql/parser/StatementBuilder.g:438:7: NEGATIVE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NEGATIVE184=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_intervalSign3912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEGATIVE184_tree = (CommonTree)adaptor.dupNode(NEGATIVE184);


                    adaptor.addChild(root_0, NEGATIVE184_tree);
                    }


                    if ( state.backtracking==0 ) { retval.value = IntervalLiteral.Sign.NEGATIVE; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:439:16: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) { retval.value = IntervalLiteral.Sign.POSITIVE; }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intervalSign"


    public static class predicate_return extends TreeRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // com/facebook/presto/sql/parser/StatementBuilder.g:442:1: predicate returns [Expression value] : ( ^( BETWEEN v= expr min= expr max= expr ) | ^( LIKE v= expr p= expr (esc= expr )? ) | ^( IS_NULL expr ) | ^( IS_NOT_NULL expr ) | ^( IN v= expr list= expr ) | ^( EXISTS q= query ) );
    public final StatementBuilder.predicate_return predicate() throws RecognitionException {
        StatementBuilder.predicate_return retval = new StatementBuilder.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BETWEEN185=null;
        CommonTree LIKE186=null;
        CommonTree IS_NULL187=null;
        CommonTree IS_NOT_NULL189=null;
        CommonTree IN191=null;
        CommonTree EXISTS192=null;
        StatementBuilder.expr_return v =null;

        StatementBuilder.expr_return min =null;

        StatementBuilder.expr_return max =null;

        StatementBuilder.expr_return p =null;

        StatementBuilder.expr_return esc =null;

        StatementBuilder.expr_return list =null;

        StatementBuilder.query_return q =null;

        StatementBuilder.expr_return expr188 =null;

        StatementBuilder.expr_return expr190 =null;


        CommonTree BETWEEN185_tree=null;
        CommonTree LIKE186_tree=null;
        CommonTree IS_NULL187_tree=null;
        CommonTree IS_NOT_NULL189_tree=null;
        CommonTree IN191_tree=null;
        CommonTree EXISTS192_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:443:5: ( ^( BETWEEN v= expr min= expr max= expr ) | ^( LIKE v= expr p= expr (esc= expr )? ) | ^( IS_NULL expr ) | ^( IS_NOT_NULL expr ) | ^( IN v= expr list= expr ) | ^( EXISTS q= query ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case BETWEEN:
                {
                alt50=1;
                }
                break;
            case LIKE:
                {
                alt50=2;
                }
                break;
            case IS_NULL:
                {
                alt50=3;
                }
                break;
            case IS_NOT_NULL:
                {
                alt50=4;
                }
                break;
            case IN:
                {
                alt50=5;
                }
                break;
            case EXISTS:
                {
                alt50=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }

            switch (alt50) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:443:7: ^( BETWEEN v= expr min= expr max= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BETWEEN185=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_predicate3953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BETWEEN185_tree = (CommonTree)adaptor.dupNode(BETWEEN185);


                    root_1 = (CommonTree)adaptor.becomeRoot(BETWEEN185_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate3957);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate3961);
                    min=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, min.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate3965);
                    max=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, max.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new BetweenPredicate((v!=null?v.value:null), (min!=null?min.value:null), (max!=null?max.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:444:7: ^( LIKE v= expr p= expr (esc= expr )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LIKE186=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_predicate3977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LIKE186_tree = (CommonTree)adaptor.dupNode(LIKE186);


                    root_1 = (CommonTree)adaptor.becomeRoot(LIKE186_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate3981);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate3985);
                    p=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, p.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:444:31: (esc= expr )?
                    int alt49=2;
                    switch ( input.LA(1) ) {
                        case AND:
                        case BETWEEN:
                        case CAST:
                        case COALESCE:
                        case CURRENT_DATE:
                        case CURRENT_TIME:
                        case CURRENT_TIMESTAMP:
                        case DATE:
                        case DECIMAL_VALUE:
                        case EQ:
                        case EXISTS:
                        case EXTRACT:
                        case FALSE:
                        case FUNCTION_CALL:
                        case GT:
                        case GTE:
                        case IF:
                        case IN:
                        case INTEGER_VALUE:
                        case INTERVAL:
                        case IN_LIST:
                        case IS_DISTINCT_FROM:
                        case IS_NOT_NULL:
                        case IS_NULL:
                        case LIKE:
                        case LT:
                        case LTE:
                        case NEGATIVE:
                        case NEQ:
                        case NOT:
                        case NULL:
                        case NULLIF:
                        case OR:
                        case QNAME:
                        case QUERY:
                        case SEARCHED_CASE:
                        case SIMPLE_CASE:
                        case STRING:
                        case TIME:
                        case TIMESTAMP:
                        case TRUE:
                        case 199:
                        case 202:
                        case 203:
                        case 205:
                        case 207:
                            {
                            alt49=1;
                            }
                            break;
                    }

                    switch (alt49) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:444:31: esc= expr
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_expr_in_predicate3989);
                            esc=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, esc.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new LikePredicate((v!=null?v.value:null), (p!=null?p.value:null), (esc!=null?esc.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:445:7: ^( IS_NULL expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IS_NULL187=(CommonTree)match(input,IS_NULL,FOLLOW_IS_NULL_in_predicate4006); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IS_NULL187_tree = (CommonTree)adaptor.dupNode(IS_NULL187);


                    root_1 = (CommonTree)adaptor.becomeRoot(IS_NULL187_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate4008);
                    expr188=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr188.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new IsNullPredicate((expr188!=null?expr188.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:446:7: ^( IS_NOT_NULL expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IS_NOT_NULL189=(CommonTree)match(input,IS_NOT_NULL,FOLLOW_IS_NOT_NULL_in_predicate4040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IS_NOT_NULL189_tree = (CommonTree)adaptor.dupNode(IS_NOT_NULL189);


                    root_1 = (CommonTree)adaptor.becomeRoot(IS_NOT_NULL189_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate4042);
                    expr190=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr190.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new IsNotNullPredicate((expr190!=null?expr190.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:447:7: ^( IN v= expr list= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IN191=(CommonTree)match(input,IN,FOLLOW_IN_in_predicate4070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN191_tree = (CommonTree)adaptor.dupNode(IN191);


                    root_1 = (CommonTree)adaptor.becomeRoot(IN191_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate4074);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate4078);
                    list=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, list.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new InPredicate((v!=null?v.value:null), (list!=null?list.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:448:7: ^( EXISTS q= query )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXISTS192=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_predicate4103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXISTS192_tree = (CommonTree)adaptor.dupNode(EXISTS192);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXISTS192_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_query_in_predicate4107);
                    q=query();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, q.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new ExistsPredicate((q!=null?q.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class caseExpression_return extends TreeRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseExpression"
    // com/facebook/presto/sql/parser/StatementBuilder.g:451:1: caseExpression returns [Expression value] : ( ^( NULLIF a= expr b= expr ) | ^( COALESCE exprList ) | ^( SIMPLE_CASE v= expr whenList (e= expr )? ) | ^( SEARCHED_CASE whenList (e= expr )? ) | ^( IF c= expr t= expr (f= expr )? ) );
    public final StatementBuilder.caseExpression_return caseExpression() throws RecognitionException {
        StatementBuilder.caseExpression_return retval = new StatementBuilder.caseExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NULLIF193=null;
        CommonTree COALESCE194=null;
        CommonTree SIMPLE_CASE196=null;
        CommonTree SEARCHED_CASE198=null;
        CommonTree IF200=null;
        StatementBuilder.expr_return a =null;

        StatementBuilder.expr_return b =null;

        StatementBuilder.expr_return v =null;

        StatementBuilder.expr_return e =null;

        StatementBuilder.expr_return c =null;

        StatementBuilder.expr_return t =null;

        StatementBuilder.expr_return f =null;

        StatementBuilder.exprList_return exprList195 =null;

        StatementBuilder.whenList_return whenList197 =null;

        StatementBuilder.whenList_return whenList199 =null;


        CommonTree NULLIF193_tree=null;
        CommonTree COALESCE194_tree=null;
        CommonTree SIMPLE_CASE196_tree=null;
        CommonTree SEARCHED_CASE198_tree=null;
        CommonTree IF200_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:452:5: ( ^( NULLIF a= expr b= expr ) | ^( COALESCE exprList ) | ^( SIMPLE_CASE v= expr whenList (e= expr )? ) | ^( SEARCHED_CASE whenList (e= expr )? ) | ^( IF c= expr t= expr (f= expr )? ) )
            int alt54=5;
            switch ( input.LA(1) ) {
            case NULLIF:
                {
                alt54=1;
                }
                break;
            case COALESCE:
                {
                alt54=2;
                }
                break;
            case SIMPLE_CASE:
                {
                alt54=3;
                }
                break;
            case SEARCHED_CASE:
                {
                alt54=4;
                }
                break;
            case IF:
                {
                alt54=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:452:7: ^( NULLIF a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NULLIF193=(CommonTree)match(input,NULLIF,FOLLOW_NULLIF_in_caseExpression4150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULLIF193_tree = (CommonTree)adaptor.dupNode(NULLIF193);


                    root_1 = (CommonTree)adaptor.becomeRoot(NULLIF193_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_caseExpression4154);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_caseExpression4158);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new NullIfExpression((a!=null?a.value:null), (b!=null?b.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:453:7: ^( COALESCE exprList )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COALESCE194=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_caseExpression4185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COALESCE194_tree = (CommonTree)adaptor.dupNode(COALESCE194);


                    root_1 = (CommonTree)adaptor.becomeRoot(COALESCE194_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_exprList_in_caseExpression4187);
                        exprList195=exprList();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, exprList195.getTree());


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new CoalesceExpression((exprList195!=null?exprList195.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:454:7: ^( SIMPLE_CASE v= expr whenList (e= expr )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SIMPLE_CASE196=(CommonTree)match(input,SIMPLE_CASE,FOLLOW_SIMPLE_CASE_in_caseExpression4217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIMPLE_CASE196_tree = (CommonTree)adaptor.dupNode(SIMPLE_CASE196);


                    root_1 = (CommonTree)adaptor.becomeRoot(SIMPLE_CASE196_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_caseExpression4221);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whenList_in_caseExpression4223);
                    whenList197=whenList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, whenList197.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:454:38: (e= expr )?
                    int alt51=2;
                    switch ( input.LA(1) ) {
                        case AND:
                        case BETWEEN:
                        case CAST:
                        case COALESCE:
                        case CURRENT_DATE:
                        case CURRENT_TIME:
                        case CURRENT_TIMESTAMP:
                        case DATE:
                        case DECIMAL_VALUE:
                        case EQ:
                        case EXISTS:
                        case EXTRACT:
                        case FALSE:
                        case FUNCTION_CALL:
                        case GT:
                        case GTE:
                        case IF:
                        case IN:
                        case INTEGER_VALUE:
                        case INTERVAL:
                        case IN_LIST:
                        case IS_DISTINCT_FROM:
                        case IS_NOT_NULL:
                        case IS_NULL:
                        case LIKE:
                        case LT:
                        case LTE:
                        case NEGATIVE:
                        case NEQ:
                        case NOT:
                        case NULL:
                        case NULLIF:
                        case OR:
                        case QNAME:
                        case QUERY:
                        case SEARCHED_CASE:
                        case SIMPLE_CASE:
                        case STRING:
                        case TIME:
                        case TIMESTAMP:
                        case TRUE:
                        case 199:
                        case 202:
                        case 203:
                        case 205:
                        case 207:
                            {
                            alt51=1;
                            }
                            break;
                    }

                    switch (alt51) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:454:38: e= expr
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_expr_in_caseExpression4227);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, e.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new SimpleCaseExpression((v!=null?v.value:null), (whenList197!=null?whenList197.value:null), (e!=null?e.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:455:7: ^( SEARCHED_CASE whenList (e= expr )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SEARCHED_CASE198=(CommonTree)match(input,SEARCHED_CASE,FOLLOW_SEARCHED_CASE_in_caseExpression4240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEARCHED_CASE198_tree = (CommonTree)adaptor.dupNode(SEARCHED_CASE198);


                    root_1 = (CommonTree)adaptor.becomeRoot(SEARCHED_CASE198_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whenList_in_caseExpression4242);
                    whenList199=whenList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, whenList199.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:455:33: (e= expr )?
                    int alt52=2;
                    switch ( input.LA(1) ) {
                        case AND:
                        case BETWEEN:
                        case CAST:
                        case COALESCE:
                        case CURRENT_DATE:
                        case CURRENT_TIME:
                        case CURRENT_TIMESTAMP:
                        case DATE:
                        case DECIMAL_VALUE:
                        case EQ:
                        case EXISTS:
                        case EXTRACT:
                        case FALSE:
                        case FUNCTION_CALL:
                        case GT:
                        case GTE:
                        case IF:
                        case IN:
                        case INTEGER_VALUE:
                        case INTERVAL:
                        case IN_LIST:
                        case IS_DISTINCT_FROM:
                        case IS_NOT_NULL:
                        case IS_NULL:
                        case LIKE:
                        case LT:
                        case LTE:
                        case NEGATIVE:
                        case NEQ:
                        case NOT:
                        case NULL:
                        case NULLIF:
                        case OR:
                        case QNAME:
                        case QUERY:
                        case SEARCHED_CASE:
                        case SIMPLE_CASE:
                        case STRING:
                        case TIME:
                        case TIMESTAMP:
                        case TRUE:
                        case 199:
                        case 202:
                        case 203:
                        case 205:
                        case 207:
                            {
                            alt52=1;
                            }
                            break;
                    }

                    switch (alt52) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:455:33: e= expr
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_expr_in_caseExpression4246);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, e.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new SearchedCaseExpression((whenList199!=null?whenList199.value:null), (e!=null?e.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:456:7: ^( IF c= expr t= expr (f= expr )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IF200=(CommonTree)match(input,IF,FOLLOW_IF_in_caseExpression4264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF200_tree = (CommonTree)adaptor.dupNode(IF200);


                    root_1 = (CommonTree)adaptor.becomeRoot(IF200_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_caseExpression4268);
                    c=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, c.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_caseExpression4272);
                    t=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, t.getTree());


                    // com/facebook/presto/sql/parser/StatementBuilder.g:456:27: (f= expr )?
                    int alt53=2;
                    switch ( input.LA(1) ) {
                        case AND:
                        case BETWEEN:
                        case CAST:
                        case COALESCE:
                        case CURRENT_DATE:
                        case CURRENT_TIME:
                        case CURRENT_TIMESTAMP:
                        case DATE:
                        case DECIMAL_VALUE:
                        case EQ:
                        case EXISTS:
                        case EXTRACT:
                        case FALSE:
                        case FUNCTION_CALL:
                        case GT:
                        case GTE:
                        case IF:
                        case IN:
                        case INTEGER_VALUE:
                        case INTERVAL:
                        case IN_LIST:
                        case IS_DISTINCT_FROM:
                        case IS_NOT_NULL:
                        case IS_NULL:
                        case LIKE:
                        case LT:
                        case LTE:
                        case NEGATIVE:
                        case NEQ:
                        case NOT:
                        case NULL:
                        case NULLIF:
                        case OR:
                        case QNAME:
                        case QUERY:
                        case SEARCHED_CASE:
                        case SIMPLE_CASE:
                        case STRING:
                        case TIME:
                        case TIMESTAMP:
                        case TRUE:
                        case 199:
                        case 202:
                        case 203:
                        case 205:
                        case 207:
                            {
                            alt53=1;
                            }
                            break;
                    }

                    switch (alt53) {
                        case 1 :
                            // com/facebook/presto/sql/parser/StatementBuilder.g:456:27: f= expr
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_expr_in_caseExpression4276);
                            f=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, f.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new IfExpression((c!=null?c.value:null), (t!=null?t.value:null), (f!=null?f.value:null)); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "caseExpression"


    public static class whenList_return extends TreeRuleReturnScope {
        public List<WhenClause> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whenList"
    // com/facebook/presto/sql/parser/StatementBuilder.g:459:1: whenList returns [List<WhenClause> value = new ArrayList<>()] : ( ^( WHEN a= expr b= expr ) )+ ;
    public final StatementBuilder.whenList_return whenList() throws RecognitionException {
        StatementBuilder.whenList_return retval = new StatementBuilder.whenList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHEN201=null;
        StatementBuilder.expr_return a =null;

        StatementBuilder.expr_return b =null;


        CommonTree WHEN201_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:460:5: ( ( ^( WHEN a= expr b= expr ) )+ )
            // com/facebook/presto/sql/parser/StatementBuilder.g:460:7: ( ^( WHEN a= expr b= expr ) )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/facebook/presto/sql/parser/StatementBuilder.g:460:7: ( ^( WHEN a= expr b= expr ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case WHEN:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:460:9: ^( WHEN a= expr b= expr )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    WHEN201=(CommonTree)match(input,WHEN,FOLLOW_WHEN_in_whenList4315); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    WHEN201_tree = (CommonTree)adaptor.dupNode(WHEN201);


            	    root_1 = (CommonTree)adaptor.becomeRoot(WHEN201_tree, root_1);
            	    }


            	    match(input, Token.DOWN, null); if (state.failed) return retval;
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_whenList4319);
            	    a=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, a.getTree());


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_whenList4323);
            	    b=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, b.getTree());


            	    match(input, Token.UP, null); if (state.failed) return retval;
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    if ( state.backtracking==0 ) { retval.value.add(new WhenClause((a!=null?a.value:null), (b!=null?b.value:null))); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whenList"


    public static class explain_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explain"
    // com/facebook/presto/sql/parser/StatementBuilder.g:463:1: explain returns [Statement value] : ^( EXPLAIN ( explainOptions )? query ) ;
    public final StatementBuilder.explain_return explain() throws RecognitionException {
        StatementBuilder.explain_return retval = new StatementBuilder.explain_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPLAIN202=null;
        StatementBuilder.explainOptions_return explainOptions203 =null;

        StatementBuilder.query_return query204 =null;


        CommonTree EXPLAIN202_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:464:5: ( ^( EXPLAIN ( explainOptions )? query ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:464:7: ^( EXPLAIN ( explainOptions )? query )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXPLAIN202=(CommonTree)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_explain4351); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXPLAIN202_tree = (CommonTree)adaptor.dupNode(EXPLAIN202);


            root_1 = (CommonTree)adaptor.becomeRoot(EXPLAIN202_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // com/facebook/presto/sql/parser/StatementBuilder.g:464:17: ( explainOptions )?
            int alt56=2;
            switch ( input.LA(1) ) {
                case EXPLAIN_OPTIONS:
                    {
                    alt56=1;
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:464:17: explainOptions
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_explainOptions_in_explain4353);
                    explainOptions203=explainOptions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, explainOptions203.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_query_in_explain4356);
            query204=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, query204.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new Explain((query204!=null?query204.value:null), (explainOptions203!=null?explainOptions203.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "explain"


    public static class explainOptions_return extends TreeRuleReturnScope {
        public List<ExplainOption> value = new ArrayList<>();
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explainOptions"
    // com/facebook/presto/sql/parser/StatementBuilder.g:467:1: explainOptions returns [List<ExplainOption> value = new ArrayList<>()] : ^( EXPLAIN_OPTIONS ( explainOption )+ ) ;
    public final StatementBuilder.explainOptions_return explainOptions() throws RecognitionException {
        StatementBuilder.explainOptions_return retval = new StatementBuilder.explainOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPLAIN_OPTIONS205=null;
        StatementBuilder.explainOption_return explainOption206 =null;


        CommonTree EXPLAIN_OPTIONS205_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:468:5: ( ^( EXPLAIN_OPTIONS ( explainOption )+ ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:468:7: ^( EXPLAIN_OPTIONS ( explainOption )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXPLAIN_OPTIONS205=(CommonTree)match(input,EXPLAIN_OPTIONS,FOLLOW_EXPLAIN_OPTIONS_in_explainOptions4381); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXPLAIN_OPTIONS205_tree = (CommonTree)adaptor.dupNode(EXPLAIN_OPTIONS205);


            root_1 = (CommonTree)adaptor.becomeRoot(EXPLAIN_OPTIONS205_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // com/facebook/presto/sql/parser/StatementBuilder.g:468:25: ( explainOption )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case EXPLAIN_FORMAT:
                case EXPLAIN_TYPE:
                    {
                    alt57=1;
                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // com/facebook/presto/sql/parser/StatementBuilder.g:468:27: explainOption
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_explainOption_in_explainOptions4385);
            	    explainOption206=explainOption();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, explainOption206.getTree());


            	    if ( state.backtracking==0 ) { retval.value.add((explainOption206!=null?explainOption206.value:null)); }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "explainOptions"


    public static class explainOption_return extends TreeRuleReturnScope {
        public ExplainOption value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explainOption"
    // com/facebook/presto/sql/parser/StatementBuilder.g:471:1: explainOption returns [ExplainOption value] : ( ^( EXPLAIN_FORMAT TEXT ) | ^( EXPLAIN_FORMAT GRAPHVIZ ) | ^( EXPLAIN_TYPE LOGICAL ) | ^( EXPLAIN_TYPE DISTRIBUTED ) );
    public final StatementBuilder.explainOption_return explainOption() throws RecognitionException {
        StatementBuilder.explainOption_return retval = new StatementBuilder.explainOption_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPLAIN_FORMAT207=null;
        CommonTree TEXT208=null;
        CommonTree EXPLAIN_FORMAT209=null;
        CommonTree GRAPHVIZ210=null;
        CommonTree EXPLAIN_TYPE211=null;
        CommonTree LOGICAL212=null;
        CommonTree EXPLAIN_TYPE213=null;
        CommonTree DISTRIBUTED214=null;

        CommonTree EXPLAIN_FORMAT207_tree=null;
        CommonTree TEXT208_tree=null;
        CommonTree EXPLAIN_FORMAT209_tree=null;
        CommonTree GRAPHVIZ210_tree=null;
        CommonTree EXPLAIN_TYPE211_tree=null;
        CommonTree LOGICAL212_tree=null;
        CommonTree EXPLAIN_TYPE213_tree=null;
        CommonTree DISTRIBUTED214_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:472:5: ( ^( EXPLAIN_FORMAT TEXT ) | ^( EXPLAIN_FORMAT GRAPHVIZ ) | ^( EXPLAIN_TYPE LOGICAL ) | ^( EXPLAIN_TYPE DISTRIBUTED ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case EXPLAIN_FORMAT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case TEXT:
                        {
                        alt58=1;
                        }
                        break;
                    case GRAPHVIZ:
                        {
                        alt58=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;

                }

                }
                break;
            case EXPLAIN_TYPE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case LOGICAL:
                        {
                        alt58=3;
                        }
                        break;
                    case DISTRIBUTED:
                        {
                        alt58=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:472:7: ^( EXPLAIN_FORMAT TEXT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXPLAIN_FORMAT207=(CommonTree)match(input,EXPLAIN_FORMAT,FOLLOW_EXPLAIN_FORMAT_in_explainOption4414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXPLAIN_FORMAT207_tree = (CommonTree)adaptor.dupNode(EXPLAIN_FORMAT207);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXPLAIN_FORMAT207_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    TEXT208=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_explainOption4416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TEXT208_tree = (CommonTree)adaptor.dupNode(TEXT208);


                    adaptor.addChild(root_1, TEXT208_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new ExplainFormat(ExplainFormat.Type.TEXT); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:473:7: ^( EXPLAIN_FORMAT GRAPHVIZ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXPLAIN_FORMAT209=(CommonTree)match(input,EXPLAIN_FORMAT,FOLLOW_EXPLAIN_FORMAT_in_explainOption4433); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXPLAIN_FORMAT209_tree = (CommonTree)adaptor.dupNode(EXPLAIN_FORMAT209);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXPLAIN_FORMAT209_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    GRAPHVIZ210=(CommonTree)match(input,GRAPHVIZ,FOLLOW_GRAPHVIZ_in_explainOption4435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GRAPHVIZ210_tree = (CommonTree)adaptor.dupNode(GRAPHVIZ210);


                    adaptor.addChild(root_1, GRAPHVIZ210_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new ExplainFormat(ExplainFormat.Type.GRAPHVIZ); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:474:7: ^( EXPLAIN_TYPE LOGICAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXPLAIN_TYPE211=(CommonTree)match(input,EXPLAIN_TYPE,FOLLOW_EXPLAIN_TYPE_in_explainOption4448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXPLAIN_TYPE211_tree = (CommonTree)adaptor.dupNode(EXPLAIN_TYPE211);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXPLAIN_TYPE211_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    LOGICAL212=(CommonTree)match(input,LOGICAL,FOLLOW_LOGICAL_in_explainOption4450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOGICAL212_tree = (CommonTree)adaptor.dupNode(LOGICAL212);


                    adaptor.addChild(root_1, LOGICAL212_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new ExplainType(ExplainType.Type.LOGICAL); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:475:7: ^( EXPLAIN_TYPE DISTRIBUTED )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXPLAIN_TYPE213=(CommonTree)match(input,EXPLAIN_TYPE,FOLLOW_EXPLAIN_TYPE_in_explainOption4466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXPLAIN_TYPE213_tree = (CommonTree)adaptor.dupNode(EXPLAIN_TYPE213);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXPLAIN_TYPE213_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    DISTRIBUTED214=(CommonTree)match(input,DISTRIBUTED,FOLLOW_DISTRIBUTED_in_explainOption4468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DISTRIBUTED214_tree = (CommonTree)adaptor.dupNode(DISTRIBUTED214);


                    adaptor.addChild(root_1, DISTRIBUTED214_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { retval.value = new ExplainType(ExplainType.Type.DISTRIBUTED); }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "explainOption"


    public static class showTables_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showTables"
    // com/facebook/presto/sql/parser/StatementBuilder.g:478:1: showTables returns [Statement value] : ^( SHOW_TABLES (from= showTablesFrom )? (like= showTablesLike )? ) ;
    public final StatementBuilder.showTables_return showTables() throws RecognitionException {
        StatementBuilder.showTables_return retval = new StatementBuilder.showTables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SHOW_TABLES215=null;
        StatementBuilder.showTablesFrom_return from =null;

        StatementBuilder.showTablesLike_return like =null;


        CommonTree SHOW_TABLES215_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:479:5: ( ^( SHOW_TABLES (from= showTablesFrom )? (like= showTablesLike )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:479:7: ^( SHOW_TABLES (from= showTablesFrom )? (like= showTablesLike )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SHOW_TABLES215=(CommonTree)match(input,SHOW_TABLES,FOLLOW_SHOW_TABLES_in_showTables4493); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SHOW_TABLES215_tree = (CommonTree)adaptor.dupNode(SHOW_TABLES215);


            root_1 = (CommonTree)adaptor.becomeRoot(SHOW_TABLES215_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // com/facebook/presto/sql/parser/StatementBuilder.g:479:25: (from= showTablesFrom )?
                int alt59=2;
                switch ( input.LA(1) ) {
                    case FROM:
                        {
                        alt59=1;
                        }
                        break;
                }

                switch (alt59) {
                    case 1 :
                        // com/facebook/presto/sql/parser/StatementBuilder.g:479:25: from= showTablesFrom
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_showTablesFrom_in_showTables4497);
                        from=showTablesFrom();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, from.getTree());


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                // com/facebook/presto/sql/parser/StatementBuilder.g:479:46: (like= showTablesLike )?
                int alt60=2;
                switch ( input.LA(1) ) {
                    case LIKE:
                        {
                        alt60=1;
                        }
                        break;
                }

                switch (alt60) {
                    case 1 :
                        // com/facebook/presto/sql/parser/StatementBuilder.g:479:46: like= showTablesLike
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_showTablesLike_in_showTables4502);
                        like=showTablesLike();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, like.getTree());


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new ShowTables((from!=null?from.value:null), (like!=null?like.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showTables"


    public static class showTablesFrom_return extends TreeRuleReturnScope {
        public QualifiedName value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showTablesFrom"
    // com/facebook/presto/sql/parser/StatementBuilder.g:482:1: showTablesFrom returns [QualifiedName value] : ^( FROM qname ) ;
    public final StatementBuilder.showTablesFrom_return showTablesFrom() throws RecognitionException {
        StatementBuilder.showTablesFrom_return retval = new StatementBuilder.showTablesFrom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FROM216=null;
        StatementBuilder.qname_return qname217 =null;


        CommonTree FROM216_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:483:5: ( ^( FROM qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:483:7: ^( FROM qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FROM216=(CommonTree)match(input,FROM,FOLLOW_FROM_in_showTablesFrom4528); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FROM216_tree = (CommonTree)adaptor.dupNode(FROM216);


            root_1 = (CommonTree)adaptor.becomeRoot(FROM216_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_showTablesFrom4530);
            qname217=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname217.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (qname217!=null?qname217.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showTablesFrom"


    public static class showTablesLike_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showTablesLike"
    // com/facebook/presto/sql/parser/StatementBuilder.g:486:1: showTablesLike returns [String value] : ^( LIKE string ) ;
    public final StatementBuilder.showTablesLike_return showTablesLike() throws RecognitionException {
        StatementBuilder.showTablesLike_return retval = new StatementBuilder.showTablesLike_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LIKE218=null;
        StatementBuilder.string_return string219 =null;


        CommonTree LIKE218_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:487:5: ( ^( LIKE string ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:487:7: ^( LIKE string )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LIKE218=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_showTablesLike4555); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LIKE218_tree = (CommonTree)adaptor.dupNode(LIKE218);


            root_1 = (CommonTree)adaptor.becomeRoot(LIKE218_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_in_showTablesLike4557);
            string219=string();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, string219.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (string219!=null?string219.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showTablesLike"


    public static class showSchemas_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showSchemas"
    // com/facebook/presto/sql/parser/StatementBuilder.g:490:1: showSchemas returns [Statement value] : SHOW_SCHEMAS ;
    public final StatementBuilder.showSchemas_return showSchemas() throws RecognitionException {
        StatementBuilder.showSchemas_return retval = new StatementBuilder.showSchemas_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SHOW_SCHEMAS220=null;

        CommonTree SHOW_SCHEMAS220_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:491:5: ( SHOW_SCHEMAS )
            // com/facebook/presto/sql/parser/StatementBuilder.g:491:7: SHOW_SCHEMAS
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            SHOW_SCHEMAS220=(CommonTree)match(input,SHOW_SCHEMAS,FOLLOW_SHOW_SCHEMAS_in_showSchemas4581); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SHOW_SCHEMAS220_tree = (CommonTree)adaptor.dupNode(SHOW_SCHEMAS220);


            adaptor.addChild(root_0, SHOW_SCHEMAS220_tree);
            }


            if ( state.backtracking==0 ) { retval.value = new ShowSchemas(); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showSchemas"


    public static class showCatalogs_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showCatalogs"
    // com/facebook/presto/sql/parser/StatementBuilder.g:494:1: showCatalogs returns [Statement value] : SHOW_CATALOGS ;
    public final StatementBuilder.showCatalogs_return showCatalogs() throws RecognitionException {
        StatementBuilder.showCatalogs_return retval = new StatementBuilder.showCatalogs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SHOW_CATALOGS221=null;

        CommonTree SHOW_CATALOGS221_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:495:5: ( SHOW_CATALOGS )
            // com/facebook/presto/sql/parser/StatementBuilder.g:495:7: SHOW_CATALOGS
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            SHOW_CATALOGS221=(CommonTree)match(input,SHOW_CATALOGS,FOLLOW_SHOW_CATALOGS_in_showCatalogs4604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SHOW_CATALOGS221_tree = (CommonTree)adaptor.dupNode(SHOW_CATALOGS221);


            adaptor.addChild(root_0, SHOW_CATALOGS221_tree);
            }


            if ( state.backtracking==0 ) { retval.value = new ShowCatalogs(); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showCatalogs"


    public static class showColumns_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showColumns"
    // com/facebook/presto/sql/parser/StatementBuilder.g:498:1: showColumns returns [Statement value] : ^( SHOW_COLUMNS qname ) ;
    public final StatementBuilder.showColumns_return showColumns() throws RecognitionException {
        StatementBuilder.showColumns_return retval = new StatementBuilder.showColumns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SHOW_COLUMNS222=null;
        StatementBuilder.qname_return qname223 =null;


        CommonTree SHOW_COLUMNS222_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:499:5: ( ^( SHOW_COLUMNS qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:499:7: ^( SHOW_COLUMNS qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SHOW_COLUMNS222=(CommonTree)match(input,SHOW_COLUMNS,FOLLOW_SHOW_COLUMNS_in_showColumns4628); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SHOW_COLUMNS222_tree = (CommonTree)adaptor.dupNode(SHOW_COLUMNS222);


            root_1 = (CommonTree)adaptor.becomeRoot(SHOW_COLUMNS222_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_showColumns4630);
            qname223=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname223.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new ShowColumns((qname223!=null?qname223.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showColumns"


    public static class showPartitions_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showPartitions"
    // com/facebook/presto/sql/parser/StatementBuilder.g:502:1: showPartitions returns [Statement value] : ^( SHOW_PARTITIONS qname ( whereClause )? ( orderClause )? ( limitClause )? ) ;
    public final StatementBuilder.showPartitions_return showPartitions() throws RecognitionException {
        StatementBuilder.showPartitions_return retval = new StatementBuilder.showPartitions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SHOW_PARTITIONS224=null;
        StatementBuilder.qname_return qname225 =null;

        StatementBuilder.whereClause_return whereClause226 =null;

        StatementBuilder.orderClause_return orderClause227 =null;

        StatementBuilder.limitClause_return limitClause228 =null;


        CommonTree SHOW_PARTITIONS224_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:503:5: ( ^( SHOW_PARTITIONS qname ( whereClause )? ( orderClause )? ( limitClause )? ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:503:7: ^( SHOW_PARTITIONS qname ( whereClause )? ( orderClause )? ( limitClause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SHOW_PARTITIONS224=(CommonTree)match(input,SHOW_PARTITIONS,FOLLOW_SHOW_PARTITIONS_in_showPartitions4655); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SHOW_PARTITIONS224_tree = (CommonTree)adaptor.dupNode(SHOW_PARTITIONS224);


            root_1 = (CommonTree)adaptor.becomeRoot(SHOW_PARTITIONS224_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_showPartitions4657);
            qname225=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname225.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:503:31: ( whereClause )?
            int alt61=2;
            switch ( input.LA(1) ) {
                case WHERE:
                    {
                    alt61=1;
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:503:31: whereClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_showPartitions4659);
                    whereClause226=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, whereClause226.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:503:44: ( orderClause )?
            int alt62=2;
            switch ( input.LA(1) ) {
                case ORDER_BY:
                    {
                    alt62=1;
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:503:44: orderClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderClause_in_showPartitions4662);
                    orderClause227=orderClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, orderClause227.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // com/facebook/presto/sql/parser/StatementBuilder.g:503:57: ( limitClause )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case LIMIT:
                    {
                    alt63=1;
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:503:57: limitClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_showPartitions4665);
                    limitClause228=limitClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, limitClause228.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new ShowPartitions(
                        (qname225!=null?qname225.value:null),
                        Optional.fromNullable((whereClause226!=null?whereClause226.value:null)),
                        Objects.firstNonNull((orderClause227!=null?orderClause227.value:null), ImmutableList.<SortItem>of()),
                        Optional.fromNullable((limitClause228!=null?limitClause228.value:null)));
                    }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showPartitions"


    public static class showFunctions_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showFunctions"
    // com/facebook/presto/sql/parser/StatementBuilder.g:512:1: showFunctions returns [Statement value] : SHOW_FUNCTIONS ;
    public final StatementBuilder.showFunctions_return showFunctions() throws RecognitionException {
        StatementBuilder.showFunctions_return retval = new StatementBuilder.showFunctions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SHOW_FUNCTIONS229=null;

        CommonTree SHOW_FUNCTIONS229_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:513:5: ( SHOW_FUNCTIONS )
            // com/facebook/presto/sql/parser/StatementBuilder.g:513:7: SHOW_FUNCTIONS
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            SHOW_FUNCTIONS229=(CommonTree)match(input,SHOW_FUNCTIONS,FOLLOW_SHOW_FUNCTIONS_in_showFunctions4698); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SHOW_FUNCTIONS229_tree = (CommonTree)adaptor.dupNode(SHOW_FUNCTIONS229);


            adaptor.addChild(root_0, SHOW_FUNCTIONS229_tree);
            }


            if ( state.backtracking==0 ) { retval.value = new ShowFunctions(); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "showFunctions"


    public static class createTable_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createTable"
    // com/facebook/presto/sql/parser/StatementBuilder.g:516:1: createTable returns [Statement value] : ^( CREATE_TABLE qname query ) ;
    public final StatementBuilder.createTable_return createTable() throws RecognitionException {
        StatementBuilder.createTable_return retval = new StatementBuilder.createTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE_TABLE230=null;
        StatementBuilder.qname_return qname231 =null;

        StatementBuilder.query_return query232 =null;


        CommonTree CREATE_TABLE230_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:517:5: ( ^( CREATE_TABLE qname query ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:517:7: ^( CREATE_TABLE qname query )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CREATE_TABLE230=(CommonTree)match(input,CREATE_TABLE,FOLLOW_CREATE_TABLE_in_createTable4722); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREATE_TABLE230_tree = (CommonTree)adaptor.dupNode(CREATE_TABLE230);


            root_1 = (CommonTree)adaptor.becomeRoot(CREATE_TABLE230_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_createTable4724);
            qname231=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname231.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_query_in_createTable4726);
            query232=query();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, query232.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new CreateTable((qname231!=null?qname231.value:null), (query232!=null?query232.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createTable"


    public static class createMaterializedView_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createMaterializedView"
    // com/facebook/presto/sql/parser/StatementBuilder.g:520:1: createMaterializedView returns [Statement value] : ^( CREATE_MATERIALIZED_VIEW qname (refresh= viewRefresh )? select= restrictedSelectStmt ) ;
    public final StatementBuilder.createMaterializedView_return createMaterializedView() throws RecognitionException {
        StatementBuilder.createMaterializedView_return retval = new StatementBuilder.createMaterializedView_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE_MATERIALIZED_VIEW233=null;
        StatementBuilder.viewRefresh_return refresh =null;

        StatementBuilder.restrictedSelectStmt_return select =null;

        StatementBuilder.qname_return qname234 =null;


        CommonTree CREATE_MATERIALIZED_VIEW233_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:521:5: ( ^( CREATE_MATERIALIZED_VIEW qname (refresh= viewRefresh )? select= restrictedSelectStmt ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:521:7: ^( CREATE_MATERIALIZED_VIEW qname (refresh= viewRefresh )? select= restrictedSelectStmt )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CREATE_MATERIALIZED_VIEW233=(CommonTree)match(input,CREATE_MATERIALIZED_VIEW,FOLLOW_CREATE_MATERIALIZED_VIEW_in_createMaterializedView4751); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREATE_MATERIALIZED_VIEW233_tree = (CommonTree)adaptor.dupNode(CREATE_MATERIALIZED_VIEW233);


            root_1 = (CommonTree)adaptor.becomeRoot(CREATE_MATERIALIZED_VIEW233_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_createMaterializedView4753);
            qname234=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname234.getTree());


            // com/facebook/presto/sql/parser/StatementBuilder.g:521:47: (refresh= viewRefresh )?
            int alt64=2;
            switch ( input.LA(1) ) {
                case REFRESH:
                    {
                    alt64=1;
                    }
                    break;
            }

            switch (alt64) {
                case 1 :
                    // com/facebook/presto/sql/parser/StatementBuilder.g:521:47: refresh= viewRefresh
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_viewRefresh_in_createMaterializedView4757);
                    refresh=viewRefresh();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, refresh.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_restrictedSelectStmt_in_createMaterializedView4762);
            select=restrictedSelectStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, select.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new CreateMaterializedView((qname234!=null?qname234.value:null), Optional.fromNullable((refresh!=null?refresh.value:null)), (select!=null?select.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createMaterializedView"


    public static class refreshMaterializedView_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "refreshMaterializedView"
    // com/facebook/presto/sql/parser/StatementBuilder.g:525:1: refreshMaterializedView returns [Statement value] : ^( REFRESH_MATERIALIZED_VIEW qname ) ;
    public final StatementBuilder.refreshMaterializedView_return refreshMaterializedView() throws RecognitionException {
        StatementBuilder.refreshMaterializedView_return retval = new StatementBuilder.refreshMaterializedView_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REFRESH_MATERIALIZED_VIEW235=null;
        StatementBuilder.qname_return qname236 =null;


        CommonTree REFRESH_MATERIALIZED_VIEW235_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:526:5: ( ^( REFRESH_MATERIALIZED_VIEW qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:526:7: ^( REFRESH_MATERIALIZED_VIEW qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            REFRESH_MATERIALIZED_VIEW235=(CommonTree)match(input,REFRESH_MATERIALIZED_VIEW,FOLLOW_REFRESH_MATERIALIZED_VIEW_in_refreshMaterializedView4795); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REFRESH_MATERIALIZED_VIEW235_tree = (CommonTree)adaptor.dupNode(REFRESH_MATERIALIZED_VIEW235);


            root_1 = (CommonTree)adaptor.becomeRoot(REFRESH_MATERIALIZED_VIEW235_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_refreshMaterializedView4797);
            qname236=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname236.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new RefreshMaterializedView((qname236!=null?qname236.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "refreshMaterializedView"


    public static class viewRefresh_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "viewRefresh"
    // com/facebook/presto/sql/parser/StatementBuilder.g:529:1: viewRefresh returns [String value] : ^( REFRESH integer ) ;
    public final StatementBuilder.viewRefresh_return viewRefresh() throws RecognitionException {
        StatementBuilder.viewRefresh_return retval = new StatementBuilder.viewRefresh_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REFRESH237=null;
        StatementBuilder.integer_return integer238 =null;


        CommonTree REFRESH237_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:530:5: ( ^( REFRESH integer ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:530:7: ^( REFRESH integer )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            REFRESH237=(CommonTree)match(input,REFRESH,FOLLOW_REFRESH_in_viewRefresh4822); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REFRESH237_tree = (CommonTree)adaptor.dupNode(REFRESH237);


            root_1 = (CommonTree)adaptor.becomeRoot(REFRESH237_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_integer_in_viewRefresh4824);
            integer238=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, integer238.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (integer238!=null?integer238.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "viewRefresh"


    public static class createAlias_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createAlias"
    // com/facebook/presto/sql/parser/StatementBuilder.g:533:1: createAlias returns [Statement value] : ^( CREATE_ALIAS qname remote= forRemote ) ;
    public final StatementBuilder.createAlias_return createAlias() throws RecognitionException {
        StatementBuilder.createAlias_return retval = new StatementBuilder.createAlias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE_ALIAS239=null;
        StatementBuilder.forRemote_return remote =null;

        StatementBuilder.qname_return qname240 =null;


        CommonTree CREATE_ALIAS239_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:534:5: ( ^( CREATE_ALIAS qname remote= forRemote ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:534:7: ^( CREATE_ALIAS qname remote= forRemote )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CREATE_ALIAS239=(CommonTree)match(input,CREATE_ALIAS,FOLLOW_CREATE_ALIAS_in_createAlias4849); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREATE_ALIAS239_tree = (CommonTree)adaptor.dupNode(CREATE_ALIAS239);


            root_1 = (CommonTree)adaptor.becomeRoot(CREATE_ALIAS239_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_createAlias4851);
            qname240=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname240.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_forRemote_in_createAlias4855);
            remote=forRemote();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, remote.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new CreateAlias((qname240!=null?qname240.value:null), (remote!=null?remote.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createAlias"


    public static class dropAlias_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropAlias"
    // com/facebook/presto/sql/parser/StatementBuilder.g:537:1: dropAlias returns [Statement value] : ^( DROP_ALIAS qname ) ;
    public final StatementBuilder.dropAlias_return dropAlias() throws RecognitionException {
        StatementBuilder.dropAlias_return retval = new StatementBuilder.dropAlias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP_ALIAS241=null;
        StatementBuilder.qname_return qname242 =null;


        CommonTree DROP_ALIAS241_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:538:5: ( ^( DROP_ALIAS qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:538:7: ^( DROP_ALIAS qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DROP_ALIAS241=(CommonTree)match(input,DROP_ALIAS,FOLLOW_DROP_ALIAS_in_dropAlias4880); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DROP_ALIAS241_tree = (CommonTree)adaptor.dupNode(DROP_ALIAS241);


            root_1 = (CommonTree)adaptor.becomeRoot(DROP_ALIAS241_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_dropAlias4882);
            qname242=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname242.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new DropAlias((qname242!=null?qname242.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropAlias"


    public static class forRemote_return extends TreeRuleReturnScope {
        public QualifiedName value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forRemote"
    // com/facebook/presto/sql/parser/StatementBuilder.g:541:1: forRemote returns [QualifiedName value] : ^( FOR qname ) ;
    public final StatementBuilder.forRemote_return forRemote() throws RecognitionException {
        StatementBuilder.forRemote_return retval = new StatementBuilder.forRemote_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FOR243=null;
        StatementBuilder.qname_return qname244 =null;


        CommonTree FOR243_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:542:5: ( ^( FOR qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:542:7: ^( FOR qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FOR243=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forRemote4907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR243_tree = (CommonTree)adaptor.dupNode(FOR243);


            root_1 = (CommonTree)adaptor.becomeRoot(FOR243_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_forRemote4909);
            qname244=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname244.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = (qname244!=null?qname244.value:null); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forRemote"


    public static class dropTable_return extends TreeRuleReturnScope {
        public Statement value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropTable"
    // com/facebook/presto/sql/parser/StatementBuilder.g:545:1: dropTable returns [Statement value] : ^( DROP_TABLE qname ) ;
    public final StatementBuilder.dropTable_return dropTable() throws RecognitionException {
        StatementBuilder.dropTable_return retval = new StatementBuilder.dropTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP_TABLE245=null;
        StatementBuilder.qname_return qname246 =null;


        CommonTree DROP_TABLE245_tree=null;

        try {
            // com/facebook/presto/sql/parser/StatementBuilder.g:546:5: ( ^( DROP_TABLE qname ) )
            // com/facebook/presto/sql/parser/StatementBuilder.g:546:7: ^( DROP_TABLE qname )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DROP_TABLE245=(CommonTree)match(input,DROP_TABLE,FOLLOW_DROP_TABLE_in_dropTable4934); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DROP_TABLE245_tree = (CommonTree)adaptor.dupNode(DROP_TABLE245);


            root_1 = (CommonTree)adaptor.becomeRoot(DROP_TABLE245_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qname_in_dropTable4936);
            qname246=qname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qname246.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) { retval.value = new DropTable((qname246!=null?qname246.value:null)); }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }

            catch (RecognitionException re) {
                throw new IllegalArgumentException("bad tree from parser: " + getErrorMessage(re, getTokenNames()), re);
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropTable"

    // $ANTLR start synpred1_StatementBuilder
    public final void synpred1_StatementBuilder_fragment() throws RecognitionException {
        // com/facebook/presto/sql/parser/StatementBuilder.g:176:7: ( ^( ALL_COLUMNS qname ) )
        // com/facebook/presto/sql/parser/StatementBuilder.g:176:8: ^( ALL_COLUMNS qname )
        {
        match(input,ALL_COLUMNS,FOLLOW_ALL_COLUMNS_in_synpred1_StatementBuilder1150); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_qname_in_synpred1_StatementBuilder1152);
        qname();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred1_StatementBuilder

    // Delegated rules

    public final boolean synpred1_StatementBuilder() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_StatementBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_query_in_statement80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explain_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showTables_in_statement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showSchemas_in_statement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showCatalogs_in_statement187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showColumns_in_statement210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showPartitions_in_statement234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showFunctions_in_statement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTable_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createMaterializedView_in_statement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refreshMaterializedView_in_statement314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createAlias_in_statement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropAlias_in_statement350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTable_in_statement376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUERY_in_query416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_queryExpr_in_query418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_withClause_in_queryExpr442 = new BitSet(new long[]{0x1000000000000000L,0x0000000020000000L,0x0200440000000400L});
    public static final BitSet FOLLOW_queryBody_in_queryExpr451 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_orderClause_in_queryExpr459 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_limitClause_in_queryExpr468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_querySpec_in_queryBody500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setOperation_in_queryBody522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSubquery_in_queryBody541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedTable_in_queryBody559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUERY_SPEC_in_querySpec594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_querySpec604 = new BitSet(new long[]{0x0000000000000008L,0x0000100000090200L,0x0000000000000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_fromClause_in_querySpec614 = new BitSet(new long[]{0x0000000000000008L,0x0000100000090000L,0x0000000000000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_whereClause_in_querySpec625 = new BitSet(new long[]{0x0000000000000008L,0x0000100000090000L,0x0000000000000001L});
    public static final BitSet FOLLOW_groupClause_in_querySpec636 = new BitSet(new long[]{0x0000000000000008L,0x0000100000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_havingClause_in_querySpec647 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_orderClause_in_querySpec658 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_limitClause_in_querySpec669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNION_in_setOperation703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_queryBody_in_setOperation707 = new BitSet(new long[]{0x1000000000000000L,0x0000000020000000L,0x0200440000000400L});
    public static final BitSet FOLLOW_queryBody_in_setOperation711 = new BitSet(new long[]{0x0004000000000088L});
    public static final BitSet FOLLOW_distinct_in_setOperation715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERSECT_in_setOperation734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_queryBody_in_setOperation738 = new BitSet(new long[]{0x1000000000000000L,0x0000000020000000L,0x0200440000000400L});
    public static final BitSet FOLLOW_queryBody_in_setOperation742 = new BitSet(new long[]{0x0004000000000088L});
    public static final BitSet FOLLOW_distinct_in_setOperation746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXCEPT_in_setOperation761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_queryBody_in_setOperation765 = new BitSet(new long[]{0x1000000000000000L,0x0000000020000000L,0x0200440000000400L});
    public static final BitSet FOLLOW_queryBody_in_setOperation769 = new BitSet(new long[]{0x0004000000000088L});
    public static final BitSet FOLLOW_distinct_in_setOperation773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectClause_in_restrictedSelectStmt803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_fromClause_in_restrictedSelectStmt805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withClause837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_recursive_in_withClause839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_withList_in_withClause841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECURSIVE_in_recursive865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_LIST_in_withList907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_withQuery_in_withList911 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_WITH_QUERY_in_withQuery940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ident_in_withQuery944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_query_in_withQuery948 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_aliasedColumns_in_withQuery952 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectClause978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distinct_in_selectClause982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_selectList_in_selectClause987 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTINCT_in_distinct1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_distinct1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_LIST_in_selectList1071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectItem_in_selectList1075 = new BitSet(new long[]{0x0000000000000108L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SELECT_ITEM_in_selectItem1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selectItem1112 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_selectItem1114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALL_COLUMNS_in_selectItem1159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_selectItem1161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALL_COLUMNS_in_selectItem1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_fromClause1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationList_in_fromClause1239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_whereClause1264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whereClause1266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause1291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_groupClause1293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_havingClause1320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sortItem_in_orderClause1349 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SORT_ITEM_in_sortItem1378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_sortItem1380 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_ordering_in_sortItem1384 = new BitSet(new long[]{0x0000000000000008L,0x0000004000000020L});
    public static final BitSet FOLLOW_nullOrdering_in_sortItem1388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASC_in_ordering1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_nullOrdering1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_nullOrdering1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause1495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_limitClause1497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BERNOULLI_in_sampleType1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYSTEM_in_sampleType1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRATIFY_ON_in_stratifyOn1558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_stratifyOn1560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relation_in_relationList1586 = new BitSet(new long[]{0x0000000800000042L,0x0000002000000000L,0x0000440000100100L});
    public static final BitSet FOLLOW_relationType_in_relation1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliasedRelation_in_relation1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sampledRelation_in_relation1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedTable_in_relationType1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSubquery_in_relationType1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinedTable_in_relationType1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinRelation_in_relationType1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_namedTable1736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_namedTable1738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOINED_TABLE_in_joinedTable1763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_joinedTable1765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CROSS_JOIN_in_joinRelation1790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_joinRelation1794 = new BitSet(new long[]{0x0000000800000040L,0x0000002000000000L,0x0000440000100100L});
    public static final BitSet FOLLOW_relation_in_joinRelation1798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_JOIN_in_joinRelation1840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_joinType_in_joinRelation1844 = new BitSet(new long[]{0x0000000000000000L,0x2008000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_joinCriteria_in_joinRelation1848 = new BitSet(new long[]{0x0000000800000040L,0x0000002000000000L,0x0000440000100100L});
    public static final BitSet FOLLOW_relation_in_joinRelation1852 = new BitSet(new long[]{0x0000000800000040L,0x0000002000000000L,0x0000440000100100L});
    public static final BitSet FOLLOW_relation_in_joinRelation1856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIASED_RELATION_in_aliasedRelation1881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_aliasedRelation1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_aliasedRelation1889 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_aliasedColumns_in_aliasedRelation1893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLED_RELATION_in_sampledRelation1919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_sampledRelation1923 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_sampleType_in_sampledRelation1927 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_sampledRelation1931 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_stratifyOn_in_sampledRelation1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIASED_COLUMNS_in_aliasedColumns1961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identList_in_aliasedColumns1963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNER_JOIN_in_joinType1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_JOIN_in_joinType1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_JOIN_in_joinType2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_JOIN_in_joinType2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_joinCriteria2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_joinCriteria2064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_joinCriteria2066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USING_in_joinCriteria2086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identList_in_joinCriteria2088 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLE_SUBQUERY_in_tableSubquery2113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_in_tableSubquery2115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_singleExpression2139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_singleExpression2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_expr2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_expr2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expr2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpression_in_expr2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparisonExpression_in_expr2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_expr2259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2263 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_expr2267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr2280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2284 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_expr2288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr2302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATE_in_expr2326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_expr2328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_expr2347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_expr2349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMESTAMP_in_expr2368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_expr2370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_expr2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_expr2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_in_expr2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expr2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expr2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalValue_in_expr2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_expr2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_LIST_in_expr2550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_expr2552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATIVE_in_expr2566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_caseExpression_in_expr2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_expr2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extract_in_expr2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_current_time_in_expr2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_expr2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2712 = new BitSet(new long[]{0x240023A000884202L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_QNAME_in_qname2739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identList_in_qname2743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ident_in_identList2769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_ident2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_IDENT_in_ident2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_VALUE_in_integer2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_VALUE_in_decimal2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_CALL_in_functionCall2915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_functionCall2919 = new BitSet(new long[]{0x240423A000884288L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC82L});
    public static final BitSet FOLLOW_window_in_functionCall2923 = new BitSet(new long[]{0x240423A000884288L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_distinct_in_functionCall2928 = new BitSet(new long[]{0x240023A000884208L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_exprList_in_functionCall2933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_in_window2958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_windowPartition_in_window2960 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000081001L});
    public static final BitSet FOLLOW_orderClause_in_window2963 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000081000L});
    public static final BitSet FOLLOW_windowFrame_in_window2966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITION_BY_in_windowPartition3000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_windowPartition3002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_windowFrame3027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame3031 = new BitSet(new long[]{0x0000004000000008L,0x0000000000000040L,0x0180000000000040L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame3035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROWS_in_windowFrame3048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame3052 = new BitSet(new long[]{0x0000004000000008L,0x0000000000000040L,0x0180000000000040L});
    public static final BitSet FOLLOW_frameBound_in_windowFrame3056 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNBOUNDED_PRECEDING_in_frameBound3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNBOUNDED_FOLLOWING_in_frameBound3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_ROW_in_frameBound3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRECEDING_in_frameBound3121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_frameBound3123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOLLOWING_in_frameBound3137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_frameBound3139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTRACT_in_extract3166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_extract3170 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_extract3172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_cast3197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_cast3199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_cast3201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_current_time3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_current_time3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_current_time3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_current_time3305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_current_time3307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_current_time3326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_current_time3328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arithmeticType_in_arithmeticExpression3357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_arithmeticExpression3361 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_arithmeticExpression3365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_203_in_arithmeticType3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_arithmeticType3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_arithmeticType3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_arithmeticType3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_arithmeticType3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparisonType_in_comparisonExpression3455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonExpression3459 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_comparisonExpression3463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_comparisonType3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEQ_in_comparisonType3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_comparisonType3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_comparisonType3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_comparisonType3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_comparisonType3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_DISTINCT_FROM_in_comparisonType3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVAL_in_intervalValue3687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_intervalValue3691 = new BitSet(new long[]{0x0000040000000000L,0x0006000000100000L,0x0000000000800000L,0x0000000000000040L});
    public static final BitSet FOLLOW_intervalQualifier_in_intervalValue3695 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
    public static final BitSet FOLLOW_intervalSign_in_intervalValue3699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nonSecond_in_intervalQualifier3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonSecond_in_intervalQualifier3757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_in_intervalQualifier3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_intervalQualifier3811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_in_intervalQualifier3837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_intervalQualifier3845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_nonSecond3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_intervalSign3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BETWEEN_in_predicate3953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate3957 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_predicate3961 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_predicate3965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIKE_in_predicate3977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate3981 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_predicate3985 = new BitSet(new long[]{0x240023A000884208L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_predicate3989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_NULL_in_predicate4006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate4008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_NOT_NULL_in_predicate4040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate4042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_predicate4070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate4074 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_predicate4078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_predicate4103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_in_predicate4107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NULLIF_in_caseExpression4150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_caseExpression4154 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_caseExpression4158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_caseExpression4185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_caseExpression4187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_CASE_in_caseExpression4217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_caseExpression4221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_whenList_in_caseExpression4223 = new BitSet(new long[]{0x240023A000884208L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_caseExpression4227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEARCHED_CASE_in_caseExpression4240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whenList_in_caseExpression4242 = new BitSet(new long[]{0x240023A000884208L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_caseExpression4246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_caseExpression4264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_caseExpression4268 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_caseExpression4272 = new BitSet(new long[]{0x240023A000884208L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_caseExpression4276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_in_whenList4315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whenList4319 = new BitSet(new long[]{0x240023A000884200L,0x4370C80ED0C62018L,0x001C008400400280L,0x000000000000AC80L});
    public static final BitSet FOLLOW_expr_in_whenList4323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLAIN_in_explain4351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explainOptions_in_explain4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_query_in_explain4356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLAIN_OPTIONS_in_explainOptions4381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explainOption_in_explainOptions4385 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLAIN_FORMAT_in_explainOption4414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TEXT_in_explainOption4416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLAIN_FORMAT_in_explainOption4433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GRAPHVIZ_in_explainOption4435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLAIN_TYPE_in_explainOption4448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOGICAL_in_explainOption4450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLAIN_TYPE_in_explainOption4466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTRIBUTED_in_explainOption4468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHOW_TABLES_in_showTables4493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_showTablesFrom_in_showTables4497 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_showTablesLike_in_showTables4502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_showTablesFrom4528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_showTablesFrom4530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIKE_in_showTablesLike4555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_showTablesLike4557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHOW_SCHEMAS_in_showSchemas4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_CATALOGS_in_showCatalogs4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_COLUMNS_in_showColumns4628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_showColumns4630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHOW_PARTITIONS_in_showPartitions4655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_showPartitions4657 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L,0x0000000000000001L,0x0000000000000001L});
    public static final BitSet FOLLOW_whereClause_in_showPartitions4659 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_orderClause_in_showPartitions4662 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_limitClause_in_showPartitions4665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHOW_FUNCTIONS_in_showFunctions4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_TABLE_in_createTable4722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_createTable4724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_query_in_createTable4726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_MATERIALIZED_VIEW_in_createMaterializedView4751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_createMaterializedView4753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001004000L});
    public static final BitSet FOLLOW_viewRefresh_in_createMaterializedView4757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_restrictedSelectStmt_in_createMaterializedView4762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFRESH_MATERIALIZED_VIEW_in_refreshMaterializedView4795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_refreshMaterializedView4797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFRESH_in_viewRefresh4822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_in_viewRefresh4824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_ALIAS_in_createAlias4849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_createAlias4851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_forRemote_in_createAlias4855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_ALIAS_in_dropAlias4880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_dropAlias4882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_forRemote4907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_forRemote4909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_TABLE_in_dropTable4934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_dropTable4936 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALL_COLUMNS_in_synpred1_StatementBuilder1150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qname_in_synpred1_StatementBuilder1152 = new BitSet(new long[]{0x0000000000000008L});

}