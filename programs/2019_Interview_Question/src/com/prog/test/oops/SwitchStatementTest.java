package com.prog.test.oops;



public class SwitchStatementTest {

	public static void testSwitch(String test) {
		switch (test) {
		case "Not Equal":
			System.out.println("Not Equal");
		case "Equal":
			System.out.println("Equal");
			break;
		default:
			System.out.println("No match");
		}
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "Equal";

		testSwitch(test);

	}

}
