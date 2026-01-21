package edu.main;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        int count, number;
        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        count = 1; // loop variable
        while (count <= number) // control expression
        {
            System.out.print(count + ", ");
            count++; // sometimes, makes ‘count <= number’ false
        }
        System.out.println();
        System.out.println("Buckle my shoe.");
    }
}