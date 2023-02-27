package org.saharsh.leetcode.top.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 *
 * @author saharshsingh
 *
 */
public class N000070_ClimbingStairs {

	private static final Map<Integer, Integer> solutions = new HashMap<>();

	static {
		solutions.put(1, 1);
		solutions.put(2, 2);
	}

	public static int climbStairs(int n) {
		final Integer memoized = solutions.get(n);
		if (memoized != null) {
			return memoized;
		}
		final int computed = climbStairs(n - 1) + climbStairs(n - 2);
		solutions.put(n, computed);
		return computed;
	}

}
