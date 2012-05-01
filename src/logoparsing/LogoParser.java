// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/Logo.g 2012-05-01 09:56:26

  package logoparsing;
  import utilities.Context;
  import logogui.Log;


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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:13: liste_instructions
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
            // 42:32: -> ^( PROGRAMME liste_instructions )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:35: ^( PROGRAMME liste_instructions )
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:45:1: liste_instructions : ( instruction )+ ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.instruction_return instruction2 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:45:20: ( ( instruction )+ )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:46:3: ( instruction )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:46:3: ( instruction )+
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
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:46:4: instruction
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:1: expr : boolExpr ;
    public final LogoParser.expr_return expr() throws RecognitionException {
        LogoParser.expr_return retval = new LogoParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.boolExpr_return boolExpr3 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:6: ( boolExpr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:49:8: boolExpr
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:1: boolExpr : sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? ;
    public final LogoParser.boolExpr_return boolExpr() throws RecognitionException {
        LogoParser.boolExpr_return retval = new LogoParser.boolExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set5=null;
        LogoParser.sumExpr_return sumExpr4 = null;

        LogoParser.sumExpr_return sumExpr6 = null;


        Object set5_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:10: ( sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:12: sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sumExpr_in_boolExpr267);
            sumExpr4=sumExpr();

            state._fsp--;

            adaptor.addChild(root_0, sumExpr4.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:20: ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=27)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:21: ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:1: sumExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final LogoParser.sumExpr_return sumExpr() throws RecognitionException {
        LogoParser.sumExpr_return retval = new LogoParser.sumExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set8=null;
        LogoParser.multExpr_return multExpr7 = null;

        LogoParser.multExpr_return multExpr9 = null;


        Object set8_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:11: multExpr ( ( '+' | '-' ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_sumExpr299);
            multExpr7=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr7.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:20: ( ( '+' | '-' ) multExpr )*
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
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:21: ( '+' | '-' ) multExpr
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:1: multExpr : powExpr ( ( '*' | '/' ) powExpr )* ;
    public final LogoParser.multExpr_return multExpr() throws RecognitionException {
        LogoParser.multExpr_return retval = new LogoParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;
        LogoParser.powExpr_return powExpr10 = null;

        LogoParser.powExpr_return powExpr12 = null;


        Object set11_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:10: ( powExpr ( ( '*' | '/' ) powExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:12: powExpr ( ( '*' | '/' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_multExpr319);
            powExpr10=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr10.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:20: ( ( '*' | '/' ) powExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=30 && LA4_0<=31)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:52:21: ( '*' | '/' ) powExpr
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:1: powExpr : atom ( '^' atom )* ;
    public final LogoParser.powExpr_return powExpr() throws RecognitionException {
        LogoParser.powExpr_return retval = new LogoParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        LogoParser.atom_return atom13 = null;

        LogoParser.atom_return atom15 = null;


        Object char_literal14_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:9: ( atom ( '^' atom )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:11: atom ( '^' atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_powExpr339);
            atom13=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom13.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:16: ( '^' atom )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:53:17: '^' atom
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:54:1: atom : (id= IDENTIFIER | INT | '+' INT -> INT | '-' INT -> ^( U_MOINS INT ) | '(' expr ')' );
    public final LogoParser.atom_return atom() throws RecognitionException {
        LogoParser.atom_return retval = new LogoParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token INT16=null;
        Token char_literal17=null;
        Token INT18=null;
        Token char_literal19=null;
        Token INT20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        LogoParser.expr_return expr22 = null;


        Object id_tree=null;
        Object INT16_tree=null;
        Object char_literal17_tree=null;
        Object INT18_tree=null;
        Object char_literal19_tree=null;
        Object INT20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:54:5: (id= IDENTIFIER | INT | '+' INT -> INT | '-' INT -> ^( U_MOINS INT ) | '(' expr ')' )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:55:3: id= IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom361); 
                    id_tree = (Object)adaptor.create(id);
                    adaptor.addChild(root_0, id_tree);


                    		try {
                    		  context.get(id.getText()); 
                    		}
                    		catch ( Exception e ) {
                    	    Log.append("Parser : variable " + id.getText() + " non-definie\n");
                    	    valide = false;
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:65:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT16=(Token)match(input,INT,FOLLOW_INT_in_atom372); 
                    INT16_tree = (Object)adaptor.create(INT16);
                    adaptor.addChild(root_0, INT16_tree);


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:66:5: '+' INT
                    {
                    char_literal17=(Token)match(input,28,FOLLOW_28_in_atom379);  
                    stream_28.add(char_literal17);

                    INT18=(Token)match(input,INT,FOLLOW_INT_in_atom381);  
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
                    // 66:13: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:67:5: '-' INT
                    {
                    char_literal19=(Token)match(input,29,FOLLOW_29_in_atom392);  
                    stream_29.add(char_literal19);

                    INT20=(Token)match(input,INT,FOLLOW_INT_in_atom394);  
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
                    // 67:13: -> ^( U_MOINS INT )
                    {
                        // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:67:16: ^( U_MOINS INT )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:68:5: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal21=(Token)match(input,33,FOLLOW_33_in_atom409); 
                    pushFollow(FOLLOW_expr_in_atom412);
                    expr22=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr22.getTree());
                    char_literal23=(Token)match(input,34,FOLLOW_34_in_atom414); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:1: affectation : DONNE '\"' IDENTIFIER expr ;
    public final LogoParser.affectation_return affectation() throws RecognitionException {
        LogoParser.affectation_return retval = new LogoParser.affectation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DONNE24=null;
        Token char_literal25=null;
        Token IDENTIFIER26=null;
        LogoParser.expr_return expr27 = null;


        Object DONNE24_tree=null;
        Object char_literal25_tree=null;
        Object IDENTIFIER26_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:13: ( DONNE '\"' IDENTIFIER expr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:15: DONNE '\"' IDENTIFIER expr
            {
            root_0 = (Object)adaptor.nil();

            DONNE24=(Token)match(input,DONNE,FOLLOW_DONNE_in_affectation427); 
            DONNE24_tree = (Object)adaptor.create(DONNE24);
            root_0 = (Object)adaptor.becomeRoot(DONNE24_tree, root_0);

            char_literal25=(Token)match(input,35,FOLLOW_35_in_affectation430); 
            IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_affectation433); 
            IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
            adaptor.addChild(root_0, IDENTIFIER26_tree);

            pushFollow(FOLLOW_expr_in_affectation435);
            expr27=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr27.getTree());
             context.set(IDENTIFIER26.getText(), 0); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:1: instruction : ( affectation | ( AV | TD | TG | REC | FCAP | FCC ) expr | ( FPOS '[' expr expr ']' ) | ( VE | BC | LC ) );
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AV29=null;
        Token TD30=null;
        Token TG31=null;
        Token REC32=null;
        Token FCAP33=null;
        Token FCC34=null;
        Token FPOS36=null;
        Token char_literal37=null;
        Token char_literal40=null;
        Token VE41=null;
        Token BC42=null;
        Token LC43=null;
        LogoParser.affectation_return affectation28 = null;

        LogoParser.expr_return expr35 = null;

        LogoParser.expr_return expr38 = null;

        LogoParser.expr_return expr39 = null;


        Object AV29_tree=null;
        Object TD30_tree=null;
        Object TG31_tree=null;
        Object REC32_tree=null;
        Object FCAP33_tree=null;
        Object FCC34_tree=null;
        Object FPOS36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal40_tree=null;
        Object VE41_tree=null;
        Object BC42_tree=null;
        Object LC43_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:13: ( affectation | ( AV | TD | TG | REC | FCAP | FCC ) expr | ( FPOS '[' expr expr ']' ) | ( VE | BC | LC ) )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:3: affectation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_instruction447);
                    affectation28=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation28.getTree());

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:3: ( AV | TD | TG | REC | FCAP | FCC ) expr
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:3: ( AV | TD | TG | REC | FCAP | FCC )
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
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:5: AV
                            {
                            AV29=(Token)match(input,AV,FOLLOW_AV_in_instruction458); 
                            AV29_tree = (Object)adaptor.create(AV29);
                            root_0 = (Object)adaptor.becomeRoot(AV29_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:11: TD
                            {
                            TD30=(Token)match(input,TD,FOLLOW_TD_in_instruction463); 
                            TD30_tree = (Object)adaptor.create(TD30);
                            root_0 = (Object)adaptor.becomeRoot(TD30_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:17: TG
                            {
                            TG31=(Token)match(input,TG,FOLLOW_TG_in_instruction468); 
                            TG31_tree = (Object)adaptor.create(TG31);
                            root_0 = (Object)adaptor.becomeRoot(TG31_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:23: REC
                            {
                            REC32=(Token)match(input,REC,FOLLOW_REC_in_instruction473); 
                            REC32_tree = (Object)adaptor.create(REC32);
                            root_0 = (Object)adaptor.becomeRoot(REC32_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:29: FCAP
                            {
                            FCAP33=(Token)match(input,FCAP,FOLLOW_FCAP_in_instruction477); 
                            FCAP33_tree = (Object)adaptor.create(FCAP33);
                            root_0 = (Object)adaptor.becomeRoot(FCAP33_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:37: FCC
                            {
                            FCC34=(Token)match(input,FCC,FOLLOW_FCC_in_instruction482); 
                            FCC34_tree = (Object)adaptor.create(FCC34);
                            root_0 = (Object)adaptor.becomeRoot(FCC34_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction486);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr35.getTree());

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:3: ( FPOS '[' expr expr ']' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:3: ( FPOS '[' expr expr ']' )
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:5: FPOS '[' expr expr ']'
                    {
                    FPOS36=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction497); 
                    FPOS36_tree = (Object)adaptor.create(FPOS36);
                    root_0 = (Object)adaptor.becomeRoot(FPOS36_tree, root_0);

                    char_literal37=(Token)match(input,36,FOLLOW_36_in_instruction500); 
                    pushFollow(FOLLOW_expr_in_instruction503);
                    expr38=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr38.getTree());
                    pushFollow(FOLLOW_expr_in_instruction505);
                    expr39=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr39.getTree());
                    char_literal40=(Token)match(input,37,FOLLOW_37_in_instruction507); 

                    }


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:82:3: ( VE | BC | LC )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:82:3: ( VE | BC | LC )
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
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:82:4: VE
                            {
                            VE41=(Token)match(input,VE,FOLLOW_VE_in_instruction519); 
                            VE41_tree = (Object)adaptor.create(VE41);
                            root_0 = (Object)adaptor.becomeRoot(VE41_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:82:10: BC
                            {
                            BC42=(Token)match(input,BC,FOLLOW_BC_in_instruction524); 
                            BC42_tree = (Object)adaptor.create(BC42);
                            root_0 = (Object)adaptor.becomeRoot(BC42_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:82:16: LC
                            {
                            LC43=(Token)match(input,LC,FOLLOW_LC_in_instruction529); 
                            LC43_tree = (Object)adaptor.create(LC43);
                            root_0 = (Object)adaptor.becomeRoot(LC43_tree, root_0);


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
    public static final BitSet FOLLOW_IDENTIFIER_in_atom361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_atom379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INT_in_atom381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_atom392 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INT_in_atom394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_atom409 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_atom412 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_atom414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_affectation427 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_affectation430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_affectation433 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_affectation435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction458 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_TD_in_instruction463 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_TG_in_instruction468 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_REC_in_instruction473 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_FCAP_in_instruction477 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_FCC_in_instruction482 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_instruction486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction497 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_instruction500 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_instruction503 = new BitSet(new long[]{0x0000000230060000L});
    public static final BitSet FOLLOW_expr_in_instruction505 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instruction507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction529 = new BitSet(new long[]{0x0000000000000002L});

}