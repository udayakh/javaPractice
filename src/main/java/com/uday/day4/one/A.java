package com.uday.day4.one;

class A {

}

class B extends A{
	
}

class C extends B{
	void test1()  {
		System.out.println("test1 from class C");
	}
	void test2(){
		System.out.println("test2 from class C");
	}
	void test3(){
		System.out.println("test3 from class C");
	}
	
}

class D extends C{
	
	void test1(){
		System.out.println("test1 from class D");
	}
	void test2(){
		System.out.println("test2 from class D");
	}
	void test4(){
		System.out.println("test4 from class D");
	}
}