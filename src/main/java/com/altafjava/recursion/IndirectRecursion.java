package com.altafjava.recursion;

public class IndirectRecursion {

	public static void main(String[] args) {
		int x = 20;
		funA(x);
	}

	static void funA(int n) {
		if (n > 0) {
			System.out.println(n);
			funB(n - 1);
		}
	}

	static void funB(int n) {
		if (n > 1) {
			System.out.println(n);
			funA(n / 2);
		}
	}
}
