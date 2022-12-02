package com.altafjava.leetcode.array;

import java.util.Arrays;

/*
There is a programming language with only four operations and one variable X:
    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

Example 1:
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.

Example 2:
Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.

Example 3:
Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.

Constraints:
    1 <= operations.length <= 100
    operations[i] will be either "++X", "X++", "--X", or "X--".
*/
public class UnaryOperation {
	public static void main(String[] args) {
//		String[] operations = { "--X", "X++", "X++" };
//		String[] operations = { "++X", "++X", "X++" };
		String[] operations = { "X++", "++X", "--X", "X--" };
		UnaryOperation unaryOperation = new UnaryOperation();
		int finalValueAfterOperations = unaryOperation.finalValueAfterOperations3(operations);
		System.out.println(finalValueAfterOperations);
	}

	public int finalValueAfterOperations(String[] operations) {
		int val = 0;
		for (String operator : operations) {
			switch (operator) {
			case "X++":
				val++;
				break;
			case "++X":
				++val;
				break;
			case "--X":
				--val;
				break;
			case "X--":
				val--;
				break;
			}
		}
		return val;
	}

	public int finalValueAfterOperations2(String[] operations) {
		int val = 0;
		for (String operator : operations) {
			if (operator.contains("+"))
				val++;
			else
				val--;
		}
		return val;
	}

	public int finalValueAfterOperations3(String[] operations) {
		return Arrays.stream(operations, 0, operations.length).mapToInt(operator -> operator.charAt(1) == '+' ? 1 : -1).sum();
	}
}
