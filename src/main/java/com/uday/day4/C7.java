package com.uday.day4;

public class C7 {

	public static void main(String[] args) {

		String s1="abc 123 xyz";
		
		int i=s1.indexOf("123");
		System.out.println(i);
		
		String s2="abcaacCbc";
		System.out.println("--------");
		int i1=s2.indexOf('a');
		System.out.println(i1);
		
		int i2=s2.indexOf('c',7);
		System.out.println(i2);
		
		String s3="abc hello abc";
		int i3=s3.lastIndexOf('b');
		System.out.println(i3);
		
		
		
		
	}

}
