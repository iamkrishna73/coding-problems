package com.codewithme;

import java.util.Scanner;

public class EvanOddInArray {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int[] arrayValue = new int[arraySize];
        System.out.print("Enter a array value: ");
        for (int i = 0; i < arraySize; i++) {
            arrayValue[i] = sc.nextInt();
        }

        int evenArray;
        int oddArray;

        for(int i = 0; i < arraySize; i++){
            if(arrayValue[i] % 2 == 0){
                evenArray = arrayValue[i];
                System.out.println("Even array Value: " +evenArray);
            }
            else{
                oddArray = arrayValue[i];
                System.out.println("Odd array Value: " +oddArray);
            }
        }
    }
}
