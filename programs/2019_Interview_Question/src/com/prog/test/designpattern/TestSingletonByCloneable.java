package com.prog.test.designpattern;

public class TestSingletonByCloneable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusinessLogicSingleton s1 = BusinessLogicSingleton.getSingletonObj();
		System.out.println("Hash code of s1::" + s1.hashCode());
		try {
			BusinessLogicSingleton s2 = (BusinessLogicSingleton) s1.clone();
			System.out.println("Hash code of s2::" + s2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
