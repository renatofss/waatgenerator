package br.com.ceut.waat;

import br.com.ceut.waat.interfaces.rules.UiPrototype;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class UiXMLHelper {
	private XStream xstream;

	public UiXMLHelper() {
		this.xstream = new XStream(new DomDriver());
	}

	public String toXML(UiPrototype uiPrototype) {
		return xstream.toXML(uiPrototype);
	}
}
