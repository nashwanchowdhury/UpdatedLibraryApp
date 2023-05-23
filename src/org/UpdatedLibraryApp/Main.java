package org.UpdatedLibraryApp;

import java.time.LocalDate;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User one = new User("Billy", 488929);
        User two = new User("Bob", 320223);
        User three = new User("Joe", 129483);

        library.registerUser(one);
        library.registerUser(two);
        library.registerUser(three);

        Book book1 = new Book("The Giver", "J.K Rowling", 1920, 132, "Fiction", 43);
        Book book2 = new Book("Tom Sawyer", "Harper Lee", 1930, 234, "Fiction", 19);
        Book book3 = new Book("The Ring", "F. Scott Fitzgerald", 1940, 221, "Fiction", 32);
        Book book4 = new Book("Harry Potter and The Sorcerers Stone", "J.K Rowling", 1970, 344, "Fiction", 3);
        Book book5 = new Book("The Hunger Games", "F. Scott Fitzgerald", 2010, 563, "Fiction", 5);
        Book book6 = new Book("Mockingjay", "Harper Lee", 2019, 233, "Non-Fiction", 9);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        library.Author("J.K Rowling").forEach(System.out::println);
        System.out.println();

        library.ReleaseYear(1940).forEach(System.out::println);
        System.out.println();

        System.out.println(library.MostPages());
        System.out.println();

        library.NumPages(120).forEach(System.out::println);
        System.out.println();

        library.Titles();
        System.out.println();

        library.Category("fiction").forEach(System.out::println);
        System.out.println();
    }
}

