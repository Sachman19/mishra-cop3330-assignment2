/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex34;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin" };

        while(true){
        if(names.length == 0){
            System.out.println("You've fired all the employees.");
            break;
        }

        System.out.printf("There are %d employees:\n", names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\n", names[i]);
        }

        System.out.println();
        System.out.print("Choose an Employee to remove (enter \"cancel\" to end the program): ");
        String rmName = input.nextLine();
        if (rmName.equalsIgnoreCase("cancel")) {
            break;
        }

        names = removeName(names, rmName);

        }
    }

    public static String[] removeName(String[] names, String input){
        String[] returnArray = new String[names.length-1];

        int validInput = 0;
        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(input)){
                validInput = 1;
                break;
            }
        }

        if(validInput == 0){
            System.out.println("Error. Invalid Input.");
            return names;
        }

        int j = 0;
        for(int i = 0; i < names.length; i++){
            if(!names[i].equalsIgnoreCase(input)){
                returnArray[j++] = names[i];
            }
        }
        return returnArray;
    }
}
