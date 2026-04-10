package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int selectedOperation = 0;
        double firstNum = 0;
        double secondNum = 0;
        double resultNum = 0;

        System.out.println("Welcome to the basic calculator application. Please start by selecting an operation. \n");

        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication\n4. Division \n");

        System.out.println("Enter your selection: ");
        try {
            selectedOperation = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("\nPlease enter a valid operation (1-4) next time.");
            System.exit(0);
        }

        //test
        //System.out.println(selectedOperation);

        if (selectedOperation == 1) {
            System.out.println("\nPlease enter the two numbers you would like to add: ");
            try {
                System.out.println("\nFirst number: ");
                firstNum = input.nextDouble();
                input.nextLine();

                System.out.println("\nSecond number: ");
                secondNum = input.nextDouble();

                resultNum = firstNum + secondNum;

                System.out.printf("\nThe sum of %f and %f is %f", firstNum, secondNum, resultNum);
            }
            catch (Exception e) {
                System.out.println("\nPlease enter valid numbers next time.");
            }
        }
        else if (selectedOperation == 2) {
            System.out.println("\nPlease enter the two numbers you would like to subtract: ");
            try {
                System.out.println("\nFirst number: ");
                firstNum = input.nextDouble();
                input.nextLine();

                System.out.println("\nSecond number: ");
                secondNum = input.nextDouble();

                resultNum = firstNum - secondNum;

                System.out.printf("\nThe difference of %f and %f is %f", firstNum, secondNum, resultNum);
            }
            catch (Exception e) {
                System.out.println("\nPlease enter valid numbers next time.");
            }
        }
        else if (selectedOperation == 3) {
            System.out.println("\nPlease enter the two numbers you would like to multiply: ");
            try {
                System.out.println("\nFirst number: ");
                firstNum = input.nextDouble();
                input.nextLine();

                System.out.println("\nSecond number: ");
                secondNum = input.nextDouble();

                resultNum = firstNum * secondNum;

                System.out.printf("\nThe product of %f and %f is %f", firstNum, secondNum, resultNum);
            }
            catch (Exception e) {
                System.out.println("\nPlease enter valid numbers next time.");
            }
        }
        else if (selectedOperation == 4) {
            System.out.println("\nPlease enter the two numbers you would like to divide: ");
            try {
                System.out.println("\nFirst number: ");
                firstNum = input.nextDouble();
                input.nextLine();

                System.out.println("\nSecond number: ");
                secondNum = input.nextDouble();

                resultNum = firstNum / secondNum;

                System.out.printf("\nThe quotient of %f and %f is %f", firstNum, secondNum, resultNum);
            }
            catch (Exception e) {
                System.out.println("\nPlease enter valid numbers next time.");
            }
        }
        else {
            System.out.println("\nPlease enter a valid operation (1-4) next time.");
        }

        input.close();





    }
}