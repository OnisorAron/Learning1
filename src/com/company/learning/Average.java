package com.company.learning;

import java.util.Scanner;

class Average {
    void startAverage() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("How many elements would you like for the array to contain? ");
        int n = scanner.nextInt();
        int sum = 0;
        int num = 0;
        int [] a = new int[n];
        for (int i = 0 ; i < n ; i++ ) {
            System.out.print("a[" + i + "]=");
            a[i] = scanner1.nextInt();
            sum = sum + a[i];
            num++;
        }
        int average = sum / num;
        System.out.println("The average of those numbers is: " + average);
    }
}
