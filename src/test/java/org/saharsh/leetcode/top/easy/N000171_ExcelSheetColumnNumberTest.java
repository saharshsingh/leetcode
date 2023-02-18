package org.saharsh.leetcode.top.easy;

import org.junit.Assert;
import org.junit.Test;

public class N000171_ExcelSheetColumnNumberTest {

	@Test
	public void test_case_one() {
		Assert.assertEquals(1, N000171_ExcelSheetColumnNumber.titleToNumber("A"));
	}

	@Test
	public void test_case_two() {
		Assert.assertEquals(28, N000171_ExcelSheetColumnNumber.titleToNumber("AB"));
	}

	@Test
	public void test_case_three() {
		Assert.assertEquals(701, N000171_ExcelSheetColumnNumber.titleToNumber("ZY"));
	}

}
