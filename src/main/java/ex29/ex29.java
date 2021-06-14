/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex29;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String check;
        while(!input.hasNextInt() && Integer.parseInt(String.valueOf(input)) != 0) {
            System.out.print("What is the rate of return? ");
            check = input.nextLine();
            if(!input.hasNextInt() || Integer.parseInt(check) == 0) System.out.println("Not a valid input.");
        }

    }
}
