package com.uday.doubts;

public class Test4 {
	int count;

	public Test4(int count) {
		this.count = 20;
	}

	public Test4() {
		this(10);
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		System.out.println(t.count);

		final String[] names = new String[3];
		names[0] = "uday1";
		names[1] = "uday2";
		names[2] = "uday3";

		for (String name : names) {
			System.out.println(name + " ");
		}
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 }, { 6, 2, 1, 5 } };
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------");
		int x = 20;
		while (x > 0) {
			do {
				x -= 2;
			} while (x > 5);
			x--;
			System.out.print(x + "\t");
		}

	}

}
