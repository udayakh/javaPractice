package com.uday.junit.one;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Emp.class)
public class EmployeeTest3 {

	@Mock
	EmployeeTest employeeTest;

	@InjectMocks
	Emp emp;

	public void setUp() {
		employeeTest = PowerMockito.mock(EmployeeTest.class);
		emp = PowerMockito.mock(Emp.class);
	}

	@Test
	public void employee_add_test() {
		emp.setId(100);
		emp.setName("uday");
		employeeTest.addEmployee(emp);
		Assert.assertEquals("uday", emp.getName());
	}

}
