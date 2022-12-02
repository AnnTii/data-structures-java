package com.altafjava.leetcode.recursion;

import com.altafjava.leetcode.util.ListNode;

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Input: head = [1,2]
Output: [2,1]

Input: head = []
Output: []
*/
public class ReverseLinkedList {

	public ListNode reverseListUsingRecursion(ListNode head) {
		ListNode headNode = null;
		return reverse(head, headNode);
	}

	private ListNode reverse(ListNode listNode, ListNode head) {
		if (listNode == null) {
			return head;
		}
		ListNode newNode = new ListNode(listNode.val);
		if (head != null) {
			newNode.next = head;
		}
		head = newNode;
		return reverse(listNode.next, head);
	}

	public ListNode reverseLinkedListUsingLoop(ListNode head) {
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
