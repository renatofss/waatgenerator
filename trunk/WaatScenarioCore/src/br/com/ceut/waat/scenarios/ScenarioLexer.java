package br.com.ceut.waat.scenarios;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g 2009-10-25 23:36:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ScenarioLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=9;
    public static final int INT=4;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int ACTION=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int NEWLINE=8;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int ACTOR=5;
    public static final int T__10=10;

    // delegates
    // delegators

    public ScenarioLexer() {;} 
    public ScenarioLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScenarioLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:3:7: ( 'Cenario' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:3:9: 'Cenario'
            {
            match("Cenario"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:4:7: ( '-' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:4:9: '-'
            {
            match('-'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:5:7: ( '\"' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:5:9: '\"'
            {
            match('\"'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:6:7: ( ':' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:6:9: ':'
            {
            match(':'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:7:7: ( 'Pre-Condicao:' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:7:9: 'Pre-Condicao:'
            {
            match("Pre-Condicao:"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:8:7: ( ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:8:9: ';'
            {
            match(';'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:9:7: ( 'Executar' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:9:9: 'Executar'
            {
            match("Executar"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:10:7: ( '.' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:10:9: '.'
            {
            match('.'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:11:7: ( 'Ha' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:11:9: 'Ha'
            {
            match("Ha"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:12:7: ( 'caminhos' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:12:9: 'caminhos'
            {
            match("caminhos"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:13:7: ( ')' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:13:9: ')'
            {
            match(')'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:14:7: ( 'valida' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:14:9: 'valida'
            {
            match("valida"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:15:7: ( '{' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:15:9: '{'
            {
            match('{'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:16:7: ( '}' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:16:9: '}'
            {
            match('}'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:17:7: ( ',' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:17:9: ','
            {
            match(','); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:18:7: ( 'Link' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:18:9: 'Link'
            {
            match("Link"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:19:7: ( 'sessao' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:19:9: 'sessao'
            {
            match("sessao"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:20:7: ( 'Campo' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:20:9: 'Campo'
            {
            match("Campo"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:21:7: ( 'Select' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:21:9: 'Select'
            {
            match("Select"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:22:7: ( 'Botao' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:22:9: 'Botao'
            {
            match("Botao"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:23:7: ( 'Formulario' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:23:9: 'Formulario'
            {
            match("Formulario"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:24:7: ( 'Atributos' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:24:9: 'Atributos'
            {
            match("Atributos"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:25:7: ( 'Mensagem' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:25:9: 'Mensagem'
            {
            match("Mensagem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:10: ( 'clica' | 'seleciona' | 'preenche' | 'inclui' | 'apaga' | 'exibe' | 'valida' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt1=1;
                }
                break;
            case 's':
                {
                alt1=2;
                }
                break;
            case 'p':
                {
                alt1=3;
                }
                break;
            case 'i':
                {
                alt1=4;
                }
                break;
            case 'a':
                {
                alt1=5;
                }
                break;
            case 'e':
                {
                alt1=6;
                }
                break;
            case 'v':
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:12: 'clica'
                    {
                    match("clica"); 


                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:22: 'seleciona'
                    {
                    match("seleciona"); 


                    }
                    break;
                case 3 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:36: 'preenche'
                    {
                    match("preenche"); 


                    }
                    break;
                case 4 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:49: 'inclui'
                    {
                    match("inclui"); 


                    }
                    break;
                case 5 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:60: 'apaga'
                    {
                    match("apaga"); 


                    }
                    break;
                case 6 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:70: 'exibe'
                    {
                    match("exibe"); 


                    }
                    break;
                case 7 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:139:80: 'valida'
                    {
                    match("valida"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTION"

    // $ANTLR start "ACTOR"
    public final void mACTOR() throws RecognitionException {
        try {
            int _type = ACTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:140:9: ( 'Usuario' | 'Sistema' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='U') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:140:11: 'Usuario'
                    {
                    match("Usuario"); 


                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:140:23: 'Sistema'
                    {
                    match("Sistema"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:141:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:141:10: ( 'a' .. 'z' | 'A' .. 'Z' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:141:10: ( 'a' .. 'z' | 'A' .. 'Z' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' | '�' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')||(LA3_0>='\u00C1' && LA3_0<='\u00C3')||LA3_0=='\u00C7'||(LA3_0>='\u00C9' && LA3_0<='\u00CA')||LA3_0=='\u00DA'||(LA3_0>='\u00E1' && LA3_0<='\u00E3')||LA3_0=='\u00E7'||LA3_0=='\u00EA'||LA3_0=='\u00FA') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:142:8: ( ( '0' .. '9' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:142:10: ( '0' .. '9' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:142:10: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:142:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:143:11: ( ( '\\r' )? '\\n' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:143:13: ( '\\r' )? '\\n'
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:143:13: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:143:13: '\\r'
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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:144:15: ( ( ' ' | '\\t' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:144:17: ( ' ' | '\\t' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:144:17: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
        // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | ACTION | ACTOR | ID | INT | NEWLINE | WHITESPACE )
        int alt7=29;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:148: ACTION
                {
                mACTION(); 

                }
                break;
            case 25 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:155: ACTOR
                {
                mACTOR(); 

                }
                break;
            case 26 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:161: ID
                {
                mID(); 

                }
                break;
            case 27 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:164: INT
                {
                mINT(); 

                }
                break;
            case 28 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:168: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 29 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:1:176: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\34\3\uffff\1\34\1\uffff\1\34\1\uffff\2\34\1\uffff\1\34"+
        "\3\uffff\14\34\4\uffff\4\34\1\71\24\34\1\uffff\23\34\1\uffff\4\34"+
        "\1\146\16\34\1\165\2\34\1\170\1\34\1\uffff\4\34\1\176\5\34\2\170"+
        "\2\34\1\uffff\2\34\1\uffff\1\u0088\1\u0089\1\34\1\u008b\1\34\1\uffff"+
        "\4\34\1\170\1\34\1\u0092\2\34\2\uffff\1\34\1\uffff\1\u0096\4\34"+
        "\1\u0096\1\uffff\1\u009b\1\u009c\1\34\1\uffff\2\34\1\u00a0\1\170"+
        "\2\uffff\1\170\1\34\1\u00a2\1\uffff\1\u00a3\2\uffff";
    static final String DFA7_eofS =
        "\u00a4\uffff";
    static final String DFA7_minS =
        "\1\11\1\141\3\uffff\1\162\1\uffff\1\170\1\uffff\2\141\1\uffff\1"+
        "\141\3\uffff\1\151\2\145\2\157\1\164\1\145\1\162\1\156\1\160\1\170"+
        "\1\163\4\uffff\1\156\1\155\2\145\1\101\1\155\1\151\1\154\1\156\2"+
        "\154\1\163\1\164\2\162\1\156\1\145\1\143\1\141\1\151\1\165\1\141"+
        "\1\160\1\55\1\143\1\uffff\1\151\1\143\1\151\1\153\1\163\2\145\1"+
        "\164\1\141\1\155\1\151\1\163\1\145\1\154\1\147\1\142\1\141\1\162"+
        "\1\157\1\uffff\1\165\1\156\1\141\1\144\1\101\1\141\2\143\1\145\1"+
        "\157\1\165\1\142\1\141\1\156\1\165\1\141\1\145\1\162\1\151\1\101"+
        "\1\164\1\150\1\101\1\141\1\uffff\1\157\1\151\1\164\1\155\1\101\1"+
        "\154\1\165\1\147\1\143\1\151\2\101\1\151\1\157\1\uffff\1\141\1\157"+
        "\1\uffff\2\101\1\157\1\101\1\141\1\uffff\1\141\1\164\1\145\1\150"+
        "\1\101\1\157\1\101\1\162\1\163\2\uffff\1\156\1\uffff\1\101\1\162"+
        "\1\157\1\155\1\145\1\101\1\uffff\2\101\1\141\1\uffff\1\151\1\163"+
        "\2\101\2\uffff\1\101\1\157\1\101\1\uffff\1\101\2\uffff";
    static final String DFA7_maxS =
        "\1\u00fa\1\145\3\uffff\1\162\1\uffff\1\170\1\uffff\1\141\1\154\1"+
        "\uffff\1\141\3\uffff\1\151\1\145\1\151\2\157\1\164\1\145\1\162\1"+
        "\156\1\160\1\170\1\163\4\uffff\1\156\1\155\2\145\1\u00fa\1\155\1"+
        "\151\1\154\1\156\1\163\1\154\1\163\1\164\2\162\1\156\1\145\1\143"+
        "\1\141\1\151\1\165\1\141\1\160\1\55\1\143\1\uffff\1\151\1\143\1"+
        "\151\1\153\1\163\2\145\1\164\1\141\1\155\1\151\1\163\1\145\1\154"+
        "\1\147\1\142\1\141\1\162\1\157\1\uffff\1\165\1\156\1\141\1\144\1"+
        "\u00fa\1\141\2\143\1\145\1\157\1\165\1\142\1\141\1\156\1\165\1\141"+
        "\1\145\1\162\1\151\1\u00fa\1\164\1\150\1\u00fa\1\141\1\uffff\1\157"+
        "\1\151\1\164\1\155\1\u00fa\1\154\1\165\1\147\1\143\1\151\2\u00fa"+
        "\1\151\1\157\1\uffff\1\141\1\157\1\uffff\2\u00fa\1\157\1\u00fa\1"+
        "\141\1\uffff\1\141\1\164\1\145\1\150\1\u00fa\1\157\1\u00fa\1\162"+
        "\1\163\2\uffff\1\156\1\uffff\1\u00fa\1\162\1\157\1\155\1\145\1\u00fa"+
        "\1\uffff\2\u00fa\1\141\1\uffff\1\151\1\163\2\u00fa\2\uffff\1\u00fa"+
        "\1\157\1\u00fa\1\uffff\1\u00fa\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\uffff\1\10\2\uffff\1\13\1\uffff"+
        "\1\15\1\16\1\17\14\uffff\1\32\1\33\1\34\1\35\31\uffff\1\11\23\uffff"+
        "\1\5\30\uffff\1\20\16\uffff\1\22\2\uffff\1\30\5\uffff\1\24\11\uffff"+
        "\1\14\1\21\1\uffff\1\23\6\uffff\1\1\3\uffff\1\31\4\uffff\1\7\1\12"+
        "\3\uffff\1\27\1\uffff\1\26\1\25";
    static final String DFA7_specialS =
        "\u00a4\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\37\1\36\2\uffff\1\36\22\uffff\1\37\1\uffff\1\3\6\uffff\1"+
            "\13\2\uffff\1\17\1\2\1\10\1\uffff\12\35\1\4\1\6\5\uffff\1\25"+
            "\1\23\1\1\1\34\1\7\1\24\1\34\1\11\3\34\1\20\1\26\2\34\1\5\2"+
            "\34\1\22\1\34\1\33\5\34\6\uffff\1\31\1\34\1\12\1\34\1\32\3\34"+
            "\1\30\6\34\1\27\2\34\1\21\2\34\1\14\4\34\1\15\1\uffff\1\16\103"+
            "\uffff\3\34\3\uffff\1\34\1\uffff\2\34\17\uffff\1\34\6\uffff"+
            "\3\34\3\uffff\1\34\2\uffff\1\34\17\uffff\1\34",
            "\1\41\3\uffff\1\40",
            "",
            "",
            "",
            "\1\42",
            "",
            "\1\43",
            "",
            "\1\44",
            "\1\45\12\uffff\1\46",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\6\uffff\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\166",
            "\1\167",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u008a",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u0091",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "\1\u0095",
            "",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "",
            "",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "\1\u00a1",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "",
            "\32\34\6\uffff\32\34\106\uffff\3\34\3\uffff\1\34\1\uffff\2"+
            "\34\17\uffff\1\34\6\uffff\3\34\3\uffff\1\34\2\uffff\1\34\17"+
            "\uffff\1\34",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | ACTION | ACTOR | ID | INT | NEWLINE | WHITESPACE );";
        }
    }
 

}