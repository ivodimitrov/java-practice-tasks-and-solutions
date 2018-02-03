package javafortesters.chap02;

import javafortesters.domainentities.Book;
import org.junit.Test;

public class BookTest {

    @Test
    public void isBookBorrowed() {

        Book javaBook = new Book("Java", "Getter Setter");

        javaBook.borrowBook();
        javaBook.returnBook();

        boolean result = javaBook.isBookBorrowed();

        System.out.println(result);
    }

}
