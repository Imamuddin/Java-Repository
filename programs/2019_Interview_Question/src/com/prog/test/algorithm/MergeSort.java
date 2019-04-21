package com.prog.test.algorithm;

import java.util.Arrays;

public class MergeSort {

	static int[] sortIntArray(int mainArray[], int l, int right) {

		if (l < right) {
			// divide the main array to get the mid point
			int mid = (l + right) / 2;
			sortIntArray(mainArray, l, mid);
			sortIntArray(mainArray, mid + 1, right);
			merge(mainArray, l, mid, right);
		}
		return mainArray;
	}

	static int[] merge(int mainArray[], int l, int mid, int right) {

		// find size of two sub array to be merge
		int leftArr = mid - l + 1;
		int rightArr = right - mid;

		// create temporary array
		int leftAry[] = new int[leftArr];
		int rightAry[] = new int[rightArr];

		// copy data to temporary array
		for (int i = 0; i < leftArr; i++) {
			leftAry[i] = mainArray[l + i];
		}

		for (int j = 0; j < rightArr; j++) {
			rightAry[j] = mainArray[mid + 1 + j];
		}

		// initial indices of left and right sub array.

		int i = 0, j = 0;

		// initial indices of merged subarray

		int k = 1;

		while (i < leftArr && j < rightArr) {

			if (leftAry[i] <= rightAry[j]) {
				mainArray[k] = leftAry[i];
				i++;

			} else {
				mainArray[k] = rightAry[j];
				j++;

			}
			k++;

		}

		while (i < leftArr) {
			mainArray[k] = leftAry[i];
			i++;
			k++;
		}
		//this loop have problem need to check
		while (j < rightArr) {
			mainArray[k] = rightAry[j];
			j++;
			k++;
		}

		return mainArray;

	}

	public static void main(String[] args) {
		int mainArray[] = { 6, 8, 7, 5, 4 };
		mainArray = sortIntArray(mainArray, 0, mainArray.length-1);
		System.out.println("after sorting array is ::"
				+ Arrays.toString(mainArray));

	}

}
