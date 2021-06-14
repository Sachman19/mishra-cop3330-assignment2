/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex31;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Resting Heart Rate: ");
        int hr = input.nextInt();

        createTable(hr, age);
    }

    public static void createTable(int hr, int age){
        System.out.println("Intensity | Rate");
        System.out.println("----------|--------");

        int bpm;
        for(int i = 55; i <= 95; i += 5){
            System.out.printf("   %d%%    |", i);
            bpm = calcBPM(hr, age, i/100.0);
            System.out.printf(" %d bpm\n", bpm);
        }
    }
    public static int calcBPM(int hr, int age, double intensity){
        return (int) Math.round((((220 - age) - hr) * intensity) + hr);
    }
}
