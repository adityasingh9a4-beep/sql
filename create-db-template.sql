-- QueDML, andstion 1: Library Management System
-- A. Theory:
-- Explain how DDL,  integrity constraints work together in a database application. Explain the difference between ALTER and RENAME, and describe how WHERE is used with DML queries.
-- B. Practical:
-- Create a simple Library Management System using Book and Member tables.
-- 1. Create both tables with suitable attributes.
-- 2. Apply Primary Key, Foreign Key, NOT NULL, UNIQUE, and DEFAULT constraints.
-- 3. Insert at least 5 books and 3 members.
-- 4. Display books belonging to a particular category.
-- 5. Update the availability status of a book.
-- 6. Delete a book based on its ID.
-- 7. Add a new column to the Book table using ALTER.
-- 8. Rename the Book table using RENAME.
-- 9. Display the records after performing the operations.

CREATE DATABASE library1; 
USE library1;

CREATE TABLE Member (
    MemberID INT PRIMARY KEY,
    MemberName VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Book (
    BookID INT PRIMARY KEY,
    Title VARCHAR(150) NOT NULL,
    Category VARCHAR(50) NOT NULL,
    AvailabilityStatus VARCHAR(20) DEFAULT 'Available' NOT NULL,
    BorrowerID INT,
    FOREIGN KEY (BorrowerID) REFERENCES Member(MemberID) 
);


INSERT INTO Member (MemberID, MemberName, Email)
VALUES 
    (123, 'Aditya Kumar', 'aditya.k@gmail.com'),
    (124, 'Aman', 'aman.s@gmail.com'),
    (125, 'Sneha Patel', 'sneha.p@gmail.com');


INSERT INTO Book (BookID, Title, Category, AvailabilityStatus, BorrowerID)
VALUES 
    (1, 'MySQL Basics', 'cse', 'Not Available', 123),
    (2, 'Java Programming', 'cse', 'Available', NULL),
    (3, 'Python Mastery', 'cse', 'Not Available', 125),
    (4, 'Champak Comics', 'fictional', 'Available', NULL),
    (5, 'Computer Networks', 'cse', 'Available', NULL);

SELECT * FROM Book WHERE Category = 'cse';


UPDATE Book 
SET AvailabilityStatus = 'Not Available', BorrowerID = 124 
WHERE BookID = 2;


DELETE FROM Book WHERE BookID = 5;

ALTER TABLE Book ADD author Varchar(50);


RENAME TABLE Book TO LibraryBooks;

SELECT * FROM Member;
SELECT * FROM LibraryBooks;
