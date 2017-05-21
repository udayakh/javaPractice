package com.uday.day3;

class A1{
	static{
		System.out.println("A1-SCB");
	}
}
class B1 extends A1{
	static{
		System.out.println("B1-SCB");
	}
}

class C1 extends B1{
	static{
		System.out.println("C-SIB");
	}
}
public class D1 {
static{
	System.out.println("D1-SCB");
}
	public static void main(String[] args) {
		B1 b1=new B1();
		System.out.println("done");
	}

}
