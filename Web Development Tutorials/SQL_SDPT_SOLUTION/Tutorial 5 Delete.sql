/*DELETING DATA 
- DELETE FROM  table_name WHERE Condition 
- PWedeng gumamit ng IN and Conditional Operators.
- Pwede rin ang NOT Keyword.*/  
/*Truncate Keyword 
- Deletes All Data from a table.
- TRUNCATE table_name;  
- Tinatanggal lang yung laman ng table pero hindi mismong table*/

/* DROP TABLE 
 - DROP TABLE table_name; 
 - Madedelete ang data pati na rin ang mismong table.*/
 
 /* DROP DATABASE 
 -  DROP DATABASE database_name;  
 - Madedelete buong database*/
  
 -- Example: Dekete the Product "Alcohol" 
 -- Query: DELETE FROM tblProducts WHERE PID = 2;  SET SQL_SAFE_UPDATES = 0;
 
-- Example with IN Keyword: 
-- Delete the Porducts "Face Mask" and "Had Sanitizer" 
-- Query : DELETE FROM tblProducts WHERE PRODUCTNAME IN ("Face Mask", "Hand Sanitizer"); 

SELECT * FROM dbGrocery.tblProducts; 
CREATE DATABASE dbGrocery;
CREATE TABLE dbGrocery.tblProducts(
PID INT PRIMARY KEY AUTO_INCREMENT,
ProductName VARCHAR(32) NOT NULL,
Price DOUBLE NOT NULL,
Quantity INT NOT NULL
);

INSERT INTO dbGrocery.tblProducts (ProductName,Price,Quantity)
VALUES
("Face Mask", 100.00,0),
("Alcohol", 250.00,0),
("Bleach", 75.00,3),
("Hand Sanitizer", 250.00, 1),
("Sanitizing Wipes", 150.00, 3),
("Soap", 75.00, 10),
("Mouth Wash", 125.00, 5),
("Liquid Sosa", 150.00,5),
("Detergent Powder", 75.00,4),
("Fabric Softener", 100.00,5);


