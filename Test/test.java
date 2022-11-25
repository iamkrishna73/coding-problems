package Test;
//abstract class : hides internal detail;
// abstract
// class phone{


abstract class Mobile {

    void voicecall(){
        System.out.println("You can call");
    }
    abstract void camera();
    abstract void teachDisplay();
}
class Iphone extends Mobile {
    void camera(){
        System.out.println("12 mega pixel");
    }
    void teachDisplay(){
       System.out.println("5.0 inch display.");
    }
}
class Iphone15 extends Iphone{
    void music(){
        System.out.println("Playing music in iphone 15");
    }

}

public class test {
    public static void main(String [] args){
        Iphone ip = new Iphone();
        ip.voicecall();
        ip.camera();
        ip.teachDisplay();
        Iphone15 i15 = new Iphone15();
        i15.voicecall();
        i15.music();
    }
}
