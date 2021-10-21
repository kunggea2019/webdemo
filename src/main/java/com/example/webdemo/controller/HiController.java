package com.example.webdemo.controller;

import com.example.webdemo.bean.Book;
import com.example.webdemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

import static com.example.webdemo.util.MD5Util.md5;

@RestController
public class HiController {

    @RequestMapping("/hi")
    public String hello() {
//        return "Hello World!";


        // 读取项目包内文件如此简单
//        String filePath = "./chinads_360.apk"; // 5e18f131adab3fdd4808b772ba469f7c
         String filePath = "./HELP.md"; // 2352C88E4362D80E48204D075B0F51DE
        File file = new File(filePath);
        if (!file.exists()) {
            throw new RuntimeException("文件不存在");
        }

        return "<p>你好 MD5<p>" + md5(filePath);

    }

//    @Autowired
//    BookMapper bookMapper;
//
//    @GetMapping("getBookList")
//    public List<Book> getBookList(){
//        return bookMapper.getBookList();
//    }



}
