package br.com.ceut.waat.scenarios.rules;

import java.util.List;

public class MultiplePaths {
	private int quantity;
	private List<Path> pathList;

	public MultiplePaths(int quantity, List<Path> pathList) {
		super();
		this.quantity = quantity;
		this.pathList = pathList;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Path> getPathList() {
		return pathList;
	}

	public void setPathList(List<Path> pathList) {
		this.pathList = pathList;
	}

}
