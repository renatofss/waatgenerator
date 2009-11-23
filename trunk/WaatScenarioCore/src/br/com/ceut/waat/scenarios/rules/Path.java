package br.com.ceut.waat.scenarios.rules;

import java.util.List;

public class Path {
	private String id;
	private String actor;
	private String action;
	private Item item;
	private List<PathStep> pathStepList;

	public Path(String id, String actor, String action, Item item,
			List<PathStep> pathStepList) {
		super();
		this.id = id;
		this.actor = actor;
		this.action = action;
		this.item = item;
		this.pathStepList = pathStepList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<PathStep> getPathStepList() {
		return pathStepList;
	}

	public void setPathStepList(List<PathStep> pathStepList) {
		this.pathStepList = pathStepList;
	}

}
