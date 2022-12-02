package com.altafjava.linkedlist;

public class Node {
	Node prev;
	int data;
	Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	public Node(Node prev, int data, Node next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}

}