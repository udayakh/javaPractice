package com.uday.day2;

public class I {

	static int i = test();
	static {
		System.out.println("sib1" + i);
	}

	static {
		System.out.println("sib2");
	}
	static int j = test();

	static int test() {
		System.out.println("test");
		return 10;
	}

	public static void main(String[] args) {

		System.out.println(i);
		System.out.println(j);
		System.out.println("done");
	}

}
