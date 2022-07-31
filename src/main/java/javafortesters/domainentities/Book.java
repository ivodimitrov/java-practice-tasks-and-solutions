package javafortesters.domainentities;

public class Book {

    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public boolean isBookBorrowed() {
        return isBorrowed;
    }

}
