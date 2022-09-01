package com.codewithme;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class MainMethod1 {
    public static void main(String [] args){
        String line;
        try(var br = new BufferedReader(new FileReader(" D:\\test.txt"))){
            while((line = br.readLine()) != null){
                System.out.println("Line =>" + line);
            }
        }
        catch(IOException e){
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}
