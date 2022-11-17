package com.wp.java_annotation;

public class Book {

	private int isbn;
	private String name;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int isbn, String name) {
		super();
		this.isbn = isbn;
		this.name = name;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + "]";
	}
	
	
}
