/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex38;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a list of numbers separated by spaces: ");
        String numbers = input.nextLine();

        //numbers = numbers.replaceAll(" ", "");
        String[] stringArray = numbers.split(" ");
        int[] numArray = new int[stringArray.length]; //numbers.toCharArray();
        for(int i = 0; i < stringArray.length; i++){
            numArray[i] = Integer.parseInt(stringArray[i]);
        }

        numArray = filterEvenNumbers(numArray);

        System.out.print("The even numbers are: ");
        for (int c : numArray) {
            System.out.printf("%d ", c);
        }
    }

    public static int[] filterEvenNumbers(int[] numArray){
        int i , j = 0, evenCount = 0;

        for(i = 0; i < numArray.length; i++) {
            if(numArray[i] % 2 == 0) evenCount++;
        }

        int[] newArray = new int[evenCount];

        for(i = 0; i < numArray.length; i++){
            if(numArray[i] % 2 == 0) newArray[j++] = numArray[i];
        }
        return newArray;
    }
}
