package com.lti.web.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*
This entity class will store login details for every student
*/

@Entity
public class LoginDetails 
{
	@Id
	int loginId;
	String userName;
	String password;
	
	//Association Mapping
	@OneToOne
	StudentDetails student;
	
	//Constructors
	public LoginDetails() {}
	public LoginDetails(int loginId, String userName, String password) {
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
	}
	
	//Getters and setters for attributes
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StudentDetails getStudent() {
		return student;
	}
	public void setStudent(StudentDetails student) {
		this.student = student;
	}
	
	
	
}
