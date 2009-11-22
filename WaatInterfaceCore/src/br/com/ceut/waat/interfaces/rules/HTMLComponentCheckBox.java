package br.com.ceut.waat.interfaces.rules;

public class HTMLComponentCheckBox extends HTMLComponent {

	private AttributeReference attributeReference;
	private String writeOrReadOnly;

	public HTMLComponentCheckBox(String name,
			AttributeReference attributeReference, String writeOrReadOnly) {
		super(name);
		this.attributeReference = attributeReference;
		this.writeOrReadOnly = writeOrReadOnly;
	}

	public AttributeReference getAttributeReference() {
		return attributeReference;
	}

	public void setAttributeReference(AttributeReference attributeReference) {
		this.attributeReference = attributeReference;
	}

	public String getWriteOrReadOnly() {
		return writeOrReadOnly;
	}

	public void setWriteOrReadOnly(String writeOrReadOnly) {
		this.writeOrReadOnly = writeOrReadOnly;
	}

}
