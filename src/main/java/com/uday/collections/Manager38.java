package com.uday.collections;



import java.util.ArrayList;
import java.util.ListIterator;

public class Manager38 {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		ListIterator<Object> it = list.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()+",");
		}
		list.add(50);
		ListIterator<Object> it1 = list.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next()+",");
		}
		System.out.println();
		System.out.println("-------------");

	}

}

