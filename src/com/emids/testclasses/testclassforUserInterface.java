package com.emids.testclasses;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.emids.domain.Book;
import com.emids.main.OnlineBookShop;
import com.emids.main.UserInterface;
import com.emids.services.Order;
import com.emids.testclasses.util.ScannerMethodclass;

public class testclassforUserInterface {
	ScannerMethodclass sc=new ScannerMethodclass();
	OnlineBookShop shop =new OnlineBookShop();
	Order order1=new Order();
	boolean condition=true;
	@Test
	public void Whenusergives1tohelperMethodThenitmustshowsalltheBooksavailable() {
		int choice=1;
		
		UserInterface.helperMethod(shop, order1, condition, choice);
		
	}
	
	
	@Mock
	private Book book=new Book("java","rama",200);
	@Test
	public void Whenusergives2tohelperMethodThenitmustasktheusertosearchbyBookname() {
		int choice=2;
			
		
		 Mockito.when(ScannerMethodclass.getInputString()).thenReturn("java");
		
		 UserInterface.helperMethod(shop, order1, condition, choice);
		
	}
@Test
	public void Whenusergives3tohelperMethodThenitmustasktheusertosearchbyauthoername() {
		int choice=3;
		UserInterface.helperMethod(shop, order1, condition, choice);
	}
	@Test
	public void Whenusergives4tohelperMethodThenitmustasktheusertoaddtocart() {
		int choice=4;
		UserInterface.helperMethod(shop, order1, condition, choice);
		
	}
	@Test
	public void Whenusergives5tohelperMethodThenitmustasktheusertodirectlybuyingoption() {
		int choice=5;
		UserInterface.helperMethod(shop, order1, condition, choice);
		
	}
	@Test
	public void Whenusergives6tohelperMethodThenitmustasktheusertoexit() {
		int choice=6;
		UserInterface.helperMethod(shop, order1, condition, choice);
		
	}
	@Test
	public void Whenusergives7tohelperMethodThenitmustenterintoadminsection() {
		
		boolean condition=true;
		int choice=7;
		UserInterface.helperMethod(shop, order1, condition, choice);
		
	}
	

}
