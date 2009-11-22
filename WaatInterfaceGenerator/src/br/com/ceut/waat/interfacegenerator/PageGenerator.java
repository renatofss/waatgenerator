package br.com.ceut.waat.interfacegenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import br.com.ceut.waat.interfaces.rules.HTMLComponent;
import br.com.ceut.waat.interfaces.rules.UiPrototype;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author ernesto
 * 
 *         Class responsável por ler o arquivo XML e gerar as páginas .jsp do
 *         caso de uso.
 * 
 */
public class PageGenerator {

	/**
	 * Gera o respectivo código da descrição de tela de um cenário.
	 * 
	 * @param scenario
	 *            Scenario para o qual será gerado o código da página.
	 * @return String contendo o código da página equivalente a descrição da
	 *         tela.
	 */
	private static String generatePageCode(UiPrototype uiPrototype) {
		StringBuffer pageCode = new StringBuffer();

		List<HTMLComponent> pageComponents = uiPrototype.getHtmlComponents();
		TemplateHandler templateHandler = new TemplateHandler();
		String componentCode;

		for (HTMLComponent component : pageComponents) {
			componentCode = templateHandler.componentToHTML(component);
			pageCode.append(componentCode);
		}

		return pageCode.toString();
	}

	/**
	 * Recebe um arquivo e verifica se o mesmo possui extensão .xml
	 * 
	 * @param file
	 *            arquivo a ser veficicado.
	 * @return true se o arquivo for .xml, caso contrário retorna false.
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

	public String generatePageFromXML(File file) {

		boolean isXMLFile = file.isFile() && isXMLFile(file);

		if (isXMLFile) {
			XStream xstream = new XStream(new DomDriver());

			try {
				FileReader fileReader = new FileReader(file);
				UiPrototype uiPrototype = (UiPrototype) xstream
						.fromXML(fileReader);

				String pageCode = generatePageCode(uiPrototype);

				return pageCode;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
}
