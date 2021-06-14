/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words and I'll tell you if they are anagrams.");

        System.out.print("Enter the first word. ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word. ");
        String word2 = input.nextLine();

        if(isAnagram(word1, word2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1, word2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1, word2);
        }

    }

    public static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] array1 = word1.toCharArray();
        Arrays.sort(array1);

        char[] array2 = word2.toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
