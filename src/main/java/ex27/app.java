/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex27;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name. ");
        String firstname = input.nextLine();

        System.out.print("Enter the last name. ");
        String lastname = input.nextLine();

        System.out.print("Enter the zip code. ");
        String zip = input.nextLine();

        System.out.print("Enter the employee ID. ");
        String id = input.nextLine();

        validateInput(firstname, lastname, zip, id);
    }

    public static void validateInput(String firstName, String lastName, String zip, String id){
        int testingVar, errCount = 0;

        testingVar = nameLength(firstName);
        if(testingVar == 1) {
            System.out.println("First Name must be filled in.");
            errCount++;
        }
        else if (testingVar == 2) {
            System.out.println("First name must be at least 2 characters.");
            errCount++;
        }

        testingVar = nameLength(lastName);
        if(testingVar == 1) {
            System.out.println("Last Name must be filled in.");
            errCount++;
        }
        else if (testingVar == 2) {
            System.out.println("Last name must be at least 2 characters.");
            errCount++;
        }

        testingVar = zipNum(zip);
        if(testingVar == -1) {
            System.out.println("Zip is not five digits long.");
            errCount++;
        }
        else if (testingVar == 1) {
            System.out.println("Zip must be a number. ");
            errCount++;
        }

        testingVar = idCheck(id);
        if(testingVar == 0) {
            System.out.println("Employee ID must be in the format AA-1234.");
            errCount++;
        }

        if(errCount == 0) System.out.println("No errors found.");

    }

    public static int nameLength(String name) {
        if(name.length() >= 2) return 0;
        if(name.length() == 0) return 1;
        else return 2;
    }

    public static int zipNum(String zip){
        if(zip.length() != 5) return -1;

        try{
            Integer.parseInt(zip);
            return 0;
        }
        catch(NumberFormatException e) {
            return 1;
        }
    }

    public static int idCheck(String identifier){
        char[] id = identifier.toCharArray();

        if(id.length != 7){
            return 1;
        }

        for(int i = 0; i < id.length; i++){
            if(i <= 1){
                if(!Character.isLetter(id[i])) return 1;
            }
            if(i == 2){
                if(id[i] != '-') return 1;
            }
            if(i > 2){
                if(!Character.isDigit(id[i])) return 1;
            }
        }

        return 0;
    }
}
