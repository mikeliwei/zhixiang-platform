package com.tongji;

import com.tongji.storage.config.OssProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ZhiGuangApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiGuangApplication.class, args);
    }
}

