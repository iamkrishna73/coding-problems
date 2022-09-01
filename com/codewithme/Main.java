package com.codewithme;

import java.util.Scanner;

public class Main {
    private static void change(int[] arr, int idx){ // arr, obj, string,
        arr[idx]++;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scr.nextLine();
        int size = string.length();
        StringBuilder reverse = new StringBuilder();
        for(int i = size - 1; i >= 0; i--){
            reverse.append(string.charAt(i));
        }
        if(string.equals(reverse.toString())){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
