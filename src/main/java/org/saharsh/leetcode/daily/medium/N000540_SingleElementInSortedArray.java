package org.saharsh.leetcode.daily.medium;

/**
 * You are given a sorted array consisting of only integers where every element
 * appears exactly twice, except for one element which appears exactly once.
 * <p>
 * Return the single element that appears only once.
 * <p>
 * Your solution must run in <code>O(log n)</code> time and <code>O(1)</code>
 * space.
 *
 * @author saharshsingh
 *
 */
public class N000540_SingleElementInSortedArray {

	public static int singleNonDuplicate(int[] nums) {

		int low = 0;
		int high = nums.length - 1;

		while (low < high) {

			// First see if the element's pair is to the left or right
			int first = low + ((high - low) / 2);
			int second = -1;
			if (first < nums.length - 1 && nums[first] == nums[first + 1]) {
				second = first + 1;
			} else if (first > 0 && nums[first - 1] == nums[first]) {
				second = first;
				first = first - 1;
			}

			// element has no pair, so it has to be the single element
			if (second == -1) {
				return nums[first];
			}

			// check which side of array now has odd number of elements
			// narrow down search to that side
			if ((first - low) % 2 == 1) {
				high = first - 1;
			} else {
				low = second + 1;
			}

		}

		// We narrowed it down to one element, which must be the answer
		return nums[low];

	}

}
