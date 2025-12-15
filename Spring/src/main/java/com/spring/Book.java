 package com.spring;

public class Book {
	private int bookId;
	private String bookName;
	public Book(int bookId, String bookName) { //constructor injection
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Book() {}
	public String toString()
	{
		return bookId+" "+bookName;
	}
}