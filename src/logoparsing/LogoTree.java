// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g 2012-05-01 09:09:59

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


        public LogoTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LogoTree.tokenNames; }
    public String getGrammarFileName() { return "/home/scawf/workspace/nf11/src/logoparsing/LogoTree.g"; }


      Traceur traceur;
      Context context = new Context();
      
      public void initialize(java.awt.Graphics g) {
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
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:27:2: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:27:7: ( ^( PROGRAMME ( instruction )* ) )
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:27:9: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog42); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:27:21: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=AV && LA1_0<=DONNE)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:27:22: instruction
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
            Log.appendnl("Programme principal");

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


    // $ANTLR start "expr"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:31:1: expr returns [double v] : ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | INT | IDENTIFIER );
    public final double expr() throws RecognitionException {
        double v = 0.0;

        CommonTree INT1=null;
        CommonTree IDENTIFIER2=null;
        double x = 0.0;

        double y = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:31:25: ( ^( '+' x= expr y= expr ) | ^( '-' x= expr y= expr ) | ^( U_MOINS x= expr ) | ^( '*' x= expr y= expr ) | ^( '/' x= expr y= expr ) | ^( '^' x= expr y= expr ) | ^( '<' x= expr y= expr ) | ^( '<=' x= expr y= expr ) | ^( '>' x= expr y= expr ) | ^( '>=' x= expr y= expr ) | ^( '=' x= expr y= expr ) | ^( '!=' x= expr y= expr ) | ^( '|' x= expr y= expr ) | ^( '&' x= expr y= expr ) | INT | IDENTIFIER )
            int alt2=16;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case U_MOINS:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
                }
                break;
            case 21:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            case 20:
                {
                alt2=9;
                }
                break;
            case 24:
                {
                alt2=10;
                }
                break;
            case 22:
                {
                alt2=11;
                }
                break;
            case 25:
                {
                alt2=12;
                }
                break;
            case 27:
                {
                alt2=13;
                }
                break;
            case 26:
                {
                alt2=14;
                }
                break;
            case INT:
                {
                alt2=15;
                }
                break;
            case IDENTIFIER:
                {
                alt2=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:32:1: ^( '+' x= expr y= expr )
                    {
                    match(input,28,FOLLOW_28_in_expr70); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr74);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr78);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x + y;

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:33:3: ^( '-' x= expr y= expr )
                    {
                    match(input,29,FOLLOW_29_in_expr86); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr90);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr94);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x - y;

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:34:3: ^( U_MOINS x= expr )
                    {
                    match(input,U_MOINS,FOLLOW_U_MOINS_in_expr102); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr106);
                    x=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = - x;

                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:35:3: ^( '*' x= expr y= expr )
                    {
                    match(input,30,FOLLOW_30_in_expr114); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr118);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr122);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x * y;

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:36:3: ^( '/' x= expr y= expr )
                    {
                    match(input,31,FOLLOW_31_in_expr130); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr134);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr138);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x / y;

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:37:3: ^( '^' x= expr y= expr )
                    {
                    match(input,32,FOLLOW_32_in_expr146); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr150);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr154);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.exp(y * Math.log(x));

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:38:3: ^( '<' x= expr y= expr )
                    {
                    match(input,21,FOLLOW_21_in_expr162); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr166);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr170);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x < y) ? 1 : 0;

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:39:3: ^( '<=' x= expr y= expr )
                    {
                    match(input,23,FOLLOW_23_in_expr178); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr182);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr186);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x <= y) ? 1 : 0;

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:40:3: ^( '>' x= expr y= expr )
                    {
                    match(input,20,FOLLOW_20_in_expr194); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr198);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr202);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x > y) ? 1 : 0;

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:41:3: ^( '>=' x= expr y= expr )
                    {
                    match(input,24,FOLLOW_24_in_expr210); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr214);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr218);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x >= y) ? 1 : 0;

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:42:3: ^( '=' x= expr y= expr )
                    {
                    match(input,22,FOLLOW_22_in_expr226); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr230);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr234);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x == y) ? 1 : 0;

                    }
                    break;
                case 12 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:43:3: ^( '!=' x= expr y= expr )
                    {
                    match(input,25,FOLLOW_25_in_expr242); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr246);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr250);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != y) ? 1 : 0;

                    }
                    break;
                case 13 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:44:3: ^( '|' x= expr y= expr )
                    {
                    match(input,27,FOLLOW_27_in_expr258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr262);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr266);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x != 0 || y != 0) ? 1 : 0;

                    }
                    break;
                case 14 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:45:3: ^( '&' x= expr y= expr )
                    {
                    match(input,26,FOLLOW_26_in_expr274); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr278);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr282);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = (x !=0 && y != 0) ? 1 : 0;

                    }
                    break;
                case 15 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:46:3: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr289); 
                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 16 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:47:3: IDENTIFIER
                    {
                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr295); 

                      try {
                        v = context.get(IDENTIFIER2.getText()); 
                       }
                       catch ( Exception e ) {
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


    // $ANTLR start "instruction"
    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:56:1: instruction : ( ^( DONNE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE );
    public final void instruction() throws RecognitionException {
        CommonTree i=null;
        double a = 0.0;

        double b = 0.0;


        try {
            // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:56:13: ( ^( DONNE i= IDENTIFIER a= expr ) | ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FCAP a= expr ) | ^( FCC a= expr ) | ^( FPOS a= expr b= expr ) | BC | LC | VE )
            int alt3=11;
            switch ( input.LA(1) ) {
            case DONNE:
                {
                alt3=1;
                }
                break;
            case AV:
                {
                alt3=2;
                }
                break;
            case TD:
                {
                alt3=3;
                }
                break;
            case TG:
                {
                alt3=4;
                }
                break;
            case REC:
                {
                alt3=5;
                }
                break;
            case FCAP:
                {
                alt3=6;
                }
                break;
            case FCC:
                {
                alt3=7;
                }
                break;
            case FPOS:
                {
                alt3=8;
                }
                break;
            case BC:
                {
                alt3=9;
                }
                break;
            case LC:
                {
                alt3=10;
                }
                break;
            case VE:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:57:4: ^( DONNE i= IDENTIFIER a= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction310); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instruction316); 
                    pushFollow(FOLLOW_expr_in_instruction322);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     context.set(i.getText(), a);

                    }
                    break;
                case 2 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:58:5: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction332); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction338);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(a);

                    }
                    break;
                case 3 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:59:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction347); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction353);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.td(a);

                    }
                    break;
                case 4 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:60:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction362); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction368);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.tg(a);

                    }
                    break;
                case 5 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:61:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction377); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction383);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.avance(-a);

                    }
                    break;
                case 6 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:62:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction392); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction398);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setTeta(a);

                    }
                    break;
                case 7 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:63:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction407); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction413);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    traceur.setColor(a);

                    }
                    break;
                case 8 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:64:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction422); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction428);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction434);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     traceur.setPos(a,b); 

                    }
                    break;
                case 9 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:65:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction442); 
                    traceur.setTrace(true);

                    }
                    break;
                case 10 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:66:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction449); 
                    traceur.setTrace(false);

                    }
                    break;
                case 11 :
                    // /home/scawf/workspace/nf11/src/logoparsing/LogoTree.g:67:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction456); 
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
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x000000000001FFC8L});
    public static final BitSet FOLLOW_28_in_expr70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr74 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr90 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr94 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_U_MOINS_in_expr102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expr114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr118 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expr130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr134 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr150 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_expr162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr166 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expr178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr182 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_expr194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr198 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expr210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr214 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expr226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr230 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expr242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expr274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr278 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_expr282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONNE_in_instruction310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instruction316 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_instruction322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCC_in_instruction407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction428 = new BitSet(new long[]{0x00000001FFF60020L});
    public static final BitSet FOLLOW_expr_in_instruction434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BC_in_instruction442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction456 = new BitSet(new long[]{0x0000000000000002L});

}