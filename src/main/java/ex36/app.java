/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex36;

import java.util.Scanner;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String entry;

        while(true){
            System.out.print("Enter a Number: ");
            entry = input.nextLine();
            if(entry.isBlank()){
                break;
            }
            else if(entry.matches("[0-9]+")) numbers.add(Integer.parseInt(entry));
            else System.out.println("Error. Invalid Input");
        }

        System.out.print("Numbers: ");
        for (Integer number : numbers) {
            System.out.printf("%d, ", number);
        }
        System.out.printf("The average is %f", average(numbers));
        System.out.printf("The max is %d", max(numbers));
        System.out.printf("The min is %d", min(numbers));
        System.out.printf("The standard deviation is %f", std(numbers));
    }

    public static double average(ArrayList<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum/numbers.size();
    }

    public static int max(ArrayList<Integer> numbers){
        int max = numbers.get(0);

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static int min(ArrayList<Integer> numbers){
        int min = numbers.get(0);

        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public static double std(ArrayList<Integer> numbers){
        double mean = average(numbers);
        double[] nums = new double[numbers.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.pow(numbers.get(i) - mean, 2); //Subtract mean then square.
        }

        mean = 0;
        for (double num : nums) {
            mean += num;//Find mean of new number set
        }
        mean /= nums.length;

        return Math.round(Math.sqrt(mean) * 100.0)/100.0;
    }
}
