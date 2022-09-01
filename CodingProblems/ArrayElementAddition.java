package CodingProblems;

import java.util.Scanner;

public class ArrayElementAddition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int[] arrayValues = new int[arraySize];
        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValues[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arraySize; i++){
            sum += arrayValues[i];
        }
        System.out.println("The sum of all the value of array are: "+ sum);
    }

}
