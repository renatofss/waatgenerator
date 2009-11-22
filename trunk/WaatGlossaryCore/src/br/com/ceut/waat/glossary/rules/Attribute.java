package br.com.ceut.waat.glossary.rules;

public class Attribute {

	private String name;
	private boolean mandatory;
	private AttributeInfo attributeInfo;

	public Attribute(String name, boolean mandatory, AttributeInfo attributeInfo) {
		this.name = name;
		this.mandatory = mandatory;
		this.attributeInfo = attributeInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public AttributeInfo getAttributeInfo() {
		return attributeInfo;
	}

	public void setAttributeInfo(AttributeInfo attributeInfo) {
		this.attributeInfo = attributeInfo;
	}

}
