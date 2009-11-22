package br.com.ceut.waat.glossary.rules;

public abstract class AttributeInfo {

	private String type;

	public AttributeInfo(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
