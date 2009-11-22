package br.com.ceut.waat.interfaces.rules;

public class HTMLComponentField extends HTMLComponent {

	private String type;
	private AttributeReference attributeReference;
	private String writeOrReadOnly;

	public HTMLComponentField(String type, String name,
			AttributeReference attributeReference, String writeOrReadOnly) {
		super(name);
		this.type = type;
		this.attributeReference = attributeReference;
		this.writeOrReadOnly = writeOrReadOnly;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
