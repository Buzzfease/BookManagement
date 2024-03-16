package com.buzz.book.service;

import com.buzz.book.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book getBookById(@Param("id") Long id);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(@Param("id") Long id);
}
