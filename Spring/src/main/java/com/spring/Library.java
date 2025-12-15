package com.spring;

import java.util.List;

public class Library {
	private List<Book> books;//property

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {//setter injection
		this.books = books;
	}

	
}