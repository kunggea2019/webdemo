package com.example.webdemo.mapper;

import com.example.webdemo.bean.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface BookMapper {

    // 注解写的sql
    @Select("SELECT * FROM `ssmbuild`.`books` LIMIT 0,1000")
    List<Book> getBookList();

    // xml写的sql
    Book getFirstBook();
    List<Book> getBooks();
    Book getBookById(int id);
}
