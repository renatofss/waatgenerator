package br.com.ceut.waat.testgenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ceut.waat.scenarios.rules.Item;
import br.com.ceut.waat.scenarios.rules.Scenario;
import br.com.ceut.waat.scenarios.rules.SimpleStep;
import br.com.ceut.waat.scenarios.rules.Step;

/**
 * Classe reponsável por tratar da conversão dos objetos em seus respectivos
 * código de template.
 * 
 * @author ernesto
 * 
 */
public class TemplateHandler {

	/**
	 * Método utilizado para substituir valores chave pelos valores reais de um
	 * template.
	 * 
	 * @param values
	 *            Map contendo pares (VALOR_CHAVE, VALOR_REAL).
	 * @param text
	 *            String na qual os valores chave serão trocados pelos valores
	 *            reais.
	 * @return String contendo o template e seus valores reais.
	 */
	private String mapToTemplates(Map<String, String> values, String text) {
		for (String key : values.keySet()) {
			text = text.replaceAll(key, values.get(key));
		}
		return text;
	}

	/**
	 * Gera o código referente a um comando click usando locator do tipo id.
	 * 
	 * @param item
	 *            Item que será clicado.
	 * @return código referente ao comando.
	 */
	private String generateClickOnId(Item item) {
		String templateText = Templates.CLICK_ID.toString();

		String itemId = TextFormatter.arrangeNameToJavaStyleAttributeName(item
				.getName());

		Map<String, String> values = new HashMap<String, String>();
		values.put("CLICK_ID_ELEMENTID", itemId);

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Gera o código referente a um comando select do selenium usando locator
	 * tipo id.
	 * 
	 * @param item
	 *            Item que será selecionado.
	 * @return código referente ao comando.
	 */
	private String generateSelectId(Item item) {
		String templateText = Templates.SELECT_ID.toString();
		
		String itemId = TextFormatter.arrangeNameToJavaStyleAttributeName(item
				.getName());

		Map<String, String> values = new HashMap<String, String>();
		values.put("SELECT_ID", itemId);

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Gera o código referente a um comando check do selenium, utilizando
	 * locator tipo id.
	 * 
	 * @param item
	 *            Item que será marcado.
	 * @return código referente ao comando.
	 */
	private String generateCheckId(Item item) {
		String templateText = Templates.CHECK_ID.toString();

		String itemId = TextFormatter.arrangeNameToJavaStyleAttributeName(item
				.getName());

		Map<String, String> values = new HashMap<String, String>();
		values.put("CHECK_ID", itemId);

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Código referente a um comando type do selenium utilizando locator tipo
	 * id.
	 * 
	 * @param item
	 *            Item onde será escrito.
	 * @return código referente ao comando.
	 */
	private String generateTypeOnId(Item item) {
		String templateText = Templates.TYPE_ID.toString();

		String itemId = TextFormatter.arrangeNameToJavaStyleAttributeName(item
				.getName());

		Map<String, String> values = new HashMap<String, String>();
		values.put("TYPE_ID", itemId);
		values.put("TYPE_VALUE", "Valor Teste");

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Recebe uma String contendo o código dos teste e os aplica em um template
	 * para o corpo do teste.
	 * 
	 * @param testCode
	 *            código principal do teste.
	 * @return String contendo o código completo da classe de teste.
	 */
	private String putInTemplate(String testCode, String scenarioName) {
		String templateText = Templates.TEST_TEMPLATE.toString();

		Map<String, String> values = new HashMap<String, String>();
		values.put("TEST_TEMPLATE_TESTS", testCode);
		values.put("TEST_CLASS_NAME", scenarioName);
		values.put("TEST_METHOD_NAME", scenarioName);

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Converte os passos do de um Scenario em seus respectivos comandos de
	 * selenium.
	 * 
	 * @param scenario
	 *            Scenario que se deseja converter.
	 * @return código dos comandos.
	 */
	public String parseToSeleniumTest(Scenario scenario) {
		List<Step> steps = scenario.getStepList();
		StringBuffer testCode = new StringBuffer("");
		String scenarioName = TextFormatter
				.arrangeNameToJavaStyleClassName(scenario.getName());

		for (Step step : steps) {
			if (step instanceof SimpleStep) {
				SimpleStep simpleStep = (SimpleStep) step;
				String action = simpleStep.getAction().toUpperCase();
				Item item = simpleStep.getItem();

				if (action.equals("CLICA")) {
					String clickOnId = generateClickOnId(item);
					testCode.append(clickOnId);
				} else if (action.equals("SELECIONA")) {
					String selectId = generateSelectId(item);
					testCode.append(selectId);
				} else if (action.equals("MARCA")) {
					String checkId = generateCheckId(item);
					testCode.append(checkId);
				} else if (action.equals("PREENCHE")) {
					String typeOnId = generateTypeOnId(item);
					testCode.append(typeOnId);
				}
			}
		}

		String test = putInTemplate(testCode.toString(), scenarioName);

		return test;
	}
}
