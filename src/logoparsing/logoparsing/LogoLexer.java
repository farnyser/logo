// $ANTLR 3.3 Nov 30, 2010 12:50:56 Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g 2012-04-27 18:26:04

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__19=19;
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
    public static final int IDENTIFIER=16;
    public static final int INT=17;
    public static final int WS=18;

    // delegates
    // delegators

    public LogoLexer() {;} 
    public LogoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g"; }

    // $ANTLR start "AV"
    public final void mAV() throws RecognitionException {
        try {
            int _type = AV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:7:4: ( 'AV' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:7:6: 'AV'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:8:4: ( 'TD' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:8:6: 'TD'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:9:4: ( 'TG' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:9:6: 'TG'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:10:5: ( 'REC' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:10:7: 'REC'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:11:4: ( 'VE' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:11:6: 'VE'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:12:4: ( 'LC' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:12:6: 'LC'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:13:4: ( 'BC' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:13:6: 'BC'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:14:6: ( 'FPOS' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:14:8: 'FPOS'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:15:6: ( 'FCAP' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:15:8: 'FCAP'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:16:5: ( 'FCC' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:16:7: 'FCC'
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

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:17:7: ( '>' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:18:7: ( '<' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:19:7: ( '=' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:20:7: ( '<=' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:20:9: '<='
            {
            match("<="); 


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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:21:7: ( '>=' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:21:9: '>='
            {
            match(">="); 


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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:22:7: ( '!=' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:22:9: '!='
            {
            match("!="); 


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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:23:7: ( '&' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:23:9: '&'
            {
            match('&'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:24:7: ( '|' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:24:9: '|'
            {
            match('|'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:25:7: ( '+' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:25:9: '+'
            {
            match('+'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:26:7: ( '-' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:26:9: '-'
            {
            match('-'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:27:7: ( '*' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:27:9: '*'
            {
            match('*'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:28:7: ( '/' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:28:9: '/'
            {
            match('/'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:29:7: ( '^' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:29:9: '^'
            {
            match('^'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:30:7: ( '(' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:30:9: '('
            {
            match('('); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:31:7: ( ')' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:31:9: ')'
            {
            match(')'); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:7: ( '[' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:9: '['
            {
            match('['); 

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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:33:7: ( ']' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:12: ( ( 'a' .. 'z' ) ( '_' | '0' .. '9' | 'a' .. 'z' )* )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:14: ( 'a' .. 'z' ) ( '_' | '0' .. '9' | 'a' .. 'z' )*
            {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:14: ( 'a' .. 'z' )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:15: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:32:24: ( '_' | '0' .. '9' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:33:5: ( ( '0' .. '9' )+ )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:33:7: ( '0' .. '9' )+
            {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:33:7: ( '0' .. '9' )+
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
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:33:8: '0' .. '9'
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
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
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
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:19: ( ( '\\r' )? '\\n' )
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:20: ( '\\r' )? '\\n'
            	    {
            	    // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:20: ( '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\r') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:34:20: '\\r'
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
        // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:8: ( AV | TD | TG | REC | VE | LC | BC | FPOS | FCAP | FCC | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | IDENTIFIER | INT | WS )
        int alt5=30;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:10: AV
                {
                mAV(); 

                }
                break;
            case 2 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:13: TD
                {
                mTD(); 

                }
                break;
            case 3 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:16: TG
                {
                mTG(); 

                }
                break;
            case 4 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:19: REC
                {
                mREC(); 

                }
                break;
            case 5 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:23: VE
                {
                mVE(); 

                }
                break;
            case 6 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:26: LC
                {
                mLC(); 

                }
                break;
            case 7 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:29: BC
                {
                mBC(); 

                }
                break;
            case 8 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:32: FPOS
                {
                mFPOS(); 

                }
                break;
            case 9 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:37: FCAP
                {
                mFCAP(); 

                }
                break;
            case 10 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:42: FCC
                {
                mFCC(); 

                }
                break;
            case 11 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:148: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 29 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:159: INT
                {
                mINT(); 

                }
                break;
            case 30 :
                // Z:\\public_html\\NF11_TP2\\src\\logoparsing\\Logo.g:1:163: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\10\uffff\1\37\1\41\32\uffff";
    static final String DFA5_eofS =
        "\44\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\104\4\uffff\1\103\2\75\23\uffff\1\101\6\uffff";
    static final String DFA5_maxS =
        "\1\174\1\uffff\1\107\4\uffff\1\120\2\75\23\uffff\1\103\6\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\3\uffff\1\15\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\2"+
        "\1\3\1\10\1\uffff\1\17\1\13\1\16\1\14\1\11\1\12";
    static final String DFA5_specialS =
        "\44\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\13\4\uffff\1\14\1\uffff"+
            "\1\23\1\24\1\20\1\16\1\uffff\1\17\1\uffff\1\21\12\30\2\uffff"+
            "\1\11\1\12\1\10\2\uffff\1\1\1\6\3\uffff\1\7\5\uffff\1\5\5\uffff"+
            "\1\3\1\uffff\1\2\1\uffff\1\4\4\uffff\1\25\1\uffff\1\26\1\22"+
            "\2\uffff\32\27\1\uffff\1\15",
            "",
            "\1\32\2\uffff\1\33",
            "",
            "",
            "",
            "",
            "\1\35\14\uffff\1\34",
            "\1\36",
            "\1\40",
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
            "\1\42\1\uffff\1\43",
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
            return "1:1: Tokens : ( AV | TD | TG | REC | VE | LC | BC | FPOS | FCAP | FCC | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | IDENTIFIER | INT | WS );";
        }
    }
 

}