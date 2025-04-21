package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create an array to hold up to 20 vehicles
        Vehicle[] inventory = new Vehicle[20];

        // Track how many vehicles are currently in inventory
        int vehicleCount = 6;

        // Preload the first 6 vehicles
        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500f);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000f);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700f);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500f);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500f);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000f);

    }
}