package com.company.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select a program to start:");
        System.out.println(" 1 - Guessing game");
        switch (readNumber()) {
            case 1:
                (new GuessingGame()).startGuessingGame();
                break;
        }
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}