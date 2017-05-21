package com.uday.day4.one;

public class A8 {

	public static void main(String[] args) {

		A a1=new B();
		B b1=(B) a1;
		System.out.println("done");
		
		B b2=new D();
		C c1=(D) b2;
		System.out.println("done");
	}

}
