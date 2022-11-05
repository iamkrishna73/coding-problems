package CodingProblems;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int SearchBinary(int[]array, int size, int searchValue){
        int start =  0;
        int end = size - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(array[mid] == searchValue){
                return mid;
            }
            else if(array[mid] < searchValue){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int arraySize = sc.nextInt();
        int [] arrayNums = new int[arraySize];
        System.out.print("Enter a Array elements: ");
        for(int i = 0; i < arraySize; i++){
            arrayNums[i] = sc.nextInt();
        }
        Arrays.sort(arrayNums);
        System.out.print("Enter a Integer you want to search: ");
        int searchValue = sc.nextInt();
        System.out.println(SearchBinary(arrayNums, arraySize, searchValue));
    }
}
