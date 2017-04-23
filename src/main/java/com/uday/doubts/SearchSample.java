package com.uday.doubts;

import java.util.ArrayList;
import java.util.List;

public class SearchSample {
	public static void main(String[] args) {
		int[][] list = { { 1, 13, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 7;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

		int x = 0;
		String message = null;
		while (x++ < 10) {
			message = x > 10 ? "Greater than" : "less than";
			System.out.println(message + " " + x);
		}

		long xx = 10;
		long y = 2 * xx;
		System.out.println(y);

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(14);

		for (int i : list1) {
			System.out.println(i + ",");
			break;
		}

		int xxx = 5;
		int yyy = x * 4 - x++;
		if (yyy < 10)
			System.out.println("too low");
		else
			System.out.println("too high");
		System.out.println(xxx > 2 ? xxx < 4 ? 10 : 8 : 7);
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World");
		}

		int xxxx = 5 * 4 % 3;
		System.out.println(xxxx);

		int c = 7;
		int result = 4;

		result += ++c;
		System.out.println(result);
	}
}
