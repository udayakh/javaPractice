package com.uday.loop2;

public class S1 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
