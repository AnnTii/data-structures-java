package com.altafjava.array;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 3, 8, 10, 15, 17, 21, 24, 33, 34, 37, 39, 42, 43, 50, 54, 59 };
		int target = 59;
//		int index = binarySearch(target, arr);
//		System.out.println("Output: " + index);
		int index = binarySearchRecursion(0, arr.length - 1, arr, target);
		System.out.println("Output: " + index);
	}

	public static int binarySearch(int target, int[] arr) {
		int l = 0;
		int h = arr.length - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (target == arr[m])
				return m;
			else if (target < arr[m])
				h = m - 1;
			else if (target > arr[m])
				l = m + 1;
		}
		return -1;
	}

	public static int binarySearchRecursion(int l, int h, int[] arr, int target) {
		if (l <= h) {
			int m = (l + h) / 2;
			if (target == arr[m]) {
				return m;
			} else if (target < arr[m]) {
				return binarySearchRecursion(l, m - 1, arr, target);
			} else if (target > arr[m]) {
				return binarySearchRecursion(m + 1, h, arr, target);
			}
		}
		return -1;
	}

}
