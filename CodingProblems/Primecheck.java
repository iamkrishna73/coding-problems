package CodingProblems;

import java.util.Scanner;

public class Primecheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        int c = isprime(number);
        if(c == 1){
            System.out.println(number + " is Prime");
        }
        else{
            System.out.println(number + " Not Prime");
        }
    }
    public static int isprime(int number){
        int cnt = 0;
        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                return cnt;
            }
        }
        return cnt = cnt + 1;
    }
}
