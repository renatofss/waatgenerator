package br.com.ceut.waat.interfacegenerator;

import java.io.File;


public class Test {

	public static void main(String[] args) {
		
		PageGenerator pageGen = new PageGenerator();
		File file = new File("/Users/ernesto/Documents/runtime-New_configuration/Teste/xml_files/interfaces/interface.xml");
		System.out.println(pageGen.generatePageFromXML(file));
		
	}
	
}
