package com.prog.test.general;

public class ClimbingStairs {

	static int findWays(int input) {
		return fibonicci(input + 1);

	}

	static int fibonicci(int number) {

		if (number <= 1)
			return number;
		System.out.println("next number" +number);
		return fibonicci(number - 1) + fibonicci(number - 2);

	}

	public static void main(String[] args) {
		int stairs = 4;
		System.out.println("Number of ways to climbed :: " + findWays(stairs));

	}

}
