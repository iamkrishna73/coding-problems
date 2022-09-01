package CodingProblems;

import java.util.Scanner;

public class LeadersInAnIntegerArray {
    public static void LeadersInArray(int[] arrayValue, int size){
        int max = arrayValue[size - 1];
        System.out.print("The leaders element are: "+ max);
        for(int i = size - 1; i >= 0; i--){
            if(arrayValue[i] > max){
                System.out.print(" "+ arrayValue[i]);
                max = arrayValue[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Size: ");
        int arraySize = sc.nextInt();
        System.out.print("Enter a Element of Array: ");
        int[] arrayValue = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayValue[i] = sc.nextInt();
        }
        LeadersInArray(arrayValue, arraySize);
    }
}
