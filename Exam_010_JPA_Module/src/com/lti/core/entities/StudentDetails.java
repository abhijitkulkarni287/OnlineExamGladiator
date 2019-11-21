package com.lti.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
Student Details are stored in this entity whenever a new student registers
from the registration page
*/

@Entity
@Table(name="STUDENT")
public class StudentDetails 
{
	//Attributes for the entity
	@Id
	@Column(name="STUDENT_ID")
	int studentId;
	@Column(name="FIRST_NAME")
	String firstName;
	@Column(name="LAST_NAME")
	String lastName;
	@Column(name="DOB")
	Date dateOfBirth;
	@Column(name="GENDER")
	String gender;
	@Column(name="EMAIL")
	String email;
	@Column(name="PHONE")
	long phoneNumber;
	
	//Association Mapping
	@OneToOne
	LoginDetails login;
	
	//Constructors
	public StudentDetails() {}
	public StudentDetails(int studentId, String firstName, String lastName, Date dateOfBirth, String gender,String email, long phoneNumber) 
	{
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	//Getters and Setters for the attributes
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LoginDetails getLogin() {
		return login;
	}
	public void setLogin(LoginDetails login) {
		this.login = login;
	}
	
	
	
	

}
