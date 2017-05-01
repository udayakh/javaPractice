package com.uday.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Manager1 {

	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>();
		v1.add(90);
		v1.add(910);
		v1.add(190);
		v1.add(920);
		v1.add(390);
		v1.add(390);
		v1.add(null);
		System.out.println(v1);

		Enumeration enum1=v1.elements();

		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement());
		}
	}

}
