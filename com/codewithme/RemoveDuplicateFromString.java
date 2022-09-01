package com.codewithme;

import java.util.Scanner;

public class RemoveDuplicateFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println(removeDuplicate(str));
    }
    public static String removeDuplicate(String str){
        String newString = "";
        int len = str.length();
        for(int i = 0; i < len; i++){
            char charPosition = str.charAt(i);
            if(newString.indexOf(charPosition) < 0){
                newString += charPosition;
            }
        }
        return newString;
    }
}
