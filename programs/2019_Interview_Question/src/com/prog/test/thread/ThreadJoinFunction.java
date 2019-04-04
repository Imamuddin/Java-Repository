package com.prog.test.thread;

public class ThreadJoinFunction extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread::"
						+ Thread.currentThread().getName());
			} catch (InterruptedException ex) {

				System.out.println("System has been caught" + ex);
			}
			System.out.println(i);

		}

	}
}
