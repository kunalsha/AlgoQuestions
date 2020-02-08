package com.practice.ds.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		CyclicBarrier latch = new CyclicBarrier(3);
		
		service.execute(new CyclicBarrierCommand(latch, 3));
		service.execute(new CyclicBarrierCommand(latch,6));
		service.execute(new CyclicBarrierCommand(latch, 9));
		
		
		
		System.out.println("Main completed");
		
	}

}

class CyclicBarrierCommand implements Runnable {

	private CyclicBarrier latch;
	private int time;
	
	public CyclicBarrierCommand(CyclicBarrier latch, int time) {
		this.latch = latch;
		this.time = time;
	}
	
	@Override
	public void run() {
		System.out.println("Command operation");
		while(true) {
			try {
				Thread.sleep(time*1000);
				latch.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Reached  completed");

		}


	}
	
}
