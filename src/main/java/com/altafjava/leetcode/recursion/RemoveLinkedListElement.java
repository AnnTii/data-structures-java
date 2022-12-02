package com.altafjava.leetcode.recursion;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return
the new head.

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Input: head = [], val = 1
Output: []

Input: head = [7,7,7,7], val = 7
Output: []

Constraints:
    The number of nodes in the list is in the range [0, 10^4].
    1 <= Node.val <= 50
    0 <= val <= 50

*/
public class RemoveLinkedListElement {

	public static void main(String[] args) {
		int n = 66666;
		ListNode listNode = ListNodeUtil.createListNode(n);
		ListNodeUtil.print(listNode);
		RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
		int element = 6;
		ListNode head = removeLinkedListElement.removeElementsUsingRecursion(listNode, element);
		ListNodeUtil.print(head);
	}

	public ListNode removeElementsUsingRecursion(ListNode head, int val) {
		if (head == null)
			return null;
		head.next = removeElementsUsingRecursion(head.next, val);
		return head.val == val ? head.next : head;
	}

	public ListNode removeElements(ListNode head, int val) {
		ListNode temp = new ListNode();
		temp.next = head;
		ListNode cn = head, prev = temp;
		while (cn != null) {
			if (cn.val == val)
				prev.next = cn.next;
			else
				prev = cn;
			cn = cn.next;
		}
		return temp.next;
	}
}
