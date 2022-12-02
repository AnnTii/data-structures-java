package com.altafjava.leetcode.recursion;

/*
Given the head of a singly linked list, return true if it is a palindrome.

Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false
*/

import java.util.Stack;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		int input = 101;
		ListNode listNode = ListNodeUtil.createListNode(input);
		PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
		boolean isPalindrome = palindromeLinkedList.isPalindromeRecursion2(listNode);
		System.out.println(isPalindrome);
	}

	ListNode head;

	public boolean isPalindromeRecursion2(ListNode head) {
		this.head = head;
		return checkPalindrome(head);
	}

	private boolean checkPalindrome(ListNode currentNode) {
		if (currentNode == null)
			return true;
		boolean previousOperation = checkPalindrome(currentNode.next);
		boolean isEqual = head.val == currentNode.val ? true : false;
		head = head.next;
		return previousOperation && isEqual;
	}

	public boolean isPalindromeRecursion(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null)
			slow = slow.next;
		slow = reverse(slow);
		fast = head;
		return isPal(slow, fast);
	}

	private boolean isPal(ListNode slow, ListNode fast) {
		if (slow == null)
			return true;
		else if (slow.val != fast.val)
			return false;
		else
			return isPal(slow.next, fast.next);
	}

	public boolean isPalindrome3(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null)
			slow = slow.next;
		slow = reverse(slow);
		fast = head;
		while (slow != null) {
			if (slow.val != fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}

	private ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

	public boolean isPalindrome2(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		Stack<Integer> stack = new Stack<>();
		while (fast != null && fast.next != null) {
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		// if odd length, move SLOW pointer to one forward away from middle element
		if (fast != null)
			slow = slow.next;
		while (slow != null) {
			if (slow.val != stack.pop())
				return false;
			slow = slow.next;
		}
		return true;
	}

	public boolean isPalindrome(ListNode head) {
		ListNode tempNode = head;
		Stack<Integer> stack = new Stack<>();
		while (tempNode != null) {
			stack.push(tempNode.val);
			tempNode = tempNode.next;
		}
		while (head != null) {
			if (head.val != stack.pop()) {
				return false;
			}
			head = head.next;
		}
		return true;
	}
}
