package org.pluralsight;

public class Book {
    // Author, title, tableOfContent, Genre, ISBN
    private String title;
    private String author;
    private String tableOfContent;
    private int pageNumber;
    private String Genre;
    private String ISBN;
    private int publishingYear;

    //Create a constructor with title, author and isbn.
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN) ;
        System.out.println("Published Year: " + this.publishingYear);
        System.out.println("Page Number: " + this.pageNumber);
    }

    // Create getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTableOfContent() {
        return tableOfContent;
    }

    public void setTableOfContent(String tableOfContent) {
        this.tableOfContent = tableOfContent;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("The page number must be greater than 0.");
        }
        this.pageNumber = pageNumber;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
