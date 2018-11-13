package com.company.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String n = "1";
        while (!n.equals("0")) {
            System.out.println("Select a program to start:");
            System.out.println(" 0 - Exit");
            System.out.println(" 1 - Hello World program");
            System.out.println(" 2 - Guessing game");
            System.out.println(" 3 - Average of 'n' numbers");
            System.out.println(" 4 - Checks if a string is palindrome");
            System.out.println(" 5 - Advanced average calculation + bonus sort");
            Scanner scanner = new Scanner(System.in);
                n = scanner.next();
                switch (n) {
                    case "0":
                        System.out.println("Exiting...");
                        break;
                    case "1":
                        System.out.println("Starting default program...");
                        (new HelloWorld()).startHelloWorld();
                        break;
                    case "2":
                        System.out.println("Starting the game...");
                        (new GuessingGame()).startGuessingGame();
                        break;
                    case "3":
                        System.out.println("Starting the program...");
                        (new Average()).startAverage();
                        break;
                    case "4":
                        System.out.println("Starting the program...");
                        (new Palindrome()).startPalindrome();
                        break;
                    case "5":
                        System.out.println("Starting the program...");
                        (new AdvancedAverage()).startAdvancedAverage();
                        break;
                    default :
                        System.out.println("Wrong Input. Try again.");
                }
        }
    }
}