package br.com.ceut.waat.scenarios.rules;

import java.util.List;

import br.com.ceut.waat.ScenarioXMLHelper;
import br.com.ceut.waat.scenarios.ScenarioInterpreter;

public class Scenario {
	private int number;
	private String name;
	private PreCondition preCondition;
	private List<Step> stepList;

	public Scenario(int number, String name, PreCondition preCondition,
			List<Step> stepList) {
		super();
		this.number = number;
		this.name = name;
		this.preCondition = preCondition;
		this.stepList = stepList;
		
		ScenarioXMLHelper xmlhelper = new ScenarioXMLHelper();
		ScenarioInterpreter.setOutput(xmlhelper.toXML(this));
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PreCondition getPreCondition() {
		return preCondition;
	}

	public void setPreCondition(PreCondition preCondition) {
		this.preCondition = preCondition;
	}

	public List<Step> getStepList() {
		return stepList;
	}

	public void setStepList(List<Step> stepList) {
		this.stepList = stepList;
	}
}
