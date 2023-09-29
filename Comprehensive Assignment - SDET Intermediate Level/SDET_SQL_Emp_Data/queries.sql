
-- create
CREATE TABLE EMP_Data (
    EMP_No INT PRIMARY KEY,
    EMP_Name VARCHAR(255),
    EMP_Exp INT,
    EMP_Department VARCHAR(255),
    EMP_Salary INT
);


-- insert
INSERT INTO EMP_Data (EMP_No, EMP_Name, EMP_Exp, EMP_Department, EMP_Salary)
VALUES
    (1, 'Bharat', 5, 'IT', 35000),
    (2, 'Kumar', 3, 'IT', 35000),
    (3, 'Balu', 2, 'Finance', 55000),
    (4, 'Chandu', 4, 'IT', 62000),
    (5, 'Sridhar', 6, 'HR', 52000),
    (6, 'Sravan', 7, 'Finance', 58000),
    (7, 'Sandeep', 3, 'IT', 61000);
-- fetch 
SELECT * FROM EMP_Data WHERE EMP_Department = 'IT';
