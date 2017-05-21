package com.uday.day3;

public class U8 {

	int i;

	void test1() {
		System.out.println("test1: "+i);
		i = 10;
	}
	void test2(){
		System.out.println("test2 "+i);
		test1();
		i=20;
	}

	public static void main(String[] args) {

		U8 u=new U8();
		System.out.println("main1: "+u.i);
		u.test1();
		System.out.println("main2: "+u.i);
		u.test2();
		System.out.println("main3: "+u.i);
		
		
	}

}
