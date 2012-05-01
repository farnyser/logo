// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/scawf/workspace/nf11/src/logoparsing/Logo.g 2012-05-01 13:46:20

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__42=42;
    public static final int T__43=43;
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
    public static final int LOCALE=18;
    public static final int REPETE=19;
    public static final int SI=20;
    public static final int TANTQUE=21;
    public static final int IDENTIFIER=22;
    public static final int INT=23;
    public static final int WS=24;

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

    // $ANTLR start "LOCALE"
    public final void mLOCALE() throws RecognitionException {
        try {
            int _type = LOCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:18:8: ( 'LOCALE' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:18:10: 'LOCALE'
            {
            match("LOCALE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCALE"

    // $ANTLR start "REPETE"
    public final void mREPETE() throws RecognitionException {
        try {
            int _type = REPETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:19:8: ( 'REPETE' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:19:10: 'REPETE'
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

    // $ANTLR start "SI"
    public final void mSI() throws RecognitionException {
        try {
            int _type = SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:20:4: ( 'SI' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:20:6: 'SI'
            {
            match("SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SI"

    // $ANTLR start "TANTQUE"
    public final void mTANTQUE() throws RecognitionException {
        try {
            int _type = TANTQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:21:9: ( 'TANTQUE' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:21:11: 'TANTQUE'
            {
            match("TANTQUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TANTQUE"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:22:7: ( '>' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:22:9: '>'
            {
            match('>'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:23:7: ( '<' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:23:9: '<'
            {
            match('<'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:24:7: ( '=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:24:9: '='
            {
            match('='); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:25:7: ( '<=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:25:9: '<='
            {
            match("<="); 


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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:26:7: ( '>=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:26:9: '>='
            {
            match(">="); 


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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:27:7: ( '!=' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:27:9: '!='
            {
            match("!="); 


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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:28:7: ( '&' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:28:9: '&'
            {
            match('&'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:29:7: ( '|' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:29:9: '|'
            {
            match('|'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:30:7: ( '+' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:30:9: '+'
            {
            match('+'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:31:7: ( '-' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:31:9: '-'
            {
            match('-'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:32:7: ( '*' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:32:9: '*'
            {
            match('*'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:33:7: ( '/' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:33:9: '/'
            {
            match('/'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:34:7: ( '^' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:34:9: '^'
            {
            match('^'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:35:7: ( ':' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:35:9: ':'
            {
            match(':'); 

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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:36:7: ( '(' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:37:7: ( ')' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:38:7: ( '\"' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:38:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:7: ( '[' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:40:7: ( ']' )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:48:12: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( '_' | '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )* )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:48:14: ( 'A' .. 'Z' | 'a' .. 'z' ) ( '_' | '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:48:33: ( '_' | '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:5: ( ( '0' .. '9' )+ )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:7: ( '0' .. '9' )+
            {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:7: ( '0' .. '9' )+
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
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:50:8: '0' .. '9'
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
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
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
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:19: ( ( '\\r' )? '\\n' )
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:20: ( '\\r' )? '\\n'
            	    {
            	    // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:20: ( '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\r') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:51:20: '\\r'
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
        // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:8: ( AV | TD | TG | REC | VE | LC | BC | FPOS | FCAP | FCC | DONNE | LOCALE | REPETE | SI | TANTQUE | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | IDENTIFIER | INT | WS )
        int alt5=37;
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
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:52: LOCALE
                {
                mLOCALE(); 

                }
                break;
            case 13 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:59: REPETE
                {
                mREPETE(); 

                }
                break;
            case 14 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:66: SI
                {
                mSI(); 

                }
                break;
            case 15 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:69: TANTQUE
                {
                mTANTQUE(); 

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
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:167: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:173: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:179: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:185: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:191: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 36 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:202: INT
                {
                mINT(); 

                }
                break;
            case 37 :
                // /home/scawf/workspace/nf11/src/logoparsing/Logo.g:1:206: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\11\33\1\54\1\56\22\uffff\1\57\1\60\1\61\2\33\1\65\1\66"+
        "\1\33\1\70\3\33\1\75\7\uffff\1\33\1\77\1\33\2\uffff\1\33\1\uffff"+
        "\2\33\1\104\1\33\1\uffff\1\33\1\uffff\2\33\1\111\1\112\1\uffff\4"+
        "\33\2\uffff\1\117\1\33\1\121\1\122\1\uffff\1\123\3\uffff";
    static final String DFA5_eofS =
        "\124\uffff";
    static final String DFA5_minS =
        "\1\11\1\126\1\101\2\105\3\103\1\117\1\111\2\75\22\uffff\3\60\1\116"+
        "\1\103\2\60\1\103\1\60\1\117\1\101\1\116\1\60\7\uffff\1\124\1\60"+
        "\1\105\2\uffff\1\101\1\uffff\1\123\1\120\1\60\1\116\1\uffff\1\121"+
        "\1\uffff\1\124\1\114\2\60\1\uffff\1\105\1\125\2\105\2\uffff\1\60"+
        "\1\105\2\60\1\uffff\1\60\3\uffff";
    static final String DFA5_maxS =
        "\1\174\1\126\1\107\2\105\1\117\1\103\1\120\1\117\1\111\2\75\22\uffff"+
        "\3\172\1\116\1\120\2\172\1\103\1\172\1\117\1\103\1\116\1\172\7\uffff"+
        "\1\124\1\172\1\105\2\uffff\1\101\1\uffff\1\123\1\120\1\172\1\116"+
        "\1\uffff\1\121\1\uffff\1\124\1\114\2\172\1\uffff\1\105\1\125\2\105"+
        "\2\uffff\1\172\1\105\2\172\1\uffff\1\172\3\uffff";
    static final String DFA5_acceptS =
        "\14\uffff\1\22\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
        "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\15\uffff\1\24\1\20\1\23\1\21"+
        "\1\1\1\2\1\3\3\uffff\1\5\1\6\1\uffff\1\7\4\uffff\1\16\1\uffff\1"+
        "\4\4\uffff\1\12\4\uffff\1\10\1\11\4\uffff\1\13\1\uffff\1\15\1\14"+
        "\1\17";
    static final String DFA5_specialS =
        "\124\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\15\1\30\3\uffff\1\16\1\uffff"+
            "\1\26\1\27\1\22\1\20\1\uffff\1\21\1\uffff\1\23\12\34\1\25\1"+
            "\uffff\1\13\1\14\1\12\2\uffff\1\1\1\6\1\33\1\10\1\33\1\7\5\33"+
            "\1\5\5\33\1\3\1\11\1\2\1\33\1\4\4\33\1\31\1\uffff\1\32\1\24"+
            "\2\uffff\32\33\1\uffff\1\17",
            "\1\36",
            "\1\41\2\uffff\1\37\2\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44\13\uffff\1\45",
            "\1\46",
            "\1\50\14\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\55",
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
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\62",
            "\1\63\14\uffff\1\64",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\67",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\71",
            "\1\72\1\uffff\1\73",
            "\1\74",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\100",
            "",
            "",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\105",
            "",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\120",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( AV | TD | TG | REC | VE | LC | BC | FPOS | FCAP | FCC | DONNE | LOCALE | REPETE | SI | TANTQUE | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | IDENTIFIER | INT | WS );";
        }
    }
 

}