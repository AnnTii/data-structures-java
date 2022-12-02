package com.altafjava.string;

public class CountDuplicateString {
	public static void main(String[] args) {
		String s = "My name is Hasan Ansari";
		char[] chars = s.toCharArray();
		char min = chars[0], max = chars[0];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] > max)
				max = chars[i];
			else if (chars[i] < min)
				min = chars[i];
		}
		int size = max - min;
		int[] hashTable = new int[size + 1];
		for (int i = 0; i < chars.length; i++) {
			int c = chars[i];
			hashTable[c - min]++;
		}
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] > 1) {
				char c = (char) (i + min);
				System.out.println(c + " " + hashTable[i]);
			}
		}
	}
}
