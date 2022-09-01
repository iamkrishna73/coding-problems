package com.codewithme;
import java.util.Arrays;
import java.util.Scanner;

public class SearchLinear {
    public static Boolean LinearSearch(int[] array, int size, int number){
        for(int i = 0; i < size; i++){
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a size of Array: ");
        int arraySize = sc.nextInt();
        int [] arrayNums = new int[arraySize];
        System.out.print("Enter a array Element: ");
        for(int i = 0; i < arraySize; i++){
            arrayNums[i] = sc.nextInt();
        }

        Arrays.sort(arrayNums);
        System.out.print("Enter a number you want to search: ");
        int number = sc.nextInt();
        System.out.println(LinearSearch(arrayNums, arraySize, number));
    }
}
