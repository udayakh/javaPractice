package com.uday.collections;



import java.util.ArrayList;
import java.util.Iterator;


public class Manager35 {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		list.add(40);
		list.add(null);
		
		Iterator it = list.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		list.add(50);
		System.out.println(list);
		

	}

}
