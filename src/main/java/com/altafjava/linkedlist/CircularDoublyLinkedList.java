package com.altafjava.linkedlist;

public class CircularDoublyLinkedList {
	Node head;

	public void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			node.next = node;
			node.prev = node;
			head = node;
		} else {
			Node cn = head;
			while (cn.next != head) {
				cn = cn.next;
			}
			node.next = head;
			node.prev = cn;
			cn.next = node;
			head.prev = node;
		}
	}

	public void insert(int index, int data) {
//		if index is greater than the length of LinkedList then will be added into last node
		Node node = new Node(data);
		if (head == null) {
			node.next = node;
			node.prev = node;
			head = node;
		} else {
			Node cn = head;
			int i = 0;
			while (i < index && cn.next != null) {
				cn = cn.next;
				i++;
			}
			if (index > i) {
				add(data);
			} else {
				node.next = cn;
				node.prev = cn.prev;
				cn.prev.next = node;
				cn.prev = node;
				if (index == 0)
					head = node;
			}
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("CircularDoublyLinkedList is empty");
		} else {
			Node cn = head;
			do {
				System.out.print(cn.data + " ");
				cn = cn.next;
			} while (cn != head);
			System.out.println();
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("CircularDoublyLinkedList is empty");
		} else {
			if (head.data == data) {

			}
		}
	}

	public static void main(String[] args) {
		CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(0, 10);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(0, 20);
		circularDoublyLinkedList.insert(0, 30);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(1, 40);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(0, 50);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(9, 60);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.add(70);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(0, 80);
		circularDoublyLinkedList.display();
		circularDoublyLinkedList.insert(3, 90);
		circularDoublyLinkedList.display();
	}
}
