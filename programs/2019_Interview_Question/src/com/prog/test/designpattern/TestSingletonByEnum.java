package com.prog.test.designpattern;

public class TestSingletonByEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PreventSingletonByEnum sEnum = PreventSingletonByEnum.INSTANCE;
		PreventSingletonByEnum sEnum1 = PreventSingletonByEnum.INSTANCE;
		System.out.println("Hash code of sEnum::" + sEnum.hashCode());
		System.out.println("Hash code of sEnum1::" + sEnum1.hashCode());
		sEnum.doDisplay();

	}

}
