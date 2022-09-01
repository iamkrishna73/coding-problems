package CodingProblems;

import java.util.Scanner;

public class ArrayProblem {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int[] arrayValues = new int[arraySize];
        System.out.print("Array value: ");
        for(int i = 0; i < arraySize; i++){
            System.out.print(arrayValues[i] + " ");
        }
    }
}
