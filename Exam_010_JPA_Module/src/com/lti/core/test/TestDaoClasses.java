package com.lti.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.core.daos.QuestionDetailsDao;
import com.lti.core.entities.ExaminationDetails;
import com.lti.core.entities.FileDetails;
import com.lti.core.entities.QuestionDetails;

public class TestDaoClasses 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core.xml");
		ExaminationDetails examDetails = new ExaminationDetails(101, "java", 60, 40);
		FileDetails fileDetails = new FileDetails(1, "javaQuestions.xlsx");
		QuestionDetails questionDetails = new QuestionDetails(101, "simple language?","java",examDetails,fileDetails);
		QuestionDetailsDao qdao = applicationContext.getBean("questionDao",QuestionDetailsDao.class);
		//qdao.insertQuestionDetails(examDetails, questionDetails);
		
		
	}
	

}
