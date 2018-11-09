package com.company.helloworld1;

import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final int LIFE_COUNT=5;
    private static final int MAXIMUM_NUMBER=100;

    private static String readString() {
        Scanner enterUsername = new Scanner(System.in);
        return enterUsername.next();
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Username: ");
        String username = readString();
        System.out.println("Jatekot fogunk jatszani! :)");
        System.out.println("Irj be egy szamot: ");
        final Random rand = new Random();
        int n=rand.nextInt(MAXIMUM_NUMBER) + 1;
        for ( int i=0 ; i<LIFE_COUNT ; i++ ) {
            int x=readInt();
            if (i==0 && x==n) {
                break;
            }
            if (x<n) {
                System.out.println("A generalt szam nagyobb.");
            }
            if (x>n) {
                System.out.println("A generalt szam kisebb.");
            }
            if (x==n) {
                System.out.println( username + ", " + "Szerencsed volt es eltalaltad! Gratula");
                break;
            }
            if (i==4) {
                System.out.println( username + ", " + "nem talaltad el 5 probalkozasbol!");
                System.out.println("Sajnalom!");
            }
        }
    }
}
