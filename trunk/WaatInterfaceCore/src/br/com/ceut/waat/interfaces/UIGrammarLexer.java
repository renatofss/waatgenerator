package br.com.ceut.waat.interfaces;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g 2009-10-18 12:44:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class UIGrammarLexer extends Lexer {
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int FIELD_TYPE=4;
    public static final int WHITESPACE=8;
    public static final int INT=6;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int NEWLINE=7;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;

    // delegates
    // delegators

    public UIGrammarLexer() {;} 
    public UIGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public UIGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:3:6: ( 'Interface_com_Usuario' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:3:8: 'Interface_com_Usuario'
            {
            match("Interface_com_Usuario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:4:7: ( '-' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:4:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:5:7: ( '\"' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:5:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:6:7: ( ':' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:6:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:7:7: ( '{' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:7:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:8:7: ( '}' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:8:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:9:7: ( '.' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:9:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:10:7: ( 'Campo' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:10:9: 'Campo'
            {
            match("Campo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:11:7: ( ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:12:7: ( 'Botao' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:12:9: 'Botao'
            {
            match("Botao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:13:7: ( 'Acao' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:13:9: 'Acao'
            {
            match("Acao"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:14:7: ( 'Radio' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:14:9: 'Radio'
            {
            match("Radio"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:15:7: ( 'Checkbox' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:15:9: 'Checkbox'
            {
            match("Checkbox"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:16:7: ( 'Select' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:16:9: 'Select'
            {
            match("Select"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:17:7: ( ',' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:17:9: ','
            {
            match(','); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:18:7: ( 'Escrita' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:18:9: 'Escrita'
            {
            match("Escrita"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:19:7: ( 'Leitura' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:19:9: 'Leitura'
            {
            match("Leitura"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "FIELD_TYPE"
    public final void mFIELD_TYPE() throws RecognitionException {
        try {
            int _type = FIELD_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:93:13: ( 'Tipo_Texto' | 'Tipo_Senha' | 'Tipo_Arquivo' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='T') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='i') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='p') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='o') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='_') ) {
                                switch ( input.LA(6) ) {
                                case 'T':
                                    {
                                    alt1=1;
                                    }
                                    break;
                                case 'S':
                                    {
                                    alt1=2;
                                    }
                                    break;
                                case 'A':
                                    {
                                    alt1=3;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 5, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:93:15: 'Tipo_Texto'
                    {
                    match("Tipo_Texto"); 


                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:93:30: 'Tipo_Senha'
                    {
                    match("Tipo_Senha"); 


                    }
                    break;
                case 3 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:93:45: 'Tipo_Arquivo'
                    {
                    match("Tipo_Arquivo"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIELD_TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:94:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:94:10: ( 'a' .. 'z' | 'A' .. 'Z' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:94:10: ( 'a' .. 'z' | 'A' .. 'Z' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C1' && LA2_0<='\u00C3')||LA2_0=='\u00C7'||(LA2_0>='\u00C9' && LA2_0<='\u00CA')||LA2_0=='\u00DA'||(LA2_0>='\u00E1' && LA2_0<='\u00E3')||LA2_0=='\u00E7'||LA2_0=='\u00EA'||LA2_0=='\u00FA') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C1' && input.LA(1)<='\u00C3')||input.LA(1)=='\u00C7'||(input.LA(1)>='\u00C9' && input.LA(1)<='\u00CA')||input.LA(1)=='\u00DA'||(input.LA(1)>='\u00E1' && input.LA(1)<='\u00E3')||input.LA(1)=='\u00E7'||input.LA(1)=='\u00EA'||input.LA(1)=='\u00FA' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:95:8: ( ( '0' .. '9' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:95:10: ( '0' .. '9' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:95:10: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:95:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:96:11: ( ( '\\r' )? '\\n' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:96:13: ( '\\r' )? '\\n'
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:96:13: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:96:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:97:15: ( ( ' ' | '\\t' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:97:17: ( ' ' | '\\t' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:97:17: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | FIELD_TYPE | ID | INT | NEWLINE | WHITESPACE )
        int alt6=22;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:111: FIELD_TYPE
                {
                mFIELD_TYPE(); 

                }
                break;
            case 19 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:122: ID
                {
                mID(); 

                }
                break;
            case 20 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:125: INT
                {
                mINT(); 

                }
                break;
            case 21 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:129: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 22 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:1:137: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\22\6\uffff\1\22\1\uffff\4\22\1\uffff\3\22\4\uffff\30"+
        "\22\1\70\6\22\1\77\1\22\1\101\1\uffff\1\102\3\22\1\uffff\1\22\1"+
        "\uffff\1\22\2\uffff\1\110\4\22\1\uffff\1\115\1\116\1\22\1\120\2"+
        "\uffff\1\22\2\uffff";
    static final String DFA6_eofS =
        "\122\uffff";
    static final String DFA6_minS =
        "\1\11\1\156\6\uffff\1\141\1\uffff\1\157\1\143\1\141\1\145\1\uffff"+
        "\1\163\1\145\1\151\4\uffff\1\164\1\155\1\145\1\164\1\141\1\144\1"+
        "\154\1\143\1\151\1\160\1\145\1\160\1\143\1\141\1\157\1\151\1\145"+
        "\1\162\1\164\1\157\1\162\1\157\1\153\1\157\1\101\1\157\1\143\1\151"+
        "\1\165\1\137\1\146\1\101\1\142\1\101\1\uffff\1\101\2\164\1\162\1"+
        "\uffff\1\141\1\uffff\1\157\2\uffff\1\101\2\141\1\143\1\170\1\uffff"+
        "\2\101\1\145\1\101\2\uffff\1\137\2\uffff";
    static final String DFA6_maxS =
        "\1\u00fa\1\156\6\uffff\1\150\1\uffff\1\157\1\143\1\141\1\145\1\uffff"+
        "\1\163\1\145\1\151\4\uffff\1\164\1\155\1\145\1\164\1\141\1\144\1"+
        "\154\1\143\1\151\1\160\1\145\1\160\1\143\1\141\1\157\1\151\1\145"+
        "\1\162\1\164\1\157\1\162\1\157\1\153\1\157\1\u00fa\1\157\1\143\1"+
        "\151\1\165\1\137\1\146\1\u00fa\1\142\1\u00fa\1\uffff\1\u00fa\2\164"+
        "\1\162\1\uffff\1\141\1\uffff\1\157\2\uffff\1\u00fa\2\141\1\143\1"+
        "\170\1\uffff\2\u00fa\1\145\1\u00fa\2\uffff\1\137\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\4\uffff\1\17\3\uffff"+
        "\1\23\1\24\1\25\1\26\42\uffff\1\13\4\uffff\1\22\1\uffff\1\10\1\uffff"+
        "\1\12\1\14\5\uffff\1\16\4\uffff\1\20\1\21\1\uffff\1\15\1\1";
    static final String DFA6_specialS =
        "\122\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\25\1\24\2\uffff\1\24\22\uffff\1\25\1\uffff\1\3\11\uffff\1"+
            "\16\1\2\1\7\1\uffff\12\23\1\4\1\11\5\uffff\1\13\1\12\1\10\1"+
            "\22\1\17\3\22\1\1\2\22\1\20\5\22\1\14\1\15\1\21\6\22\6\uffff"+
            "\32\22\1\5\1\uffff\1\6\103\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\6\uffff\1\30",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\1\100",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "",
            "\1\107",
            "",
            "",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "\1\117",
            "\32\22\6\uffff\32\22\106\uffff\3\22\3\uffff\1\22\1\uffff\2"+
            "\22\17\uffff\1\22\6\uffff\3\22\3\uffff\1\22\2\uffff\1\22\17"+
            "\uffff\1\22",
            "",
            "",
            "\1\121",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | FIELD_TYPE | ID | INT | NEWLINE | WHITESPACE );";
        }
    }
 

}