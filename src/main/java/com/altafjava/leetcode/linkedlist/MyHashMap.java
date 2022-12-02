package com.altafjava.leetcode.linkedlist;

/*
Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:
    MyHashMap() initializes the object with an empty map.
    void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
    int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
    void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.

Example 1:
Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]

Constraints:
    0 <= key, value <= 106
    At most 104 calls will be made to put, get, and remove
*/
public class MyHashMap {

	public static void main(String[] args) {
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(1, 1);
		hashMap.print();
		hashMap.put(2, 2);
		hashMap.print();
		System.out.println("hashMap.get(1): " + hashMap.get(1));
		System.out.println("hashMap.get(2): " + hashMap.get(2));
		System.out.println("hashMap.get(3): " + hashMap.get(3));
		hashMap.put(2, 20);
		hashMap.print();
		hashMap.put(2, 20);
		hashMap.print();
		hashMap.put(18, 19);
		hashMap.print();
		System.out.println("hashMap.get(18): " + hashMap.get(18));
		hashMap.put(34, 35);
		hashMap.print();
		hashMap.remove(18);
		hashMap.print();
		hashMap.remove(2);
		hashMap.print();
		for (int i = 1; i <= 30; i++) {
			hashMap.put(i * i, i * i);
		}
		hashMap.print();
	}

	private Node[] hashTable;
	private static final float MAX_LOAD_FACTOR = 0.75f;
	private int count;

	public MyHashMap() {
		hashTable = new Node[16];
	}

	public void put(int key, int value) {
		int index = key % hashTable.length;
		Node head = hashTable[index];
		if (head == null) {
			Node node = new Node(key, value);
			hashTable[index] = node;
			count++;
			if (loadFactor() > MAX_LOAD_FACTOR) {
				rehash();
			}
		} else {
			boolean flag = false;
			Node prev = head;
			do {
				if (head.key == key) {
					flag = true;
					break;
				}
				prev = head;
				head = head.next;
			} while (head != null);
			if (flag) {
				head.value = value;
			} else {
				Node node = new Node(key, value);
				prev.next = node;
				count++;
				if (loadFactor() > MAX_LOAD_FACTOR) {
					rehash();
				}
			}
		}
	}

	public int get(int key) {
		int index = key % hashTable.length;
		Node head = hashTable[index];
		if (head != null) {
			while (head != null) {
				if (head.key == key) {
					return head.value;
				}
				head = head.next;
			}
		}
		return -1;
	}

	public void remove(int key) {
		int index = key % hashTable.length;
		Node head = hashTable[index];
		Node prev = head;
		if (head != null) {
			if (head.key == key) {
				hashTable[index] = head.next;
				count--;
			} else {
				while (head != null) {
					if (head.key == key) {
						prev.next = head.next;
						count--;
						break;
					}
					prev = head;
					head = head.next;
				}
			}
		}
	}

	class Node {
		int key;
		int value;
		Node next;

		public Node() {
		}

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

		public Node(int key, int value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			return key + ":" + value + "->" + next + " ";
		}
	}

	private void rehash() {
		Node[] newHashTable = new Node[hashTable.length * 2];
		for (Node head : hashTable) {
			while (head != null) {
				Node next = head.next;
				int index = head.key % newHashTable.length;
				head.next = null;
				Node node = newHashTable[index];
				if (node == null) {
					newHashTable[index] = head;
				} else {
					Node cn = node;
					while (cn.next != null) {
						cn = cn.next;
					}
					cn.next = head;
				}
				head = next;
			}
		}
		hashTable = newHashTable;
	}

	private float loadFactor() {
		return count / (float) hashTable.length;
	}

	private void print() {
		for (Node head : hashTable) {
			while (head != null) {
				System.out.print(head.key + ":" + head.value + " ");
				head = head.next;
			}
		}
		System.out.println();
	}
}
