package com.uday.loop;

public class Student {

	private int sid;
	private String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Student() {

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
