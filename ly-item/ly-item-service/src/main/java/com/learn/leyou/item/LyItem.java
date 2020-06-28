package com.learn.leyou.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LyItem {

    public static void main(String[] args) {
        SpringApplication.run(LyItem.class, args);
    }

}
