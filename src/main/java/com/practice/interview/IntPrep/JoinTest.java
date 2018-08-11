package com.practice.interview.IntPrep;

public class JoinTest {
	public static void main(String[] args) {
		JoinTest test = new JoinTest();

		Thread T1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("T1 is executed.");
			}

		});

		Thread T2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					T1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("T2 is executed.");		
			}

		});
		
		Thread T3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					T2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("T3 is executed.");
			}

		});
		
		T3.start();
		T2.start();
		T1.start();

	}
}
