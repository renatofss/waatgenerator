package br.com.ceut.waat.menu.facades;
/**
 * @author ernesto
 * 
 *         Classe que contém métodos que auxiliam formatação de texto,
 */
public class TextFormatter {

	/**
	 * Método que recebe uma String do tipo "Cliente Telefone Lista" e a
	 * transforma no padrão java para atributos, ou seja, algo do tipo:
	 * "clienteTelefoneLista".
	 * 
	 * @param name
	 *            String que será convertida.
	 * @return String convertida para o padrão Java de nomenclatura de
	 *         atributos.
	 */
	public static String arrangeNameToJavaStyleAttributeName(String name) {
		String[] names = name.split("\\s");
		StringBuffer javaStyleAttributeName = new StringBuffer("");

		javaStyleAttributeName.append(names[0].toLowerCase());

		for (int i = 1; i < names.length; i++) {

			javaStyleAttributeName.append(names[i].substring(0, 1)
					.toUpperCase()
					+ names[i].substring(1, names[i].length()).toLowerCase());

		}

		return javaStyleAttributeName.toString();
	}
	
	public static String arrangeNameToJavaStyleClassName(String name) {
		String[] names = name.split("\\s");
		StringBuffer javaStyleAttributeName = new StringBuffer("");

		for (int i = 0; i < names.length; i++) {
			javaStyleAttributeName.append(names[i].substring(0, 1)
					.toUpperCase()
					+ names[i].substring(1, names[i].length()).toLowerCase());
		}

		return javaStyleAttributeName.toString();
	}

	/**
	 * Método que recebe uma String do tipo "Cliente.Telefone.Lista" e a
	 * transforma no padrão java para atributos, ou seja, algo do tipo:
	 * clienteTelefoneLista.
	 * 
	 * @param attributeReference
	 *            String que será convertida.
	 * @return String convertida para o padrão Java de nomenclatura de
	 *         atributos.
	 */
	public static String arranageAttributeReferenceToJavaStyleAttributeName(
			String attributeReference) {
		String[] names = attributeReference.split("\\.");
		StringBuffer javaStyleAttributeName = new StringBuffer("");

		javaStyleAttributeName.append(names[0].toLowerCase());

		for (int i = 1; i < names.length; i++) {

			javaStyleAttributeName.append(names[i].substring(0, 1)
					.toUpperCase()
					+ names[i].substring(1, names[i].length()).toLowerCase());

		}

		return javaStyleAttributeName.toString();
	}
}
