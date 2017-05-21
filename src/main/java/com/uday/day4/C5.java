package com.uday.day4;

public class C5 {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = "abc";

		System.out.println(s2.equals(s1));
		System.out.println(s1);

		s1 = null + s1;
		System.out.println(s1);
		System.out.println(10+20+s2);
		System.out.println(s2+10+20);
	}

}
