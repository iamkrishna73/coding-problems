package CodingProblems;

import java.util.Scanner;

public class PowOfTwo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a power value: ");
        int nums = sc.nextInt();
        System.out.print("Enter a number: ");
        int numbers = sc.nextInt();
        double result = Math.pow(numbers, nums);
        System.out.println(result);
    }
}
