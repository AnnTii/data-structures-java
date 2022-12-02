package com.altafjava.leetcode.recursion;

import com.altafjava.leetcode.util.ListNode;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each 
of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807

Input: l1 = [0], l2 = [0]
Output: [0]

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
public class SumTwoNumber {

	int carry = 0;
	ListNode listNode = new ListNode(0);
	ListNode currentNode = listNode;

	public ListNode addTwoNumbersUsingRecursion(ListNode l1, ListNode l2) {
		if (l1 != null || l2 != null || carry != 0) {
			int val1 = l1 == null ? 0 : l1.val;
			int val2 = l2 == null ? 0 : l2.val;
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			ListNode ln = new ListNode(sum % 10);
			currentNode.next = ln;
			currentNode = ln;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			addTwoNumbersUsingRecursion(l1, l2);
		}
		return listNode.next;
	}

	public ListNode addTwoNumbersUsingLoop(ListNode l1, ListNode l2) {
		ListNode cn1 = l1;
		ListNode cn2 = l2;
		int carry = 0;
		ListNode listNode = new ListNode(0);
		ListNode currentNode = listNode;
		while (cn1 != null || cn2 != null || carry != 0) {
			int val1 = cn1 == null ? 0 : cn1.val;
			int val2 = cn2 == null ? 0 : cn2.val;
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			ListNode ln = new ListNode(sum % 10);
			currentNode.next = ln;
			currentNode = ln;
			if (cn1 != null)
				cn1 = cn1.next;
			if (cn2 != null)
				cn2 = cn2.next;
		}
		return listNode.next;
	}

}
