package com.uday.day3;

class A {
	int i=10;
}

public class B extends A {
	int j;
	int i=20;
	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);
	}

}
