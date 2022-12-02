package com.altafjava.leetcode.linkedlist;

import java.util.Arrays;
import com.altafjava.leetcode.util.ListNode;
import com.altafjava.leetcode.util.ListNodeUtil;

/*
You are given two integers m and n, which represent the dimensions of a matrix. You are also given the head of a linked list of integers.
Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the
top-left of the matrix. If there are remaining empty spaces, fill them with -1. Return the generated matrix.

Example 1:
Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
Explanation: The diagram above shows how the values are printed in the matrix.
Note that the remaining spaces in the matrix are filled with -1.

Example 2:
Input: m = 1, n = 4, head = [0,1,2]
Output: [[0,1,2,-1]]
Explanation: The diagram above shows how the values are printed from left to right in the matrix.
The last space in the matrix is set to -1.

Constraints:
    1 <= m, n <= 105
    1 <= m * n <= 105
    The number of nodes in the list is in the range [1, m * n].
    0 <= Node.val <= 1000
*/
public class SpiralMatrix {

	public static void main(String[] args) {
//		int m = 5, n = 5, arr[] = { 3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
//		int m = 3, n = 5, arr[] = { 3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0 };
		int m = 1, n = 4, arr[] = { 0, 1, 2 };
		ListNode head = ListNodeUtil.createListNode(arr);
		ListNodeUtil.print(head);
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		int[][] matrix = spiralMatrix.spiralMatrix(m, n, head);
		for (int[] ar : matrix) {
			for (int x : ar) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public int[][] spiralMatrix(int m, int n, ListNode head) {
		int[][] matrix = new int[m][n];
		for (int[] arr : matrix) {
			Arrays.fill(arr, -1);
		}
		int i = 0, j = 0, directions[] = { 0, 1, 0, -1, 0 }, currentDir = 0, repeat = 0;
		while (head != null) {
			matrix[i][j] = head.val;
			int dirI = directions[currentDir];
			int dirJ = directions[currentDir + 1];
			int ci = i + dirI;
			int cj = j + dirJ;
			if (dirI == -1 && dirJ == 0 && ci == cj) {
				repeat++;
			}
			if (cj >= n - repeat || ci >= m - repeat || cj - repeat < 0 || ci - repeat < 0) {
				currentDir = (currentDir + 1) % 4;
				dirI = directions[currentDir];
				dirJ = directions[currentDir + 1];
			}
			i = i + dirI;
			j = j + dirJ;
			head = head.next;
		}
		return matrix;
	}

}
