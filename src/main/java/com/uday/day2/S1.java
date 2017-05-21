package com.uday.day2;

class S1 {
	static int test() {
		System.out.println("from test");
		return 10;
	}

	public static void main(String[] args) {
		int i = test();
		int j = 10 + test();
		System.out.println(test());
	}
}
