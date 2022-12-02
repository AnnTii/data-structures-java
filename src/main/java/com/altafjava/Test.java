package com.altafjava;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class Test {

	public static void main(String[] args) {
		int input1 = 5;
		int input2 = 1246;
		ListNode listNode1 = ListNodeUtil.createListNode(input1);
		ListNodeUtil.print(listNode1);
		ListNode listNode2 = ListNodeUtil.createListNode(input2);
		ListNodeUtil.print(listNode2);
		ListNode listNode = merge(listNode1, listNode2);
		ListNodeUtil.print(listNode);
	}

	public static ListNode merge(ListNode a, ListNode b) {
		ListNode head = new ListNode();
		ListNode cn = head;
		while (a != null && b != null) {
			if (a.val < b.val) {
				cn.next = a;
				cn = a;
				a = a.next;
			} else {
				cn.next = b;
				cn = b;
				b = b.next;
			}
		}
		if (a != null)
			cn.next = a;
		if (b != null)
			cn.next = b;
		return head.next;
	}

}
