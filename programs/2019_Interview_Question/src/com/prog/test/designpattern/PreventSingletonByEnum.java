package com.prog.test.designpattern;

public enum PreventSingletonByEnum {
	INSTANCE;

	public void doDisplay() {
		System.out.println("Test Singleton by Enum");
	}

}
