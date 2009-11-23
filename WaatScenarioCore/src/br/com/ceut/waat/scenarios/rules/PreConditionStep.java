package br.com.ceut.waat.scenarios.rules;

public class PreConditionStep {
	private SystemAction systemAction;

	public PreConditionStep(SystemAction systemAction) {
		super();
		this.systemAction = systemAction;
	}

	public SystemAction getSystemAction() {
		return systemAction;
	}

	public void setSystemAction(SystemAction systemAction) {
		this.systemAction = systemAction;
	}

}
