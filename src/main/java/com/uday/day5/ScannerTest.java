package com.uday.day5;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter your age");

		int age = reader.nextInt();

		System.out.println("enter your name");
		String name = reader.next();

		System.out.println("your name= " + name + "  age =" + age);

	}

}
