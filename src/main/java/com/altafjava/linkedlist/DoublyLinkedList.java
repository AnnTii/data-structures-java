package com.altafjava.linkedlist;

public class DoublyLinkedList {
	private Node head;

	public void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node cn = head;
			while (cn.next != null) {
				cn = cn.next;
			}
			cn.next = node;
			node.prev = cn;
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("DoublyLinkedList is empty");
		} else {
			if (head.data == data) {
				head.next.prev = null;
				head = head.next;
			} else {
				Node cn = head;
				while (cn != null) {
					if (cn.data == data) {
						cn.prev.next = cn.next;
						cn.next.prev = cn.prev;
						break;
					}
					cn = cn.next;
				}
			}
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("DoublyLinkedList is empty");
		} else {
			Node cn = head;
			do {
				System.out.print(cn.data + " ");
				cn = cn.next;
			} while (cn != null);
			System.out.println();
		}
	}

	public void reverse() {
		if (head == null) {
			System.out.println("DoublyLinkedList is empty");
		} else {
			Node cn = head;
			while (cn != null) {
				Node next = cn.next;
				cn.next = cn.prev;
				cn.prev = next;
				if (next == null) {
					head = cn;
				}
				cn = next;
			}
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.display();
		doublyLinkedList.add(10);
		doublyLinkedList.display();
		doublyLinkedList.add(20);
		doublyLinkedList.add(30);
		doublyLinkedList.add(40);
		doublyLinkedList.add(50);
		doublyLinkedList.display();
		doublyLinkedList.reverse();
		doublyLinkedList.display();
		doublyLinkedList.delete(10);
		doublyLinkedList.display();
		doublyLinkedList.delete(50);
		doublyLinkedList.display();
		doublyLinkedList.delete(30);
		doublyLinkedList.display();
		doublyLinkedList.delete(90);
		doublyLinkedList.display();
		doublyLinkedList.reverse();
		doublyLinkedList.display();
	}

}
