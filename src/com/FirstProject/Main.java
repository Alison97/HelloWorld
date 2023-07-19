package com.FirstProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static IfStatements prueba = new IfStatements();

    public static void main(String[] args) {
        prueba.ifStatement();
        System.out.println("End of if Statement exercices");

        //Mortgage calculator
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        //get the amount

        //obtener el valor a prestar ingresado por el usuario
        System.out.println("Mortgage calculator");
        System.out.print("Enter the required amount: ");
        int amount = scanner.nextInt();
        boolean amountCheck = false;
        boolean monthlyInterestRateCheck = false;
        boolean periodInMonthsCheck = false;

        while (!amountCheck) {
            //validar que cumpla con el rango establecido
            if (amount >= 1_000 && amount <= 1_000_000) {
                amountCheck = true;
                //si cumple se pide la tasa ea
                //get the anual interest rate
                System.out.print("Annual interest rate: ");
                float monthlyInterestRate = ((scanner.nextFloat() / percent) / monthsInYear);
                //validar si la tasa está dentro del rango establecido
                while (!monthlyInterestRateCheck) {
                    if (monthlyInterestRate != 0 && monthlyInterestRate != 30.0) {
                        monthlyInterestRateCheck = true;
                        // si cumple se pide que ingrese los periodos en años
                        //get the time (Years)
                        System.out.print("Enter Periods (Years): ");
                        int periodInMonths = scanner.nextInt() * monthsInYear;
                        //validar si cumple con el rango de periodos establecidos

                        while (!periodInMonthsCheck) {
                            if (periodInMonths >= 120 && periodInMonths <= 480) {
                                periodInMonthsCheck = true;
                                // si cumple se realiza el cálculo de Mortgage
                                //get Mortgage
                                float power = (float) Math.pow((1 + monthlyInterestRate), periodInMonths);
                                Float mortgageResult = amount * (monthlyInterestRate * power) / (power - 1);
                                NumberFormat currency = NumberFormat.getCurrencyInstance();
                                String currencyResult = currency.format(mortgageResult);
                                System.out.println("Your calculated mortgage is: " + currencyResult);
                            }
                            // no cumple se solicita que ingrese nuevamente el periodo dentro del rango definido
                            else {
                                System.out.println("Enter periods beteween 5 and 40 years");
                                System.out.print("Enter Periods (Years): ");
                                periodInMonths = scanner.nextInt() * monthsInYear;
                            }
                        }

                    }
                    // no cumple se solicita ingresar de nuevo la tasa dentro del rango establecido
                    else {
                        System.out.println("Enter a value grater than 0 and less or equal to 30");
                        System.out.print("Annual interest rate: ");
                        monthlyInterestRate = ((scanner.nextFloat() / percent) / monthsInYear);
                    }
                }


            }
            //no cumple se solicita ingresar el monto según el rango definido
            else {
                System.out.println("Enter a number between 1.000 and 1.000.000");
                System.out.print("Enter the required amount: ");
                amount = scanner.nextInt();
            }
        }

    }
}
