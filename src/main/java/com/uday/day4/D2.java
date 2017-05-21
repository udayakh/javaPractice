package com.uday.day4;

public class D2 {

	public static void main(String[] args) {

		String s1="abc";
		//String s2=new String("abc");
		String s2="abc";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		D2 d=new D2();
		System.out.println(d.hashCode());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(2));
		
	}

}
