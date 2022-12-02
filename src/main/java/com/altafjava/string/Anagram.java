package com.altafjava.string;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "decimal";
		String s2 = "medical";
		Anagram anagram = new Anagram();
		boolean isAnagram = anagram.checkAnagram(s1, s2);
		System.out.println(isAnagram);
	}

//	For small letters only
	public boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] hashTable = new int[26];
		char[] chars = s1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int index = chars[i] - 97;
			hashTable[index]++;
		}
		chars = s2.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int index = chars[i] - 97;
			hashTable[index]--;
			if (hashTable[index] < 0) {
				return false;
			}
		}
		return true;
	}
}
