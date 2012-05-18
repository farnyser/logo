// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/Logo.g 2012-05-18 22:49:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "CALL", "SCOPE", "VALUES", "PARAMETERS", "U_MOINS", "FCC_RGB", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "DONNE", "LOCALE", "REPETE", "SI", "TANTQUE", "POUR", "FIN", "RENDS", "LOOP", "HASARD", "CAP", "PI", "PAUSE", "IDENTIFIER", "INT", "REAL", "WS", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'^'", "':'", "'('", "')'", "'\"'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__38=38;
    public static final int T__39=39;
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
    public static final int IDENTIFIER=34;
    public static final int INT=35;
    public static final int REAL=36;
    public static final int WS=37;

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:67:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:67:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:67:13: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_programme388);
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
            // 67:32: -> ^( PROGRAMME liste_instructions )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:67:35: ^( PROGRAMME liste_instructions )
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:68:1: bloc : liste_instructions -> ^( SCOPE liste_instructions ) ;
    public final LogoParser.bloc_return bloc() throws RecognitionException {
        LogoParser.bloc_return retval = new LogoParser.bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions2 = null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        context.newScope();
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:68:65: ( liste_instructions -> ^( SCOPE liste_instructions ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:68:67: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_bloc412);
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
            // 68:86: -> ^( SCOPE liste_instructions )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:68:89: ^( SCOPE liste_instructions )
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:1: liste_instructions : ( instruction )* ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.instruction_return instruction3 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:20: ( ( instruction )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:22: ( instruction )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:22: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=AV && LA1_0<=POUR)||LA1_0==RENDS||(LA1_0>=PAUSE && LA1_0<=IDENTIFIER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:69:23: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions428);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:1: expr : recursExpr ;
    public final LogoParser.expr_return expr() throws RecognitionException {
        LogoParser.expr_return retval = new LogoParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.recursExpr_return recursExpr4 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:6: ( recursExpr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:71:19: recursExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_recursExpr_in_expr440);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:72:1: recursExpr : boolExpr ;
    public final LogoParser.recursExpr_return recursExpr() throws RecognitionException {
        LogoParser.recursExpr_return retval = new LogoParser.recursExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.boolExpr_return boolExpr5 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:72:12: ( boolExpr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:72:14: boolExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolExpr_in_recursExpr447);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:1: boolExpr : sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? ;
    public final LogoParser.boolExpr_return boolExpr() throws RecognitionException {
        LogoParser.boolExpr_return retval = new LogoParser.boolExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set7=null;
        LogoParser.sumExpr_return sumExpr6 = null;

        LogoParser.sumExpr_return sumExpr8 = null;


        Object set7_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:10: ( sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )? )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:12: sumExpr ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sumExpr_in_boolExpr455);
            sumExpr6=sumExpr();

            state._fsp--;

            adaptor.addChild(root_0, sumExpr6.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:20: ( ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=38 && LA2_0<=45)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:73:21: ( '>' | '<' | '=' | '<=' | '>=' | '!=' | '&' | '|' ) sumExpr
                    {
                    set7=(Token)input.LT(1);
                    set7=(Token)input.LT(1);
                    if ( (input.LA(1)>=38 && input.LA(1)<=45) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set7), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_sumExpr_in_boolExpr477);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:1: sumExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final LogoParser.sumExpr_return sumExpr() throws RecognitionException {
        LogoParser.sumExpr_return retval = new LogoParser.sumExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set10=null;
        LogoParser.multExpr_return multExpr9 = null;

        LogoParser.multExpr_return multExpr11 = null;


        Object set10_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:11: multExpr ( ( '+' | '-' ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_sumExpr487);
            multExpr9=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr9.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:20: ( ( '+' | '-' ) multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=46 && LA3_0<=47)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:74:21: ( '+' | '-' ) multExpr
            	    {
            	    set10=(Token)input.LT(1);
            	    set10=(Token)input.LT(1);
            	    if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set10), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_sumExpr497);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:1: multExpr : powExpr ( ( '*' | '/' | 'MOD' ) powExpr )* ;
    public final LogoParser.multExpr_return multExpr() throws RecognitionException {
        LogoParser.multExpr_return retval = new LogoParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;
        LogoParser.powExpr_return powExpr12 = null;

        LogoParser.powExpr_return powExpr14 = null;


        Object set13_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:10: ( powExpr ( ( '*' | '/' | 'MOD' ) powExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:12: powExpr ( ( '*' | '/' | 'MOD' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_multExpr507);
            powExpr12=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr12.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:20: ( ( '*' | '/' | 'MOD' ) powExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=48 && LA4_0<=50)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:75:21: ( '*' | '/' | 'MOD' ) powExpr
            	    {
            	    set13=(Token)input.LT(1);
            	    set13=(Token)input.LT(1);
            	    if ( (input.LA(1)>=48 && input.LA(1)<=50) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set13), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_multExpr519);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:1: powExpr : signedExpr ( ( '^' ) signedExpr )* ;
    public final LogoParser.powExpr_return powExpr() throws RecognitionException {
        LogoParser.powExpr_return retval = new LogoParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        LogoParser.signedExpr_return signedExpr15 = null;

        LogoParser.signedExpr_return signedExpr17 = null;


        Object char_literal16_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:9: ( signedExpr ( ( '^' ) signedExpr )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:11: signedExpr ( ( '^' ) signedExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_signedExpr_in_powExpr529);
            signedExpr15=signedExpr();

            state._fsp--;

            adaptor.addChild(root_0, signedExpr15.getTree());
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:22: ( ( '^' ) signedExpr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==51) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:23: ( '^' ) signedExpr
            	    {
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:23: ( '^' )
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:76:24: '^'
            	    {
            	    char_literal16=(Token)match(input,51,FOLLOW_51_in_powExpr533); 
            	    char_literal16_tree = (Object)adaptor.create(char_literal16);
            	    adaptor.addChild(root_0, char_literal16_tree);


            	    }

            	    pushFollow(FOLLOW_signedExpr_in_powExpr537);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:1: signedExpr : atom ;
    public final LogoParser.signedExpr_return signedExpr() throws RecognitionException {
        LogoParser.signedExpr_return retval = new LogoParser.signedExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoParser.atom_return atom18 = null;



        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:12: ( atom )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:78:14: atom
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_signedExpr548);
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:79:1: atom : ( ':' id= IDENTIFIER | LOOP | CAP | PI | INT | REAL | HASARD atom | '(' call ')' | '(' recursExpr ')' );
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
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        LogoParser.atom_return atom26 = null;

        LogoParser.call_return call28 = null;

        LogoParser.recursExpr_return recursExpr31 = null;


        Object id_tree=null;
        Object char_literal19_tree=null;
        Object LOOP20_tree=null;
        Object CAP21_tree=null;
        Object PI22_tree=null;
        Object INT23_tree=null;
        Object REAL24_tree=null;
        Object HASARD25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal32_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:79:5: ( ':' id= IDENTIFIER | LOOP | CAP | PI | INT | REAL | HASARD atom | '(' call ')' | '(' recursExpr ')' )
            int alt6=9;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:80:3: ':' id= IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal19=(Token)match(input,52,FOLLOW_52_in_atom557); 
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom564); 
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
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:90:5: LOOP
                    {
                    root_0 = (Object)adaptor.nil();

                    LOOP20=(Token)match(input,LOOP,FOLLOW_LOOP_in_atom575); 
                    LOOP20_tree = (Object)adaptor.create(LOOP20);
                    adaptor.addChild(root_0, LOOP20_tree);

                    try {context.getLoop();} catch(Exception e) { Log.appendnl("Parser l. " + LOOP20.getLine() + " : LOOP ne peut etre utilise que dans un REPETE"); }

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:91:5: CAP
                    {
                    root_0 = (Object)adaptor.nil();

                    CAP21=(Token)match(input,CAP,FOLLOW_CAP_in_atom583); 
                    CAP21_tree = (Object)adaptor.create(CAP21);
                    adaptor.addChild(root_0, CAP21_tree);


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:92:5: PI
                    {
                    root_0 = (Object)adaptor.nil();

                    PI22=(Token)match(input,PI,FOLLOW_PI_in_atom589); 
                    PI22_tree = (Object)adaptor.create(PI22);
                    adaptor.addChild(root_0, PI22_tree);


                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:93:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT23=(Token)match(input,INT,FOLLOW_INT_in_atom595); 
                    INT23_tree = (Object)adaptor.create(INT23);
                    adaptor.addChild(root_0, INT23_tree);


                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:94:5: REAL
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL24=(Token)match(input,REAL,FOLLOW_REAL_in_atom601); 
                    REAL24_tree = (Object)adaptor.create(REAL24);
                    adaptor.addChild(root_0, REAL24_tree);


                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:95:5: HASARD atom
                    {
                    root_0 = (Object)adaptor.nil();

                    HASARD25=(Token)match(input,HASARD,FOLLOW_HASARD_in_atom607); 
                    HASARD25_tree = (Object)adaptor.create(HASARD25);
                    root_0 = (Object)adaptor.becomeRoot(HASARD25_tree, root_0);

                    pushFollow(FOLLOW_atom_in_atom610);
                    atom26=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom26.getTree());

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:96:5: '(' call ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal27=(Token)match(input,53,FOLLOW_53_in_atom616); 
                    pushFollow(FOLLOW_call_in_atom619);
                    call28=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call28.getTree());
                    char_literal29=(Token)match(input,54,FOLLOW_54_in_atom621); 

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:97:5: '(' recursExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal30=(Token)match(input,53,FOLLOW_53_in_atom628); 
                    pushFollow(FOLLOW_recursExpr_in_atom631);
                    recursExpr31=recursExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, recursExpr31.getTree());
                    char_literal32=(Token)match(input,54,FOLLOW_54_in_atom633); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:102:1: deffonction : POUR name= IDENTIFIER ( ':' id= IDENTIFIER -> IDENTIFIER )* bloc FIN -> ^( POUR $name bloc ) ;
    public final LogoParser.deffonction_return deffonction() throws RecognitionException {
        LogoParser.deffonction_return retval = new LogoParser.deffonction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token id=null;
        Token POUR33=null;
        Token char_literal34=null;
        Token FIN36=null;
        LogoParser.bloc_return bloc35 = null;


        Object name_tree=null;
        Object id_tree=null;
        Object POUR33_tree=null;
        Object char_literal34_tree=null;
        Object FIN36_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_POUR=new RewriteRuleTokenStream(adaptor,"token POUR");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_FIN=new RewriteRuleTokenStream(adaptor,"token FIN");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");

            Vector<String> params = new Vector<String>();

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:107:1: ( POUR name= IDENTIFIER ( ':' id= IDENTIFIER -> IDENTIFIER )* bloc FIN -> ^( POUR $name bloc ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:108:3: POUR name= IDENTIFIER ( ':' id= IDENTIFIER -> IDENTIFIER )* bloc FIN
            {
            POUR33=(Token)match(input,POUR,FOLLOW_POUR_in_deffonction655);  
            stream_POUR.add(POUR33);

            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction659);  
            stream_IDENTIFIER.add(name);

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:108:24: ( ':' id= IDENTIFIER -> IDENTIFIER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==52) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:108:25: ':' id= IDENTIFIER
            	    {
            	    char_literal34=(Token)match(input,52,FOLLOW_52_in_deffonction662);  
            	    stream_52.add(char_literal34);

            	    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction666);  
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
            	    // 108:71: -> IDENTIFIER
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
              
            pushFollow(FOLLOW_bloc_in_deffonction677);
            bloc35=bloc();

            state._fsp--;

            stream_bloc.add(bloc35.getTree());
            context.removeScope(); context.exitFunctionScope();
            FIN36=(Token)match(input,FIN,FOLLOW_FIN_in_deffonction681);  
            stream_FIN.add(FIN36);



            // AST REWRITE
            // elements: POUR, bloc, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:3: -> ^( POUR $name bloc )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:119:6: ^( POUR $name bloc )
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:122:1: call : name= IDENTIFIER ( recursExpr )* -> ^( CALL $name ( recursExpr )* ) ;
    public final LogoParser.call_return call() throws RecognitionException {
        LogoParser.call_return retval = new LogoParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        LogoParser.recursExpr_return recursExpr37 = null;


        Object name_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_recursExpr=new RewriteRuleSubtreeStream(adaptor,"rule recursExpr");

            int count = 0; 
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:127:3: (name= IDENTIFIER ( recursExpr )* -> ^( CALL $name ( recursExpr )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:128:3: name= IDENTIFIER ( recursExpr )*
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_call720);  
            stream_IDENTIFIER.add(name);

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:128:19: ( recursExpr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=LOOP && LA8_0<=PI)||(LA8_0>=INT && LA8_0<=REAL)||(LA8_0>=52 && LA8_0<=53)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:128:20: recursExpr
            	    {
            	    pushFollow(FOLLOW_recursExpr_in_call723);
            	    recursExpr37=recursExpr();

            	    state._fsp--;

            	    stream_recursExpr.add(recursExpr37.getTree());
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
            // 141:3: -> ^( CALL $name ( recursExpr )* )
            {
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:141:6: ^( CALL $name ( recursExpr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:141:19: ( recursExpr )*
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:144:1: affectation : ( DONNE '\"' IDENTIFIER expr | LOCALE '\"' IDENTIFIER expr );
    public final LogoParser.affectation_return affectation() throws RecognitionException {
        LogoParser.affectation_return retval = new LogoParser.affectation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DONNE38=null;
        Token char_literal39=null;
        Token IDENTIFIER40=null;
        Token LOCALE42=null;
        Token char_literal43=null;
        Token IDENTIFIER44=null;
        LogoParser.expr_return expr41 = null;

        LogoParser.expr_return expr45 = null;


        Object DONNE38_tree=null;
        Object char_literal39_tree=null;
        Object IDENTIFIER40_tree=null;
        Object LOCALE42_tree=null;
        Object char_literal43_tree=null;
        Object IDENTIFIER44_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:144:13: ( DONNE '\"' IDENTIFIER expr | LOCALE '\"' IDENTIFIER expr )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:145:3: DONNE '\"' IDENTIFIER expr
                    {
                    root_0 = (Object)adaptor.nil();

                    DONNE38=(Token)match(input,DONNE,FOLLOW_DONNE_in_affectation760); 
                    DONNE38_tree = (Object)adaptor.create(DONNE38);
                    root_0 = (Object)adaptor.becomeRoot(DONNE38_tree, root_0);

                    char_literal39=(Token)match(input,55,FOLLOW_55_in_affectation763); 
                    IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_affectation766); 
                    IDENTIFIER40_tree = (Object)adaptor.create(IDENTIFIER40);
                    adaptor.addChild(root_0, IDENTIFIER40_tree);

                    pushFollow(FOLLOW_expr_in_affectation768);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr41.getTree());
                     context.set(IDENTIFIER40.getText(), 0); 

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:146:5: LOCALE '\"' IDENTIFIER expr
                    {
                    root_0 = (Object)adaptor.nil();

                    LOCALE42=(Token)match(input,LOCALE,FOLLOW_LOCALE_in_affectation776); 
                    LOCALE42_tree = (Object)adaptor.create(LOCALE42);
                    root_0 = (Object)adaptor.becomeRoot(LOCALE42_tree, root_0);

                    char_literal43=(Token)match(input,55,FOLLOW_55_in_affectation779); 
                    IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_affectation782); 
                    IDENTIFIER44_tree = (Object)adaptor.create(IDENTIFIER44);
                    adaptor.addChild(root_0, IDENTIFIER44_tree);

                    pushFollow(FOLLOW_expr_in_affectation784);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());

                          try{ context.setLocal(IDENTIFIER44.getText(), 0);}
                          catch ( Exception e ) 
                          {
                    	      Log.appendnl("Parser l. " + IDENTIFIER44.getLine() + " : variable locale " + IDENTIFIER44.getText() + " ne peut porter ce nom (existe comme argument de la fonction)");
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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:157:1: repete : ( REPETE expr '[' bloc ']' ) ;
    public final LogoParser.repete_return repete() throws RecognitionException {
        LogoParser.repete_return retval = new LogoParser.repete_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REPETE46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        LogoParser.expr_return expr47 = null;

        LogoParser.bloc_return bloc49 = null;


        Object REPETE46_tree=null;
        Object char_literal48_tree=null;
        Object char_literal50_tree=null;

        context.incLoop();
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:157:34: ( ( REPETE expr '[' bloc ']' ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:158:3: ( REPETE expr '[' bloc ']' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:158:3: ( REPETE expr '[' bloc ']' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:158:4: REPETE expr '[' bloc ']'
            {
            REPETE46=(Token)match(input,REPETE,FOLLOW_REPETE_in_repete808); 
            REPETE46_tree = (Object)adaptor.create(REPETE46);
            root_0 = (Object)adaptor.becomeRoot(REPETE46_tree, root_0);

            pushFollow(FOLLOW_expr_in_repete811);
            expr47=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr47.getTree());
            char_literal48=(Token)match(input,56,FOLLOW_56_in_repete813); 
            pushFollow(FOLLOW_bloc_in_repete816);
            bloc49=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc49.getTree());
            char_literal50=(Token)match(input,57,FOLLOW_57_in_repete818); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:161:1: tantque : ( TANTQUE expr '[' bloc ']' ) ;
    public final LogoParser.tantque_return tantque() throws RecognitionException {
        LogoParser.tantque_return retval = new LogoParser.tantque_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TANTQUE51=null;
        Token char_literal53=null;
        Token char_literal55=null;
        LogoParser.expr_return expr52 = null;

        LogoParser.bloc_return bloc54 = null;


        Object TANTQUE51_tree=null;
        Object char_literal53_tree=null;
        Object char_literal55_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:161:9: ( ( TANTQUE expr '[' bloc ']' ) )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:162:3: ( TANTQUE expr '[' bloc ']' )
            {
            root_0 = (Object)adaptor.nil();

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:162:3: ( TANTQUE expr '[' bloc ']' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:162:4: TANTQUE expr '[' bloc ']'
            {
            TANTQUE51=(Token)match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque833); 
            TANTQUE51_tree = (Object)adaptor.create(TANTQUE51);
            root_0 = (Object)adaptor.becomeRoot(TANTQUE51_tree, root_0);

            pushFollow(FOLLOW_expr_in_tantque836);
            expr52=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr52.getTree());
            char_literal53=(Token)match(input,56,FOLLOW_56_in_tantque838); 
            pushFollow(FOLLOW_bloc_in_tantque841);
            bloc54=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc54.getTree());
            char_literal55=(Token)match(input,57,FOLLOW_57_in_tantque843); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:165:1: si : SI expr '[' bloc ']' ( '[' bloc ']' )? ;
    public final LogoParser.si_return si() throws RecognitionException {
        LogoParser.si_return retval = new LogoParser.si_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SI56=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        LogoParser.expr_return expr57 = null;

        LogoParser.bloc_return bloc59 = null;

        LogoParser.bloc_return bloc62 = null;


        Object SI56_tree=null;
        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:165:4: ( SI expr '[' bloc ']' ( '[' bloc ']' )? )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:166:3: SI expr '[' bloc ']' ( '[' bloc ']' )?
            {
            root_0 = (Object)adaptor.nil();

            SI56=(Token)match(input,SI,FOLLOW_SI_in_si857); 
            SI56_tree = (Object)adaptor.create(SI56);
            root_0 = (Object)adaptor.becomeRoot(SI56_tree, root_0);

            pushFollow(FOLLOW_expr_in_si860);
            expr57=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr57.getTree());
            char_literal58=(Token)match(input,56,FOLLOW_56_in_si862); 
            pushFollow(FOLLOW_bloc_in_si865);
            bloc59=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc59.getTree());
            char_literal60=(Token)match(input,57,FOLLOW_57_in_si867); 
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:166:27: ( '[' bloc ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:166:28: '[' bloc ']'
                    {
                    char_literal61=(Token)match(input,56,FOLLOW_56_in_si871); 
                    pushFollow(FOLLOW_bloc_in_si874);
                    bloc62=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc62.getTree());
                    char_literal63=(Token)match(input,57,FOLLOW_57_in_si876); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:169:1: rends : RENDS expr ;
    public final LogoParser.rends_return rends() throws RecognitionException {
        LogoParser.rends_return retval = new LogoParser.rends_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RENDS64=null;
        LogoParser.expr_return expr65 = null;


        Object RENDS64_tree=null;

        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:169:7: ( RENDS expr )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:170:3: RENDS expr
            {
            root_0 = (Object)adaptor.nil();

            RENDS64=(Token)match(input,RENDS,FOLLOW_RENDS_in_rends891); 
            RENDS64_tree = (Object)adaptor.create(RENDS64);
            root_0 = (Object)adaptor.becomeRoot(RENDS64_tree, root_0);

            pushFollow(FOLLOW_expr_in_rends894);
            expr65=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr65.getTree());

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
    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:173:1: instruction : ( affectation | repete | si | tantque | deffonction | call | rends | ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr | ( FPOS '[' expr expr ']' ) | ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) ) | ( VE | BC | LC ) );
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AV73=null;
        Token TD74=null;
        Token TG75=null;
        Token REC76=null;
        Token FCAP77=null;
        Token FCC78=null;
        Token PAUSE79=null;
        Token FPOS81=null;
        Token char_literal82=null;
        Token char_literal85=null;
        Token FCC86=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token VE89=null;
        Token BC90=null;
        Token LC91=null;
        LogoParser.expr_return a = null;

        LogoParser.expr_return b = null;

        LogoParser.expr_return c = null;

        LogoParser.affectation_return affectation66 = null;

        LogoParser.repete_return repete67 = null;

        LogoParser.si_return si68 = null;

        LogoParser.tantque_return tantque69 = null;

        LogoParser.deffonction_return deffonction70 = null;

        LogoParser.call_return call71 = null;

        LogoParser.rends_return rends72 = null;

        LogoParser.expr_return expr80 = null;

        LogoParser.expr_return expr83 = null;

        LogoParser.expr_return expr84 = null;


        Object AV73_tree=null;
        Object TD74_tree=null;
        Object TG75_tree=null;
        Object REC76_tree=null;
        Object FCAP77_tree=null;
        Object FCC78_tree=null;
        Object PAUSE79_tree=null;
        Object FPOS81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal85_tree=null;
        Object FCC86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;
        Object VE89_tree=null;
        Object BC90_tree=null;
        Object LC91_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_FCC=new RewriteRuleTokenStream(adaptor,"token FCC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:173:13: ( affectation | repete | si | tantque | deffonction | call | rends | ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr | ( FPOS '[' expr expr ']' ) | ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) ) | ( VE | BC | LC ) )
            int alt13=11;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:3: affectation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_instruction905);
                    affectation66=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation66.getTree());

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:17: repete
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_repete_in_instruction909);
                    repete67=repete();

                    state._fsp--;

                    adaptor.addChild(root_0, repete67.getTree());

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:26: si
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_si_in_instruction913);
                    si68=si();

                    state._fsp--;

                    adaptor.addChild(root_0, si68.getTree());

                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:31: tantque
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tantque_in_instruction917);
                    tantque69=tantque();

                    state._fsp--;

                    adaptor.addChild(root_0, tantque69.getTree());

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:41: deffonction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_deffonction_in_instruction921);
                    deffonction70=deffonction();

                    state._fsp--;

                    adaptor.addChild(root_0, deffonction70.getTree());

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:55: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_instruction925);
                    call71=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call71.getTree());

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:174:62: rends
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rends_in_instruction929);
                    rends72=rends();

                    state._fsp--;

                    adaptor.addChild(root_0, rends72.getTree());

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:3: ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:3: ( AV | TD | TG | REC | FCAP | FCC | PAUSE )
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
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:5: AV
                            {
                            AV73=(Token)match(input,AV,FOLLOW_AV_in_instruction940); 
                            AV73_tree = (Object)adaptor.create(AV73);
                            root_0 = (Object)adaptor.becomeRoot(AV73_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:11: TD
                            {
                            TD74=(Token)match(input,TD,FOLLOW_TD_in_instruction945); 
                            TD74_tree = (Object)adaptor.create(TD74);
                            root_0 = (Object)adaptor.becomeRoot(TD74_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:17: TG
                            {
                            TG75=(Token)match(input,TG,FOLLOW_TG_in_instruction950); 
                            TG75_tree = (Object)adaptor.create(TG75);
                            root_0 = (Object)adaptor.becomeRoot(TG75_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:23: REC
                            {
                            REC76=(Token)match(input,REC,FOLLOW_REC_in_instruction955); 
                            REC76_tree = (Object)adaptor.create(REC76);
                            root_0 = (Object)adaptor.becomeRoot(REC76_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:29: FCAP
                            {
                            FCAP77=(Token)match(input,FCAP,FOLLOW_FCAP_in_instruction959); 
                            FCAP77_tree = (Object)adaptor.create(FCAP77);
                            root_0 = (Object)adaptor.becomeRoot(FCAP77_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:37: FCC
                            {
                            FCC78=(Token)match(input,FCC,FOLLOW_FCC_in_instruction964); 
                            FCC78_tree = (Object)adaptor.create(FCC78);
                            root_0 = (Object)adaptor.becomeRoot(FCC78_tree, root_0);


                            }
                            break;
                        case 7 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:176:44: PAUSE
                            {
                            PAUSE79=(Token)match(input,PAUSE,FOLLOW_PAUSE_in_instruction969); 
                            PAUSE79_tree = (Object)adaptor.create(PAUSE79);
                            root_0 = (Object)adaptor.becomeRoot(PAUSE79_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction973);
                    expr80=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr80.getTree());

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:3: ( FPOS '[' expr expr ']' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:3: ( FPOS '[' expr expr ']' )
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:178:5: FPOS '[' expr expr ']'
                    {
                    FPOS81=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction984); 
                    FPOS81_tree = (Object)adaptor.create(FPOS81);
                    root_0 = (Object)adaptor.becomeRoot(FPOS81_tree, root_0);

                    char_literal82=(Token)match(input,56,FOLLOW_56_in_instruction987); 
                    pushFollow(FOLLOW_expr_in_instruction990);
                    expr83=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr83.getTree());
                    pushFollow(FOLLOW_expr_in_instruction992);
                    expr84=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr84.getTree());
                    char_literal85=(Token)match(input,57,FOLLOW_57_in_instruction994); 

                    }


                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:3: ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) )
                    {
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:3: ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) )
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:4: FCC '[' a= expr b= expr c= expr ']'
                    {
                    FCC86=(Token)match(input,FCC,FOLLOW_FCC_in_instruction1006);  
                    stream_FCC.add(FCC86);

                    char_literal87=(Token)match(input,56,FOLLOW_56_in_instruction1008);  
                    stream_56.add(char_literal87);

                    pushFollow(FOLLOW_expr_in_instruction1012);
                    a=expr();

                    state._fsp--;

                    stream_expr.add(a.getTree());
                    pushFollow(FOLLOW_expr_in_instruction1016);
                    b=expr();

                    state._fsp--;

                    stream_expr.add(b.getTree());
                    pushFollow(FOLLOW_expr_in_instruction1020);
                    c=expr();

                    state._fsp--;

                    stream_expr.add(c.getTree());
                    char_literal88=(Token)match(input,57,FOLLOW_57_in_instruction1022);  
                    stream_57.add(char_literal88);



                    // AST REWRITE
                    // elements: a, c, b
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
                    // 180:37: -> ^( FCC_RGB $a $b $c)
                    {
                        // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:180:40: ^( FCC_RGB $a $b $c)
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
                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:3: ( VE | BC | LC )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:3: ( VE | BC | LC )
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
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:4: VE
                            {
                            VE89=(Token)match(input,VE,FOLLOW_VE_in_instruction1047); 
                            VE89_tree = (Object)adaptor.create(VE89);
                            root_0 = (Object)adaptor.becomeRoot(VE89_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:10: BC
                            {
                            BC90=(Token)match(input,BC,FOLLOW_BC_in_instruction1052); 
                            BC90_tree = (Object)adaptor.create(BC90);
                            root_0 = (Object)adaptor.becomeRoot(BC90_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:182:16: LC
                            {
                            LC91=(Token)match(input,LC,FOLLOW_LC_in_instruction1057); 
                            LC91_tree = (Object)adaptor.create(LC91);
                            root_0 = (Object)adaptor.becomeRoot(LC91_tree, root_0);


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
        "\13\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\35\7\uffff\1\35\2\uffff";
    static final String DFA6_maxS =
        "\1\65\7\uffff\1\65\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\7\1\3\1\4\2\uffff\1\5\1\6\17\uffff\1\1\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\12\1\uffff\1\11\2\12\17\uffff\2\12",
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
            return "79:1: atom : ( ':' id= IDENTIFIER | LOOP | CAP | PI | INT | REAL | HASARD atom | '(' call ')' | '(' recursExpr ')' );";
        }
    }
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\1\13\10\uffff\1\35\3\uffff";
    static final String DFA13_maxS =
        "\1\42\10\uffff\1\70\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\13\1\12";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
            "\4\10\3\13\1\12\1\10\1\11\2\1\1\2\1\3\1\4\1\5\1\uffff\1\7\4"+
            "\uffff\1\10\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\10\2\uffff\2\10\17\uffff\2\10\2\uffff\1\14",
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
            return "173:1: instruction : ( affectation | repete | si | tantque | deffonction | call | rends | ( AV | TD | TG | REC | FCAP | FCC | PAUSE ) expr | ( FPOS '[' expr expr ']' ) | ( FCC '[' a= expr b= expr c= expr ']' -> ^( FCC_RGB $a $b $c) ) | ( VE | BC | LC ) );";
        }
    }
 

    public static final BitSet FOLLOW_liste_instructions_in_programme388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_liste_instructions_in_bloc412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions428 = new BitSet(new long[]{0x0000000617FFF802L});
    public static final BitSet FOLLOW_recursExpr_in_expr440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpr_in_recursExpr447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr455 = new BitSet(new long[]{0x00003FC000000002L});
    public static final BitSet FOLLOW_set_in_boolExpr458 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_sumExpr_in_boolExpr477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr487 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_set_in_sumExpr490 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr497 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_powExpr_in_multExpr507 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_set_in_multExpr510 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_powExpr_in_multExpr519 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_signedExpr_in_powExpr529 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_powExpr533 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_signedExpr_in_powExpr537 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_atom_in_signedExpr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_atom557 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_atom575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAP_in_atom583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PI_in_atom589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASARD_in_atom607 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_atom_in_atom610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom616 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_call_in_atom619 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_atom621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom628 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_recursExpr_in_atom631 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_atom633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUR_in_deffonction655 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction659 = new BitSet(new long[]{0x0010000617FFF800L});
    public static final BitSet FOLLOW_52_in_deffonction662 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction666 = new BitSet(new long[]{0x0010000617FFF800L});
    public static final BitSet FOLLOW_bloc_in_deffonction677 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIN_in_deffonction681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_call720 = new BitSet(new long[]{0x00300019E0000002L});
    public static final BitSet FOLLOW_recursExpr_in_call723 = new BitSet(new long[]{0x00300019E0000002L});
    public static final BitSet FOLLOW_DONNE_in_affectation760 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_affectation763 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_affectation766 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_affectation768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALE_in_affectation776 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_affectation779 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_affectation782 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_affectation784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete808 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_repete811 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_repete813 = new BitSet(new long[]{0x0010000617FFF800L});
    public static final BitSet FOLLOW_bloc_in_repete816 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_repete818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque833 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_tantque836 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_tantque838 = new BitSet(new long[]{0x0010000617FFF800L});
    public static final BitSet FOLLOW_bloc_in_tantque841 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_tantque843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SI_in_si857 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_si860 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_si862 = new BitSet(new long[]{0x0010000617FFF800L});
    public static final BitSet FOLLOW_bloc_in_si865 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_si867 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_si871 = new BitSet(new long[]{0x0010000617FFF800L});
    public static final BitSet FOLLOW_bloc_in_si874 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_si876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RENDS_in_rends891 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_rends894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repete_in_instruction909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffonction_in_instruction921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instruction925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rends_in_instruction929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction940 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_TD_in_instruction945 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_TG_in_instruction950 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_REC_in_instruction955 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_FCAP_in_instruction959 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_FCC_in_instruction964 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_PAUSE_in_instruction969 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_instruction973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction984 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_instruction987 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_instruction990 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_instruction992 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_instruction994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCC_in_instruction1006 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_instruction1008 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1012 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1016 = new BitSet(new long[]{0x00300019E0000000L});
    public static final BitSet FOLLOW_expr_in_instruction1020 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_instruction1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction1057 = new BitSet(new long[]{0x0000000000000002L});

}