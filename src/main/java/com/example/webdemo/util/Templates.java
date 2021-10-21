package com.example.webdemo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Templates {

    // Spring IOC 得用起来了
    @Bean
    public RestTemplate restTemplate() {
        // 微服务中，服务间http方式的调用方式
        // MQ 是内网环境的类似EventBus
        return new RestTemplate();
    }
}
