package com.altafjava.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseStringUsingRecursion() {
		char[] array = { 'h', 'e', 'l', 'l', 'o' };
		char[] copiedArray = Arrays.copyOf(array, array.length);
		ReverseString reverseString = new ReverseString();
		reverseString.reverseStringUsingRecursion(array);
		assertNotEquals(copiedArray, array);
	}

	@Test
	void testReverseStringUsingLoop() {
		char[] array = { 'h', 'e', 'l', 'l', 'o' };
		char[] copiedArray = Arrays.copyOf(array, array.length);
		ReverseString reverseString = new ReverseString();
		reverseString.reverseStringUsingLoop(array);
		assertNotEquals(copiedArray, array);
	}

}
