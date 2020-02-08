package com.practice.ds.thread;

public class ThreadBasic {
    public static void main(String args []){
        System.out.println("Program starts");

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Message from newThread " + Thread.currentThread().getName());
            }
        });
        threadOne.start();

        Thread threadTwo = new Thread(new MyNewRunnable());
        threadTwo.run();
        System.out.println("Main Thread ends");

        Thread threadThree = new MyCustomThread("ThreadThree");
        threadThree.run();

        Thread[] threadArray = new Thread[10];

        for(int i=0;i<10;i++) {
            threadArray[i] = new Thread(new MyNewRunnable());
            threadArray[i].start();
        }

        Thread[] threadArray2 = new Thread[10];

        for(int i=0;i<10;i++) {
            threadArray2[i] = new MyCustomThread(""+i);
            threadArray2[i].start();
        }

    }
}

class MyNewRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Message from MyRunnable " + Thread.currentThread().getName());
    }
}

class MyCustomThread extends Thread {
    String name;

    public MyCustomThread(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("Message from MyRunnable " + name);
    }
}
