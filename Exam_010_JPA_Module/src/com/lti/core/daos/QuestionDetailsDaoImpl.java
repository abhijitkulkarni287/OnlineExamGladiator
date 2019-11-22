package com.lti.core.daos;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.ExaminationDetails;
import com.lti.core.entities.FileDetails;
import com.lti.core.entities.QuestionDetails;

@Repository("questionDao")
public class QuestionDetailsDaoImpl implements QuestionDetailsDao 
{
	@PersistenceContext
	private EntityManager entityManager;

	
	//common method for persisting multiple objects
	public void persistAll(Object ...persistObject)
	{
		for(Object obj:persistObject) 
		{
			entityManager.persist(obj);
		}
	}
	
	//Method for inserting Question details
	@Override
	public void insertQuestions(ExaminationDetails examDetails,FileDetails fileDetails ,QuestionDetails questionDetails) 
	{
		persistAll(examDetails,fileDetails,questionDetails);
	}

	//method for deleting questions
	@Override
	public void deleteQuestions() 
	{
		
		String deleteQueryString="UPDATE QuestionDetails SET deleted='YES' where file_id=(select file_id from FileDetails where file_name=?)";
		Query deleteQuery = entityManager.createQuery(deleteQueryString);
			
			
		
	}
	

}
