package edu.main;

import java.util.Scanner;

/*
    Getting two input string from keyboard and compare them with each other
*/

public class StringEqualityDemo {
    public static void main(String[] args) {
        String s1, s2;
        System.out.println("Enter two lines of text:");
        Scanner keyboard = new Scanner(System.in);  // Getting input from keyboard
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();
        if (s1.equals(s2))  // Checking if the string1 is equal to string2
            System.out.println("The two lines are equal.");
        else
            System.out.println("The two lines are not equal.");
        if (s2.equals(s1))  // Checking if the string2 is equal to string1
            System.out.println("The two lines are equal.");
        else
            System.out.println("The two lines are not equal.");
        if (s1.equalsIgnoreCase(s2))    // Checking if the string1 is equal to string2 but ignoring the LowerCase or UpperCase
            System.out.println(
                    "But the lines are equal, ignoring case.");
        else
            System.out.println(
                    "Lines are not equal, even ignoring case.");
    }
}
