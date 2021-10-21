package com.example.webdemo;

import com.example.webdemo.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebdemoApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMybatis(){
        System.out.println(bookMapper.getBookList().get(0).toString());
    }
}
