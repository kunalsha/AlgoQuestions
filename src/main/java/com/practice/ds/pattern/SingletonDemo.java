package com.practice.ds.pattern;

public class SingletonDemo {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run( ) {
				Singleton single = Singleton.getInstance();
				single.print();
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run( ) {
				Singleton single = Singleton.getInstance();
				single.print();
			}
		});
		t2.start();
			
	
	}
}

class Singleton {
	private static final Singleton single = new Singleton("First");
	private String name;
	
	private Singleton(String name) {
		this.name = name;
	}
	
	public static  Singleton getInstance() {
		if(single==null) {
			//synchronized(Singleton.class) {
				return new Singleton("Second");
			//}
		}
		return single;
	}
	
	public void print() {
		System.out.println("Is this singleton : " + this.name);
	}
}