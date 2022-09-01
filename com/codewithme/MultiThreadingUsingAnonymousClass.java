package com.codewithme;

public class MultiThreadingUsingAnonymousClass {
    public static void main(String [] args){
        Runnable obj1 = new Runnable() {
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(i +" Hi");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };
        Runnable obj2 = new Runnable() {
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(i + " Hello");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {Thread.sleep(10);}catch (Exception e){}
        t2.start();

    }
}
