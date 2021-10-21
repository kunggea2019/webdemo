package com.example.webdemo.controller;

import com.example.webdemo.bean.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfulController {

    @ResponseBody
    @RequestMapping("/rest")
    public Dog hello() {
        Logger logger = LoggerFactory.getLogger(RestfulController.class);
        //调用 sl4j 的 info() 方法，而非调用 logback 的方法
        logger.info("Hello World Log4J");

        Dog dog = new Dog(1, "五毛", "喉舌，先锋队");
        logger.info(dog.toString());



        return dog;
    }
}
