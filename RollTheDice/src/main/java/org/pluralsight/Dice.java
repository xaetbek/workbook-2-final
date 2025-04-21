package org.pluralsight;

public class Dice {
    int minValue = 1;
    int maxValue = 6;
    public int roll() {
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;
    }
}
