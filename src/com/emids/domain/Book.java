package com.emids.domain;

public class Book {
	private String bookName;
	private String autherName;
	private double price;

	public Book(String bookName, String autherName, double price) {
		super();
		this.bookName = bookName;
		this.autherName = autherName;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.bookName + " by " + this.autherName + " rs " + this.price;
	}

}
