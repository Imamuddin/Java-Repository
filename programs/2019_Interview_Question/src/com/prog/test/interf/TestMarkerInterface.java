package com.prog.test.interf;

public class TestMarkerInterface extends MarkerClass implements
		CustMarkerInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMarkerInterface a = new TestMarkerInterface();
		try {
			a.testMarker();

		} catch (MyException e) {
			System.out.println(e);
		}

	}

}
