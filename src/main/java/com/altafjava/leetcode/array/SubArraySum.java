package com.altafjava.leetcode.array;

/*
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
A subarray is a contiguous subsequence of the array.

Example 1:
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

Example 2:
Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.

Example 3:
Input: arr = [10,11,12]
Output: 66

Constraints:
    1 <= arr.length <= 100
    1 <= arr[i] <= 1000

Follow up:
Could you solve this problem in O(n) time complexity?
*/
public class SubArraySum {

	public static void main(String[] args) {
//		int[] arr = { 1, 4, 2, 5, 3 };
//		int[] arr = { 1, 2 };
		int[] arr = { 10, 11, 12 };
		SubArraySum oddLengthSubArraySum = new SubArraySum();
//		int sum = oddLengthSubArraySum.sumSubarrays(arr);
		int sum = oddLengthSubArraySum.sumOddLengthSubarrays(arr);
//		int sum = oddLengthSubArraySum.sumEvenLengthSubarrays(arr);
		System.out.println(sum);
	}

	public int sumSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int start = arr.length - i;
			int end = i + 1;
			int totalCount = start * end;
			sum = sum + arr[i] * totalCount;
		}
		return sum;
	}

	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int start = arr.length - i;
			int end = i + 1;
			int totalCount = start * end;
			int oddSubArray = totalCount % 2 == 1 ? ((totalCount / 2) + 1) : totalCount / 2;
			sum = sum + (arr[i] * oddSubArray);
		}
		return sum;
	}

	public int sumEvenLengthSubarrays(int[] arr) {
		int sum = 0, start = arr.length, end = 1;
		for (int i = 0; i < arr.length; i++) {
			int totalCount = start * end;
			int oddSubArray = totalCount / 2;
			sum = sum + (arr[i] * oddSubArray);
			start--;
			end++;
		}
		return sum;
	}
}
