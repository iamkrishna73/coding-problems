package com.codewithme;

public class MultiThreadingUsingLambdaExpression {
    public static void main(String [] args){
        Runnable obj1 = () ->{
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + " Hi");
                try{Thread.sleep(1000);}catch (Exception e){}
            }
        };
        Runnable obj2 = () ->{
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + " Hello");
                try{Thread.sleep(1000);}catch (Exception e){}
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();

    }
}
