package com.altafjava.leetcode.recursion;

import com.altafjava.leetcode.util.ListNode;

/*
You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be
made by splicing together the nodes of the first two lists. Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = []
Output: []

Input: list1 = [], list2 = [0]
Output: [0]
*/
public class MergeSortedLinkedList {

	public ListNode mergeTwoLinkedListsUsingLoop(ListNode list1, ListNode list2) {
		ListNode head = new ListNode();
		ListNode cn = head;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				cn.next = list1;
				list1 = list1.next;
			} else {
				cn.next = list2;
				list2 = list2.next;
			}
			cn = cn.next;
		}
		if (list1 != null) {
			cn.next = list1;
		}
		if (list2 != null) {
			cn.next = list2;
		}
		return head.next;
	}

	public ListNode mergeTwoLinkedListsUsingRecursion(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		if (list1.val < list2.val) {
			list1.next = mergeTwoLinkedListsUsingRecursion(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLinkedListsUsingRecursion(list1, list2.next);
			return list2;
		}
	}

}
