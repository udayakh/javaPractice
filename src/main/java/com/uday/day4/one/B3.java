package com.uday.day4.one;

class B2 {
	private int priv;
	public int pub;
	protected int prot;
	int def;

}

public class B3 extends B2 {
	// private int priv;
	int i;
	protected int j;
	public int k;

	public static void main(String[] args) {

		B3 c1 = new B3();
		// System.out.println(c1.priv);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);

	}

}
