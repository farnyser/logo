// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/Logo.g 2012-05-01 09:09:58

  package logoparsing;
  import utilities.Context;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "U_MOINS", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "DONNE", "IDENTIFIER", "INT", "WS", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'\"'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int PROGRAMME=4;
    public static final int U_MOINS=5;
    public static final int AV=6;
    public static final int TD=7;
    public static final int TG=8;
    public static final int REC=9;
    public static final int VE=10;
    public static final int LC=11;
    public static final int BC=12;
    public static final int FPOS=13;
    public static final int FCAP=14;
    public static final int FCC=15;
    public static final int DONNE=16;
    public static final int IDENTIFIER=17;
    public static final int INT=18;
    public static final int WS=19;

    // delegates
    // delegators


        public LogoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LogoParser.tokenNames; }
    public String getGrammarFileName() { return "/home/scawf/workspace/nf11/src/logoparsing/Logo.g"; }


      Context context = new Context();
      boolean valide = true;
      
      public boolean getValide(){
       return valide;
     }


    public static class programme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programme"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:13: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_programme225);
            liste_instructions1=liste_instructions();

            state._fsp--;

            stream_liste_instructions.add(liste_instructions1.getTree());


            // AST REWRITE
            // elements: liste_instructions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 41:32: -> ^( PROGRAMME liste_instructions )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:35: ^( PROGRAMME liste_instructions )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAMME, "PROGRAMME"), root_1);

                adaptor.addChild(root_1, stream_liste_instructions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "programme"

    public static class liste_instructions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "liste_instructions"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:44:1: liste_instructions : ( instruction )+ ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.instruction_return instruction2 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:44:20: ( ( instruction )+ )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:45:3: ( instruction )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:45:3: ( instruction )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=AV && LA1_0<=DONNE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:45:4: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions245);
            	    instruction2=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "liste_instructions"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:48:1: expr : boolExpr ;
    public final LogoParser.expr_return expr() throws RecognitionException {
        LogoParser.expr_return retval = new LogoParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.boolExpr_return boolExpr3 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:48:6: ( boolExpr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:48:8: boolExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolExpr_in_expr259);
            boolExpr3=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr3.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class boolExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:1: boolExpr : sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? ;
    public final LogoParser.boolExpr_return boolExpr() throws RecognitionException {
        LogoParser.boolExpr_return retval = new LogoParser.boolExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set5=null;
        LogoParser.sumExpr_return sumExpr4 = null;

        LogoParser.sumExpr_return sumExpr6 = null;


        Object set5_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:10: ( sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:12: sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sumExpr_in_boolExpr267);
            sumExpr4=sumExpr();

            state._fsp--;

            adaptor.addChild(root_0, sumExpr4.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:20: ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=27)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:21: ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr
                    {
                    set5=(Token)input.LT(1);
                    set5=(Token)input.LT(1);
                    if ( (input.LA(1)>=20 && input.LA(1)<=27) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set5), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_sumExpr_in_boolExpr289);
                    sumExpr6=sumExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, sumExpr6.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolExpr"

    public static class sumExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sumExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:1: sumExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final LogoParser.sumExpr_return sumExpr() throws RecognitionException {
        LogoParser.sumExpr_return retval = new LogoParser.sumExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set8=null;
        LogoParser.multExpr_return multExpr7 = null;

        LogoParser.multExpr_return multExpr9 = null;


        Object set8_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:11: multExpr ( ( '+' | '-' ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_sumExpr299);
            multExpr7=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr7.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:20: ( ( '+' | '-' ) multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    int LA3_2 = input.LA(2);

                    if ( ((LA3_2>=IDENTIFIER && LA3_2<=INT)||(LA3_2>=28 && LA3_2<=29)||LA3_2==33) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==29) ) {
                    int LA3_3 = input.LA(2);

                    if ( ((LA3_3>=IDENTIFIER && LA3_3<=INT)||(LA3_3>=28 && LA3_3<=29)||LA3_3==33) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:21: ( '+' | '-' ) multExpr
            	    {
            	    set8=(Token)input.LT(1);
            	    set8=(Token)input.LT(1);
            	    if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set8), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_sumExpr309);
            	    multExpr9=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sumExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:1: multExpr : powExpr ( ( '*' | '/' ) powExpr )* ;
    public final LogoParser.multExpr_return multExpr() throws RecognitionException {
        LogoParser.multExpr_return retval = new LogoParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;
        LogoParser.powExpr_return powExpr10 = null;

        LogoParser.powExpr_return powExpr12 = null;


        Object set11_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:10: ( powExpr ( ( '*' | '/' ) powExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:12: powExpr ( ( '*' | '/' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_multExpr319);
            powExpr10=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr10.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:20: ( ( '*' | '/' ) powExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=30 && LA4_0<=31)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:21: ( '*' | '/' ) powExpr
            	    {
            	    set11=(Token)input.LT(1);
            	    set11=(Token)input.LT(1);
            	    if ( (input.LA(1)>=30 && input.LA(1)<=31) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set11), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_multExpr329);
            	    powExpr12=powExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, powExpr12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class powExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "powExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:1: powExpr : atom ( '^' atom )* ;
    public final LogoParser.powExpr_return powExpr() throws RecognitionException {
        LogoParser.powExpr_return retval = new LogoParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        LogoParser.atom_return atom13 = null;

        LogoParser.atom_return atom15 = null;


        Object char_literal14_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:9: ( atom ( '^' atom )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:11: atom ( '^' atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_powExpr339);
            atom13=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom13.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:16: ( '^' atom )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:17: '^' atom
            	    {
            	    char_literal14=(Token)match(input,32,FOLLOW_32_in_powExpr342); 
            	    char_literal14_tree = (Object)adaptor.create(char_literal14);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal14_tree, root_0);

            	    pushFollow(FOLLOW_atom_in_powExpr345);
            	    atom15=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "powExpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:1: atom : ( IDENTIFIER | INT | '+' INT -> INT | '-' INT -> ^( U_MOINS INT ) | '(' expr ')' );
    public final LogoParser.atom_return atom() throws RecognitionException {
        LogoParser.atom_return retval = new LogoParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER16=null;
        Token INT17=null;
        Token char_literal18=null;
        Token INT19=null;
        Token char_literal20=null;
        Token INT21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        LogoParser.expr_return expr23 = null;


        Object IDENTIFIER16_tree=null;
        Object INT17_tree=null;
        Object char_literal18_tree=null;
        Object INT19_tree=null;
        Object char_literal20_tree=null;
        Object INT21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:5: ( IDENTIFIER | INT | '+' INT -> INT | '-' INT -> ^( U_MOINS INT ) | '(' expr ')' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt6=1;
                }
                break;
            case INT:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 29:
                {
                alt6=4;
                }
                break;
            case 33:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom354); 
                    IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
                    adaptor.addChild(root_0, IDENTIFIER16_tree);


                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:20: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT17=(Token)match(input,INT,FOLLOW_INT_in_atom358); 
                    INT17_tree = (Object)adaptor.create(INT17);
                    adaptor.addChild(root_0, INT17_tree);


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:26: '+' INT
                    {
                    char_literal18=(Token)match(input,28,FOLLOW_28_in_atom362);  
                    stream_28.add(char_literal18);

                    INT19=(Token)match(input,INT,FOLLOW_INT_in_atom364);  
                    stream_INT.add(INT19);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:34: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:43: '-' INT
                    {
                    char_literal20=(Token)match(input,29,FOLLOW_29_in_atom372);  
                    stream_29.add(char_literal20);

                    INT21=(Token)match(input,INT,FOLLOW_INT_in_atom374);  
                    stream_INT.add(INT21);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:51: -> ^( U_MOINS INT )
                    {
                        // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:54: ^( U_MOINS INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(U_MOINS, "U_MOINS"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:71: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal22=(Token)match(input,33,FOLLOW_33_in_atom386); 
                    pushFollow(FOLLOW_expr_in_atom389);
                    expr23=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr23.getTree());
                    char_literal24=(Token)match(input,34,FOLLOW_34_in_atom391); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class affectation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:57:1: affectation : DONNE '\"' IDENTIFIER expr ;
    public final LogoParser.affectation_return affectation() throws RecognitionException {
        LogoParser.affectation_return retval = new LogoParser.affectation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DONNE25=null;
        Token char_literal26=null;
        Token IDENTIFIER27=null;
        LogoParser.expr_return expr28 = null;


        Object DONNE25_tree=null;
        Object char_literal26_tree=null;
        Object IDENTIFIER27_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:57:13: ( DONNE '\"' IDENTIFIER expr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:57:15: DONNE '\"' IDENTIFIER expr
            {
            root_0 = (Object)adaptor.nil();

            DONNE25=(Token)match(input,DONNE,FOLLOW_DONNE_in_affectation403); 
            DONNE25_tree = (Object)adaptor.create(DONNE25);
            root_0 = (Object)adaptor.becomeRoot(DONNE25_tree, root_0);

            char_literal26=(Token)match(input,35,FOLLOW_35_in_affectation406); 
            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_affectation409); 
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);

            pushFollow(FOLLOW_expr_in_affectation411);
            expr28=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr28.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "affectation"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:59:1: instruction : ( affectation | ( AV | TD | TG | REC | FCAP | FCC ) expr | ( FPOS '[' expr expr ']' ) | ( VE | BC | LC ) );
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AV30=null;
        Token TD31=null;
        Token TG32=null;
        Token REC33=null;
        Token FCAP34=null;
        Token FCC35=null;
        Token FPOS37=null;
        Token char_literal38=null;
        Token char_literal41=null;
        Token VE42=null;
        Token BC43=null;
        Token LC44=null;
        LogoParser.affectation_return affectation29 = null;

        LogoParser.expr_return expr36 = null;

        LogoParser.expr_return expr39 = null;

        LogoParser.expr_return expr40 = null;


        Object AV30_tree=null;
        Object TD31_tree=null;
        Object TG32_tree=null;
        Object REC33_tree=null;
        Object FCAP34_tree=null;
        Object FCC35_tree=null;
        Object FPOS37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal41_tree=null;
        Object VE42_tree=null;
        Object BC43_tree=null;
        Object LC44_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:59:13: ( affectation | ( AV | TD | TG | REC | FCAP | FCC ) expr | ( FPOS '[' expr expr ']' ) | ( VE | BC | LC ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case DONNE:
                {
                alt9=1;
                }
                break;
            case AV:
            case TD:
            case TG:
            case REC:
            case FCAP:
            case FCC:
                {
                alt9=2;
                }
                break;
            case FPOS:
                {
                alt9=3;
                }
                break;
            case VE:
            case LC:
            case BC:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:60:3: affectation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_instruction421);
                    affectation29=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation29.getTree());

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:3: ( AV | TD | TG | REC | FCAP | FCC ) expr
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:3: ( AV | TD | TG | REC | FCAP | FCC )
                    int alt7=6;
                    switch ( input.LA(1) ) {
                    case AV:
                        {
                        alt7=1;
                        }
                        break;
                    case TD:
                        {
                        alt7=2;
                        }
                        break;
                    case TG:
                        {
                        alt7=3;
                        }
                        break;
                    case REC:
                        {
                        alt7=4;
                        }
                        break;
                    case FCAP:
                        {
                        alt7=5;
                        }
                        break;
                    case FCC:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:5: AV
                            {
                            AV30=(Token)match(input,AV,FOLLOW_AV_in_instruction432); 
                            AV30_tree = (Object)adaptor.create(AV30);
                            root_0 = (Object)adaptor.becomeRoot(AV30_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:11: TD
                            {
                            TD31=(Token)match(input,TD,FOLLOW_TD_in_instruction437); 
                            TD31_tree = (Object)adaptor.create(TD31);
                            root_0 = (Object)adaptor.becomeRoot(TD31_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:17: TG
                            {
                            TG32=(Token)match(input,TG,FOLLOW_TG_in_instruction442); 
                            TG32_tree = (Object)adaptor.create(TG32);
                            root_0 = (Object)adaptor.becomeRoot(TG32_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:23: REC
                            {
                            REC33=(Token)match(input,REC,FOLLOW_REC_in_instruction447); 
                            REC33_tree = (Object)adaptor.create(REC33);
                            root_0 = (Object)adaptor.becomeRoot(REC33_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:29: FCAP
                            {
                            FCAP34=(Token)match(input,FCAP,FOLLOW_FCAP_in_instruction451); 
                            FCAP34_tree = (Object)adaptor.create(FCAP34);
                            root_0 = (Object)adaptor.becomeRoot(FCAP34_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:62:37: FCC
                            {
                            FCC35=(Token)match(input,FCC,FOLLOW_FCC_in_instruction456); 
                            FCC35_tree = (Object)adaptor.create(FCC35);
                            root_0 = (Object)adaptor.becomeRoot(FCC35_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction460);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:64:3: ( FPOS '[' expr expr ']' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:64:3: ( FPOS '[' expr expr ']' )
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:64:5: FPOS '[' expr expr ']'
                    {
                    FPOS37=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction471); 
                    FPOS37_tree = (Object)adaptor.create(FPOS37);
                    root_0 = (Object)adaptor.becomeRoot(FPOS37_tree, root_0);

                    char_literal38=(Token)match(input,36,FOLLOW_36_in_instruction474); 
                    pushFollow(FOLLOW_expr_in_instruction477);
                    expr39=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr39.getTree());
                    pushFollow(FOLLOW_expr_in_instruction479);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr40.getTree());
                    char_literal41=(Token)match(input,37,FOLLOW_37_in_instruction481); 

                    }


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:66:3: ( VE | BC | LC )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:66:3: ( VE | BC | LC )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case VE:
                        {
                        alt8=1;
                        }
                        break;
                    case BC:
                        {
                        alt8=2;
                        }
                        break;
                    case LC:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:66:4: VE
                            {
                            VE42=(Token)match(input,VE,FOLLOW_VE_in_instruction493); 
                            VE42_tree = (Object)adaptor.create(VE42);
                            root_0 = (Object)adaptor.becomeRoot(VE42_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:66:10: BC
                            {
                            BC43=(Token)match(input,BC,FOLLOW_BC_in_instruction498); 
                            BC43_tree = (Object)adaptor.create(BC43);
                            root_0 = (Object)adaptor.becomeRoot(BC43_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:66:16: LC
                            {
                            LC44=(Token)match(input,LC,FOLLOW_LC_in_instruction503); 
                            LC44_tree = (Object)adaptor.create(LC44);
                            root_0 = (Object)adaptor.becomeRoot(LC44_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_liste_instructions_in_programme225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions245 = new BitSet(new long[]{0x000000000001FFC2L});
    public static final BitSet FOLLOW_boolExpr_in_expr259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr267 = new BitSet(new long[]{0x000000000FF00002L});
    public static final BitSet FOLLOW_set_in_boolExpr270 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr299 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_sumExpr302 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr309 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_powExpr_in_multExpr319 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_multExpr322 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_powExpr_in_multExpr329 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_atom_in_powExpr339 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_powExpr342 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_atom_in_powExpr345 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_atom362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INT_in_atom364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_atom372 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INT_in_atom374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_atom386 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_atom389 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_atom391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_affectation403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_affectation406 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_affectation409 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_affectation411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction432 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_TD_in_instruction437 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_TG_in_instruction442 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_REC_in_instruction447 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_FCAP_in_instruction451 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_FCC_in_instruction456 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_instruction460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction471 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_instruction474 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_instruction477 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_instruction479 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instruction481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction503 = new BitSet(new long[]{0x0000000000000002L});

}