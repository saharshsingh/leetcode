package org.saharsh.leetcode.top.easy;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Note:
 * <ul>
 * <li>Note that in some languages, such as Java, there is no unsigned integer
 * type. In this case, both input and output will be given as a signed integer
 * type. They should not affect your implementation, as the integer's internal
 * binary representation is the same, whether it is signed or unsigned.</li>
 * <li>In Java, the compiler represents the signed integers using 2's complement
 * notation. Therefore, in Example 2 above, the input represents the signed
 * integer -3 and the output represents the signed integer -1073741825.</li>
 * </ul>
 *
 * @author saharshsingh
 *
 */
public class N000190_ReverseBits {
	public static int reverseBits(int n) {
		n = ((n & 0xFFFF0000) >>> 16) | ((n & 0x0000FFFF) << 16);
		n = ((n & 0xFF00FF00) >>> 8) | ((n & 0x00FF00FF) << 8);
		n = ((n & 0xF0F0F0F0) >>> 4) | ((n & 0x0F0F0F0F) << 4);
		n = ((n & 0xCCCCCCCC) >>> 2) | ((n & 0x33333333) << 2);
		return ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
	}
}
