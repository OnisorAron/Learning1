package com.company.learning;

import java.util.Scanner;

class AdvancedAverage {
    void startAdvancedAverage() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many kids are in the class? ");
        float sum = 0;
        int num = 0;
        int n = scanner.nextInt();
        int m = n;
        int i, j;
        String[] names = new String[n];
        int[] grades = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("names[" + i + "]=");
            names[i] = scanner1.next();
        }
        for (j = 0 ; j < m ; j++) {
            System.out.println("grades[" + j + "]=");
            grades[j] = scanner2.nextInt();
            sum = sum + grades[j];
            num++;
        }
        int average = (int) (sum / num);
        System.out.println("The class average is " + average);
        System.out.println("Kids whose average is above the class average: ");
        for (j = 0 ; j < m ; j++) {
            if (grades[j] > average) {
                i = j;
                System.out.println(names[i] + " " + grades[j]);
            }
        }
        System.out.println("Kids whose average is below the class average: ");
        for (j = 0 ; j < m ; j++) {
            if (grades[j] < average) {
                i = j;
                System.out.println(names[i] + " " + grades[j]);
            }
        }
        System.out.println("Kids whose average equals the class average: ");
        for (j = 0 ; j < m ; j++) {
            if (grades[j] == average) {
                i = j;
                System.out.println(names[i] + " " + grades[j]);
            }
        }
    }
}