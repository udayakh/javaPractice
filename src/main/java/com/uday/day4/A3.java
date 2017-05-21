package com.uday.day4;

public class A3 {

	public static void main(String[] args) {

		double d1 = 12.9;
		int i = (int) d1;
		System.out.println(d1);
		System.out.println(i);
		
		byte b=10;
		double d2=10.8;
		test(b);
		test((byte)d2);
		System.out.println("done");
	}

	private static void test(byte b) {
		System.out.println("test: "+b);
	}

}
