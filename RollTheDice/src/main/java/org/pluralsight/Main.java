package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        int rollCount = 0;
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int rollSum = roll1 + roll2;

            rollCount += 1;
            System.out.println("Roll " + rollCount + ": " + roll1 + " - " + roll2 + " Sum: " + rollSum);
            // Determine if the sum of roll1 and roll2 is 2,4,6,7, and if so increment the vars
            if (rollSum == 2) {
                twoCounter++;        // or twoCounter++;
            } else if (rollSum == 4) {
                fourCounter++;
            } else if (rollSum == 6) {
                sixCounter++;
            } else if (rollSum == 7) {
                sevenCounter++;
            }
        }
        // When the loop terminates, display counters!
        System.out.println("\nCounter of 2: " + twoCounter + "\nCounter of 4: " + fourCounter
        + "\nCounter of 6: " + sixCounter + "\nCounter of 7: " + sevenCounter);
    }
}