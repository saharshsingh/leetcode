package org.saharsh.leetcode.utils;

public class BitwiseHelper {
	public static String asBinaryString(int num) {
		final String bs = String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0");
		final StringBuilder withSpaces = new StringBuilder();
		for (int i = 0; i < bs.length(); i = i + 4) {
			if (i != 0) {
				withSpaces.append(" ");
			}
			withSpaces.append(bs.substring(i, i + 4));
		}
		return withSpaces.toString();
	}
}
