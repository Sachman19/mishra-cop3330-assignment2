/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex32;

import java.util.Scanner;
import java.util.Random;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cont = "y";

        System.out.println("Lets play \"Guess the Number!\"");
        System.out.println();
        while(!cont.equals("n") && !cont.equals("N")){
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int diff = input.nextInt();
            guessTheNumber(diff);

            input.nextLine();
            System.out.print("Do you wish to play again? ");
            cont = input.nextLine();
        }
    }

    public static void guessTheNumber(int diff){
        Scanner input = new Scanner(System.in);

        if(diff != 1 && diff != 2 && diff != 3){
            System.out.println("Error. Invalid Input");
            return;
        }
        Random rand = new Random();

        int range = findRange(diff);
        int answer = rand.nextInt(range);

        System.out.printf("I am thinking of a number between 0 and %d\n", (int)Math.pow(10, diff));

        int guess = 1001, count = 0;
        while(guess != answer){
           count++;

           System.out.print("What is your guess? ");
           guess = input.nextInt();

           if(guess < answer){
               System.out.println("Too low. Try again.");
           }
           else if(guess > answer){
               System.out.println("Too high. Try again.");
           }
        }
        System.out.printf("You got it in %d guesses\n\n", count);
    }

    public static int findRange(int diff){
        return (int)Math.pow(10, diff);
    }
}
