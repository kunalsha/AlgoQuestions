package com.practice.ds.thread;

public class TenThreads {

	public static void main(String[] args) throws InterruptedException {
		
		Thread[] thArr = new Thread[10];
		
		for (int i=0;i<2;i++) {
			thArr[i] = new Thread(() ->{
				int counter = 0;
				while(counter < 5) {
					counter++;
					try {
						Thread.sleep(1000);
						System.out.println("Thread " + Thread.currentThread().getName());

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			thArr[i].start();
		}	
	
		for (int i=0;i<2;i++) {
			thArr[i].join();
		}
		
		System.out.println("Main completes here");
	}

}
