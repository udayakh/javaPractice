package com.uday.day5;

public class G4 extends Thread {

	public void run() {
		System.out.println("Thread(c)- run()");
	}

	public static void main(String[] args) {
		G4 g = new G4();
		Thread t = new Thread(g);
		t.setName("raj kishor");
		t.setPriority(NORM_PRIORITY);
		t.setDaemon(true);
		printProperties(t);
		System.out.println("==============");
		Thread main = Thread.currentThread();
		printProperties(main);
		
	}

	private static void printProperties(Thread t) {
		System.out.println(t.getId());

		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isDaemon());

	}

}
