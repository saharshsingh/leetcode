package org.saharsh.leetcode.daily.medium;

/**
 * A conveyor belt has packages that must be shipped from one port to another
 * within days days.
 * <p>
 * The ith package on the conveyor belt has a weight of weights[i]. Each day, we
 * load the ship with packages on the conveyor belt (in the order given by
 * weights). We may not load more weight than the maximum weight capacity of the
 * ship.
 * <p>
 * Return the least weight capacity of the ship that will result in all the
 * packages on the conveyor belt being shipped within days days.
 *
 * @author saharshsingh
 *
 */
public class N001011_CapacityToShipWithinDDays {

	public static int shipWithinDays(int[] weights, int days) {

		// Find max and total
		// max = max element in weights array
		// total = sum of all elements in weight array
		int max = 0, total = 0, capacity = 0;
		for (final int w : weights) {
			max = w > max ? w : max;
			total += w;
		}

		// Perform binary search for minimum capacity, knowing it has to be between max
		// element and sum of all elements
		while (max < total) {

			capacity = max + ((total - max) / 2);

			// figure out days needed at this capacity
			int daysNeeded = 0;
			for (int i = 0; i < weights.length; daysNeeded++) {
				int dayload = 0;
				while (i < weights.length && capacity - dayload >= weights[i]) {
					dayload += weights[i++];
				}
			}

			if (daysNeeded <= days) {
				// we might be able to do better
				// lower search window to up to current guess
				total = capacity;
			} else {
				// we have to do better
				// focus search window to right of current guess
				max = capacity + 1;
			}
		}

		return max;

	}

}
