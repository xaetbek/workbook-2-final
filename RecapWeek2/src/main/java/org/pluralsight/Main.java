package org.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create an arraylist of Books
        List<Book> bookList = new ArrayList<>();

        //Create 3 book objects using the constructor
        Book book1 = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");
        //adding a book to the list
        bookList.add(book1);
        bookList.add(new Book("Atomic Habits", "James Clear", "9780735211292"));

        //Create an array of Books
        Book[] books = new Book[15];

        books[0] = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");
        books[1] = new Book("Moby Dick", "Herman Melville", "932345783275");
        books[2] = new Book("48 Laws of Power", "Robert Greene", "783293234575");
        books[3] = new Book("The Prince", "Niccolo Machiavelli", "45932393237");
        books[4] = new Book("1984", "George Orwell", "9780451524935");
        books[5] = new Book("Things Fall Apart", "Chinua Achebe", "9780385474542");
        books[6] = new Book("Mushoku Tensei: Jobless Reincarnation Vol. 1", "Rifujin na Magonote", "9781642751383");
        books[7] = new Book("Artemis Fowl", "Eoin Colfer", "9781368036986");
        books[8] = new Book("Unbroken", "Laura Hillenbrand", "9780812974492");
        books[9] = new Book("Prisoner B-3087", "Alan Gratz", "9780545459013");
        books[10] = new Book("The Heroin Diaries", "Nikki Sixx", "9781501187544");
        books[11] = new Book("90 Rules for Entrepreneurs", "Marnus Broodryk", "9780620758352");
        books[12] = new Book("The 48 Laws of Power", "Robert Greene", "9780140280197");
        books[13] = new Book("Ender's Game", "Orson Scott Card", "9780812550702");
        books[14] = new Book("The Prince", "Niccolò Machiavelli", "9781668506448");


//        books[0].displayBookDetails();
//        books[1].displayBookDetails();
//        books[2].displayBookDetails();

        // Method 1: Enhanced For-Loop (short & elegant)
        System.out.println("📘 Using enhanced for-loop:");
        for (Book book : bookList) {
            book.displayBookDetails();
            System.out.println();
        }

        //  Method 2: Classic For-Loop with index
        System.out.println("📘 Using classic for-loop:");
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).displayBookDetails();
            System.out.println();
        }
    }
}