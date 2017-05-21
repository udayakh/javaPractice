package com.uday.day4;

public class C3 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");

		C3 c1=new C3();
		C3 c2=new C3();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c1));
		System.out.println(c2.equals(c1));
		
		
		
	}

}
