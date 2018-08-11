package com.practice.interview.IntPrep.thread;

public class PingPongGame {
	public static void main(String[] args) {
		PingPongGame game = new PingPongGame();
		PrintMessage msg = new PrintMessage();
		
		Thread ping = new PingThread1(10, msg);
		Thread pong = new PongThread1(10, msg);

		ping.start();
		pong.start();
	}
}

class PrintMessage {
	private boolean isPing =true;
	
	public synchronized void printPing() throws InterruptedException {
		while(!isPing)  {
			wait();
		} 
		System.out.println("Ping");
		isPing = false;
		notify();
	}
	
	public synchronized void printPong() throws InterruptedException {
		while(isPing)  {
			wait();
		} 
		System.out.println("Pong");
		isPing = true;
		notify();
	}	
}

class PingThread1 extends Thread{
	int times;
	PrintMessage message;
	
	public PingThread1(int times, PrintMessage message) {
		super();
		this.times = times;
		this.message = message;
	}
	
	@Override
	public void run() {
		while(times > 0) {
			try {
				message.printPing();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class PongThread1 extends Thread{
	int times;
	PrintMessage message;
	
	public PongThread1(int times, PrintMessage message) {
		super();
		this.times = times;
		this.message = message;
	}

	@Override
	public void run() {
		while(times > 0) {
			try {
				message.printPong();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
