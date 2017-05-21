package com.uday.day3;

public class U10 {

	U10(double i,double j){
		System.out.println("i: "+i+"j: "+j);
	}
	U10(int i,int j){
		System.out.println("i: "+i+"j: "+j);
	}
	
	U10(double i,int j){
		System.out.println("i: "+i+"j: "+j);
	}
	U10(boolean b){
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		U10 u=new U10(90,90);
		System.out.println("=============");
		U10 u1=new U10(90.0,90);
		
	}
}
