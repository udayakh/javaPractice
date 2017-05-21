package com.uday.day3;

abstract class sa{
	sa(){
		System.out.println("sa()");
	}
}
public class Sat extends sa {

	Sat(){
		System.out.println("Sat()");
	}
	public static void main(String[] args) {

		Sat s=new Sat();
		System.out.println("daone");
	}

}
