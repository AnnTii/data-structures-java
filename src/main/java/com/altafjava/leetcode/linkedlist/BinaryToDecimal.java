package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number. Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0
Constraints:
    The Linked List is not empty.
    Number of nodes will not exceed 30.
    Each node's value is either 0 or 1.
*/
public class BinaryToDecimal {
	public static void main(String[] args) {
		BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
//		ListNode head = ListNodeUtil.createListNode(101);
//		ListNode head = ListNodeUtil.createListNode(0);
		ListNode head = ListNodeUtil.createListNode(1111);
		ListNodeUtil.print(head);
		int decimalValue = binaryToDecimal.getDecimalValue2(head);
		System.out.println(decimalValue);
	}

//	https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/629087/Detailed-explanation-Java-%3A-faster-than-100.00
	public int getDecimalValue2(ListNode head) {
		int num = 0;
		while (head != null) {
			num = num * 2 + head.val;
			head = head.next;
		}
		return num;
	}

	public int getDecimalValue(ListNode head) {
		ListNode fast = head;
		int length = 0;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			length += 2;
		}
		if (fast != null) {
			length++;
		}
		int num = 0;
		ListNode cn = head;
		while (length > 0) {
			num = (int) (num + cn.val * Math.pow(2, length - 1));
			cn = cn.next;
			length--;
		}
		return num;
	}
}
