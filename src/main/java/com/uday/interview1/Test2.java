package com.uday.interview1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.set(1, 6);
		list.remove(0);
		for (int i : list) {
			System.out.println(i + " ");
		}

		List<Integer> list1 = new ArrayList<>();
		list1.add(Integer.parseInt("5"));
		list1.add(Integer.valueOf("6"));
		list1.add(7);
		list1.add(null);

		for (int i : list1) {
			System.out.println(i + " ");
		}
	}

}
