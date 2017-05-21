package com.uday.ocjp1;

interface UA1 {
	void m1();
}

public class U6 implements UA1{

	public static void main(String[] args) {
		U6 u=new U6();
		u.m1();
	}

	@Override
	public void m1() {
		System.out.println("Override m1() method in U6 class");
	}

}
