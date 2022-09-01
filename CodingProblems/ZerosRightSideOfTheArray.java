package CodingProblems;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ZerosRightSideOfTheArray {
    public static int[] ShiftZeroRightSide(int [] arrayValue, int size){
        if(size == 1){
            return arrayValue;
        }
        int[] newArray = new int[size];
        int cnt = 0;
        for(int i = 0; i < size; i++){
            if(arrayValue[i] != 0){
                newArray[cnt] = arrayValue[i];
                cnt++;
            }
        }
        return newArray;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Size: ");
        int arraySize = sc.nextInt();
        System.out.print("Enter a Element of Array: ");
        int[] arrayValue = new int [arraySize];
        for(int i = 0; i < arraySize; i++){
            arrayValue[i] = sc.nextInt();
        }
        System.out.print("Zeros Right side array are: ");
        System.out.println(Arrays.toString(ShiftZeroRightSide(arrayValue, arraySize)));
    }
}
