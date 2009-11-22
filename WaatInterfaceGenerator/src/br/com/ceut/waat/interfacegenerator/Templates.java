package br.com.ceut.waat.interfacegenerator;

public enum Templates {

	BUTTON("<button type=\"BUTTON_TYPE\">BUTTON_TEXT</button>" + "\n"),
	
	FIELD("<label for=\"INPUT_NAME\">LABEL_NAME</label>" + "\n" +
			"<input type=\"INPUT_TYPE\" value=\"\" name=\"INPUT_NAME\" id=\"INPUT_NAME\" WRITE_OR_READONLY>" + "\n"),
	
	SELECT("<label for=\"SELECT_NAME\">SELECT_LABEL<label/>" + "\n" +
			"<select name=\"SELECT_NAME\" id=\"SELECT_NAME\">" + "\n" +
			"SELECT_LIST" +
			"</select>" + "\n"),
	
	SELECT_OPTION("<option value=\"SELECT_OPTION_VALUE\">SELECT_OPTION_NAME</option>" + "\n");
	
	
	private String template;
	
	private Templates(String template) {
		this.template = template;
	}
	
	public String toString() {
		return this.template;
	}
	
	
}
