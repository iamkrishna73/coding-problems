package CodingProblems;

import java.util.Collections;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of Test Case: ");
        int  t = sc.nextInt();
        while(t != 0){
            System.out.print("Enter First number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter 1 for Addition: ");
            System.out.println("Enter 2 for subtraction: ");
            System.out.println("Enter 3 for Multiplication: ");
            System.out.println("Enter 4 for Divide:  ");
            System.out.println("Enter 5 for Reminder:  ");
            int choice = sc.nextInt();
            int result = num1 + num2;
            int result2 = num1 - num2;
            int result3 = num1 * num2;
            double result4 = num1/num2;
            int result5 = num1%num2;
            switch(choice) {
                case 1:
                    System.out.print("Addition: "+ result);
                    break;
                case 2:
                    System.out.print("Subtraction: "+ result2);
                    break;
                case 3:
                    System.out.print("Multiplication: "+ result3);
                    break;
                case 4:
                    System.out.print("Division: " + result4);
                    break;
                case 5:
                    System.out.println("Reminder: "+ result5);

                    break;
                default:
                    System.out.println("Unknown choice");
            }
            System.out.println();
            t--;
        }
    }
}

