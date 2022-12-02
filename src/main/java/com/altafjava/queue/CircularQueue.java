package com.altafjava.queue;

public class CircularQueue {
	private int[] arr;
	private int front;
	private int rear;
	private int length;

	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue();
		circularQueue.display();
		circularQueue.enQueue(10);
		circularQueue.display();
		circularQueue.enQueue(20);
		circularQueue.enQueue(30);
		circularQueue.enQueue(40);
		circularQueue.enQueue(50);
		circularQueue.display();
		circularQueue.enQueue(60);
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		circularQueue.enQueue(70);
		circularQueue.enQueue(80);
		circularQueue.enQueue(90);
		circularQueue.display();
		circularQueue.enQueue(100);
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
		System.out.println("D: " + circularQueue.deQueue());
		circularQueue.display();
	}

	public CircularQueue() {
		arr = new int[5];
		front = 0;
		rear = -1;
	}

	public CircularQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public void enQueue(int num) {
		if (isFull()) {
			System.err.println("Circular Queue is Full");
		} else {
			rear = (rear + 1) % arr.length;
			arr[rear] = num;
			length++;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.err.println("Circular Queue is Empty");
			return -1;
		} else {
			int num = arr[front];
			front = (front + 1) % arr.length;
			length--;
			return num;
		}
	}

	public void display() {
		int i = 0, f = front;
		System.out.print("[");
		while (i < length) {
			f = f % arr.length;
			System.out.print(arr[f] + " ");
			f++;
			i++;
		}
		System.out.println("]");
	}

	private boolean isEmpty() {
		if (length == 0)
			return true;
		return false;
	}

	private boolean isFull() {
		if (length == arr.length)
			return true;
		return false;
	}

}
