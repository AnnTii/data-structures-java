package com.altafjava.queue;

public class QueueLinkedList {

	private Node front;
	private Node rear;

	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();
		queue.display();
		queue.enQueue(10);
		queue.display();
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.display();
		System.out.println("DQ: " + queue.deQueue());
		queue.display();
		System.out.println("DQ: " + queue.deQueue());
		queue.display();
		System.out.println("DQ: " + queue.deQueue());
		queue.display();
		System.out.println("DQ: " + queue.deQueue());
		queue.display();
		System.out.println("DQ: " + queue.deQueue());
		queue.display();
		System.out.println("DQ: " + queue.deQueue());
		queue.display();
	}

	public void enQueue(int num) {
		Node node = new Node(num);
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		} else {
			int num = front.data;
			front = front.next;
			return num;
		}
	}

	public void display() {
		System.out.print("[");
		Node cn = front;
		while (cn != null) {
			System.out.print(cn.data + " ");
			cn = cn.next;
		}
		System.out.println("]");
	}

	private boolean isEmpty() {
		if (front == null)
			return true;
		return false;
	}

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}
}
