package org.saharsh.leetcode.top.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * <ul>
 * <li><code>answer[i] == "FizzBuzz"</code> if <code>i</code> is divisible by
 * <code>3</code> and <code>5</code>.</li>
 * <li><code>answer[i] == "Fizz"</code> if <code>i</code> is divisible by
 * <code>3</code>.</li>
 * <li><code>answer[i] == "Buzz"</code> if <code>i</code> is divisible by
 * <code>5</code>.</li>
 * <li><code>answer[i] == i</code> (as a string) if none of the above conditions
 * are true.</li>
 * </ul>
 *
 * @author saharshsingh
 *
 */
public class N000412_FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		final List<String> answer = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				answer.add("FizzBuzz");
			} else if (i % 3 == 0) {
				answer.add("Fizz");
			} else if (i % 5 == 0) {
				answer.add("Buzz");
			} else {
				answer.add(String.format("%d", i));
			}
		}
		return answer;
	}
}
