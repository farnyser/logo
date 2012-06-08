// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g 2012-06-05 15:06:18

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:1: expr returns [double v] : ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( COS x= expr ) | ^( SIN x= expr ) | ^( 'MOD' x= expr y= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | ^( HASARD x= expr ) | PI | INT | REAL | CAP | id= IDENTIFIER | LOOP | call );
    public final double expr() throws RecognitionException {
        double v = 0.0;

        CommonTree id=null;
        CommonTree INT1=null;
        CommonTree REAL2=null;
        double x = 0.0;

        double y = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:25: ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( COS x= expr ) | ^( SIN x= expr ) | ^( 'MOD' x= expr y= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | ^( HASARD x= expr ) | PI | INT | REAL | CAP | id= IDENTIFIER | LOOP | call )
            int alt3=25;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt3=1;
                }
                break;
            case 49:
                {
                alt3=2;
                }
                break;
            case U_MOINS:
                {
                alt3=3;
                }
                break;
            case COS:
                {
                alt3=4;
                }
                break;
            case SIN:
                {
                alt3=5;
                }
                break;
            case 52:
                {
                alt3=6;
                }
                break;
            case 50:
                {
                alt3=7;
                }
                break;
            case 51:
                {
                alt3=8;
                }
                break;
            case 53:
                {
                alt3=9;
                }
                break;
            case 41:
                {
                alt3=10;
                }
                break;
            case 43:
                {
                alt3=11;
                }
                break;
            case 40:
                {
                alt3=12;
                }
                break;
            case 44:
                {
                alt3=13;
                }
                break;
            case 42:
                {
                alt3=14;
                }
                break;
            case 45:
                {
                alt3=15;
                }
                break;
            case 47:
                {
                alt3=16;
                }
                break;
            case 46:
                {
                alt3=17;
                }
                break;
            case HASARD:
                {
                alt3=18;
                }
                break;
            case PI:
                {
                alt3=19;
                }
                break;
            case INT:
                {
                alt3=20;
                }
                break;
            case REAL:
                {
                alt3=21;
                }
                break;
            case CAP:
                {
                alt3=22;
                }
                break;
            case IDENTIFIER:
                {
                alt3=23;
                }
                break;
            case LOOP:
                {
                alt3=24;
                }
                break;
            case CALL:
                {
                alt3=25;
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
                    match(input,48,FOLLOW_48_in_expr76); 

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
                    match(input,49,FOLLOW_49_in_expr92); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:44:3: ^( COS x= expr )
                    {
                    match(input,COS,FOLLOW_COS_in_expr120); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr124);
                    x=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.cos(x/360*2*3.14957);

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:45:3: ^( SIN x= expr )
                    {
                    match(input,SIN,FOLLOW_SIN_in_expr132); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr136);
                    x=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.sin(x/360*2*3.14957);

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:46:3: ^( 'MOD' x= expr y= expr )
                    {
                    match(input,52,FOLLOW_52_in_expr144); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr148);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr152);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (int)x % (int)y; 

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:47:3: ^( '*' x= expr y= expr )
                    {
                    match(input,50,FOLLOW_50_in_expr160); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr164);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr168);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x * y;

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:48:3: ^( '/' x= expr y= expr )
                    {
                    match(input,51,FOLLOW_51_in_expr176); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr180);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr184);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x / y;

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:49:3: ^( '^' x= expr y= expr )
                    {
                    match(input,53,FOLLOW_53_in_expr192); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr196);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr200);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.exp(y * Math.log(x));

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:50:3: ^( '<' x= expr y= expr )
                    {
                    match(input,41,FOLLOW_41_in_expr208); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr212);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr216);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x < y) ? 1 : 0;

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:51:3: ^( '<=' x= expr y= expr )
                    {
                    match(input,43,FOLLOW_43_in_expr224); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr228);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr232);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x <= y) ? 1 : 0;

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:52:3: ^( '>' x= expr y= expr )
                    {
                    match(input,40,FOLLOW_40_in_expr240); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr244);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr248);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x > y) ? 1 : 0;

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:53:3: ^( '>=' x= expr y= expr )
                    {
                    match(input,44,FOLLOW_44_in_expr256); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr260);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr264);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x >= y) ? 1 : 0;

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:54:3: ^( '=' x= expr y= expr )
                    {
                    match(input,42,FOLLOW_42_in_expr272); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr276);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr280);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x == y) ? 1 : 0;

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:55:3: ^( '!=' x= expr y= expr )
                    {
                    match(input,45,FOLLOW_45_in_expr288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr292);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr296);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != y) ? 1 : 0;

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:56:3: ^( '|' x= expr y= expr )
                    {
                    match(input,47,FOLLOW_47_in_expr304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr308);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr312);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != 0 || y != 0) ? 1 : 0;

                    }
                    break;
                case 17 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:57:3: ^( '&' x= expr y= expr )
                    {
                    match(input,46,FOLLOW_46_in_expr320); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr324);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr328);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x !=0 && y != 0) ? 1 : 0;

                    }
                    break;
                case 18 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:58:3: ^( HASARD x= expr )
                    {
                    match(input,HASARD,FOLLOW_HASARD_in_expr336); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr340);
                    x=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                       if ( x > 0 ) { v = generator.nextInt((int)x+1); }
                        else { v = 0; } 
                     

                    }
                    break;
                case 19 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:62:3: PI
                    {
                    match(input,PI,FOLLOW_PI_in_expr348); 
                    v = new Double(3.14957);

                    }
                    break;
                case 20 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:63:3: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr354); 
                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 21 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:64:3: REAL
                    {
                    REAL2=(CommonTree)match(input,REAL,FOLLOW_REAL_in_expr360); 
                    v = Double.parseDouble((REAL2!=null?REAL2.getText():null));

                    }
                    break;
                case 22 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:65:3: CAP
                    {
                    match(input,CAP,FOLLOW_CAP_in_expr366); 
                    v = traceur.getTeta();

                    }
                    break;
                case 23 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:66:3: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr376); 

                    	  try {
                    	    v = context.get(id.getText()); 
                    	   }
                    	   catch ( Exception e ) {
                    	      Log.appendnl("TreeParser l. " + id.getLine() + " : variable " + id.getText() + " non-definie");
                    	   }
                       

                    }
                    break;
                case 24 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:74:3: LOOP
                    {
                    match(input,LOOP,FOLLOW_LOOP_in_expr382); 
                     
                    	  try { 
                    	    v = context.getLoop();
                    	  } 
                    	  catch ( Exception e ) {
                    	    Log.appendnl("TreeParser : LOOP inutilisable ici");
                    	  } 
                      

                    }
                    break;
                case 25 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:82:3: call
                    {
                    pushFollow(FOLLOW_call_in_expr388);
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:86:1: repete : ^( REPETE n= expr . ) ;
    public final void repete() throws RecognitionException {
        double n = 0.0;



            int mark_list = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:91:3: ( ^( REPETE n= expr . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:91:5: ^( REPETE n= expr . )
            {
            match(input,REPETE,FOLLOW_REPETE_in_repete414); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repete420);
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
                  context.rewind();
                }
                  context.rewind();
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:109:1: tantque : ^( TANTQUE . . ) ;
    public final void tantque() throws RecognitionException {

            int cond = 0, bloc = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:114:3: ( ^( TANTQUE . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:114:5: ^( TANTQUE . . )
            {
            match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque454); 

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
                  context.rewind();
                
                  if ( context.interrupted() ) return;
                  
                  if ( x ) 
                  {
            	      push(bloc);
            	      bloc();
            	      pop();
            	      context.rewind();
                  }
                  
                  if ( context.interrupted() ) return;
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:140:1: si : ^( SI n= expr . (els= . )? ) ;
    public final void si() throws RecognitionException {
        CommonTree els=null;
        double n = 0.0;



            int bif = 0, belse = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:145:3: ( ^( SI n= expr . (els= . )? ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:146:3: ^( SI n= expr . (els= . )? )
            {
            match(input,SI,FOLLOW_SI_in_si495); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_si499);
            n=expr();

            state._fsp--;

            bif = input.mark();
            matchAny(input); 
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:146:39: (els= . )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=PROGRAMME && LA4_0<=59)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:146:40: els= .
                    {
                    belse = input.mark();
                    els=(CommonTree)input.LT(1);
                    matchAny(input); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

                if ( n != 0 ) { push(bif); bloc(); pop(); context.rewind(); }
                else if (els != null) { push(belse); bloc(); pop(); context.rewind(); }
              

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:154:1: deffonction : ^( POUR name= IDENTIFIER a= . ) ;
    public final void deffonction() throws RecognitionException {
        CommonTree name=null;
        CommonTree a=null;


            int mark_a = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:159:3: ( ^( POUR name= IDENTIFIER a= . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:159:5: ^( POUR name= IDENTIFIER a= . )
            {
            match(input,POUR,FOLLOW_POUR_in_deffonction541); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction545); 
            mark_a = input.mark();
            a=(CommonTree)input.LT(1);
            matchAny(input); 

            match(input, Token.UP, null); 

                  context.setFunctionMark(name.getText(),mark_a, this);
              

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:165:1: call : ^( CALL name= IDENTIFIER (e= expr )* ) ;
    public final void call() throws RecognitionException {
        CommonTree name=null;
        double e = 0.0;



            Stack<Double> values = new Stack<Double>();
            int mark_fin = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:171:3: ( ^( CALL name= IDENTIFIER (e= expr )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:171:5: ^( CALL name= IDENTIFIER (e= expr )* )
            {
            match(input,CALL,FOLLOW_CALL_in_call579); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_call583); 
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:171:28: (e= expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CALL||LA5_0==U_MOINS||(LA5_0>=LOOP && LA5_0<=PI)||(LA5_0>=SIN && LA5_0<=REAL)||(LA5_0>=40 && LA5_0<=53)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:171:29: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_call588);
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:177:1: rends : ^( RENDS e= expr ) ;
    public final void rends() throws RecognitionException {
        double e = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:177:7: ( ^( RENDS e= expr ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:177:9: ^( RENDS e= expr )
            {
            match(input,RENDS,FOLLOW_RENDS_in_rends608); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_rends612);
            e=expr();

            state._fsp--;


            match(input, Token.UP, null); 
             context.returnValue(e); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:179:1: instruction : ( repete | tantque | si | deffonction | call | rends | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( PAUSE a= expr ) | ^( FCC a= expr ) | ^( FCC_RGB a= expr b= expr c= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE );
    public final void instruction() throws RecognitionException {
        CommonTree i=null;
        double a = 0.0;

        double b = 0.0;

        double c = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:179:13: ( repete | tantque | si | deffonction | call | rends | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( PAUSE a= expr ) | ^( FCC a= expr ) | ^( FCC_RGB a= expr b= expr c= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:180:2: repete
                    {
                    pushFollow(FOLLOW_repete_in_instruction624);
                    repete();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:181:4: tantque
                    {
                    pushFollow(FOLLOW_tantque_in_instruction630);
                    tantque();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:182:4: si
                    {
                    pushFollow(FOLLOW_si_in_instruction635);
                    si();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:183:4: deffonction
                    {
                    pushFollow(FOLLOW_deffonction_in_instruction640);
                    deffonction();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:184:4: call
                    {
                    pushFollow(FOLLOW_call_in_instruction645);
                    call();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:185:4: rends
                    {
                    pushFollow(FOLLOW_rends_in_instruction650);
                    rends();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:186:4: ^( DONNE i= IDENTIFIER a= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction656); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction662); 
                    pushFollow(FOLLOW_expr_in_instruction668);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.set(i.getText(), a);

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:187:4: ^( LOCALE i= IDENTIFIER a= expr )
                    {
                    match(input,LOCALE,FOLLOW_LOCALE_in_instruction677); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction683); 
                    pushFollow(FOLLOW_expr_in_instruction689);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     try { context.setLocal(i.getText(), a); } catch ( Exception e ) {} 

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:188:4: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction698); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction704);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(a);

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:189:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction713); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction719);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.td(a);

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:190:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction728); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction734);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.tg(a);

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:191:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction743); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction749);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(-a);

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:192:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction758); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction764);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setTeta(a);

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:193:4: ^( PAUSE a= expr )
                    {
                    match(input,PAUSE,FOLLOW_PAUSE_in_instruction773); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction779);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    try{Thread.currentThread().sleep((long)a);}catch(InterruptedException ie){}

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:194:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction788); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction794);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a);

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:195:4: ^( FCC_RGB a= expr b= expr c= expr )
                    {
                    match(input,FCC_RGB,FOLLOW_FCC_RGB_in_instruction803); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction809);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction815);
                    b=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction821);
                    c=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a,b,c);

                    }
                    break;
                case 17 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:196:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction830); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction836);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction842);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     traceur.setPos(a,b); 

                    }
                    break;
                case 18 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:197:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction850); 
                    traceur.setTrace(true);

                    }
                    break;
                case 19 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:198:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction857); 
                    traceur.setTrace(false);

                    }
                    break;
                case 20 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:199:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction864); 
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
    public static final BitSet FOLLOW_48_in_expr76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expr92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_U_MOINS_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COS_in_expr120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIN_in_expr132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expr144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr148 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expr160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr164 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expr176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr180 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expr192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr196 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expr208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr212 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expr224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr228 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expr240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr244 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expr256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr260 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_42_in_expr272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr276 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expr288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr292 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expr304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr308 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expr320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr324 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HASARD_in_expr336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PI_in_expr348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_expr360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAP_in_expr366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_expr382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repete420 = new BitSet(new long[]{0x0FFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SI_in_si495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_si499 = new BitSet(new long[]{0x0FFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_POUR_in_deffonction541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction545 = new BitSet(new long[]{0x0FFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_CALL_in_call579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_call583 = new BitSet(new long[]{0x003FFF7DE0000228L});
    public static final BitSet FOLLOW_expr_in_call588 = new BitSet(new long[]{0x003FFF7DE0000228L});
    public static final BitSet FOLLOW_RENDS_in_rends608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_rends612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_repete_in_instruction624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffonction_in_instruction640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instruction645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rends_in_instruction650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_instruction656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction662 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCALE_in_instruction677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction683 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction734 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_in_instruction773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_in_instruction788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_RGB_in_instruction803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction809 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction815 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction836 = new BitSet(new long[]{0x003FFF7DE0000220L});
    public static final BitSet FOLLOW_expr_in_instruction842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BC_in_instruction850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction864 = new BitSet(new long[]{0x0000000000000002L});

}