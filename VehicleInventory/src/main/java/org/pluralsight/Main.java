package org.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        while (true) {
            // Menu prompt
            System.out.println("\nWhat do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.print("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (command) {
                case 1:
                    listAllVehicles(inventory, vehicleCount);
                    break;
                case 2:
                    searchByMakeModel(inventory, vehicleCount, scanner);
                    break;
                case 5:
                    vehicleCount = addVehicle(inventory, vehicleCount, scanner);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    // Option 1: List all vehicles
    public static void listAllVehicles(Vehicle[] inventory, int count) {
        System.out.println("\n--- Vehicle List ---");
        for (int i = 0; i < count; i++) {
            Vehicle v = inventory[i];
            System.out.printf("ID: %d | Model: %s | Color: %s | Odometer: %d | Price: $%.2f\n",
                    v.getVehicleId(), v.getMakeModel(), v.getColor(), v.getOdometerReading(), v.getPrice());
        }
    }

    // Option 2: Search by make/model
    public static void searchByMakeModel(Vehicle[] inventory, int count, Scanner scanner) {
        System.out.print("Enter make/model to search: ");
        String search = scanner.nextLine().toLowerCase();

        System.out.println("\n--- Search Results ---");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (inventory[i].getMakeModel().toLowerCase().contains(search)) {
                Vehicle v = inventory[i];
                System.out.printf("ID: %d | Model: %s | Color: %s | Odometer: %d | Price: $%.2f\n",
                        v.getVehicleId(), v.getMakeModel(), v.getColor(), v.getOdometerReading(), v.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found matching: " + search);
        }
    }

    // Option 5: Add a vehicle
    public static int addVehicle(Vehicle[] inventory, int count, Scanner scanner) {
        if (count >= inventory.length) {
            System.out.println("Inventory is full!");
            return count;
        }

        System.out.print("Enter vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter make and model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odometer = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        inventory[count] = new Vehicle(id, makeModel, color, odometer, price);
        System.out.println("Vehicle added successfully.");

        return count + 1;
    }
}