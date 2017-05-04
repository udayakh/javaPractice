package com.uday.junit.one;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeJTest {

	EmployeeTest employeeTest;
	Emp emp;

	@Before
	public void setUp() {
		employeeTest = new EmployeeTest();
		emp = new Emp();
	}

	@Test
	public void employee_add_test() {
		emp.setId(100);
		emp.setName("udaya kumar");
		employeeTest.addEmployee(emp);
		assertEquals("udaya kumar", emp.getName());
	}
	
	@Test
	public void employee_update_test() {
		emp.setId(100);
		emp.setName("udaya reddy");
		employeeTest.updateEmployee(emp);
		assertEquals("udaya reddy", emp.getName());
	}
	
	
	
}
