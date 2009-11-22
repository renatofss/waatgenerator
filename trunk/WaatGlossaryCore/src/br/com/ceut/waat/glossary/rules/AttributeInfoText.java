package br.com.ceut.waat.glossary.rules;

public class AttributeInfoText extends AttributeInfo {

	private int lenght;

	public AttributeInfoText(String type, int lenght) {
		super(type);
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

}
