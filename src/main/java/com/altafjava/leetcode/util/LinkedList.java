package com.altafjava.leetcode.util;

public class LinkedList {
	ListNode head;

	public void add(int no) {
		ListNode listNode = new ListNode(no);
		if (head == null) {
			head = listNode;
		} else {
			ListNode currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = listNode;
		}
	}

	public ListNode getListNode() {
		return head;
	}
}
