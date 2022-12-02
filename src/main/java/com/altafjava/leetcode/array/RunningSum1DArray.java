package com.altafjava.leetcode.array;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:
    1 <= nums.length <= 1000
    -10^6 <= nums[i] <= 10^6
 */
public class RunningSum1DArray {
	public static void main(String[] args) {
//		int[] nums = { 3, 1, 2, 10, 1 };
//		int[] nums = { 1, 1, 1, 1, 1 };
		int[] nums = { 1, 2, 3, 4 };
		RunningSum1DArray runningSum1DArray = new RunningSum1DArray();
		int[] runningSum = runningSum1DArray.runningSum(nums);
		for (int i = 0; i < runningSum.length; i++) {
			System.out.print(runningSum[i] + " ");
		}
	}

	public int[] runningSum(int[] nums) {
		int s = 0;
		for (int i = 0; i < nums.length; i++) {
			s = s + nums[i];
			nums[i] = s;
		}
		return nums;
	}
}
