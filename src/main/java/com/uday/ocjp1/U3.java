package com.uday.ocjp1;

class U2 {

	 int i = 10;

}

public class U3 extends U2 {
	static int i = 20;

	public static void main(String[] args) {
		i = 30;
		System.out.println(U3.i);
	}

}
