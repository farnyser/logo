// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/Logo.g 2012-06-05 11:13:22

  package logoparsing;
  import utilities.Context;
  import logogui.Log;
  import java.util.Vector;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "CALL", "SCOPE", "VALUES", "PARAMETERS", "U_MOINS", "FCC_RGB", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "DONNE", "LOCALE", "REPETE", "SI", "TANTQUE", "POUR", "FIN", "RENDS", "LOOP", "HASARD", "CAP", "PI", "PAUSE", "SIN", "COS", "IDENTIFIER", "INT", "REAL", "WS", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'^'", "':'", "'('", "')'", "'\"'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int PROGRAMME=4;
    public static final int CALL=5;
    public static final int SCOPE=6;
    public static final int VALUES=7;
    public static final int PARAMETERS=8;
    public static final int U_MOINS=9;
    public static final int FCC_RGB=10;
    public static final int AV=11;
    public static final int TD=12;
    public static final int TG=13;
    public static final int REC=14;
    public static final int VE=15;
    public static final int LC=16;
    public static final int BC=17;
    public static final int FPOS=18;
    public static final int FCAP=19;
    public static final int FCC=20;
    public static final int DONNE=21;
    public static final int LOCALE=22;
    public static final int REPETE=23;
    public static final int SI=24;
    public static final int TANTQUE=25;
    public static final int POUR=26;
    public static final int FIN=27;
    public static final int RENDS=28;
    public static final int LOOP=29;
    public static final int HASARD=30;
    public static final int CAP=31;
    public static final int PI=32;
    public static final int PAUSE=33;
    public static final int SIN=34;
    public static final int COS=35;
    public static final int IDENTIFIER=36;
    public static final int INT=37;
    public static final int REAL=38;
    public static final int WS=39;

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


      private Context context = new Context();
      private boolean valide = true;
      
      public boolean getValide()
      {
        return valide;
      }
      
      public Context getContext()
      {
        return context;
      }


    public static class programme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programme"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:13: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_programme406);
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
            // 69:32: -> ^( PROGRAMME liste_instructions )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:35: ^( PROGRAMME liste_instructions )
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

    public static class bloc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:70:1: bloc : liste_instructions -> ^( SCOPE liste_instructions ) ;
    public final LogoParser.bloc_return bloc() throws RecognitionException {
        LogoParser.bloc_return retval = new LogoParser.bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions2 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        context.newScope();
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:70:65: ( liste_instructions -> ^( SCOPE liste_instructions ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:70:67: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_bloc430);
            liste_instructions2=liste_instructions();

            state._fsp--;

            stream_liste_instructions.add(liste_instructions2.getTree());


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
            // 70:86: -> ^( SCOPE liste_instructions )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:70:89: ^( SCOPE liste_instructions )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SCOPE, "SCOPE"), root_1);

                adaptor.addChild(root_1, stream_liste_instructions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

            context.removeScope();
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
    // $ANTLR end "bloc"

    public static class liste_instructions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "liste_instructions"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:1: liste_instructions : ( instruction )* ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.instruction_return instruction3 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:20: ( ( instruction )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:22: ( instruction )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:22: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=AV && LA1_0<=POUR)||LA1_0==RENDS||LA1_0==PAUSE||LA1_0==IDENTIFIER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:23: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions446);
            	    instruction3=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "liste_instructions"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:1: expr : recursExpr ;
    public final LogoParser.expr_return expr() throws RecognitionException {
        LogoParser.expr_return retval = new LogoParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.recursExpr_return recursExpr4 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:6: ( recursExpr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:19: recursExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_recursExpr_in_expr458);
            recursExpr4=recursExpr();

            state._fsp--;

            adaptor.addChild(root_0, recursExpr4.getTree());

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

    public static class recursExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recursExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:1: recursExpr : boolExpr ;
    public final LogoParser.recursExpr_return recursExpr() throws RecognitionException {
        LogoParser.recursExpr_return retval = new LogoParser.recursExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.boolExpr_return boolExpr5 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:12: ( boolExpr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:14: boolExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolExpr_in_recursExpr465);
            boolExpr5=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr5.getTree());

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
    // $ANTLR end "recursExpr"

    public static class boolExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:1: boolExpr : sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? ;
    public final LogoParser.boolExpr_return boolExpr() throws RecognitionException {
        LogoParser.boolExpr_return retval = new LogoParser.boolExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set7=null;
        LogoParser.sumExpr_return sumExpr6 = null;

        LogoParser.sumExpr_return sumExpr8 = null;


        Object set7_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:10: ( sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:12: sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sumExpr_in_boolExpr473);
            sumExpr6=sumExpr();

            state._fsp--;

            adaptor.addChild(root_0, sumExpr6.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:20: ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=40 && LA2_0<=47)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:21: ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr
                    {
                    set7=(Token)input.LT(1);
                    set7=(Token)input.LT(1);
                    if ( (input.LA(1)>=40 && input.LA(1)<=47) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set7), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_sumExpr_in_boolExpr495);
                    sumExpr8=sumExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, sumExpr8.getTree());

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:1: sumExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final LogoParser.sumExpr_return sumExpr() throws RecognitionException {
        LogoParser.sumExpr_return retval = new LogoParser.sumExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set10=null;
        LogoParser.multExpr_return multExpr9 = null;

        LogoParser.multExpr_return multExpr11 = null;


        Object set10_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:11: multExpr ( ( '+' | '-' ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_sumExpr505);
            multExpr9=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr9.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:20: ( ( '+' | '-' ) multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=48 && LA3_0<=49)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:21: ( '+' | '-' ) multExpr
            	    {
            	    set10=(Token)input.LT(1);
            	    set10=(Token)input.LT(1);
            	    if ( (input.LA(1)>=48 && input.LA(1)<=49) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set10), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_sumExpr515);
            	    multExpr11=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr11.getTree());

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:77:1: multExpr : powExpr ( ( '*' | '/' | 'MOD' ) powExpr )* ;
    public final LogoParser.multExpr_return multExpr() throws RecognitionException {
        LogoParser.multExpr_return retval = new LogoParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;
        LogoParser.powExpr_return powExpr12 = null;

        LogoParser.powExpr_return powExpr14 = null;


        Object set13_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:77:10: ( powExpr ( ( '*' | '/' | 'MOD' ) powExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:77:12: powExpr ( ( '*' | '/' | 'MOD' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_multExpr525);
            powExpr12=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr12.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:77:20: ( ( '*' | '/' | 'MOD' ) powExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=50 && LA4_0<=52)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:77:21: ( '*' | '/' | 'MOD' ) powExpr
            	    {
            	    set13=(Token)input.LT(1);
            	    set13=(Token)input.LT(1);
            	    if ( (input.LA(1)>=50 && input.LA(1)<=52) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set13), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_multExpr537);
            	    powExpr14=powExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, powExpr14.getTree());

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:1: powExpr : signedExpr ( ( '^' ) signedExpr )* ;
    public final LogoParser.powExpr_return powExpr() throws RecognitionException {
        LogoParser.powExpr_return retval = new LogoParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        LogoParser.signedExpr_return signedExpr15 = null;

        LogoParser.signedExpr_return signedExpr17 = null;


        Object char_literal16_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:9: ( signedExpr ( ( '^' ) signedExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:11: signedExpr ( ( '^' ) signedExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_signedExpr_in_powExpr547);
            signedExpr15=signedExpr();

            state._fsp--;

            adaptor.addChild(root_0, signedExpr15.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:22: ( ( '^' ) signedExpr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==53) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:23: ( '^' ) signedExpr
            	    {
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:23: ( '^' )
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:24: '^'
            	    {
            	    char_literal16=(Token)match(input,53,FOLLOW_53_in_powExpr551); 
            	    char_literal16_tree = (Object)adaptor.create(char_literal16);
            	    adaptor.addChild(root_0, char_literal16_tree);


            	    }

            	    pushFollow(FOLLOW_signedExpr_in_powExpr555);
            	    signedExpr17=signedExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signedExpr17.getTree());

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

    public static class signedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signedExpr"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:1: signedExpr : atom ;
    public final LogoParser.signedExpr_return signedExpr() throws RecognitionException {
        LogoParser.signedExpr_return retval = new LogoParser.signedExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.atom_return atom18 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:12: ( atom )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:14: atom
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_signedExpr566);
            atom18=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom18.getTree());

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
    // $ANTLR end "signedExpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:81:1: atom : ( ':' id= IDENTIFIER | LOOP | CAP | PI | INT | REAL | HASARD atom | COS atom | SIN atom | '(' call ')' | '(' recursExpr ')' );
    public final LogoParser.atom_return atom() throws RecognitionException {
        LogoParser.atom_return retval = new LogoParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token char_literal19=null;
        Token LOOP20=null;
        Token CAP21=null;
        Token PI22=null;
        Token INT23=null;
        Token REAL24=null;
        Token HASARD25=null;
        Token COS27=null;
        Token SIN29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        LogoParser.atom_return atom26 = null;

        LogoParser.atom_return atom28 = null;

        LogoParser.atom_return atom30 = null;

        LogoParser.call_return call32 = null;

        LogoParser.recursExpr_return recursExpr35 = null;


        Object id_tree=null;
        Object char_literal19_tree=null;
        Object LOOP20_tree=null;
        Object CAP21_tree=null;
        Object PI22_tree=null;
        Object INT23_tree=null;
        Object REAL24_tree=null;
        Object HASARD25_tree=null;
        Object COS27_tree=null;
        Object SIN29_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:81:5: ( ':' id= IDENTIFIER | LOOP | CAP | PI | INT | REAL | HASARD atom | COS atom | SIN atom | '(' call ')' | '(' recursExpr ')' )
            int alt6=11;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:82:3: ':' id= IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal19=(Token)match(input,54,FOLLOW_54_in_atom575); 
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom582); 
                    id_tree = (Object)adaptor.create(id);
                    adaptor.addChild(root_0, id_tree);


                    		try {
                    		  context.get(id.getText()); 
                    		}
                    		catch ( Exception e ) {
                    	    Log.appendnl("Parser l. " + id.getLine() + " : variable " + id.getText() + " non-definie");
                    	    valide = false;
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:92:5: LOOP
                    {
                    root_0 = (Object)adaptor.nil();

                    LOOP20=(Token)match(input,LOOP,FOLLOW_LOOP_in_atom593); 
                    LOOP20_tree = (Object)adaptor.create(LOOP20);
                    adaptor.addChild(root_0, LOOP20_tree);

                    try {context.getLoop();} catch(Exception e) { Log.appendnl("Parser l. " + LOOP20.getLine() + " : LOOP ne peut etre utilise que dans un REPETE"); }

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:93:5: CAP
                    {
                    root_0 = (Object)adaptor.nil();

                    CAP21=(Token)match(input,CAP,FOLLOW_CAP_in_atom601); 
                    CAP21_tree = (Object)adaptor.create(CAP21);
                    adaptor.addChild(root_0, CAP21_tree);


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:94:5: PI
                    {
                    root_0 = (Object)adaptor.nil();

                    PI22=(Token)match(input,PI,FOLLOW_PI_in_atom607); 
                    PI22_tree = (Object)adaptor.create(PI22);
                    adaptor.addChild(root_0, PI22_tree);


                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:95:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT23=(Token)match(input,INT,FOLLOW_INT_in_atom613); 
                    INT23_tree = (Object)adaptor.create(INT23);
                    adaptor.addChild(root_0, INT23_tree);


                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:96:5: REAL
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL24=(Token)match(input,REAL,FOLLOW_REAL_in_atom619); 
                    REAL24_tree = (Object)adaptor.create(REAL24);
                    adaptor.addChild(root_0, REAL24_tree);


                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:97:5: HASARD atom
                    {
                    root_0 = (Object)adaptor.nil();

                    HASARD25=(Token)match(input,HASARD,FOLLOW_HASARD_in_atom625); 
                    HASARD25_tree = (Object)adaptor.create(HASARD25);
                    root_0 = (Object)adaptor.becomeRoot(HASARD25_tree, root_0);

                    pushFollow(FOLLOW_atom_in_atom628);
                    atom26=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom26.getTree());

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:98:5: COS atom
                    {
                    root_0 = (Object)adaptor.nil();

                    COS27=(Token)match(input,COS,FOLLOW_COS_in_atom634); 
                    COS27_tree = (Object)adaptor.create(COS27);
                    root_0 = (Object)adaptor.becomeRoot(COS27_tree, root_0);

                    pushFollow(FOLLOW_atom_in_atom637);
                    atom28=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom28.getTree());

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:99:5: SIN atom
                    {
                    root_0 = (Object)adaptor.nil();

                    SIN29=(Token)match(input,SIN,FOLLOW_SIN_in_atom643); 
                    SIN29_tree = (Object)adaptor.create(SIN29);
                    root_0 = (Object)adaptor.becomeRoot(SIN29_tree, root_0);

                    pushFollow(FOLLOW_atom_in_atom646);
                    atom30=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom30.getTree());

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:100:5: '(' call ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal31=(Token)match(input,55,FOLLOW_55_in_atom652); 
                    pushFollow(FOLLOW_call_in_atom655);
                    call32=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call32.getTree());
                    char_literal33=(Token)match(input,56,FOLLOW_56_in_atom657); 

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:101:5: '(' recursExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal34=(Token)match(input,55,FOLLOW_55_in_atom664); 
                    pushFollow(FOLLOW_recursExpr_in_atom667);
                    recursExpr35=recursExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, recursExpr35.getTree());
                    char_literal36=(Token)match(input,56,FOLLOW_56_in_atom669); 

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

    public static class deffonction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deffonction"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:106:1: deffonction : POUR name= IDENTIFIER ( ':' id= IDENTIFIER -> IDENTIFIER )* bloc FIN -> ^( POUR $name bloc ) ;
    public final LogoParser.deffonction_return deffonction() throws RecognitionException {
        LogoParser.deffonction_return retval = new LogoParser.deffonction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token id=null;
        Token POUR37=null;
        Token char_literal38=null;
        Token FIN40=null;
        LogoParser.bloc_return bloc39 = null;


        Object name_tree=null;
        Object id_tree=null;
        Object POUR37_tree=null;
        Object char_literal38_tree=null;
        Object FIN40_tree=null;
        RewriteRuleTokenStream stream_POUR=new RewriteRuleTokenStream(adaptor,"token POUR");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_FIN=new RewriteRuleTokenStream(adaptor,"token FIN");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");

            Vector<String> params = new Vector<String>();

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:111:1: ( POUR name= IDENTIFIER ( ':' id= IDENTIFIER -> IDENTIFIER )* bloc FIN -> ^( POUR $name bloc ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:112:3: POUR name= IDENTIFIER ( ':' id= IDENTIFIER -> IDENTIFIER )* bloc FIN
            {
            POUR37=(Token)match(input,POUR,FOLLOW_POUR_in_deffonction691);  
            stream_POUR.add(POUR37);

            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction695);  
            stream_IDENTIFIER.add(name);

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:112:24: ( ':' id= IDENTIFIER -> IDENTIFIER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==54) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:112:25: ':' id= IDENTIFIER
            	    {
            	    char_literal38=(Token)match(input,54,FOLLOW_54_in_deffonction698);  
            	    stream_54.add(char_literal38);

            	    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction702);  
            	    stream_IDENTIFIER.add(id);

            	    params.add(id.getText());


            	    // AST REWRITE
            	    // elements: IDENTIFIER
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 112:71: -> IDENTIFIER
            	    {
            	        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


                context.setFunctionScope(name.getText());
                context.newScope();
                
                for ( int i = 0 ; i < params.size() ; i++ )
                {
                  context.setParam(params.elementAt(i), 0);
                }
                
                context.define(name.getText(),params);
              
            pushFollow(FOLLOW_bloc_in_deffonction713);
            bloc39=bloc();

            state._fsp--;

            stream_bloc.add(bloc39.getTree());
            context.removeScope(); context.exitFunctionScope();
            FIN40=(Token)match(input,FIN,FOLLOW_FIN_in_deffonction717);  
            stream_FIN.add(FIN40);



            // AST REWRITE
            // elements: bloc, name, POUR
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:3: -> ^( POUR $name bloc )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:123:6: ^( POUR $name bloc )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_POUR.nextNode(), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                adaptor.addChild(root_1, stream_bloc.nextTree());

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
    // $ANTLR end "deffonction"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:126:1: call : name= IDENTIFIER ( recursExpr )* -> ^( CALL $name ( recursExpr )* ) ;
    public final LogoParser.call_return call() throws RecognitionException {
        LogoParser.call_return retval = new LogoParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        LogoParser.recursExpr_return recursExpr41 = null;


        Object name_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_recursExpr=new RewriteRuleSubtreeStream(adaptor,"rule recursExpr");

            int count = 0; 
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:131:3: (name= IDENTIFIER ( recursExpr )* -> ^( CALL $name ( recursExpr )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:132:3: name= IDENTIFIER ( recursExpr )*
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_call756);  
            stream_IDENTIFIER.add(name);

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:132:19: ( recursExpr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=LOOP && LA8_0<=PI)||(LA8_0>=SIN && LA8_0<=COS)||(LA8_0>=INT && LA8_0<=REAL)||(LA8_0>=54 && LA8_0<=55)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:132:20: recursExpr
            	    {
            	    pushFollow(FOLLOW_recursExpr_in_call759);
            	    recursExpr41=recursExpr();

            	    state._fsp--;

            	    stream_recursExpr.add(recursExpr41.getTree());
            	    count++;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


                if ( context.callable(name.getText()) == false )  
                {
                  Log.appendnl("Parser l. " + name.getLine() + " : fonction " + name.getText() + " non-definie\n");
                  valide = false;
                }
                else if ( context.getParameters(name.getText()).size() != count )  
                {
                  Log.appendnl("Parser l. " + name.getLine() + " : fonction " + name.getText() + " prend " + context.getParameters(name.getText()).size() + " argument(s)");
                  valide = false;
                }
              


            // AST REWRITE
            // elements: recursExpr, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:3: -> ^( CALL $name ( recursExpr )* )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:145:6: ^( CALL $name ( recursExpr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:145:19: ( recursExpr )*
                while ( stream_recursExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_recursExpr.nextTree());

                }
                stream_recursExpr.reset();

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
    // $ANTLR end "call"

    public static class affectation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:148:1: affectation : ( DONNE '\"' IDENTIFIER expr | LOCALE '\"' IDENTIFIER expr );
    public final LogoParser.affectation_return affectation() throws RecognitionException {
        LogoParser.affectation_return retval = new LogoParser.affectation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DONNE42=null;
        Token char_literal43=null;
        Token IDENTIFIER44=null;
        Token LOCALE46=null;
        Token char_literal47=null;
        Token IDENTIFIER48=null;
        LogoParser.expr_return expr45 = null;

        LogoParser.expr_return expr49 = null;


        Object DONNE42_tree=null;
        Object char_literal43_tree=null;
        Object IDENTIFIER44_tree=null;
        Object LOCALE46_tree=null;
        Object char_literal47_tree=null;
        Object IDENTIFIER48_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:148:13: ( DONNE '\"' IDENTIFIER expr | LOCALE '\"' IDENTIFIER expr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DONNE) ) {
                alt9=1;
            }
            else if ( (LA9_0==LOCALE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:149:3: DONNE '\"' IDENTIFIER expr
                    {
                    root_0 = (Object)adaptor.nil();

                    DONNE42=(Token)match(input,DONNE,FOLLOW_DONNE_in_affectation796); 
                    DONNE42_tree = (Object)adaptor.create(DONNE42);
                    root_0 = (Object)adaptor.becomeRoot(DONNE42_tree, root_0);

                    char_literal43=(Token)match(input,57,FOLLOW_57_in_affectation799); 
                    IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_affectation802); 
                    IDENTIFIER44_tree = (Object)adaptor.create(IDENTIFIER44);
                    adaptor.addChild(root_0, IDENTIFIER44_tree);

                    pushFollow(FOLLOW_expr_in_affectation804);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());
                     context.set(IDENTIFIER44.getText(), 0); 

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:150:5: LOCALE '\"' IDENTIFIER expr
                    {
                    root_0 = (Object)adaptor.nil();

                    LOCALE46=(Token)match(input,LOCALE,FOLLOW_LOCALE_in_affectation812); 
                    LOCALE46_tree = (Object)adaptor.create(LOCALE46);
                    root_0 = (Object)adaptor.becomeRoot(LOCALE46_tree, root_0);

                    char_literal47=(Token)match(input,57,FOLLOW_57_in_affectation815); 
                    IDENTIFIER48=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_affectation818); 
                    IDENTIFIER48_tree = (Object)adaptor.create(IDENTIFIER48);
                    adaptor.addChild(root_0, IDENTIFIER48_tree);

                    pushFollow(FOLLOW_expr_in_affectation820);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

                          try{ context.setLocal(IDENTIFIER48.getText(), 0);}
                          catch ( Exception e ) 
                          {
                    	      Log.appendnl("Parser l. " + IDENTIFIER48.getLine() + " : variable locale " + IDENTIFIER48.getText() + " ne peut porter ce nom (existe comme argument de la fonction)");
                    	      valide = false;
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
    // $ANTLR end "affectation"

    public static class repete_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repete"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:161:1: repete : ( REPETE expr '[' bloc ']' ) ;
    public final LogoParser.repete_return repete() throws RecognitionException {
        LogoParser.repete_return retval = new LogoParser.repete_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REPETE50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        LogoParser.expr_return expr51 = null;

        LogoParser.bloc_return bloc53 = null;


        Object REPETE50_tree=null;
        Object char_literal52_tree=null;
        Object char_literal54_tree=null;

        context.incLoop();
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:161:34: ( ( REPETE expr '[' bloc ']' ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:162:3: ( REPETE expr '[' bloc ']' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:162:3: ( REPETE expr '[' bloc ']' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:162:4: REPETE expr '[' bloc ']'
            {
            REPETE50=(Token)match(input,REPETE,FOLLOW_REPETE_in_repete844); 
            REPETE50_tree = (Object)adaptor.create(REPETE50);
            root_0 = (Object)adaptor.becomeRoot(REPETE50_tree, root_0);

            pushFollow(FOLLOW_expr_in_repete847);
            expr51=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr51.getTree());
            char_literal52=(Token)match(input,58,FOLLOW_58_in_repete849); 
            pushFollow(FOLLOW_bloc_in_repete852);
            bloc53=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc53.getTree());
            char_literal54=(Token)match(input,59,FOLLOW_59_in_repete854); 

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
    // $ANTLR end "repete"

    public static class tantque_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tantque"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:165:1: tantque : ( TANTQUE expr '[' bloc ']' ) ;
    public final LogoParser.tantque_return tantque() throws RecognitionException {
        LogoParser.tantque_return retval = new LogoParser.tantque_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TANTQUE55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        LogoParser.expr_return expr56 = null;

        LogoParser.bloc_return bloc58 = null;


        Object TANTQUE55_tree=null;
        Object char_literal57_tree=null;
        Object char_literal59_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:165:9: ( ( TANTQUE expr '[' bloc ']' ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:166:3: ( TANTQUE expr '[' bloc ']' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:166:3: ( TANTQUE expr '[' bloc ']' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:166:4: TANTQUE expr '[' bloc ']'
            {
            TANTQUE55=(Token)match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque869); 
            TANTQUE55_tree = (Object)adaptor.create(TANTQUE55);
            root_0 = (Object)adaptor.becomeRoot(TANTQUE55_tree, root_0);

            pushFollow(FOLLOW_expr_in_tantque872);
            expr56=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr56.getTree());
            char_literal57=(Token)match(input,58,FOLLOW_58_in_tantque874); 
            pushFollow(FOLLOW_bloc_in_tantque877);
            bloc58=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc58.getTree());
            char_literal59=(Token)match(input,59,FOLLOW_59_in_tantque879); 

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
    // $ANTLR end "tantque"

    public static class si_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "si"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:169:1: si : SI expr '[' bloc ']' ( '[' bloc ']' )? ;
    public final LogoParser.si_return si() throws RecognitionException {
        LogoParser.si_return retval = new LogoParser.si_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SI60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        LogoParser.expr_return expr61 = null;

        LogoParser.bloc_return bloc63 = null;

        LogoParser.bloc_return bloc66 = null;


        Object SI60_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal67_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:169:4: ( SI expr '[' bloc ']' ( '[' bloc ']' )? )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:170:3: SI expr '[' bloc ']' ( '[' bloc ']' )?
            {
            root_0 = (Object)adaptor.nil();

            SI60=(Token)match(input,SI,FOLLOW_SI_in_si893); 
            SI60_tree = (Object)adaptor.create(SI60);
            root_0 = (Object)adaptor.becomeRoot(SI60_tree, root_0);

            pushFollow(FOLLOW_expr_in_si896);
            expr61=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr61.getTree());
            char_literal62=(Token)match(input,58,FOLLOW_58_in_si898); 
            pushFollow(FOLLOW_bloc_in_si901);
            bloc63=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc63.getTree());
            char_literal64=(Token)match(input,59,FOLLOW_59_in_si903); 
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:170:27: ( '[' bloc ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==58) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:170:28: '[' bloc ']'
                    {
                    char_literal65=(Token)match(input,58,FOLLOW_58_in_si907); 
                    pushFollow(FOLLOW_bloc_in_si910);
                    bloc66=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc66.getTree());
                    char_literal67=(Token)match(input,59,FOLLOW_59_in_si912); 

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
    // $ANTLR end "si"

    public static class rends_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rends"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:173:1: rends : RENDS expr ;
    public final LogoParser.rends_return rends() throws RecognitionException {
        LogoParser.rends_return retval = new LogoParser.rends_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RENDS68=null;
        LogoParser.expr_return expr69 = null;


        Object RENDS68_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:173:7: ( RENDS expr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:3: RENDS expr
            {
            root_0 = (Object)adaptor.nil();

            RENDS68=(Token)match(input,RENDS,FOLLOW_RENDS_in_rends927); 
            RENDS68_tree = (Object)adaptor.create(RENDS68);
            root_0 = (Object)adaptor.becomeRoot(RENDS68_tree, root_0);

            pushFollow(FOLLOW_expr_in_rends930);
            expr69=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr69.getTree());

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
    // $ANTLR end "rends"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:177:1: instruction : ( affectation | repete | si | tantque | deffonction | call | rends | ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr | ( FPOS '[' expr expr ']' ) | ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) ) | ( VE | BC | LC ) );
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AV77=null;
        Token TD78=null;
        Token TG79=null;
        Token REC80=null;
        Token FCAP81=null;
        Token FCC82=null;
        Token PAUSE83=null;
        Token FPOS85=null;
        Token char_literal86=null;
        Token char_literal89=null;
        Token FCC90=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token VE93=null;
        Token BC94=null;
        Token LC95=null;
        LogoParser.expr_return a = null;

        LogoParser.expr_return b = null;

        LogoParser.expr_return c = null;

        LogoParser.affectation_return affectation70 = null;

        LogoParser.repete_return repete71 = null;

        LogoParser.si_return si72 = null;

        LogoParser.tantque_return tantque73 = null;

        LogoParser.deffonction_return deffonction74 = null;

        LogoParser.call_return call75 = null;

        LogoParser.rends_return rends76 = null;

        LogoParser.expr_return expr84 = null;

        LogoParser.expr_return expr87 = null;

        LogoParser.expr_return expr88 = null;


        Object AV77_tree=null;
        Object TD78_tree=null;
        Object TG79_tree=null;
        Object REC80_tree=null;
        Object FCAP81_tree=null;
        Object FCC82_tree=null;
        Object PAUSE83_tree=null;
        Object FPOS85_tree=null;
        Object char_literal86_tree=null;
        Object char_literal89_tree=null;
        Object FCC90_tree=null;
        Object char_literal91_tree=null;
        Object char_literal92_tree=null;
        Object VE93_tree=null;
        Object BC94_tree=null;
        Object LC95_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_FCC=new RewriteRuleTokenStream(adaptor,"token FCC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:177:13: ( affectation | repete | si | tantque | deffonction | call | rends | ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr | ( FPOS '[' expr expr ']' ) | ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) ) | ( VE | BC | LC ) )
            int alt13=11;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:3: affectation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_instruction941);
                    affectation70=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation70.getTree());

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:17: repete
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_repete_in_instruction945);
                    repete71=repete();

                    state._fsp--;

                    adaptor.addChild(root_0, repete71.getTree());

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:26: si
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_si_in_instruction949);
                    si72=si();

                    state._fsp--;

                    adaptor.addChild(root_0, si72.getTree());

                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:31: tantque
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tantque_in_instruction953);
                    tantque73=tantque();

                    state._fsp--;

                    adaptor.addChild(root_0, tantque73.getTree());

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:41: deffonction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_deffonction_in_instruction957);
                    deffonction74=deffonction();

                    state._fsp--;

                    adaptor.addChild(root_0, deffonction74.getTree());

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:55: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_instruction961);
                    call75=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call75.getTree());

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:62: rends
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rends_in_instruction965);
                    rends76=rends();

                    state._fsp--;

                    adaptor.addChild(root_0, rends76.getTree());

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:3: ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:3: ( AV | TD | TG | REC | FCAP | FCC | PAUSE )
                    int alt11=7;
                    switch ( input.LA(1) ) {
                    case AV:
                        {
                        alt11=1;
                        }
                        break;
                    case TD:
                        {
                        alt11=2;
                        }
                        break;
                    case TG:
                        {
                        alt11=3;
                        }
                        break;
                    case REC:
                        {
                        alt11=4;
                        }
                        break;
                    case FCAP:
                        {
                        alt11=5;
                        }
                        break;
                    case FCC:
                        {
                        alt11=6;
                        }
                        break;
                    case PAUSE:
                        {
                        alt11=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:5: AV
                            {
                            AV77=(Token)match(input,AV,FOLLOW_AV_in_instruction976); 
                            AV77_tree = (Object)adaptor.create(AV77);
                            root_0 = (Object)adaptor.becomeRoot(AV77_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:11: TD
                            {
                            TD78=(Token)match(input,TD,FOLLOW_TD_in_instruction981); 
                            TD78_tree = (Object)adaptor.create(TD78);
                            root_0 = (Object)adaptor.becomeRoot(TD78_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:17: TG
                            {
                            TG79=(Token)match(input,TG,FOLLOW_TG_in_instruction986); 
                            TG79_tree = (Object)adaptor.create(TG79);
                            root_0 = (Object)adaptor.becomeRoot(TG79_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:23: REC
                            {
                            REC80=(Token)match(input,REC,FOLLOW_REC_in_instruction991); 
                            REC80_tree = (Object)adaptor.create(REC80);
                            root_0 = (Object)adaptor.becomeRoot(REC80_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:29: FCAP
                            {
                            FCAP81=(Token)match(input,FCAP,FOLLOW_FCAP_in_instruction995); 
                            FCAP81_tree = (Object)adaptor.create(FCAP81);
                            root_0 = (Object)adaptor.becomeRoot(FCAP81_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:37: FCC
                            {
                            FCC82=(Token)match(input,FCC,FOLLOW_FCC_in_instruction1000); 
                            FCC82_tree = (Object)adaptor.create(FCC82);
                            root_0 = (Object)adaptor.becomeRoot(FCC82_tree, root_0);


                            }
                            break;
                        case 7 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:44: PAUSE
                            {
                            PAUSE83=(Token)match(input,PAUSE,FOLLOW_PAUSE_in_instruction1005); 
                            PAUSE83_tree = (Object)adaptor.create(PAUSE83);
                            root_0 = (Object)adaptor.becomeRoot(PAUSE83_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction1009);
                    expr84=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr84.getTree());

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:3: ( FPOS '[' expr expr ']' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:3: ( FPOS '[' expr expr ']' )
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:5: FPOS '[' expr expr ']'
                    {
                    FPOS85=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction1020); 
                    FPOS85_tree = (Object)adaptor.create(FPOS85);
                    root_0 = (Object)adaptor.becomeRoot(FPOS85_tree, root_0);

                    char_literal86=(Token)match(input,58,FOLLOW_58_in_instruction1023); 
                    pushFollow(FOLLOW_expr_in_instruction1026);
                    expr87=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr87.getTree());
                    pushFollow(FOLLOW_expr_in_instruction1028);
                    expr88=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr88.getTree());
                    char_literal89=(Token)match(input,59,FOLLOW_59_in_instruction1030); 

                    }


                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:184:3: ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) )
                    {
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:184:3: ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) )
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:184:4: FCC '[' a= expr b= expr c= expr ']'
                    {
                    FCC90=(Token)match(input,FCC,FOLLOW_FCC_in_instruction1042);  
                    stream_FCC.add(FCC90);

                    char_literal91=(Token)match(input,58,FOLLOW_58_in_instruction1044);  
                    stream_58.add(char_literal91);

                    pushFollow(FOLLOW_expr_in_instruction1048);
                    a=expr();

                    state._fsp--;

                    stream_expr.add(a.getTree());
                    pushFollow(FOLLOW_expr_in_instruction1052);
                    b=expr();

                    state._fsp--;

                    stream_expr.add(b.getTree());
                    pushFollow(FOLLOW_expr_in_instruction1056);
                    c=expr();

                    state._fsp--;

                    stream_expr.add(c.getTree());
                    char_literal92=(Token)match(input,59,FOLLOW_59_in_instruction1058);  
                    stream_59.add(char_literal92);



                    // AST REWRITE
                    // elements: c, b, a
                    // token labels: 
                    // rule labels: retval, b, c, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:37: -> ^( FCC_RGB $a $b $c)
                    {
                        // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:184:40: ^( FCC_RGB $a $b $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FCC_RGB, "FCC_RGB"), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());
                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:186:3: ( VE | BC | LC )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:186:3: ( VE | BC | LC )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case VE:
                        {
                        alt12=1;
                        }
                        break;
                    case BC:
                        {
                        alt12=2;
                        }
                        break;
                    case LC:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:186:4: VE
                            {
                            VE93=(Token)match(input,VE,FOLLOW_VE_in_instruction1083); 
                            VE93_tree = (Object)adaptor.create(VE93);
                            root_0 = (Object)adaptor.becomeRoot(VE93_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:186:10: BC
                            {
                            BC94=(Token)match(input,BC,FOLLOW_BC_in_instruction1088); 
                            BC94_tree = (Object)adaptor.create(BC94);
                            root_0 = (Object)adaptor.becomeRoot(BC94_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:186:16: LC
                            {
                            LC95=(Token)match(input,LC,FOLLOW_LC_in_instruction1093); 
                            LC95_tree = (Object)adaptor.create(LC95);
                            root_0 = (Object)adaptor.becomeRoot(LC95_tree, root_0);


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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\35\11\uffff\1\35\2\uffff";
    static final String DFA6_maxS =
        "\1\67\11\uffff\1\67\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\7\1\3\1\4\1\uffff\1\11\1\10\1\uffff\1\5\1\6\17\uffff"+
            "\1\1\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\14\1\uffff\2\14\1\13\2\14\17\uffff\2\14",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "81:1: atom : ( ':' id= IDENTIFIER | LOOP | CAP | PI | INT | REAL | HASARD atom | COS atom | SIN atom | '(' call ')' | '(' recursExpr ')' );";
        }
    }
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\1\13\10\uffff\1\35\3\uffff";
    static final String DFA13_maxS =
        "\1\44\10\uffff\1\72\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\13\1\12";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
            "\4\10\3\13\1\12\1\10\1\11\2\1\1\2\1\3\1\4\1\5\1\uffff\1\7\4"+
            "\uffff\1\10\2\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\10\1\uffff\2\10\1\uffff\2\10\17\uffff\2\10\2\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "177:1: instruction : ( affectation | repete | si | tantque | deffonction | call | rends | ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr | ( FPOS '[' expr expr ']' ) | ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) ) | ( VE | BC | LC ) );";
        }
    }
 

    public static final BitSet FOLLOW_liste_instructions_in_programme406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_liste_instructions_in_bloc430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions446 = new BitSet(new long[]{0x0000001217FFF802L});
    public static final BitSet FOLLOW_recursExpr_in_expr458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpr_in_recursExpr465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr473 = new BitSet(new long[]{0x0000FF0000000002L});
    public static final BitSet FOLLOW_set_in_boolExpr476 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr505 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_set_in_sumExpr508 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr515 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_powExpr_in_multExpr525 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_set_in_multExpr528 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_powExpr_in_multExpr537 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_signedExpr_in_powExpr547 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_powExpr551 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_signedExpr_in_powExpr555 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_atom_in_signedExpr566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom575 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_atom593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAP_in_atom601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PI_in_atom607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASARD_in_atom625 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_atom_in_atom628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COS_in_atom634 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_atom_in_atom637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIN_in_atom643 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_atom_in_atom646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom652 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_call_in_atom655 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom664 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_recursExpr_in_atom667 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUR_in_deffonction691 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction695 = new BitSet(new long[]{0x0040001217FFF800L});
    public static final BitSet FOLLOW_54_in_deffonction698 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction702 = new BitSet(new long[]{0x0040001217FFF800L});
    public static final BitSet FOLLOW_bloc_in_deffonction713 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIN_in_deffonction717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_call756 = new BitSet(new long[]{0x00C0006DE0000002L});
    public static final BitSet FOLLOW_recursExpr_in_call759 = new BitSet(new long[]{0x00C0006DE0000002L});
    public static final BitSet FOLLOW_DONNE_in_affectation796 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_affectation799 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_affectation802 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_affectation804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALE_in_affectation812 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_affectation815 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_affectation818 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_affectation820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete844 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_repete847 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_repete849 = new BitSet(new long[]{0x0040001217FFF800L});
    public static final BitSet FOLLOW_bloc_in_repete852 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_repete854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque869 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_tantque872 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_tantque874 = new BitSet(new long[]{0x0040001217FFF800L});
    public static final BitSet FOLLOW_bloc_in_tantque877 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_tantque879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SI_in_si893 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_si896 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_si898 = new BitSet(new long[]{0x0040001217FFF800L});
    public static final BitSet FOLLOW_bloc_in_si901 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_si903 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_si907 = new BitSet(new long[]{0x0040001217FFF800L});
    public static final BitSet FOLLOW_bloc_in_si910 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_si912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RENDS_in_rends927 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_rends930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repete_in_instruction945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffonction_in_instruction957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instruction961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rends_in_instruction965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction976 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_TD_in_instruction981 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_TG_in_instruction986 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_REC_in_instruction991 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_FCAP_in_instruction995 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_FCC_in_instruction1000 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_PAUSE_in_instruction1005 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction1020 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction1023 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1026 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1028 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_instruction1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCC_in_instruction1042 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction1044 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1048 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1052 = new BitSet(new long[]{0x00C0006DE0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1056 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_instruction1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction1093 = new BitSet(new long[]{0x0000000000000002L});

}