package br.com.ceut.waat.glossary;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g 2009-10-28 19:06:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GlossaryLexer extends Lexer {
    public static final int INTEGER=7;
    public static final int MULTIPLA=15;
    public static final int STAR=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int GRID=14;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=5;
    public static final int INT=10;
    public static final int FLOAT=17;
    public static final int TEXT=9;
    public static final int ID=4;
    public static final int LIST=13;
    public static final int EOF=-1;
    public static final int FLOATING_POINT=8;
    public static final int T__19=19;
    public static final int NEWLINE=18;
    public static final int CPF=11;
    public static final int DATA=16;
    public static final int CNPJ=12;

    // delegates
    // delegators

    public GlossaryLexer() {;} 
    public GlossaryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GlossaryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:3:7: ( 'Entidade' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:3:9: 'Entidade'
            {
            match("Entidade"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:4:7: ( '-' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:4:9: '-'
            {
            match('-'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:5:7: ( ':' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:5:9: ':'
            {
            match(':'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:6:7: ( 'Descricao:' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:6:9: 'Descricao:'
            {
            match("Descricao:"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:7:7: ( ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:7:9: ';'
            {
            match(';'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:8:7: ( 'Atributos:' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:8:9: 'Atributos:'
            {
            match("Atributos:"); 


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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:9:7: ( '\"' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:9:9: '\"'
            {
            match('\"'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:10:7: ( ',' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:10:9: ','
            {
            match(','); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:11:7: ( '/' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:11:9: '/'
            {
            match('/'); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:12:7: ( '(' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:12:9: '('
            {
            match('('); 

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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:13:7: ( ')' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "FLOATING_POINT"
    public final void mFLOATING_POINT() throws RecognitionException {
        try {
            int _type = FLOATING_POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:109:17: ( 'PONTO FLUTUANTE' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:109:19: 'PONTO FLUTUANTE'
            {
            match("PONTO FLUTUANTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATING_POINT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:110:11: ( 'INTEIRO' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:110:13: 'INTEIRO'
            {
            match("INTEIRO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "CPF"
    public final void mCPF() throws RecognitionException {
        try {
            int _type = CPF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:111:7: ( 'CPF' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:111:9: 'CPF'
            {
            match("CPF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CPF"

    // $ANTLR start "CNPJ"
    public final void mCNPJ() throws RecognitionException {
        try {
            int _type = CNPJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:112:8: ( 'CNPJ' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:112:10: 'CNPJ'
            {
            match("CNPJ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CNPJ"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:113:8: ( 'LISTA' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:113:10: 'LISTA'
            {
            match("LISTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:114:8: ( 'TEXTO' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:114:10: 'TEXTO'
            {
            match("TEXTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "GRID"
    public final void mGRID() throws RecognitionException {
        try {
            int _type = GRID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:115:8: ( '#' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:115:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRID"

    // $ANTLR start "MULTIPLA"
    public final void mMULTIPLA() throws RecognitionException {
        try {
            int _type = MULTIPLA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:116:11: ( 'MULTIPLA' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:116:13: 'MULTIPLA'
            {
            match("MULTIPLA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLA"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:117:8: ( 'DATA' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:117:10: 'DATA'
            {
            match("DATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:118:8: ( '*' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:118:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:8: ( ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( INT )? ( 'a' .. 'z' | 'A' .. 'Z' )* )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:10: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( INT )? ( 'a' .. 'z' | 'A' .. 'Z' )* )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:10: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( INT )? ( 'a' .. 'z' | 'A' .. 'Z' )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:11: ( 'a' .. 'z' | 'A' .. 'Z' )+ ( INT )? ( 'a' .. 'z' | 'A' .. 'Z' )*
            	    {
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:
            	    	    {
            	    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:32: ( INT )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>='0' && LA2_0<='9')) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:32: INT
            	            {
            	            mINT(); 

            	            }
            	            break;

            	    }

            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:119:37: ( 'a' .. 'z' | 'A' .. 'Z' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:
            	    	    {
            	    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:120:8: ( ( '0' .. '9' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:120:10: ( '0' .. '9' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:120:10: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:120:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:121:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:121:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:121:11: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:121:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match('.'); 
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:121:27: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:121:28: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:122:11: ( ( '\\r' )? '\\n' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:122:13: ( '\\r' )? '\\n'
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:122:13: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:122:13: '\\r'
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
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:123:15: ( ( ' ' | '\\t' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:123:17: ( ' ' | '\\t' )+
            {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:123:17: ( ' ' | '\\t' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
        // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | FLOATING_POINT | INTEGER | CPF | CNPJ | LIST | TEXT | GRID | MULTIPLA | DATA | STAR | ID | INT | FLOAT | NEWLINE | WHITESPACE )
        int alt10=26;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:76: FLOATING_POINT
                {
                mFLOATING_POINT(); 

                }
                break;
            case 13 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:91: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 14 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:99: CPF
                {
                mCPF(); 

                }
                break;
            case 15 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:103: CNPJ
                {
                mCNPJ(); 

                }
                break;
            case 16 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:108: LIST
                {
                mLIST(); 

                }
                break;
            case 17 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:113: TEXT
                {
                mTEXT(); 

                }
                break;
            case 18 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:118: GRID
                {
                mGRID(); 

                }
                break;
            case 19 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:123: MULTIPLA
                {
                mMULTIPLA(); 

                }
                break;
            case 20 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:132: DATA
                {
                mDATA(); 

                }
                break;
            case 21 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:137: STAR
                {
                mSTAR(); 

                }
                break;
            case 22 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:142: ID
                {
                mID(); 

                }
                break;
            case 23 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:145: INT
                {
                mINT(); 

                }
                break;
            case 24 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:149: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 25 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:155: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 26 :
                // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:1:163: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\24\2\uffff\1\24\1\uffff\1\24\5\uffff\5\24\1\uffff\1\24"+
        "\2\uffff\1\43\2\uffff\13\24\2\uffff\6\24\1\66\6\24\1\75\3\24\1\uffff"+
        "\1\101\5\24\1\uffff\3\24\1\uffff\1\112\1\113\4\24\1\uffff\1\24\2"+
        "\uffff\4\24\1\125\1\24\1\127\2\24\1\uffff\1\132\1\uffff\2\24\3\uffff";
    static final String DFA10_eofS =
        "\135\uffff";
    static final String DFA10_minS =
        "\1\11\1\156\2\uffff\1\101\1\uffff\1\164\5\uffff\1\117\2\116\1\111"+
        "\1\105\1\uffff\1\125\2\uffff\1\56\2\uffff\1\164\1\163\1\124\1\162"+
        "\1\116\1\124\1\106\1\120\1\123\1\130\1\114\2\uffff\1\151\1\143\1"+
        "\101\1\151\1\124\1\105\1\60\1\112\3\124\1\144\1\162\1\60\1\142\1"+
        "\117\1\111\1\uffff\1\60\1\101\1\117\1\111\1\141\1\151\1\uffff\1"+
        "\165\1\40\1\122\1\uffff\2\60\1\120\1\144\1\143\1\164\1\uffff\1\117"+
        "\2\uffff\1\114\1\145\1\141\1\157\1\60\1\101\1\60\1\157\1\163\1\uffff"+
        "\1\60\1\uffff\2\72\3\uffff";
    static final String DFA10_maxS =
        "\1\172\1\156\2\uffff\1\145\1\uffff\1\164\5\uffff\1\117\1\116\1\120"+
        "\1\111\1\105\1\uffff\1\125\2\uffff\1\71\2\uffff\1\164\1\163\1\124"+
        "\1\162\1\116\1\124\1\106\1\120\1\123\1\130\1\114\2\uffff\1\151\1"+
        "\143\1\101\1\151\1\124\1\105\1\172\1\112\3\124\1\144\1\162\1\172"+
        "\1\142\1\117\1\111\1\uffff\1\172\1\101\1\117\1\111\1\141\1\151\1"+
        "\uffff\1\165\1\40\1\122\1\uffff\2\172\1\120\1\144\1\143\1\164\1"+
        "\uffff\1\117\2\uffff\1\114\1\145\1\141\1\157\1\172\1\101\1\172\1"+
        "\157\1\163\1\uffff\1\172\1\uffff\2\72\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\5\uffff"+
        "\1\22\1\uffff\1\25\1\26\1\uffff\1\31\1\32\13\uffff\1\27\1\30\21"+
        "\uffff\1\16\6\uffff\1\24\3\uffff\1\17\6\uffff\1\14\1\uffff\1\20"+
        "\1\21\11\uffff\1\15\1\uffff\1\1\2\uffff\1\23\1\4\1\6";
    static final String DFA10_specialS =
        "\135\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\27\1\26\2\uffff\1\26\22\uffff\1\27\1\uffff\1\7\1\21\4\uffff"+
            "\1\12\1\13\1\23\1\uffff\1\10\1\2\1\uffff\1\11\12\25\1\3\1\5"+
            "\5\uffff\1\6\1\24\1\16\1\4\1\1\3\24\1\15\2\24\1\17\1\22\2\24"+
            "\1\14\3\24\1\20\6\24\6\uffff\32\24",
            "\1\30",
            "",
            "",
            "\1\32\43\uffff\1\31",
            "",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\37\1\uffff\1\36",
            "\1\40",
            "\1\41",
            "",
            "\1\42",
            "",
            "",
            "\1\44\1\uffff\12\25",
            "",
            "",
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
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\126",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\130",
            "\1\131",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | FLOATING_POINT | INTEGER | CPF | CNPJ | LIST | TEXT | GRID | MULTIPLA | DATA | STAR | ID | INT | FLOAT | NEWLINE | WHITESPACE );";
        }
    }
 

}