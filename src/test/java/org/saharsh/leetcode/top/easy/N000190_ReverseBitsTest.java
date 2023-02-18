package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000190_ReverseBitsTest {

	@Test
	public void test_00000010100101000001111010011100() {
		// in : 0000 0010 1001 0100 0001 1110 1001 1100
		// out: 0011 1001 0111 1000 0010 1001 0100 0000
		Assert.assertEquals(0x39782940, N000190_ReverseBits.reverseBits(0x02941E9C));
	}

	@Test
	public void test_0xCCCCCCCC() {
		Assert.assertEquals(0x33333333, N000190_ReverseBits.reverseBits(0xCCCCCCCC));
	}

}
