package com.uday.day3;

class O {
	O(int i) {
		System.out.println("o(int)");
	}

	O() {
		System.out.println();
	}

	{
		System.out.println("o-IIB");
	}
	static {
		System.out.println("o-SIB");
	}
}

public class P extends O{

	static {
		System.out.println("p=SIB");
	}

	P(int i) {
		super(10);
		System.out.println("P-IIB");
	}

	{
		System.out.println("p-IIB");
	}

	public static void main(String[] args) {
		O o1 = new O(10);
		System.out.println("-------");
		P p1=new P(10);
		System.out.println("---------");

	}

}
