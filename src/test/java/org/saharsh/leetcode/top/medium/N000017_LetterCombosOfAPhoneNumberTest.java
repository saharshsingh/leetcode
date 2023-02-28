package org.saharsh.leetcode.top.medium;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class N000017_LetterCombosOfAPhoneNumberTest {

	@Test
	public void test_case_one() {
		final List<String> combos = N000017_LetterCombosOfAPhoneNumber.letterCombinations("23");
		Assert.assertEquals(9, combos.size());
		int i = 0;
		Assert.assertEquals("ad", combos.get(i++));
		Assert.assertEquals("ae", combos.get(i++));
		Assert.assertEquals("af", combos.get(i++));
		Assert.assertEquals("bd", combos.get(i++));
		Assert.assertEquals("be", combos.get(i++));
		Assert.assertEquals("bf", combos.get(i++));
		Assert.assertEquals("cd", combos.get(i++));
		Assert.assertEquals("ce", combos.get(i++));
		Assert.assertEquals("cf", combos.get(i++));
	}

	@Test
	public void test_case_two() {
		final List<String> combos = N000017_LetterCombosOfAPhoneNumber.letterCombinations("");
		Assert.assertEquals(0, combos.size());
	}

	@Test
	public void test() {
		final List<String> combos = N000017_LetterCombosOfAPhoneNumber.letterCombinations("2");
		Assert.assertEquals(3, combos.size());
		int i = 0;
		Assert.assertEquals("a", combos.get(i++));
		Assert.assertEquals("b", combos.get(i++));
		Assert.assertEquals("c", combos.get(i++));
	}

}
