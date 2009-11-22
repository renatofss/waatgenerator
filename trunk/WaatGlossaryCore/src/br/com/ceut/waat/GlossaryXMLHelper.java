package br.com.ceut.waat;

import br.com.ceut.waat.glossary.rules.Glossary;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GlossaryXMLHelper {
	private XStream xstream;

	public GlossaryXMLHelper() {
		this.xstream = new XStream(new DomDriver());
	}

	public String toXML(Glossary glossary) {
		return xstream.toXML(glossary);
	}
}
