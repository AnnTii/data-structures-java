package com.altafjava.leetcode.util;

public class ListNodeUtil {

	public static void print(ListNode listNode) {
		ListNode cn = listNode;
		while (cn != null) {
			System.out.print(cn.val + " ");
			cn = cn.next;
		}
		System.out.println();
	}

	public static ListNode createListNode(int n) {
		String number = String.valueOf(n);
		LinkedList linkedList = new LinkedList();
		int i = 0;
		while (i < number.length()) {
			int num = Integer.parseInt(number.charAt(i) + "");
			int rem = num % 10;
			linkedList.add(rem);
			n = n / 10;
			i++;
		}
		return linkedList.getListNode();
	}

	public static ListNode createListNode(int... arr) {
		LinkedList linkedList = new LinkedList();
		for (int num : arr) {
			linkedList.add(num);
		}
		return linkedList.getListNode();
	}

	public static ListNode createListNodeInReverseOrder(int n) {
		LinkedList linkedList = new LinkedList();
		while (n != 0) {
			int rem = n % 10;
			linkedList.add(rem);
			n = n / 10;
		}
		return linkedList.getListNode();
	}

	public static int getNoFromListNode(ListNode listNode) {
		ListNode cn = listNode;
		StringBuilder sb = new StringBuilder();
		while (cn != null) {
			int val = cn.val;
			sb.append(val);
			cn = cn.next;
		}
		int mul = (int) Math.pow(10, sb.length() - 1);
		int num = 0;
		int i = 0;
		while (i < sb.length()) {
			int val = Integer.parseInt(sb.substring(i, i + 1));
			num = num + (mul * val);
			mul = mul / 10;
			i++;
		}
		return num;
	}

	public static int getReverseNoFromListNode(ListNode listNode) {
		ListNode cn = listNode;
		int mul = 1;
		int num = 0;
		while (cn != null) {
			int val = cn.val;
			num = num + (mul * val);
			mul = mul * 10;
			cn = cn.next;
		}
		return num;
	}

}
