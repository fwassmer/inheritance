package org.broken.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class AccountEntity extends AbstractEntity {

	private static final long serialVersionUID = -5606263577284299869L;

	@Column(name = "VALUE")
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}