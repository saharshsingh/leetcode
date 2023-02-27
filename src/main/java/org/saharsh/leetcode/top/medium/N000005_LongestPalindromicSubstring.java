package org.saharsh.leetcode.top.medium;

/**
 * Given a string <code>s</code>, return the longest palindromic substring in
 * <code>s</code>.
 *
 * @author saharshsingh
 *
 */
public class N000005_LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {

		// a single character is trivially a palindrome
		// so default the result to just be the first character
		String result = s.substring(0, 1);

		// we will look for longer palindromes by using each character in the string as
		// the center for a palindrome and seeing how big we can grow each of those
		// palindromes. Since the palindrome with first character at center cannot grow
		// larger than the one character, we will start with the second character
		for (int i = 1; i < s.length(); i++) {

			// for odd length palindromes, the current character alone will be the center
			result = captureLongerPalindrome(s, i, i, result);

			// even length palindromes will have two characters in center. we will use the
			// current character and the preceding character as the center
			result = captureLongerPalindrome(s, i - 1, i, result);

		}

		return result;
	}

	private static String captureLongerPalindrome(String s, int left, int right, String current) {

		// relevant for the even length case. if the center characters don't equal we
		// don't have a palindrome. so the current known longest palindrome should be
		// returned
		if (s.charAt(left) != s.charAt(right)) {
			return current;
		}

		// we know the current left and right indices border a palindrome. keep
		// expanding the
		// border as long as the palindrome condition is met
		while (left > 0 && right < s.length() - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
			left--;
			right++;
		}

		// we have the longest palindrome using the specified center. if it beats the
		// previously known longest palindrome, return this as the new longest
		// palindrome
		if ((right - left + 1) > current.length()) {
			return s.substring(left, right + 1);
		}

		// otherwise, keep the previously known one
		return current;

	}

}
