package com.uday.day4;

public class D9 {
	void test2(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {

		
		try {
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
			System.exit(2);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	}

}
