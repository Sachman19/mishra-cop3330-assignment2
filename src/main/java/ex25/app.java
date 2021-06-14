/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex25;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your password? ");
        String password = input.nextLine();

        switch(passwordValidator(password)){
            case 0: System.out.printf("\"%s\" is a very weak password", password);
                break;
            case 1: System.out.printf("\"%s\" is a weak password", password);
                break;
            case 2: System.out.printf("\"%s\" is a strong password", password);
                break;
            case 3: System.out.printf("\"%s\" is a very strong password", password);
                break;
            default: System.out.println("Error with password"); //This should never trigger
        }

    }

    public static int passwordValidator(String password){
        int testCount;

        char[] test = password.toCharArray();

        /*try { //This is a roundabout way to test if the string is entirely numerical. If the parse int function does not throw an error, no point is given.
            int testVal = Integer.parseInt(password);
        } catch(NumberFormatException e) {
            testCount++;
        } */

        int isNum = 0,isAlp = 0, isOther = 0;
        for(int i = 0; i < test.length; i++) {
            if(Character.isDigit(test[i])) {
                isNum = 1;
            }
            else if (Character.isAlphabetic(test[i])) {
                isAlp = 1;
            }
            else if (!Character.isLetterOrDigit(test[i])){
                isOther = 1;
            }
            if(isNum == 1 && isAlp == 1 && isOther == 1) {
                break; //Early break if all flags are triggered
            }
        }

        //Assign Grades based off checks performed earlier
        if(isNum == 1 && isAlp == 0){
            testCount = 0;
        }
        else if(isNum == 0 && isAlp == 1){
            testCount = 1;
        }
        else if(isOther == 0 && password.length() >= 8){
            testCount = 2;
        }
        else if(isOther == 1 && password.length() >= 8){
            testCount = 3;
        }
        else{
            testCount = 0;
        }

        return testCount;
    }


}
