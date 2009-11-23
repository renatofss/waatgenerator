package br.com.ceut.waat.scenarios.rules;

public abstract class Item {
	private String type;
	private String name;

	public Item(String type) {
		this.type = type;
	}

	public Item(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
