package com.uday.day4.one;

class GenericDataType1<A,B,C>{
	A i;
	B j;
	C k;
}


public class DemoGenericDataType1 {

	public static void main(String[] args) {

		GenericDataType1<Integer,String,String> g1=new GenericDataType1();
		
		GenericDataType1<String,String,Double> g2=new GenericDataType1();
		
		g2.k=10.5;
		System.out.println(g1.i);
		System.out.println(g1.j);
		System.out.println(g1.k);
		
		System.out.println(g2.i);
		System.out.println(g2.j);
		System.out.println(g2.k);
		
	}

}
