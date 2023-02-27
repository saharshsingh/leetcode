package org.saharsh.leetcode.daily.medium;

import org.junit.Assert;
import org.junit.Test;

public class N001011_CapacityToShipWithinDDaysTest {

	@Test
	public void test_case_one() {

		// Arrange
		final int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		final int days = 5;

		// Act
		final int minCapacity = N001011_CapacityToShipWithinDDays.shipWithinDays(weights, days);

		// Assert
		Assert.assertEquals(15, minCapacity);

	}

	@Test
	public void test_case_two() {

		// Arrange
		final int[] weights = { 3, 2, 2, 4, 1, 4 };
		final int days = 3;

		// Act
		final int minCapacity = N001011_CapacityToShipWithinDDays.shipWithinDays(weights, days);

		// Assert
		Assert.assertEquals(6, minCapacity);

	}

	@Test
	public void test_case_three() {

		// Arrange
		final int[] weights = { 1, 2, 3, 1, 1 };
		final int days = 4;

		// Act
		final int minCapacity = N001011_CapacityToShipWithinDDays.shipWithinDays(weights, days);

		// Assert
		Assert.assertEquals(3, minCapacity);

	}

}
