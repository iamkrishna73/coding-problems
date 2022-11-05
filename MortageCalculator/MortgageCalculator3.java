package MortageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator3 {
    public static void main(String [] args){
        int principle;
        float annualInterest;
        byte years;
        principle = (int)readNumber("Principle", 1000, 10000001);

        annualInterest = (float)readNumber("Annual Interest Rate: ",  1 , 30);

        years = (byte)readNumber("Years", 1, 30);

        Float mortgage = (float)calculateMortgage(principle, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
    }
    public static double readNumber(String prompt, double min, double max){
        Scanner sc = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt + ": ");
            value = sc.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a number between "+ min + "and " + max);
        }
        return value;
    }
    public static double calculateMortgage(int principle, float annualInterest, int years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInsterset = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principle
                * (monthlyInsterset * Math.pow(monthlyInsterset + 1 , numberOfPayments))
                / (Math.pow(1 + monthlyInsterset, numberOfPayments) - 1);
        return  mortgage;

    }
}
