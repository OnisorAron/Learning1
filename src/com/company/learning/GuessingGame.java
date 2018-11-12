package com.company.learning;

import java.util.Random;
import java.util.Scanner;

class GuessingGame {

    private static final int LIFE_COUNT = 5;
    private static final int MAXIMUM_NUMBER = 100;

    void startGuessingGame() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Guessing Game started.");
        System.out.println("Username: ");
        final String username = scanner.next();
        final Random rand = new Random();
        final int n = rand.nextInt(MAXIMUM_NUMBER) + 1;
        System.out.println("Jatekot fogunk jatszani! :)");
        System.out.println("Irj be egy szamot: ");
        boolean go = false;
        int i;
        //TODO: You should not make "jo" part of the for loop's condition, you should check it's value afterwards instead, to see which message to display to the user.
        for (i = 0 ; i < LIFE_COUNT && !go ; i++) {
            int guess = scanner.nextInt();
            if (guess == n) {
                go = true;
                //TODO: Why don't you break the loop here? And move displaying the message after the loop.
                System.out.println(username + ", " + "Szerencsed volt es eltalaltad! Gratula");
            }
            if (i == 0 && guess == n) {
                break;
            }
            if (guess < n) {
                System.out.println("A generalt szam nagyobb.");
            }
            if (guess > n) {
                System.out.println("A generalt szam kisebb.");
            }
            //TODO: Very bad idea to leave this condition within the for loop. Why don't you move it after it? The for loop should end here.
        }
        if (i == 4 ) {
            System.out.println(username + ", " + "nem talaltad el 5 probalkozasbol!");
            System.out.println("Sajnalom!");
            System.out.println("A helyes valasz: " + n);
        }
    }
}