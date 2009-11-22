package br.com.ceut.waat.glossary.rules;

import java.util.List;

public class Entity {

	private String name;
	private List<Attribute> attributes;

	public Entity(String name, List<Attribute> attributes) {
		this.name = name;
		this.attributes = attributes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

}
