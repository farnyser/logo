// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g 2012-05-01 14:53:21

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "CALL", "SCOPE", "VALUES", "PARAMETERS", "U_MOINS", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "DONNE", "LOCALE", "REPETE", "SI", "TANTQUE", "POUR", "FIN", "IDENTIFIER", "INT", "WS", "':'", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'\"'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
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
    public static final int IDENTIFIER=27;
    public static final int INT=28;
    public static final int WS=29;

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



    // $ANTLR start "prog"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:30:1: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:30:6: ( ^( PROGRAMME ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:30:8: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog42); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:30:20: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=AV && LA1_0<=TANTQUE)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:30:21: instruction
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:32:1: bloc : ^( SCOPE ( instruction )* ) ;
    public final void bloc() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:32:6: ( ^( SCOPE ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:32:8: ^( SCOPE ( instruction )* )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_bloc57); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:32:16: ( instruction )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=AV && LA2_0<=TANTQUE)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:32:17: instruction
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:34:1: expr returns [double v] : ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | INT | id= IDENTIFIER );
    public final double expr() throws RecognitionException {
        double v = 0.0;

        CommonTree id=null;
        CommonTree INT1=null;
        double x = 0.0;

        double y = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:34:25: ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | INT | id= IDENTIFIER )
            int alt3=16;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case U_MOINS:
                {
                alt3=3;
                }
                break;
            case 41:
                {
                alt3=4;
                }
                break;
            case 42:
                {
                alt3=5;
                }
                break;
            case 43:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            case 34:
                {
                alt3=8;
                }
                break;
            case 31:
                {
                alt3=9;
                }
                break;
            case 35:
                {
                alt3=10;
                }
                break;
            case 33:
                {
                alt3=11;
                }
                break;
            case 36:
                {
                alt3=12;
                }
                break;
            case 38:
                {
                alt3=13;
                }
                break;
            case 37:
                {
                alt3=14;
                }
                break;
            case INT:
                {
                alt3=15;
                }
                break;
            case IDENTIFIER:
                {
                alt3=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:1: ^( '+' x= expr y= expr )
                    {
                    match(input,39,FOLLOW_39_in_expr76); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:3: ^( '-' x= expr y= expr )
                    {
                    match(input,40,FOLLOW_40_in_expr92); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:37:3: ^( U_MOINS x= expr )
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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:3: ^( '*' x= expr y= expr )
                    {
                    match(input,41,FOLLOW_41_in_expr120); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:39:3: ^( '/' x= expr y= expr )
                    {
                    match(input,42,FOLLOW_42_in_expr136); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:3: ^( '^' x= expr y= expr )
                    {
                    match(input,43,FOLLOW_43_in_expr152); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:41:3: ^( '<' x= expr y= expr )
                    {
                    match(input,32,FOLLOW_32_in_expr168); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:42:3: ^( '<=' x= expr y= expr )
                    {
                    match(input,34,FOLLOW_34_in_expr184); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:43:3: ^( '>' x= expr y= expr )
                    {
                    match(input,31,FOLLOW_31_in_expr200); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:44:3: ^( '>=' x= expr y= expr )
                    {
                    match(input,35,FOLLOW_35_in_expr216); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:45:3: ^( '=' x= expr y= expr )
                    {
                    match(input,33,FOLLOW_33_in_expr232); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:46:3: ^( '!=' x= expr y= expr )
                    {
                    match(input,36,FOLLOW_36_in_expr248); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:47:3: ^( '|' x= expr y= expr )
                    {
                    match(input,38,FOLLOW_38_in_expr264); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:48:3: ^( '&' x= expr y= expr )
                    {
                    match(input,37,FOLLOW_37_in_expr280); 

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
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:49:3: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr295); 
                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:50:3: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr305); 

                      try {
                        v = context.get(id.getText()); 
                       }
                       catch ( Exception e ) {
                          Log.appendnl("TreeParser l. " + id.getLine() + " : variable " + id.getText() + " non-definie");
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:60:1: repete : ^( REPETE n= expr . ) ;
    public final void repete() throws RecognitionException {
        double n = 0.0;



            int mark_list = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:65:3: ( ^( REPETE n= expr . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:65:5: ^( REPETE n= expr . )
            {
            match(input,REPETE,FOLLOW_REPETE_in_repete330); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repete336);
            n=expr();

            state._fsp--;

            mark_list = input.mark();
            matchAny(input); 

            match(input, Token.UP, null); 

                for (int i = 0; i < n ; i++) 
                {
                  Log.appendnl("TreeParser : repete iteration " + i);
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:78:1: tantque : ^( TANTQUE . . ) ;
    public final void tantque() throws RecognitionException {

            int cond = 0, bloc = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:83:3: ( ^( TANTQUE . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:83:5: ^( TANTQUE . . )
            {
            match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque370); 

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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:103:1: si : ^( SI n= expr . . ) ;
    public final void si() throws RecognitionException {
        double n = 0.0;



            int bif = 0, belse = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:109:3: ( ^( SI n= expr . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:109:5: ^( SI n= expr . . )
            {
            match(input,SI,FOLLOW_SI_in_si409); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_si413);
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


    // $ANTLR start "instruction"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:118:1: instruction : ( repete | tantque | si | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE );
    public final void instruction() throws RecognitionException {
        CommonTree i=null;
        double a = 0.0;

        double b = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:118:13: ( repete | tantque | si | ^( DONNE i= IDENTIFIER a= expr ) | ^( LOCALE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE )
            int alt4=15;
            switch ( input.LA(1) ) {
            case REPETE:
                {
                alt4=1;
                }
                break;
            case TANTQUE:
                {
                alt4=2;
                }
                break;
            case SI:
                {
                alt4=3;
                }
                break;
            case DONNE:
                {
                alt4=4;
                }
                break;
            case LOCALE:
                {
                alt4=5;
                }
                break;
            case AV:
                {
                alt4=6;
                }
                break;
            case TD:
                {
                alt4=7;
                }
                break;
            case TG:
                {
                alt4=8;
                }
                break;
            case REC:
                {
                alt4=9;
                }
                break;
            case FCAP:
                {
                alt4=10;
                }
                break;
            case FCC:
                {
                alt4=11;
                }
                break;
            case FPOS:
                {
                alt4=12;
                }
                break;
            case BC:
                {
                alt4=13;
                }
                break;
            case LC:
                {
                alt4=14;
                }
                break;
            case VE:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:119:2: repete
                    {
                    pushFollow(FOLLOW_repete_in_instruction438);
                    repete();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:120:4: tantque
                    {
                    pushFollow(FOLLOW_tantque_in_instruction444);
                    tantque();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:121:4: si
                    {
                    pushFollow(FOLLOW_si_in_instruction449);
                    si();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:122:4: ^( DONNE i= IDENTIFIER a= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction455); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction461); 
                    pushFollow(FOLLOW_expr_in_instruction467);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.set(i.getText(), a);

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:123:4: ^( LOCALE i= IDENTIFIER a= expr )
                    {
                    match(input,LOCALE,FOLLOW_LOCALE_in_instruction476); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction482); 
                    pushFollow(FOLLOW_expr_in_instruction488);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.setLocal(i.getText(), a);

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:124:4: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction497); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction503);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(a);

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:125:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction512); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction518);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.td(a);

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:126:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction527); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction533);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.tg(a);

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:127:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction542); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction548);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(-a);

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:128:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction557); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction563);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setTeta(a);

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:129:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction572); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction578);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a);

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:130:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction587); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction593);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction599);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     traceur.setPos(a,b); 

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:131:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction607); 
                    traceur.setTrace(true);

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:132:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction614); 
                    traceur.setTrace(false);

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:133:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction621); 
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
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x0000000001FFFC08L});
    public static final BitSet FOLLOW_SCOPE_in_bloc57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_bloc60 = new BitSet(new long[]{0x0000000001FFFC08L});
    public static final BitSet FOLLOW_39_in_expr76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expr92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_U_MOINS_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expr120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_42_in_expr136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr140 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expr152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expr200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr204 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_expr216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr220 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expr232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr236 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_expr248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr252 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_expr280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repete336 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SI_in_si409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_si413 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_repete_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_instruction455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction461 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_instruction467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCALE_in_instruction476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction482 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_instruction488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_in_instruction572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction593 = new BitSet(new long[]{0x00000FFF98000200L});
    public static final BitSet FOLLOW_expr_in_instruction599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BC_in_instruction607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction621 = new BitSet(new long[]{0x0000000000000002L});

}