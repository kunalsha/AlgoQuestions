package com.practice.interview.situation;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance("kunal");
		Singleton single1 = Singleton.getInstance("sharma");

		single.getName();
		single1.getName();
	}
}


class Singleton {
	private static Singleton instance = null;
	private static String name;
	
	public Singleton(String name) {
		this.name = name;
	}
	
	public static Singleton getInstance(String name) {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null)
					instance = new Singleton(name);				
			}
		}
		return instance;
	}
	
	public void getName() {
		System.out.println(name);
	}
}