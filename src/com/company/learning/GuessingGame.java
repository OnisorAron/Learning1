package com.company.learning;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class GuessingGame {

    private static final int LIFE_COUNT = 5;
    private static final int MAXIMUM_NUMBER = 1;

    void startGuessingGame() {
        try {
            final Scanner scanner = new Scanner(System.in);
            System.out.println("Guessing Game started.");
            System.out.println("Username: ");
            final String username = scanner.next();
            final Random rand = new Random();
            final int n = rand.nextInt(MAXIMUM_NUMBER) + 1;
            System.out.println("Enter a number: ");
            boolean go = false;
            int i;
            for (i = 0; i < LIFE_COUNT; i++) {
                int guess = scanner.nextInt();
                if (guess == n) {
                    go = true;
                    break;
                }
                if (guess < n) {
                    System.out.println("The generated number is higher.");
                }
                if (guess > n) {
                    System.out.println("The generated number is lower.");
                }
            }
            if (go) {
                System.out.println(username + ", " + "You guessed it!");
            }
            if (i > 4) {
                System.out.println(username + ", " + "you did not guess it within 5 tries.");
                System.out.println("Sorry!");
                System.out.println("The correct answer: " + n);
            }
        } catch(InputMismatchException ex1) {
            System.out.println("Input is not a valid number. Try again.");
        }
    }
}