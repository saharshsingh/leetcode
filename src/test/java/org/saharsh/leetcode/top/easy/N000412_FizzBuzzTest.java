package org.saharsh.leetcode.top.easy;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class N000412_FizzBuzzTest {

	@Test
	public void test_case_one() {

		final List<String> answer = N000412_FizzBuzz.fizzBuzz(3);

		Assert.assertEquals(3, answer.size());

		Assert.assertEquals("1", answer.get(0));
		Assert.assertEquals("2", answer.get(1));
		Assert.assertEquals("Fizz", answer.get(2));

	}

	@Test
	public void test_case_two() {

		final List<String> answer = N000412_FizzBuzz.fizzBuzz(5);

		Assert.assertEquals(5, answer.size());

		Assert.assertEquals("1", answer.get(0));
		Assert.assertEquals("2", answer.get(1));
		Assert.assertEquals("Fizz", answer.get(2));
		Assert.assertEquals("4", answer.get(3));
		Assert.assertEquals("Buzz", answer.get(4));

	}

	@Test
	public void test_case_three() {

		final List<String> answer = N000412_FizzBuzz.fizzBuzz(15);

		Assert.assertEquals(15, answer.size());

		Assert.assertEquals("1", answer.get(0));
		Assert.assertEquals("2", answer.get(1));
		Assert.assertEquals("Fizz", answer.get(2));
		Assert.assertEquals("4", answer.get(3));
		Assert.assertEquals("Buzz", answer.get(4));
		Assert.assertEquals("Fizz", answer.get(5));
		Assert.assertEquals("7", answer.get(6));
		Assert.assertEquals("8", answer.get(7));
		Assert.assertEquals("Fizz", answer.get(8));
		Assert.assertEquals("Buzz", answer.get(9));
		Assert.assertEquals("11", answer.get(10));
		Assert.assertEquals("Fizz", answer.get(11));
		Assert.assertEquals("13", answer.get(12));
		Assert.assertEquals("14", answer.get(13));
		Assert.assertEquals("FizzBuzz", answer.get(14));

	}

}
