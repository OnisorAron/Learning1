package com.company.learning;

import java.util.Scanner;

public class Main {

    public static String startGame() {
        GuessingGame game = new GuessingGame();
        return game.startGame();
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int n = readNumber();
        if (n == 1) {

        }
    }

}
