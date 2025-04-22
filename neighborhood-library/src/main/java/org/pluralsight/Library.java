package org.pluralsight;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    List<Book> bookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void bookDatabase() {
        bookList.add(new Book(1, "Atomic Habits", "9780735211292"));
        bookList.add(new Book(2, "The Three-Body Problem", "9780765382030"));
        bookList.add(new Book(3, "Moby Dick", "932345783275"));
        bookList.add(new Book(4, "48 Laws of Power", "783293234575"));
        bookList.add(new Book(5, "The Prince", "45932393237"));
        bookList.add(new Book(6, "1984", "9780451524935"));
        bookList.add(new Book(7, "Things Fall Apart", "9780385474542"));
        bookList.add(new Book(8, "Mushoku Tensei: Jobless Reincarnation Vol. 1", "9781642751383"));
        bookList.add(new Book(9, "Artemis Fowl", "9781368036986"));
        bookList.add(new Book(10, "Unbroken", "9780812974492"));
        bookList.add(new Book(11, "Prisoner B-3087", "9780545459013"));
        bookList.add(new Book(12, "The Heroin Diaries", "9781501187544"));
        bookList.add(new Book(13, "For Whom the Bells Ring", "9781875011544"));
        bookList.add(new Book(14, "Ender's Game", "9780812550702"));
        bookList.add(new Book(15, "The Prince", "9781668506448"));
        bookList.add(new Book(16, "Bygone Days", "7583529780620"));
        bookList.add(new Book(17, "90 Rules for Entrepreneurs", "9780620758352"));
        bookList.add(new Book(18, "Art of War", "9014078280197"));
        bookList.add(new Book(19, "On Providence", "9781668544444"));
        bookList.add(new Book(20, "Returning to Eden", "9781661111448"));
    }

    public void displayOptions(){
        boolean running = true;

        while (running) {
            System.out.println("\n📚 Welcome to the Neighborhood Library 📚");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Please, enter one of the options: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    showAvailableBooks();
                    break;
                case 2:
                    showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
    private void showAvailableBooks() {
        bookDatabase();
        System.out.println("\n--- Available Books ---");
        boolean hasAvailable = false;
        for (Book book : bookList) {
            if (!book.getIsCheckedOut()) {
                book.displayBookDetails();
                hasAvailable = true;
            }
        }

        if (!hasAvailable) {
            System.out.println("No available books.");
        } else {
            System.out.print("Enter Book ID to check out or X to return: ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("X")) {
                try {
                    int bookId = Integer.parseInt(input);
                    Book book = getBookById(bookId);
                    if (book != null && !book.getIsCheckedOut()) {
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        book.checkOut(name);
                    } else {
                        System.out.println("Invalid ID or book already checked out.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
        }
    }

    private void showCheckedOutBooks() {
        System.out.println("\n--- Checked Out Books ---");
        boolean hasCheckedOut = false;
        for (Book book : bookList) {
            if (book.getIsCheckedOut()) {
                System.out.println("ID: " + book.getId() + " \nTitle: " + book.getTitle() + "\nISBN: " + book.getIsbn() +
                        "\nChecked out to: " + book.getCheckedOutTo());
                hasCheckedOut = true;
            }
        }

        if (!hasCheckedOut) {
            System.out.println("No books are currently checked out.");
        } else {
            System.out.print("Enter C to check in a book or X to return: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("C")) {
                System.out.print("Enter Book ID to check in: ");
                try {
                    int bookId = Integer.parseInt(scanner.nextLine());
                    Book book = getBookById(bookId);
                    if (book != null && book.getIsCheckedOut()) {
                        book.checkIn();
                    } else {
                        System.out.println("Invalid ID or book is not checked out.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
        } System.out.println("\nThanks for checking book in!");
    }

    private Book getBookById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    
}
