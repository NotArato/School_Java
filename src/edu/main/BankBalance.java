package edu.main;

import java.util.Scanner;

/*
    Getting input value from keyboard and checking if the balance is higher or equal to zero, lower than zero
    If balance is higher or equal to zero we replace the amount of balance with Balance + (Interest Rate multiply by input value of Balance)
    If balance is lower than zero we replace the balance with Balance minus Overdrawn Penalty which is 8
*/

public class BankBalance {
    public static final double OVERDRAWN_PENALTY = 8.00;
    public static final double INTEREST_RATE = 0.02;    // 2% Annually

    public static void main(String[] args) {
        double balance;
        System.out.print("Enter your checking account balance: $");
        Scanner keyboard = new Scanner(System.in);
        balance = keyboard.nextDouble();    // We got balance from the line 13 which is getting input from keyboard
        System.out.println("Original balance $" + balance);
        if (balance >= 0)
            balance = balance + (INTEREST_RATE * balance) / 12; // Replace the value of balance
        else
            balance = balance - OVERDRAWN_PENALTY;
        System.out.print("After adjusting for one month ");
        System.out.println("of interest and penalties,");
        System.out.println("your new balance is $" + balance);
    }
}
