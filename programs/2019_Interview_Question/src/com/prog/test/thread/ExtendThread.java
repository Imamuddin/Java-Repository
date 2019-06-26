package com.prog.test.thread;

public class ExtendThread extends Thread {

	public void run() {
		System.out.println("extends thread");
	}

	public static void main(String[] args) {

		ExtendThread t = new ExtendThread();
		t.start();

	}

}
