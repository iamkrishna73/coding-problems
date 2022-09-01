package com.codewithme;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool implements Runnable{
    String name;
    public ThreadPool(String name){
        this.name = name;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start and massage is: " + name);
        try{Thread.sleep(2000);}catch (Exception e){}
        System.out.println(Thread.currentThread().getName() + " end");
    }

}

public class ThreadPooling {
    public static void main(String[] args){
        ExecutorService executors = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            ThreadPool threadPool = new ThreadPool(" " + i);
            executors.execute(threadPool);
        }
        executors.shutdown();
        while(!executors.isTerminated()){}

        System.out.println("Finish all thread");

    }
}
