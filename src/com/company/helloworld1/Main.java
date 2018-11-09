//TODO: (1) Refactor your package name to something more meaningful, like "com.aron.learning".
//TODO: Use IntelliJ's refactoring feature as this change also needs to affect the way your files are organized into folders.
package com.company.helloworld1;

import java.util.Scanner;
import java.util.Random;

public class Main {

    //TODO: (2) Always format your code before pushing to the remote.
    //TODO: You can do this in the commit dialog, or using CTRL + Shift + L.
    private static final int LIFE_COUNT=5;
    private static final int MAXIMUM_NUMBER=100;

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
        //TODO: (4) The username should never change after being initialized, so it should be final.
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
            //TODO: (5) You could improve the readability of this. It would be a better idea to move the validation logic
            //TODO: after the for loop, that way you don't have to check if this is the last iteration. Also, it might be
            //TODO: simpler to keep a boolean flag that stores whether or not the user has successfully guessed the number.
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
