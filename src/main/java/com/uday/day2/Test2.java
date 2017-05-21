package com.uday.day2;

public class Test2 {
	public static void main(String[] args) {
		int i = 0;
		int j = test2(++i);
		System.out.println(j);
	}

	private static int test2(int i) {
		System.out.println("test2 " + i);
		return test3(i--) + test3(--i);
	}

	private static int test3(int i) {
		System.out.println("test3 " + i);
		return i++ + ++i + i;
	}

}
