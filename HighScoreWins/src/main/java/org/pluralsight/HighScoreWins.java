package org.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Please, enter a game score (e.g. Home:Visitor|21:9): ");
        String userScoreInput = read.nextLine();

        String[] parts = userScoreInput.split(Pattern.quote("|")); // or .split("\\|);

        String[] teams = parts[0].split(":");
        String[] score = parts[1].split(":");

        var teamOne = teams[0];
        var teamTwo = teams[1];

        var scoreOne = Integer.parseInt(score[0]);
        var scoreTwo = Integer.parseInt(score[1]);

        if (scoreOne > scoreTwo) {
            System.out.println("The team " + "'" + teamOne + "' is the winner with score: " + scoreOne);
        } else {
            System.out.println("The team " + "'" + teamTwo + "' is the winner with score: " + scoreTwo);
        }
    }
}