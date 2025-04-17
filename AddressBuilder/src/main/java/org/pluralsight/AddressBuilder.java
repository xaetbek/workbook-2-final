package org.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    StringBuilder fullBillingAdd = new StringBuilder();
    StringBuilder fullShippingAdd = new StringBuilder();

    private String fullName;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;

    public void promptUser() {

        Scanner read = new Scanner(System.in);

        // Prompt the user with following information
        System.out.println("Please provide the following information:");

        // Ask for billing information
        System.out.print("Full name: ");
        this.fullName = read.nextLine();

        System.out.print("Billing Street: ");
        this.billingStreet = read.nextLine();

        System.out.print("Billing City: ");
        this.billingCity = read.nextLine();

        System.out.print("Billing State: ");
        this.billingState = read.nextLine();

        System.out.print("Billing Zip: ");
        this.billingZip = read.nextLine();

        // Ask for shipping information
        System.out.print("\nBilling Street: ");
        this.shippingStreet = read.nextLine();

        System.out.print("Billing City: ");
        this.shippingCity = read.nextLine();

        System.out.print("Billing State: ");
        this.shippingState = read.nextLine();

        System.out.print("Billing Zip: ");
        this.shippingZip = read.nextLine();

    }

    public void displayInfo() {
        // Display the customer's billing information
        System.out.println();
        System.out.println(fullBillingAdd.append(fullName).append("\nBilling Address:\n" + billingStreet).append("\n" + billingCity).append(", " +
                billingState).append(" " + billingZip));

        //Display the customer's shipping information
        System.out.println(fullShippingAdd.append("\nShipping Address:\n" + shippingStreet).append("\n" + shippingCity).append(", " +
                shippingState).append(" " + shippingZip));

    }
}
