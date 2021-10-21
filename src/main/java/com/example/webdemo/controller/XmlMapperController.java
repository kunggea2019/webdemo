package com.example.webdemo.controller;

import com.example.webdemo.bean.Book;
import com.example.webdemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class XmlMapperController {
    // xml方式的mapper

    @Autowired
    BookMapper bookMapper;

    @GetMapping("getFirst")
    public Book getFirstBook() {
        return bookMapper.getFirstBook();
    }

    @GetMapping("getBooks")
    public List<Book> getBooks() {
        return bookMapper.getBooks();
    }

    @GetMapping("getBookById/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return bookMapper.getBookById(id);
    }
}
