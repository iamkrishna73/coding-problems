package com.codewithme;

import java.util.Scanner;

public class ArrayReverse {
    public static void reverseArray(int [] arrayValue, int start, int end){
        int temp = 0;
        while (start <= end){
            temp = arrayValue[start];
            arrayValue[start] = arrayValue[end];
            arrayValue[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Size: ");
        int arraySize = sc.nextInt();
        int [] arrayValue = new int[arraySize];
        System.out.print("Enter a Arrays Value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValue[i] = sc.nextInt();
;       }
        reverseArray(arrayValue, 0, arraySize -1);;
        for(int i = 0; i < arraySize; i++){
            System.out.print(arrayValue[i] + " ");
        }


    }
}
