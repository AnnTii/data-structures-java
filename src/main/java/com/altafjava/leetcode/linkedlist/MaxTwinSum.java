package com.altafjava.leetcode.linkedlist;

import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node,
if 0 <= i <= (n / 2) - 1. For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the
only nodes with twins for n = 4. The twin sum is defined as the sum of a node and its twin. Given the head of a linked list with
even length, return the maximum twin sum of the linked list.

Example 1:
Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 

Example 2:
Input: head = [4,2,2,3]
Output: 7
Explanation:
The nodes with twins present in this linked list are:
- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 

Example 3:
Input: head = [1,100000]
Output: 100001
Explanation:
There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.

Constraints:
    The number of nodes in the list is an even integer in the range [2, 105].
    1 <= Node.val <= 105
*/
public class MaxTwinSum {
	public static void main(String[] args) {
		MaxTwinSum maxTwinSum = new MaxTwinSum();
//		ListNode head = ListNodeUtil.createListNode(5421);
//		ListNode head = ListNodeUtil.createListNode(4223);
		ListNode head = new ListNode(1);
		head.next = new ListNode(100000);
		ListNodeUtil.print(head);
		int maxSum = maxTwinSum.pairSum(head);
		System.out.println(maxSum);
	}

	public int pairSum(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reverse(slow);
		int sum = 0, max = head.val;
		while (slow != null) {
			sum = head.val + slow.val;
			if (sum > max)
				max = sum;
			slow = slow.next;
			head = head.next;
		}
		return max;
	}

	private ListNode reverse(ListNode slow) {
		ListNode cn = slow, prev = null;
		while (cn != null) {
			ListNode next = cn.next;
			cn.next = prev;
			prev = cn;
			cn = next;
		}
		return prev;
	}

	public int pairSum2(ListNode head) {
		int n = 0, sum = 0, max = head.val;
		ListNode cn = head;
		while (cn != null) {
			n++;
			cn = cn.next;
		}
		cn = head;
		for (int i = 0; i < n / 2; i++) {
			int twin = n - 1 - i;
			ListNode temp = cn;
			for (int j = i; j < twin; j++) {
				temp = temp.next;
			}
			sum = cn.val + temp.val;
			if (sum > max)
				max = sum;
			cn = cn.next;
		}
		return max;
	}
}
