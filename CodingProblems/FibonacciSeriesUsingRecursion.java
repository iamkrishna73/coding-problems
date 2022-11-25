package CodingProblems;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    public static int Fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1 || n == 2){
            return 1;
        }
        else{
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int nums = sc.nextInt();
        System.out.println("The Fibonacci series of "+ nums + " numbers is: ");
        for(int i = 0; i < nums; i++){
            System.out.print(Fib(i) + " ");
        }
    }
}
