package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list
sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]

Constraints:
    The number of nodes in the list is in the range [0, 300].
    -100 <= Node.val <= 100
    The list is guaranteed to be sorted in ascending order.
*/
public class RemoveDuplicateInSorted {
	public static void main(String[] args) {
		ListNode head = ListNodeUtil.createListNode(113);
//		ListNode head = ListNodeUtil.createListNode(11233);
//		ListNode head = ListNodeUtil.createListNode(111);
		ListNodeUtil.print(head);
		RemoveDuplicateInSorted removeDuplicateInSorted = new RemoveDuplicateInSorted();
		ListNode listNode = removeDuplicateInSorted.deleteDuplicates(head);
		ListNodeUtil.print(listNode);
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode cn = head;
		while (cn != null && cn.next != null) {
			if (cn.val == cn.next.val) {
				cn.next = cn.next.next;
			} else {
				cn = cn.next;
			}
		}
		return head;
	}
}
