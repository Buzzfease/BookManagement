package com.buzz.book.service.impl;

import com.buzz.book.mapper.BookMapper;
import com.buzz.book.pojo.Book;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class BookServiceImplTest {

    @Autowired
    @InjectMocks
    BookServiceImpl bookService;

    @Mock
    BookMapper bookMapper;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAll() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book());

        Mockito.when(bookMapper.getAll()).thenReturn(bookList);
        List<Book> result = bookService.getAll();

        Assertions.assertThat(result.size()).isEqualTo(bookList.size());
    }

    @Test
    void getBookById() {
        Book book = new Book(1L, "dummy");
        Mockito.when(bookMapper.getBookById(1L)).thenReturn(book);
        Book result = bookService.getBookById(1L);

        Assertions.assertThat(result.getName()).isEqualTo(book.getName());

    }

}