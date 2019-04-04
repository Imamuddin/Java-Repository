package com.prog.test.general;

import java.util.Arrays;

public class FaboniciiTest {
	// using recursion print the fabonicci series
	static int fabonicciPrint(int num) {
		if (num <= 1)
			return 1;
		return fabonicciPrint(num - 1) + fabonicciPrint(num - 2);
	}

	// using dynamic programming print the fabonicci series
	static int[] fib(int num) {
		int[] fibArray = new int[num + 2];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for (int i = 2; i <= num; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}

		return fibArray;

	}

	public static void main(String[] args) {
		int input = 5;
		System.out.println("Print fabonicci of the number::" + fabonicciPrint(input));

		System.out.println("Print fabonicci of the number by dynamic programming ::" + Arrays.toString(fib(input)));

	}

}
