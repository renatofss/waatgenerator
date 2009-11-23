package br.com.ceut.waat.scenarios.rules;

public class PathStepAction extends PathStep {
	private String actor;
	private String action;
	private Item item;

	public PathStepAction(String actor, String action, Item item) {
		super();
		this.actor = actor;
		this.action = action;
		this.item = item;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
