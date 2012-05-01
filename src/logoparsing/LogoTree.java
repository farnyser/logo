// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g 2012-05-01 21:56:31

  package logoparsing;
  import utilities.Context;
  import logogui.Traceur;
  import logogui.Log;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "CALL", "SCOPE", "VALUES", "PARAMETERS", "U_MOINS", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "DONNE", "LOCALE", "REPETE", "SI", "TANTQUE", "POUR", "FIN", "RENDS", "LOOP", "PAUSE", "IDENTIFIER", "INT", "REAL", "WS", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "':'", "'('", "')'", "'\"'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
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
    public static final int PROGRAMME=4;
    public static final int CALL=5;
    public static final int SCOPE=6;
    public static final int VALUES=7;
    public static final int PARAMETERS=8;
    public static final int U_MOINS=9;
    public static final int AV=10;
    public static final int TD=11;
    public static final int TG=12;
    public static final int REC=13;
    public static final int VE=14;
    public static final int LC=15;
    public static final int BC=16;
    public static final int FPOS=17;
    public static final int FCAP=18;
    public static final int FCC=19;
    public static final int DONNE=20;
    public static final int LOCALE=21;
    public static final int REPETE=22;
    public static final int SI=23;
    public static final int TANTQUE=24;
    public static final int POUR=25;
    public static final int FIN=26;
    public static final int RENDS=27;
    public static final int LOOP=28;
    public static final int PAUSE=29;
    public static final int IDENTIFIER=30;
    public static final int INT=31;
    public static final int REAL=32;
    public static final int WS=33;

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
      
      public void initialize(java.awt.Graphics g, Context c) 
      {
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:33:1: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:33:6: ( ^( PROGRAMME ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:33:8: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog42); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:33:20: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==CALL||(LA1_0>=AV && LA1_0<=POUR)||LA1_0==RENDS||LA1_0==PAUSE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:33:21: instruction
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:1: bloc : ^( SCOPE ( instruction )* ) ;
    public final void bloc() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:6: ( ^( SCOPE ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:8: ^( SCOPE ( instruction )* )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_bloc57); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:16: ( instruction )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==CALL||(LA2_0>=AV && LA2_0<=POUR)||LA2_0==RENDS||LA2_0==PAUSE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:17: instruction
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:37:1: expr returns [double v] : ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | INT | REAL | id= IDENTIFIER | LOOP );
    public final double expr() throws RecognitionException {
        double v = 0.0;

        CommonTree id=null;
        CommonTree INT1=null;
        CommonTree REAL2=null;
        double x = 0.0;

        double y = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:37:25: ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | INT | REAL | id= IDENTIFIER | LOOP )
            int alt3=18;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case U_MOINS:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 45:
                {
                alt3=5;
                }
                break;
            case 46:
                {
                alt3=6;
                }
                break;
            case 35:
                {
                alt3=7;
                }
                break;
            case 37:
                {
                alt3=8;
                }
                break;
            case 34:
                {
                alt3=9;
                }
                break;
            case 38:
                {
                alt3=10;
                }
                break;
            case 36:
                {
                alt3=11;
                }
                break;
            case 39:
                {
                alt3=12;
                }
                break;
            case 41:
                {
                alt3=13;
                }
                break;
            case 40:
                {
                alt3=14;
                }
                break;
            case INT:
                {
                alt3=15;
                }
                break;
            case REAL:
                {
                alt3=16;
                }
                break;
            case IDENTIFIER:
                {
                alt3=17;
                }
                break;
            case LOOP:
                {
                alt3=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:1: ^( '+' x= expr y= expr )
                    {
                    match(input,42,FOLLOW_42_in_expr76); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:39:3: ^( '-' x= expr y= expr )
                    {
                    match(input,43,FOLLOW_43_in_expr92); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:3: ^( U_MOINS x= expr )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:41:3: ^( '*' x= expr y= expr )
                    {
                    match(input,44,FOLLOW_44_in_expr120); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr124);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr128);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x * y;

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:42:3: ^( '/' x= expr y= expr )
                    {
                    match(input,45,FOLLOW_45_in_expr136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr140);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr144);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x / y;

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:43:3: ^( '^' x= expr y= expr )
                    {
                    match(input,46,FOLLOW_46_in_expr152); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr156);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr160);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.exp(y * Math.log(x));

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:44:3: ^( '<' x= expr y= expr )
                    {
                    match(input,35,FOLLOW_35_in_expr168); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr172);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr176);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x < y) ? 1 : 0;

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:45:3: ^( '<=' x= expr y= expr )
                    {
                    match(input,37,FOLLOW_37_in_expr184); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr188);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr192);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x <= y) ? 1 : 0;

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:46:3: ^( '>' x= expr y= expr )
                    {
                    match(input,34,FOLLOW_34_in_expr200); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr204);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr208);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x > y) ? 1 : 0;

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:47:3: ^( '>=' x= expr y= expr )
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
                    v = (x >= y) ? 1 : 0;

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:48:3: ^( '=' x= expr y= expr )
                    {
                    match(input,36,FOLLOW_36_in_expr232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr236);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr240);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x == y) ? 1 : 0;

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:49:3: ^( '!=' x= expr y= expr )
                    {
                    match(input,39,FOLLOW_39_in_expr248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr252);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr256);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != y) ? 1 : 0;

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:50:3: ^( '|' x= expr y= expr )
                    {
                    match(input,41,FOLLOW_41_in_expr264); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr268);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr272);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != 0 || y != 0) ? 1 : 0;

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:51:3: ^( '&' x= expr y= expr )
                    {
                    match(input,40,FOLLOW_40_in_expr280); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr284);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr288);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x !=0 && y != 0) ? 1 : 0;

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:52:3: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr295); 
                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:53:3: REAL
                    {
                    REAL2=(CommonTree)match(input,REAL,FOLLOW_REAL_in_expr301); 
                    v = Double.parseDouble((REAL2!=null?REAL2.getText():null));

                    }
                    break;
                case 17 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:54:3: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr311); 

                    	  try {
                    	    v = context.get(id.getText()); 
                    	   }
                    	   catch ( Exception e ) {
                    	      Log.appendnl("TreeParser l. " + id.getLine() + " : variable " + id.getText() + " non-definie");
                    	   }
                       

                    }
                    break;
                case 18 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:62:3: LOOP
                    {
                    match(input,LOOP,FOLLOW_LOOP_in_expr317); 
                     
                    	  try { 
                    	    v = context.getLoop();
                    	  } 
                    	  catch ( Exception e ) {
                    	    Log.appendnl("TreeParser : LOOP inutilisable ici");
                    	  } 
                      

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:73:1: repete : ^( REPETE n= expr . ) ;
    public final void repete() throws RecognitionException {
        double n = 0.0;



            int mark_list = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:78:3: ( ^( REPETE n= expr . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:78:5: ^( REPETE n= expr . )
            {
            match(input,REPETE,FOLLOW_REPETE_in_repete343); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repete349);
            n=expr();

            state._fsp--;

            mark_list = input.mark();
            matchAny(input); 

            match(input, Token.UP, null); 

                for (int i = 0; i < n ; i++) 
                {
                  Log.appendnl("TreeParser : repete iteration " + i);
                  context.incLoop();
                  push(mark_list);
                  bloc();
                  pop();
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
    // $ANTLR end "repete"


    // $ANTLR start "tantque"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:92:1: tantque : ^( TANTQUE . . ) ;
    public final void tantque() throws RecognitionException {

            int cond = 0, bloc = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:97:3: ( ^( TANTQUE . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:97:5: ^( TANTQUE . . )
            {
            match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque383); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:117:1: si : ^( SI n= expr . . ) ;
    public final void si() throws RecognitionException {
        double n = 0.0;



            int bif = 0, belse = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:123:3: ( ^( SI n= expr . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:123:5: ^( SI n= expr . . )
            {
            match(input,SI,FOLLOW_SI_in_si422); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_si426);
            n=expr();

            state._fsp--;

            bif = input.mark();
            matchAny(input); 
            belse = input.mark();
            matchAny(input); 

            match(input, Token.UP, null); 

                if ( n != 0 ) { push(bif); bloc(); pop(); }
                else { push(belse); bloc(); pop(); }
              

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:131:1: deffonction : ^( POUR name= IDENTIFIER a= . (b= . )? ) ;
    public final void deffonction() throws RecognitionException {
        CommonTree name=null;
        CommonTree a=null;
        CommonTree b=null;


            int mark_a = 0;
            int mark_b = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:137:3: ( ^( POUR name= IDENTIFIER a= . (b= . )? ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:137:5: ^( POUR name= IDENTIFIER a= . (b= . )? )
            {
            match(input,POUR,FOLLOW_POUR_in_deffonction463); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deffonction467); 
            mark_a = input.mark();
            a=(CommonTree)input.LT(1);
            matchAny(input); 
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:137:57: (b= . )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=PROGRAMME && LA4_0<=52)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:137:58: b= .
                    {
                    mark_b = input.mark();
                    b=(CommonTree)input.LT(1);
                    matchAny(input); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

                if ( b == null )
                  context.setFunctionMark(name.getText(),mark_a);
                else
                  context.setFunctionMark(name.getText(),mark_b);
              

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:146:1: call : ^( CALL name= IDENTIFIER (e= expr )* ) ;
    public final void call() throws RecognitionException {
        CommonTree name=null;
        double e = 0.0;



            Stack<Double> values = new Stack<Double>();
            int mark_fin = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:152:3: ( ^( CALL name= IDENTIFIER (e= expr )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:152:5: ^( CALL name= IDENTIFIER (e= expr )* )
            {
            match(input,CALL,FOLLOW_CALL_in_call510); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_call514); 
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:152:28: (e= expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==U_MOINS||LA5_0==LOOP||(LA5_0>=IDENTIFIER && LA5_0<=REAL)||(LA5_0>=34 && LA5_0<=46)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:152:29: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_call519);
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:1: rends : ^( RENDS e= expr ) ;
    public final void rends() throws RecognitionException {
        double e = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:7: ( ^( RENDS e= expr ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:158:9: ^( RENDS e= expr )
            {
            match(input,RENDS,FOLLOW_RENDS_in_rends539); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_rends543);
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:160:1: instruction : ( repete | tantque | si | deffonction | call | rends | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( PAUSE a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE );
    public final void instruction() throws RecognitionException {
        CommonTree i=null;
        double a = 0.0;

        double b = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:160:13: ( repete | tantque | si | deffonction | call | rends | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( PAUSE a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE )
            int alt6=19;
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
            case FPOS:
                {
                alt6=16;
                }
                break;
            case BC:
                {
                alt6=17;
                }
                break;
            case LC:
                {
                alt6=18;
                }
                break;
            case VE:
                {
                alt6=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:161:2: repete
                    {
                    pushFollow(FOLLOW_repete_in_instruction555);
                    repete();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:162:4: tantque
                    {
                    pushFollow(FOLLOW_tantque_in_instruction561);
                    tantque();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:163:4: si
                    {
                    pushFollow(FOLLOW_si_in_instruction566);
                    si();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:164:4: deffonction
                    {
                    pushFollow(FOLLOW_deffonction_in_instruction571);
                    deffonction();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:165:4: call
                    {
                    pushFollow(FOLLOW_call_in_instruction576);
                    call();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:166:4: rends
                    {
                    pushFollow(FOLLOW_rends_in_instruction581);
                    rends();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:167:4: ^( DONNE i= IDENTIFIER a= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction587); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction593); 
                    pushFollow(FOLLOW_expr_in_instruction599);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.set(i.getText(), a);

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:168:4: ^( LOCALE i= IDENTIFIER a= expr )
                    {
                    match(input,LOCALE,FOLLOW_LOCALE_in_instruction608); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction614); 
                    pushFollow(FOLLOW_expr_in_instruction620);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.setLocal(i.getText(), a);

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:169:4: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction635);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(a);

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:170:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction644); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction650);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.td(a);

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:171:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction659); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction665);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.tg(a);

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:172:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction674); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction680);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(-a);

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:173:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction689); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction695);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setTeta(a);

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:174:4: ^( PAUSE a= expr )
                    {
                    match(input,PAUSE,FOLLOW_PAUSE_in_instruction704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction710);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    try{Thread.currentThread().sleep((long)a);}catch(InterruptedException ie){}

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:175:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction719); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction725);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a);

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:176:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction734); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction740);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction746);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     traceur.setPos(a,b); 

                    }
                    break;
                case 17 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:177:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction754); 
                    traceur.setTrace(true);

                    }
                    break;
                case 18 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:178:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction761); 
                    traceur.setTrace(false);

                    }
                    break;
                case 19 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:179:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction768); 
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
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x000000002BFFFC28L});
    public static final BitSet FOLLOW_SCOPE_in_bloc57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_bloc60 = new BitSet(new long[]{0x000000002BFFFC28L});
    public static final BitSet FOLLOW_42_in_expr76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expr92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_U_MOINS_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expr120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expr136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr140 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expr152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_expr168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_expr184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr204 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_expr216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr220 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_expr232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr236 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expr248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr252 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expr280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_expr301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_expr317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repete349 = new BitSet(new long[]{0x001FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SI_in_si422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_si426 = new BitSet(new long[]{0x001FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_POUR_in_deffonction463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deffonction467 = new BitSet(new long[]{0x001FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_CALL_in_call510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_call514 = new BitSet(new long[]{0x00007FFDD0000208L});
    public static final BitSet FOLLOW_expr_in_call519 = new BitSet(new long[]{0x00007FFDD0000208L});
    public static final BitSet FOLLOW_RENDS_in_rends539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_rends543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_repete_in_instruction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deffonction_in_instruction571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instruction576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rends_in_instruction581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_instruction587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction593 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_instruction599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCALE_in_instruction608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction614 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_instruction620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_in_instruction704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_in_instruction719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction740 = new BitSet(new long[]{0x00007FFDD0000200L});
    public static final BitSet FOLLOW_expr_in_instruction746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BC_in_instruction754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction768 = new BitSet(new long[]{0x0000000000000002L});

}