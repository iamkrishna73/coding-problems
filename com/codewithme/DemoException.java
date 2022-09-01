package com.codewithme;

import java.util.Scanner;

public class DemoException {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber, result;
        int [] arrayNums = new int[4];
        firstNumber = 8;
        secondNumber = 2;
        try {
            result = firstNumber / secondNumber;
            for(int i = 0; i <= 4; i++){
                arrayNums[i] = sc.nextInt();
            }
            for(int value: arrayNums){
                System.out.println(value);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by zero: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The exception is: " + e);
            System.out.println("Maximum value you can store in array is 4");
        }
    }
}
