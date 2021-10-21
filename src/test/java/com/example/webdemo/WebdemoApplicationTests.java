package com.example.webdemo;

import com.example.webdemo.bean.Book;
import com.example.webdemo.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class WebdemoApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMybatis() {
        System.out.println(bookMapper.getBookList().get(0).toString());
    }


    @Autowired
    RestTemplate restTemplate;

    @Test
    void testRestTemplate() {
        Book book = restTemplate.
                getForObject("http://192.168.31.189:8080/getFirst", Book.class);
        System.out.println(book.toString());

    }
}
