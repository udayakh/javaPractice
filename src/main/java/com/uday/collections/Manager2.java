package com.uday.collections;



import java.util.LinkedList;

public class Manager2 {

	public static void main(String[] args) {
		//LinkedList<Object> list=new LinkedList<Object>();
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(90);
		list.add(null);
		list.add(90);
		list.add(80);
		list.add(null);
		list.add(null);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		//System.out.println(list.get(6));
		System.out.println(list);
		//System.out.println(list.get(7));
		
		

	}

}
