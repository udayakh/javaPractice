package com.uday.dataandtime;

class Ta1 {

	static int i = 0;
	
	Ta1(){
		i=10;
	}

	static void main() {
		System.out.println("ta1");
	}

	static {
		System.out.println("SIB");
	}

}

class Ta2 extends Ta1 {

	final static int j = 0;

	static void main() {
		System.out.println("ta2");
	}

	{
		System.out.println("IIB");
	}

}

public class T2 {

	public static void main(String[] args) {

		Ta1 ta1 = new Ta2();
		System.out.println(ta1.i);
		System.out.println(Ta1.i);

		ta1.main();

	}

}
