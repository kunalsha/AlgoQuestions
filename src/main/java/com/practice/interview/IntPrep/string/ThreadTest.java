package com.practice.interview.IntPrep.string;

public class ThreadTest {

	public static void main(String[] args) {

		Thread[] thArr = new Thread[10];

		for (int i = 0; i < 10; i++) {
			thArr[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized (this) {
						int counter = 0;
						while (counter < 10) {
							System.out.println("Print valiue " + Thread.currentThread().getName());
							counter++;
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("This thread is complete");
					}
				}
			});
			thArr[i].start();
		}

		try {
			for (int i = 0; i < 10; i++) {
				thArr[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All Threads are complete");

	}

}
