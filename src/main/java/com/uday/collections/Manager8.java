package com.uday.collections;



import java.util.PriorityQueue;
import java.util.Queue;

public class Manager8 {

	public static void main(String[] args) {
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		//Queue<Object> pq=new PriorityQueue<Object>();
		pq.add(9);
		pq.add(9);
		pq.add(9);
		//pq.add(null);
		pq.add(91);
		pq.add(19);
		pq.add(92);
		pq.add(29);
		pq.add(93);
		pq.add(39);
		pq.add(3);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
