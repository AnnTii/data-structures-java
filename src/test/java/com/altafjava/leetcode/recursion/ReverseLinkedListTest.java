package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

class ReverseLinkedListTest {

	@Test
	void testReverseListUsingRecursion() {
		int input = 12345;
		ListNode listNode = ListNodeUtil.createListNode(input);
		ListNodeUtil.print(listNode);
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		ListNode reverseListNode = reverseLinkedList.reverseListUsingRecursion(listNode);
		int actualOutput = ListNodeUtil.getNoFromListNode(reverseListNode);
		System.out.println(actualOutput);
		assertNotEquals(input, actualOutput);
	}

	@Test
	void testReverseLinkedListUsingLoop() {
		int input = 34567;
		ListNode listNode = ListNodeUtil.createListNode(input);
		ListNodeUtil.print(listNode);
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		ListNode reverseListNode = reverseLinkedList.reverseLinkedListUsingLoop(listNode);
		int actualOutput = ListNodeUtil.getNoFromListNode(reverseListNode);
		System.out.println(actualOutput);
		assertNotEquals(input, actualOutput);
	}

}
