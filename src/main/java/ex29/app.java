/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex29;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        int num = NumCheck();

        System.out.printf("It will take %d years to double your initial investment", 72/num);
    }

    public static int NumCheck() {
        Scanner input = new Scanner(System.in);

        String in;
        while(1 == 1){
            System.out.print("Please enter a number. ");
            in = input.next();
            if(in.matches("[0-9]+") && !in.matches("[0]")){
                break;
            }
            else System.out.println("Error, invalid input.");
        }

        return Integer.parseInt(in);
    }
}
