// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g 2012-05-01 12:39:54

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "SCOPE", "U_MOINS", "AV", "TD", "TG", "REC", "VE", "LC", "BC", "FPOS", "FCAP", "FCC", "DONNE", "REPETE", "SI", "IDENTIFIER", "INT", "WS", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "':'", "'('", "')'", "'\"'", "'['", "']'"
    };
    public static final int EOF=-1;
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
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int PROGRAMME=4;
    public static final int SCOPE=5;
    public static final int U_MOINS=6;
    public static final int AV=7;
    public static final int TD=8;
    public static final int TG=9;
    public static final int REC=10;
    public static final int VE=11;
    public static final int LC=12;
    public static final int BC=13;
    public static final int FPOS=14;
    public static final int FCAP=15;
    public static final int FCC=16;
    public static final int DONNE=17;
    public static final int REPETE=18;
    public static final int SI=19;
    public static final int IDENTIFIER=20;
    public static final int INT=21;
    public static final int WS=22;

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

                    if ( ((LA1_0>=AV && LA1_0<=SI)) ) {
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

                    if ( ((LA2_0>=AV && LA2_0<=SI)) ) {
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
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case U_MOINS:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 34:
                {
                alt3=5;
                }
                break;
            case 35:
                {
                alt3=6;
                }
                break;
            case 24:
                {
                alt3=7;
                }
                break;
            case 26:
                {
                alt3=8;
                }
                break;
            case 23:
                {
                alt3=9;
                }
                break;
            case 27:
                {
                alt3=10;
                }
                break;
            case 25:
                {
                alt3=11;
                }
                break;
            case 28:
                {
                alt3=12;
                }
                break;
            case 30:
                {
                alt3=13;
                }
                break;
            case 29:
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
                    match(input,31,FOLLOW_31_in_expr76); 

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
                    match(input,32,FOLLOW_32_in_expr92); 

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
                    match(input,33,FOLLOW_33_in_expr120); 

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
                    match(input,34,FOLLOW_34_in_expr136); 

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
                    match(input,35,FOLLOW_35_in_expr152); 

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
                    match(input,24,FOLLOW_24_in_expr168); 

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
                    match(input,26,FOLLOW_26_in_expr184); 

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
                    match(input,23,FOLLOW_23_in_expr200); 

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
                    match(input,27,FOLLOW_27_in_expr216); 

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
                    match(input,25,FOLLOW_25_in_expr232); 

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
                    match(input,28,FOLLOW_28_in_expr248); 

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
                    match(input,30,FOLLOW_30_in_expr264); 

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
                    match(input,29,FOLLOW_29_in_expr280); 

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


    // $ANTLR start "si"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:78:1: si : ^( SI n= expr . . ) ;
    public final void si() throws RecognitionException {
        double n = 0.0;



            int bif = 0, belse = 0;
          
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:84:3: ( ^( SI n= expr . . ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:84:5: ^( SI n= expr . . )
            {
            match(input,SI,FOLLOW_SI_in_si371); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_si375);
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:93:1: instruction : ( repete | si | ^( DONNE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE );
    public final void instruction() throws RecognitionException {
        CommonTree i=null;
        double a = 0.0;

        double b = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:93:13: ( repete | si | ^( DONNE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE )
            int alt4=13;
            switch ( input.LA(1) ) {
            case REPETE:
                {
                alt4=1;
                }
                break;
            case SI:
                {
                alt4=2;
                }
                break;
            case DONNE:
                {
                alt4=3;
                }
                break;
            case AV:
                {
                alt4=4;
                }
                break;
            case TD:
                {
                alt4=5;
                }
                break;
            case TG:
                {
                alt4=6;
                }
                break;
            case REC:
                {
                alt4=7;
                }
                break;
            case FCAP:
                {
                alt4=8;
                }
                break;
            case FCC:
                {
                alt4=9;
                }
                break;
            case FPOS:
                {
                alt4=10;
                }
                break;
            case BC:
                {
                alt4=11;
                }
                break;
            case LC:
                {
                alt4=12;
                }
                break;
            case VE:
                {
                alt4=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:94:2: repete
                    {
                    pushFollow(FOLLOW_repete_in_instruction400);
                    repete();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:95:4: si
                    {
                    pushFollow(FOLLOW_si_in_instruction406);
                    si();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:96:4: ^( DONNE i= IDENTIFIER a= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction412); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction418); 
                    pushFollow(FOLLOW_expr_in_instruction424);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.set(i.getText(), a);

                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:97:4: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction433); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction439);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(a);

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:98:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction448); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction454);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.td(a);

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:99:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction463); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction469);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.tg(a);

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:100:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction478); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction484);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(-a);

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:101:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction493); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction499);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setTeta(a);

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:102:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction508); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction514);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a);

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:103:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction523); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction529);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction535);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     traceur.setPos(a,b); 

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:104:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction543); 
                    traceur.setTrace(true);

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:105:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction550); 
                    traceur.setTrace(false);

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:106:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction557); 
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
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x00000000000FFF88L});
    public static final BitSet FOLLOW_SCOPE_in_bloc57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_bloc60 = new BitSet(new long[]{0x00000000000FFF88L});
    public static final BitSet FOLLOW_31_in_expr76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_U_MOINS_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expr120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr140 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_expr152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expr168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expr184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expr200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr204 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr220 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expr232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr236 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr252 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPETE_in_repete330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repete336 = new BitSet(new long[]{0x000003FFFFFFFFF0L});
    public static final BitSet FOLLOW_SI_in_si371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_si375 = new BitSet(new long[]{0x000003FFFFFFFFF0L});
    public static final BitSet FOLLOW_repete_in_instruction400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_instruction412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction418 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_instruction424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_in_instruction508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction529 = new BitSet(new long[]{0x0000000FFFB00040L});
    public static final BitSet FOLLOW_expr_in_instruction535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BC_in_instruction543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction557 = new BitSet(new long[]{0x0000000000000002L});

}