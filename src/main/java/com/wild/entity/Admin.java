package com.wild.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Admin {
	@Id
	private String ID;
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String emailID;
	private String userType;
	// @OneToOne(targetEntity=Phone.class,cascade=CascadeType.ALL)
	//@OneToMany(mappedBy = "admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@ManyToOne
	private Phone phone;
	// @OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	//@OneToMany(mappedBy = "admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@ManyToOne
	private Address address;
	private String gender;
	private String status;
	private int faxNo;
	private String question;
	private String answer;
	private String photoGraph;

	public Admin() {
		super();
	}

	public Admin(String iD, String password, String firstName, String lastName, String dateOfBirth, String emailID,
			String userType, Phone phone, Address address, String gender, String status, int faxNo, String question,
			String answer, String photoGraph) {
		super();
		ID = iD;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.emailID = emailID;
		this.userType = userType;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.status = status;
		this.faxNo = faxNo;
		this.question = question;
		this.answer = answer;
		this.photoGraph = photoGraph;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPhotoGraph() {
		return photoGraph;
	}

	public void setPhotoGraph(String photoGraph) {
		this.photoGraph = photoGraph;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(int faxNo) {
		this.faxNo = faxNo;
	}

	@Override
	public String toString() {
		return "Admin [ID=" + ID + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", emailID=" + emailID + ", userType=" + userType + ", phone="
				+ phone + ", address=" + address + ", gender=" + gender + ", status=" + status + ", faxNo=" + faxNo
				+ ", question=" + question + ", answer=" + answer + ", photoGraph=" + photoGraph + "]";
	}

}
