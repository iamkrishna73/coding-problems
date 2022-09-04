package CodingProblems;

import java.util.Scanner;

public class SubArrayMaximumSum {
    public static int subArrayMaxSum(int [] array, int size){
        int  res = 0;
        int k = 3;   //5
//        System.out.println(size);
//        System.out.println(size - k);
       for(int i = 0; i <= size - k; i++) {
           int curSum = 0;
           for(int j = i; j < k + i && j < size; j++) {
               curSum += array[j];
           }
           res = Math.max(res, curSum);
       }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int[] arrayValues = new int[arraySize];
        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValues[i] = sc.nextInt();
        }
        System.out.println(subArrayMaxSum(arrayValues, arraySize));
    }
}
