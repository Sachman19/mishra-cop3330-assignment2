/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex35;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String temp = "a";
        int i = 0;
        
        while(!temp.equals("")){
            temp = input.nextLine();
            if(!temp.equals("")){
                names.add(temp);
            }
            i++;
        }
        int winner = pickAWinner(i);
        System.out.printf("The winner is %s!", names.get(winner));

    }

    public static int pickAWinner(int range){
        Random rand = new Random();
        return rand.nextInt(range);
    }
}
