package com.uday.day3;

public class U6 {
  
	static int i1=10;
	static void uday(){
		System.out.println("uday");
	}

	void test() {
		System.out.println("test: " + this);
	}

	static {
		System.out.println("sib");
	}
	{
		System.out.println("iib");
	}

	public static void main(String[] args) {

		U6 u = new U6();
		U6 u1 = new U6();
		System.out.println("main : " + u);
		u.test();
		System.out.println("------------");
	}

}
