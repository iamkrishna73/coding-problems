package com.codewithme;


class Calculation{
    int firstNumber;
    int secondNumber;
    int result;

    public Calculation(int num1, int num2){
        firstNumber = num1;
        secondNumber = num2;
        result = firstNumber + secondNumber;
        //System.out.println("Hello result: " + result);
    }
}

public class ObjectDemo {
    public static void main(String [] args){
        var objectReferance = new Calculation(7, 8);
        System.out.println(objectReferance.result);
    }
}
