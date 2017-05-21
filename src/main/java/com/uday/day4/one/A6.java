package com.uday.day4.one;

public class A6 {

	static void test(A a1) {
		System.out.println("from test1");
	}

	public static void main(String[] args) {
		test(new B());
		test(new C());
		test(new D());
		B b1=new B();
		
	}

}
