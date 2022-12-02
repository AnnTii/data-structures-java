package com.altafjava.string;

public class CheckDuplicateString {
	public static void main(String[] args) {
		String s = "my name is hasan ansari";
		int h = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int x = 1;
			int shift = chars[i] - 97;
			x = x << shift;
			int n = x & h;
			if (n > 0) {
				System.out.println("duplicate: " + chars[i]);
			} else {
				h = h | x;
			}
		}
	}
}
