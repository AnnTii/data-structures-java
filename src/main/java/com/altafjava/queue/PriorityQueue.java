package com.altafjava.queue;

public class PriorityQueue {

	private int[] arr;
	private int front;
	private int rear;

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.print();
		priorityQueue.add(10);
		priorityQueue.print();
		priorityQueue.add(20);
		priorityQueue.print();
		priorityQueue.add(3);
		priorityQueue.print();
		priorityQueue.add(30);
		priorityQueue.print();
		System.out.println("PL: " + priorityQueue.poll());
		priorityQueue.print();
		System.out.println("PL: " + priorityQueue.poll());
		priorityQueue.print();
		System.out.println("PL: " + priorityQueue.poll());
		priorityQueue.print();
		System.out.println("PL: " + priorityQueue.poll());
		priorityQueue.print();
		System.out.println("PL: " + priorityQueue.poll());
		priorityQueue.print();
	}

	public PriorityQueue() {
		arr = new int[5];
		front = -1;
		rear = -1;
	}

	public PriorityQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public void add(int num) {
		if (isFull()) {
			System.err.println("PriorityQueue is Full");
		} else {
			int i = rear;
			boolean isMax = false;
			for (; i >= 0; i--) {
				if (num < arr[i]) {
					arr[i + 1] = arr[i];
				} else {
					arr[++rear] = num;
					isMax = true;
					break;
				}
			}
			if (!isMax) {
				arr[i + 1] = num;
				rear++;
			}
		}
	}

	public int poll() {
		if (isEmpty()) {
			System.err.println("PriorityQueue is Empty");
			return -1;
		} else {
			int num = arr[++front];
			return num;
		}
	}

	private boolean isEmpty() {
		if (rear == -1 || front == rear)
			return true;
		return false;
	}

	public void print() {
		System.out.print("[");
		for (int i = front + 1; i <= rear; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
	}

	private boolean isFull() {
		if (rear == arr.length - 1)
			return true;
		return false;
	}

}
