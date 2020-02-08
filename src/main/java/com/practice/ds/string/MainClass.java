package com.practice.ds.string;

//class MyThread implements Runnable {
//	  String name; // name of thread
//
//	  Thread t;
//
//	  MyThread(String threadname) {
//	    name = threadname;
//	    t = new Thread(this, name);
//	    System.out.println("New thread: " + t);
//	    t.start();
//	  }
//
//	  public void run() {
//	    try {
//	      for (int i = 5; i > 0; i--) {
//	        System.out.println(name + ": " + i);
//	        Thread.sleep(1000);
//	      }
//	    } catch (InterruptedException e) {
//	      System.out.println(name + " interrupted.");
//	    }
//	    System.out.println(name + " exiting.");
//	  }
//	}

	public class MainClass {
	  public static void main(String args[]) {
			Thread t1 =	new Thread(new Runnable () {

				@Override
				public void run() {
					synchronized(this) {
						int counter = 0;
						while (counter < 10) {	
							System.out.println("Print valiue " + Thread.currentThread().getName());
							counter++;
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("Threads are complete");							
					}
				}
								
			});
		t1.start();
		
		Thread t2 =	new Thread(new Runnable () {

			@Override
			public void run() {
				synchronized(this) {
					int counter = 0;
					while (counter < 10) {	
						System.out.println("Print valiue " + Thread.currentThread().getName());
						counter++;
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Threads are complete");							
				}
			}
							
		});
	t2.start();

	    System.out.println("Thread One is alive: " + t1.isAlive());
	    System.out.println("Thread Two is alive: " + t2.isAlive());

	    try {
	      System.out.println("Waiting for threads to finish.");
	      t1.join();
	      t2.join();
	    } catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	    }

	    System.out.println("Thread One is alive: " + t1.isAlive());
	    System.out.println("Thread Two is alive: " + t2.isAlive());

	    System.out.println("Main thread exiting.");
	  }
	}
	  
