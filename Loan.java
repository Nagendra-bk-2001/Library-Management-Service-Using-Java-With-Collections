package com.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Loan {
	private Book book;              
    private Member member;          
    private LocalDate issueDate;    
    private LocalDate dueDate;      

    // Constructor
    public Loan(Book book, Member member, LocalDate issueDate, LocalDate dueDate) {
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Objects.equals(book, loan.book) &&
               Objects.equals(member, loan.member) &&
               Objects.equals(issueDate, loan.issueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, member, issueDate);
    }

   
    @Override
    public String toString() {
        return "Loan :\n " +
        		"=============================================" +
                "book=" + book +
                ", member=" + member +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate 
                ;
    }

}
