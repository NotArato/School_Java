package edu.main;

import java.util.Scanner;

/*
    Getting input from keyboard
    Check if its matching with the value of array "Days"
*/

public class Test {
    enum Days { // Array of available input
        SUN, MON, TUE, WED, THU, FRI, SAT
    };

    public static void main(String args[]) {
        Days a;
        System.out.println("What's your favorite day? ");
        Scanner keyboard = new Scanner(System.in);  // Getting input from keyboard
        a = Days.valueOf(keyboard.next());  // Check if input is equal to value of Days's array
        System.out.println("Your favorite day is " + a);
    }
}
