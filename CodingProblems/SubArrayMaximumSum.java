package CodingProblems;

import java.util.Scanner;

public class SubArrayMaximumSum {
    public static void subArrayMaxSum(int [] array, int size){
        int  res = 0;
        int k = 3;   //5
//        System.out.println(size);
//        System.out.println(size - k);
       int lowerIdx = -1, higherIdx = -1;
       for(int i = 0; i <= size - k; i++) {
           int curSum = 0;
           int j = i;
           for(;j < k + i && j < size; j++) {
               curSum += array[j];
           }
           if(curSum > res) {
                lowerIdx = i;
                higherIdx = j;
                res = curSum;
           }
//           res = Math.max(res, curSum);
       }
        System.out.println(lowerIdx + " " + higherIdx);
//        return res;
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
        subArrayMaxSum(arrayValues, arraySize);
    }
}
