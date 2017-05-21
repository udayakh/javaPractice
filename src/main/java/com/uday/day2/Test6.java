package com.uday.day2;

public class Test6 {
	static int j = 10;
	static int k = j;
	static int i;

	static {
		System.out.println("Test6 sib");
	}

	public static void main(String[] args) {
		System.out.println("from main Test6: " + i);
		System.out.println("from main Test6: " + Test6.i);

	}
}

class G {
	static {
		System.out.println("From G class1");
	}

	public static void main(String args[]) {
		System.out.println("from main G:" + Test6.i);
		Test6.main(null);
		Test6.main(null);
	}

	static {
		System.out.println("From G class2");
	}
}
