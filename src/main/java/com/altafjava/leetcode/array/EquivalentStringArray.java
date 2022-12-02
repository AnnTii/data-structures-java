package com.altafjava.leetcode.array;

/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

Constraints:
    1 <= word1.length, word2.length <= 103
    1 <= word1[i].length, word2[i].length <= 103
    1 <= sum(word1[i].length), sum(word2[i].length) <= 103
    word1[i] and word2[i] consist of lowercase letters.
*/
public class EquivalentStringArray {
	public static void main(String[] args) {
		EquivalentStringArray equivalentStringArray = new EquivalentStringArray();
//		String[] word1 = { "ab", "c" }, word2 = { "a", "bc" };
//		String[] word1 = { "a", "cb" }, word2 = { "ab", "c" };
		String[] word1 = { "abc", "d", "defg" }, word2 = { "abcddefg" };
		boolean isArrayStringsAreEqual = equivalentStringArray.arrayStringsAreEqual3(word1, word2);
		System.out.println(isArrayStringsAreEqual);
	}

	public boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
		int i = 0, j = 0, p1 = 0, p2 = 0;
		while (p1 != word1.length && p2 != word2.length) {
			String wrd1 = word1[p1], wrd2 = word2[p2];
			if (wrd1.charAt(i++) != wrd2.charAt(j++))
				return false;
			if (i == wrd1.length()) {
				i = 0;
				p1++;
			}
			if (j == wrd2.length()) {
				j = 0;
				p2++;
			}
		}
		return p1 == word1.length && p2 == word2.length;
	}

	public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
		return String.join("", word1).equals(String.join("", word2));
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		for (String word : word1) {
			sb1.append(word);
		}
		StringBuilder sb2 = new StringBuilder();
		for (String word : word2) {
			sb2.append(word);
		}
		return sb1.compareTo(sb2) == 0 ? true : false;
	}
}
