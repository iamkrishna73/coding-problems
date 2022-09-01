package com.codewithme;

import java.util.Scanner;

class Employes{
    int userId;
    int userSalary;
    String userName;
    static String companyCeo;
    static{    // when you load a class
        companyCeo = "Larry Page";
    }
    public Employes(int userId, int userSalary, String userName){ // when you create an object
        this.userId = userId;
        this.userSalary = userSalary;
        this.userName = userName;
    }
    public void showdDetails(){
        System.out.println("The new Employe " + userName +" ID: " + userId );
        System.out.println("The new Employe "+ userName +" Salary: " + userSalary);
    }

}
public class StaticDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        String nameFirst = sc.nextLine();
        String nameSecond = sc.nextLine();
        var employesFirst = new Employes(id, salary, nameFirst);
        var employesSecond= new Employes(id, salary, nameSecond);
        employesFirst.showdDetails();
        employesSecond.showdDetails();
    }
}
