package org.saharsh.leetcode.top.medium;

public class N000189_RotateArray {
	public static void rotate(int[] nums, int k) {
		final int n = nums.length;
		final int kModN = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, kModN - 1);
		reverse(nums, kModN, n - 1);
	}

	private static void reverse(int[] nums, int start, int end) {
		for (int left = start, right = end; left < right; left++, right--) {
			final int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
		}
	}
}
