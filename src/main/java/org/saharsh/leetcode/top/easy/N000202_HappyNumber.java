package org.saharsh.leetcode.top.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * <li>Starting with any positive integer, replace the number by the sum of the
 * squares of its digits.</li>
 * <li>Repeat the process until the number equals 1 (where it will stay), or it
 * loops endlessly in a cycle which does not include 1.</li>
 * <li>Those numbers for which this process ends in 1 are happy.</li>
 * <p>
 * Return true if n is a happy number, and false if not.
 *
 * @author saharshsingh
 *
 */
public class N000202_HappyNumber {
	public static boolean isHappy(int n) {
		final Set<Integer> seen = new HashSet<>();
		while (n != 1 && !seen.contains(n)) {
			seen.add(n);
			int happySum = 0;
			while (n != 0) {
				happySum += (n % 10) * (n % 10);
				n = n / 10;
			}
			n = happySum;
		}
		return n == 1;
	}
}
