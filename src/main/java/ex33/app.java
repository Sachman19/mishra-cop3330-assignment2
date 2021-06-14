/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your question?\n> ");
        input.nextLine();

        int answer = rng();

        switch(answer){
            case 0: System.out.println("Yes.");
                break;
            case 1: System.out.println("No.");
                break;
            case 2: System.out.println("Maybe.");
                break;
            default: System.out.println("Ask later.");
        }
    }

    public static int rng(){
        Random rand = new Random();
        return rand.nextInt(4);
    }
}