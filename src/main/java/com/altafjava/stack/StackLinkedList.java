package com.altafjava.stack;

public class StackLinkedList {
	private Node head;

	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		System.out.println("POP: " + stack.pop());
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		System.out.println("POP: " + stack.pop());
		stack.display();
		System.out.println("POP: " + stack.pop());
		stack.display();
		System.out.println("POP: " + stack.pop());
		System.out.println("POP: " + stack.pop());
		System.out.println("POP: " + stack.pop());
		stack.display();
		System.out.println("POP: " + stack.pop());
		stack.push(11);
		stack.display();
		System.out.println("PEEK: " + stack.peek());
		stack.push(22);
		stack.display();
		System.out.println("PEEK: " + stack.peek());
		stack.push(33);
		stack.display();
		System.out.println("PEEK: " + stack.peek());
	}

	public void push(int no) {
		Node node = new Node(no);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public int pop() {
		int x = -1;
		if (head == null) {
			System.err.println("Stack Underflow");
		} else {
			x = head.data;
			head = head.next;
		}
		return x;
	}

	public int peek() {
		if (head == null) {
			System.err.println("Stack Underflow");
			return -1;
		} else {
			return head.data;
		}
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void display() {
		System.out.print("[");
		Node cn = head;
		while (cn != null) {
			System.out.print(cn.data + " ");
			cn = cn.next;
		}
		System.out.println("]");
	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
}
