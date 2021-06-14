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
        System.out.printf("The total is %d.", array[0] + array[1] + array[2] + array[3] + array[4]);
    }

    public static int input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        return num;
    }
}
