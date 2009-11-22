package br.com.ceut.waat.menu.facades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import br.com.ceut.waat.glossary.GlossaryInterpreter;
import br.com.ceut.waat.interfacegenerator.PageGenerator;
import br.com.ceut.waat.interfaces.rules.UiPrototype;
import br.com.ceut.waat.menu.Folders;
import br.com.ceut.waat.scenarios.rules.Scenario;
import br.com.ceut.waat.testgenerator.TesteGenerator;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class WaatEngineFacade {

	private static Scenario generateScenarioObject(String xml) {
		XStream xstream = new XStream(new DomDriver());
		Scenario scenario = (Scenario) xstream.fromXML(xml);
		return scenario;
	}
	
	private static Scenario generateScenarioObject(File XMLFile) {
		XStream xstream = new XStream(new DomDriver());
		try {
			Scenario scenario = (Scenario) xstream.fromXML(new FileReader(XMLFile));
			return scenario;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static UiPrototype generateInterfaceObject(String xml) {
		XStream xstream = new XStream(new DomDriver());
		UiPrototype ui = (UiPrototype) xstream.fromXML(xml);
		return ui;
	}
	
	private static UiPrototype generateInterfaceObject(File XMLFile) {
		XStream xstream = new XStream(new DomDriver());
		try {
			UiPrototype ui = (UiPrototype) xstream.fromXML(new FileReader(XMLFile));
			return ui;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static File createXMLUseCaseFile(String fileContent) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		
		if (window != null) {
			IFile eclipseFile = WorkbenchFacade
					.getEclipseFileFromActiveEditor(window);
			String projectPath = eclipseFile.getProject().getLocation()
					.toString();

			String usecaseXMLFolderPath = projectPath
					+ Folders.USECASE_XML_FOLDER;
			FileManipulationFacade.createFolder(usecaseXMLFolderPath);

			Scenario scenario = generateScenarioObject(fileContent);
			
			String scenarioName = TextFormatter.arrangeNameToJavaStyleClassName(scenario.getName());
			
			File usecaseXMLFile = FileManipulationFacade.createFile(
					usecaseXMLFolderPath, scenarioName + ".xml");
			FileManipulationFacade.writeOnFile(usecaseXMLFile, fileContent);

			return usecaseXMLFile;

		}

		return null;
	}

	public static void generateTest(File XMLFile) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (window != null) {
			IFile eclipseFile = WorkbenchFacade
					.getEclipseFileFromActiveEditor(window);
			String projectPath = eclipseFile.getProject().getLocation()
					.toString();

			TesteGenerator testGen = new TesteGenerator();
			String testCode = testGen.generateTestFromXML(XMLFile);

			String testsFolderPath = projectPath + Folders.TESTS_FOLDER;
			FileManipulationFacade.createFolder(testsFolderPath);

			Scenario scenario = generateScenarioObject(XMLFile);
			
			String testName = TextFormatter.arrangeNameToJavaStyleClassName(scenario.getName());
			
			
			File testFile = FileManipulationFacade.createFile(testsFolderPath, testName + "Test.java");
			FileManipulationFacade.writeOnFile(testFile, testCode);
		}

	}

	public static File createXMLInterfaceFile(String fileContent) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (window != null) {
			IFile eclipseFile = WorkbenchFacade
					.getEclipseFileFromActiveEditor(window);
			String projectPath = eclipseFile.getProject().getLocation()
					.toString();

			String interfaceXMLFolderPath = projectPath
					+ Folders.INTERFACE_XML_FOLDER;
			FileManipulationFacade.createFolder(interfaceXMLFolderPath);

			UiPrototype ui = generateInterfaceObject(fileContent);
			String uiName = TextFormatter.arrangeNameToJavaStyleClassName(ui.getName());
			
			File interfaceXMLFile = FileManipulationFacade.createFile(
					interfaceXMLFolderPath, uiName + ".xml");
			FileManipulationFacade.writeOnFile(interfaceXMLFile, fileContent);

			return interfaceXMLFile;
		}

		return null;
	}

	public static void generateInterface(File XMLFile) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (window != null) {
			IFile eclipseFile = WorkbenchFacade
					.getEclipseFileFromActiveEditor(window);
			String projectPath = eclipseFile.getProject().getLocation()
					.toString();

			PageGenerator pageGenerator = new PageGenerator();
			String HTMLCode = pageGenerator.generatePageFromXML(XMLFile);

			System.out.println(HTMLCode);

			String interfaceFolderPath = projectPath
					+ Folders.INTERFACES_FOLDER;
			FileManipulationFacade.createFolder(interfaceFolderPath);

			UiPrototype ui = generateInterfaceObject(XMLFile);
			String pageName = TextFormatter.arrangeNameToJavaStyleAttributeName(ui.getName());
			
			File interfaceFile = FileManipulationFacade.createFile(
					interfaceFolderPath, pageName + ".html");
			FileManipulationFacade.writeOnFile(interfaceFile, HTMLCode);

		}

	}

	public static File createXMLGlossaryFile(String fileContent) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (window != null) {
			IFile eclipseFile = WorkbenchFacade
					.getEclipseFileFromActiveEditor(window);
			String projectPath = eclipseFile.getProject().getLocation()
					.toString();

			String glossaryXMLFolderPath = projectPath
					+ Folders.GLOSSARY_XML_FOLDER;
			FileManipulationFacade.createFolder(glossaryXMLFolderPath);

			File glossaryXMLFile = FileManipulationFacade.createFile(
					glossaryXMLFolderPath, "glossary.xml");
			
			GlossaryInterpreter gi = new GlossaryInterpreter();
			String xml = gi.parseToXML(fileContent);
			
			FileManipulationFacade.writeOnFile(glossaryXMLFile, xml);

			return glossaryXMLFile;
		}

		return null;
	}

}
