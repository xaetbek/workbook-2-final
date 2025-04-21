package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] scores = {34, 67, 97, 87, 56, 99, 53, 91, 73, 81};

        int highestScore = 0;
        int lowesScore = 0;

//        int total = 0;
//        for (int i = 0; i < scores.length; i++) {
//            total += scores[i];
//        }
        // Enhanced version of for loop (cleaner)
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.println("The average score is: " + average);
    }
}