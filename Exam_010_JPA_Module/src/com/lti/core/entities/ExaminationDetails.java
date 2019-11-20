package com.lti.core.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*
This entity will store details of test subjects
 */

@Entity
public class ExaminationDetails 
{
	//Attributes for entity
	@Id
	int examId;
	String examName;
	int examDuration;
	int numberOfQuestions;
	
	//Association Mappings
	//1) QuestionDetails table birectional
	@OneToOne
	QuestionDetails question;
	
	//Constructors
	public ExaminationDetails() {}
	public ExaminationDetails(int examId, String examName, int examDuration, int numberOfQuestions) 
	{
		this.examId = examId;
		this.examName = examName;
		this.examDuration = examDuration;
		this.numberOfQuestions = numberOfQuestions;
	}
	
	//Getters and Setters
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public int getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(int examDuration) {
		this.examDuration = examDuration;
	}
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}
	public QuestionDetails getQuestion() {
		return question;
	}
	public void setQuestion(QuestionDetails question) {
		this.question = question;
	}
	
	
	
}
