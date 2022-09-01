package com.codewithme;
class Student{
    String studentName;
    int studentId;
    byte studentScore;
    float studentResult;

    public void result(){
        if(studentScore >= 75){
            System.out.println("Pass.");
        }
        else{
            System.out.println("Fail.");
        }
    }

}

public class StudentData {
    public static void main(String [] args){
        var student = new Student();

    }
}
