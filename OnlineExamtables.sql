DROP TABLE STUDENT;
DROP TABLE LOGIN;
DROP TABLE QUESTION_FILES;
DROP TABLE EXAM;
DROP TABLE QUESTIONS
DROP TABLE QUESTION_CHOICES;

CREATE TABLE LOGIN(
    STUDENT_ID NUMBER CONSTRAINT PK_LOGIN_STUDENTID PRIMARY KEY,
    USER_NAME VARCHAR2(20) NOT NULL UNIQUE,
    PASSWORD VARCHAR2(30) NOT NULL
); 

CREATE TABLE STUDENT(
    STUDENT_ID NUMBER CONSTRAINT PK_STUDENT_STUDENTID PRIMARY KEY ,
    FIRST_NAME VARCHAR2(20) NOT NULL,
    LAST_NAME VARCHAR2(20) NOT NULL,
    DOB DATE NOT NULL,
    GENDER VARCHAR2(1) NOT NULL,
    EMAIL VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2(10) NOT NULL,
    CITY VARCHAR2(20) NOT NULL;
    STUDENT_STATE VARCHAR2(20) NOT NULL;  
    CONSTRAINT FK_STUDENT_STUDENTID FOREIGN KEY (STUDENT_ID) REFERENCES LOGIN(STUDENT_ID)  
);


CREATE TABLE QUESTION_FILES(
    FILE_ID NUMBER CONSTRAINT PK_QUESTIONFILES_FILEID PRIMARY KEY,
    FILE_NAME VARCHAR2(20) NOT NULL UNIQUE
);


CREATE TABLE EXAM(
    EXAM_ID NUMBER CONSTRAINT PK_EXAM_EXAMID PRIMARY KEY,
    SUBJECT VARCHAR2(20) UNIQUE,
    EXAM_DURATION NUMBER NOT NULL,
    NO_OF_QUESTIONS NUMBER NOT NULL
);

CREATE TABLE QUESTIONS(
    QUESTION_ID NUMBER CONSTRAINT PK_QUESTIONS_QUESTIONID PRIMARY KEY, 
    EXAM_ID NUMBER CONSTRAINT FK_QUESTIONS_EXAMID REFERENCES EXAM(EXAM_ID),
    FILE_ID NOT NULL CONSTRAINT FK_QUESTIONS_FILEID REFERENCES QUESTION_FILES(FILE_ID),
    QUESTION VARCHAR2(100) NOT NULL, 
    ANSWER VARCHAR2(20) NOT NULL,
    DELETED VARCHAR2(20) DEFAULT 'NO'
);

CREATE TABLE QUESTION_CHOICES(
    QUESTION_ID NUMBER CONSTRAINT FK_QUESTIONCHOICES_QUESTIONID REFERENCES QUESTIONS(QUESTION_ID),
    OPTIONS VARCHAR(20) NOT NULL
);

ALTER TABLE STUDENT ADD CITY VARCHAR2(20) NOT NULL;
ALTER TABLE STUDENT ADD STUDENT_STATE VARCHAR2(20) NOT NULL;