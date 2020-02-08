package com.practice.ds.thread;

public class ThreadCreation {

	public static void main(String[] args) throws Exception {
		
		//showThreadJoin();
		//showSynchro();
		
		Thread t1 = new Thread(new MyThread2());
		Thread t2 = new Thread(new MyThread2());
		Thread t3 = new Thread(new MyThread2());

		t1.start();
 
        try {
            t1.join(); // Waiting for c1 to finish
        }
        catch (InterruptedException ie) {
        }
 
		System.out.println("T1 status" + t1.isAlive());

        t2.start();
		


		System.out.println("All completed");


	}
	
	private static void showSynchro() throws Exception{
		Counter c = new Counter();
		
		Thread t1 = new Thread(() -> { 
			for (int i=0; i<30;i++)
				c.increment();
		});
		t1.start();

		Thread t2 = new Thread(() -> { 
			for (int i=0; i<30;i++)
				c.increment();
		});
		t2.start();
	}

	static void showThreadJoin() throws Exception {
		System.out.println(Thread.currentThread().getName());
		
		Thread t1 = new Thread(() ->{
			System.out.println("Say Hi");
		}, "HiThread");
		
		Thread t2 = new Thread(() ->{
			System.out.println("Say Hello");
		}, "HelloThread");
		
		t1.start();
		t2.start();
		
		t2.join();
		t1.join();

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		System.out.println("Program Completed");
	}

}

class MyThread1 implements Runnable{
	public void run() {
		System.out.println("Started 0 " + Thread.currentThread().getName());

	}
}

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("Started " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End " + Thread.currentThread().getName());

	}
}

class Counter {
	int count = 1;
	
	public synchronized int increment() {
		System.out.println(count);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count++;

	}
}