package com.emids.services;

import java.util.Scanner;

import com.emids.domain.Book;
import com.emids.domain.Customer;
import com.emids.domain.Product;

public class Order {
	static double sum = 0;
	Scanner scanner = new Scanner(System.in);

	public void order() {

		System.out.println("your cart is this");
		System.out.println(CustomerBookShelf.shelf);
		for (Book book : CustomerBookShelf.shelf) {
			sum = sum + book.getPrice();
		}
		if(CustomerBookShelf.shelf.isEmpty())
		{
			return;
		}
		System.out.println("you have to pay " + sum + "rupees");
		System.out.println("you want to buy books if yes plese enter 1 else 0");
		int buy = scanner.nextInt();
		if (buy == 1)
			buyProducts(null);
		else
			System.out.println("thank you..");
	}

	public static void buyProducts(Book book) {
		Customer customer = new Customer();
		customer.getcustomerDetails();
		if (book != null)
			sum = sum + book.getPrice();
		System.out.println("please pay this Rs: " + sum);
		System.out.println("order is successfully placed to the following details");
		customer.showDetails();

	}

	public Book getBookdirectly() {
		System.out.println("please enter the book number");
		int number = scanner.nextInt();
		for (Book book : Product.list) {
			if (book == (Product.list.get(number - 1))) {
				return book;
			}

		}
		return null;
	}

}
