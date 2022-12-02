package com.altafjava.array;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7 };
		MissingElement missingElement = new MissingElement();
		int missingNo = missingElement.missingElementInNaturalNoArray(arr);
		System.out.println("missingElementInNaturalNoArray: " + missingNo);
		int[] arr2 = { 6, 7, 8, 10, 11, 12 };
		missingNo = missingElement.missingElementInSortedArray(arr2);
		System.out.println("missingElementInSortedArray: " + missingNo);
		int[] arr3 = { 3, 4, 6, 9, 10, 11 };
		Object[] multipleMissingNos = missingElement.multipleMissingElementsInSortedArray(arr3);
		System.out.print("multipleMissingNos: ");
		for (int i = 0; i < multipleMissingNos.length; i++) {
			System.out.print(multipleMissingNos[i] + " ");
		}
		int[] arr4 = { 3, 1, 4, 8, 10, 7 };
		missingElement.missingElementsInUnorderedList(arr4, 1, 10);
	}

	public void missingElementsInUnorderedList(int arr[], int low, int high) {
		System.out.print("\nmissingElementsInUnorderedList: ");
		int[] hash = new int[high + 1];
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]] = 1;
		}
		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public Object[] multipleMissingElementsInSortedArray(int[] arr) {
		int diff = arr[0];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int sub = (arr[i] - i) - diff;
			if (sub != 0) {
				for (int j = 0; j < sub; j++) {
					list.add(diff + i);
					diff++;
				}
			}
		}
		return list.toArray();
	}

	public int missingElementInSortedArray(int[] arr) {
		int diff = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int d = arr[i] - i;
			if (d != diff) {
				return diff + i;
			}
		}
		return -1;
	}

	public int missingElementInNaturalNoArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int lastIndex = arr.length - 1;
		int lastElement = arr[lastIndex];
		int summession = (lastElement * (lastElement + 1)) / 2;
		return summession - sum;
	}
}
