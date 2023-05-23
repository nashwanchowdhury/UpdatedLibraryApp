package org.UpdatedLibraryApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> ReleaseYear(int year) {
        return books.stream()
                .filter(book -> book.getReleaseYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> Author(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public Optional<Book> MostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages));
    }

    public List<Book> NumPages(int pages) {
        return books.stream()
                .filter(book -> book.getPages() > pages)
                .collect(Collectors.toList());
    }

    public List<Book> Category(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public void Titles() {
        books.stream()
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);

    }


    }

