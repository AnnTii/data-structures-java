package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
You are given two linked lists: list1 and list2 of sizes n and m respectively. Remove list1's nodes from the ath node to the bth node, and
put list2 in their place. The blue edges and nodes in the following figure indicate the result: Build the result list and return its head.

Example 1:
Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [0,1,2,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.

Example 2:
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.

Constraints:
    3 <= list1.length <= 104
    1 <= a <= b < list1.length - 1
    1 <= list2.length <= 104
*/
public class MergeInBetweenLinkedLists {
	public static void main(String[] args) {
		MergeInBetweenLinkedLists mergeInBetweenLinkedLists = new MergeInBetweenLinkedLists();
//		int a = 3, b = 4;
//		ListNode list1 = ListNodeUtil.createListNode(0, 1, 2, 3, 4, 5);
//		ListNode list2 = ListNodeUtil.createListNode(1000000, 1000001, 1000002);
		int a = 2, b = 5;
		ListNode list1 = ListNodeUtil.createListNode(0, 1, 2, 3, 4, 5, 6);
		ListNode list2 = ListNodeUtil.createListNode(1000000, 1000001, 1000002, 1000003, 1000004);
//		int a = 1, b = 1;
//		ListNode list1 = ListNodeUtil.createListNode(0, 1, 2);
//		ListNode list2 = ListNodeUtil.createListNode(1000000, 1000001, 1000002, 1000003);
//		int a = 3, b = 4;
//		ListNode list1 = ListNodeUtil.createListNode(0, 3, 2, 1, 4, 5);
//		ListNode list2 = ListNodeUtil.createListNode(1000000, 1000001, 1000002);
		ListNodeUtil.print(list1);
		ListNodeUtil.print(list2);
		ListNode mergeInBetween = mergeInBetweenLinkedLists.mergeInBetween(list1, a, b, list2);
		ListNodeUtil.print(mergeInBetween);
	}

	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		ListNode cn = list1, prev = null;
		int count = 0;
		while (count < a) {
			count++;
			prev = cn;
			cn = cn.next;
		}
		prev.next = list2;
		while (count < b) {
			cn = cn.next;
			count++;
		}
		while (list2.next != null) {
			list2 = list2.next;
		}
		list2.next = cn.next;
		return list1;
	}
}
