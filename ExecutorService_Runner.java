package com.leranthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.print("\nTask" + number + "Started");
		for (int i = number * 100; i <= number * 100 + 99; i++)
			System.out.print(i + " ");
		System.out.print("\nTask" + number + "Done");
	}
}

public class ExecutorService_Runner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));

		executorService.shutdown();

	}

}
