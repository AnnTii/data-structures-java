package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list
will have Node.val == 0. For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is
the sum of all the merged nodes. The modified list should not contain any 0's. Return the head of the modified linked list.

Example 1:
Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.

Example 2:
Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 1 = 1.
- The sum of the nodes marked in red: 3 = 3.
- The sum of the nodes marked in yellow: 2 + 2 = 4.

Constraints:
    The number of nodes in the list is in the range [3, 2 * 105].
    0 <= Node.val <= 1000
    There are no two consecutive nodes with Node.val == 0.
    The beginning and end of the linked list have Node.val == 0
*/
public class MergeNodesInBetweenZeros {
	public static void main(String[] args) {
		MergeNodesInBetweenZeros mergeNodesInBetweenZeros = new MergeNodesInBetweenZeros();
//		ListNode listNode = ListNodeUtil.createListNode(3104520);
		ListNode listNode = ListNodeUtil.createListNode(1030220);
		ListNode head = new ListNode(0);
		head.next = listNode;
		ListNodeUtil.print(head);
		ListNode mergeNodes = mergeNodesInBetweenZeros.mergeNodes(head);
		ListNodeUtil.print(mergeNodes);
	}

	public ListNode mergeNodes(ListNode head) {
		ListNode cn = head.next,  prev = head;
		int sum = 0;
		while (cn != null) {
			if (cn.val == 0) {
				cn.val = sum;
				prev = cn;
				sum = 0;
			} else {
				sum = sum + cn.val;
				prev.next = cn.next;
			}
			cn = cn.next;
		}
		return head.next;
	}

	public ListNode mergeNodes2(ListNode head) {
		ListNode cn = head.next, listNode = null;
		int sum = 0;
		while (cn != null) {
			if (cn.val == 0) {
				ListNode node = new ListNode(sum);
				if (listNode == null) {
					listNode = node;
				} else {
					ListNode temp = listNode;
					while (temp.next != null) {
						temp = temp.next;
					}
					temp.next = node;
				}
				sum = 0;
			} else {
				sum = sum + cn.val;
			}
			cn = cn.next;
		}
		return listNode;
	}
}
