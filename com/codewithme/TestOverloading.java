package com.codewithme;
class Adder{
    static int add(int a, int b){
        return (a + b);
    }
    static double Double(double a, double b, double c){
        return  (a+ b+ c);
    }

}
public class TestOverloading {
    public static void main(String [] args){
        System.out.println("The Add1 solution: " + Adder.add( 4, 5));
        System.out.println("The Add2 solution: " + Adder.Double( 4.4, 5.5, 8.5));

    }
}
