package com.buzz.book.pojo;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private String author;
    private String publishYear;
    private String isbn;

    public Book() {

    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
