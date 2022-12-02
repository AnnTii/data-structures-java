package com.altafjava.stack;

public class Stack {
	private int[] arr;
	private int top;

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.display();
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		stack.push(60);
		stack.display();
		System.out.println("POP: " + stack.pop());
		stack.display();
		System.out.println("POP: " + stack.pop());
		System.out.println("POP: " + stack.pop());
		System.out.println("POP: " + stack.pop());
		System.out.println("POP: " + stack.pop());
		System.out.println("POP: " + stack.pop());
		stack.display();
		stack.push(11);
		stack.push(22);
		stack.display();
		System.out.println("PEEK: " + stack.peek());
		stack.push(33);
		stack.push(44);
		stack.push(55);
		stack.display();
		System.out.println("PEEK: " + stack.peek());
		System.out.println("GET: " + stack.get(0));
		System.out.println("GET: " + stack.get(3));
		System.out.println("GET: " + stack.get(-5));
		System.out.println("GET: " + stack.get(12));
	}

	public Stack() {
		arr = new int[5];
		top = -1;
	}

	public Stack(int size) {
		if (size < 1)
			size = 1;
		arr = new int[size];
		top = -1;
	}

	public void push(int no) {
		if (top == arr.length - 1)
			System.err.println("Stack Overflow");
		else {
			arr[++top] = no;
		}
	}

	public int pop() {
		int temp = -1;
		if (top < 0) {
			System.err.println("Stack Underflow");
		} else {
			temp = arr[top];
			arr[top--] = 0;
		}
		return temp;
	}

	public int peek() {
		if (top < 0) {
			System.err.println("Stack Underflow");
		}
		return arr[top];
	}

	public int get(int index) {
		if (top < 0) {
			System.err.println("Stack Underflow");
			return -1;
		}
		if (index < 0 || index > top) {
			System.err.println("Not a valid index");
			return -1;
		}
		return arr[index];
	}

	public void display() {
		System.out.print("[");
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
}
