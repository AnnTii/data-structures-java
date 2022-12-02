package com.altafjava.linkedlist;

import com.altafjava.leetcode.util.ListNode;

public class CircularLinkedList {
	private ListNode head;

	public void add(int data) {
		ListNode listNode = new ListNode(data);
		if (head == null) {
			listNode.next = listNode;
			head = listNode;
		} else {
			ListNode cn = head;
			while (cn.next != head) {
				cn = cn.next;
			}
			cn.next = listNode;
			listNode.next = head;
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("CircularLinkedList is Empty");
		} else {
			if (head.val == data) {
				ListNode cn = head;
				while (cn.next != head) {
					cn = cn.next;
				}
				cn.next = head.next;
				head = head.next;
			} else {
				ListNode cn = head, prev = null;
				do {
					if (cn.val == data) {
						prev.next = cn.next;
						break;
					}
					prev = cn;
					cn = cn.next;
				} while (cn != head);
			}
		}

	}

	public void display() {
		if (head == null) {
			System.out.println("CircularLinkedList is Empty");
		} else {
			ListNode cn = head;
			do {
				System.out.print(cn.val + " ");
				cn = cn.next;
			} while (cn != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.display();
		circularLinkedList.add(10);
		circularLinkedList.display();
		circularLinkedList.add(20);
		circularLinkedList.add(30);
		circularLinkedList.add(40);
		circularLinkedList.add(50);
		circularLinkedList.display();
		circularLinkedList.delete(40);
		circularLinkedList.display();
		circularLinkedList.delete(10);
		circularLinkedList.display();
		circularLinkedList.delete(50);
		circularLinkedList.display();
	}
}
