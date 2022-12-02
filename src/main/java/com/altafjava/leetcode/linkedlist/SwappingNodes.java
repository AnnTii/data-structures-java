package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
You are given the head of a linked list, and an integer k. Return the head of the linked list after swapping the values of the kth 
node from the beginning and the kth node from the end (the list is 1-indexed).

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

Constraints:
    The number of nodes in the list is n.
    1 <= k <= n <= 105
    0 <= Node.val <= 100
*/
public class SwappingNodes {

	public static void main(String[] args) {
		ListNode head = ListNodeUtil.createListNode(1, 2, 3, 4, 5);
		int k = 2;
//		ListNode head = ListNodeUtil.createListNode(7, 9, 6, 6, 7, 8, 3, 0, 9, 5);
//		int k = 5;
//		ListNode head = ListNodeUtil.createListNode(1);
//		int k = 1;
		ListNodeUtil.print(head);
		SwappingNodes swappingNodes = new SwappingNodes();
		ListNode listNode = swappingNodes.swapNodes(head, k);
		ListNodeUtil.print(listNode);
	}

	public ListNode swapNodes(ListNode head, int k) {
		ListNode cn = head, node1 = head, node2 = head;
		while (cn.next != null) {
			if (--k == 0) {
				node1 = cn;
				node2 = head;
			}
			node2 = node2.next;
			cn = cn.next;
		}
		int temp = node1.val;
		node1.val = node2.val;
		node2.val = temp;
		return head;
	}

}
