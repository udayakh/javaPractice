package com.uday.day3;

import static java.lang.System.out;

public class U7 {
	int i;
	void test(){
		i=10;
	}
	public static void main(String[] args) {

		U7 u=new U7();
		out.println(u.i);
		u.test();
		out.println(u.i);
		
	}

}
