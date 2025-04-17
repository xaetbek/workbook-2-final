package org.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TheaterReservations theater = new TheaterReservations();

        theater.makeReservation();
        theater.showReservation();
    }
}