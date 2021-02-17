package com.leranthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	private String name;

	CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello" + name;
	}

}

public class Callable_Runner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> future = executorService.submit((new CallableTask("Java")));
		String str = future.get();
		System.out.println(str);
		System.out.println("\n Main Completed");

	}

}
