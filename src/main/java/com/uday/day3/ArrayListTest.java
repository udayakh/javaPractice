package com.uday.day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {

		List<String> ulist = new UdayList<>();
		ulist.add("uday");
		ulist.add("kumar");
		for (String name : ulist) {
			System.out.println(name + " ");
		}

		/*List<String> list = new ArrayList<>();
		list.add("uday");
		list.add("kumar");
		for (String name : list) {
			System.out.println(name + " ");
		}*/

	}

}
