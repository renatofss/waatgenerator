package br.com.ceut.waat.interfaces.rules;

public class AttributeId {
	private String entityName;
	private String attributeName;
	private AttributeId entity;

	public AttributeId(String entityName, String attributeName,
			AttributeId entity) {
		super();
		this.entityName = entityName;
		this.attributeName = attributeName;
		this.entity = entity;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public AttributeId getEntity() {
		return entity;
	}

	public void setEntity(AttributeId entity) {
		this.entity = entity;
	}
}
