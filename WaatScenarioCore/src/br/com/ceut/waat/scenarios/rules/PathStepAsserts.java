package br.com.ceut.waat.scenarios.rules;

public class PathStepAsserts extends PathStep {
	private String actor;
	private Item item;

	public PathStepAsserts(String actor, Item item) {
		super();
		this.actor = actor;
		this.item = item;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
