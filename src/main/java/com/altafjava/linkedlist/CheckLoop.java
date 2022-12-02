package com.altafjava.linkedlist;

import com.altafjava.leetcode.util.ListNode;

public class CheckLoop {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(3, l1);
		ListNode l3 = new ListNode(7, l2);
		ListNode l4 = new ListNode(4, l3);
		ListNode l5 = new ListNode(5, l4);
		ListNode l6 = new ListNode(8, l5);
		l1.next = l5;
		CheckLoop checkLoop = new CheckLoop();
		boolean isCircularLinkedList = checkLoop.isCircularLinkedList(l6);
		System.out.println(isCircularLinkedList);

	}

	public boolean isCircularLinkedList(ListNode head) {
		ListNode slow = head, fast = head.next;
		while (fast != null & fast.next != null) {
			if (slow == fast)
				return true;
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
}
