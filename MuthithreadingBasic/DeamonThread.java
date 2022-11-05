package MuthithreadingBasic;

public class DeamonThread extends Thread{
    String name;
    public DeamonThread(String name){
        this.name = name;

    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(name +" is Deamon thread.");
        }
        else{
            System.out.println(name +" is User thread.");
        }
    }
    public static void main(String [] args){
        DeamonThread thread1 = new DeamonThread("FirstThread");
        DeamonThread thread2 = new DeamonThread("SecondThread");
        DeamonThread thread3 = new DeamonThread("ThirdThread");

        thread1.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
