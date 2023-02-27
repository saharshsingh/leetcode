package org.saharsh.leetcode.top.medium;

/**
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i,
 * height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 *
 * @author saharshsingh
 *
 */
public class N000007_ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		while (left < right) {
			final int area = (right - left) * Math.min(height[left], height[right]);
			maxArea = area > maxArea ? area : maxArea;
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
}
