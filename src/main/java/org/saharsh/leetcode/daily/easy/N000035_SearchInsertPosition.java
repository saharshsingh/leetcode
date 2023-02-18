package org.saharsh.leetcode.daily.easy;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * @author saharshsingh
 *
 */
public class N000035_SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			final int index = low + ((high - low) / 2);
			if (nums[index] == target) {
				return index;
			}
			if (nums[index] < target) {
				low = index + 1;
			} else {
				high = index - 1;
			}
		}
		return low;
	}

}
