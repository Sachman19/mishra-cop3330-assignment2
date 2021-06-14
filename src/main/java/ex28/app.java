/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex28;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {0, 0, 0, 0, 0};

        for(int i = 0; i < 5; i++){
            array[i] = input();
        }
        int result = add(array[0], array[1], array[2], array[3], array[4]);
        System.out.printf("The total is %d.",result);
    }

    public static int input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int add(int a1, int a2, int a3, int a4, int a5){
        return a1 + a2 + a3 + a4 + a5;
    }
}
