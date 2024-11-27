package com.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.entities.Book;
import com.entities.Loan;
import com.entities.Member;

public class LoanService {
	 private List<Loan> loans; // Collection to store loan records

	    // Constructor
	    public LoanService() {
	        this.loans = new ArrayList<>();
	    }

	    // Issue a book to a member
	    public boolean issueBook(Book book, Member member, LocalDate issueDate, LocalDate dueDate) {
	        if (book.getCopiesAvailable() <= 0) {
	        	System.out.println("==========================================");
	            System.out.println("No copies of the book are available for loan: " + book.getTitle());
	            return false;
	        }

	        Loan loan = new Loan(book, member, issueDate, dueDate);
	        loans.add(loan);
	        book.setCopiesAvailable(book.getCopiesAvailable() - 1); 
	        System.out.println("==========================================");
	        System.out.println("Book issued successfully: " + loan);
	        return true;
	    }

	    // Return a book
	    public boolean returnBook(String isbn, int memberId) {
	        Optional<Loan> loanOptional = loans.stream()
	                .filter(loan -> loan.getBook().getIsbn().equals(isbn) &&
	                                loan.getMember().getmemberId() == memberId)
	                .findFirst();

	        if (loanOptional.isPresent()) {
	            Loan loan = loanOptional.get();
	            loans.remove(loan);
	            loan.getBook().setCopiesAvailable(loan.getBook().getCopiesAvailable() + 1); // Increase available copies
	            System.out.println("==========================================");
	            System.out.println("Book returned successfully: " + loan.getBook().getTitle());
	            return true;
	        }

	        System.out.println("No loan record found for the book with ISBN " + isbn + " and member ID " + memberId);
	        return false;
	    }

	    // List all current loans
	    public List<Loan> listAllLoans() {
	        return new ArrayList<>(loans);
	    }

	    // List overdue loans
	    public List<Loan> listOverdueLoans() {
	        return loans.stream()
	                .filter(Loan::isOverdue)
	                .toList();
	    }

	    // Check if a specific book is loaned to a member
	    public boolean isBookLoanedToMember(String isbn, int memberId) {
	        return loans.stream()
	                .anyMatch(loan -> loan.getBook().getIsbn().equals(isbn) &&
	                                  loan.getMember().getmemberId() == memberId);
	    }

}
