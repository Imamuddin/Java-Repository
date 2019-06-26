package com.prog.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableInterfaceFunc implements Runnable {

	@Override
	public void run() {
		System.out.println("This is Runnable");

	}

	public static void main(String[] args) {
		
		/* Thread t=new Thread(new RunnableInterfaceFunc()); t.start(); */
		 
		
		
		  ExecutorService execService = Executors .newSingleThreadScheduledExecutor();
		  Future future = execService.submit(new RunnableInterfaceFunc());
		  execService.shutdown(); System.out.println("task completion result " +
		  future.isDone());
		 
		 

	}

}
