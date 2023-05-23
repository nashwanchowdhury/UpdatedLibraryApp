package org.UpdatedLibraryApp;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int pages;
    private String category;
    private boolean isOnLoan;
    private LocalDate dueDate;
    private int feesDue;

    public Book(String title, String author, int releaseYear, int pages, String category, int feesDue) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.category = category;
        this.isOnLoan = false;
        this.feesDue = feesDue;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}