CREATE DATABASE dbcourse; 

USE dbcourse; 

CREATE TABLE user ( 
 	user_id int not null primary key auto_increment,  
	email varchar(128) UNIQUE,
	name varchar(128) 

);

CREATE TABLE couse (
	course_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(128) UNIQUE
); 

CREATE TABLE member ( 
	course_id INT, 
	user_id INT, 
	role INT,  
	CONSTRAINT FOREIGN KEY (user_id) REFERENCES USER (user_id) 
	ON DELETE CASCADE ON UPDATE CASCADE, 
	CONSTRAINT FOREIGN KEY (course_id) REFERENCES COURSE (course_id) 
	ON DELETE CASCADE ON UPDATE CASCADE,
	
	PRIMARY KEY(course_id, user_id) 	
);
CREATE DATABASE dbcourse; 

USE dbcourse; 

CREATE TABLE user ( 
 	user_id int not null primary key auto_increment,  
	email varchar(128) UNIQUE,
	name varchar(128) 

);

CREATE TABLE couse (
	course_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(128) UNIQUE
); 

CREATE TABLE member ( 
	course_id INT, 
	user_id INT, 
	role INT,  
	CONSTRAINT FOREIGN KEY (user_id) REFERENCES USER (user_id) 
	ON DELETE CASCADE ON UPDATE CASCADE, 
	CONSTRAINT FOREIGN KEY (course_id) REFERENCES COURSE (course_id) 
	ON DELETE CASCADE ON UPDATE CASCADE,
	
	PRIMARY KEY(course_id, user_id) 	
);
