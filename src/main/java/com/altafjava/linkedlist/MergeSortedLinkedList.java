package com.altafjava.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class MergeSortedLinkedList {
	public static void main(String[] args) {
		ListNode l1 = ListNodeUtil.createListNode(2589);
		ListNode l2 = ListNodeUtil.createListNode(147);
		ListNodeUtil.print(l1);
		ListNodeUtil.print(l2);
		MergeSortedLinkedList concatenation = new MergeSortedLinkedList();
		ListNode listNode = concatenation.merge(l1, l2);
		ListNodeUtil.print(listNode);
	}

	public ListNode merge(ListNode l1, ListNode l2) {
		ListNode head = new ListNode();
		ListNode cn = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cn.next = l1;
				l1 = l1.next;
			} else {
				cn.next = l2;
				l2 = l2.next;
			}
			cn = cn.next;
		}
		if (l1 != null) {
			cn.next = l1;
		}
		if (l2 != null) {
			cn.next = l2;
		}
		return head.next;
	}
}
