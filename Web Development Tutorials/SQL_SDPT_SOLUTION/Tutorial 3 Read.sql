/*SELECTING TABLE. 
- SELECT * FROM table_name 
- SELECT * FROM table_name WHERE condition.
- Ibig sabihin ng asterisk or '*' ay all, para maselect ang column.*/  
-- Example: 
-- 	SELECT * FROM dbCompany.tblEmployees; 
    
/*WHERE Keyword 
- The WHERE keyword is used to SELECT more specific data where a 
condition is met.*/ 
-- Example: Ang makikita lang na data ay ang mga may last name na santos
--  SELECT * FROM dbcompany.tblEmployees WHERE LastNAME = "Santos"; 

/*CONDITIONAL OPERATORS 
1. = - Equals.
2. <> - NOT EQUALS.
3. > - GREATER THAN. 
4. < - LESS THAN.
5. >= - GREATER THAN or EQUALS. 
6. <= LESS THAN OR EQUALS. 

Example: SELECT * FROM tblEmployees WHERE Age > 27;*/

 
 /*NOT Keyword
 - Used to invert the Where Condition. 
 - Example : SELECT * FROM table_name WHERE NOT LastName = "Santos";
 - Ibig sabihin lahat ng last name ay lalabas except sa row na may last name na santos.*/
 
 /*IN Keyword 
 - The IN Keyword is used after the WHERE keyword to select multiple values in a parameter.
 - Examples: Select ALL Employees with the last name "santos" and "dela cruz"
 - Query: SELECT * FROM dbCompany.tblEmployees 
			WEHERE LastName IN("Santos", "Dela Cruz");*/ 

/* AND Keyword.
- The AND keyword is used to add conditions in a WHERE statement in both condition
 must be true.
 - Example: Select ALL Employees with the Last Name "Sasntos" and their age must be 
 27 and above. 
 - Query:  SELECT * FROM dbcompany.tblEmployees WHERE LastName = "Santos" AND Age >= 27;/  

/* OR Keyword.
- Isang condition ang mag true okay na. 
- Example - Select ALL Employees with the LastName "Sasntos* or their age must be
30 and abouve. 
- Query - SELECT * FROM dbcompany.tblEmplyoees WHERE LastNmae = "Santos" OR Age>=18;*/

/* SELECTING TABLE (parameters) 
- Example: Gusto mo lang makita yung firstname at lastname, ayaw mo makita yung iba pang column.
- QUERY- SELECT FirstName, LastName FROM dbcompany.tblEmployees;
*/

/* DISTINCT Keyword
- The DISTNCT Keyword is used to select UNQIUE values only from the parameters provided.
- Example: Select Address without any repeating data.
- Query: SELECT DISTINCT Address FROM dbcompany.tblEmployees.*/

/* COUNT Keyword 
- The COUNT Keyword is used to return the count of the selected Data. 
- Example: Get the Count of the Employees Address witouth any repeating Address. 
  (parameters)
- Query : SELECT COUNT(DISTINCT address) FROM dbcompany.tblEmployees;

- Another Example: Gusto mo bilangin lahat ng may address sa malolos. 
- Query: select count(address) from dbcompany.tblEmployees where address = "malolos";*/ 


CREATE DATABASE dbCompany;

CREATE TABLE dbCompany.tblEmployees (
ID INT PRIMARY KEY AUTO_INCREMENT,
FirstName VARCHAR(16) NOT NULL,
LastName VARCHAR(16) NOT NULL,
Age INT NOT NULL,
Address VARCHAR(16) NOT NULL,
PhoneNumber VARCHAR(11) UNIQUE,
BirthDate DATE NOT NULL
);

INSERT INTO dbCompany.tblEmployees (FirstName,LastName,Age,Address,PhoneNumber,BirthDate) VALUES
("Joshua","Santos",24,"Malolos","09225544119","1995-10-16"),
("John Paul","Reyes",21,"Apalit","09553269345","1998-05-25"),
("Christian","Santos",27,"Apalit","09554312563","1992-03-05"),
("Justine","Cruz",30,"Tabang","09226025431","1989-07-23"),
("Justine","Reyes",27,"Malolos","09954231643","1992-09-26"),
("John Mark","Ocampo",32,"Guguinto","09956235431","1987-12-10"),
("Joshua","Garcia",25,"Malolos","09223451256","1994-01-05"),
("Daniel","Mendoza",30,"Tabang","09153478921","1989-05-28"),
("Angelo","Mendoza",35,"San Fernando","09954317643","1984-06-05"),
("Ryan","Andrada",26,"Malolos","09223654395","1993-02-14");
