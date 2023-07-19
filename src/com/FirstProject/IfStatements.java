package com.FirstProject;

import java.util.Scanner;

public class IfStatements {

    public static void  ifStatement() {
        //Tempeture indicator
        final byte mediumtemp = 20;
        final byte hightemp = 30;

        //In
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to... Tempeture indicator");
        System.out.print("Add tempeture: ");
        int temp = scanner.nextInt();

        //Validations
        if(temp > hightemp) {
            int id = 1;
            switch (id) {
                case 1:
                    System.out.println("It´s a hoy day");
                    System.out.println("Drink plenty of water");
                    break;
                case 2:
                    System.out.println("It´s a very nice day!!");
                    break;
                default:
                    System.out.println("Sems to be getting cold, wear warm clothes");
            }
        }
        else if (temp > mediumtemp) {
            int id = 2;
            switch (id) {
                case 1:
                    System.out.print("It´s a hoy day");
                    System.out.print("Drink plenty of water");
                    break;
                case 2:
                    System.out.println("It´s a very nice day!!");
                    break;
                default:
                    System.out.println("Sems to be getting cold, wear warm clothes");
            }
        }
        else {
            int id = 3;
            switch (id) {
                case 1:
                    System.out.print("It´s a hoy day");
                    System.out.print("Drink plenty of water");
                    break;
                case 2:
                    System.out.println("It´s a very nice day!!");
                    break;
                default:
                    System.out.println("Sems to be getting cold, wear warm clothes");
            }
        }
    }
}
