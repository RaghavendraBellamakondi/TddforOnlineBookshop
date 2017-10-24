package com.emids.main;

import java.util.Scanner;

import com.emids.domain.Admin;
import com.emids.domain.Book;
import com.emids.services.Order;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		OnlineBookShop shop = new OnlineBookShop();
		Order order1 = new Order();
		boolean condition = true;
		while (condition) {
			System.out.println("please Enter your choice " + "\n" + "1)To view all books" + " \n"
					+ "2)to search books by bookname " + "\n" + "3)search by auther name" + "\n" + "4)add to cart"
					+ "\n" + "5)to order book directly" + "\n" + "6)exit" + "\n" + "7)Admin");
			int choice = scanner.nextInt();
			condition = helperMethod(shop, order1, condition, choice);
			System.out.println("\n");
		}
	}

	public static boolean helperMethod(OnlineBookShop shop, Order order1, boolean condition, int choice) {
		switch (choice) {
		case 1:
			shop.all();
			break;
		case 2:
			shop.searchBybookName();
			break;
		case 3:
			shop.searchByautherName();
			break;
		case 4:
			shop.addToCart();

			order1.order();
			break;
		case 5:
			Book book1 = order1.getBookdirectly();
			Order.buyProducts(book1);
			break;

		case 6:
			System.out.println("thank you ....");
			condition = false;
			System.exit(0);
		case 7:
			Admin admin = new Admin();
			boolean valid = admin.getvalidation();
			if (valid == true) {
				admin.facilites();
				break;
			}
		default:
			System.exit(0);
		}
		return condition;
	}

}
