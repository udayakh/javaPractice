package com.uday.day4;

public class A2 {

	public static void main(String[] args) {
		byte b = 10;
		double d = test(b);
		double d1=test1(d);
		System.out.println(d);
		System.out.println(d1);
	}

	private static int test1(double d) {
		return (int) d;
	}

	private static int test(short s) {
		return s;
	}

}
