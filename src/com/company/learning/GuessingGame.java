package com.company.learning;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static final int LIFE_COUNT = 5;
    private static final int MAXIMUM_NUMBER = 100;

    public static void startGame() {

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
        boolean jo = false;
        for (int i = 0; i < LIFE_COUNT && !jo ; i++) {
            int x = readInt();
            if (x == n) {
                jo = true;
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
            if (i == 4) {
                System.out.println(username + ", " + "nem talaltad el 5 probalkozasbol!");
                System.out.println("Sajnalom!");
                System.out.println("A helyes valasz: " + n);
            }
        }
    }
}