package com.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.entities.Book;
import com.entities.Member;
import com.service.BookService;
import com.service.LoanService;
import com.service.MemberService;
import com.utils.DateUtils;

public class LibraryManagementSystem {
	private static BookService bookService = new BookService();
    private static MemberService memberService = new MemberService();
    private static LoanService loanService = new LoanService();
    private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println(" :)  Welcome to the My Library Management Service Application  :) ");
		while(true)
		{
			try {
				displayMenu();
				int choice = getUserChoice();
		            if (choice == 9) { // Exit condition
		                System.out.println("Exiting the application. Goodbye!");
		                break;
		            }
		            handleMenuChoice(choice);
				}catch(Exception e)
			{
				System.out.println("An unexpected error occurred: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	private static void displayMenu()
	{
		System.out.println(" \nLibrabry Management Service Application Menu : ");
		System.out.println("1. Add Book ");
		System.out.println("2. Add member ");
		System.out.println("3. Issuse Book ");
		System.out.println("4. Return Book ");
		System.out.println("5. List Book ");
		System.out.println("6. List Members ");
		System.out.println("7. List Loan ");
		System.out.println("8. List Overdues Loan ");
		System.out.println("9. Exit ");
//		System.out.print(" Please Enter your choice : ");
	}
	
	private static int getUserChoice()
	{
		while(true)
		{
			System.out.print(" Please Enter your choice : ");
			 String input = sc.nextLine().trim();
			try {
				
				int choice = Integer.parseInt(input);
				return choice;
			}catch(NumberFormatException e)
			{
				System.out.println("Invalid input. Please enter a valid number.");
//				return 1;
			}
			
		}
		
		
	}
	
	private static void handleMenuChoice(int choice)
	{
		switch(choice)
		{
		case 1 : addBook();
			break;
		case 2 : addMember();
			break;
		case 3:
			issuseBook();
			break;
		case 4 : returnBook();
				break;
		case 5 :listBook();
				break;
		case 6 :listMember();
				break;
		case 7 :listLoan();
				break;
		case 8 : listOverdueLoan();
				break;
		default :
			System.out.println("Invalid choice . please Try again");
		}
	
		
	}

	
	private static void addBook() 
	{
		try {
		System.out.println("==========================================");
		System.out.println("Enter the book titile : ");
		String title = sc.nextLine();
		
		System.out.println("Enter the book author :  ");
		String author = sc.nextLine();
		
		System.out.println("Enter the book ISBN : ");
		String isbn = sc.nextLine();
		
		System.out.println("Enter the number off copyes :  ");
		int cope = sc.nextInt();
		
		Book book = new Book(title,author, isbn,cope);
		
		bookService.addBook(book);
		System.out.println("==========================================");
		}catch(NumberFormatException e)
		{
		    System.out.println("Invalid input. Number of copies must be a valid number.");
		}catch(Exception e)
		{
			 System.out.println("Error adding Book " + e.getMessage());
		}
	}
	private static void addMember()
	{
		try {
		System.out.println("==========================================");
		System.out.print("Enter the  Member  ID : ");
		int  memberId = Integer.parseInt(sc.nextLine().trim());
		
		System.out.print("Enter the  Member name  : ");
		String name = sc.nextLine().trim();
		
		System.out.print("Enter the Member email : ");
		String email = sc.nextLine().trim();
		
		System.out.print("Enter the Member PhoneNumber : ");
		String phonenumber = sc.nextLine().trim();
		
		Member member = new Member(memberId, name, email, phonenumber);
		memberService.addMember(member);
		System.out.println("==========================================");
		}catch(NumberFormatException e)
		{
			 System.out.println("Invalid input. Member ID  must be a valid number.");
		}
		catch(Exception e)
		{
			System.out.println("Error adding Member" +  e.getMessage());
		}
	}
	
	private static void issuseBook() {
		
		try {
		System.out.println("==========================================");
        System.out.print("Enter book ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter member ID: ");
        int memberId = Integer.parseInt(sc.nextLine());
        System.out.print("Enter issue date (yyyy-MM-dd): ");
        String issueDateString = sc.nextLine();
        LocalDate issueDate = DateUtils.parseDate(issueDateString);
        System.out.print("Enter due date (yyyy-MM-dd): ");
        String dueDateString = sc.nextLine();
        LocalDate dueDate = DateUtils.parseDate(dueDateString);

        Book book = bookService.findBookByIsbn(isbn).orElse(null);
        Member member = memberService.findMemberById(memberId).orElse(null);

        if (book != null && member != null) {
            loanService.issueBook(book, member, issueDate, dueDate);
        } else {
            System.out.println("Invalid book or member details.");
        }
        System.out.println("==========================================");
		}catch(NumberFormatException e)
		{
			System.out.println("Invalid input. Member ID  must be a valid number.");	
		}catch(Exception e)
		{
			System.out.println("Error issuse book" +  e.getMessage());
		}
    }
	
	private static void returnBook()
	{
		try
		{
		System.out.println("==========================================");
		System.out.println("Enter the  Book ISBN : ");
		String isbn = sc.nextLine();
		
		System.out.println("Enter the Member Id : ");
		int  memberId = sc.nextInt();
		
		loanService.returnBook(isbn, memberId);
		System.out.println("==========================================");
		}catch(NumberFormatException e)
		{
			System.out.println("Invalid input. Member ID  must be a valid number.");	
		}catch(Exception e)
		{
			System.out.println("Error return book" +  e.getMessage());
		}
		
	}
	public static void listBook()
	{
		System.out.println("==========================================");
		System.out.println("Listing of the all Book : ");
		bookService.listAllBooks().forEach(System.out::println);
		System.out.println("==========================================");
	}
	
	public static void listMember()
	{
		System.out.println("==========================================");
		System.out.println("Listing of the all Member : ");
		memberService.listAllMembers().forEach(System.out::println);
		System.out.println("==========================================");
	}
	
	public static void listLoan()
	{
		System.out.println("==========================================");
		System.out.println("Listing of the all Loan : ");
		loanService.listAllLoans().forEach(System.out::println);
		System.out.println("==========================================");
	}
	
	public static  void listOverdueLoan()
	{
		System.out.println("==========================================");
		System.out.println("Listing of the all Overdue Loans");
		loanService.listOverdueLoans().forEach(System.out::println);
		System.out.println("==========================================");
	}
		
}
