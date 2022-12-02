package com.altafjava.string;

public class Permutation {

	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		String s = "ABC";
//		permutation.printPermutationUsingLoop(s);
		permutation.printPermutationUsingRecursion(s);
	}

	public void printPermutationUsingLoop(String s) {
		permute("", s);
	}

	public void printPermutationUsingRecursion(String s) {
		char[] chars = s.toCharArray();
		perm(chars, 0);
	}

	boolean[] flag = new boolean[10];
	char[] result = new char[10];

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

	private void permute(String perm, String remaining) {
		if (remaining.isEmpty())
			System.out.println(perm);
		for (int i = 0; i < remaining.length(); i++) {
			char ch = remaining.charAt(i);
			String p = perm + ch;
			String iPlus1 = remaining.substring(i + 1);
			String zeroToI = remaining.substring(0, i);
			String r = iPlus1 + zeroToI;
			permute(p, r);
		}
	}
}
