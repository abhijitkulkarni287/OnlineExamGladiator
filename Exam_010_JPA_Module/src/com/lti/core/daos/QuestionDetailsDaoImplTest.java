package com.lti.core.daos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class QuestionDetailsDaoImplTest {

	@Autowired
	private QuestionDetailsDaoImpl questionDao;
	
	
	@Test
	void test() {
		assertNotNull(questionDao);
	}

}
