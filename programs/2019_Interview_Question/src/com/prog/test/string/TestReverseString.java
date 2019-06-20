package com.prog.test.string;

import java.util.Stack;
import java.util.StringTokenizer;

public class TestReverseString {

	public static void reverseStrBySb(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reverseString = sb.reverse().toString();
		System.out.println("after reverse string :: " + reverseString);

	}

	public static void revrseByStrTokenizer(String str) {
		StringTokenizer st = new StringTokenizer(str);
		Stack stk = new Stack();
		while (st.hasMoreTokens()) {
			stk.push(st.nextToken());
		}

		while (!stk.empty()) {
			System.out.print(stk.pop() + " ");
		}
	}

	public static void main(String[] args) {
		String str = "Tes";
		String str1 = "Hello Team";
		reverseStrBySb(str);
		revrseByStrTokenizer(str1);
	}

}
