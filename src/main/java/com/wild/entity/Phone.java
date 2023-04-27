package com.wild.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	private String ID;
	private String phoneNO;

	public Phone() {
		super();
	}

	public Phone(String iD, String phoneNO) {
		super();
		ID = iD;
		this.phoneNO = phoneNO;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	@Override
	public String toString() {
		return "Phone [ID=" + ID + ", phoneNO=" + phoneNO + "]";
	}

}
