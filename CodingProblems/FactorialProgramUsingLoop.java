package CodingProblems;

import java.util.Scanner;

public class FactorialProgramUsingLoop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int nums = sc.nextInt();
        int fact = 1;
        for(int i  = 1; i <= nums; i++){
            fact = fact * i;
        }
        System.out.print("The Factorial of number "+ nums + " is: "+ fact);
    }
}
