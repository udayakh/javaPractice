package com.uday.day3;

public class U11 {

	static{
		System.out.println("SIB");
	}
	U11(){
		System.out.println("U11() const");
	}
	{
		System.out.println("IIB");
	}
	
	U11(int i){
		System.out.println(i+" int param");
	}

	U11(double d){
		this(10);
		System.out.println(d+" double parma");
	}
	public static void main(String[] args) {

		U11 u1=new U11();
		System.out.println("=======");
		U11 u2=new U11();
		System.out.println("========");
		U11 u3=new U11(12.0);
		System.out.println("========");
		
	}

}
