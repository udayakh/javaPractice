package com.uday.day4;

public class B5 {
 int z=10;
	public static void main(String[] args) {
		B5 a = new B5();
		final B5 b = new B5();

		final int x[] = new int[2];
		System.out.println(x[0]);
		x[0] = 100;
		x[1] = 200;
		System.out.println(x[0]);
		System.out.println(args);
		args=null;
		System.out.println(args);
		b.z=10;
	}
}
