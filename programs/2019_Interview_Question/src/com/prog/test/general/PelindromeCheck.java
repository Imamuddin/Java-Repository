package com.prog.test.general;

public class PelindromeCheck {
	public static void checkPelindrome(int num) {
		int origNum = num;
		int sum = 0;
		int r;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (origNum == sum) {
			System.out.println("its pelindrome");
		} else {
			System.out.println("its not a pelindrome");
		}

	}

	// reverse string using recursive approach
	public static void reverseString(String str) {
		if ((str == null) || (str.length() <= 1)) {
			System.out.println(str);
			return;

		}
		System.out.print(str.charAt(str.length() - 1));
		reverseString(str.substring(0, str.length() - 1));

	}

	public static void main(String[] args) {
		checkPelindrome(121);
		checkPelindrome(456);
		reverseString("Test");

	}

}
