package com.uday.day4;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class E2 {
	void test1() throws SQLException {
		System.out.println("SQLEXecption of super");
	}

	void test2() throws NumberFormatException {
		System.out.println("NFE of super");
	}

	void test3() throws FileNotFoundException {
		System.out.println("CNF of super");
	}

	void test4() throws Exception {
		System.out.println("no exception");
	}
}

public class E3 extends E2 {

	void test1() throws SQLException {
		System.out.println("SQLEXecption of sub");
	}

	void test2() throws RuntimeException {
		System.out.println("NFE of sub");
	}

	void test3()throws Error {
		System.out.println("CNF of super");
	}

	void test4() {

	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		E2 e = new E3();
		e.test1();
		e.test2();
	}

}
