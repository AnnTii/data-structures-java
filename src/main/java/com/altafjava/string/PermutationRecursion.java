package com.altafjava.string;

public class PermutationRecursion {

	public static void main(String[] args) {
		PermutationRecursion permutation = new PermutationRecursion();
		String s = "ABC";
		permutation.printPermutationUsingRecursion(s);
	}

	public void printPermutationUsingRecursion(String s) {
		char[] chars = s.toCharArray();
		perm(chars, 0);
	}

	boolean[] flag = new boolean[3];
	char[] result = new char[3];

	public void perm(char[] chars, int k) {
		if (k == chars.length) {
			System.out.println(result);
		} else {
			for (int i = 0; i < chars.length; i++) {
				if (!flag[i]) {
					result[k] = chars[i];
					flag[i] = true;
					perm(chars, k + 1);
					flag[i] = false;
				}
			}
		}
	}

}
