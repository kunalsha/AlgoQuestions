package com.practice.ds.thread;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Shared shared = new Shared();

		Thread producer = new Thread(() -> {
			System.out.println("Producer");
			while (true)
				shared.put();
		});
		producer.start();

		Thread consumer = new Thread(() -> {
			System.out.println("Consumer");
			while (true)
				shared.get();
		});
		consumer.start();

	}
}

class Shared {

	boolean first;

	public synchronized void put() {
		if (first) {
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Put");
		first = !first;
		notify();
	}

	public synchronized void get() {
		if (!first) {
			try {
				wait();
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get");
		first = !first;
		notify();
	}
}