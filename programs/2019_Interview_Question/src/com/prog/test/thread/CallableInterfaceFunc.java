package com.prog.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfaceFunc implements Callable<String> {
	@Override
	public String call() throws Exception {
		return "Implement Callable";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		ExecutorService exectorService = Executors
				.newSingleThreadScheduledExecutor();
		Future<String> future = exectorService
				.submit(new CallableInterfaceFunc());
		System.out.println("Callable result::" + future.get());
		exectorService.shutdown();

	}

}
