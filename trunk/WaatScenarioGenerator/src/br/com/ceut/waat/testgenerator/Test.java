package br.com.ceut.waat.testgenerator;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		TesteGenerator testGen = new TesteGenerator();
		File file = new File("/Users/ernesto/Documents/runtime-New_configuration/Teste/xml_files/usecases/usecase.xml");
		System.out.println(testGen.generateTestFromXML(file));
	}
	
}
