/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex37;

import java.util.Scanner;
import java.util.Random;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the minimum length? ");
        int minLen = input.nextInt();

        System.out.print("How many numbers? ");
        int num = input.nextInt();

        System.out.print("How many special characters? ");
        int spec = input.nextInt();

        System.out.printf("Your password is %s", passwordGen(minLen, num, spec));
    }

    public static String passwordGen(int minLen, int num, int spec){
        Random rand = new Random();

        int numNums = 0, numSpec = 0, rng;
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < findLength(minLen, num, spec); i++){
            rng = rand.nextInt(3);
            if((rng == 1) && (numNums < num)){
                rng = rand.nextInt(10);
                password.append(returnNum(rng));
                numNums++;
            }
            else if((rng == 2) && (numSpec < spec)){
                rng = rand.nextInt(31);
                password.append(returnSpecial(rng));
                numSpec++;
            }
            else{
                rng = rand.nextInt(26);
                password.append(returnLetter(rng));
            }
        }

        return password.toString();


    }

    public static char returnLetter(int num){
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return letters[num];
    }

    public static char returnNum(int num){
        char[] numbers = "0123456789".toCharArray();
        return numbers[num];
    }
    public static char returnSpecial(int num){
        char[] special = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~".toCharArray();
        return special[num];
    }
    public static int findLength(int minLen, int num, int spec){
        int length = (num + spec) * 2;
        while(length < minLen) length++;
        return length;
    }
}
