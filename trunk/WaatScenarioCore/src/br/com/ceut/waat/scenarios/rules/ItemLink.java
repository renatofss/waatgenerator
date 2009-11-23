package br.com.ceut.waat.scenarios.rules;

public class ItemLink extends Item {

	private String session;
	private String sideMenuName;

	public ItemLink(String type, String name, String session) {
		super(type, name);
		this.session = session;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSideMenuName() {
		return sideMenuName;
	}

	public void setSideMenuName(String sideMenuName) {
		this.sideMenuName = sideMenuName;
	}
}
