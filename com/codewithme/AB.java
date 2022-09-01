package com.codewithme;

public class AB {
    int a = 5, b = 3, c = 4;
    static int d = 5, e = 6;
    public static void main(String [] args){
        AB ob = new AB();
        System.out.println(ob.a + ob.b + ob.c + d + e);
        ob.a = ob.b + d;
        ob.b = ob.c + e;
        d = ob.a + ob.b;
        System.out.println(ob.a + ob.b + ob.c + d + e);
        AB ob1 = new AB();
        ob1.a = ob.a + ob1.b;
        ob1.b = ob1.a + ob1.c;
        e = ob1.a + ob1.b;
        System.out.println(ob1.a+ ob1.b + ob1.c + d + e);
        AB ob2 = new AB();
        System.out.println(ob2.a + ob2.b + ob2.c + d + e);
    }
}
