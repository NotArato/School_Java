package edu.main;

import java.util.Scanner;

/*
    Getting input value from keyboard into score
    Check if the score is true in one of the condtion
*/

public class Grader {

    public static void main(String[] args) {
        int score;
        char grade;
        System.out.println("Enter your score: ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt(); //  Getting input value from keyboard as score

        if (score >= 90)    // Checking the value of score to see if it true in one of the condition
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);
    }
}