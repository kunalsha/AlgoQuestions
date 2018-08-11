package com.practice.interview.IntPrep.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	
	public static void main(String[] args) {
		int core =  Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i=0;i<10;i++)
			service.execute(new Task());
	}

}

class Task implements Runnable {
	
	public void run() {
		int counter = 0;
		while(counter <2) {
			System.out.println(counter++);

		}
		
	}
}