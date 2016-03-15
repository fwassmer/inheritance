package org.broken.persistence.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "REPORT")
@DiscriminatorValue("REPORT")
public class ReportEntity extends AbstractEntity {

	private static final long serialVersionUID = -7302118451762238403L;

	@Column(name = "VALUE")
	private String value;

	public ReportEntity() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}