package com.uday.day4;

class CommissionEmployee {
	String firstName;
	String lastName;
	int ssn;
	double gs;
	double commission;
	
}

public class BaseCommissionEmployee extends CommissionEmployee{

	double basic;
	
	public static void main(String[] args) {

		CommissionEmployee ce=new CommissionEmployee();
		System.out.println(ce.firstName+" "+ce.lastName+" "+ce.ssn+" "+ce.gs+" "+ce.commission);
		BaseCommissionEmployee bc=new BaseCommissionEmployee();
		System.out.println(ce.firstName+" "+ce.lastName+" "+ce.ssn+" "+ce.gs+" "+ce.commission+" "+bc.basic);
		
		
	}

}
