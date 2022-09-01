package com.codewithme;

import java.util.Scanner;

public class ScannerDemo {
    private  static  boolean isEqual (String st1,  String str2) {
        return st1.equals(str2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name: ");
        String userName = sc.nextLine();
        System.out.print("User Gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("User Age: ");
        int age = sc.nextInt();
        System.out.print("User Mobile No:");
        long mobileNumber = sc.nextLong();
        System.out.print("Academic CGPA:");
        double cgpa = sc.nextDouble();
        System.out.println("User" +userName);
        System.out.println("Gender" +gender);
        System.out.println("Age" +age);
        System.out.println("Mobile number" +mobileNumber);
        System.out.println("CGPA" +cgpa);
    }
}
