package com.uday.day2;

class L {
	static {
		System.out.println("L");
	}

	public static void main(String[] args) {
		System.out.println("L-main");
	}
}

public class M {

	static {
		System.out.println("M");
	}

	public static void main(String[] args) {
		System.out.println("M main-begin");
		L.main(null);
		System.out.println("M main-end");
	}

}
