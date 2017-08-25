package com.uday.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How many student details are you want to read:");
		int stCount = in.nextInt();
		System.out.println("Ohh! you want to " + stCount + " enter student details");
		System.out.println(" ");
		Student student = null;
		List<Student> students = new ArrayList<>();
		int s[] = new int[stCount];

		for (int i = 1; i <= s.length; i++) {

			System.out.println("Enter student details:\n");
			student = new Student();
			System.out.print("Enter student ID: \t");
			int sid = in.nextInt();
			student.setSid(sid);
			System.out.print("Enter student Name: \t");
			String sname = in.next();
			student.setSname(sname);
			students.add(student);
		}

		System.out.println("The Student details are");
		for (Student st : students) {
			System.err.println(st.getSid() + " " + st.getSname());
		}

	}

}
