package br.com.ceut.waat.scenarios.rules;

public class SystemAction {
	private ScenarioReference scenarioReference;

	public SystemAction(ScenarioReference scenarioReference) {
		super();
		this.scenarioReference = scenarioReference;
	}

	public ScenarioReference getScenarioReference() {
		return scenarioReference;
	}

	public void setScenarioReference(ScenarioReference scenarioReference) {
		this.scenarioReference = scenarioReference;
	}

}
