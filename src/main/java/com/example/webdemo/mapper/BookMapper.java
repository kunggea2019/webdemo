package com.example.webdemo.mapper;

import com.example.webdemo.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//   xml和注解都使用的的话貌似只能用@Mapper了
//   Application的@MapperScan就不能识别BookMapper为bean了吧
@Mapper
public interface BookMapper {

    // 注解写的sql
    @Select("SELECT * FROM `ssmbuild`.`books` LIMIT 0,1000")
    List<Book> getBookList();

    // xml写的sql
    Book getFirstBook();
    List<Book> getBooks();
    Book getBookById(int id);
}
