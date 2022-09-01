package CodingProblems;
import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size Array: ");
        byte arraySize = sc.nextByte();
        int[] arrayValues = new int[arraySize];
        System.out.print("Enter a array value: ");
        for(int i = 0; i < arraySize; i++){
            arrayValues[i] = sc.nextInt();
        }
        int eachValue;
        int cnt = 0;
        for(int i = 0; i < arraySize; i++){
            eachValue = arrayValues[i];
            for(int j = 0; j < arraySize; j++){
                if(arrayValues[j] == arrayValues[i]){
                    cnt++;
                }
            }
            System.out.println(eachValue + " are in "+ cnt+ " Times");
            cnt = 0;
        }
    }
}
