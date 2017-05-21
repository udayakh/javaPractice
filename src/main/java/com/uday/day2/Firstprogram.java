package com.uday.day2;

class Firstprogram {
	public static void main(String args[]) {
		int i;
		String s1, s2, s3, s4, s5;
		System.out.println(args);
		System.out.println("----");
		System.out.println(args.length);
		if (args.length == 5) {
			s1 = args[0];
			s2 = args[1];
			s3 = args[2];
			s4 = args[3];
			s5 = args[4];
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		} else {
			System.out.println("No of arg expected five");
		}

	}
}