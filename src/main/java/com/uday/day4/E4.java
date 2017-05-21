package com.uday.day4;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<0){
			throw new AgelsNegativeExecption("Age should not be -Ve");
		}
		System.out.println("your age is: "+age);
	}

}
