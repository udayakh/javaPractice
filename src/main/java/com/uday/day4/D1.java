package com.uday.day4;

public class D1 {

	public static void main(String[] args) {

		String s1="kiran;praveen;pawan;lavanya;priyank";
		String x[]=s1.split(";");
		
		for(String s:x){
			System.out.println(s);
		}
	}

}
