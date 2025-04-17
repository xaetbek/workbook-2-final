package org.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    private String fullName;
    private String userInputDate;
    private LocalDate dateOfShow;
    private int numTickets;

    public void makeReservation() {
        Scanner read = new Scanner(System.in);

        System.out.println("Hello, welcome to Exercise 4");

        System.out.print("Please enter your name: ");
        this.fullName = read.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        this.userInputDate = read.nextLine();

        System.out.print("How many tickets would you like? ");
        this.numTickets = read.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.dateOfShow = LocalDate.parse(userInputDate, formatter);
    }

    public void showReservation() {
        if (numTickets > 1) {
            System.out.println(numTickets + " tickets reserved for " + dateOfShow + " under " + fullName);
        } else {
            System.out.println(numTickets + " ticket reserved for " + dateOfShow + " under " + fullName);
        }
    }
}
