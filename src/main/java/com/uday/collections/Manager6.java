package com.uday.collections;



import java.util.LinkedList;

class ListExample
{
	private LinkedList<Object> list=new LinkedList<Object>();
	
	public void add(Object obj)
	{
		list.add(obj);
	}
	
	public Object processElement()
	{
		return list.removeFirst();
	}		
	public void print(){
		System.out.println(list);
	}
}


public class Manager6 {

	public static void main(String[] args) {
		ListExample q1=new ListExample();
		
		q1.add("abc");
		q1.add("xyz");
		q1.add("hello");
		q1.add(123);

		q1.add("done");

		System.out.println(q1);
		Object o1=q1.processElement();
		System.out.println(o1);
		System.out.println(q1);
		Object o2=q1.processElement();
		System.out.println(o2);
		System.out.println(q1);
		q1.print();
		
	}

}
