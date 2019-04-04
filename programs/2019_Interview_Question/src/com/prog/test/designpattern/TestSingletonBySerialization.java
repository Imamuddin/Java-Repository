package com.prog.test.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingletonBySerialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusinessLogicSingleton s1 = BusinessLogicSingleton.getSingletonObj();
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("File.txt"));
			out.writeObject(s1);
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"File.txt"));
			BusinessLogicSingleton s2 = (BusinessLogicSingleton) in
					.readObject();
			in.close();
			System.out.println("Hash code of s1::" + s1.hashCode());
			System.out.println("Hash code of s2::" + s2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
