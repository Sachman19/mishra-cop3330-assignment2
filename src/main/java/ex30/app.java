/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex30;

public class app {
    public static void main(String[] args) {
        multTable();
    }

    public static void multTable(){
        for(int i = 1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                for(int k = 0; k < 5 - numDigits(i, j); k++){
                    System.out.print(" ");
                }
                System.out.printf("%d", i * j);
                if(j == 12){
                    System.out.println();
                }
            }
        }
    }

    public static int numDigits(int i, int j){
        int numStart = i * j, count = 0;
        while(numStart != 0){
            count++;
            numStart /= 10;
        }
        return count;
    }
}
