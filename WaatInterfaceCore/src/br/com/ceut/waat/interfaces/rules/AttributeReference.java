package br.com.ceut.waat.interfaces.rules;

public class AttributeReference {
	private AttributeId attributeId;

	public AttributeReference(AttributeId attributeId) {
		super();
		this.attributeId = attributeId;
	}

	public AttributeId getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(AttributeId attributeId) {
		this.attributeId = attributeId;
	}
}
