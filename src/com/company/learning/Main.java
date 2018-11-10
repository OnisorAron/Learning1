package com.company.learning;

import java.util.Scanner;

public class Main {

    //TODO: Why do you expect this method to return a String? It should not return anything, it should just start the
    //TODO: guessing game. Also, consider giving it a better name as we might create other games later on.
    //TODO: Why did you make this method public? It should never be accessed from outside this class, so it should be private.
    //TODO: Lastly, you could simply write "(new GuessingGame()).startGame() in the main function - don't write methods
    //TODO: that only have a single line."
    public static String startGame() {
        GuessingGame game = new GuessingGame();
        return game.startGame();
    }

    //TODO: Method should be private, pay attention to Lint warnings (the yellow highlight).
    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //TODO: Properly display the options for the user so they can know how to use the menu.
    public static void main(String[] args) {
        int n = readNumber();
        if (n == 1) {
            //TODO: I suppose you wanted to call the startGame() method here.
        }
    }

}
