package com.uday.day3;

public class Employee {

	private int id;
	private String name;
	private static String address = "Bangalore";
	private static String company = "wipro";

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.id = 10;
		e1.name = "udaya kumar";
		Employee e2 = new Employee();
		e2.id = 20;
		e2.name = "Ram kumar";
		System.out.println(e1.id + " " + e1.name + " " + e1.address + " " + e1.company);
		System.out.println(e2.id + " " + e2.name + " " + e2.address + " " + e2.company);

	}

}
