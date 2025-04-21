package org.pluralsight;

public class ForLoop {
    public void main() throws InterruptedException {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);  // pause 1 second between each number to slow the countdown
        }
        System.out.println("Lunch");
    }
}
