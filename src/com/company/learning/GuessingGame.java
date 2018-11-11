package com.company.learning;

import java.util.Random;
import java.util.Scanner;

//TODO: None of these methods should be static! You will create an instance of this object.
public class GuessingGame {
    private static final int LIFE_COUNT = 5;
    private static final int MAXIMUM_NUMBER = 100;

    //TODO: Pay attention to Lint warnings. This should be package-private. Read about access modifiers in Java if
    //TODO: you don't understand them.
    public static void startGuessingGame() {
        System.out.println("Guessing Game started.");
    }

    private static String readString() {
        //TODO: (3) Now that you're using Scanner multiple times, it's wasteful to initialize it instead of re-using the same instance.
        //TODO: Create a Scanner instance in the main method and use it over and over again. That will make the readString() and
        //TODO: readInt() methods useless so feel free to delete them, they have served their purpose.
        Scanner enterUsername = new Scanner(System.in);
        return enterUsername.next();
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Username: ");
        final String username = readString();
        System.out.println("Jatekot fogunk jatszani! :)");
        System.out.println("Irj be egy szamot: ");
        final Random rand = new Random();
        int n = rand.nextInt(MAXIMUM_NUMBER) + 1;
        //TODO: Always use English for naming variables, functions and classes.
        boolean jo = false;
        int i;
        //TODO: You should not make "jo" part of the for loop's condition, you should check it's value afterwards
        //TODO: instead, to see which message to display to the user.
        for (i = 0; i < LIFE_COUNT && !jo ; i++) {
            int x = readInt();
            if (x == n) {
                jo = true;
                //TODO: Why don't you break the loop here? And move displaying the message after the loop.
                System.out.println(username + ", " + "Szerencsed volt es eltalaltad! Gratula");
            }
            if (i == 0 && x == n) {
                break;
            }
            if (x < n) {
                System.out.println("A generalt szam nagyobb.");
            }
            if (x > n) {
                System.out.println("A generalt szam kisebb.");
            }
            //TODO: Very bad idea to leave this condition within the for loop. Why don't you move it after it?
            //TODO: The for loop should end here.
        }
        if (i == 4) {
            System.out.println(username + ", " + "nem talaltad el 5 probalkozasbol!");
            System.out.println("Sajnalom!");
            System.out.println("A helyes valasz: " + n);
        }
    }
}