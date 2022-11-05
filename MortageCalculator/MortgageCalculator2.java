package MortageCalculator;
import java.util.Scanner;

public class MortgageCalculator2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int principle = 0;
        float annualInterest = 0;
        int years = 0;
        while(true){
            System.out.print("Principle ($1K - $1M): ");
            principle = sc.nextInt();
            if(principle > 1000 && principle <= 1000000){
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterest = sc.nextFloat();
            if(annualInterest > 0 && annualInterest <= 30){
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        while(true){
            System.out.print("Period (Years): ");
            years  = sc.nextInt();
            if(years > 0 && years <= 30) {
                break;
            }
            System.out.println("Enter a value between 0 to 30.");
        }
        System.out.print("Mortgage: ");
        System.out.print(calculateMortgage(principle, annualInterest, years));
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
