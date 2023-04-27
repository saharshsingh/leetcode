package org.saharsh.leetcode.top.easy;

public class N000028_IndexOfFirstOccurrenceInString {

	public enum Approach {
		NAIVE, HASHING
	}

	public static Approach approach = Approach.NAIVE;

	public static int strStr(String haystack, String needle) {
		return approach == Approach.HASHING ? usingHashing(haystack, needle) : usingNaiveApproach(haystack, needle);
	}

	// O(nm) time complexity
	private static int usingNaiveApproach(String haystack, String needle) {
		final int hLen = haystack.length();
		final int nLen = needle.length();
		for (int h = 0; h + nLen <= hLen; h++) {
			for (int n = 0; n < nLen; n++) {
				if (haystack.charAt(h + n) != needle.charAt(n)) {
					break;
				}
				if (n + 1 == nLen) {
					return h;
				}
			}
		}
		return -1;
	}

	// slight improvement but still O(nm) worst case if lots of hash collisions. Can
	// be improved by improving the hashing function. See
	// https://en.wikipedia.org/wiki/Rabin%E2%80%93Karp_algorithm
	private static int usingHashing(String haystack, String needle) {

		final int hLen = haystack.length();
		final int nLen = needle.length();
		if (hLen < nLen) {
			return -1;
		}

		// calculate needle hash
		int nHash = 0;
		for (int i = 0; i < needle.length(); i++) {
			nHash += needle.charAt(i);
		}

		// initialize hWinHash
		int hWinHash = 0;
		int h = 0;
		for (; h < nLen - 1; h++) {
			hWinHash += haystack.charAt(h);
		}

		// iterate through rest of haystack maintaining a rolling hash of needle size
		// window. Only compare window to needle if hashes match.
		for (; h < hLen; h++) {
			hWinHash += haystack.charAt(h);
			final int h0 = h + 1 - nLen;
			if (nHash == hWinHash) {
				for (int i = 0; i < nLen; i++) {
					if (needle.charAt(i) != haystack.charAt(h0 + i)) {
						break;
					}
					if (i + 1 == nLen) {
						return h0;
					}
				}
			}
			hWinHash -= haystack.charAt(h0);
		}

		return -1;

	}

}
