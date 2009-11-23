package br.com.ceut.waat.scenarios.rules;

public class SimpleStep extends Step {
	private String number;
	private String actor;
	private String action;
	private Item item;

	public SimpleStep(String number, String actor, String action, Item item) {
		super();
		this.number = number;
		this.actor = actor;
		this.action = action;
		this.item = item;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
