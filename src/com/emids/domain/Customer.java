package com.emids.domain;

import java.util.Scanner;

public class Customer {
	String name;
	int id;
	long phNo;
	String cityName;
	String homeno;

	public void getcustomerDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("please Enter your name");
		this.name = scanner.nextLine();
		System.out.println("please Enter your id");
		this.id = scanner.nextInt();
		System.out.println("please Enter your phno");
		this.phNo = scanner.nextLong();
		System.out.println("please Enter your city name");
		this.cityName = scanner.next();
		System.out.println("please Enter your home no");
		this.homeno = scanner.next();
	}

	public void showDetails() {
		System.out.println(this.name + "  " + this.id + "  " + this.cityName + "  " + this.homeno);
	}
}
