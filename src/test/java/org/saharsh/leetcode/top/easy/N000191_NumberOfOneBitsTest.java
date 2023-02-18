package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000191_NumberOfOneBitsTest {

	@Test
	public void test_00000000000000000000000000001011() {
		Assert.assertEquals(3, N000191_NumberOfOneBits.hammingWeight(0x0000000B));
	}

	@Test
	public void test_11111111111111111111111111111101() {
		Assert.assertEquals(31, N000191_NumberOfOneBits.hammingWeight(0xFFFFFFFD));
	}

}
