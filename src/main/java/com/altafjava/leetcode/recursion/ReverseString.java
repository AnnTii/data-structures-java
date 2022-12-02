package com.altafjava.leetcode.recursion;


/*
Write a function that reverses a string. The input string is given as an array of characters s. You must do this by modifying the 
input array in-place with O(1) extra memory.

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
public class ReverseString {

	public void reverseStringUsingRecursion(char[] s) {
		int i = 0;
		int j = s.length - 1;
		reverse(s, i, j);
	}

	private void reverse(char[] s, int i, int j) {
		if (i < j) {
			char t = s[i];
			s[i] = s[j];
			s[j] = t;
			reverse(s, ++i, --j);
		}
	}

	public void reverseStringUsingLoop(char[] s) {
		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			char t = s[i];
			s[i] = s[j];
			s[j] = t;
			i++;
			j--;
		}
	}

}
