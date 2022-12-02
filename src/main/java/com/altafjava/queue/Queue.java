package com.altafjava.queue;

public class Queue {
	private int[] arr;
	private int front;
	private int rear;

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.display();
		queue.enqueue(10);
		queue.display();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.enqueue(60);
		queue.display();
		System.out.println("DQ: " + queue.dequeue());
		System.out.println("DQ: " + queue.dequeue());
		System.out.println("DQ: " + queue.dequeue());
		System.out.println("DQ: " + queue.dequeue());
		System.out.println("DQ: " + queue.dequeue());
		System.out.println("DQ: " + queue.dequeue());
		queue.display();
	}

	public Queue() {
		arr = new int[5];
		front = -1;
		rear = -1;
	}

	public Queue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public void enqueue(int num) {
		if (isFull()) {
			System.err.println("Queue is Full");
		} else {
			arr[++rear] = num;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		} else {
			int num = arr[++front];
			arr[front] = -1;
			return num;
		}
	}

	public void display() {
		System.out.print("[");
		for (int i = front + 1; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	public boolean isFull() {
		if (rear == arr.length - 1)
			return true;
		return false;
	}
}
