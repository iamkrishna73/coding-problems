package com.codewithme;

class MultiTread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " Hello");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
class MultiTread2 extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " Mike");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
public class MultiThreadingUsingThreadClass{
    public static void main(String [] args){
        MultiTread1 t1 = new MultiTread1();
        MultiTread2 t2 = new MultiTread2();
        t1.start();
        try{Thread.sleep(200);}catch (Exception e){}
        t2.start();

    }
}
