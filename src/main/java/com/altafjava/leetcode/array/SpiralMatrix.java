package com.altafjava.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 10
    -100 <= matrix[i][j] <= 100
*/
public class SpiralMatrix {
	public static void main(String[] args) {
		SpiralMatrix spiralMatrix = new SpiralMatrix();
//		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		List<Integer> list = spiralMatrix.spiralOrder(matrix);
		for (int a : list) {
			System.out.print(a + " ");
		}
	}

	public List<Integer> spiralOrder(int[][] matrix) {
//		We use directions to right->down->left->up and then repeat. Repeat will be counted using `repeat` variable. When we bump into an edge, we change the direction.
		List<Integer> list = new ArrayList<>();
		int i = 0, j = 0, currentDir = 0, directions[] = { 0, 1, 0, -1, 0 }, repeat = 0;
		int x = matrix.length;
		int y = matrix[0].length;
		int size = x * y;
		while (size > 0) {
			list.add(matrix[i][j]);
			int dirI = directions[currentDir];
			int dirJ = directions[currentDir + 1];
			int ni = i + dirI;
			int nj = j + dirJ;
			if (dirI == -1 && dirJ == 0 && ni == nj) {
				repeat++;
			}
			if (nj >= y - repeat || ni >= x - repeat || nj - repeat < 0 || ni - repeat < 0) {
				currentDir = (currentDir + 1) % 4;
				dirI = directions[currentDir];
				dirJ = directions[currentDir + 1];
			}
			i = i + dirI;
			j = j + dirJ;
			size--;
		}
		return list;
	}
}
