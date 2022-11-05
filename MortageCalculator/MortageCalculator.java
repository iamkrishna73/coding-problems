package MortageCalculator;
import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class MortageCalculator {
    public static void main(String [] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        float monthlyInsterset = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years  = sc.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        System.out.print("Mortgage: ");
        Double mortgage = (principle
                * (monthlyInsterset * Math.pow(monthlyInsterset + 1 , numberOfPayments)))
                / (Math.pow(1 + monthlyInsterset, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print(mortgageFormatted);


    }
}