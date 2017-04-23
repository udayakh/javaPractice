package com.uday.doubts;

class Address{
	static int homeno=23;
	private String streetname="main road";
	private String zipcode="121212";
}
public class Test3 {

	String name ;

	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.name);
		Address a=new Address();
		System.out.println(Address.homeno);
	}

}
