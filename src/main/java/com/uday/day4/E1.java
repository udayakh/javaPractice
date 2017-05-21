package com.uday.day4;

public class E1 {

	public static void main(String[] args) throws ClassNotFoundException {
		test13();
		test12();
	}

	static void test12() throws ClassNotFoundException{
		Class.forName("com.uday.day4.A1");
		System.out.println("hello Raj");
	}
	static void test13() {
		try {
			Class.forName("com.uday.day4.A1");
			System.out.println("hello");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
