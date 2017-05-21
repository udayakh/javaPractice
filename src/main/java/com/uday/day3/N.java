package com.uday.day3;

public class N {

	int i=10;
	N(){
		System.out.println("N()");
	}
	N(int i){
		N n=new N();
		System.out.println("N(int)");
	}
	N(int i,int j){
		this(10);
		System.out.println("N(int)");
	}
	public static void main(String[] args) {
		
		N n1=new N();
		System.out.println(n1.i);
		System.out.println("----");
		
		N n2=new N(10);
		System.out.println("==========");
	}
	
}
