package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Constraints:
    The number of the nodes in the list is in the range [0, 104].
    -105 <= Node.val <= 105
    pos is -1 or a valid index in the linked-list.

Follow up: Can you solve it using O(1) (i.e. constant) memory?
*/
public class LinkedListCycle {
	public static void main(String[] args) {
		LinkedListCycle linkedListCycle = new LinkedListCycle();
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(3, l1);
		ListNode l3 = new ListNode(7, l2);
		ListNode l4 = new ListNode(4, l3);
		ListNode l5 = new ListNode(5, l4);
		ListNode l6 = new ListNode(8, l5);
		l1.next = l5;
		boolean hasCycle = linkedListCycle.hasCycle(l6);
		System.out.println(hasCycle);
	}

	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head.next, slow = head;
		while (fast != null && fast.next != null) {
			if (fast == slow)
				return true;
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
}
