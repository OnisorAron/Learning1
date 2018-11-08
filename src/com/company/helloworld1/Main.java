package com.company.helloworld1;

import java.util.Scanner;

public class Main {

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printHelloWorld(int number) {
        System.out.println("Hello World!" + number + " ");
    }

    public static void main(String[] args) {
        System.out.println("Irj be egy szamot: ");
        int n=readInt();
       for ( int i=1 ; i<=n ; i++ ) {
        printHelloWorld(i);

       }
    }
}
