package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000387_FirstUniqueCharacterInAStringTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(0, N000387_FirstUniqueCharacterInAString.firstUniqChar("leetcode"));
	}

	@Test
	public void test_case_twp() {
		Assert.assertEquals(2, N000387_FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(-1, N000387_FirstUniqueCharacterInAString.firstUniqChar("aabb"));
	}

}
