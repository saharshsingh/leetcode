package org.saharsh.leetcode.top.easy;

/**
 * Write a function that takes the binary representation of an unsigned integer
 * and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * @author saharshsingh
 *
 */
public class N000191_NumberOfOneBits {
	public static int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count += n & 0x1;
			n = n >>> 1;
		}
		return count;
	}
}
