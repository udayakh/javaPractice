package com.uday.day5;

class GT extends Thread {

	public void run() {
		System.out.println("GT class ");
		 int i1 = 1 / 0;
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

class GT2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1000; i < 200; i++) {
			System.out.println(i);
		}
	}

}

public class G1 {

	public static void main(String[] args) {
		System.out.println("case 1");

		GT gt = new GT();
		gt.start();

		GT gt1 = new GT();
		gt1.start();

		System.out.println("case 2");
		GT2 gt2 = new GT2();
		Thread t1 = new Thread(gt2);
		t1.start();

		Thread t2 = new Thread(gt2);
		t2.start();

		System.out.println("done");

	}
}
