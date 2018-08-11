package com.practice.interview.IntPrep.thread;

public class PingPongDemo {
	public static void main(String[] args) {
		
		PrintingClass pc = new PrintingClass();
		
		Thread t1 = new PingThread(10, pc);
		Thread t2 = new PongThread(12, pc);

		t1.start();
		t2.start();
	}
}

class PrintingClass {
	boolean turn = false;

	public synchronized void printPing() throws InterruptedException {

		while (turn)
			wait();
		System.out.println("Ping");
		turn = !turn;
		notifyAll();

	}

	public synchronized void printPong() throws InterruptedException {

		while (!turn)
			wait();
		System.out.println("Pong");
		turn = !turn;
		notifyAll();

	}


}

class PingThread extends Thread {
	PrintingClass printing;
	private int times;

	public PingThread(int times, PrintingClass pc) {
		this.times = times;
		printing = pc;

	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			try {
				printing.printPing();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PongThread extends Thread {
	PrintingClass printing;
	private int times;

	public PongThread(int times, PrintingClass pc) {
		this.times = times;
		printing = pc;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			try {
				printing.printPong();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}