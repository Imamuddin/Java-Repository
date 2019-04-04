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
		int register[] = new int[a.length];
		for(int i:a){
			register[i]=1;
		}
		
		//for(int)
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 10, 9, 7, 15, 21 };
		sortInteger(a);
		System.out.println("after sorting the array::" + Arrays.toString(a));
	}

}
