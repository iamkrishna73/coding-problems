package CodingProblems;

public class LeftRotateArray {
    public  static void reverse(int[] arr) {
        int i = 0, j = arr.length;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void main(String [] args){
         int[] arr = new int[10];
         for(int i = 0; i < 10; i++) arr[i] = i + 1;
        final int n = arr.length;
        int[] leftRoted = new int[10], rightRoted = new int[10];
        int rotation = 2, j = 0;
        for(int i = 0; i< arr.length; i++, j++) {
            leftRoted[j] = arr[(i + rotation) % n];
            rightRoted[j] = arr[(i - rotation + n) % n];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(leftRoted[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(rightRoted[i] + " ");
        }
    }
}
