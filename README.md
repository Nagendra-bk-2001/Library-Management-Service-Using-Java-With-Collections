# Library Management System Using Java with Collections

## Overview
This is a simple Library Management System implemented in Java using Collections. The system allows users to perform various operations such as adding books, members, issuing books, returning books, and listing books, members, and loans.

### Features:
- Add Books
- Add Members
- Issue Books
- Return Books
- List all Books
- List all Members
- List all Loans
- List Overdue Loans

## Technologies Used:
- **Java**: Core Java programming
- **Collections**: To manage data storage and operations

## Getting Started

### Prerequisites
Make sure you have Java installed on your machine. You can download Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Steps to Run the Application:
1. Clone the repository:
   ```bash
   git clone https://github.com/Nagendra-bk-2001/Library-Management-Service-Using-Java-With-Collections.git


=======================================================================================================================================================================================================================

 :)  Welcome to the My Library Management Service Application  :) 
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 1
==========================================
Enter the book titile : 
Mahabharatha
Enter the book author :  
vyasa
Enter the book ISBN : 
101
Enter the number off copyes :  
500
==========================================
Book  Added Successfully  
Book :
===============================================	
title='Mahabharatha'	
author='vyasa',	
isbn='101',	
copiesAvailable=500
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : Invalid input. Please enter a valid number.
 Please Enter your choice : 1
==========================================
Enter the book titile : 
Ramayana
Enter the book author :  
Valmiki
Enter the book ISBN : 
102
Enter the number off copyes :  
500
==========================================
Book  Added Successfully  
Book :
===============================================	
title='Ramayana'	
author='Valmiki',	
isbn='102',	
copiesAvailable=500
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : Invalid input. Please enter a valid number.
 Please Enter your choice : 5
==========================================
Listing of the all Book : 

Book :
===============================================	
title='Mahabharatha'	
author='vyasa',	
isbn='101',	
copiesAvailable=500

Book :
===============================================	
title='Ramayana'	
author='Valmiki',	
isbn='102',	
copiesAvailable=500
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 2
==========================================
Enter the  Member  ID : 1
Enter the  Member name  : Nagendra B K 
Enter the Member email : nagudio03@gmail.com
Enter the Member PhoneNumber : 9844664939
==========================================
Member added successfully: Member : 
=========================================
memberId=1, name='Nagendra B K', email='nagudio03@gmail.com', phoneNumber='9844664939'
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 6
==========================================
Listing of the all Member : 
Member : 
=========================================
memberId=1, name='Nagendra B K', email='nagudio03@gmail.com', phoneNumber='9844664939'
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 3
==========================================
Enter book ISBN: 101
Enter member ID: 1
Enter issue date (yyyy-MM-dd): 2024-10-01
Enter due date (yyyy-MM-dd): 2024-12-31
==========================================
Book issued successfully: Loan :
 ============================================
Book :
===============================================	
title='Mahabharatha'	
author='vyasa',	
isbn='101',	
copiesAvailable=499, member=Member : 
=========================================
memberId=1, name='Nagendra B K', email='nagudio03@gmail.com', phoneNumber='9844664939', issueDate=2024-10-01, dueDate=2024-12-31
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 7
==========================================
Listing of the all Loan : 
Loan :
 =============================================book=
Book :
===============================================	
title='Mahabharatha'	
author='vyasa',	
isbn='101',	
copiesAvailable=499, member=Member : 
=========================================memberId=1, name='Nagendra B K', email='nagudio03@gmail.com', phoneNumber='9844664939', issueDate=2024-10-01, dueDate=2024-12-31
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 8
==========================================
Listing of the all Overdue Loans
==========================================
 
Librabry Management Service Application Menu : 
1. Add Book 
2. Add member 
3. Issuse Book 
4. Return Book 
5. List Book 
6. List Members 
7. List Loan 
8. List Overdues Loan 
9. Exit 
 Please Enter your choice : 9
Exiting the application. Goodbye!
