package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000070_ClimbingStairsTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(2, N000070_ClimbingStairs.climbStairs(2));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals(3, N000070_ClimbingStairs.climbStairs(3));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(8, N000070_ClimbingStairs.climbStairs(5));
	}

}
