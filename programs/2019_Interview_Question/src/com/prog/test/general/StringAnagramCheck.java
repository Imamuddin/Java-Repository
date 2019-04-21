package com.prog.test.general;

import java.util.Arrays;

public class StringAnagramCheck {

	public static boolean isStringAnagram(char[] str1, char[] str2) {
		if (str1.length != str2.length)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < str1.length && i < str2.length; i++) {
			if (str1[i] != str2[i])
				return false;

		}

		return true;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] str1 = { 't', 'e', 's', 't' };
		char[] str2 = { 't', 's', 't', 's' };
		System.out.println("Are given string is anagram::"
				+ isStringAnagram(str1, str2));
	}

}
