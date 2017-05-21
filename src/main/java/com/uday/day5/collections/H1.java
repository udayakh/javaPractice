package com.uday.day5.collections;

import java.util.Arrays;

class H implements Comparable<H> {

	int i = 10;

	H(int i) {
		System.out.println(this.i);
		this.i = i;
	}

	@Override
	public String toString() {
		System.out.println("H toString()");
		return "i= " + i;
	}

	@Override
	public int compareTo(H o) {
		return o.i-i;
	}

	/*@Override
	public int compareTo(Object o) {
		H h=(H)o;
		return h.i-i;
	}*/

}

public class H1 {

	public static void main(String[] args) {

		H h[] = new H[4];
		System.out.println(h[0]);
		System.out.println(h[1]);

		h[0] = new H(90);
		h[1] = new H(9);
		h[2] = new H(10);
		h[3] = new H(20);
		System.out.println(h);
		System.out.println(Arrays.toString(h));
		Arrays.sort(h);
		System.out.println(h);
		System.out.println(Arrays.toString(h));
		System.out.println(h[0].i);
		System.out.println(h[1].i);
	}

}
