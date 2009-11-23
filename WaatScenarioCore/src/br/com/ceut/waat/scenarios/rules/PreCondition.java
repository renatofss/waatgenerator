package br.com.ceut.waat.scenarios.rules;

import java.util.List;

public class PreCondition {
	private List<PreConditionStep> preCondtionStepList;

	public PreCondition(List<PreConditionStep> preCondtionStepList) {
		super();
		this.preCondtionStepList = preCondtionStepList;
	}

	public List<PreConditionStep> getPreCondtionStepList() {
		return preCondtionStepList;
	}

	public void setPreCondtionStepList(
			List<PreConditionStep> preCondtionStepList) {
		this.preCondtionStepList = preCondtionStepList;
	}

}
