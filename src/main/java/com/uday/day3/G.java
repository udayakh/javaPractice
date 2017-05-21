package com.uday.day3;

class E {
	int i;
	static int j;

	void test1() {
		System.out.println("from test1");
	}

	static void test2() {
		System.out.println("from test2");
		F.test4();
		// test1();
	}

	static {
		System.out.println("from sib E ");
	}
}

class F extends E {
	static {
		System.out.println("from sib F");
	}
	int m;
	static int n;

	void test3() {
		System.out.println("from test3");
	}

	static void test4() {
		System.out.println("from test4");
	}
}

class G {
	static {
		System.out.println("from sib G");
	}

	public static void main(String[] args) {
		E.test2();
		F.test2();
		/*F.test4();
		E.j = 10;
		F.n = 20;

		E e1 = new E();
		e1.i = 30;
		e1.test1();

		F f1 = new F();
		f1.i = 40;
		f1.m = 50;
		f1.test1();
		f1.test3();*/
		System.out.println("==============");

	}
}