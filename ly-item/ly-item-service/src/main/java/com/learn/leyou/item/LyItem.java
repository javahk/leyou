package com.learn.leyou.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.learn.leyou.item.mapper")
public class LyItem {

    public static void main(String[] args) {
        SpringApplication.run(LyItem.class, args);
    }

}
