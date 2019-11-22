package com.lti.core.daos;

import com.lti.core.entities.ExaminationDetails;
import com.lti.core.entities.FileDetails;
import com.lti.core.entities.QuestionDetails;

public interface QuestionDetailsDao 
{
	//1) Upload use case
	//inserting question details
	public void insertQuestions(ExaminationDetails examDetails,FileDetails fileDetails,QuestionDetails questionDetails);
	
	//2)Delete use case
	//deleting questions from questions table based on fileId selected by user
	/*
		1)user will give file name which is not a primary key so it will not be possible
		   to use find method here.
		2)nested query needs to be written to fetch id from name and then delete on that id
	*/
	public void deleteQuestions();
}
