package org.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Hello, welcome to Exercise 4");

        System.out.print("Please enter your name: ");
        String fullName = read.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String showDate = read.nextLine();

        System.out.print("How many tickets would you like? ");
        int numTickets = read.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate daysOfShow = LocalDate.parse(showDate, formatter);


        if (numTickets > 1) {
            System.out.println(numTickets + " tickets reserved for " + daysOfShow + " under " + fullName);
        } else {
            System.out.println(numTickets + " ticket reserved for " + daysOfShow + " under " + fullName);
        }
    }
}