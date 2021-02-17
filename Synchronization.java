package com.leranthread;

class Counter {
	int count;

	public synchronized void increase() {
		count++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws Exception {
		Counter c1 = new Counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					c1.increase();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					c1.increase();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Count: " + c1.count);

	}

}
