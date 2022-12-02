package com.altafjava.leetcode.linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
You are given the head of a linked list with n nodes. For each node in the list, find the value of the next greater node. That is, 
for each node, find the value of the first node that is next to it and has a strictly larger value than it. Return an integer array
answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next
greater node, set answer[i] = 0.

Example 1:
Input: head = [2,1,5]
Output: [5,5,0]

Example 2:
Input: head = [2,7,4,3,5]
Output: [7,0,5,5,0]

Constraints:
    The number of nodes in the list is n.
    1 <= n <= 104
    1 <= Node.val <= 109
*/
public class NextGreaterNode {

	public static void main(String[] args) {
		NextGreaterNode nextGreaterNode = new NextGreaterNode();
//		ListNode head = ListNodeUtil.createListNode(2, 1, 5);
		ListNode head = ListNodeUtil.createListNode(2, 7, 4, 3, 5);
		ListNodeUtil.print(head);
		int[] arr = nextGreaterNode.nextLargerNodes4(head);
		for (int a : arr)
			System.out.print(a + " ");
	}

	public int[] nextLargerNodes4(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int[] arr = new int[list.size()];
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < list.size(); i++) {
			Integer currentValue = list.get(i);
			while (!stack.isEmpty() && currentValue > list.get((stack.peek()))) {
				arr[stack.pop()] = currentValue;
			}
			stack.push(i);
		}
		return arr;
	}

	public int[] nextLargerNodes3(ListNode head) {
		List<Integer> list = new LinkedList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int[] arr = new int[list.size()];
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < list.size(); i++) {
			Integer currentValue = list.get(i);
			while (!stack.isEmpty() && currentValue > list.get((stack.peek()))) {
				arr[stack.pop()] = currentValue;
			}
			stack.push(i);
		}
		return arr;
	}

	public int[] nextLargerNodes2(ListNode head) {
		List<Integer> list = new LinkedList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int[] arr = new int[list.size()];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < list.size(); i++) {
			Integer currentValue = list.get(i);
			while (!stack.isEmpty() && currentValue > list.get((stack.peek()))) {
				arr[stack.pop()] = currentValue;
			}
			stack.push(i);
		}
		return arr;
	}

	public int[] nextLargerNodes(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head.next != null) {
			ListNode cn = head.next;
			boolean isFound = false;
			while (cn != null) {
				if (cn.val > head.val) {
					list.add(cn.val);
					isFound = true;
					break;
				}
				cn = cn.next;
			}
			if (!isFound) {
				list.add(0);
			}
			head = head.next;
		}
		list.add(0);
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		return arr;
	}
}
