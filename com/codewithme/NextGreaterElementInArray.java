package com.codewithme;

import java.util.Scanner;

public class NextGreaterElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int [] arrayValue = new int[arraySize];

        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValue[i] = sc.nextInt();
        }
        for(int i = 0; i < arraySize; i++) {
            int nextValue = -1;
            for (int j = i + 1; j < arraySize; j++) {
                if (arrayValue[i] < arrayValue[j]) {
                    nextValue = arrayValue[j];
                    break;
                }
            }
            System.out.println(nextValue);
        }


    }
}
