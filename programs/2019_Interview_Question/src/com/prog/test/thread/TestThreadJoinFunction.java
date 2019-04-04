package com.prog.test.thread;

public class TestThreadJoinFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadJoinFunction t1 = new ThreadJoinFunction();
		ThreadJoinFunction t2 = new ThreadJoinFunction();
		ThreadJoinFunction t3 = new ThreadJoinFunction();
		// thread t1 start
		t1.start();
		// start second thread when first thread execution is finish
		try {
			System.out.println("Current Thread::"
					+ Thread.currentThread().getName());
			t1.join();
		} catch (InterruptedException ex) {
			System.out.println("Exception has been caught::" + ex);
		}

		// t2 starts
		t2.start();

		// start third thread when second died
		try {
			System.out.println("Current Thread::"
					+ Thread.currentThread().getName());
			t2.join();
		} catch (InterruptedException ex) {
			System.out.println("Exception has been caught::" + ex);

		}
		t3.start();

	}

}
