package edu.main;

import java.util.Scanner;

public class LoopBody {
    public static void main(String[] args) {
        int sum, next;
        sum = 0;

        do {
            System.out.println("Enter a number: ");
            Scanner keyboard = new Scanner(System.in); // Getting input from keyboard
            next = keyboard.nextInt();
            sum = sum + next;
            System.out.println("Total is : " + sum);
        } while (next != 0);
    }
}
