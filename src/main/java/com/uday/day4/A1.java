package com.uday.day4;

public class A1 {

	public static void main(String[] args) {
		int i = 10;
		double d = i;
		float f = i;
		System.out.println(d);
		test(i);
		test1(i);
		test2(f);
		System.out.println(test3());
		System.out.println("done");
	}

	private static double test3() {
		int i=10;
		return i;
	}

	private static void test2(float f) {
		System.out.println("float: " + f);
	}

	private static void test1(int i) {
		System.out.println("int " + i);
	}

	private static void test(double d) {
		System.out.println("double " + d);
	}
	
	

}
