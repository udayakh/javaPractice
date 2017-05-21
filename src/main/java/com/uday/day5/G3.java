package com.uday.day5;

public class G3 {

	public static void main(String[] args) {

		class B extends Thread {
			public void run() {
					for (int i = 0; i < 100; i++) {
						System.out.println("local inner class " + i);
					}

			}
		}

		B b1 = new B();
		b1.start();
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
	}

}
