package com.emids.domain;

import java.util.ArrayList;

public class Product {
	public static ArrayList<Book> list = new ArrayList<>();
	static {
		Book book1 = new Book("java", "rama", 200);
		Book book2 = new Book("jdbc", "raghu", 300);
		Book book3 = new Book("phython", "sham", 500);
		Book book4 = new Book("j2ee", "smitha", 100);
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
	}

	public void bookAdd(String name, String auther, double price) {
		list.add(new Book(name, auther, price));
		System.out.println("book is added successfully..");
		System.out.println(list);
	}

	public void bookRemove(int index) {
		list.remove(index - 1);
		System.out.println("book is removed successfully..");

		System.out.println(list);
	}
}
