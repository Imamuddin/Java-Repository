package com.prog.test.designpattern;

import java.io.Serializable;

public class BusinessLogicSingleton implements SingletonService, Cloneable,Serializable {

	private static BusinessLogicSingleton obj;
	private static int objCounter;

	public void display() {
		System.out.println("Singleton implementation.....");
	}

	private BusinessLogicSingleton() {

	}

	public static BusinessLogicSingleton getSingletonObj() {
		if (obj == null) {
			obj = new BusinessLogicSingleton();
			objCounter++;
		}
		System.out.println(objCounter + " object created");
		return obj;
	}

	
	 //To prevent the destroy the singleton during serialization protected
	  Object readResolve() {
	  
	  return obj; }
	 

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		//to prevent the singleton by cloning another object
		throw new CloneNotSupportedException();
	}
}
