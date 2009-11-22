package br.com.ceut.waat.interfaces.rules;

public abstract class HTMLComponent {
	private String name;

	public HTMLComponent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
