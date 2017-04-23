package com.uday.doubts;

import java.util.HashSet;

public class MarkTest  {

	public static void main(String[] args) {

		HashSet<String> set=new HashSet<>();
		set.add("uday");
		set.add("kumar");
		set.add("reddy");
		
		for(String s:set){
			System.out.println(s+" ");
		}
	}

}
