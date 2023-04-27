package com.wild.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
	private String Id;
	private long pincode;
	private String post;
	private String taluka;
	private String district;
	private String state;
	private String country;

	public Address() {
		super();
	}

	public Address(String id, long pincode, String post, String taluka, String district, String state, String country) {
		super();
		Id = id;
		this.pincode = pincode;
		this.post = post;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [Id=" + Id + ", pincode=" + pincode + ", post=" + post + ", taluka=" + taluka + ", district="
				+ district + ", state=" + state + ", country=" + country + "]";
	}

}
