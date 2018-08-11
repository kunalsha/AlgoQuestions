package com.practice.interview.IntPrep.thread;

public class DeadlockDemo {
	public static void main(String[] args) {
		String res1 = "ABC";
		String res2 = "DEF";
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {			
				synchronized(res1)  {
					System.out.println("Thread 1");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(res2) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {			
				synchronized(res2)  {
					System.out.println("Thread 2");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(res1) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
