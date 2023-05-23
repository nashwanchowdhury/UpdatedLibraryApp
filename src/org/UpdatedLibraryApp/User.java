package org.UpdatedLibraryApp;

import java.util.ArrayList;
import java.util.List;
public class User {
    private String name;
    private int libraryCardNumber;
    private List<Book> booksOnLoan;

    public User(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }
}