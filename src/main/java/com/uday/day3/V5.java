package com.uday.day3;

abstract class V4 {

	V4(int i) {
		System.out.println("constructor of V4 class");
	}

	void test2() {
		System.out.println("from test2");
	}

	abstract void test3();
}

class V5 extends V4 {

	V5() {
		super(10);
	}

	void test1() {
		System.out.println("from test1");
	}

	public static void main(String[] args) {

		V5 g1 = new V5();
		g1.test1();
		g1.test2();
		g1.test3();

	}

	@Override
	void test3() {
		System.out.println("from test3");
	}

}
