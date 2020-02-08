package com.practice.ds.thread;

public class PingPongRepeat {
	public static void main(String[] args) {
		PrintPingPong msg = new PrintPingPong();
		Thread ping = new MyPingThread(10, msg);
		Thread pong = new MyPongThread(10, msg);

		ping.start();
		pong.start();
	}
}

class PrintPingPong {
	boolean isPing = true;
	
	public synchronized void printPing() throws InterruptedException {
		while(!isPing) {
			wait();
		}
		System.out.println("Ping");
		isPing = false;
		notify();
		
	}
	public synchronized void printPong() throws InterruptedException {
		while(isPing) {
			wait();
		}
		System.out.println("Pong");
		isPing = !isPing;
		notify();
		
	}
}

class MyPingThread extends Thread {
	int limit;
	PrintPingPong msg;

	public MyPingThread(int limit, PrintPingPong msg) {
		super();
		this.limit = limit;
		this.msg = msg;
	}

	@Override
	public void run() {
		while (limit > 0) {
			try {
				msg.printPing();
				limit--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyPongThread extends Thread {
	int limit;
	PrintPingPong msg;

	public MyPongThread(int limit, PrintPingPong msg) {
		super();
		this.limit = limit;
		this.msg = msg;
	}

	@Override
	public void run() {
		while (limit > 0) {
			try {
				msg.printPong();
				limit--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}