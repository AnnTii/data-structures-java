package com.altafjava.array;

public class CustomArray {
	private int length;
	private int size;
	private int[] arr;

	public static void main(String[] args) {
		CustomArray arr = new CustomArray();
		arr.print();
		for (int i = 1; i <= 9; i++) {
			arr.add(i);
		}
		arr.print();
		arr.insert(13, 11);
		arr.insert(3, 12);
		arr.print();
		arr.insert(2, 56);
		arr.remove(12);
		arr.remove(-4);
		arr.remove(2);
		arr.print();
		arr.search(16);
		arr.search(6);
		arr.get(7);
		arr.set(4, 51);
		arr.print();
		arr.max();
		arr.min();
		arr.reverse();
		arr.print();
		arr.remove(0);
		arr.print();
		arr.rotateClockWise(10);
		arr.print();
		arr.rotateAntiClockWise(3);
		arr.print();
		arr.rotateClockWise2(4);
		arr.print();
		arr.rotateAntiClockWise2(4);
		arr.print();
	}

	public CustomArray() {
		length = 0;
		size = 10;
		arr = new int[10];
	}

	public CustomArray(int size) {
		length = 0;
		this.size = size;
		arr = new int[size];
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

	public void add(int number) {
		if (length == size) {
			System.err.println("Space is not available in the array");
			return;
		}
		arr[length] = number;
		length++;
	}

	public void insert(int index, int number) {
		if (length == size) {
			System.err.println("Space is not available in the array");
		} else if (index >= size) {
			System.err.println("index " + index + " is greater than the array size " + size);
		} else if (index < 0) {
			System.err.println("index cannot be negative");
		} else {
			int i = length;
			while (i > index) {
				arr[i] = arr[i - 1];
				i--;
			}
			arr[i] = number;
			length++;
		}
	}

	public void remove(int index) {
		if (index >= size) {
			System.err.println("index " + index + " is greater than the array size " + size);
		} else if (index < 0) {
			System.err.println("index cannot be negative");
		} else {
			for (int i = index + 1; i < length; i++) {
				arr[i - 1] = arr[i];
			}
			length--;
		}
	}

	public int search(int number) {
		for (int i = 0; i < length; i++) {
			if (number == arr[i]) {
				System.out.println("No " + number + " found at index " + i);
				return i;
			}
		}
		System.err.println("No " + number + " is not present in the array");
		return -1;
	}

	public int get(int index) {
		if (index >= size) {
			System.err.println("index " + index + " is greater than the array size " + size);
		} else if (index < 0) {
			System.err.println("index cannot be negative");
		} else {
			int number = arr[index];
			System.out.println("Got number at index " + index + " is " + number);
			return number;
		}
		return -1;
	}

	public void set(int index, int number) {
		if (index >= size) {
			System.err.println("index " + index + " is greater than the array size " + size);
		} else if (index < 0) {
			System.err.println("index cannot be negative");
		} else {
			arr[index] = number;
			System.out.println("Number " + number + " set at index " + index);
		}
	}

	public int max() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Max number is " + max);
		return max;
	}

	public int min() {
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < length; i++) {
			if (arr[i] < max)
				max = arr[i];
		}
		System.out.println("Min number is " + max);
		return max;
	}

	public void reverse() {
		int i = 0;
		int j = length - 1;
		while (i < j) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
		}
	}

	public void rotateClockWise(int noOfMoves) {
		if (length > 2) {
			noOfMoves = noOfMoves % length;
			for (int j = 0; j < noOfMoves; j++) {
				int temp = arr[0];
				for (int i = 1; i < length; i++) {
					arr[i - 1] = arr[i];
				}
				arr[length - 1] = temp;
			}
		}
	}

	public void rotateClockWise2(int noOfMoves) {
		if (length > 2) {
			int[] temp = new int[length];
			noOfMoves = noOfMoves % length;
			int j = 0;
			for (int i = noOfMoves; i < length; i++) {
				temp[j++] = arr[i];
			}
			for (int i = 0; i < noOfMoves; i++) {
				temp[j++] = arr[i];
			}
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
		}
	}

	public void rotateAntiClockWise(int noOfMoves) {
		if (length > 2) {
			for (int i = 0; i < noOfMoves; i++) {
				int temp = arr[length - 1];
				for (int j = length - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = temp;
			}
		}
	}

	public void rotateAntiClockWise2(int noOfMoves) {
		if (length > 2) {
			int[] temp = new int[length];
			noOfMoves = noOfMoves % length;
			int j = 0;
			for (int i = length - noOfMoves; i < length; i++) {
				temp[j++] = arr[i];
			}
			for (int i = 0; i < length - noOfMoves; i++) {
				temp[j++] = arr[i];
			}
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
		}
	}
}
