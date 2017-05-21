package com.uday.ocjp1;

import java.util.Arrays;
import java.util.List;

public class U5 {

	public static void main(String[] args) {

		List<String> names=getUserNames();
		names.sort((s1,s2) -> s2.compareTo(s1));
		System.out.println(names);
		
		
	}

	private static List<String> getUserNames() {
		List<String> str=Arrays.asList("uday","kumar","reddy");
		return str;
	}

}
