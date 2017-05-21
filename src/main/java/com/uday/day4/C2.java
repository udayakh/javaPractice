package com.uday.day4;

interface H{
	void test1();
}
interface I{
	void test2();
}
interface J{
	void test3();
}
abstract class K implements H,I,J{
	public void test2(){
		System.out.println("from test2");
	}
}

public class C2 extends K {


	@Override
	public void test1() {
		System.out.println("C class - test1");
	}

	@Override
	public void test3() {
		System.out.println("C class - test2");
	}

}
