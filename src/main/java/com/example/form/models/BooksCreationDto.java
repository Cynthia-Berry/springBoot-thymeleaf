package com.example.form.models;

import java.util.List;

public class BooksCreationDto {
    private List<Book> books;

    // default and parameterized constructor

    public void addBook(Book book) {
        this.books.add(book);
    }

    public BooksCreationDto() {
    }

    //GETTERS AND SETTERS
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    //TO_STRING

    @Override
    public String toString() {
        return "BooksCreationDto{" +
                "books=" + books +
                '}';
    }
}
