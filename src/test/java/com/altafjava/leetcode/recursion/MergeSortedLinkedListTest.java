package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

class MergeSortedLinkedListTest {

	@Test
	void testMergeTwoLinkedListsUsingLoop() {
		int input1 = 5;
		int input2 = 124;
		String expected = "1245";
		ListNode listNode1 = ListNodeUtil.createListNode(input1);
		ListNodeUtil.print(listNode1);
		ListNode listNode2 = ListNodeUtil.createListNode(input2);
		ListNodeUtil.print(listNode2);
		MergeSortedLinkedList mergeLinkedList = new MergeSortedLinkedList();
		ListNode listNode = mergeLinkedList.mergeTwoLinkedListsUsingLoop(listNode1, listNode2);
		ListNodeUtil.print(listNode);
		StringBuilder sb = new StringBuilder();
		ListNode cn = listNode;
		while (cn != null) {
			sb.append(cn.val);
			cn = cn.next;
		}
		assertEquals(expected, sb.toString());
	}

	@Test
	void testMergeTwoLinkedListsUsingRecursion() {
		int input1 = 135;
		int input2 = 289;
		String expected = "123589";
		ListNode listNode1 = ListNodeUtil.createListNode(input1);
		ListNodeUtil.print(listNode1);
		ListNode listNode2 = ListNodeUtil.createListNode(input2);
		ListNodeUtil.print(listNode2);
		MergeSortedLinkedList mergeLinkedList = new MergeSortedLinkedList();
		ListNode listNode = mergeLinkedList.mergeTwoLinkedListsUsingRecursion(listNode1, listNode2);
		ListNodeUtil.print(listNode);
		StringBuilder sb = new StringBuilder();
		ListNode cn = listNode;
		while (cn != null) {
			sb.append(cn.val);
			cn = cn.next;
		}
		assertEquals(expected, sb.toString());
	}

}
