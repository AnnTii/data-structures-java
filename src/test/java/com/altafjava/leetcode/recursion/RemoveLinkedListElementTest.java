package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

class RemoveLinkedListElementTest {

	RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();

	@Test
	void testRemoveElements() {
		int input = 1236456;
		ListNode listNode = ListNodeUtil.createListNode(input);
		int element = 6;
		ListNode head = removeLinkedListElement.removeElements(listNode, element);
		int actual = ListNodeUtil.getNoFromListNode(head);
		assertEquals(12345, actual);
	}

	@Test
	void testRemoveElementsWithEmptyValue() {
		ListNode listNode = new ListNode();
		int element = 2;
		ListNode head = removeLinkedListElement.removeElements(listNode, element);
		int actual = ListNodeUtil.getNoFromListNode(head);
		assertEquals(0, actual);
	}

	@Test
	void testRemoveElementsWithSameValues() {
		int input = 777777;
		ListNode listNode = ListNodeUtil.createListNode(input);
		int element = 7;
		ListNode head = removeLinkedListElement.removeElements(listNode, element);
		int actual = ListNodeUtil.getNoFromListNode(head);
		assertEquals(0, actual);
	}

	@Test
	void testRemoveElementsUsingRecursion() {
		int input = 1236456;
		ListNode listNode = ListNodeUtil.createListNode(input);
		int element = 6;
		ListNode head = removeLinkedListElement.removeElementsUsingRecursion(listNode, element);
		int actual = ListNodeUtil.getNoFromListNode(head);
		assertEquals(12345, actual);
	}

	@Test
	void testRemoveElementsUsingRecursionWithEmptyValue() {
		ListNode listNode = new ListNode();
		int element = 2;
		ListNode head = removeLinkedListElement.removeElementsUsingRecursion(listNode, element);
		int actual = ListNodeUtil.getNoFromListNode(head);
		assertEquals(0, actual);
	}

	@Test
	void testRemoveElementsUsingRecursionWithSameValues() {
		int input = 777777;
		ListNode listNode = ListNodeUtil.createListNode(input);
		int element = 7;
		ListNode head = removeLinkedListElement.removeElementsUsingRecursion(listNode, element);
		int actual = ListNodeUtil.getNoFromListNode(head);
		assertEquals(0, actual);
	}
}
