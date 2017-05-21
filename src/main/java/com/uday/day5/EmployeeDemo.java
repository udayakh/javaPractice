package com.uday.day5;

class CommisionEmployee {

	final String firstName, lastName, SSN;
	double grossSalary, commission;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public CommisionEmployee(String firstName, String lastName, String SSN) {
		this.SSN = SSN;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	double earnging() {
		return grossSalary * commission;
	}

	public String toString() {
		return "CommissionEmployee [firstName=" + firstName +" lastName= " +lastName + " earning=" + earnging() + "]";
	}

}

class BasicCommissionEmployee extends CommisionEmployee {

	double basic;

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public BasicCommissionEmployee(String firstName, String lastName, String sSN) {
		super(firstName, lastName, sSN);
		this.basic = basic;
	}

	double earnging() {
		return (basic + super.earnging());
	}

	public String toString() {
		return "BaseCommissionEmployee [firstName=" + firstName +" lastName= " +lastName + " earning=" + earnging() + "]";
	}

}

class EmployeeDemo {
	public static void main(String[] args) {
		CommisionEmployee c = new CommisionEmployee("uday", "kumar", "24232392322");
		c.setCommission(100);
		c.setGrossSalary(100);
		
		BasicCommissionEmployee b = new BasicCommissionEmployee("raj", "kishor", "92432398");
		b.setCommission(100);
		b.setGrossSalary(100);
		b.setBasic(100);
		System.out.println(c);
		System.out.println(b);
	}
}
