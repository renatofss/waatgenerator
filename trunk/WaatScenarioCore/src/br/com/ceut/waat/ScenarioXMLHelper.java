package br.com.ceut.waat;

import br.com.ceut.waat.scenarios.rules.Scenario;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ScenarioXMLHelper {
	private XStream xstream;

	public ScenarioXMLHelper() {
		this.xstream = new XStream(new DomDriver());
	}

	public String toXML(Scenario scenario) {
		return xstream.toXML(scenario);
	}
}
