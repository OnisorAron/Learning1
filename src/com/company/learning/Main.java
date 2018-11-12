package com.company.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        while (n!=0) {
            System.out.println("Select a program to start:");
            System.out.println(" 0 - Exit");
            System.out.println(" 1 - Hello World program");
            System.out.println(" 2 - Guessing game");
            try {
                 n = readNumber();
                switch (n) {
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    case 1:
                        System.out.println("Starting default program...");
                        (new HelloWorld()).startHelloWorld();
                        break;
                    case 2:
                        System.out.println("Starting the game...");
                        (new GuessingGame()).startGuessingGame();
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Wront Input. Try again.");
            }
        }
    }
    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}