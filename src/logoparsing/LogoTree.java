// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g 2012-05-18 22:49:13

  package logoparsing;
  import java.util.Random;
  import utilities.Context;
  import logogui.Traceur;
  import logogui.Log;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoTree extends TreeParser {
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


        public LogoTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LogoTree.tokenNames; }
    public String getGrammarFileName() { return "/home/scawf/workspace/nf11/src/logoparsing/LogoTree.g"; }


      Traceur traceur;
      Context context;
      Random generator;
        
      public void initialize(java.awt.Graphics g, Context c) 
      {
        generator = new Random();
        context = c;
        traceur = Traceur.getInstance();
        traceur.setGraphics(g);
      }
      public void push(int index) {
         ((CommonTreeNodeStream)input).push(index);
      }
      public void pop() {
         ((CommonTreeNodeStream)input).pop();
      }
      public void rewind(int index) { 
        ((CommonTreeNodeStream)input).rewind(index); 
      }



    // $ANTLR start "prog"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:1: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:6: ( ^( PROGRAMME ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:8: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog42); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:20: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==CALL||(LA1_0>=FCC_RGB && LA1_0<=POUR)||LA1_0==RENDS||LA1_0==PAUSE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:21: instruction
                	    {
                	    pushFollow(FOLLOW_instruction_in_prog45);
                	    instruction();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "bloc"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:1: bloc : ^( SCOPE ( instruction )* ) ;
    public final void bloc() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:6: ( ^( SCOPE ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:8: ^( SCOPE ( instruction )* )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_bloc57); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:16: ( instruction )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==CALL||(LA2_0>=FCC_RGB && LA2_0<=POUR)||LA2_0==RENDS||LA2_0==PAUSE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:17: instruction
                	    {
                	    pushFollow(FOLLOW_instruction_in_bloc60);
                	    instruction();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "bloc"


    // $ANTLR start "expr"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:1: expr returns [double v] : ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( 'MOD' x= expr y= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | ^( HASARD x= expr ) | PI | INT | REAL | CAP | id= IDENTIFIER | LOOP | call );
    public final double expr() throws RecognitionException {
        double v = 0.0;

        CommonTree id=null;
        CommonTree INT1=null;
        CommonTree REAL2=null;
        double x = 0.0;

        double y = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:25: ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( 'MOD' x= expr y= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | ^( HASARD x= expr ) | PI | INT | REAL | CAP | id= IDENTIFIER | LOOP | call )
            int alt3=23;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case 47:
                {
                alt3=2;
                }
                break;
            case U_MOINS:
                {
                alt3=3;
                }
                break;
            case 50:
                {
                alt3=4;
                }
                break;
            case 48:
                {
                alt3=5;
                }
                break;
            case 49:
                {
                alt3=6;
                }
                break;
            case 51:
                {
                alt3=7;
                }
                break;
            case 39:
                {
                alt3=8;
                }
                break;
            case 41:
                {
                alt3=9;
                }
                break;
            case 38:
                {
                alt3=10;
                }
                break;
            case 42:
                {
                alt3=11;
                }
                break;
            case 40:
                {
                alt3=12;
                }
                break;
            case 43:
                {
                alt3=13;
                }
                break;
            case 45:
                {
                alt3=14;
                }
                break;
            case 44:
                {
                alt3=15;
                }
                break;
            case HASARD:
                {
                alt3=16;
                }
                break;
            case PI:
                {
                alt3=17;
                }
                break;
            case INT:
                {
                alt3=18;
                }
                break;
            case REAL:
                {
                alt3=19;
                }
                break;
            case CAP:
                {
                alt3=20;
                }
                break;
            case IDENTIFIER:
                {
                alt3=21;
                }
                break;
            case LOOP:
                {
                alt3=22;
                }
                break;
            case CALL:
                {
                alt3=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:41:1: ^( '+' x= expr y= expr )
                    {
                    match(input,46,FOLLOW_46_in_expr76); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr80);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr84);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x + y;

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:42:3: ^( '-' x= expr y= expr )
                    {
                    match(input,47,FOLLOW_47_in_expr92); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr96);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr100);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x - y;

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:43:3: ^( U_MOINS x= expr )
                    {
                    match(input,U_MOINS,FOLLOW_U_MOINS_in_expr108); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr112);
                    x=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = - x;

                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:44:3: ^( 'MOD' x= expr y= expr )
                    {
                    match(input,50,FOLLOW_50_in_expr120); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr124);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr128);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (int)x % (int)y; 

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:45:3: ^( '*' x= expr y= expr )
                    {
                    match(input,48,FOLLOW_48_in_expr136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr140);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr144);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x * y;

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:46:3: ^( '/' x= expr y= expr )
                    {
                    match(input,49,FOLLOW_49_in_expr152); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr156);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr160);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x / y;

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:47:3: ^( '^' x= expr y= expr )
                    {
                    match(input,51,FOLLOW_51_in_expr168); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr172);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr176);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.exp(y * Math.log(x));

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:48:3: ^( '<' x= expr y= expr )
                    {
                    match(input,39,FOLLOW_39_in_expr184); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr188);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr192);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x < y) ? 1 : 0;

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:49:3: ^( '<=' x= expr y= expr )
                    {
                    match(input,41,FOLLOW_41_in_expr200); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr204);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr208);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x <= y) ? 1 : 0;

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:50:3: ^( '>' x= expr y= expr )
                    {
                    match(input,38,FOLLOW_38_in_expr216); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr220);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr224);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x > y) ? 1 : 0;

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:51:3: ^( '>=' x= expr y= expr )
                    {
                    match(input,42,FOLLOW_42_in_expr232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr236);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr240);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x >= y) ? 1 : 0;

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:52:3: ^( '=' x= expr y= expr )
                    {
                    match(input,40,FOLLOW_40_in_expr248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr252);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr256);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x == y) ? 1 : 0;

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:53:3: ^( '!=' x= expr y= expr )
                    {
                    match(input,43,FOLLOW_43_in_expr264); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr268);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr272);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != y) ? 1 : 0;

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:54:3: ^( '|' x= expr y= expr )
                    {
                    match(input,45,FOLLOW_45_in_expr280); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr284);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr288);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != 0 || y != 0) ? 1 : 0;

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:55:3: ^( '&' x= expr y= expr )
                    {
                    match(input,44,FOLLOW_44_in_expr296); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr300);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr304);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x !=0 && y != 0) ? 1 : 0;

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:56:3: ^( HASARD x= expr )
                    {
                    match(input,HASARD,FOLLOW_HASARD_in_expr312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr316);
                    x=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = generator.nextInt((int)x);

                    }
                    break;
                case 17 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:57:3: PI
                    {
                    match(input,PI,FOLLOW_PI_in_expr324); 
                    v = new Double(3.14957);

                    }
                    break;
                case 18 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:58:3: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr330); 
                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 19 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:59:3: REAL
                    {
                    REAL2=(CommonTree)match(input,REAL,FOLLOW_REAL_in_expr336); 
                    v = Double.parseDouble((REAL2!=null?REAL2.getText():null));

                    }
                    break;
                case 20 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:60:3: CAP
                    {
                    match(input,CAP,FOLLOW_CAP_in_expr342); 
                    v = traceur.getTeta();

                    }
                    break;
                case 21 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:61:3: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr352); 

                    	  try {
                    	    v = context.get(id.getText()); 
                    	   }
                    	   catch ( Exception e ) {
                    	      Log.appendnl("TreeParser l. " + id.getLine() + " : variable " + id.getText() + " non-definie");
                    	   }
                       

                    }
                    break;
                case 22 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:69:3: LOOP
                    {
                    match(input,LOOP,FOLLOW_LOOP_in_expr358); 
                     
                    	  try { 
                    	    v = context.getLoop();
                    	  } 
                    	  catch ( Exception e ) {
                    	    Log.appendnl("TreeParser : LOOP inutilisable ici");
                    	  } 
                      

                    }
                    break;
                case 23 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:77:3: call
                    {
                    pushFollow(FOLLOW_call_in_expr364);
                    call();

                    state._fsp--;

                    v = context.getReturnValue();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return v;
    }
    // $ANTLR end "expr"


    // $ANTLR start "repete"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:81:1: repete : ^( REPETE n= expr . ) ;
    public final void repete() throws RecognitionException {
        double n = 0.0;



            int mark_list = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:86:3: ( ^( REPETE n= expr . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:86:5: ^( REPETE n= expr . )
            {
            match(input,REPETE,FOLLOW_REPETE_in_repete390); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repete396);
            n=expr();

            state._fsp--;

            mark_list = input.mark();
            matchAny(input); 

            match(input, Token.UP, null); 

                context.newScope();
                for (int i = 0; i < n ; i++) 
                {
                  Log.appendnl("TreeParser : repete iteration " + i);
                  context.incLoop();
                  push(mark_list);
                  bloc();
                  pop();
                }
                context.removeScope();
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "repete"


    // $ANTLR start "tantque"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:102:1: tantque : ^( TANTQUE . . ) ;
    public final void tantque() throws RecognitionException {

            int cond = 0, bloc = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:107:3: ( ^( TANTQUE . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:107:5: ^( TANTQUE . . )
            {
            match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque430); 

            cond = input.mark();

            match(input, Token.DOWN, null); 
            matchAny(input); 
            bloc = input.mark();
            matchAny(input); 

            match(input, Token.UP, null); 

                boolean x = true;
                while ( x ) 
                {
                  push(cond+1);
                  x = expr() != 0;
                  pop();
                
                  if ( x ) 
                  {
            	      push(bloc);
            	      bloc();
            	      pop();
                  }
                }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tantque"


    // $ANTLR start "si"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:127:1: si : ^( SI n= expr . (els= . )? ) ;
    public final void si() throws RecognitionException {
        CommonTree els=null;
        double n = 0.0;



            int bif = 0, belse = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:132:3: ( ^( SI n= expr . (els= . )? ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:133:3: ^( SI n= expr . (els= . )? )
            {
            match(input,SI,FOLLOW_SI_in_si471); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_si475);
            n=expr();

            state._fsp--;

            bif = input.mark();
            matchAny(input); 
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:133:39: (els= . )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=PROGRAMME && LA4_0<=57)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:133:40: els= .
                    {
                    belse = input.mark();
                    els=(CommonTree)input.LT(1);
                    matchAny(input); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

                if ( n != 0 ) { push(bif); bloc(); pop(); }
                else if (els != null) { push(belse); bloc(); pop(); }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "si"


    // $ANTLR start "deffonction"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:141:1: deffonction : ^( POUR name= IDENTIFIER a= . ) ;
    public final void deffonction() throws RecognitionException {
        CommonTree name=null;
        CommonTree a=null;


            int mark_a = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:146:3: ( ^( POUR name= IDENTIFIER a= . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:146:5: ^( POUR name= IDENTIFIER a= . )
            {
            match(input,POUR,FOLLOW_POUR_in_deffonction517); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction521); 
            mark_a = input.mark();
            a=(CommonTree)input.LT(1);
            matchAny(input); 

            match(input, Token.UP, null); 

                  context.setFunctionMark(name.getText(),mark_a);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "deffonction"


    // $ANTLR start "call"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:152:1: call : ^( CALL name= IDENTIFIER (e= expr )* ) ;
    public final void call() throws RecognitionException {
        CommonTree name=null;
        double e = 0.0;



            Stack<Double> values = new Stack<Double>();
            int mark_fin = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:3: ( ^( CALL name= IDENTIFIER (e= expr )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:5: ^( CALL name= IDENTIFIER (e= expr )* )
            {
            match(input,CALL,FOLLOW_CALL_in_call555); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_call559); 
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:28: (e= expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CALL||LA5_0==U_MOINS||(LA5_0>=LOOP && LA5_0<=PI)||(LA5_0>=IDENTIFIER && LA5_0<=REAL)||(LA5_0>=38 && LA5_0<=51)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:29: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_call564);
            	    e=expr();

            	    state._fsp--;

            	    values.add(new Double(e));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mark_fin = input.mark();

            match(input, Token.UP, null); 

                context.call(this,mark_fin,name.getText(),values);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "call"


    // $ANTLR start "rends"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:164:1: rends : ^( RENDS e= expr ) ;
    public final void rends() throws RecognitionException {
        double e = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:164:7: ( ^( RENDS e= expr ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:164:9: ^( RENDS e= expr )
            {
            match(input,RENDS,FOLLOW_RENDS_in_rends584); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_rends588);
            e=expr();

            state._fsp--;


            match(input, Token.UP, null); 
             context.returnValue(this,e); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rends"


    // $ANTLR start "instruction"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:166:1: instruction : ( repete | tantque | si | deffonction | call | rends | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( PAUSE a= expr ) | ^( FCC a= expr ) | ^( FCC_RGB a= expr b= expr c= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE );
    public final void instruction() throws RecognitionException {
        CommonTree i=null;
        double a = 0.0;

        double b = 0.0;

        double c = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:166:13: ( repete | tantque | si | deffonction | call | rends | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( PAUSE a= expr ) | ^( FCC a= expr ) | ^( FCC_RGB a= expr b= expr c= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE )
            int alt6=20;
            switch ( input.LA(1) ) {
            case REPETE:
                {
                alt6=1;
                }
                break;
            case TANTQUE:
                {
                alt6=2;
                }
                break;
            case SI:
                {
                alt6=3;
                }
                break;
            case POUR:
                {
                alt6=4;
                }
                break;
            case CALL:
                {
                alt6=5;
                }
                break;
            case RENDS:
                {
                alt6=6;
                }
                break;
            case DONNE:
                {
                alt6=7;
                }
                break;
            case LOCALE:
                {
                alt6=8;
                }
                break;
            case AV:
                {
                alt6=9;
                }
                break;
            case TD:
                {
                alt6=10;
                }
                break;
            case TG:
                {
                alt6=11;
                }
                break;
            case REC:
                {
                alt6=12;
                }
                break;
            case FCAP:
                {
                alt6=13;
                }
                break;
            case PAUSE:
                {
                alt6=14;
                }
                break;
            case FCC:
                {
                alt6=15;
                }
                break;
            case FCC_RGB:
                {
                alt6=16;
                }
                break;
            case FPOS:
                {
                alt6=17;
                }
                break;
            case BC:
                {
                alt6=18;
                }
                break;
            case LC:
                {
                alt6=19;
                }
                break;
            case VE:
                {
                alt6=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:167:2: repete
                    {
                    pushFollow(FOLLOW_repete_in_instruction600);
                    repete();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:168:4: tantque
                    {
                    pushFollow(FOLLOW_tantque_in_instruction606);
                    tantque();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:169:4: si
                    {
                    pushFollow(FOLLOW_si_in_instruction611);
                    si();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:170:4: deffonction
                    {
                    pushFollow(FOLLOW_deffonction_in_instruction616);
                    deffonction();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:171:4: call
                    {
                    pushFollow(FOLLOW_call_in_instruction621);
                    call();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:172:4: rends
                    {
                    pushFollow(FOLLOW_rends_in_instruction626);
                    rends();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:173:4: ^( DONNE i= IDENTIFIER a= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction632); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction638); 
                    pushFollow(FOLLOW_expr_in_instruction644);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.set(i.getText(), a);

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:174:4: ^( LOCALE i= IDENTIFIER a= expr )
                    {
                    match(input,LOCALE,FOLLOW_LOCALE_in_instruction653); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction659); 
                    pushFollow(FOLLOW_expr_in_instruction665);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     try { context.setLocal(i.getText(), a); } catch ( Exception e ) {} 

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:175:4: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction674); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction680);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(a);

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:176:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction689); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction695);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.td(a);

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:177:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction710);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.tg(a);

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:178:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction719); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction725);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(-a);

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:179:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction734); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction740);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setTeta(a);

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:180:4: ^( PAUSE a= expr )
                    {
                    match(input,PAUSE,FOLLOW_PAUSE_in_instruction749); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction755);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    try{Thread.currentThread().sleep((long)a);}catch(InterruptedException ie){}

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:181:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction764); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction770);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a);

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:182:4: ^( FCC_RGB a= expr b= expr c= expr )
                    {
                    match(input,FCC_RGB,FOLLOW_FCC_RGB_in_instruction779); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction785);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction791);
                    b=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction797);
                    c=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a,b,c);

                    }
                    break;
                case 17 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:183:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction806); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction812);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction818);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     traceur.setPos(a,b); 

                    }
                    break;
                case 18 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:184:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction826); 
                    traceur.setTrace(true);

                    }
                    break;
                case 19 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:185:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction833); 
                    traceur.setTrace(false);

                    }
                    break;
                case 20 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:186:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction840); 
                    traceur.clean();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "instruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMME_in_prog42 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x0000000217FFFC28L});
    public static final BitSet FOLLOW_SCOPE_in_bloc57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_bloc60 = new BitSet(new long[]{0x0000000217FFFC28L});
    public static final BitSet FOLLOW_46_in_expr76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expr92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_U_MOINS_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expr120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expr136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr140 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expr152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expr168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expr184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expr200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr204 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_expr216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr220 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_42_in_expr232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr236 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expr248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr252 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expr280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expr296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HASARD_in_expr312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PI_in_expr324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_expr336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAP_in_expr342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_expr358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repete396 = new BitSet(new long[]{0x03FFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SI_in_si471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_si475 = new BitSet(new long[]{0x03FFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_POUR_in_deffonction517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction521 = new BitSet(new long[]{0x03FFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_CALL_in_call555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_call559 = new BitSet(new long[]{0x000FFFDDE0000228L});
    public static final BitSet FOLLOW_expr_in_call564 = new BitSet(new long[]{0x000FFFDDE0000228L});
    public static final BitSet FOLLOW_RENDS_in_rends584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_rends588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_repete_in_instruction600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffonction_in_instruction616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instruction621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rends_in_instruction626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_instruction632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction638 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCALE_in_instruction653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction659 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_in_instruction749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_in_instruction764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_RGB_in_instruction779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction785 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction791 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction812 = new BitSet(new long[]{0x000FFFDDE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BC_in_instruction826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction840 = new BitSet(new long[]{0x0000000000000002L});

}