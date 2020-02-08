package com.practice.ds.thread;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadLocalDemo {
	public static ThreadLocal<DecimalFormat> formatter = ThreadLocal.withInitial(() -> new DecimalFormat( "#,###,###,##0.00"));

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(4);

		
		List<Future<String>> futures = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			futures.add(service.submit(new MyCallable()));
		}
		
		futures.forEach(future -> {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		});
	}

}

class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		int number = new Random().nextInt(100);
		
		String result = ThreadLocalDemo.formatter.get().format(number);
		return result;
	}
	
}