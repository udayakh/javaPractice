package com.uday.ocjp1;

public class V3 {

	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	private void printNodeList(Node head) {
		while(head.data>=0){
		System.out.print("Node elements are "+head.data);
		head.data++;
		//head.next=null;
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {

		V3 list = new V3();
		list.head1 = new Node(1);
		list.head1.next = new Node(2);

		list.head2 = new Node(1);
		list.head2.next = new Node(2);

		list.printNodeList(head1);
		list.printNodeList(head2);

	}

}
