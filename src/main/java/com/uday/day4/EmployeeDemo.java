package com.uday.day4;

import static java.lang.System.*;

class Employee {
	String firstName;
	String lastName;
	int ssn;
	double gs;
	double commission;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public double getGs() {
		return gs;
	}

	public void setGs(double gs) {
		this.gs = gs;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

}

class CommissionEmp extends Employee {

}

class BaseCommisssionEmp extends Employee {
	double basic;

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

}

public class EmployeeDemo {
	double total;

	public static void main(String[] args) {

		Employee ce = new CommissionEmp();
		ce.setFirstName("Ravi");
		ce.setLastName("Kishor");
		ce.setSsn(1218921829);
		ce.setGs(1000.0);
		ce.setCommission(100);
		out.println(ce.firstName + " " + ce.lastName + " " + ce.ssn + " " + ce.gs + " " + ce.commission);
		out.println("total=" + (ce.gs * ce.commission));
		System.out.println("---------------");
		BaseCommisssionEmp e = new BaseCommisssionEmp();
		e.setFirstName("uday");
		e.setLastName("kumar");
		e.setSsn(1218921829);
		e.setGs(1000.0);
		e.setBasic(20000);
		e.setCommission(100);
		out.println(e.firstName + " " + e.lastName + " " + e.ssn + " " + e.gs + " " + e.commission + " " + e.basic);
		out.println("total=" + ((e.gs * e.commission) + e.basic));

	}

}
