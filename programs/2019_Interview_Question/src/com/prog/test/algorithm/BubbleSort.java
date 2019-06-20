package com.prog.test.algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void sortInt(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("after sorting arr::" + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 5, 9, 4, 3, 6 };
		sortInt(arr);

	}

}
