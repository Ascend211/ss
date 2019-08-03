package com.fh.shop.producr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.fh.shop.producr.mapper")
@EnableFeignClients("com.fh.shop")
@ComponentScan("com.fh.shop")
public class ShopProductProducrMpApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopProductProducrMpApplication.class, args);
    }
}
