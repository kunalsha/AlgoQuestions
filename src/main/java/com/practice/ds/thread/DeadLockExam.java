package com.practice.ds.thread;

public class DeadLockExam {

	public static void main(String[] args) throws InterruptedException {
		
		Resource r1 = new Resource("One");
		Resource r2 = new Resource("Two");

		
		Thread t1 = new Thread(() ->{
			synchronized(r1) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized(r2) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
			
		});
		t1.start();
		
		Thread t2 = new Thread(() ->{
			synchronized(r2) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized(r1) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
			
		});
		t2.start();
		
	}

}

class Resource {
	String name;
	
	public Resource(String name) {
		this.name = name;
	}
}
