package org.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //Create a constructor with id, isbn, title
    public Book(int id, String title, String isbn) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public void checkOut(String name){
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    public void checkIn() {
        this.checkedOutTo = "";
        isCheckedOut = false;
    }

    public void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("ISBN: " + getIsbn()) ;
        System.out.println("Is it checked out? " + getIsCheckedOut());
        System.out.println("It is checked out to: " + getCheckedOutTo());
    }

    // Create getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
