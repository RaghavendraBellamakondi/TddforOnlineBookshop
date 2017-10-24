package com.emids.main;

import java.util.Scanner;

import com.emids.services.CustomerBookShelf;
import com.emids.services.Inventory;
import com.emids.testclasses.util.ScannerMethodclass;

public class OnlineBookShop {
	Inventory inventory1 = new Inventory();
	Scanner scanner = new Scanner(System.in);
	CustomerBookShelf customerBookShelf = new CustomerBookShelf();

	void all() {

		inventory1.showAll();
	}

	void searchBybookName() {
		System.out.println("Enter the book name ");
		String name = ScannerMethodclass.getInputString();
		inventory1.searchBybookName(name);
	}

	void searchByautherName() {
		System.out.println("Enter the auther name ");
		String auther = scanner.nextLine();
		inventory1.searchBybookName(auther);
	}

	void addToCart() {
		customerBookShelf.add();
		System.out.println("the books in your cart");
		System.out.println(CustomerBookShelf.shelf);
		System.out.println("you want to remove the books if yes please Enter 1 else 0");
		int remove = scanner.nextInt();
		if (remove == 1) {
			boolean condition = true;
			while (condition) {
				customerBookShelf.remove();
				System.out.println(CustomerBookShelf.shelf);
				System.out.println("you want to remove again if yes please Enter 1 else 0");
				int flag = scanner.nextInt();
				if (flag == 0)
					condition = false;
			}
		}
	}
}