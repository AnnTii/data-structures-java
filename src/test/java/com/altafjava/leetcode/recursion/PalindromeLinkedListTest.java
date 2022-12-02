package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

class PalindromeLinkedListTest {

	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, 212, 222, 232, 242, 252,
			262, 272, 282, 292, 303, 313, 323, 333, 343, 353, 363, 373, 383, 393, 404, 414, 424, 434, 444, 454, 464, 474, 484, 494, 505, 515, 525, 535, 545,
			555, 565, 575, 585, 595, 606, 616, 626, 636, 646, 656, 666, 676, 686, 696, 707, 717, 727, 737, 747, 757, 767, 777, 787, 797, 808, 818, 828, 838,
			848, 858, 868, 878, 888, 898, 909, 919, 929, 939, 949, 959, 969, 979, 989, 999 };
	PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

	@Test
	void testIsPalindrome() {
		for (int input : arr) {
			ListNode listNode = ListNodeUtil.createListNode(input);
			boolean isPalindrome = palindromeLinkedList.isPalindrome(listNode);
			assertTrue(isPalindrome, input + " is not a palindrome number");
		}
	}

	@Test
	void testIsPalindrome2() {
		for (int input : arr) {
			ListNode listNode = ListNodeUtil.createListNode(input);
			boolean isPalindrome = palindromeLinkedList.isPalindrome2(listNode);
			assertTrue(isPalindrome, input + " is not a palindrome number");
		}
	}

	@Test
	void testIsPalindrome3() {
		for (int input : arr) {
			ListNode listNode = ListNodeUtil.createListNode(input);
			boolean isPalindrome = palindromeLinkedList.isPalindrome3(listNode);
			assertTrue(isPalindrome, input + " is not a palindrome number");
		}
	}

	@Test
	void testIsPalindromeRecursion() {
		for (int input : arr) {
			ListNode listNode = ListNodeUtil.createListNode(input);
			boolean isPalindrome = palindromeLinkedList.isPalindromeRecursion(listNode);
			assertTrue(isPalindrome, input + " is not a palindrome number");
		}
	}

	@Test
	void testIsPalindromeRecursion2() {
		for (int input : arr) {
			ListNode listNode = ListNodeUtil.createListNode(input);
			boolean isPalindrome = palindromeLinkedList.isPalindromeRecursion2(listNode);
			assertTrue(isPalindrome, input + " is not a palindrome number");
		}
	}

}
