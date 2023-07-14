package com.FirstProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mortgage calculator

        //get the amount
        System.out.print("Enter the required amount: ");
        Scanner amountScanner = new Scanner (System.in);
        Integer amount = amountScanner.nextInt();

        //get the anual interest rate
        System.out.print("Annual interest rate: ");
        Scanner interestScanner = new Scanner(System.in);
        Float monthlyInterestRate = ((interestScanner.nextFloat()/100)/12);

        //get the time (Years)
        System.out.print("Enter Periods (Years): ");
        Scanner periodScanner = new Scanner(System.in);
        Integer periodInMonths = (periodScanner.nextInt()*12);

        //get Mortgage
        float power  = (float) Math.pow((1 +monthlyInterestRate),periodInMonths);
        Float mortgageResult = amount * (monthlyInterestRate * power) / ( power - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(mortgageResult);
        System.out.println("Your calculated mortgage is: " + currencyResult);


    }
}