package com.uday.interview1;

interface P {

}

class Demo implements P {
	void show() {
		System.out.println("demo class");
	}
}

public class Test1 {

	public static void main(String[] args) {

		Demo d = new Demo();
		if (d instanceof P) {
			System.out.println("you have permission");
			d.show();
		} else {
			System.out.println("you don't have permission");
		}
	}

}
