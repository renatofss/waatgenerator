package br.com.ceut.waat.interfacegenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ceut.waat.interfaces.rules.AttributeId;
import br.com.ceut.waat.interfaces.rules.AttributeReference;
import br.com.ceut.waat.interfaces.rules.HTMLComponent;
import br.com.ceut.waat.interfaces.rules.HTMLComponentButton;
import br.com.ceut.waat.interfaces.rules.HTMLComponentCheckBox;
import br.com.ceut.waat.interfaces.rules.HTMLComponentField;
import br.com.ceut.waat.interfaces.rules.HTMLComponentRadioButton;
import br.com.ceut.waat.interfaces.rules.HTMLComponentSelect;

/**
 * @author ernesto
 * 
 *         Classe responsável por converter os objetos que representam os
 *         componentes HTML (HTMLComponent) em seus respectivos templates.
 *         Possui métodos que retiram as informações dos atributos dos objetos e
 *         aplicam sobre os templates definidos no diretório de templates.
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
	 * Método que retorna uma String contendo o valor do atributo de
	 * AttributeReference. Como o attribute reference pode ser representado por
	 * algo do tipo "Cliente.Telefone.Prefixo" o método se utiliza de recursão
	 * para chegar até o atributo real, que no exemplo seria "prefixo".
	 * 
	 * @param attributeReference
	 *            AttributeReference do qual se deseja retirar o attributeName.
	 * @return uma String contendo o nome do attributo.
	 */
	private String extractAttributeNameFromEntity(
			AttributeReference attributeReference) {
		StringBuffer attributeName = new StringBuffer("");
		AttributeId attributeId = attributeReference.getAttributeId();

		attributeName = extractAttributeNameHelper(attributeId, attributeName);

		String attributeNameString = attributeName.toString().toLowerCase();

		return attributeNameString;
	}

	/**
	 * Método que auxilia a recusão necessária em
	 * extractAttributeNameFromEntity(). O método é chamado recursivamente até
	 * que o attributeId não faça referência é outra entidade, ou seja, agora
	 * faz referência a um atributo final, e finaliza a recursão.
	 * 
	 * @param attributeId
	 *            referência que será explorada recursivamente.
	 * @param attributeName
	 *            faz referência ao nome do atributo.
	 * @return nome do atributo.
	 */
	private StringBuffer extractAttributeNameHelper(AttributeId attributeId,
			StringBuffer attributeName) {
		if (attributeId.getEntity() != null) {
			extractAttributeNameHelper(attributeId.getEntity(), attributeName);
		} else {
			attributeName.append(attributeId.getAttributeName());
		}
		return attributeName;
	}

	/**
	 * Gera uma String referente é um AttributeReference, algo do tipo
	 * "Nome.Telefone.Prefixo". O processo é feito através de recursão.
	 * 
	 * @param attributeReference
	 *            AttributeReference para o qual se deseja criar a String.
	 * @return String represetando um AttributeReference.
	 */
	private String generateAttributeReferenceString(
			AttributeReference attributeReference) {
		StringBuffer text = new StringBuffer("");

		String referenceString = generatAttributeReferenceStringHelper(text,
				attributeReference.getAttributeId());

		return referenceString;
	}

	/**
	 * Método que auxilia a recursão necessária no método
	 * generateAttributeReferenceString(). O método percorre as referências as
	 * entidades recursivamente, fazendo um append no nome da entidade a cada
	 * nível da recursão, até que não se tenha referência a um entidade, mas
	 * sim, a um atributo, e fará um append no nome do atributo.
	 * 
	 * @param text
	 *            String contendo o estado atual do nome.
	 * @param attributeId
	 *            referência a entidade.
	 * @return String representando um AttributeReference.
	 */
	private String generatAttributeReferenceStringHelper(StringBuffer text,
			AttributeId attributeId) {

		String javaStyleAttributeName;
		String javaStyleEntityName;

		if (attributeId.getEntity() != null) {
			javaStyleEntityName = TextFormatter
					.arrangeNameToJavaStyleAttributeName(attributeId
							.getEntityName());
			text.append(javaStyleEntityName + ".");
			generatAttributeReferenceStringHelper(text, attributeId.getEntity());
		} else {
			javaStyleEntityName = TextFormatter
					.arrangeNameToJavaStyleAttributeName(attributeId
							.getEntityName());
			javaStyleAttributeName = TextFormatter
					.arrangeNameToJavaStyleAttributeName(attributeId
							.getAttributeName());
			text.append(javaStyleEntityName);
			text.append(".");
			text.append(javaStyleAttributeName);
		}

		return text.toString();
	}

	/**
	 * Passa um objeto HTMLComponentField para seu template.
	 * 
	 * @param field
	 *            HTMLComponentField para o qual se deseja passar para o
	 *            template.
	 * @return String contendo o template para o HTMLComponentField.
	 */
	private String parseFieldToTemplate(HTMLComponentField field) {
		String templateText = Templates.FIELD.toString();

		Map<String, String> values = new HashMap<String, String>();

		values.put("INPUT_NAME", generateAttributeReferenceString(field
				.getAttributeReference()));
		values.put("LABEL_NAME", field.getName() + ":");

		if (field.getType().toUpperCase().equals("TIPO_TEXTO")) {
			values.put("INPUT_TYPE", "text");
		} else if(field.getType().toUpperCase().equals("TIPO_SENHA")){
			values.put("INPUT_TYPE", "password");
		}
		
		if(field.getWriteOrReadOnly().toUpperCase().equals("ESCRITA")) {
			values.put("WRITE_OR_READONLY", "");
		} else if(field.getWriteOrReadOnly().toUpperCase().equals("LEITURA")) {
			values.put("WRITE_OR_READONLY", "READONLY");
		}

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Passa um objeto HTMLComponentSelect para seu template.
	 * 
	 * @param select
	 *            HTMLComponentSelect para o qual se deseja passar para o
	 *            template.
	 * @return String contendo o template para o HTMLComponentSelect.
	 */
	private String parseSelectToTemplate(HTMLComponentSelect select) {
		String templateText = Templates.SELECT.toString();
		
		List<String> options = new ArrayList<String>();
		options.add("Opcao1");
		options.add("Opcao2");
		options.add("Opcao3");
		
		StringBuffer selectList = new StringBuffer("");
		for (String option : options) {
			selectList.append(parseSelectOptionToTemplate(option));
		}
		
		Map<String, String> values = new HashMap<String, String>();
		values.put("SELECT_LABEL", select.getName() + ":");
		values.put("SELECT_NAME", generateAttributeReferenceString(select
				.getAttributeReference()));
		values.put("SELECT_LIST", selectList.toString());

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}
	
	private String parseSelectOptionToTemplate(String option) {
		String templateText = Templates.SELECT_OPTION.toString();
		
		Map<String, String> values = new HashMap<String, String>();
		values.put("SELECT_OPTION_VALUE", option);
		values.put("SELECT_OPTION_NAME", option);
		
		templateText = mapToTemplates(values, templateText);
		
		return templateText;		
	}

	/**
	 * Passa um objeto HTMLComponentCheckBox para seu template.
	 * 
	 * @param checkbox
	 *            HTMLComponentCheckBox para o qual se deseja passar para o
	 *            template.
	 * @return String contendo o template para o HTMLComponentCheckBox.
	 */
	private String parseCheckBoxToTemplate(HTMLComponentCheckBox checkbox) {
		String templateText = Templates.FIELD.toString();

		Map<String, String> values = new HashMap<String, String>();
		values.put("INPUT_NAME", generateAttributeReferenceString(checkbox
				.getAttributeReference()));
		values.put("LABEL_NAME", checkbox.getName() + ":");
		values.put("INPUT_TYPE", "checkbox");

		if(checkbox.getWriteOrReadOnly().toUpperCase().equals("ESCRITA")) {
			values.put("WRITE_OR_READONLY", "");
		} else if(checkbox.getWriteOrReadOnly().toUpperCase().equals("LEITURA")) {
			values.put("WRITE_OR_READONLY", "READONLY");
		}
		
		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Passa um objeto HTMLComponentRadioButton para seu template.
	 * 
	 * @param radiobutton
	 *            HTMLComponentRadioButton para o qual se deseja passar para o
	 *            template.
	 * @return String contendo o template para o HTMLComponentRadioButton.
	 */
	private String parseRadioButtonToTemplate(
			HTMLComponentRadioButton radiobutton) {
		String templateText = Templates.FIELD.toString();

		Map<String, String> values = new HashMap<String, String>();
		values.put("INPUT_NAME", generateAttributeReferenceString(radiobutton
				.getAttributeReference()));
		values.put("LABEL_NAME", radiobutton.getName() + ":");
		values.put("INPUT_TYPE", "radio");
		
		if(radiobutton.getWriteOrReadOnly().toUpperCase().equals("ESCRITA")) {
			values.put("WRITE_OR_READONLY", "");
		} else if(radiobutton.getWriteOrReadOnly().toUpperCase().equals("LEITURA")) {
			values.put("WRITE_OR_READONLY", "READONLY");
		}

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Passa um objeto HTMLComponentButton para seu template.
	 * 
	 * @param button
	 *            HTMLComponentButton para o qual se deseja passar para o
	 *            template.
	 * @return String contendo o template para o HTMLComponentButton.
	 */
	private String parseButtonToTemplate(HTMLComponentButton button) {
		String templateText = Templates.BUTTON.toString();
		
		Map<String, String> values = new HashMap<String, String>();
		values.put("BUTTON_TEXT", button.getName());
		values.put("BUTTON_TYPE", "submit");

		templateText = mapToTemplates(values, templateText);

		return templateText;
	}

	/**
	 * Recebe um HTMLComponent, verifica o tipo de HTMLComponent do mesmo, e
	 * chama um método que gerará o template para ele.
	 * 
	 * @param component
	 *            HTMLComponent para o qual será gerado o template.
	 * @return String contendo o template do HTMLComponent.
	 */
	public String componentToHTML(HTMLComponent component) {
		if (component instanceof HTMLComponentField) {
			HTMLComponentField field = (HTMLComponentField) component;
			return parseFieldToTemplate(field);
		} else if (component instanceof HTMLComponentSelect) {
			HTMLComponentSelect select = (HTMLComponentSelect) component;
			return parseSelectToTemplate(select);
		} else if (component instanceof HTMLComponentCheckBox) {
			HTMLComponentCheckBox checkbox = (HTMLComponentCheckBox) component;
			return parseCheckBoxToTemplate(checkbox);
		} else if (component instanceof HTMLComponentRadioButton) {
			HTMLComponentRadioButton radiobutton = (HTMLComponentRadioButton) component;
			return parseRadioButtonToTemplate(radiobutton);
		} else if (component instanceof HTMLComponentButton) {
			HTMLComponentButton button = (HTMLComponentButton) component;
			return parseButtonToTemplate(button);
		}
		
		return null;
	}
}
