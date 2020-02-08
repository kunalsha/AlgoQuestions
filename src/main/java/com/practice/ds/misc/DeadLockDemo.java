package com.practice.ds.misc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockDemo {
	
	Lock lockA = new ReentrantLock();
	Lock lockB = new ReentrantLock();
	
	public static void main(String[] args) {
		
		DeadLockDemo demo = new DeadLockDemo();
		
		new Thread(() -> {
			try {
				demo.processThis();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(() -> {
			try {
				demo.processThat();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();

		
	}
	
	public void processThis() throws InterruptedException {
		
		lockA.lock();
		System.out.println("LockA acquired");
		
		Thread.sleep(3000);

		lockB.lock();
		System.out.println("LockB acquired");
		
		
		lockA.unlock();
		lockB.unlock();
	}
	
	public void processThat() throws InterruptedException {
		
		lockB.lock();
		System.out.println("LockB acquired");
		
		Thread.sleep(3000);

		lockA.lock();
		System.out.println("LockA acquired");
		
		
		lockA.unlock();
		lockB.unlock();
	}

}


