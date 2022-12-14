package CodingProblems;

import java.util.Scanner;

public class TwoLargestElementInArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int [] arrayValue = new int[arraySize];
        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValue[i] = sc.nextInt();
        }
        int maxValue = arrayValue[0];
        for(int i = 1; i < arraySize; i++){
            if(arrayValue[i] > maxValue){
                maxValue = arrayValue[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arraySize; i++){
            if(arrayValue[i] > secondMax && arrayValue[i] < maxValue){
                secondMax = arrayValue[i];
            }
        }
        System.out.println("First max: " + maxValue);
        System.out.println("Second max: " + secondMax);
    }
}
