package org.saharsh.leetcode.top.easy;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 *
 * @author saharshsingh
 *
 */
public class N000283_MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (j == i) {
					j++;
				} else {
					nums[j++] = nums[i];
					nums[i] = 0;
				}
			}
		}
	}
}
