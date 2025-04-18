package org.pluralsight;

import java.util.Scanner;

public class CellPhone {
    // Initialize variables
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //Global scanner object "read"
    Scanner read = new Scanner(System.in);

    // Build a parameterless constructor
    public CellPhone () {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Prompt user for input and Use setter
    public void setUp(){
        System.out.print("\nWhat is the serial number? - ");
        setSerialNumber(read.nextLong());
        read.nextLine();

        System.out.print("What model is the phone? - " );
        setModel(read.nextLine());

        System.out.print("Who is the carrier? - ");
        setCarrier(read.nextLine());

        System.out.print("What is the phone number? - ");
        setPhoneNumber(read.nextLine());

        System.out.print("Who is the owner of the phone? - ");
        setOwner(read.nextLine());
    }

    // Display the user's input
    public void displayInfo(){
        System.out.println("\nHello, " + getOwner());
        System.out.println("This is your " + getModel() + " with serial number " + getSerialNumber());
        System.out.println("Your carrier is " + getCarrier() + " and your phone number is " + getPhoneNumber());
    }

    // Add a dial() method
    public void dial(String phoneNumber) {
        System.out.println();
        System.out.println(getOwner() + "'s phone is calling " + phoneNumber);
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
