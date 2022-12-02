package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.altafjava.leetcode.util.LinkedList;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

public class SumTwoNumberTest {

	@Test
	public void testWithNormalNumbers() {
		SumTwoNumber sumTwoNumber = new SumTwoNumber();
		int input1 = 342;
		int input2 = 465;
		int expectedOutput = input1 + input2;
		ListNode listNode1 = ListNodeUtil.createListNodeInReverseOrder(input1);
		ListNode listNode2 = ListNodeUtil.createListNodeInReverseOrder(input2);
		ListNode listNode3 = sumTwoNumber.addTwoNumbersUsingLoop(listNode1, listNode2);
		int actualOutput = ListNodeUtil.getReverseNoFromListNode(listNode3);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testWithZero() {
		SumTwoNumber sumTwoNumber = new SumTwoNumber();
		int input1 = 0;
		int input2 = 0;
		int expectedOutput = input1 + input2;
		LinkedList linkedList1 = new LinkedList();
		linkedList1.add(0);
		ListNode listNode1 = linkedList1.getListNode();
		LinkedList linkedList2 = new LinkedList();
		linkedList2.add(0);
		ListNode listNode2 = linkedList2.getListNode();
		ListNode listNode3 = sumTwoNumber.addTwoNumbersUsingLoop(listNode1, listNode2);
		int actualOutput = ListNodeUtil.getReverseNoFromListNode(listNode3);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testWithNines() {
		SumTwoNumber sumTwoNumber = new SumTwoNumber();
		int input1 = 9999999;
		int input2 = 9999;
		int expectedOutput = input1 + input2;
		ListNode listNode1 = ListNodeUtil.createListNodeInReverseOrder(input1);
		ListNode listNode2 = ListNodeUtil.createListNodeInReverseOrder(input2);
		ListNode listNode3 = sumTwoNumber.addTwoNumbersUsingLoop(listNode1, listNode2);
		int actualOutput = ListNodeUtil.getReverseNoFromListNode(listNode3);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testWithNormalNumbersUsingRecursion() {
		SumTwoNumber sumTwoNumber = new SumTwoNumber();
		int input1 = 342;
		int input2 = 465;
		int expectedOutput = input1 + input2;
		ListNode listNode1 = ListNodeUtil.createListNodeInReverseOrder(input1);
		ListNode listNode2 = ListNodeUtil.createListNodeInReverseOrder(input2);
		ListNode listNode3 = sumTwoNumber.addTwoNumbersUsingRecursion(listNode1, listNode2);
		int actualOutput = ListNodeUtil.getReverseNoFromListNode(listNode3);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testWithZeroUsingRecursion() {
		SumTwoNumber sumTwoNumber = new SumTwoNumber();
		int input1 = 0;
		int input2 = 0;
		int expectedOutput = input1 + input2;
		LinkedList linkedList1 = new LinkedList();
		linkedList1.add(0);
		ListNode listNode1 = linkedList1.getListNode();
		LinkedList linkedList2 = new LinkedList();
		linkedList2.add(0);
		ListNode listNode2 = linkedList2.getListNode();
		ListNode listNode3 = sumTwoNumber.addTwoNumbersUsingRecursion(listNode1, listNode2);
		int actualOutput = ListNodeUtil.getReverseNoFromListNode(listNode3);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testWithNinesUsingRecursion() {
		SumTwoNumber sumTwoNumber = new SumTwoNumber();
		int input1 = 9999999;
		int input2 = 9999;
		int expectedOutput = input1 + input2;
		ListNode listNode1 = ListNodeUtil.createListNodeInReverseOrder(input1);
		ListNode listNode2 = ListNodeUtil.createListNodeInReverseOrder(input2);
		ListNode listNode3 = sumTwoNumber.addTwoNumbersUsingRecursion(listNode1, listNode2);
		int actualOutput = ListNodeUtil.getReverseNoFromListNode(listNode3);
		assertEquals(expectedOutput, actualOutput);
	}

}
