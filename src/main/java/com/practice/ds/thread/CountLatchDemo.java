package com.practice.ds.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		CountDownLatch latch = new CountDownLatch(3);
		
		service.execute(new Command(latch));
		service.execute(new Command(latch));
		service.execute(new Command(latch));

		latch.await();
		
		System.out.println("Main completed");
		
	}

}

class Command implements Runnable {

	private CountDownLatch latch;
	
	public Command(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Command operation");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	}
	
}
