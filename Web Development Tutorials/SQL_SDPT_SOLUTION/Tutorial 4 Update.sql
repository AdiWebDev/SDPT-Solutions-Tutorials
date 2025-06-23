/* UPDATING DATA 
- UPDATE table_name SET p1, p2... WHERE condition. */ 
/* SET Keyword 
- Indicates what columns is to be updated and what value should ituse
to update the data with.*/ 

/*WHERE Keyword
- The WHERE keyword is used to UPDATE certains ROWS in the table. 
- IF SAFE MODE IS ON 
	WHERE is Necessary.
    WHERE must ALWAYS use a PRIMARY KEY.*/ 
    
/*CONDITIONAL OPERATORS 
1. = - Equals.
2. <> - NOT EQUALS.
3. > - GREATER THAN. 
4. < - LESS THAN.
5. >= - GREATER THAN or EQUALS. 
6. <= LESS THAN OR EQUALS. */


-- Examples 
/*EXAMPLE #1 
- Mikey Goodman Changes his Bio to "HATDOG"*/ 
-- QUERY #1  
-- UPDATE tblUsers SET  Bio = "HATDOG" WHERE UID = 1; 

/*EXAMPLE #2 
-- Monty Aguilar verified her account*/ 
-- Query #2 
--  UPDATE tblUsers SET verified = true WHERE UID =8; 

/*EXAMPLE # 3
-- Kobe Mcdowell Verified his Account and changed his first name to Koby. */
-- Query #3 
-- UPDATE  tblUsers SET Verified = TRUE, FirstName = "Koby" Where UID =6;

/*IN Keyword. 
- The IN keyword is used after the WHERE keyword to update multiple rows. */ 
/*Example 
- Katherine Palmer and Monty Callaghan Verified their Account!*/
-- Query 
UPDATE tblUsers SET VERIFIED = TRUE where uid in(5,4);
SELECT * FROM tblUsers;


CREATE DATABASE dbSocialMedia; 

CREATE TABLE dbSocialMedia.tblUsers(
UID INT PRIMARY KEY AUTO_INCREMENT,
EmailAddress VARCHAR(64) UNIQUE,
FirstName VARCHAR(16) NOT NULL,
LastName VARCHAR(16) NOT NULL,
Bio TEXT,
Verified BOOL
);

INSERT INTO dbSocialMedia.tblUsers (EmailAddress, FirstName, LastName, Bio, Verified)
VALUES
("mikeyG@gmail.com","Mikey","Goodman","Hi I'm Mikey!", FALSE),
("LewieMc@gmail.com","Lewie","Mcdowell","Chill...", FALSE),
("Owright@gmail.com","Owain","Wright","Bro You Good!?", FALSE),
("monty02@yahoo.com","Monty","Callaghan","", FALSE),
("kathpalm@yahoo.com","Katherine","Palmer","Whatever...", FALSE),
("kobe1992@gmail.com","Kobe","Mcdowell","Hello World!", FALSE),
("lesnider@yahoo.com","Lewie","Snider","Hello World!", FALSE),
("monts@yahoo.com","Monty","Aguilar","", FALSE),
("brendy@yahoo.com","Brendan","Aguilar","Hello I like trains.", FALSE),
("shannon@yahoo.com","Samirah","Shannon","", FALSE);

