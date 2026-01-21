package edu.main;

import java.util.Scanner;

public class BugInfestation {

    public static final double GROWTH_RATE = 0.95; // Weekly Grow Rate of roach population
    public static final double ONE_BUG_VOLUME = 0.002; // Volume of an average roach

    public static void main(String[] args) {
        int houseVolume;
        int countWeeks, startPopulation;
        double population, newBugs, totalBugVolume, newBugVolume;

        System.out.println("Enter a total volume of your house in cubic feet: ");
        Scanner GhouseVolume = new Scanner(System.in); // Getting input from keyboard
        houseVolume = GhouseVolume.nextInt();
        System.out.println("Enter the estimated number of roaches in your house: ");
        Scanner GstartPopulation = new Scanner(System.in); // Getting input from keyboard
        startPopulation = GstartPopulation.nextInt();
        population = startPopulation;
        totalBugVolume = population * ONE_BUG_VOLUME;
        countWeeks = 0;
        while (totalBugVolume < houseVolume) {
            newBugs = population * GROWTH_RATE;
            newBugVolume = newBugs * ONE_BUG_VOLUME;
            population = population + newBugs;
            totalBugVolume = totalBugVolume + newBugVolume;
            countWeeks = countWeeks + 1;
        }
        System.out.println("Starting with a population of " + startPopulation);
        System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
        System.out.println("after " + countWeeks);
        System.out.println("the house will be filled with " + Math.round(population) + " roaches.");
        System.out.println("They will fill a volume of " + Math.round(totalBugVolume) + " cubic feet.");
        System.out.println("Better call Debugging Experts Inc.");
    }
}