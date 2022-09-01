package com.codewithme;

public interface MultiThreadingUsingThreadPriority {
    public static void main(String [] args) throws Exception{
        Thread t1 = new Thread(() ->{
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try{Thread.sleep(1000);}catch (Exception e){}
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try{Thread.sleep(1000);}catch (Exception e){}
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //t2.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();

        System.out.println("Bye");

    }
}
