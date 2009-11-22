package br.com.ceut.waat.glossary.rules;

import java.util.List;

import br.com.ceut.waat.GlossaryXMLHelper;
import br.com.ceut.waat.glossary.GlossaryInterpreter;

public class Glossary {

	private List<Entity> entities;

	public Glossary(List<Entity> entities) {
		this.entities = entities;
		
		GlossaryXMLHelper xmlhelper = new GlossaryXMLHelper();
		GlossaryInterpreter.setOutput(xmlhelper.toXML(this));
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

}
