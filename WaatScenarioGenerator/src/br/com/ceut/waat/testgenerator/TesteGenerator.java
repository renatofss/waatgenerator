package br.com.ceut.waat.testgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.ceut.waat.scenarios.rules.Scenario;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Classe reponsóvel por gerar os testes para um arquivo XML representando o
 * caso de uso.
 * 
 * @author ernesto
 * 
 */
public class TesteGenerator {

	/**
	 * Gera as classes de teste dentro do diretório passado como parâmetro.
	 * 
	 * @param scenario
	 *            Scenario para o qual serão gerados os testes.
	 * @param testsDirectory
	 *            Diretório no qual serão criadas as classes de teste.
	 */
	private static void generateTestClasses(Scenario scenario,
			File testsDirectory) {
		TemplateHandler templateHandler = new TemplateHandler();

		String scenarioName = scenario.getName();
		scenarioName = TextFormatter
				.arrangeNameToJavaStyleClassName(scenarioName);
		File testFile = new File(testsDirectory + "/" + scenarioName
				+ "Test.java");

		try {
			boolean createdFile = testFile.createNewFile();

			if (createdFile) {
				System.out.println("O arquivo " + testFile.getAbsolutePath()
						+ " foi criado");

				String testCode = templateHandler.parseToSeleniumTest(scenario);

				FileWriter writer = new FileWriter(testFile);
				writer.append(testCode);
				writer.close();
			} else {
				System.out.println("O arquivo " + testFile.getAbsolutePath()
						+ " já existia");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	/**
	 * Verifica se um arquivo é de extensão XML.
	 * 
	 * @param file
	 *            arquivo que se deseja verificar.
	 * @return true se o arquivo é XML, false caso contrário.
	 */
	private static boolean isXMLFile(File file) {
		String fileName = file.getName();
		String fileExtension = fileName.substring(fileName.lastIndexOf("."),
				fileName.length());

		if (fileExtension.equals(".xml")) {
			return true;
		} else {
			return false;
		}
	}

	public String generateTestFromXML(File file) {

		boolean isXMLFile = file.isFile() && isXMLFile(file);

		if (isXMLFile) {
			XStream xstream = new XStream(new DomDriver());

			try {
				FileReader fileReader = new FileReader(file);
				Scenario scenario = (Scenario) xstream.fromXML(fileReader);

				String testCode = generateTestCode(scenario);

				return testCode;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	private String generateTestCode(Scenario scenario) {
		TemplateHandler templateHandler = new TemplateHandler();

		String testCode = templateHandler.parseToSeleniumTest(scenario);
		
		return testCode;
	}
}
