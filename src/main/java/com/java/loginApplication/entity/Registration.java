package com.java.loginApplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String userName;
	private String language;
	private String mobileNumber;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int id, String name, String userName, String language, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.language = language;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "RegistrationEntity [id=" + id + ", name=" + name + ", userName=" + userName + ", language=" + language
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
