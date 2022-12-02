package com.altafjava.array;

/*Approach1:
1. Find the index of the NUMBER where it will be inserted
2. Shift the elements to right side which are greater than the NUMBER
3. Insert the element NUMBER in the required position
This is approach will require to loops. First it has to find the index of NUMBER and second it will the greater elements. Hence use Approach2

Approach2:
1. Directly start shifting elements to right which are greater than NUMBER
2. Check if element is less than NUMBER then insert and break the loop
3. This will require only one loop
*/

public class SortedArray {
	private int length;
	private int size;
	private int[] arr;

	public static void main(String[] args) {
		SortedArray sortedArray = new SortedArray();
		for (int i = 0; i < 8; i++) {
			sortedArray.add(i * 3);
		}
		sortedArray.print();
		sortedArray.insert(7);
		sortedArray.print();
		sortedArray.insert(16);
		sortedArray.print();
		sortedArray.insert(22);
		System.out.println("isArraySorted: " + sortedArray.isSorted());
	}

	public SortedArray() {
		length = 0;
		size = 10;
		arr = new int[10];
	}

	public void print() {
		System.out.print("[");
		for (int i = 0; i < length; i++) {
			if (i == length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}

	private void add(int number) {
		if (length == size) {
			System.err.println("Space is not available in the array");
			return;
		}
		arr[length] = number;
		length++;
	}

	public void insert(int number) {
		if (size > length) {
			int i = length;
			while (arr[i - 1] > number) {
				arr[i] = arr[i - 1];
				i--;
			}
			arr[i] = number;
			length++;
		} else {
			System.err.println("Space is not available in the array");
		}
	}

	public boolean isSorted() {
		for (int i = length - 1; i > 0; i--) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
