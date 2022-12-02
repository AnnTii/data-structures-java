package com.altafjava.leetcode.array;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]

Constraints:
    1 <= n <= 500
    nums.length == 2n
    1 <= nums[i] <= 10^3
*/
public class ShuffleArray {
	public static void main(String[] args) {
		ShuffleArray shuffleArray = new ShuffleArray();
//		int[] nums = { 2, 5, 1, 3, 4, 7 };
//		int[] nums = { 1, 1, 2, 2 };
//		int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int[] nums = { 643, 84, 23, 282, 936, 464, 820, 812, 119, 883, 263, 137, 670, 534, 837, 667, 661, 356, 118, 893, 159, 286, 872, 20, 44, 42, 211, 698,
				266, 572, 323, 970, 376, 961, 582, 932, 870, 44, 867, 768, 985, 719, 623, 672, 507, 730, 660, 925, 470, 656, 446, 382, 893, 551, 183, 213, 385,
				602, 299, 10, 142, 155, 278, 342, 346, 809, 377, 736, 96, 347, 799, 636, 37, 43, 277, 168, 154, 598, 297, 370, 405, 562, 133, 301, 118, 490,
				749, 246, 957, 50, 316, 184, 878, 536, 747, 73, 310, 413, 856, 337, 307, 425, 112, 102, 575, 931, 493, 486, 346, 862, 818, 1000, 832, 352, 128,
				491, 119, 717, 510, 437, 39, 310, 344, 753, 704, 916, 160, 942, 171, 642, 579, 385, 826, 998, 655, 90, 68, 828, 87, 203, 768, 227, 63, 395, 9,
				101, 404, 570, 532, 297, 460, 943, 501, 808, 599, 732, 696, 223, 434, 86, 378, 226, 268, 600, 796, 171, 442, 197, 368, 118, 66, 842, 885, 874,
				719, 29, 925, 539, 463, 771, 694, 207, 122, 510, 408, 263, 213, 657, 44, 971, 817, 222, 639, 150, 108, 203, 470, 388, 371, 560, 847, 155, 108,
				611, 500, 152, 578, 416, 654, 697, 434, 899, 534, 508, 696, 940, 910, 331, 854, 511, 511, 651, 687, 896, 207, 556, 625, 954, 225, 10, 349, 723,
				986, 765, 921, 326, 838, 330, 37, 538, 152, 896, 264, 618, 803, 160, 863, 389, 597, 302, 736, 724, 827, 482, 68, 820, 87, 529, 890, 938, 41, 68,
				231, 134, 42, 308, 16, 778, 865, 460, 339, 883, 165, 820, 153, 890, 672, 472, 992, 381, 518, 392, 923, 543, 515, 35, 588, 93, 695, 814, 825,
				531, 777, 615, 79, 765, 437, 928, 773, 212 };
		int[] shuffle = shuffleArray.shuffle2(nums, nums.length / 2);
		for (int i = 0; i < shuffle.length; i++) {
			System.out.print(shuffle[i] + ",");
		}
	}

	public int[] shuffle(int[] nums, int n) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < n; i++) {
			arr[i * 2] = nums[i];
			arr[i * 2 + 1] = nums[i + n];
		}
		return arr;
	}

//	Assuming 1000 will be the max value in the given array as mentioned in the Constraints. Hence taking 1001 which is greater than 1000
	public int[] shuffle2(int[] nums, int n) {
		for (int i = 0; i < n; i++) {
			nums[i] = 1001 * nums[i + n] + nums[i];
		}
		for (int i = n - 1; i >= 0; i--) {
			nums[2 * i + 1] = nums[i] / 1001;
			nums[2 * i] = nums[i] % 1001;
		}
		return nums;
	}
}
