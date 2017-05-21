package com.uday.day4;

interface uday{
	void add();
	void update();
	
}
public class D5 implements uday{

	public static void main(String[] args) {

		String s="uday";
		s=s.concat("kumar");
		s="reddy";
		System.out.println(s);
	}

	@Override
	public void add() {
		System.out.println("add method");
	}

	@Override
	public void update() {
		
	}

}
