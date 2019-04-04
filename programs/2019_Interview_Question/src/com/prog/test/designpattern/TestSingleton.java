package com.prog.test.designpattern;

import java.lang.reflect.Constructor;

public class TestSingleton {

	public void show() {
		SingletonService obj = BusinessLogicSingleton.getSingletonObj();
		System.out.println("Hash code of obj::"+obj.hashCode());
		obj.display();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestSingleton testObj = new TestSingleton();
		BusinessLogicSingleton obj1=BusinessLogicSingleton.getSingletonObj();
		BusinessLogicSingleton obj3=BusinessLogicSingleton.getSingletonObj();
		BusinessLogicSingleton obj2=null;
		System.out.println("Hash code of obj1::" + obj1.hashCode());
		System.out.println("Hash code of obj3::" + obj3.hashCode());
		
		Constructor cons[]=BusinessLogicSingleton.class.getDeclaredConstructors();
		
		try{
			for(Constructor con:cons){
				con.setAccessible(true);
				obj2=(BusinessLogicSingleton)con.newInstance();
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		System.out.println("Hash code of obj1::" + obj1.hashCode());
		System.out.println("Hash code of obj2::" + obj2.hashCode());
		
		testObj.show();
	}

}
