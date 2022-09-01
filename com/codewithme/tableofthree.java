package com.codewithme;

import java.util.Scanner;

public class tableofthree {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  sc.nextInt();
        for(int i = number; i <=50; i = i+3){
            System.out.println(i);

        }
    }

}
