package com.emids.testclasses.util;

import java.util.Scanner;

public class ScannerMethodclass {
	

	    public int getInput(int x) {
	        Scanner sc = new Scanner(System.in);
	        return sc.nextInt();
	    }
	    public static String getInputString() {
	    	Scanner sc=new Scanner(System.in);
	    	
	    	return sc.nextLine();
	    }
	}


