package com.prog.test.func.programme;

public class LambdaExpressionTest {

	// implement runnable using ananymous
	public static void print() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Runnable implementation using anonymous class");
			}
		};

		r.run();
	}

	// implement runnable using lambda expression
	public static void show() {
		Runnable r1 = () -> System.out.println("My Runnable");
		r1.run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		print();
		show();
	}

}
