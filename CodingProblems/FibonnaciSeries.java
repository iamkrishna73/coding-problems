package CodingProblems;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numbers = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        System.out.println(a);
        System.out.println(b);
       for(int i = 3; i <= numbers; i++){
           sum = a + b;
           System.out.println(sum);
           a = b;
           b = sum;
       }
    }
}
