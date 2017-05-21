package com.uday.day2;

class Test7 {
	static void test() {
		System.out.println("test begin");
		if (true) {
			System.out.println("from if");
			return;
		}
		System.out.println("test end");
		return;
	}

	public static void main(String[] args) {

		System.out.println("main begin");
		test();
		System.out.println("main end");
	}

}
