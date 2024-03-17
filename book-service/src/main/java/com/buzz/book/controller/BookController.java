package com.buzz.book.controller;

import com.buzz.book.pojo.Book;
import com.buzz.book.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@Param("id") Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/insert")
    public void insertBook(@RequestBody Book book) {
        bookService.insertBook(book);
    }

    @PostMapping("/update")
    void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @GetMapping("/delete/{id}")
    void deleteBook(@Param("id") Long id) {
        bookService.deleteBook(id);
    }
}
