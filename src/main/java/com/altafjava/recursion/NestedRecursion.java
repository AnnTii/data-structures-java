package com.altafjava.recursion;

public class NestedRecursion {

	public static void main(String[] args) {
		int x = 98;
		int result = fun(x);
		System.out.println("result: " + result);
	}

	static int fun(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return fun(fun(n + 11));
		}
	}
}
