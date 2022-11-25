package CodingProblems;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int Fact(int n){
        if(n == 0){
            return 1;
        }
        else {
            return n * Fact(n - 1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int nums = sc.nextInt();
        int f = Fact(nums);
        System.out.print("The Factorial of number "+ nums + " is: "+ f);
    }
}
