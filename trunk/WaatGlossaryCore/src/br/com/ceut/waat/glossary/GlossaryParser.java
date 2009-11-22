// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g 2009-10-28 19:06:25

	package br.com.ceut.waat.glossary;
	import br.com.ceut.waat.glossary.rules.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class GlossaryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WHITESPACE", "STAR", "INTEGER", "FLOATING_POINT", "TEXT", "INT", "CPF", "CNPJ", "LIST", "GRID", "MULTIPLA", "DATA", "FLOAT", "NEWLINE", "'Entidade'", "'-'", "':'", "'Descricao:'", "';'", "'Atributos:'", "'\"'", "','", "'/'", "'('", "')'"
    };
    public static final int INTEGER=7;
    public static final int MULTIPLA=15;
    public static final int T__29=29;
    public static final int STAR=6;
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
    public static final int FLOAT=17;
    public static final int INT=10;
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


        public GlossaryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GlossaryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GlossaryParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g"; }


    public static class glossary_return extends ParserRuleReturnScope {
        public Glossary r_glossary;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "glossary"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:13:1: glossary returns [Glossary r_glossary] : entitylist= entityList ;
    public final GlossaryParser.glossary_return glossary() throws RecognitionException {
        GlossaryParser.glossary_return retval = new GlossaryParser.glossary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GlossaryParser.entityList_return entitylist = null;



        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:14:2: (entitylist= entityList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:15:3: entitylist= entityList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_entityList_in_glossary39);
            entitylist=entityList();

            state._fsp--;

            adaptor.addChild(root_0, entitylist.getTree());
            retval.r_glossary = new Glossary(entitylist.r_entitylist);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "glossary"

    public static class entityList_return extends ParserRuleReturnScope {
        public List<Entity> r_entitylist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:18:1: entityList returns [List<Entity> r_entitylist] : (e= entity )+ ;
    public final GlossaryParser.entityList_return entityList() throws RecognitionException {
        GlossaryParser.entityList_return retval = new GlossaryParser.entityList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GlossaryParser.entity_return e = null;



         retval.r_entitylist = new ArrayList<Entity>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:20:2: ( (e= entity )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:21:3: (e= entity )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:21:3: (e= entity )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:21:4: e= entity
            	    {
            	    pushFollow(FOLLOW_entity_in_entityList67);
            	    e=entity();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	    retval.r_entitylist.add(e.r_entity);

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


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityList"

    public static class entity_return extends ParserRuleReturnScope {
        public Entity r_entity;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entity"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:24:1: entity returns [Entity r_entity] : 'Entidade' '-' entityname= entityName ':' 'Descricao:' ( text )* ';' 'Atributos:' attributelist= attributeList ;
    public final GlossaryParser.entity_return entity() throws RecognitionException {
        GlossaryParser.entity_return retval = new GlossaryParser.entity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        Token string_literal4=null;
        Token char_literal6=null;
        Token string_literal7=null;
        GlossaryParser.entityName_return entityname = null;

        GlossaryParser.attributeList_return attributelist = null;

        GlossaryParser.text_return text5 = null;


        Object string_literal1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;
        Object string_literal4_tree=null;
        Object char_literal6_tree=null;
        Object string_literal7_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:25:2: ( 'Entidade' '-' entityname= entityName ':' 'Descricao:' ( text )* ';' 'Atributos:' attributelist= attributeList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:26:3: 'Entidade' '-' entityname= entityName ':' 'Descricao:' ( text )* ';' 'Atributos:' attributelist= attributeList
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,19,FOLLOW_19_in_entity89); 
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);

            char_literal2=(Token)match(input,20,FOLLOW_20_in_entity91); 
            char_literal2_tree = (Object)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);

            pushFollow(FOLLOW_entityName_in_entity95);
            entityname=entityName();

            state._fsp--;

            adaptor.addChild(root_0, entityname.getTree());
            char_literal3=(Token)match(input,21,FOLLOW_21_in_entity97); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            string_literal4=(Token)match(input,22,FOLLOW_22_in_entity99); 
            string_literal4_tree = (Object)adaptor.create(string_literal4);
            adaptor.addChild(root_0, string_literal4_tree);

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:26:57: ( text )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=WHITESPACE)||(LA2_0>=25 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:26:57: text
            	    {
            	    pushFollow(FOLLOW_text_in_entity101);
            	    text5=text();

            	    state._fsp--;

            	    adaptor.addChild(root_0, text5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            char_literal6=(Token)match(input,23,FOLLOW_23_in_entity104); 
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);

            string_literal7=(Token)match(input,24,FOLLOW_24_in_entity106); 
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);

            pushFollow(FOLLOW_attributeList_in_entity110);
            attributelist=attributeList();

            state._fsp--;

            adaptor.addChild(root_0, attributelist.getTree());
             retval.r_entity = new Entity(entityname.r_entityname, attributelist.r_attributelist); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entity"

    public static class entityName_return extends ParserRuleReturnScope {
        public String r_entityname;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityName"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:30:1: entityName returns [String r_entityname] : (entitynamepart= ID )+ ;
    public final GlossaryParser.entityName_return entityName() throws RecognitionException {
        GlossaryParser.entityName_return retval = new GlossaryParser.entityName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token entitynamepart=null;

        Object entitynamepart_tree=null;

         retval.r_entityname = new String(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:32:2: ( (entitynamepart= ID )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:33:3: (entitynamepart= ID )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:33:3: (entitynamepart= ID )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:33:4: entitynamepart= ID
            	    {
            	    entitynamepart=(Token)match(input,ID,FOLLOW_ID_in_entityName140); 
            	    entitynamepart_tree = (Object)adaptor.create(entitynamepart);
            	    adaptor.addChild(root_0, entitynamepart_tree);

            	     retval.r_entityname = retval.r_entityname.concat(" " + entitynamepart.getText()); 

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

             retval.r_entityname = retval.r_entityname.trim(); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityName"

    public static class text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "text"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:37:1: text : ( WHITESPACE | ID | '\"' | ',' | '/' )+ ;
    public final GlossaryParser.text_return text() throws RecognitionException {
        GlossaryParser.text_return retval = new GlossaryParser.text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set8=null;

        Object set8_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:37:6: ( ( WHITESPACE | ID | '\"' | ',' | '/' )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:38:3: ( WHITESPACE | ID | '\"' | ',' | '/' )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:38:3: ( WHITESPACE | ID | '\"' | ',' | '/' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=ID && LA4_0<=WHITESPACE)||(LA4_0>=25 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:
            	    {
            	    set8=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ID && input.LA(1)<=WHITESPACE)||(input.LA(1)>=25 && input.LA(1)<=27) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set8));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
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


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "text"

    public static class attributeList_return extends ParserRuleReturnScope {
        public List<Attribute> r_attributelist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:41:1: attributeList returns [List<Attribute> r_attributelist] : (a= attribute )+ ;
    public final GlossaryParser.attributeList_return attributeList() throws RecognitionException {
        GlossaryParser.attributeList_return retval = new GlossaryParser.attributeList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GlossaryParser.attribute_return a = null;



         retval.r_attributelist = new ArrayList<Attribute>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:43:2: ( (a= attribute )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:44:3: (a= attribute )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:44:3: (a= attribute )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:44:4: a= attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributeList208);
            	    a=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a.getTree());
            	     retval.r_attributelist.add(a.r_attribute); 

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

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributeList"

    public static class attribute_return extends ParserRuleReturnScope {
        public Attribute r_attribute;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:47:1: attribute returns [Attribute r_attribute] : '-' attributename= ID (mandatory= STAR )? ',' attributetype= attributeType ';' ;
    public final GlossaryParser.attribute_return attribute() throws RecognitionException {
        GlossaryParser.attribute_return retval = new GlossaryParser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token attributename=null;
        Token mandatory=null;
        Token char_literal9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        GlossaryParser.attributeType_return attributetype = null;


        Object attributename_tree=null;
        Object mandatory_tree=null;
        Object char_literal9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:48:2: ( '-' attributename= ID (mandatory= STAR )? ',' attributetype= attributeType ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:49:3: '-' attributename= ID (mandatory= STAR )? ',' attributetype= attributeType ';'
            {
            root_0 = (Object)adaptor.nil();

            char_literal9=(Token)match(input,20,FOLLOW_20_in_attribute230); 
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);

            attributename=(Token)match(input,ID,FOLLOW_ID_in_attribute234); 
            attributename_tree = (Object)adaptor.create(attributename);
            adaptor.addChild(root_0, attributename_tree);

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:49:33: (mandatory= STAR )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==STAR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:49:33: mandatory= STAR
                    {
                    mandatory=(Token)match(input,STAR,FOLLOW_STAR_in_attribute238); 
                    mandatory_tree = (Object)adaptor.create(mandatory);
                    adaptor.addChild(root_0, mandatory_tree);


                    }
                    break;

            }

            char_literal10=(Token)match(input,26,FOLLOW_26_in_attribute241); 
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);

            pushFollow(FOLLOW_attributeType_in_attribute245);
            attributetype=attributeType();

            state._fsp--;

            adaptor.addChild(root_0, attributetype.getTree());
            char_literal11=(Token)match(input,23,FOLLOW_23_in_attribute247); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);

             	
            			if(mandatory != null) {
            				retval.r_attribute = new Attribute(attributename.getText(), true, attributetype.r_attributetype);
            			}
            			else {
            				retval.r_attribute = new Attribute(attributename.getText(), false, attributetype.r_attributetype);
            			}
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class attributeType_return extends ParserRuleReturnScope {
        public AttributeInfo r_attributetype;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeType"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:60:1: attributeType returns [AttributeInfo r_attributetype] : (texttype= textType | INTEGER | FLOATING_POINT );
    public final GlossaryParser.attributeType_return attributeType() throws RecognitionException {
        GlossaryParser.attributeType_return retval = new GlossaryParser.attributeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER12=null;
        Token FLOATING_POINT13=null;
        GlossaryParser.textType_return texttype = null;


        Object INTEGER12_tree=null;
        Object FLOATING_POINT13_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:61:2: (texttype= textType | INTEGER | FLOATING_POINT )
            int alt7=3;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt7=1;
                }
                break;
            case INTEGER:
                {
                alt7=2;
                }
                break;
            case FLOATING_POINT:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:64:3: texttype= textType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_textType_in_attributeType277);
                    texttype=textType();

                    state._fsp--;

                    adaptor.addChild(root_0, texttype.getTree());
                     retval.r_attributetype = texttype.r_texttype; 

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:66:3: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    INTEGER12=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_attributeType289); 
                    INTEGER12_tree = (Object)adaptor.create(INTEGER12);
                    adaptor.addChild(root_0, INTEGER12_tree);

                     retval.r_attributetype = new AttributeInfoInteger("integer"); 

                    }
                    break;
                case 3 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:67:3: FLOATING_POINT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOATING_POINT13=(Token)match(input,FLOATING_POINT,FOLLOW_FLOATING_POINT_in_attributeType297); 
                    FLOATING_POINT13_tree = (Object)adaptor.create(FLOATING_POINT13);
                    adaptor.addChild(root_0, FLOATING_POINT13_tree);

                     retval.r_attributetype = new AttributeInfoFloat("float"); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributeType"

    public static class textType_return extends ParserRuleReturnScope {
        public AttributeInfoText r_texttype;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textType"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:99:1: textType returns [AttributeInfoText r_texttype] : TEXT '(' textsize= INT ')' ;
    public final GlossaryParser.textType_return textType() throws RecognitionException {
        GlossaryParser.textType_return retval = new GlossaryParser.textType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token textsize=null;
        Token TEXT14=null;
        Token char_literal15=null;
        Token char_literal16=null;

        Object textsize_tree=null;
        Object TEXT14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal16_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:100:2: ( TEXT '(' textsize= INT ')' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Glossary.g:101:3: TEXT '(' textsize= INT ')'
            {
            root_0 = (Object)adaptor.nil();

            TEXT14=(Token)match(input,TEXT,FOLLOW_TEXT_in_textType346); 
            TEXT14_tree = (Object)adaptor.create(TEXT14);
            adaptor.addChild(root_0, TEXT14_tree);

            char_literal15=(Token)match(input,28,FOLLOW_28_in_textType348); 
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            textsize=(Token)match(input,INT,FOLLOW_INT_in_textType352); 
            textsize_tree = (Object)adaptor.create(textsize);
            adaptor.addChild(root_0, textsize_tree);

            char_literal16=(Token)match(input,29,FOLLOW_29_in_textType354); 
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

             retval.r_texttype = new AttributeInfoText("text", Integer.parseInt(textsize.getText())); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "textType"

    // Delegated rules


 

    public static final BitSet FOLLOW_entityList_in_glossary39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entity_in_entityList67 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_entity89 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_entity91 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_entityName_in_entity95 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_entity97 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_entity99 = new BitSet(new long[]{0x000000000E800030L});
    public static final BitSet FOLLOW_text_in_entity101 = new BitSet(new long[]{0x000000000E800030L});
    public static final BitSet FOLLOW_23_in_entity104 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_entity106 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_attributeList_in_entity110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_entityName140 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_set_in_text163 = new BitSet(new long[]{0x000000000E000032L});
    public static final BitSet FOLLOW_attribute_in_attributeList208 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_attribute230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_attribute234 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_STAR_in_attribute238 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_attribute241 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_attributeType_in_attribute245 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_attribute247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textType_in_attributeType277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_attributeType289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATING_POINT_in_attributeType297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textType346 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_textType348 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_textType352 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_textType354 = new BitSet(new long[]{0x0000000000000002L});

}