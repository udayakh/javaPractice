package com.uday.day3;

public class U4 {

	void test() {
		System.out.println("test: " + this);
	}

	public static void main(String[] args) {
		U4 u=new U4();
		System.out.println("main: "+ u);
		u.test();
		
		U4 u1=new U4();
		System.out.println("main: "+ u1);
		u1.test();
	}
}
