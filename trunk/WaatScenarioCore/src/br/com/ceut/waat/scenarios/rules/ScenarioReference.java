package br.com.ceut.waat.scenarios.rules;

public class ScenarioReference {
	private String useCase;
	private String scenarioName;

	public ScenarioReference(String useCase, String scenarioName) {
		super();
		this.useCase = useCase;
		this.scenarioName = scenarioName;
	}

	public String getUseCase() {
		return useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	public String getScenarioName() {
		return scenarioName;
	}

	public void setScenarioName(String scenarioName) {
		this.scenarioName = scenarioName;
	}

}
