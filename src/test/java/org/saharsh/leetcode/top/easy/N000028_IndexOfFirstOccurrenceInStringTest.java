package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;
import org.saharsh.leetcode.top.easy.N000028_IndexOfFirstOccurrenceInString.Approach;

public class N000028_IndexOfFirstOccurrenceInStringTest {

	@Test
	public void test_case_one() {

		for (final Approach approach : Approach.values()) {

			// Arrange
			N000028_IndexOfFirstOccurrenceInString.approach = approach;
			final String haystack = "sadbutsad";
			final String needle = "sad";

			// Act
			final int index = N000028_IndexOfFirstOccurrenceInString.strStr(haystack, needle);

			// Assert
			Assert.assertEquals(0, index);

		}

	}

	@Test
	public void test_case_two() {

		for (final Approach approach : Approach.values()) {

			// Arrange
			N000028_IndexOfFirstOccurrenceInString.approach = approach;
			final String haystack = "leetcode";
			final String needle = "leeto";

			// Act
			final int index = N000028_IndexOfFirstOccurrenceInString.strStr(haystack, needle);

			// Assert
			Assert.assertEquals(-1, index);

		}

	}

	@Test
	public void test_case_three() {

		for (final Approach approach : Approach.values()) {

			// Arrange
			N000028_IndexOfFirstOccurrenceInString.approach = approach;
			final String haystack = "mississippi";
			final String needle = "issip";

			// Act
			final int index = N000028_IndexOfFirstOccurrenceInString.strStr(haystack, needle);

			// Assert
			Assert.assertEquals(4, index);

		}

	}

	@Test
	public void test_case_four() {

		for (final Approach approach : Approach.values()) {

			// Arrange
			N000028_IndexOfFirstOccurrenceInString.approach = approach;
			final String haystack = "aaa";
			final String needle = "aaaa";

			// Act
			final int index = N000028_IndexOfFirstOccurrenceInString.strStr(haystack, needle);

			// Assert
			Assert.assertEquals(-1, index);

		}

	}

}
