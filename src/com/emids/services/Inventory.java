package com.emids.services;

import com.emids.domain.Book;
import com.emids.domain.Product;

public class Inventory {
	public void showAll() {
		int slno = 1;
		for (Book book : Product.list) {

			System.out.println(slno + ") " + book);
			slno++;
		}
	}

	public void searchBybookName(String name) {
		int count = 0;
		for (Book book : Product.list) {
			if (name.equalsIgnoreCase(book.getBookName())) {
				System.out.println(book);
				count++;
			}
		}
		for (Book book : Product.list) {
			if (name.equalsIgnoreCase(book.getAutherName())) {
				System.out.println(book);
				count++;
			}
		}

		if (count == 0) {
			System.out.println("sorry this book is not available");
		}

	}

}
