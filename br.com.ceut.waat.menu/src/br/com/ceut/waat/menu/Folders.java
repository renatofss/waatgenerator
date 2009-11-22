package br.com.ceut.waat.menu;

public interface Folders {
	
	static final String FS = System.getProperty("file.separator");
	
	String TESTS_FOLDER = FS + "src" + FS + "generatedTests";
	String INTERFACES_FOLDER = FS + "web" + FS + "generated_interfaces";
	String USECASE_XML_FOLDER = FS + "xml_files" + FS + "usecases";
	String INTERFACE_XML_FOLDER = FS + "xml_files" + FS + "interfaces";
	String GLOSSARY_XML_FOLDER = FS + "xml_files" + FS + "glossary";

}
