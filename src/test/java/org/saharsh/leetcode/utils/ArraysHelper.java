package org.saharsh.leetcode.utils;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

public class ArraysHelper {

	/**
	 * Asserts that the given array contains ONLY the provided elements, nothing
	 * more nothing else.
	 * <p>
	 * NOTE: Order of elements is ignored
	 *
	 * @param actual   - array being verified
	 * @param expected - Exactly each of the elements expected to be present in
	 *                 array
	 */
	public static void assertArrayOnlyContains(int[] actual, int... expected) {

		// must equal in size
		Assert.assertEquals("Expected array length to be " + expected.length, expected.length, actual.length);

		// next create map with expected counts for each expected element
		final Map<Integer, Integer> elements = new HashMap<>();
		for (final int e : expected) {
			elements.put(e, 1 + elements.getOrDefault(e, 0));
		}

		// next mark down how many times we see each element
		for (final int a : actual) {
			final Integer count = elements.get(a);
			Assert.assertTrue("Expected to find another occurrence of " + a, count != null && count > 0);
			elements.put(a, count - 1);
		}

	}

}
