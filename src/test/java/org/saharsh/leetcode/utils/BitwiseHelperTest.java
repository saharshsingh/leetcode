package org.saharsh.leetcode.utils;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseHelperTest {

	@Test
	public void test_0xFFFFFFFF() {
		Assert.assertEquals("1111 1111 1111 1111 1111 1111 1111 1111", BitwiseHelper.asBinaryString(0xFFFFFFFF));
	}

}
