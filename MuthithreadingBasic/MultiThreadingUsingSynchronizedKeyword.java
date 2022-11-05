package MuthithreadingBasic;

class Counter{
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class MultiThreadingUsingSynchronizedKeyword {
    public static void main(String [] args) throws Exception{
        Counter cnt = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 1; i <= 1000; i++){
                    cnt.increment();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 1; i <= 1000; i++){
                    cnt.increment();
                }

            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count: "+ cnt.count);
    }
}
