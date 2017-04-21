package com.uday.doubts;

class Fact {
	int n, result;

	int fact(int n) {
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}

}

public class RecursionTest {

	public static void main(String[] args) {

		Fact f = new Fact();
		System.out.println(f.fact(5));
	}

}
