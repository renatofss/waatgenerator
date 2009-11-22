package br.com.ceut.waat.interfaces.rules;

public class HTMLComponentButton extends HTMLComponent {

	private String action;

	public HTMLComponentButton(String name, String action) {
		super(name);
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
