package com.altafjava.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class Concatenation {
	public static void main(String[] args) {
		ListNode l1 = ListNodeUtil.createListNode(2968);
		ListNode l2 = ListNodeUtil.createListNode(147);
		ListNodeUtil.print(l1);
		ListNodeUtil.print(l2);
		Concatenation concatenation = new Concatenation();
		ListNode listNode = concatenation.concatenateLinkedList(l1, l2);
		ListNodeUtil.print(listNode);
	}

	public ListNode concatenateLinkedList(ListNode l1, ListNode l2) {
		ListNode cn = l1;
		while (cn.next != null) {
			cn = cn.next;
		}
		cn.next = l2;
		return l1;
	}
}
