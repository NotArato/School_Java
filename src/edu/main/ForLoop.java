package edu.main;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int next = sc.nextInt(); next != 0; next = sc.nextInt()) {
            System.out.println("Enter a number: ");
            sum = sum + next;
            System.out.println("Total is : " + sum);
        }

        // for(;;) {

        // System.out.println("Enter a number: ");
        // Scanner keyboard = new Scanner(System.in); // Getting input from keyboard
        // next = keyboard.nextInt();
        // sum = sum + next;
        // if (next == 0) {
        // break;
        // }
        // System.out.println("Total is : " + sum);
        // }
    }
}
