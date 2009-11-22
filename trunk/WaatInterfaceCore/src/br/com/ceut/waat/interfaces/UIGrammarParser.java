// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g 2009-10-18 12:44:01

	package br.com.ceut.waat.interfaces;
	import br.com.ceut.waat.interfaces.rules.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class UIGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FIELD_TYPE", "ID", "INT", "NEWLINE", "WHITESPACE", "'Interface_com_Usuario'", "'-'", "'\"'", "':'", "'{'", "'}'", "'.'", "'Campo'", "';'", "'Botao'", "'Acao'", "'Radio'", "'Checkbox'", "'Select'", "','", "'Escrita'", "'Leitura'"
    };
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


        public UIGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public UIGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return UIGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g"; }


    public static class uiPrototype_return extends ParserRuleReturnScope {
        public UiPrototype r_uiprototype;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "uiPrototype"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:12:1: uiPrototype returns [UiPrototype r_uiprototype] : 'Interface_com_Usuario' '-' '\"' name= multiWordID '\"' ':' components= htmlComponentList ;
    public final UIGrammarParser.uiPrototype_return uiPrototype() throws RecognitionException {
        UIGrammarParser.uiPrototype_return retval = new UIGrammarParser.uiPrototype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        Token char_literal4=null;
        Token char_literal5=null;
        UIGrammarParser.multiWordID_return name = null;

        UIGrammarParser.htmlComponentList_return components = null;


        Object string_literal1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal5_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:13:2: ( 'Interface_com_Usuario' '-' '\"' name= multiWordID '\"' ':' components= htmlComponentList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:14:3: 'Interface_com_Usuario' '-' '\"' name= multiWordID '\"' ':' components= htmlComponentList
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,9,FOLLOW_9_in_uiPrototype35); 
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);

            char_literal2=(Token)match(input,10,FOLLOW_10_in_uiPrototype37); 
            char_literal2_tree = (Object)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);

            char_literal3=(Token)match(input,11,FOLLOW_11_in_uiPrototype39); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_multiWordID_in_uiPrototype43);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal4=(Token)match(input,11,FOLLOW_11_in_uiPrototype45); 
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);

            char_literal5=(Token)match(input,12,FOLLOW_12_in_uiPrototype47); 
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            pushFollow(FOLLOW_htmlComponentList_in_uiPrototype51);
            components=htmlComponentList();

            state._fsp--;

            adaptor.addChild(root_0, components.getTree());
             retval.r_uiprototype = new UiPrototype(name.r_multiwordid, components.r_htmlcomponentlist); 

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
    // $ANTLR end "uiPrototype"

    public static class htmlComponentList_return extends ParserRuleReturnScope {
        public List<HTMLComponent> r_htmlcomponentlist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "htmlComponentList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:18:1: htmlComponentList returns [List<HTMLComponent> r_htmlcomponentlist] : (htmlcomponent= htmlComponent )+ ;
    public final UIGrammarParser.htmlComponentList_return htmlComponentList() throws RecognitionException {
        UIGrammarParser.htmlComponentList_return retval = new UIGrammarParser.htmlComponentList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        UIGrammarParser.htmlComponent_return htmlcomponent = null;



         retval.r_htmlcomponentlist = new ArrayList<HTMLComponent>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:20:2: ( (htmlcomponent= htmlComponent )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:20:4: (htmlcomponent= htmlComponent )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:20:4: (htmlcomponent= htmlComponent )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18||(LA1_0>=20 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:20:5: htmlcomponent= htmlComponent
            	    {
            	    pushFollow(FOLLOW_htmlComponent_in_htmlComponentList79);
            	    htmlcomponent=htmlComponent();

            	    state._fsp--;

            	    adaptor.addChild(root_0, htmlcomponent.getTree());
            	     retval.r_htmlcomponentlist.add(htmlcomponent.r_htmlcomponent); 

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
    // $ANTLR end "htmlComponentList"

    public static class htmlComponent_return extends ParserRuleReturnScope {
        public HTMLComponent r_htmlcomponent;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "htmlComponent"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:23:1: htmlComponent returns [HTMLComponent r_htmlcomponent] : (s= select | f= field | b= button | rb= radioButton | cb= checkBox );
    public final UIGrammarParser.htmlComponent_return htmlComponent() throws RecognitionException {
        UIGrammarParser.htmlComponent_return retval = new UIGrammarParser.htmlComponent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        UIGrammarParser.select_return s = null;

        UIGrammarParser.field_return f = null;

        UIGrammarParser.button_return b = null;

        UIGrammarParser.radioButton_return rb = null;

        UIGrammarParser.checkBox_return cb = null;



        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:24:2: (s= select | f= field | b= button | rb= radioButton | cb= checkBox )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:25:3: s= select
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_in_htmlComponent103);
                    s=select();

                    state._fsp--;

                    adaptor.addChild(root_0, s.getTree());
                     retval.r_htmlcomponent = s.r_select; 

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:26:3: f= field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_htmlComponent113);
                    f=field();

                    state._fsp--;

                    adaptor.addChild(root_0, f.getTree());
                     retval.r_htmlcomponent = f.r_field; 

                    }
                    break;
                case 3 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:27:3: b= button
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_button_in_htmlComponent123);
                    b=button();

                    state._fsp--;

                    adaptor.addChild(root_0, b.getTree());
                     retval.r_htmlcomponent = b.r_button; 

                    }
                    break;
                case 4 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:28:3: rb= radioButton
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_radioButton_in_htmlComponent133);
                    rb=radioButton();

                    state._fsp--;

                    adaptor.addChild(root_0, rb.getTree());
                     retval.r_htmlcomponent = rb.r_radiobutton; 

                    }
                    break;
                case 5 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:29:3: cb= checkBox
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_checkBox_in_htmlComponent143);
                    cb=checkBox();

                    state._fsp--;

                    adaptor.addChild(root_0, cb.getTree());
                     retval.r_htmlcomponent = cb.r_checkbox; 

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
    // $ANTLR end "htmlComponent"

    public static class attributeReference_return extends ParserRuleReturnScope {
        public AttributeReference r_attributereference;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeReference"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:32:1: attributeReference returns [AttributeReference r_attributereference] : '{' attributeid= attributeId '}' ;
    public final UIGrammarParser.attributeReference_return attributeReference() throws RecognitionException {
        UIGrammarParser.attributeReference_return retval = new UIGrammarParser.attributeReference_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal6=null;
        Token char_literal7=null;
        UIGrammarParser.attributeId_return attributeid = null;


        Object char_literal6_tree=null;
        Object char_literal7_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:33:2: ( '{' attributeid= attributeId '}' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:33:4: '{' attributeid= attributeId '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal6=(Token)match(input,13,FOLLOW_13_in_attributeReference160); 
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);

            pushFollow(FOLLOW_attributeId_in_attributeReference164);
            attributeid=attributeId();

            state._fsp--;

            adaptor.addChild(root_0, attributeid.getTree());
            char_literal7=(Token)match(input,14,FOLLOW_14_in_attributeReference166); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);

             retval.r_attributereference = new AttributeReference(attributeid.r_attributeid); 

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
    // $ANTLR end "attributeReference"

    public static class attributeId_return extends ParserRuleReturnScope {
        public AttributeId r_attributeid;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeId"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:36:1: attributeId returns [AttributeId r_attributeid] : entity= multiWordID '.' (attribute= multiWordID | attributeid= attributeId ) ;
    public final UIGrammarParser.attributeId_return attributeId() throws RecognitionException {
        UIGrammarParser.attributeId_return retval = new UIGrammarParser.attributeId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        UIGrammarParser.multiWordID_return entity = null;

        UIGrammarParser.multiWordID_return attribute = null;

        UIGrammarParser.attributeId_return attributeid = null;


        Object char_literal8_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:37:2: (entity= multiWordID '.' (attribute= multiWordID | attributeid= attributeId ) )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:37:4: entity= multiWordID '.' (attribute= multiWordID | attributeid= attributeId )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiWordID_in_attributeId185);
            entity=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, entity.getTree());
            char_literal8=(Token)match(input,15,FOLLOW_15_in_attributeId187); 
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:37:27: (attribute= multiWordID | attributeid= attributeId )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:37:28: attribute= multiWordID
                    {
                    pushFollow(FOLLOW_multiWordID_in_attributeId192);
                    attribute=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:37:52: attributeid= attributeId
                    {
                    pushFollow(FOLLOW_attributeId_in_attributeId198);
                    attributeid=attributeId();

                    state._fsp--;

                    adaptor.addChild(root_0, attributeid.getTree());

                    }
                    break;

            }


            			if(attribute != null) {
            				retval.r_attributeid = new AttributeId(entity.r_multiwordid, attribute.r_multiwordid, null);
            			} else if(attributeid != null) {
            				retval.r_attributeid = new AttributeId(entity.r_multiwordid, null, attributeid.r_attributeid);
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
    // $ANTLR end "attributeId"

    public static class field_return extends ParserRuleReturnScope {
        public HTMLComponentField r_field;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:47:1: field returns [HTMLComponentField r_field] : 'Campo' type= FIELD_TYPE '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' ;
    public final UIGrammarParser.field_return field() throws RecognitionException {
        UIGrammarParser.field_return retval = new UIGrammarParser.field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token type=null;
        Token string_literal9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        UIGrammarParser.multiWordID_return name = null;

        UIGrammarParser.attributeReference_return attributereference = null;

        UIGrammarParser.writeOrReadOnly_return writeorread = null;


        Object type_tree=null;
        Object string_literal9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:48:2: ( 'Campo' type= FIELD_TYPE '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:49:3: 'Campo' type= FIELD_TYPE '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal9=(Token)match(input,16,FOLLOW_16_in_field221); 
            string_literal9_tree = (Object)adaptor.create(string_literal9);
            adaptor.addChild(root_0, string_literal9_tree);

            type=(Token)match(input,FIELD_TYPE,FOLLOW_FIELD_TYPE_in_field225); 
            type_tree = (Object)adaptor.create(type);
            adaptor.addChild(root_0, type_tree);

            char_literal10=(Token)match(input,11,FOLLOW_11_in_field227); 
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);

            pushFollow(FOLLOW_multiWordID_in_field231);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal11=(Token)match(input,11,FOLLOW_11_in_field233); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);

            pushFollow(FOLLOW_attributeReference_in_field237);
            attributereference=attributeReference();

            state._fsp--;

            adaptor.addChild(root_0, attributereference.getTree());
            pushFollow(FOLLOW_writeOrReadOnly_in_field241);
            writeorread=writeOrReadOnly();

            state._fsp--;

            adaptor.addChild(root_0, writeorread.getTree());
            char_literal12=(Token)match(input,17,FOLLOW_17_in_field243); 
            char_literal12_tree = (Object)adaptor.create(char_literal12);
            adaptor.addChild(root_0, char_literal12_tree);

             retval.r_field = new HTMLComponentField(type.getText(), name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); 

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
    // $ANTLR end "field"

    public static class button_return extends ParserRuleReturnScope {
        public HTMLComponentButton r_button;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "button"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:52:1: button returns [HTMLComponentButton r_button] : 'Botao' '\"' name= multiWordID '\"' 'Acao' '\"' action= multiWordID '\"' ';' ;
    public final UIGrammarParser.button_return button() throws RecognitionException {
        UIGrammarParser.button_return retval = new UIGrammarParser.button_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal19=null;
        UIGrammarParser.multiWordID_return name = null;

        UIGrammarParser.multiWordID_return action = null;


        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        Object string_literal16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal19_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:53:2: ( 'Botao' '\"' name= multiWordID '\"' 'Acao' '\"' action= multiWordID '\"' ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:54:3: 'Botao' '\"' name= multiWordID '\"' 'Acao' '\"' action= multiWordID '\"' ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal13=(Token)match(input,18,FOLLOW_18_in_button264); 
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);

            char_literal14=(Token)match(input,11,FOLLOW_11_in_button266); 
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);

            pushFollow(FOLLOW_multiWordID_in_button270);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal15=(Token)match(input,11,FOLLOW_11_in_button272); 
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            string_literal16=(Token)match(input,19,FOLLOW_19_in_button274); 
            string_literal16_tree = (Object)adaptor.create(string_literal16);
            adaptor.addChild(root_0, string_literal16_tree);

            char_literal17=(Token)match(input,11,FOLLOW_11_in_button276); 
            char_literal17_tree = (Object)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);

            pushFollow(FOLLOW_multiWordID_in_button280);
            action=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, action.getTree());
            char_literal18=(Token)match(input,11,FOLLOW_11_in_button282); 
            char_literal18_tree = (Object)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);

            char_literal19=(Token)match(input,17,FOLLOW_17_in_button284); 
            char_literal19_tree = (Object)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);

             retval.r_button = new HTMLComponentButton(name.r_multiwordid, action.r_multiwordid); 

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
    // $ANTLR end "button"

    public static class radioButton_return extends ParserRuleReturnScope {
        public HTMLComponentRadioButton r_radiobutton;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "radioButton"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:58:1: radioButton returns [HTMLComponentRadioButton r_radiobutton] : 'Radio' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' ;
    public final UIGrammarParser.radioButton_return radioButton() throws RecognitionException {
        UIGrammarParser.radioButton_return retval = new UIGrammarParser.radioButton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        UIGrammarParser.multiWordID_return name = null;

        UIGrammarParser.attributeReference_return attributereference = null;

        UIGrammarParser.writeOrReadOnly_return writeorread = null;


        Object string_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:59:2: ( 'Radio' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:60:3: 'Radio' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal20=(Token)match(input,20,FOLLOW_20_in_radioButton305); 
            string_literal20_tree = (Object)adaptor.create(string_literal20);
            adaptor.addChild(root_0, string_literal20_tree);

            char_literal21=(Token)match(input,11,FOLLOW_11_in_radioButton307); 
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            pushFollow(FOLLOW_multiWordID_in_radioButton311);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal22=(Token)match(input,11,FOLLOW_11_in_radioButton313); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

            pushFollow(FOLLOW_attributeReference_in_radioButton317);
            attributereference=attributeReference();

            state._fsp--;

            adaptor.addChild(root_0, attributereference.getTree());
            pushFollow(FOLLOW_writeOrReadOnly_in_radioButton321);
            writeorread=writeOrReadOnly();

            state._fsp--;

            adaptor.addChild(root_0, writeorread.getTree());
            char_literal23=(Token)match(input,17,FOLLOW_17_in_radioButton323); 
            char_literal23_tree = (Object)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);

             retval.r_radiobutton = new HTMLComponentRadioButton(name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); 

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
    // $ANTLR end "radioButton"

    public static class checkBox_return extends ParserRuleReturnScope {
        public HTMLComponentCheckBox r_checkbox;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "checkBox"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:63:1: checkBox returns [HTMLComponentCheckBox r_checkbox] : 'Checkbox' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' ;
    public final UIGrammarParser.checkBox_return checkBox() throws RecognitionException {
        UIGrammarParser.checkBox_return retval = new UIGrammarParser.checkBox_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        UIGrammarParser.multiWordID_return name = null;

        UIGrammarParser.attributeReference_return attributereference = null;

        UIGrammarParser.writeOrReadOnly_return writeorread = null;


        Object string_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:64:2: ( 'Checkbox' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:65:3: 'Checkbox' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal24=(Token)match(input,21,FOLLOW_21_in_checkBox343); 
            string_literal24_tree = (Object)adaptor.create(string_literal24);
            adaptor.addChild(root_0, string_literal24_tree);

            char_literal25=(Token)match(input,11,FOLLOW_11_in_checkBox345); 
            char_literal25_tree = (Object)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);

            pushFollow(FOLLOW_multiWordID_in_checkBox349);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal26=(Token)match(input,11,FOLLOW_11_in_checkBox351); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            pushFollow(FOLLOW_attributeReference_in_checkBox355);
            attributereference=attributeReference();

            state._fsp--;

            adaptor.addChild(root_0, attributereference.getTree());
            pushFollow(FOLLOW_writeOrReadOnly_in_checkBox359);
            writeorread=writeOrReadOnly();

            state._fsp--;

            adaptor.addChild(root_0, writeorread.getTree());
            char_literal27=(Token)match(input,17,FOLLOW_17_in_checkBox361); 
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);

             retval.r_checkbox = new HTMLComponentCheckBox(name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); 

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
    // $ANTLR end "checkBox"

    public static class select_return extends ParserRuleReturnScope {
        public HTMLComponentSelect r_select;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:68:1: select returns [HTMLComponentSelect r_select] : 'Select' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' ;
    public final UIGrammarParser.select_return select() throws RecognitionException {
        UIGrammarParser.select_return retval = new UIGrammarParser.select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        UIGrammarParser.multiWordID_return name = null;

        UIGrammarParser.attributeReference_return attributereference = null;

        UIGrammarParser.writeOrReadOnly_return writeorread = null;


        Object string_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:69:2: ( 'Select' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:70:3: 'Select' '\"' name= multiWordID '\"' attributereference= attributeReference writeorread= writeOrReadOnly ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal28=(Token)match(input,22,FOLLOW_22_in_select381); 
            string_literal28_tree = (Object)adaptor.create(string_literal28);
            adaptor.addChild(root_0, string_literal28_tree);

            char_literal29=(Token)match(input,11,FOLLOW_11_in_select383); 
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);

            pushFollow(FOLLOW_multiWordID_in_select387);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal30=(Token)match(input,11,FOLLOW_11_in_select389); 
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            pushFollow(FOLLOW_attributeReference_in_select393);
            attributereference=attributeReference();

            state._fsp--;

            adaptor.addChild(root_0, attributereference.getTree());
            pushFollow(FOLLOW_writeOrReadOnly_in_select397);
            writeorread=writeOrReadOnly();

            state._fsp--;

            adaptor.addChild(root_0, writeorread.getTree());
            char_literal31=(Token)match(input,17,FOLLOW_17_in_select399); 
            char_literal31_tree = (Object)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);

             retval.r_select = new HTMLComponentSelect(name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); 

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
    // $ANTLR end "select"

    public static class attributeReferenceList_return extends ParserRuleReturnScope {
        public List<AttributeReference> r_attributereferencelist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeReferenceList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:73:1: attributeReferenceList returns [List<AttributeReference> r_attributereferencelist] : attributereference= attributeReference ( ',' another= attributeReference )* ;
    public final UIGrammarParser.attributeReferenceList_return attributeReferenceList() throws RecognitionException {
        UIGrammarParser.attributeReferenceList_return retval = new UIGrammarParser.attributeReferenceList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal32=null;
        UIGrammarParser.attributeReference_return attributereference = null;

        UIGrammarParser.attributeReference_return another = null;


        Object char_literal32_tree=null;

         retval.r_attributereferencelist = new ArrayList<AttributeReference>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:75:2: (attributereference= attributeReference ( ',' another= attributeReference )* )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:76:3: attributereference= attributeReference ( ',' another= attributeReference )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_attributeReference_in_attributeReferenceList425);
            attributereference=attributeReference();

            state._fsp--;

            adaptor.addChild(root_0, attributereference.getTree());
             retval.r_attributereferencelist.add(attributereference.r_attributereference); 
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:77:3: ( ',' another= attributeReference )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:77:4: ',' another= attributeReference
            	    {
            	    char_literal32=(Token)match(input,23,FOLLOW_23_in_attributeReferenceList432); 
            	    char_literal32_tree = (Object)adaptor.create(char_literal32);
            	    adaptor.addChild(root_0, char_literal32_tree);

            	    pushFollow(FOLLOW_attributeReference_in_attributeReferenceList436);
            	    another=attributeReference();

            	    state._fsp--;

            	    adaptor.addChild(root_0, another.getTree());
            	     retval.r_attributereferencelist.add(another.r_attributereference); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // $ANTLR end "attributeReferenceList"

    public static class multiWordID_return extends ParserRuleReturnScope {
        public String r_multiwordid;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiWordID"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:80:1: multiWordID returns [String r_multiwordid] : (namepart= ID )+ ;
    public final UIGrammarParser.multiWordID_return multiWordID() throws RecognitionException {
        UIGrammarParser.multiWordID_return retval = new UIGrammarParser.multiWordID_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token namepart=null;

        Object namepart_tree=null;

         retval.r_multiwordid = new String(" "); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:82:2: ( (namepart= ID )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:83:3: (namepart= ID )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:83:3: (namepart= ID )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:83:4: namepart= ID
            	    {
            	    namepart=(Token)match(input,ID,FOLLOW_ID_in_multiWordID467); 
            	    namepart_tree = (Object)adaptor.create(namepart);
            	    adaptor.addChild(root_0, namepart_tree);

            	     retval.r_multiwordid = retval.r_multiwordid.concat(namepart.getText() + " "); 

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

             retval.r_multiwordid = retval.r_multiwordid.trim(); 

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
    // $ANTLR end "multiWordID"

    public static class writeOrReadOnly_return extends ParserRuleReturnScope {
        public String r_writeorreadonly;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "writeOrReadOnly"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:87:1: writeOrReadOnly returns [String r_writeorreadonly] : (write= 'Escrita' | readonly= 'Leitura' );
    public final UIGrammarParser.writeOrReadOnly_return writeOrReadOnly() throws RecognitionException {
        UIGrammarParser.writeOrReadOnly_return retval = new UIGrammarParser.writeOrReadOnly_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token write=null;
        Token readonly=null;

        Object write_tree=null;
        Object readonly_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:88:2: (write= 'Escrita' | readonly= 'Leitura' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:89:3: write= 'Escrita'
                    {
                    root_0 = (Object)adaptor.nil();

                    write=(Token)match(input,24,FOLLOW_24_in_writeOrReadOnly496); 
                    write_tree = (Object)adaptor.create(write);
                    adaptor.addChild(root_0, write_tree);

                     retval.r_writeorreadonly = write.getText(); 

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/UIGrammar.g:90:3: readonly= 'Leitura'
                    {
                    root_0 = (Object)adaptor.nil();

                    readonly=(Token)match(input,25,FOLLOW_25_in_writeOrReadOnly507); 
                    readonly_tree = (Object)adaptor.create(readonly);
                    adaptor.addChild(root_0, readonly_tree);

                     retval.r_writeorreadonly = readonly.getText(); 

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
    // $ANTLR end "writeOrReadOnly"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\5\2\uffff";
    static final String DFA3_maxS =
        "\1\5\1\17\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\1\10\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "37:27: (attribute= multiWordID | attributeid= attributeId )";
        }
    }
 

    public static final BitSet FOLLOW_9_in_uiPrototype35 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_uiPrototype37 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_uiPrototype39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_uiPrototype43 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_uiPrototype45 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_uiPrototype47 = new BitSet(new long[]{0x0000000000750000L});
    public static final BitSet FOLLOW_htmlComponentList_in_uiPrototype51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_htmlComponent_in_htmlComponentList79 = new BitSet(new long[]{0x0000000000750002L});
    public static final BitSet FOLLOW_select_in_htmlComponent103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_htmlComponent113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_button_in_htmlComponent123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radioButton_in_htmlComponent133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_checkBox_in_htmlComponent143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_attributeReference160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_attributeId_in_attributeReference164 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_attributeReference166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiWordID_in_attributeId185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_attributeId187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_attributeId192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeId_in_attributeId198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_field221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_FIELD_TYPE_in_field225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_field227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_field231 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_field233 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attributeReference_in_field237 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_writeOrReadOnly_in_field241 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_field243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_button264 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_button266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_button270 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_button272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_button274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_button276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_button280 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_button282 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_button284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_radioButton305 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_radioButton307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_radioButton311 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_radioButton313 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attributeReference_in_radioButton317 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_writeOrReadOnly_in_radioButton321 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_radioButton323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_checkBox343 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_checkBox345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_checkBox349 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_checkBox351 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attributeReference_in_checkBox355 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_writeOrReadOnly_in_checkBox359 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_checkBox361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_select381 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_select383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_multiWordID_in_select387 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_select389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attributeReference_in_select393 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_writeOrReadOnly_in_select397 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeReference_in_attributeReferenceList425 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_attributeReferenceList432 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attributeReference_in_attributeReferenceList436 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ID_in_multiWordID467 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24_in_writeOrReadOnly496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_writeOrReadOnly507 = new BitSet(new long[]{0x0000000000000002L});

}