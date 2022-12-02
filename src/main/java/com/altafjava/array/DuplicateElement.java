package com.altafjava.array;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] sortedArray = { 3, 6, 8, 8, 10, 10, 12, 15, 15, 15, 20 };
		DuplicateElement duplicateElement = new DuplicateElement();
		duplicateElement.findDuplicatesInSortedArray(sortedArray);
		duplicateElement.findDuplicatesWithCountInSortedArray(sortedArray);
		duplicateElement.findDuplicatesWithCountInSortedArrayUsingHashing(sortedArray);
		int[] unsortedArray = { 8, 3, 6, 4, 6, 5, 6, 8, 2, 7 };
		duplicateElement.findDuplicatesInUnsortedArray(unsortedArray);
		int[] unsortedArray2 = { 8, 3, 6, 4, 6, 5, 6, 8, 2, 7 };
		duplicateElement.findDuplicatesInUnsortedArrayUsingHashing(unsortedArray2);
	}

	public void findDuplicatesInUnsortedArray(int[] arr) {
		System.out.println("\n\nDuplicates in Unsorted Array: ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == -1)
				continue;
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
					count++;
				}
			}
			if (count > 1)
				System.out.print(arr[i] + ":" + count + "  ");
		}
	}

	public void findDuplicatesInUnsortedArrayUsingHashing(int[] arr) {
		System.out.println("\n\nDuplicates in Unsorted Array using Hashing: ");
		int[] hashTable = new int[100];
		for (int i = 0; i < arr.length; i++) {
			hashTable[arr[i]]++;
		}
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] > 1) {
				System.out.print(i + ":" + hashTable[i] + "  ");
			}

		}
	}

	public void findDuplicatesInSortedArray(int[] arr) {
		System.out.println("Duplicates: ");
		int lastDuplicate = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] && arr[i] != lastDuplicate) {
				System.out.print(arr[i] + " ");
				lastDuplicate = arr[i];
			}
		}
	}

	public void findDuplicatesWithCountInSortedArray(int[] arr) {
		System.out.println("\n\nCount Duplicates: ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				int j = i + 1;
				while (arr[i] == arr[j]) {
					j++;
				}
				System.out.print(arr[i] + ": " + (j - i) + " ");
				i = j - 1;
			}
		}
	}

	public void findDuplicatesWithCountInSortedArrayUsingHashing(int[] arr) {
		System.out.println("\n\nCount Duplicates using Hashing: ");
		int[] hashTable = new int[arr[arr.length - 1] + 1];
		for (int i = 0; i < arr.length; i++) {
			hashTable[arr[i]]++;
		}
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] > 1) {
				System.out.print(i + ": " + hashTable[i] + " ");
			}
		}
	}

}
