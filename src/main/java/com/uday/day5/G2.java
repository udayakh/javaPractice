package com.uday.day5;

class G2 {
	 class A extends Thread {
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		G2.A g = new G2().new A();
		g.start();
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
	}

}
