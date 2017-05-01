package com.uday.collections;



import java.util.PriorityQueue;

public class Manager9 {

	public static void main(String[] args) {
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		//pq.add(10);
		pq.add("abc");
		pq.add("done");
		pq.add("10");
		pq.add("10");pq.add("10");
		pq.add("10");
		pq.add("xyz");
		pq.add("test");

		System.out.println(pq);

	}

}
