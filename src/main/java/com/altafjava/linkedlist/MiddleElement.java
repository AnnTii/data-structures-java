package com.altafjava.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class MiddleElement {

	public static void main(String[] args) {
		ListNode listNode = ListNodeUtil.createListNode(8549730);
//		ListNode listNode = ListNodeUtil.createListNode(85497302);
		ListNodeUtil.print(listNode);
		MiddleElement middleElement = new MiddleElement();
		int middle = middleElement.findMiddleElement(listNode);
		System.out.println(middle);
	}

	public int findMiddleElement(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}
}
