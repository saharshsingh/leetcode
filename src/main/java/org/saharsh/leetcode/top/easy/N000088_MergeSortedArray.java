package org.saharsh.leetcode.top.easy;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 *
 * @author saharshsingh
 *
 */
public class N000088_MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m + n - 1, n1 = m - 1, n2 = n - 1;
		while (i >= 0) {
			if (n1 < 0) {
				nums1[i--] = nums2[n2--];
			} else if (n2 < 0) {
				nums1[i--] = nums1[n1--];
			} else if (nums1[n1] > nums2[n2]) {
				nums1[i--] = nums1[n1--];
			} else {
				nums1[i--] = nums2[n2--];
			}
		}

	}

}
