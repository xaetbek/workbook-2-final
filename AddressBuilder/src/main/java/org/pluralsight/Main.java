package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        AddressBuilder buildAddress = new AddressBuilder();

        buildAddress.promptUser();
        buildAddress.displayInfo();
    }
}