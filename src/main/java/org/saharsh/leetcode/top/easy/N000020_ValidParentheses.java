package org.saharsh.leetcode.top.easy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * <p>
 * Open brackets must be closed in the correct order.
 * <p>
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * @author saharshsingh
 *
 */
public class N000020_ValidParentheses {

	public static boolean isValid(String s) {
		final Deque<Character> openStack = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			final Character p = s.charAt(i);
			if (isOpener(p)) {
				openStack.addFirst(p);
			} else if (openStack.isEmpty() || isInvalidClose(openStack.removeFirst(), p)) {
				return false;
			}
		}
		return openStack.isEmpty();
	}

	private static boolean isOpener(char p) {
		switch (p) {
		case '(':
		case '[':
		case '{':
			return true;
		default:
			return false;
		}
	}

	private static boolean isInvalidClose(char opener, char closer) {
		switch (opener) {
		case '(':
			return closer != ')';
		case '[':
			return closer != ']';
		case '{':
			return closer != '}';
		default:
			return true;
		}
	}

}
