package com.uday.day2;

public class R {
	static int i = 10;
}

class S {
	static void test() {
		System.out.println("from test");
	}

	public static void main(String[] args) {
		System.out.println("done");
		S.main(null);

	}

}
