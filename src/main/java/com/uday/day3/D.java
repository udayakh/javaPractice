package com.uday.day3;

class C {
	int i = 500;
	void test1() {
		System.out.println("from test1  "+i);
	}
}

public class D extends C {
	int i = 100, j;

	void test2() {
		System.out.println(super.i + " from-test2 " + this.i+" "+i);
	}

	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		System.out.println("===============");
		System.out.println(d1.i + " " + d1.j);
		d1.i = 10;
		d1.j = 20;
		System.out.println(d1.i + " " + d1.j);
	}

}
