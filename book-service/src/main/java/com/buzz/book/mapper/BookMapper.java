package com.buzz.book.mapper;

import com.buzz.book.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from tb_book")
    List<Book> getAll();

    @Select("select * from tb_book where id = #{id}")
    Book getBookById(@Param("id") Long id);

    @Insert("insert into tb_book(name, author, publishYear, isbn) values(#{name}, #{author}, #{publishYear}, #{isbn})")
    void insertBook(Book book);

    @Update("update tb_book set name=#{name}, author=#{author}, publishYear=#{publishYear}, isbn=#{isbn} where id=#{id}")
    void updateBook(Book book);

    @Delete("delete from tb_book where id = #{id}")
    void deleteBook(@Param("id") Long id);

}
