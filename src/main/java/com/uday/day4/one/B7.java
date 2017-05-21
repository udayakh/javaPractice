package com.uday.day4.one;

public class B7 {

	public static void main(String[] args) {

		
		String s1="True";
		String s2="False";
		String s3="abc";
		
		Boolean b1=new Boolean(s1);
		Boolean b2=new Boolean(s2);
		Boolean b3=new Boolean(s3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("--------------");
		boolean b4=b1.booleanValue();
		boolean b5=b2.booleanValue();
		boolean b6=b3.booleanValue();

		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
		System.out.println("-------");

		Short s=new Short((short) 2);
		System.out.println(s);
		Integer i=new Integer(s);
		System.out.println(i);
	}

}
