package com.codewithme;

import java.util.Scanner;

public class ArrayElementPrint {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int [] arrayValue = new int[arraySize];
        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValue[i] = sc.nextInt();
        }
        System.out.print("Array value: ");
        for(int i = 0; i < arraySize; i++){
            System.out.print(arrayValue[i] + " ");
        }
    }
}
