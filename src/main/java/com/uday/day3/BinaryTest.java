package com.uday.day3;

import java.util.Arrays;

public class BinaryTest {

	public static void main(String[] args) {

		String[] x = { "uday", "kumar", "reddy" };

		System.out.println(Arrays.toString(x));
		Arrays.sort(x);

		System.out.println(Arrays.toString(x));

		int i = Arrays.binarySearch(x, "uday");

		System.out.println("uday: " + i);

	}

}
