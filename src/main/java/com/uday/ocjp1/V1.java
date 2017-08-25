package com.uday.ocjp1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Employee implements Comparator<Employee> {
	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEid() < o2.getEid()) {
			return 1;
		}
		if (o1.getEid() > o2.getEid()) {
			return -1;
		}
		if (o1.getEid() == o2.getEid()) {
			return 0;
		}
		return 0;

	}

}

public class V1 {

	public static void main(String[] args) {

		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee(100, "uday1"), 1);
		map.put(new Employee(600, "uday6"), 2);
		map.put(new Employee(400, "uday4"), 2);
		map.put(new Employee(300, "uday3"), 2);
		map.put(new Employee(500, "uday5"), 2);
		for (Map.Entry<Employee, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey().getEid() + " - " + entry.getKey().getEname() + " - " + entry.getValue());
		}

	}

}
