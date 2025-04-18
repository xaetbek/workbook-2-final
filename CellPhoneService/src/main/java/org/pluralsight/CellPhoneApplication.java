package org.pluralsight;


public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellphone1 = new CellPhone();
        CellPhone cellphone2 = new CellPhone();

        cellphone1.setUp();
        cellphone1.displayInfo();

        cellphone1.dial("123-45-67");

        display(cellphone1);
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