package com.altafjava.leetcode.linkedlist;

/*
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:
    void add(key) Inserts the value key into the HashSet.
    bool contains(key) Returns whether the value key exists in the HashSet or not.
    void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

Your MyHashSet object will be instantiated and called as such:
MyHashSet obj = new MyHashSet();
obj.add(key);
obj.remove(key);
boolean param_3 = obj.contains(key);

Example 1:
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)

Constraints:
    0 <= key <= 106
    At most 104 calls will be made to add, remove, and contains
*/
public class MyHashSet {
	public static void main(String[] args) {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(1);
		System.out.println(hashSet.contains(1));
		System.out.println(hashSet.contains(2));
		hashSet.add(2);
		System.out.println(hashSet.contains(2));
		hashSet.add(2);
		hashSet.print();
		hashSet.add(18);
		hashSet.add(17);
		hashSet.add(34);
		hashSet.add(50);
		hashSet.print();
		System.out.println(hashSet.contains(50));
		hashSet.remove(2);
		hashSet.print();
		hashSet.remove(18);
		hashSet.print();
		hashSet.add(66);
		hashSet.print();
		hashSet.remove(50);
		hashSet.print();
		hashSet.remove(500);
		hashSet.print();
		hashSet.remove(17);
		hashSet.print();
	}

	private Node[] table;

	public MyHashSet() {
		table = new Node[16];
	}

	public void add(int key) {
		int index = key % 16;
		Node node = new Node(key);
		Node head = table[index];
		if (head == null) {
			table[index] = node;
		} else {
			Node prev = head;
			boolean flag = false;
			do {
				if (head.val == key) {
					flag = true;
					break;
				}
				prev = head;
				head = head.next;
			} while (head != null);
			if (!flag)
				prev.next = node;
		}
	}

	public void remove(int key) {
		int index = key % 16;
		Node head = table[index];
		if (head != null) {
			int count = 0;
			boolean flag = false;
			Node prev = head, cn = head;
			while (cn != null) {
				count++;
				if (cn.val == key) {
					flag = true;
					break;
				}
				prev = cn;
				cn = cn.next;
			}
			if (flag) {
				if (count == 1) {
					table[index] = cn.next;
				} else {
					prev.next = cn.next;
				}
			}
		}
	}

	public boolean contains(int key) {
		int index = key % 16;
		Node head = table[index];
		if (head != null) {
			Node cn = head;
			while (cn != null) {
				if (cn.val == key) {
					return true;
				}
				cn = cn.next;
			}
		}
		return false;
	}

	public void print() {
		for (Node head : table) {
			while (head != null) {
				System.out.print(head.val + " ");
				head = head.next;
			}
		}
		System.out.println();
	}

	class Node {
		int val;
		Node next;

		public Node() {
		}

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

	}
}
