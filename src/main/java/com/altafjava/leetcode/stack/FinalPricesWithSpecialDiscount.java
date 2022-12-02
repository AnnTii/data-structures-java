package com.altafjava.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
You are given an integer array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items
in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such
that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all. Return an integer array answer where
answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.

Example 1:
Input: prices = [8,4,6,2,3]
Output: [4,2,4,2,3]
Explanation: 
For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
For items 3 and 4 you will not receive any discount at all.

Example 2:
Input: prices = [1,2,3,4,5]
Output: [1,2,3,4,5]
Explanation: In this case, for all items, you will not receive any discount at all.

Example 3:
Input: prices = [10,1,1,6]
Output: [9,0,1,6]

Constraints:
    1 <= prices.length <= 500
    1 <= prices[i] <= 1000
*/
public class FinalPricesWithSpecialDiscount {

	public static void main(String[] args) {
//		int[] prices = { 8, 4, 6, 2, 3 };
//		int[] prices = { 1, 2, 3, 4, 5 };
//		int[] prices = { 10, 1, 1, 6 };
		int[] prices = { 8, 7, 4, 2, 8, 1, 7, 7, 10, 1 };
		FinalPricesWithSpecialDiscount finalPricesWithSpecialDiscount = new FinalPricesWithSpecialDiscount();
		int[] finalPrices = finalPricesWithSpecialDiscount.finalPrices2(prices);
		for (int a : finalPrices) {
			System.out.print(a + " ");
		}
	}

	public int[] finalPrices2(int[] prices) {
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < prices.length; i++) {
			int price = prices[i];
			while (!stack.isEmpty() && prices[stack.peek()] >= price) {
//				int peek = stack.peek();
				prices[stack.pop()] = prices[stack.peek()] - price;
			}
			stack.push(i);
		}
		return prices;
	}

	public int[] finalPrices(int[] prices) {
		int[] ans = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			int discount = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] >= prices[j]) {
					discount = prices[j];
					break;
				}
			}
			ans[i] = prices[i] - discount;
		}
		return ans;
	}

}
