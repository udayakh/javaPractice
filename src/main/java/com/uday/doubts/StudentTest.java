package com.uday.doubts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

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

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class StudentTest {

	public static void main(String[] args) {

		List<Student> st1 = new ArrayList<>();
		st1.add(new Student(100, "uday"));
		st1.add(new Student(200, "kumar"));
		st1.add(new Student(300, "reddy"));

		List<Student> st2 = new ArrayList<>();
		st2.add(new Student(400, "venky"));
		st2.add(new Student(500, "kumar"));
		st2.add(new Student(600, "reddy"));

		Map<Integer, List<Student>> map = new HashMap<>();
		map.put(1, st1);
		map.put(2, st2);

		for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {

			for(Student s:entry.getValue()){
				System.out.println(s.getId()+" "+s.getName());
			}
		}
	}

}
