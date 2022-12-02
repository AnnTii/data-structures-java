package com.altafjava.stack;

public class ParanthesisMatching {
	public static void main(String[] args) {
		String expression = "((a+b)*(c-d))";
//		String expression = "(((a+b)*(c-d))";
//		String expression = "((a+b)*(c-d)))";
		ParanthesisMatching paranthesisMatching = new ParanthesisMatching();
		boolean isParanthesisBalanced = paranthesisMatching.isParanthesisBalanced(expression);
		System.out.println(isParanthesisBalanced);
	}

	public boolean isParanthesisBalanced(String expression) {
		StackLinkedList stack = new StackLinkedList();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.pop() == -1) {
					return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		return false;
	}
}
