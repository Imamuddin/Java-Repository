package com.prog.test.general;

import java.util.Arrays;

public class SortInteger {

	public static void sortInteger(int a[]) {
		int length = a.length;
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
	}

	public static void missingNumber(int a[]) {
		// created array of size all elements
		int register[] = new int[a.length + 2];
		for (int i = 0; i < register.length; i++) {

		}
	}
//binary search approach
	public static int missingNumberFromSortedArray(int numbers[]) {
		if (numbers == null || numbers.length <= 0) {
			throw new IllegalArgumentException(
					"Null or Empty array not permitted");
		}
		int left = 0;
		int right = numbers.length - 1;
		while (left <= right) {
			int middle = (right + left) >> 1;
			if (numbers[middle] != middle) {
				if (middle == 0 || numbers[middle - 1] == middle - 1) {
					return middle;
				}
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		throw new RuntimeException("No missing number");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int a[] = { 10, 9, 7, 15, 21 }; sortInteger(a);
		 * System.out.println("after sorting the array::" + Arrays.toString(a));
		 */
		System.out.println("Test #1 : Missing number in sorted array ");
		int[] input = new int[] { 1, 2, 3, 4, 6 };
		int missing = missingNumberFromSortedArray(input);
		System.out.println("Missing number from array : "
				+ Arrays.toString(input) + " is : " + missing);
	}

}
