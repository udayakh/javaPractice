package com.uday.day4;

public class D3 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("===========");

		String s = new String("xyz");
		s.concat("abc");
		s.concat("abc");
		s.concat("abc");
		System.out.println(s);
		System.out.println(s.length());
	}

}
