package com.uday.junit.one;

class Emp {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

}

public class EmployeeTest {

	Emp emp = null;

	void addEmployee(Emp emp) {
		this.emp = emp;
	}

	void updateEmployee(Emp emp) {
		this.emp = emp;
	}

	static void deleteEmployee(Emp e) {
		e = null;
	}

}
