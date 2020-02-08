package com.practice.ds.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());

        System.out.println("Main thread ends here !!");

    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Currently Thread " + Thread.currentThread().getName() + " is running !");

    }
}
