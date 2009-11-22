package br.com.ceut.waat.interfaces.rules;

import java.util.List;

import br.com.ceut.waat.UiXMLHelper;
import br.com.ceut.waat.interfaces.UiInterpreter;

public class UiPrototype {

	private String name;

	private List<HTMLComponent> htmlComponents;

	public UiPrototype(String name, List<HTMLComponent> htmlComponents) {
		super();
		this.name = name;
		this.htmlComponents = htmlComponents;
		
		UiXMLHelper xmlhelper = new UiXMLHelper();
		UiInterpreter.setOutput(xmlhelper.toXML(this));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<HTMLComponent> getHtmlComponents() {
		return htmlComponents;
	}

	public void setHtmlComponents(List<HTMLComponent> htmlComponents) {
		this.htmlComponents = htmlComponents;
	}

}
