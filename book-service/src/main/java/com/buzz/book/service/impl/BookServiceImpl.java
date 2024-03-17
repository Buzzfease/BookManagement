package com.buzz.book.service.impl;

import com.buzz.book.mapper.BookMapper;
import com.buzz.book.pojo.Book;
import com.buzz.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookMapper.deleteBook(id);
    }
}
