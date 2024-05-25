package org.saharsh.leetcode.top.medium;

public class N000080_RemoveDuplicatesFromSortedArrayII {
	public static int removeDuplicates(int[] nums) {
		int writeIndex = Math.min(nums.length, 2);
		for (int readIndex = 2; readIndex < nums.length; readIndex++) {
			if (nums[readIndex] != nums[writeIndex - 2]) {
				nums[writeIndex++] = nums[readIndex];
			}
		}
		return writeIndex;
	}
}
