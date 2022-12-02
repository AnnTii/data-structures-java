package com.altafjava.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class Reverse {
	public static void main(String[] args) {
		int input = 12345;
		ListNode listNode = ListNodeUtil.createListNode(input);
		ListNodeUtil.print(listNode);
		Reverse reverseLinkedList = new Reverse();
		ListNode reverseListNode = reverseLinkedList.reverseRecursion(listNode);
		int actualOutput = ListNodeUtil.getNoFromListNode(reverseListNode);
		System.out.println(actualOutput);
	}

	private ListNode reverseRecursion(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode root = reverseRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return root;
	}

	private ListNode reverseLoop(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}
