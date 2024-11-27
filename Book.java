package com.entities;

import java.util.Objects;

public class Book {
	

	private String title;
    private String author;
    private String isbn; 
    private int copiesAvailable; 

    // Constructor
    public Book(String title, String author, String isbn, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn); // ISBN is unique for each book
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    
    @Override
    public String toString() {
        return "\nBook :\n" +
        		"===============================================" +
                "\t\ntitle='" + title + '\'' +
                "\t\nauthor='" + author + '\'' +
                ",\t\nisbn='" + isbn + '\'' +
                ",\t\ncopiesAvailable=" + copiesAvailable ;
    }


}
