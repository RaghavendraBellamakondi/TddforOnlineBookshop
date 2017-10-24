package com.emids.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.emids.domain.Book;
import com.emids.domain.Product;

public class CustomerBookShelf {
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<Book> shelf = new ArrayList<>();

	public void add() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the book number as mentioned above to add to cart");
			int index = scanner.nextInt();
			shelf.add(Product.list.get(index - 1));
			System.out.println("you want to add some more if yes please Enter 1 else 0");
			int condition = scanner.nextInt();
			if (condition == 0)
				flag = false;
		}
	}

	public void remove() {
		System.out.println("Enter the book number as mentioned above to remove from the cart");
		int remove = scanner.nextInt();
		shelf.remove(remove - 1);
	}
}
