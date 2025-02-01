package simpleinterestcalculator;

import java.util.Scanner;

/**
 * A simple Java program to calculate Simple and Compound Interest.
 */
public class SimpleInterestCalculator {

    /**
     * Method to calculate simple interest.
     * Formula: SI = (P * R * T) / 100
     */
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    /**
     * Method to calculate compound interest.
     * Formula: CI = P * (1 + R/100)^T - P
     */
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Taking user input for principal, rate, and time
            System.out.print("Enter Principal Amount: ");
            double principal = input.nextDouble();
            
            System.out.print("Enter Annual Interest Rate (in %): ");
            double rate = input.nextDouble();
            
            System.out.print("Enter Time Period (in years): ");
            double time = input.nextDouble();

            if (principal < 0 || rate < 0 || time < 0) {
                System.out.println("Error: Principal, Rate, and Time must be non-negative values.");
            } else {
                // Calculating and displaying simple and compound interest
                double simpleInterest = calculateSimpleInterest(principal, rate, time);
                double compoundInterest = calculateCompoundInterest(principal, rate, time);

                System.out.printf("Simple Interest: %.2f\n", simpleInterest);
                System.out.printf("Compound Interest: %.2f\n", compoundInterest);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numerical values.");
        } finally {
            input.close();
        }
    }
}
