package com.altafjava.array;

import java.util.Arrays;

public class SetOperation {

	public static void main(String[] args) {
		int[] a1 = { 3, 5, 10, 4, 6 };
		int[] a2 = { 12, 4, 7, 2, 5 };
		SetOperation setOperation = new SetOperation();
		int[] union = setOperation.union(a1, a2);
		System.out.println("Union");
		for (int i = 0; i < union.length; i++) {
			System.out.print(union[i] + " ");
		}
		int[] a3 = { 3, 5, 10, 15, 26 };
		int[] a4 = { 1, 3, 6, 9, 10, 15, 25 };
		union = setOperation.unionForSortedArray(a3, a4);
		System.out.println("\n\nSorted Union");
		for (int i = 0; i < union.length; i++) {
			System.out.print(union[i] + " ");
		}
		System.out.println("\n\nIntersection");
		int[] intersection = setOperation.intersection(a1, a2);
		for (int i = 0; i < intersection.length; i++) {
			System.out.print(intersection[i] + " ");
		}
		System.out.println("\n\nSorted Intersection");
		intersection = setOperation.intersectionForSortedArray(a3, a4);
		for (int i = 0; i < intersection.length; i++) {
			System.out.print(intersection[i] + " ");
		}
		System.out.println("\n\nDifference");
		int[] difference = setOperation.difference(a1, a2);
		for (int i = 0; i < difference.length; i++) {
			System.out.print(difference[i] + " ");
		}
		System.out.println("\n\nSorted Difference");
		difference = setOperation.differenceForSortedArray(a3, a4);
		for (int i = 0; i < difference.length; i++) {
			System.out.print(difference[i] + " ");
		}
	}

	public int[] difference(int[] a1, int[] a2) {
		int k = 0;
		int[] arr = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					flag = true;
				}
			}
			if (!flag) {
				arr[k++] = a1[i];
			}
		}
		return Arrays.copyOf(arr, k);
	}

	public int[] differenceForSortedArray(int[] a1, int[] a2) {
		int i = 0, j = 0, k = 0;
		int arr[] = new int[a1.length];
		while (i < a1.length && j < a2.length) {
			if (a1[i] == a2[j]) {
				i++;
				j++;
			} else if (a1[i] > a2[j]) {
				j++;
			} else {
				arr[k++] = a1[i++];
			}
		}
		while (i < a1.length) {
			arr[k++] = a1[i++];
		}
		return Arrays.copyOf(arr, k);
	}

	public int[] intersection(int[] a1, int[] a2) {
		int k = 0;
		int[] arr = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					arr[k++] = a1[i];
					break;
				}
			}
		}
		return Arrays.copyOf(arr, k);
	}

	public int[] intersectionForSortedArray(int[] a1, int[] a2) {
		int[] arr = new int[a1.length];
		int i = 0, j = 0, k = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] == a2[j]) {
				arr[k++] = a1[i++];
				j++;
			} else if (a1[i] < a2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOf(arr, k);
	}

	public int[] union(int[] a1, int[] a2) {
		int[] arr = new int[a1.length + a2.length];
		int k = 0;
		for (int i = 0; i < a1.length; i++) {
			arr[k++] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a1.length; j++) {
				if (a2[i] == a1[j]) {
					flag = true;
				}
			}
			if (!flag)
				arr[k++] = a2[i];
		}
		return Arrays.copyOf(arr, k);
	}

	public int[] unionForSortedArray(int[] a1, int[] a2) {
		int i = 0, j = 0, k = 0;
		int[] arr = new int[a1.length + a2.length];
		while (i < a1.length && j < a2.length) {
			if (a1[i] == a2[j]) {
				arr[k++] = a1[i++];
				j++;
			} else if (a1[i] < a2[j]) {
				arr[k++] = a1[i++];
			} else {
				arr[k++] = a2[j++];
			}
		}
		while (i < a1.length) {
			arr[k++] = a1[i++];
		}
		while (j < a2.length) {
			arr[k++] = a2[j++];
		}
		return Arrays.copyOf(arr, k);
	}
}
