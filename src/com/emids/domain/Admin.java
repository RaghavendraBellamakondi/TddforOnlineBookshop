package com.emids.domain;

import java.util.Scanner;

public class Admin {
	private String name = "Raghavendra";
	private int password = 12345;
	Scanner scanner = new Scanner(System.in);

	public boolean getvalidation() {
		System.out.println("please Enter the your name");
		String name = scanner.next();
		if (this.name.equals(name)) {
			System.out.println("please Enter the password");
			int password = scanner.nextInt();
			return (this.password == password);
		} else
			return false;
	}

	public void facilites() {
		boolean flag = true;
		Product product = new Product();
		while (flag) {
			System.out.println("you want to add book if yes plase enter 1 or to remove book enter 2 ");
			int choice = scanner.nextInt();
			if (choice == 1) {

				System.out.println("please Enter book name");
				String name = scanner.next();
				System.out.println("please Enter auther name");
				String auther = scanner.next();
				System.out.println("please Enter price of the book");
				int price = scanner.nextInt();

				product.bookAdd(name, auther, price);

			} else if (choice == 2) {
				System.out.println("please enter book number you want to be remove");
				int index = scanner.nextInt();
				product.bookRemove(index);
			}
			System.out.println("you want to Continue plase enter 1 else 0");
			int exit = scanner.nextInt();
			if (exit == 0)
				flag = false;
		}
	}
}
