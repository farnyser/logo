// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/Logo.g 2012-05-01 10:50:47

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__38=38;
    public static final int T__39=39;
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
    public static final int IDENTIFIER=19;
    public static final int INT=20;
    public static final int WS=21;

    // delegates
    // delegators

    public LogoLexer() {;} 
    public LogoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/scawf/workspace/nf11/src/logoparsing/Logo.g"; }

    // $ANTLR start "AV"
    public final void mAV() throws RecognitionException {
        try {
            int _type = AV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:7:4: ( 'AV' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:7:6: 'AV'
            {
            match("AV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AV"

    // $ANTLR start "TD"
    public final void mTD() throws RecognitionException {
        try {
            int _type = TD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:8:4: ( 'TD' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:8:6: 'TD'
            {
            match("TD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TD"

    // $ANTLR start "TG"
    public final void mTG() throws RecognitionException {
        try {
            int _type = TG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:9:4: ( 'TG' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:9:6: 'TG'
            {
            match("TG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TG"

    // $ANTLR start "REC"
    public final void mREC() throws RecognitionException {
        try {
            int _type = REC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:10:5: ( 'REC' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:10:7: 'REC'
            {
            match("REC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REC"

    // $ANTLR start "VE"
    public final void mVE() throws RecognitionException {
        try {
            int _type = VE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:11:4: ( 'VE' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:11:6: 'VE'
            {
            match("VE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VE"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            int _type = LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:12:4: ( 'LC' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:12:6: 'LC'
            {
            match("LC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "BC"
    public final void mBC() throws RecognitionException {
        try {
            int _type = BC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:13:4: ( 'BC' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:13:6: 'BC'
            {
            match("BC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BC"

    // $ANTLR start "FPOS"
    public final void mFPOS() throws RecognitionException {
        try {
            int _type = FPOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:14:6: ( 'FPOS' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:14:8: 'FPOS'
            {
            match("FPOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FPOS"

    // $ANTLR start "FCAP"
    public final void mFCAP() throws RecognitionException {
        try {
            int _type = FCAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:15:6: ( 'FCAP' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:15:8: 'FCAP'
            {
            match("FCAP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCAP"

    // $ANTLR start "FCC"
    public final void mFCC() throws RecognitionException {
        try {
            int _type = FCC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:16:5: ( 'FCC' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:16:7: 'FCC'
            {
            match("FCC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCC"

    // $ANTLR start "DONNE"
    public final void mDONNE() throws RecognitionException {
        try {
            int _type = DONNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:17:7: ( 'DONNE' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:17:9: 'DONNE'
            {
            match("DONNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DONNE"

    // $ANTLR start "REPETE"
    public final void mREPETE() throws RecognitionException {
        try {
            int _type = REPETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:18:8: ( 'REPETE' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:18:10: 'REPETE'
            {
            match("REPETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPETE"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:19:7: ( '>' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:20:7: ( '<' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:21:7: ( '=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:22:7: ( '<=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:22:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:23:7: ( '>=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:24:7: ( '!=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:24:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:25:7: ( '&' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:25:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:26:7: ( '|' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:26:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:27:7: ( '+' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:27:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:28:7: ( '-' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:29:7: ( '*' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:29:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:30:7: ( '/' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:30:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:31:7: ( '^' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:31:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:32:7: ( '(' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:32:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:33:7: ( ')' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:34:7: ( '\"' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:34:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:35:7: ( '[' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:35:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:36:7: ( ']' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:12: ( ( 'a' .. 'z' ) ( '_' | '0' .. '9' | 'a' .. 'z' )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:14: ( 'a' .. 'z' ) ( '_' | '0' .. '9' | 'a' .. 'z' )*
            {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:14: ( 'a' .. 'z' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:15: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:24: ( '_' | '0' .. '9' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:5: ( ( '0' .. '9' )+ )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:7: ( '0' .. '9' )+
            {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:41:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt4=1;
                    }
                    break;
                case '\t':
                    {
                    alt4=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:19: ( ( '\\r' )? '\\n' )
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:20: ( '\\r' )? '\\n'
            	    {
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:20: ( '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\r') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:42:20: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:8: ( AV | TD | TG | REC | VE | LC | BC | FPOS | FCAP | FCC | DONNE | REPETE | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | IDENTIFIER | INT | WS )
        int alt5=33;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:10: AV
                {
                mAV(); 

                }
                break;
            case 2 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:13: TD
                {
                mTD(); 

                }
                break;
            case 3 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:16: TG
                {
                mTG(); 

                }
                break;
            case 4 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:19: REC
                {
                mREC(); 

                }
                break;
            case 5 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:23: VE
                {
                mVE(); 

                }
                break;
            case 6 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:26: LC
                {
                mLC(); 

                }
                break;
            case 7 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:29: BC
                {
                mBC(); 

                }
                break;
            case 8 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:32: FPOS
                {
                mFPOS(); 

                }
                break;
            case 9 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:37: FCAP
                {
                mFCAP(); 

                }
                break;
            case 10 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:42: FCC
                {
                mFCC(); 

                }
                break;
            case 11 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:46: DONNE
                {
                mDONNE(); 

                }
                break;
            case 12 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:52: REPETE
                {
                mREPETE(); 

                }
                break;
            case 13 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:59: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:65: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:71: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:77: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:83: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:89: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:95: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:101: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:107: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:113: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:119: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:125: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:131: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:137: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:143: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:149: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:155: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:161: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:167: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 32 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:178: INT
                {
                mINT(); 

                }
                break;
            case 33 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:182: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\11\uffff\1\42\1\44\36\uffff";
    static final String DFA5_eofS =
        "\51\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\104\1\105\3\uffff\1\103\1\uffff\2\75\23\uffff\1"+
        "\103\1\uffff\1\101\10\uffff";
    static final String DFA5_maxS =
        "\1\174\1\uffff\1\107\1\105\3\uffff\1\120\1\uffff\2\75\23\uffff\1"+
        "\120\1\uffff\1\103\10\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\6\1\7\1\uffff\1\13\2\uffff\1\17\1\22"+
        "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
        "\1\40\1\41\1\2\1\3\1\uffff\1\10\1\uffff\1\21\1\15\1\20\1\16\1\4"+
        "\1\14\1\11\1\12";
    static final String DFA5_specialS =
        "\51\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\14\1\26\3\uffff\1\15\1\uffff"+
            "\1\24\1\25\1\21\1\17\1\uffff\1\20\1\uffff\1\22\12\32\2\uffff"+
            "\1\12\1\13\1\11\2\uffff\1\1\1\6\1\uffff\1\10\1\uffff\1\7\5\uffff"+
            "\1\5\5\uffff\1\3\1\uffff\1\2\1\uffff\1\4\4\uffff\1\27\1\uffff"+
            "\1\30\1\23\2\uffff\32\31\1\uffff\1\16",
            "",
            "\1\34\2\uffff\1\35",
            "\1\36",
            "",
            "",
            "",
            "\1\40\14\uffff\1\37",
            "",
            "\1\41",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\14\uffff\1\46",
            "",
            "\1\47\1\uffff\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AV | TD | TG | REC | VE | LC | BC | FPOS | FCAP | FCC | DONNE | REPETE | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | IDENTIFIER | INT | WS );";
        }
    }
 

}