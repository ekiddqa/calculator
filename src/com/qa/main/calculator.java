package com.qa.main;

import java.util.Scanner;

public class calculator {
	public static void menu() {
		System.out.println("1. Addtion");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter number of desired operation: ");

	        String i = scan.nextLine();
	        switch(i) {
	        	case "1":
	        		System.out.println("Enter first number: ");
	        		String p = scan.nextLine();
	        		double a = Double.parseDouble(p);
	        		System.out.println("Enter second number: ");
	        		String w = scan.nextLine();
	        		double b = Double.parseDouble(w);
	        		System.out.println(addition(a,b));
	        		scan.close();
	        		break;
	        	case "2":
	        		System.out.println("Enter first number: ");
	        		String e = scan.nextLine();
	        		double x = Double.parseDouble(e);
	        		System.out.println("Enter second number: ");
	        		String r = scan.nextLine();
	        		double y = Double.parseDouble(r);
	        		System.out.println(substraction(x,y));
	        		scan.close();
	        		break;
	        	case "3":
	        		System.out.println("Enter first number: ");
	        		String t = scan.nextLine();
	        		double m = Double.parseDouble(t);
	        		System.out.println("Enter second number: ");
	        		String u = scan.nextLine();
	        		double n = Double.parseDouble(u);
	        		System.out.println(multiplication(m,n));
	        		scan.close();
	        		break;
	        	case "4":
	        		System.out.println("Enter first number: ");
	        		String s = scan.nextLine();
	        		try {
	        		double o = Double.parseDouble(s);
	        		} catch(NumberFormatException error) {
	        			System.out.println("Entered non numbers.");
	        		}
	        		System.out.println("Enter second number: ");
	        		String d = scan.nextLine();
	        		double j = Double.parseDouble(d);
	        		System.out.println(division(o,j));
	        		scan.close();
	        		break;
	        	default:
	        		System.out.println("Invalid entry.");
	        		scan.close();
	        		}
	        }
	        
	
	public static double addition(double a, double b) {
		return a + b;
	}
	public static double substraction(double a, double b) {
		return a - b;
	}
	public static double multiplication(double a, double b) {
		return a * b;
	}
	public static double division(double a, double b) {
		try {
		return a/b;
		} catch ()
	}
}
