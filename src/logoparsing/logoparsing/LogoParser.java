// $ANTLR 3.3 Nov 30, 2010 12:50:56 Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g 2012-04-27 18:26:04

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "U_MOINS", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "IDENTIFIER", "INT", "WS", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__19=19;
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
    public static final int IDENTIFIER=16;
    public static final int INT=17;
    public static final int WS=18;

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
    public String getGrammarFileName() { return "Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g"; }


      boolean valide = true;
      public boolean getValide(){
       return valide;
     }


    public static class programme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programme"
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:36:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:36:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:36:13: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_programme215);
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
            // 36:32: -> ^( PROGRAMME liste_instructions )
            {
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:36:35: ^( PROGRAMME liste_instructions )
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:39:1: liste_instructions : ( instruction )+ ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.instruction_return instruction2 = null;



        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:39:20: ( ( instruction )+ )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:40:3: ( instruction )+
            {
            root_0 = (Object)adaptor.nil();

            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:40:3: ( instruction )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=AV && LA1_0<=FCC)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:40:4: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions235);
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:43:1: expr : boolExpr ;
    public final LogoParser.expr_return expr() throws RecognitionException {
        LogoParser.expr_return retval = new LogoParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.boolExpr_return boolExpr3 = null;



        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:43:6: ( boolExpr )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:43:8: boolExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolExpr_in_expr249);
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:44:1: boolExpr : sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? ;
    public final LogoParser.boolExpr_return boolExpr() throws RecognitionException {
        LogoParser.boolExpr_return retval = new LogoParser.boolExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set5=null;
        LogoParser.sumExpr_return sumExpr4 = null;

        LogoParser.sumExpr_return sumExpr6 = null;


        Object set5_tree=null;

        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:44:10: ( sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:44:12: sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sumExpr_in_boolExpr257);
            sumExpr4=sumExpr();

            state._fsp--;

            adaptor.addChild(root_0, sumExpr4.getTree());
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:44:20: ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=26)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:44:21: ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr
                    {
                    set5=(Token)input.LT(1);
                    set5=(Token)input.LT(1);
                    if ( (input.LA(1)>=19 && input.LA(1)<=26) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set5), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_sumExpr_in_boolExpr279);
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:45:1: sumExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final LogoParser.sumExpr_return sumExpr() throws RecognitionException {
        LogoParser.sumExpr_return retval = new LogoParser.sumExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set8=null;
        LogoParser.multExpr_return multExpr7 = null;

        LogoParser.multExpr_return multExpr9 = null;


        Object set8_tree=null;

        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:45:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:45:11: multExpr ( ( '+' | '-' ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_sumExpr289);
            multExpr7=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr7.getTree());
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:45:20: ( ( '+' | '-' ) multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==INT||(LA3_2>=27 && LA3_2<=28)||LA3_2==32) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==28) ) {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3==INT||(LA3_3>=27 && LA3_3<=28)||LA3_3==32) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:45:21: ( '+' | '-' ) multExpr
            	    {
            	    set8=(Token)input.LT(1);
            	    set8=(Token)input.LT(1);
            	    if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set8), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_sumExpr299);
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:46:1: multExpr : powExpr ( ( '*' | '/' ) powExpr )* ;
    public final LogoParser.multExpr_return multExpr() throws RecognitionException {
        LogoParser.multExpr_return retval = new LogoParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;
        LogoParser.powExpr_return powExpr10 = null;

        LogoParser.powExpr_return powExpr12 = null;


        Object set11_tree=null;

        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:46:10: ( powExpr ( ( '*' | '/' ) powExpr )* )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:46:12: powExpr ( ( '*' | '/' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_multExpr309);
            powExpr10=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr10.getTree());
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:46:20: ( ( '*' | '/' ) powExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=29 && LA4_0<=30)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:46:21: ( '*' | '/' ) powExpr
            	    {
            	    set11=(Token)input.LT(1);
            	    set11=(Token)input.LT(1);
            	    if ( (input.LA(1)>=29 && input.LA(1)<=30) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set11), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_multExpr319);
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:47:1: powExpr : atom ( '^' atom )* ;
    public final LogoParser.powExpr_return powExpr() throws RecognitionException {
        LogoParser.powExpr_return retval = new LogoParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        LogoParser.atom_return atom13 = null;

        LogoParser.atom_return atom15 = null;


        Object char_literal14_tree=null;

        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:47:9: ( atom ( '^' atom )* )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:47:11: atom ( '^' atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_powExpr329);
            atom13=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom13.getTree());
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:47:16: ( '^' atom )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:47:17: '^' atom
            	    {
            	    char_literal14=(Token)match(input,31,FOLLOW_31_in_powExpr332); 
            	    char_literal14_tree = (Object)adaptor.create(char_literal14);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal14_tree, root_0);

            	    pushFollow(FOLLOW_atom_in_powExpr335);
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
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:1: atom : ( INT | '+' INT -> INT | '-' INT -> ^( U_MOINS INT ) | '(' expr ')' );
    public final LogoParser.atom_return atom() throws RecognitionException {
        LogoParser.atom_return retval = new LogoParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT16=null;
        Token char_literal17=null;
        Token INT18=null;
        Token char_literal19=null;
        Token INT20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        LogoParser.expr_return expr22 = null;


        Object INT16_tree=null;
        Object char_literal17_tree=null;
        Object INT18_tree=null;
        Object char_literal19_tree=null;
        Object INT20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:5: ( INT | '+' INT -> INT | '-' INT -> ^( U_MOINS INT ) | '(' expr ')' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:7: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT16=(Token)match(input,INT,FOLLOW_INT_in_atom344); 
                    INT16_tree = (Object)adaptor.create(INT16);
                    adaptor.addChild(root_0, INT16_tree);


                    }
                    break;
                case 2 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:13: '+' INT
                    {
                    char_literal17=(Token)match(input,27,FOLLOW_27_in_atom348);  
                    stream_27.add(char_literal17);

                    INT18=(Token)match(input,INT,FOLLOW_INT_in_atom350);  
                    stream_INT.add(INT18);



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
                    // 48:21: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:30: '-' INT
                    {
                    char_literal19=(Token)match(input,28,FOLLOW_28_in_atom358);  
                    stream_28.add(char_literal19);

                    INT20=(Token)match(input,INT,FOLLOW_INT_in_atom360);  
                    stream_INT.add(INT20);



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
                    // 48:38: -> ^( U_MOINS INT )
                    {
                        // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:41: ^( U_MOINS INT )
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
                case 4 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:48:58: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal21=(Token)match(input,32,FOLLOW_32_in_atom372); 
                    pushFollow(FOLLOW_expr_in_atom375);
                    expr22=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr22.getTree());
                    char_literal23=(Token)match(input,33,FOLLOW_33_in_atom377); 

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

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:53:1: instruction : ( ( AV | TD | TG | REC | FCAP | FCC ) expr | ( FPOS '[' expr expr ']' ) | ( VE | BC | LC ) );
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AV24=null;
        Token TD25=null;
        Token TG26=null;
        Token REC27=null;
        Token FCAP28=null;
        Token FCC29=null;
        Token FPOS31=null;
        Token char_literal32=null;
        Token char_literal35=null;
        Token set36=null;
        LogoParser.expr_return expr30 = null;

        LogoParser.expr_return expr33 = null;

        LogoParser.expr_return expr34 = null;


        Object AV24_tree=null;
        Object TD25_tree=null;
        Object TG26_tree=null;
        Object REC27_tree=null;
        Object FCAP28_tree=null;
        Object FCC29_tree=null;
        Object FPOS31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal35_tree=null;
        Object set36_tree=null;

        try {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:53:13: ( ( AV | TD | TG | REC | FCAP | FCC ) expr | ( FPOS '[' expr expr ']' ) | ( VE | BC | LC ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case AV:
            case TD:
            case TG:
            case REC:
            case FCAP:
            case FCC:
                {
                alt8=1;
                }
                break;
            case FPOS:
                {
                alt8=2;
                }
                break;
            case VE:
            case LC:
            case BC:
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
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:3: ( AV | TD | TG | REC | FCAP | FCC ) expr
                    {
                    root_0 = (Object)adaptor.nil();

                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:3: ( AV | TD | TG | REC | FCAP | FCC )
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
                            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:5: AV
                            {
                            AV24=(Token)match(input,AV,FOLLOW_AV_in_instruction394); 
                            AV24_tree = (Object)adaptor.create(AV24);
                            root_0 = (Object)adaptor.becomeRoot(AV24_tree, root_0);


                            }
                            break;
                        case 2 :
                            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:11: TD
                            {
                            TD25=(Token)match(input,TD,FOLLOW_TD_in_instruction399); 
                            TD25_tree = (Object)adaptor.create(TD25);
                            root_0 = (Object)adaptor.becomeRoot(TD25_tree, root_0);


                            }
                            break;
                        case 3 :
                            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:17: TG
                            {
                            TG26=(Token)match(input,TG,FOLLOW_TG_in_instruction404); 
                            TG26_tree = (Object)adaptor.create(TG26);
                            root_0 = (Object)adaptor.becomeRoot(TG26_tree, root_0);


                            }
                            break;
                        case 4 :
                            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:23: REC
                            {
                            REC27=(Token)match(input,REC,FOLLOW_REC_in_instruction409); 
                            REC27_tree = (Object)adaptor.create(REC27);
                            root_0 = (Object)adaptor.becomeRoot(REC27_tree, root_0);


                            }
                            break;
                        case 5 :
                            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:29: FCAP
                            {
                            FCAP28=(Token)match(input,FCAP,FOLLOW_FCAP_in_instruction413); 
                            FCAP28_tree = (Object)adaptor.create(FCAP28);
                            root_0 = (Object)adaptor.becomeRoot(FCAP28_tree, root_0);


                            }
                            break;
                        case 6 :
                            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:54:37: FCC
                            {
                            FCC29=(Token)match(input,FCC,FOLLOW_FCC_in_instruction418); 
                            FCC29_tree = (Object)adaptor.create(FCC29);
                            root_0 = (Object)adaptor.becomeRoot(FCC29_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction422);
                    expr30=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr30.getTree());

                    }
                    break;
                case 2 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:56:3: ( FPOS '[' expr expr ']' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:56:3: ( FPOS '[' expr expr ']' )
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:56:5: FPOS '[' expr expr ']'
                    {
                    FPOS31=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction433); 
                    FPOS31_tree = (Object)adaptor.create(FPOS31);
                    root_0 = (Object)adaptor.becomeRoot(FPOS31_tree, root_0);

                    char_literal32=(Token)match(input,34,FOLLOW_34_in_instruction436); 
                    pushFollow(FOLLOW_expr_in_instruction439);
                    expr33=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr33.getTree());
                    pushFollow(FOLLOW_expr_in_instruction441);
                    expr34=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr34.getTree());
                    char_literal35=(Token)match(input,35,FOLLOW_35_in_instruction443); 

                    }


                    }
                    break;
                case 3 :
                    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:58:3: ( VE | BC | LC )
                    {
                    root_0 = (Object)adaptor.nil();

                    set36=(Token)input.LT(1);
                    if ( (input.LA(1)>=VE && input.LA(1)<=BC) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set36));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
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


 

    public static final BitSet FOLLOW_liste_instructions_in_programme215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions235 = new BitSet(new long[]{0x000000000000FFC2L});
    public static final BitSet FOLLOW_boolExpr_in_expr249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr257 = new BitSet(new long[]{0x0000000007F80002L});
    public static final BitSet FOLLOW_set_in_boolExpr260 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr289 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_sumExpr292 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr299 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_powExpr_in_multExpr309 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_set_in_multExpr312 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_powExpr_in_multExpr319 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_atom_in_powExpr329 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_powExpr332 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_atom_in_powExpr335 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INT_in_atom344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_atom348 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INT_in_atom350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_atom358 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INT_in_atom360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom372 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_expr_in_atom375 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction394 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_TD_in_instruction399 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_TG_in_instruction404 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_REC_in_instruction409 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_FCAP_in_instruction413 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_FCC_in_instruction418 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_expr_in_instruction422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction433 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_instruction436 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_expr_in_instruction439 = new BitSet(new long[]{0x0000000118020000L});
    public static final BitSet FOLLOW_expr_in_instruction441 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_instruction443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction454 = new BitSet(new long[]{0x0000000000000002L});

}