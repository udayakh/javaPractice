package com.uday.day4;

public class C4 {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";
		Object o1 = s1;
		Object o2 = s2;
		System.out.println(new C4());
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(o1.equals(o2));

	}

	public String toString(){
		System.out.println("Overided toString");
		return super.toString();
	}

}
