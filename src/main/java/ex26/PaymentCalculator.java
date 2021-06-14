/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex26;

import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double bal = input.nextInt();

        System.out.print("What is the APR on the card (percent)? ");
        double apr = input.nextInt();

        System.out.print("What is the monthly payment? ");
        double pay = input.nextInt();

        System.out.printf("It will take you %d months to pay off this card.", calculateMonthsUntilPaidOff(bal, apr, pay));

    }

    public static int calculateMonthsUntilPaidOff(double bal, double apr, double pay){
       // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        apr = apr / 36500;

        return (int) ( Math.round( (-1.0/30.0) * Math.log(1 + bal/pay * (1 - Math.pow((1 + apr), 30))) / Math.log(1 + apr)) + 1); //Adding one at the end accounts for the first repayment, which the calculation doesnt account for. idk why.

    }
}
