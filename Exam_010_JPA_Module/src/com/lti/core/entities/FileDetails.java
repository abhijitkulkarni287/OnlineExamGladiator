package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*This entity will store details of question excel file*/

@Entity
@Table(name="QUESTION_FILES" )
public class FileDetails 
{
	@Id
	@Column(name="FILE_ID")
	int fileId;
	@Column(name="FILE_NAME")
	String fileName;
	
	@OneToOne
	ExaminationDetails examDetails;
	
	//Constructors
	public FileDetails() {}
	public FileDetails(int fileId, String fileName, ExaminationDetails examDetails) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.examDetails = examDetails;
	}
	
	//Getter setter method
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public ExaminationDetails getExamDetails() {
		return examDetails;
	}
	public void setExamDetails(ExaminationDetails examDetails) {
		this.examDetails = examDetails;
	}

}
