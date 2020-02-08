package com.practice.ds.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	
	public static void main(String[] args) {
		int core =  Runtime.getRuntime().availableProcessors();
		System.out.println("Number of Cores " + core);
		
//		ExecutorService service = Executors.newFixedThreadPool(core);
//		
//		for(int i=0;i<core;i++)
//			service.execute(new CPUTask("CPUTask " + i));
//		
//		System.out.println("Main ends here");

		
		ExecutorService service = Executors.newFixedThreadPool(core);
		
		for(int i=0;i<100;i++)
			service.execute(new IOTask("IOTask " + i));
		
		
		service.shutdown();
		System.out.println("Main ends here");



	}
}

class CPUTask implements Runnable {
	private String name;
	
	public CPUTask(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		long sum = 0;
		for(int i=0;i<10000;i++)
			sum+=i;
		
		System.out.println("CPUTask ends here");
	}
}

class IOTask implements Runnable {
	private String name;
	
	public IOTask(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		long sum = 0;

		for(int i=0;i<100;i++) {
			sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("CPUTask ends here");
	}
}
