package org.pluralsight;


public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellphone1 = new CellPhone();
        CellPhone cellphone2 = new CellPhone();

        // Exercise 3 Modify CellPhone
        CellPhone cellphone3 = new CellPhone(1112223444, "Nokia", "T-Mobile","+46305603131","Bekzod");

        // Populate the object and display by calling the methods
        cellphone1.setUp();
        cellphone1.displayInfo();

        cellphone2.setUp();
        cellphone2.displayInfo();

        // Dial
        cellphone1.dial(cellphone2.getPhoneNumber());

        // Display the properties of a cell phone in a meaningful way.
        display(cellphone1);
        display(cellphone2);
        display(cellphone3);
   }

   public static void display(CellPhone cellphone){
        System.out.println();
        System.out.println("Owner: " + cellphone.getOwner());
        System.out.println("Model: " + cellphone.getModel());
        System.out.println("Serial Number: " + cellphone.getSerialNumber());
        System.out.println("Carrier: " + cellphone.getCarrier());
        System.out.println("Phone Number: " + cellphone.getPhoneNumber());
   }
}