package com.lti.core.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*
 * 1.) This entity is used for storing details of every question
 * 2.) These details will be extracted from the excel file that
 * 		 the admin will upload
 * 3.) It is mapped with ExaminationDetails Table
 */

@Entity
public class QuestionDetails 
{
	//attributes for the entity
	@Id
	int questionId;
	String correctOption;

	//mapping attributes
	//1)ExaminationDetails table bidirectional
	@OneToOne
	ExaminationDetails exam;
	
	//Constructors
	

}
