package com.leranthread;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");

		System.out.println("\n Task1 Done");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Task2 started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");

		System.out.println(" \n Task2 Done");
		
	}
	
}

public class ThreadBasics {

	public static void main(String[] args) {
		System.out.println("Task1 Creation");
		// Task1-101 to 199
		Task1 task1 = new Task1();//newborn state
		task1.start();

		System.out.println("Task2 Creation");
		// Task2-201 to 299
		Task2 Thread2task=new Task2();
		Thread thread=new Thread(Thread2task);
		thread.start();
	

		System.out.println("Task3 Creation");
		// Task3-301 to 399
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");

		System.out.println("\n Task3 Done");

	}

}
