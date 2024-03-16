package com.buzz.book.pojo;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private String author;
    private String publishYear;
    private String isbn;
}
