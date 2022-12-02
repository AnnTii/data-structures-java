package com.altafjava.array;

public class PairSum {
	public static void main(String[] args) {
		int[] unsortedArray = { 6, 3, 8, 10, 16, 7, 5, 2, 9, 14 };
		PairSum pairSum = new PairSum();
		int k = 10;
		pairSum.findPairWithSumKInUnsortedArray(unsortedArray, k);
		pairSum.findPairWithSumKInUnsortedArrayUsingHashing(unsortedArray, k, 16);
		int[] sortedArray = { 1, 3, 4, 5, 6, 8, 9, 10, 12, 14 };
		pairSum.findPairWithSumKInSortedArray(sortedArray, k);

	}

	public void findPairWithSumKInSortedArray(int[] arr, int k) {
		System.out.print("\nPairSum in SortedArray: ");
		int i = 0, j = arr.length - 1;
		while (i != j) {
			int sum = arr[i] + arr[j];
			if (sum == k) {
				System.out.print(arr[i] + "+" + arr[j] + "=" + k + "  ");
				i++;
				j--;
			} else if (sum < k)
				i++;
			else
				j--;
		}
	}

	public void findPairWithSumKInUnsortedArray(int[] arr, int k) {
		System.out.print("\nPairSum in UnsortedArray: ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= k) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == k) {
						System.out.print(arr[i] + "+" + arr[j] + "=" + k + "  ");
						break;
					}
				}
			}
		}
	}

	public void findPairWithSumKInUnsortedArrayUsingHashing(int[] arr, int k, int maxElement) {
		System.out.print("\nPairSum in UnsortedArray using Hashing: ");
		int[] hashTable = new int[maxElement + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= k) {
				int require = k - arr[i];
				if (hashTable[require] == 1)
					System.out.print(arr[i] + "+" + require + "=" + k + "  ");
				hashTable[arr[i]]++;
			}
		}
	}
}
