package com.uday.day3;

class V1{
	V1(){
		System.out.println("V1() constructor");
	}
	V1(int i){
		super();
		System.out.println("V1(int)");
	}
	V1(int i,int j){
		this(10);
		System.out.println("V1(int,int)");
	}
}

public class V2 extends V1{

	V2(){
		System.out.println("v2()");
	}
	public static void main(String[] args) {

		V1 v=new V1(90,90);
		System.out.println("-----------------");
		V2 v2=new V2();
		
	}

}
