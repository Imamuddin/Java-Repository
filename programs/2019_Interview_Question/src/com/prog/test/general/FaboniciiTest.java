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
	static int fib(int num) {
		if(num==0) return 0;
		else if (num==1) return 1;
		
		int[] fibArray = new int[num];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for (int i = 2; i < num; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}

		return fibArray[num-1] +fibArray[num-2];

	}

	public static void main(String[] args) {
		int input = 5;
		System.out.println("Print fabonicci of the number::" + fabonicciPrint(input));

		System.out.println("Print fabonicci of the number by dynamic programming ::" + fib(input));

	}

}
