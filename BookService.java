package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.entities.Book;

public class BookService {
	
	private List<Book> books;
	
	public  BookService()
	{
		this.books = new  ArrayList<>();
	}
	
	public boolean addBook(Book book)
	{
		if(books.contains(book))
		{
			System.out.println("Book With  ISBN " +  book.getIsbn() + " already exist. ");
			return false;
		}
		books.add(book);
		System.out.println("==========================================");
		System.out.println("Book  Added Successfully  " + book);
		return true;
	}
	
	 public Optional<Book> findBookByIsbn(String isbn) {
	        return books.stream()
	                .filter(book -> book.getIsbn().equals(isbn))
	                .findFirst();
	    }
	 public List<Book> listAllBooks()
	 {
		return  new ArrayList<>(books); 
	 }
	  public boolean removeBookByIsbn(String isbn) {
	        Optional<Book> bookOptional = findBookByIsbn(isbn);
	        if (bookOptional.isPresent()) {
	            books.remove(bookOptional.get());
	            System.out.println("Book with ISBN " + isbn + " has been removed.");
	            return true;
	        }
	        System.out.println("Book with ISBN " + isbn + " not found.");
	        return false;
	    }
	  
	  
	  public boolean updateCopies(String isbn, int newCopies) {
	        Optional<Book> bookOptional = findBookByIsbn(isbn);
	        if (bookOptional.isPresent()) {
	            Book book = bookOptional.get();
	            book.setCopiesAvailable(newCopies);
	            System.out.println("Updated copies for ISBN " + isbn + ": " + newCopies);
	            return true;
	        }
	        System.out.println("Book with ISBN " + isbn + " not found.");
	        return false;
	    }
	 

	

}
