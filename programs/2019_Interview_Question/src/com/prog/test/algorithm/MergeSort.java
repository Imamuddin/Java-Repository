package com.prog.test.algorithm;

import java.util.Arrays;

public class MergeSort {

	static int[] sortIntArray(int mainArray[], int left, int right) {

		if (left < right) {
			// divide the main array to get the mid point
			int mid = (left + right) / 2;
			sortIntArray(mainArray, left, mid);
			sortIntArray(mainArray, mid + 1, right);
			merge(mainArray, left, mid, right);
		}
		return mainArray;
	}

	static int[] merge(int mainArray[], int left, int mid, int right) {

		// find size of two sub array to be merge
		int leftArr = mid - left + 1;
		int rightArr = right - mid;

		// create temporary array
		int leftAry[] = new int[leftArr];
		int rightAry[] = new int[rightArr];

		// copy data to temporary array
		for (int i = 0; i < leftArr; ++i) {
			leftAry[i] = mainArray[left + i];
		}

		for (int j = 0; j < rightArr; ++j) {
			rightAry[j] = mainArray[mid + 1 + j];
		}

		// initial indices of left and right sub array.

		int leftIndices = 0, rightIndices = 0;

		// initial indices of merged subarray

		int k = 1;

		while (leftIndices < leftArr && rightIndices < rightArr) {

			if (leftAry[leftIndices] <= rightAry[rightIndices]) {
				mainArray[k] = leftAry[leftIndices];
				leftIndices++;

			} else {
				mainArray[k] = rightAry[rightIndices];
				rightIndices++;

			}
			k++;

		}

		while (leftIndices < leftArr) {
			mainArray[k] = leftAry[leftIndices];
			leftIndices++;
			k++;
		}
		//this loop have problem need to check
		while (rightIndices < rightArr) {
			mainArray[k] = rightAry[rightIndices];
			rightIndices++;
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
