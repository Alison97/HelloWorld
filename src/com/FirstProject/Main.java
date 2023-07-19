package com.FirstProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mortgage calculator
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        //get the amount
        System.out.print("Enter the required amount: ");
        int amount = scanner.nextInt();

        //get the anual interest rate
        System.out.print("Annual interest rate: ");
        float monthlyInterestRate = ((scanner.nextFloat()/percent)/monthsInYear);

        //get the time (Years)
        System.out.print("Enter Periods (Years): ");
        int periodInMonths = scanner.nextInt() *monthsInYear;

        //get Mortgage
        float power  = (float) Math.pow((1 +monthlyInterestRate),periodInMonths);
        Float mortgageResult = amount * (monthlyInterestRate * power) / ( power - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(mortgageResult);
        System.out.println("Your calculated mortgage is: " + currencyResult);


    }
}