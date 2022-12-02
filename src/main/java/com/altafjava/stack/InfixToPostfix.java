package com.altafjava.stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String infix = "a+b*c-d/e";
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		String postfix = infixToPostfix.convertInfixToPostfix(infix);
		System.out.println(postfix);
	}

	public String convertInfixToPostfix(String infix) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (char c : infix.toCharArray()) {
			if (isOperator(c)) {
				int precedence = getPrecedence(c);
				if (precedence > getPrecedence(stack.isEmpty() ? 0 : stack.peek())) {
					stack.push(c);
				} else {
					sb.append(stack.pop());
					while (!stack.empty()) {
						if (precedence <= getPrecedence(stack.isEmpty() ? 0 : stack.peek())) {
							sb.append(stack.pop());
						}
					}
				}
			} else {
				sb.append(c);
			}
		}
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	public boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '/' || c == '*')
			return true;
		return false;
	}

	public int getPrecedence(char c) {
		if (c == '+' || c == '-')
			return 1;
		else if (c == '*' || c == '/')
			return 2;
		else
			return 0;
	}
}
