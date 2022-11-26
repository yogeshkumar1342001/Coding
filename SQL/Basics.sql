-- Online SQL Editor to Run SQL Online.
-- Use the editor to create new tables, insert data and all other SQL operations.
  
CREATE TABLE student(
  id INT PRIMARY KEY,
  name VARCHAR(20),
  cgpa DECIMAL(3,2)
);

DESCRIBE TABLE student;
/*
DROP TABLE student;

ALTER TABLE student ADD department VARCHAR(10);
INSERT INTO student VALUES(1,"Yogesh",8.2,"ECE");
*/