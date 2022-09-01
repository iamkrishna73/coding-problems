package CodingProblems;

import java.util.Scanner;

public class SubArrayMaximumSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int[] arrayValues = new int[arraySize];
        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValues[i] = sc.nextInt();
        }
        int temp = 0;
        int [] newArray = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            for(int j = i; j < i + 3; j++){
                temp += arrayValues[j];
            }
            newArray[i] = temp;
        }
        int max = newArray[0];
        for(int i = 0; i < arraySize; i++){
            if(newArray[i] > max){
                max = newArray[i];
            }
        }
        System.out.println(max);
    }
}
