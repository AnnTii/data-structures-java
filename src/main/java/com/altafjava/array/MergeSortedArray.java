package com.altafjava.array;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] arr1 = { 3, 8, 20, 21, 25, 30, 34 };
		int[] arr2 = { 4, 6, 7, 12, 28, 56, 78, 90 };
		int[] output = mergeSortedArray(arr1, arr2);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			mergedArray[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
	}
}
