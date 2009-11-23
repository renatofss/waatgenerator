// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g 2009-10-25 23:36:59

	package br.com.ceut.waat.scenarios;
	import br.com.ceut.waat.scenarios.rules.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ScenarioParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "ACTOR", "ACTION", "ID", "NEWLINE", "WHITESPACE", "'Cenario'", "'-'", "'\"'", "':'", "'Pre-Condicao:'", "';'", "'Executar'", "'.'", "'Ha'", "'caminhos'", "')'", "'valida'", "'{'", "'}'", "','", "'Link'", "'sessao'", "'Campo'", "'Select'", "'Botao'", "'Formulario'", "'Atributos'", "'Mensagem'"
    };
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
    public static final int NEWLINE=8;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int ACTOR=5;
    public static final int T__10=10;

    // delegates
    // delegators


        public ScenarioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ScenarioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ScenarioParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g"; }


    public static class scenario_return extends ParserRuleReturnScope {
        public Scenario r_scenario;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scenario"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:12:1: scenario returns [Scenario r_scenario] : 'Cenario' number= INT '-' '\"' name= multiWordID '\"' ':' (precondition= preCondition )? steplist= stepList ;
    public final ScenarioParser.scenario_return scenario() throws RecognitionException {
        ScenarioParser.scenario_return retval = new ScenarioParser.scenario_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token number=null;
        Token string_literal1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        Token char_literal4=null;
        Token char_literal5=null;
        ScenarioParser.multiWordID_return name = null;

        ScenarioParser.preCondition_return precondition = null;

        ScenarioParser.stepList_return steplist = null;


        Object number_tree=null;
        Object string_literal1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal5_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:13:2: ( 'Cenario' number= INT '-' '\"' name= multiWordID '\"' ':' (precondition= preCondition )? steplist= stepList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:13:4: 'Cenario' number= INT '-' '\"' name= multiWordID '\"' ':' (precondition= preCondition )? steplist= stepList
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,10,FOLLOW_10_in_scenario32); 
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);

            number=(Token)match(input,INT,FOLLOW_INT_in_scenario36); 
            number_tree = (Object)adaptor.create(number);
            adaptor.addChild(root_0, number_tree);

            char_literal2=(Token)match(input,11,FOLLOW_11_in_scenario38); 
            char_literal2_tree = (Object)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);

            char_literal3=(Token)match(input,12,FOLLOW_12_in_scenario40); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_multiWordID_in_scenario44);
            name=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, name.getTree());
            char_literal4=(Token)match(input,12,FOLLOW_12_in_scenario46); 
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);

            char_literal5=(Token)match(input,13,FOLLOW_13_in_scenario48); 
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:13:71: (precondition= preCondition )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:13:71: precondition= preCondition
                    {
                    pushFollow(FOLLOW_preCondition_in_scenario53);
                    precondition=preCondition();

                    state._fsp--;

                    adaptor.addChild(root_0, precondition.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_stepList_in_scenario58);
            steplist=stepList();

            state._fsp--;

            adaptor.addChild(root_0, steplist.getTree());
             
            			if(precondition != null) {
            				retval.r_scenario = new Scenario(Integer.parseInt(number.getText()), name.r_multiwordid, precondition.r_precondition, steplist.r_steplist); 
            			} else {
            				retval.r_scenario = new Scenario(Integer.parseInt(number.getText()), name.r_multiwordid, null, steplist.r_steplist); 
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
    // $ANTLR end "scenario"

    public static class preCondition_return extends ParserRuleReturnScope {
        public PreCondition r_precondition;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preCondition"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:23:1: preCondition returns [PreCondition r_precondition] : 'Pre-Condicao:' preconditionsteplist= preConditionStepList ;
    public final ScenarioParser.preCondition_return preCondition() throws RecognitionException {
        ScenarioParser.preCondition_return retval = new ScenarioParser.preCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal6=null;
        ScenarioParser.preConditionStepList_return preconditionsteplist = null;


        Object string_literal6_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:24:2: ( 'Pre-Condicao:' preconditionsteplist= preConditionStepList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:24:4: 'Pre-Condicao:' preconditionsteplist= preConditionStepList
            {
            root_0 = (Object)adaptor.nil();

            string_literal6=(Token)match(input,14,FOLLOW_14_in_preCondition77); 
            string_literal6_tree = (Object)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);

            pushFollow(FOLLOW_preConditionStepList_in_preCondition81);
            preconditionsteplist=preConditionStepList();

            state._fsp--;

            adaptor.addChild(root_0, preconditionsteplist.getTree());
             retval.r_precondition = new PreCondition(preconditionsteplist.r_preconditionsteplist); 

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
    // $ANTLR end "preCondition"

    public static class preConditionStepList_return extends ParserRuleReturnScope {
        public List<PreConditionStep> r_preconditionsteplist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preConditionStepList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:28:1: preConditionStepList returns [List<PreConditionStep> r_preconditionsteplist] : (preconditionstep= preConditionStep )+ ;
    public final ScenarioParser.preConditionStepList_return preConditionStepList() throws RecognitionException {
        ScenarioParser.preConditionStepList_return retval = new ScenarioParser.preConditionStepList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ScenarioParser.preConditionStep_return preconditionstep = null;



         retval.r_preconditionsteplist = new ArrayList<PreConditionStep>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:30:2: ( (preconditionstep= preConditionStep )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:30:4: (preconditionstep= preConditionStep )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:30:4: (preconditionstep= preConditionStep )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:30:5: preconditionstep= preConditionStep
            	    {
            	    pushFollow(FOLLOW_preConditionStep_in_preConditionStepList108);
            	    preconditionstep=preConditionStep();

            	    state._fsp--;

            	    adaptor.addChild(root_0, preconditionstep.getTree());
            	     retval.r_preconditionsteplist.add(preconditionstep.r_preconditionstep); 

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
    // $ANTLR end "preConditionStepList"

    public static class preConditionStep_return extends ParserRuleReturnScope {
        public PreConditionStep r_preconditionstep;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preConditionStep"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:33:1: preConditionStep returns [PreConditionStep r_preconditionstep] : '-' systemaction= systemAction ';' ;
    public final ScenarioParser.preConditionStep_return preConditionStep() throws RecognitionException {
        ScenarioParser.preConditionStep_return retval = new ScenarioParser.preConditionStep_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal7=null;
        Token char_literal8=null;
        ScenarioParser.systemAction_return systemaction = null;


        Object char_literal7_tree=null;
        Object char_literal8_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:34:2: ( '-' systemaction= systemAction ';' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:34:4: '-' systemaction= systemAction ';'
            {
            root_0 = (Object)adaptor.nil();

            char_literal7=(Token)match(input,11,FOLLOW_11_in_preConditionStep127); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);

            pushFollow(FOLLOW_systemAction_in_preConditionStep131);
            systemaction=systemAction();

            state._fsp--;

            adaptor.addChild(root_0, systemaction.getTree());
            char_literal8=(Token)match(input,15,FOLLOW_15_in_preConditionStep133); 
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);

             retval.r_preconditionstep = new PreConditionStep(systemaction.r_systemaction); 

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
    // $ANTLR end "preConditionStep"

    public static class systemAction_return extends ParserRuleReturnScope {
        public SystemAction r_systemaction;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "systemAction"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:37:1: systemAction returns [SystemAction r_systemaction] : 'Executar' scenarioreference= scenarioReference ;
    public final ScenarioParser.systemAction_return systemAction() throws RecognitionException {
        ScenarioParser.systemAction_return retval = new ScenarioParser.systemAction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal9=null;
        ScenarioParser.scenarioReference_return scenarioreference = null;


        Object string_literal9_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:38:2: ( 'Executar' scenarioreference= scenarioReference )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:38:4: 'Executar' scenarioreference= scenarioReference
            {
            root_0 = (Object)adaptor.nil();

            string_literal9=(Token)match(input,16,FOLLOW_16_in_systemAction150); 
            string_literal9_tree = (Object)adaptor.create(string_literal9);
            adaptor.addChild(root_0, string_literal9_tree);

            pushFollow(FOLLOW_scenarioReference_in_systemAction154);
            scenarioreference=scenarioReference();

            state._fsp--;

            adaptor.addChild(root_0, scenarioreference.getTree());
             retval.r_systemaction = new SystemAction(scenarioreference.r_scenarioreference); 

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
    // $ANTLR end "systemAction"

    public static class scenarioReference_return extends ParserRuleReturnScope {
        public ScenarioReference r_scenarioreference;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scenarioReference"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:41:1: scenarioReference returns [ScenarioReference r_scenarioreference] : usecasename= multiWordID '.' scenarioname= multiWordID ;
    public final ScenarioParser.scenarioReference_return scenarioReference() throws RecognitionException {
        ScenarioParser.scenarioReference_return retval = new ScenarioParser.scenarioReference_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        ScenarioParser.multiWordID_return usecasename = null;

        ScenarioParser.multiWordID_return scenarioname = null;


        Object char_literal10_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:42:2: (usecasename= multiWordID '.' scenarioname= multiWordID )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:42:4: usecasename= multiWordID '.' scenarioname= multiWordID
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiWordID_in_scenarioReference173);
            usecasename=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, usecasename.getTree());
            char_literal10=(Token)match(input,17,FOLLOW_17_in_scenarioReference175); 
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);

            pushFollow(FOLLOW_multiWordID_in_scenarioReference179);
            scenarioname=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, scenarioname.getTree());
             retval.r_scenarioreference = new ScenarioReference(usecasename.r_multiwordid, scenarioname.r_multiwordid); 

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
    // $ANTLR end "scenarioReference"

    public static class stepList_return extends ParserRuleReturnScope {
        public List<Step> r_steplist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stepList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:45:1: stepList returns [List<Step> r_steplist] : (s= step )+ ;
    public final ScenarioParser.stepList_return stepList() throws RecognitionException {
        ScenarioParser.stepList_return retval = new ScenarioParser.stepList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ScenarioParser.step_return s = null;



         retval.r_steplist = new ArrayList<Step>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:47:2: ( (s= step )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:47:4: (s= step )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:47:4: (s= step )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:47:5: s= step
            	    {
            	    pushFollow(FOLLOW_step_in_stepList204);
            	    s=step();

            	    state._fsp--;

            	    adaptor.addChild(root_0, s.getTree());
            	     retval.r_steplist.add(s.r_step); 

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
    // $ANTLR end "stepList"

    public static class step_return extends ParserRuleReturnScope {
        public Step r_step;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "step"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:50:1: step returns [Step r_step] : (number= stepId actor= ACTOR action= ACTION i= item ';' | number= stepId multiplePaths );
    public final ScenarioParser.step_return step() throws RecognitionException {
        ScenarioParser.step_return retval = new ScenarioParser.step_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token actor=null;
        Token action=null;
        Token char_literal11=null;
        ScenarioParser.stepId_return number = null;

        ScenarioParser.item_return i = null;

        ScenarioParser.multiplePaths_return multiplePaths12 = null;


        Object actor_tree=null;
        Object action_tree=null;
        Object char_literal11_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:51:2: (number= stepId actor= ACTOR action= ACTION i= item ';' | number= stepId multiplePaths )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==ACTOR) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:51:4: number= stepId actor= ACTOR action= ACTION i= item ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stepId_in_step225);
                    number=stepId();

                    state._fsp--;

                    adaptor.addChild(root_0, number.getTree());
                    actor=(Token)match(input,ACTOR,FOLLOW_ACTOR_in_step229); 
                    actor_tree = (Object)adaptor.create(actor);
                    adaptor.addChild(root_0, actor_tree);

                    action=(Token)match(input,ACTION,FOLLOW_ACTION_in_step233); 
                    action_tree = (Object)adaptor.create(action);
                    adaptor.addChild(root_0, action_tree);

                    pushFollow(FOLLOW_item_in_step237);
                    i=item();

                    state._fsp--;

                    adaptor.addChild(root_0, i.getTree());
                    char_literal11=(Token)match(input,15,FOLLOW_15_in_step239); 
                    char_literal11_tree = (Object)adaptor.create(char_literal11);
                    adaptor.addChild(root_0, char_literal11_tree);

                     retval.r_step = new SimpleStep(number.r_stepid, actor.getText(), action.getText(), i.r_item); 

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:52:3: number= stepId multiplePaths
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stepId_in_step248);
                    number=stepId();

                    state._fsp--;

                    adaptor.addChild(root_0, number.getTree());
                    pushFollow(FOLLOW_multiplePaths_in_step250);
                    multiplePaths12=multiplePaths();

                    state._fsp--;

                    adaptor.addChild(root_0, multiplePaths12.getTree());

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
    // $ANTLR end "step"

    public static class stepId_return extends ParserRuleReturnScope {
        public String r_stepid;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stepId"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:55:1: stepId returns [String r_stepid] : id= INT '.' ;
    public final ScenarioParser.stepId_return stepId() throws RecognitionException {
        ScenarioParser.stepId_return retval = new ScenarioParser.stepId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token char_literal13=null;

        Object id_tree=null;
        Object char_literal13_tree=null;

         retval.r_stepid = new String(""); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:57:2: (id= INT '.' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:57:4: id= INT '.'
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)match(input,INT,FOLLOW_INT_in_stepId272); 
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);

             retval.r_stepid =  retval.r_stepid.concat(id.getText()); 
            char_literal13=(Token)match(input,17,FOLLOW_17_in_stepId276); 
            char_literal13_tree = (Object)adaptor.create(char_literal13);
            adaptor.addChild(root_0, char_literal13_tree);


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
    // $ANTLR end "stepId"

    public static class multiplePaths_return extends ParserRuleReturnScope {
        public MultiplePaths r_multiplepaths;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplePaths"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:62:1: multiplePaths returns [MultiplePaths r_multiplepaths] : 'Ha' quantity= INT 'caminhos' ':' pathlist= pathList ;
    public final ScenarioParser.multiplePaths_return multiplePaths() throws RecognitionException {
        ScenarioParser.multiplePaths_return retval = new ScenarioParser.multiplePaths_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token quantity=null;
        Token string_literal14=null;
        Token string_literal15=null;
        Token char_literal16=null;
        ScenarioParser.pathList_return pathlist = null;


        Object quantity_tree=null;
        Object string_literal14_tree=null;
        Object string_literal15_tree=null;
        Object char_literal16_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:63:2: ( 'Ha' quantity= INT 'caminhos' ':' pathlist= pathList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:63:4: 'Ha' quantity= INT 'caminhos' ':' pathlist= pathList
            {
            root_0 = (Object)adaptor.nil();

            string_literal14=(Token)match(input,18,FOLLOW_18_in_multiplePaths298); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            quantity=(Token)match(input,INT,FOLLOW_INT_in_multiplePaths302); 
            quantity_tree = (Object)adaptor.create(quantity);
            adaptor.addChild(root_0, quantity_tree);

            string_literal15=(Token)match(input,19,FOLLOW_19_in_multiplePaths304); 
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);

            char_literal16=(Token)match(input,13,FOLLOW_13_in_multiplePaths306); 
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            pushFollow(FOLLOW_pathList_in_multiplePaths310);
            pathlist=pathList();

            state._fsp--;

            adaptor.addChild(root_0, pathlist.getTree());
             retval.r_multiplepaths = new MultiplePaths(Integer.parseInt(quantity.getText()), pathlist.r_pathlist); 

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
    // $ANTLR end "multiplePaths"

    public static class pathList_return extends ParserRuleReturnScope {
        public List<Path> r_pathlist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:66:1: pathList returns [List<Path> r_pathlist] : (p= path )+ ;
    public final ScenarioParser.pathList_return pathList() throws RecognitionException {
        ScenarioParser.pathList_return retval = new ScenarioParser.pathList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ScenarioParser.path_return p = null;



         retval.r_pathlist = new ArrayList<Path>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:68:2: ( (p= path )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:68:4: (p= path )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:68:4: (p= path )+
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
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:68:5: p= path
            	    {
            	    pushFollow(FOLLOW_path_in_pathList335);
            	    p=path();

            	    state._fsp--;

            	    adaptor.addChild(root_0, p.getTree());
            	     retval.r_pathlist.add(p.r_path); 

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
    // $ANTLR end "pathList"

    public static class path_return extends ParserRuleReturnScope {
        public Path r_path;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "path"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:71:1: path returns [Path r_path] : id= ID ')' actor= ACTOR action= ACTION i= item ':' pathsteplist= pathStepList ;
    public final ScenarioParser.path_return path() throws RecognitionException {
        ScenarioParser.path_return retval = new ScenarioParser.path_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token actor=null;
        Token action=null;
        Token char_literal17=null;
        Token char_literal18=null;
        ScenarioParser.item_return i = null;

        ScenarioParser.pathStepList_return pathsteplist = null;


        Object id_tree=null;
        Object actor_tree=null;
        Object action_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:72:2: (id= ID ')' actor= ACTOR action= ACTION i= item ':' pathsteplist= pathStepList )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:73:3: id= ID ')' actor= ACTOR action= ACTION i= item ':' pathsteplist= pathStepList
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)match(input,ID,FOLLOW_ID_in_path359); 
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);

            char_literal17=(Token)match(input,20,FOLLOW_20_in_path361); 
            char_literal17_tree = (Object)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);

            actor=(Token)match(input,ACTOR,FOLLOW_ACTOR_in_path365); 
            actor_tree = (Object)adaptor.create(actor);
            adaptor.addChild(root_0, actor_tree);

            action=(Token)match(input,ACTION,FOLLOW_ACTION_in_path369); 
            action_tree = (Object)adaptor.create(action);
            adaptor.addChild(root_0, action_tree);

            pushFollow(FOLLOW_item_in_path373);
            i=item();

            state._fsp--;

            adaptor.addChild(root_0, i.getTree());
            char_literal18=(Token)match(input,13,FOLLOW_13_in_path375); 
            char_literal18_tree = (Object)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);

            pushFollow(FOLLOW_pathStepList_in_path379);
            pathsteplist=pathStepList();

            state._fsp--;

            adaptor.addChild(root_0, pathsteplist.getTree());
             retval.r_path = new Path(id.getText(), actor.getText(), action.getText(), i.r_item, pathsteplist.r_pathsteplist); 

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
    // $ANTLR end "path"

    public static class pathStepList_return extends ParserRuleReturnScope {
        public List<PathStep> r_pathsteplist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathStepList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:77:1: pathStepList returns [List<PathStep> r_pathsteplist] : (pathstep= pathStep )+ ;
    public final ScenarioParser.pathStepList_return pathStepList() throws RecognitionException {
        ScenarioParser.pathStepList_return retval = new ScenarioParser.pathStepList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ScenarioParser.pathStep_return pathstep = null;



         retval.r_pathsteplist = new ArrayList<PathStep>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:79:2: ( (pathstep= pathStep )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:79:4: (pathstep= pathStep )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:79:4: (pathstep= pathStep )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:79:5: pathstep= pathStep
            	    {
            	    pushFollow(FOLLOW_pathStep_in_pathStepList406);
            	    pathstep=pathStep();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pathstep.getTree());
            	     retval.r_pathsteplist.add(pathstep.r_pathstep); 

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
    // $ANTLR end "pathStepList"

    public static class pathStep_return extends ParserRuleReturnScope {
        public PathStep r_pathstep;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathStep"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:82:1: pathStep returns [PathStep r_pathstep] : (psaction= pathStepAction ';' | psasserts= pathStepAsserts ';' );
    public final ScenarioParser.pathStep_return pathStep() throws RecognitionException {
        ScenarioParser.pathStep_return retval = new ScenarioParser.pathStep_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;
        Token char_literal20=null;
        ScenarioParser.pathStepAction_return psaction = null;

        ScenarioParser.pathStepAsserts_return psasserts = null;


        Object char_literal19_tree=null;
        Object char_literal20_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:83:2: (psaction= pathStepAction ';' | psasserts= pathStepAsserts ';' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ACTOR) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==ACTION) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==21) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:84:3: psaction= pathStepAction ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathStepAction_in_pathStep430);
                    psaction=pathStepAction();

                    state._fsp--;

                    adaptor.addChild(root_0, psaction.getTree());
                    char_literal19=(Token)match(input,15,FOLLOW_15_in_pathStep432); 
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);

                     retval.r_pathstep = psaction.r_pathstepaction; 

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:85:3: psasserts= pathStepAsserts ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathStepAsserts_in_pathStep442);
                    psasserts=pathStepAsserts();

                    state._fsp--;

                    adaptor.addChild(root_0, psasserts.getTree());
                    char_literal20=(Token)match(input,15,FOLLOW_15_in_pathStep444); 
                    char_literal20_tree = (Object)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);

                     retval.r_pathstep = psasserts.r_pathstepasserts; 

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
    // $ANTLR end "pathStep"

    public static class pathStepAction_return extends ParserRuleReturnScope {
        public PathStepAction r_pathstepaction;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathStepAction"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:88:1: pathStepAction returns [PathStepAction r_pathstepaction] : '-' actor= ACTOR action= ACTION i= item ;
    public final ScenarioParser.pathStepAction_return pathStepAction() throws RecognitionException {
        ScenarioParser.pathStepAction_return retval = new ScenarioParser.pathStepAction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token actor=null;
        Token action=null;
        Token char_literal21=null;
        ScenarioParser.item_return i = null;


        Object actor_tree=null;
        Object action_tree=null;
        Object char_literal21_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:89:2: ( '-' actor= ACTOR action= ACTION i= item )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:89:4: '-' actor= ACTOR action= ACTION i= item
            {
            root_0 = (Object)adaptor.nil();

            char_literal21=(Token)match(input,11,FOLLOW_11_in_pathStepAction461); 
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            actor=(Token)match(input,ACTOR,FOLLOW_ACTOR_in_pathStepAction465); 
            actor_tree = (Object)adaptor.create(actor);
            adaptor.addChild(root_0, actor_tree);

            action=(Token)match(input,ACTION,FOLLOW_ACTION_in_pathStepAction469); 
            action_tree = (Object)adaptor.create(action);
            adaptor.addChild(root_0, action_tree);

            pushFollow(FOLLOW_item_in_pathStepAction473);
            i=item();

            state._fsp--;

            adaptor.addChild(root_0, i.getTree());
             retval.r_pathstepaction = new PathStepAction(actor.getText(), action.getText(), i.r_item); 

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
    // $ANTLR end "pathStepAction"

    public static class pathStepAsserts_return extends ParserRuleReturnScope {
        public PathStepAsserts r_pathstepasserts;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathStepAsserts"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:92:1: pathStepAsserts returns [PathStepAsserts r_pathstepasserts] : '-' actor= ACTOR 'valida' i= item ;
    public final ScenarioParser.pathStepAsserts_return pathStepAsserts() throws RecognitionException {
        ScenarioParser.pathStepAsserts_return retval = new ScenarioParser.pathStepAsserts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token actor=null;
        Token char_literal22=null;
        Token string_literal23=null;
        ScenarioParser.item_return i = null;


        Object actor_tree=null;
        Object char_literal22_tree=null;
        Object string_literal23_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:93:2: ( '-' actor= ACTOR 'valida' i= item )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:93:4: '-' actor= ACTOR 'valida' i= item
            {
            root_0 = (Object)adaptor.nil();

            char_literal22=(Token)match(input,11,FOLLOW_11_in_pathStepAsserts491); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

            actor=(Token)match(input,ACTOR,FOLLOW_ACTOR_in_pathStepAsserts495); 
            actor_tree = (Object)adaptor.create(actor);
            adaptor.addChild(root_0, actor_tree);

            string_literal23=(Token)match(input,21,FOLLOW_21_in_pathStepAsserts497); 
            string_literal23_tree = (Object)adaptor.create(string_literal23);
            adaptor.addChild(root_0, string_literal23_tree);

            pushFollow(FOLLOW_item_in_pathStepAsserts501);
            i=item();

            state._fsp--;

            adaptor.addChild(root_0, i.getTree());
             retval.r_pathstepasserts = new PathStepAsserts(actor.getText(), i.r_item); 

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
    // $ANTLR end "pathStepAsserts"

    public static class attributeReference_return extends ParserRuleReturnScope {
        public AttributeReference r_attributereference;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeReference"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:98:1: attributeReference returns [AttributeReference r_attributereference] : '{' attributeid= attributeId '}' ;
    public final ScenarioParser.attributeReference_return attributeReference() throws RecognitionException {
        ScenarioParser.attributeReference_return retval = new ScenarioParser.attributeReference_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal24=null;
        Token char_literal25=null;
        ScenarioParser.attributeId_return attributeid = null;


        Object char_literal24_tree=null;
        Object char_literal25_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:99:2: ( '{' attributeid= attributeId '}' )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:99:4: '{' attributeid= attributeId '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal24=(Token)match(input,22,FOLLOW_22_in_attributeReference520); 
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);

            pushFollow(FOLLOW_attributeId_in_attributeReference524);
            attributeid=attributeId();

            state._fsp--;

            adaptor.addChild(root_0, attributeid.getTree());
            char_literal25=(Token)match(input,23,FOLLOW_23_in_attributeReference526); 
            char_literal25_tree = (Object)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);

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
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:102:1: attributeId returns [AttributeId r_attributeid] : entity= multiWordID '.' (attribute= multiWordID | attributeid= attributeId ) ;
    public final ScenarioParser.attributeId_return attributeId() throws RecognitionException {
        ScenarioParser.attributeId_return retval = new ScenarioParser.attributeId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        ScenarioParser.multiWordID_return entity = null;

        ScenarioParser.multiWordID_return attribute = null;

        ScenarioParser.attributeId_return attributeid = null;


        Object char_literal26_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:103:2: (entity= multiWordID '.' (attribute= multiWordID | attributeid= attributeId ) )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:103:4: entity= multiWordID '.' (attribute= multiWordID | attributeid= attributeId )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiWordID_in_attributeId545);
            entity=multiWordID();

            state._fsp--;

            adaptor.addChild(root_0, entity.getTree());
            char_literal26=(Token)match(input,17,FOLLOW_17_in_attributeId547); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:103:27: (attribute= multiWordID | attributeid= attributeId )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:103:28: attribute= multiWordID
                    {
                    pushFollow(FOLLOW_multiWordID_in_attributeId552);
                    attribute=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:103:52: attributeid= attributeId
                    {
                    pushFollow(FOLLOW_attributeId_in_attributeId558);
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

    public static class attributeReferenceList_return extends ParserRuleReturnScope {
        public List<AttributeReference> r_attributereferencelist;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeReferenceList"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:113:1: attributeReferenceList returns [List<AttributeReference> r_attributereferencelist] : attributereference= attributeReference ( ',' another= attributeReference )* ;
    public final ScenarioParser.attributeReferenceList_return attributeReferenceList() throws RecognitionException {
        ScenarioParser.attributeReferenceList_return retval = new ScenarioParser.attributeReferenceList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal27=null;
        ScenarioParser.attributeReference_return attributereference = null;

        ScenarioParser.attributeReference_return another = null;


        Object char_literal27_tree=null;

         retval.r_attributereferencelist = new ArrayList<AttributeReference>(); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:115:2: (attributereference= attributeReference ( ',' another= attributeReference )* )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:116:3: attributereference= attributeReference ( ',' another= attributeReference )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_attributeReference_in_attributeReferenceList588);
            attributereference=attributeReference();

            state._fsp--;

            adaptor.addChild(root_0, attributereference.getTree());
             retval.r_attributereferencelist.add(attributereference.r_attributereference); 
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:117:3: ( ',' another= attributeReference )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:117:4: ',' another= attributeReference
            	    {
            	    char_literal27=(Token)match(input,24,FOLLOW_24_in_attributeReferenceList595); 
            	    char_literal27_tree = (Object)adaptor.create(char_literal27);
            	    adaptor.addChild(root_0, char_literal27_tree);

            	    pushFollow(FOLLOW_attributeReference_in_attributeReferenceList599);
            	    another=attributeReference();

            	    state._fsp--;

            	    adaptor.addChild(root_0, another.getTree());
            	     retval.r_attributereferencelist.add(another.r_attributereference); 

            	    }
            	    break;

            	default :
            	    break loop9;
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

    public static class item_return extends ParserRuleReturnScope {
        public Item r_item;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:120:1: item returns [Item r_item] : ( 'Link' '\"' name= multiWordID '\"' 'sessao' session= multiWordID | 'Campo' '\"' name= multiWordID '\"' | 'Select' '\"' name= multiWordID '\"' | 'Botao' '\"' name= multiWordID '\"' | 'Formulario' | 'Atributos' | 'Mensagem' '\"' name= multiWordID '\"' );
    public final ScenarioParser.item_return item() throws RecognitionException {
        ScenarioParser.item_return retval = new ScenarioParser.item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token string_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        ScenarioParser.multiWordID_return name = null;

        ScenarioParser.multiWordID_return session = null;


        Object string_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object string_literal31_tree=null;
        Object string_literal32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object string_literal35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal37_tree=null;
        Object string_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        Object string_literal41_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;

        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:121:2: ( 'Link' '\"' name= multiWordID '\"' 'sessao' session= multiWordID | 'Campo' '\"' name= multiWordID '\"' | 'Select' '\"' name= multiWordID '\"' | 'Botao' '\"' name= multiWordID '\"' | 'Formulario' | 'Atributos' | 'Mensagem' '\"' name= multiWordID '\"' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 29:
                {
                alt10=4;
                }
                break;
            case 30:
                {
                alt10=5;
                }
                break;
            case 31:
                {
                alt10=6;
                }
                break;
            case 32:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:122:3: 'Link' '\"' name= multiWordID '\"' 'sessao' session= multiWordID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal28=(Token)match(input,25,FOLLOW_25_in_item622); 
                    string_literal28_tree = (Object)adaptor.create(string_literal28);
                    adaptor.addChild(root_0, string_literal28_tree);

                    char_literal29=(Token)match(input,12,FOLLOW_12_in_item624); 
                    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);

                    pushFollow(FOLLOW_multiWordID_in_item628);
                    name=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());
                    char_literal30=(Token)match(input,12,FOLLOW_12_in_item630); 
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);

                    string_literal31=(Token)match(input,26,FOLLOW_26_in_item632); 
                    string_literal31_tree = (Object)adaptor.create(string_literal31);
                    adaptor.addChild(root_0, string_literal31_tree);

                    pushFollow(FOLLOW_multiWordID_in_item636);
                    session=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, session.getTree());
                     retval.r_item = new ItemLink("Link", name.r_multiwordid, session.r_multiwordid); 

                    }
                    break;
                case 2 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:123:3: 'Campo' '\"' name= multiWordID '\"'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal32=(Token)match(input,27,FOLLOW_27_in_item644); 
                    string_literal32_tree = (Object)adaptor.create(string_literal32);
                    adaptor.addChild(root_0, string_literal32_tree);

                    char_literal33=(Token)match(input,12,FOLLOW_12_in_item646); 
                    char_literal33_tree = (Object)adaptor.create(char_literal33);
                    adaptor.addChild(root_0, char_literal33_tree);

                    pushFollow(FOLLOW_multiWordID_in_item650);
                    name=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());
                    char_literal34=(Token)match(input,12,FOLLOW_12_in_item652); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);

                     retval.r_item = new ItemField("Campo", name.r_multiwordid); 

                    }
                    break;
                case 3 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:124:3: 'Select' '\"' name= multiWordID '\"'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal35=(Token)match(input,28,FOLLOW_28_in_item660); 
                    string_literal35_tree = (Object)adaptor.create(string_literal35);
                    adaptor.addChild(root_0, string_literal35_tree);

                    char_literal36=(Token)match(input,12,FOLLOW_12_in_item662); 
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);

                    pushFollow(FOLLOW_multiWordID_in_item666);
                    name=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());
                    char_literal37=(Token)match(input,12,FOLLOW_12_in_item668); 
                    char_literal37_tree = (Object)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);

                     retval.r_item = new ItemSelect("Select", name.r_multiwordid); 

                    }
                    break;
                case 4 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:125:3: 'Botao' '\"' name= multiWordID '\"'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal38=(Token)match(input,29,FOLLOW_29_in_item676); 
                    string_literal38_tree = (Object)adaptor.create(string_literal38);
                    adaptor.addChild(root_0, string_literal38_tree);

                    char_literal39=(Token)match(input,12,FOLLOW_12_in_item678); 
                    char_literal39_tree = (Object)adaptor.create(char_literal39);
                    adaptor.addChild(root_0, char_literal39_tree);

                    pushFollow(FOLLOW_multiWordID_in_item682);
                    name=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());
                    char_literal40=(Token)match(input,12,FOLLOW_12_in_item684); 
                    char_literal40_tree = (Object)adaptor.create(char_literal40);
                    adaptor.addChild(root_0, char_literal40_tree);

                     retval.r_item = new ItemButton("Botao", name.r_multiwordid); 

                    }
                    break;
                case 5 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:126:3: 'Formulario'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal41=(Token)match(input,30,FOLLOW_30_in_item692); 
                    string_literal41_tree = (Object)adaptor.create(string_literal41);
                    adaptor.addChild(root_0, string_literal41_tree);

                     retval.r_item = new ItemForm("Formulario"); 

                    }
                    break;
                case 6 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:127:3: 'Atributos'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal42=(Token)match(input,31,FOLLOW_31_in_item700); 
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);

                     retval.r_item = new ItemAttributes("Atributos"); 

                    }
                    break;
                case 7 :
                    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:128:3: 'Mensagem' '\"' name= multiWordID '\"'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)match(input,32,FOLLOW_32_in_item708); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);

                    char_literal44=(Token)match(input,12,FOLLOW_12_in_item710); 
                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);

                    pushFollow(FOLLOW_multiWordID_in_item714);
                    name=multiWordID();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());
                    char_literal45=(Token)match(input,12,FOLLOW_12_in_item716); 
                    char_literal45_tree = (Object)adaptor.create(char_literal45);
                    adaptor.addChild(root_0, char_literal45_tree);

                     retval.r_item = new ItemMessage("Mensagem", name.r_multiwordid); 

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
    // $ANTLR end "item"

    public static class multiWordID_return extends ParserRuleReturnScope {
        public String r_multiwordid;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiWordID"
    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:131:1: multiWordID returns [String r_multiwordid] : (namepart= ID )+ ;
    public final ScenarioParser.multiWordID_return multiWordID() throws RecognitionException {
        ScenarioParser.multiWordID_return retval = new ScenarioParser.multiWordID_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token namepart=null;

        Object namepart_tree=null;

         retval.r_multiwordid = new String(" "); 
        try {
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:133:2: ( (namepart= ID )+ )
            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:134:3: (namepart= ID )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:134:3: (namepart= ID )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/ernesto/Documents/CEUT/WaatGramaticas/Scenario.g:134:4: namepart= ID
            	    {
            	    namepart=(Token)match(input,ID,FOLLOW_ID_in_multiWordID744); 
            	    namepart_tree = (Object)adaptor.create(namepart);
            	    adaptor.addChild(root_0, namepart_tree);

            	     retval.r_multiwordid = retval.r_multiwordid.concat(namepart.getText() + " "); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\2\7\2\uffff";
    static final String DFA8_maxS =
        "\1\7\1\27\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\1\11\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "103:27: (attribute= multiWordID | attributeid= attributeId )";
        }
    }
 

    public static final BitSet FOLLOW_10_in_scenario32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_scenario36 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_scenario38 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_scenario40 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_scenario44 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_scenario46 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_scenario48 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_preCondition_in_scenario53 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_stepList_in_scenario58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_preCondition77 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_preConditionStepList_in_preCondition81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preConditionStep_in_preConditionStepList108 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_preConditionStep127 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_systemAction_in_preConditionStep131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_preConditionStep133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_systemAction150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scenarioReference_in_systemAction154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiWordID_in_scenarioReference173 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_scenarioReference175 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_scenarioReference179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_stepList204 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_stepId_in_step225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ACTOR_in_step229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ACTION_in_step233 = new BitSet(new long[]{0x00000001FA000000L});
    public static final BitSet FOLLOW_item_in_step237 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_step239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepId_in_step248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_multiplePaths_in_step250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_stepId272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_stepId276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_multiplePaths298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_multiplePaths302 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_multiplePaths304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_multiplePaths306 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_pathList_in_multiplePaths310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_pathList335 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_path359 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_path361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ACTOR_in_path365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ACTION_in_path369 = new BitSet(new long[]{0x00000001FA000000L});
    public static final BitSet FOLLOW_item_in_path373 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_path375 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_pathStepList_in_path379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathStep_in_pathStepList406 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_pathStepAction_in_pathStep430 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pathStep432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathStepAsserts_in_pathStep442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pathStep444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_pathStepAction461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ACTOR_in_pathStepAction465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ACTION_in_pathStepAction469 = new BitSet(new long[]{0x00000001FA000000L});
    public static final BitSet FOLLOW_item_in_pathStepAction473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_pathStepAsserts491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ACTOR_in_pathStepAsserts495 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pathStepAsserts497 = new BitSet(new long[]{0x00000001FA000000L});
    public static final BitSet FOLLOW_item_in_pathStepAsserts501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_attributeReference520 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_attributeId_in_attributeReference524 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_attributeReference526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiWordID_in_attributeId545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attributeId547 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_attributeId552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeId_in_attributeId558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeReference_in_attributeReferenceList588 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_attributeReferenceList595 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_attributeReference_in_attributeReferenceList599 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25_in_item622 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item624 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_item628 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item630 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_item632 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_item636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_item644 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_item650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_item660 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item662 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_item666 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_item676 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item678 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_item682 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_item692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_item700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_item708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item710 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_multiWordID_in_item714 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_multiWordID744 = new BitSet(new long[]{0x0000000000000082L});

}