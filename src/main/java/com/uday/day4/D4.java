package com.uday.day4;

class D11{
	void test(){
		System.out.println("from U");
	}
	static void test1(){
		System.out.println("from U static");
	}
	{
	System.out.println("IIB");
	}
	static {
		System.out.println("SIB");
	}
}
public class D4 extends D11{

	void test(){
		System.out.println("From D4");
	}
	static void test1(){
		System.out.println("From D4 static");
	}
	
	public static void main(String[] args) {
		D4 d=new D4();
		d.test();
		d.test1();

		D11 d11=new D4();
		d11.test();
		d11.test1();
	}

}
