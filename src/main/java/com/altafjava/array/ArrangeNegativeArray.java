package com.altafjava.array;

public class ArrangeNegativeArray {

	public static void main(String[] args) {
		int[] arr = { 3, -6, -1, 9, 2, 3, -7, 12, -56, -32, -80, 1 };
		System.out.print("Before: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			while (arr[i] < 0) {
				i++;
			}
			while (arr[j] > 0) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.print("\nAfter: ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
