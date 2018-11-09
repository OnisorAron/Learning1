package com.company.helloworld1;

import java.util.Scanner;
import java.util.Random;

public class Main {

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Jatekot fogunk jatszani! :)");
        System.out.println("Irj be egy szamot: ");
        Random rand = new Random();
        int n=rand.nextInt(100) + 1;
        for ( int i=1 ; i<=5 ; i++ ) {
            int x=readInt();
            if (x<n) {
                System.out.println("A generalt szam nagyobb.");
            }
            if (x>n) {
                System.out.println("A generalt szam kisebb.");
            }
            if (x==n) {
                System.out.println("Szerencsed volt es eltalaltad");
            }
            if (i==5) {
                System.out.println("Nem talaltad el 5 probalkozasbol!");
                System.out.println("Sajnalom!");
            }
        }
    }
}
