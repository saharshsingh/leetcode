package org.saharsh.leetcode.top.easy;

/**
 * Given a string columnTitle that represents the column title as appears in an
 * Excel sheet, return its corresponding column number.
 * <p>
 * <ul>
 * <li>A -> 1</li>
 * <li>B -> 2</li>
 * <li>C -> 3</li>
 * <li>...</li>
 * <li>Z -> 26</li>
 * <li>AA -> 27</li>
 * <li>AB -> 28</li>
 * <li>...</li>
 * </ul>
 *
 * @author saharshsingh
 *
 */
public class N000171_ExcelSheetColumnNumber {
	public static int titleToNumber(String columnTitle) {
		int value = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			value *= 26;
			value += columnTitle.charAt(i) - 'A' + 1;
		}
		return value;
	}
}
