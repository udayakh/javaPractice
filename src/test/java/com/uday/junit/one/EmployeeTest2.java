package com.uday.junit.one;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest2 {

	@Mock
	EmployeeTest employeeTest;

	@InjectMocks
	Emp emp;

	@Test
	public void employee_add_test() {
		emp.setId(100);
		emp.setName("uday");
		employeeTest.addEmployee(emp);
		Assert.assertEquals("uday", emp.getName());
	}
}
