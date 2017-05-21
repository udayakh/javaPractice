package com.uday.day5;

class C {
	synchronized void test1() {
		System.out.println("test1 begin");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.State state[] = Thread.State.values();
		for (Thread.State state2 : state) {
			System.out.println(state2);
		}
		System.out.println("test1 end");
	}

	synchronized void test2() {
		notifyAll();
	}
}

class Thread1 extends Thread {
	C c;

	Thread1(C c) {
		this.c = c;
	}

	public void run() {
		c.test1();
		c.test2();
	}
}

public class G5 {
	public static void main(String[] args) {
		C c1 = new C();
		Thread1 t1 = new Thread1(c1);
		Thread1 t2 = new Thread1(c1);
		t1.start();
		t2.start();

		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c1.test2();
		System.out.println("about to release");
		C c2=new C();
		c2.test1();
		System.out.println("done");
	}

}
