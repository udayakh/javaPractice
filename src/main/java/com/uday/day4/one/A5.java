package com.uday.day4.one;

public class A5 {

	static void test1(A a1){
		System.out.println("test1 A");
	}
	
	static void test2(C c1){
		System.out.println("test2 C");
	}
	static D test3(){
		D d1=new D();
		return d1;
	}
	static B test4(){
		return new B();
	}
	public static void main(String[] args) {

		test1(new C());
		C c1=new C();
		test2(c1);
		D d1=test3();
		B b1=test4();
		System.out.println("============");
		C c2=new D();
		c2.test1();
		c2.test2();
		c2.test3();
		//c2.test4();
		
		System.out.println("==========");
		B b2=new D();
		
	}

}
