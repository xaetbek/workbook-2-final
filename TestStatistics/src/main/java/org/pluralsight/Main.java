package org.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an array of test scores
        int[] scores = {34, 67, 97, 87, 56, 99, 53, 91, 73, 81};

        // Step 2: Declare variables to hold the total, high score, and low score
        int highestScore = scores[0];   // Start with the first element as the initial high score
        int lowestScore = scores[0];    // Start with the second element as the initial high score
        int total = 0;

        // Loop through each score in the array
        for (int score : scores) {
            total += score;     // Add each score to the total

            // Check for new high score
            if (score > highestScore) {
                highestScore = score;
            }
            // Check for new low score
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        // Calculate the average
        double average = (double) total / scores.length;

        // Display the stats
        System.out.println("The average score is: " + average);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);

        // Sort the array
        Arrays.sort(scores);

        // Since we have 10 scores, get the 5th and 6th elements
        double median = (scores[4] + scores[5]) / 2.0;

        System.out.println("Median: " + median);

        // Optional: print the difference between average and median
        System.out.println("Difference between average and median: " + Math.abs(average - median));
    }
}