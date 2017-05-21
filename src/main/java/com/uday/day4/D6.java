package com.uday.day4;

public class D6 {

	public static void main(String[] args) {

		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		} catch (RuntimeException e) {
			System.out.println(4);
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println(5);
		}
		System.out.println(6);
	}

}
