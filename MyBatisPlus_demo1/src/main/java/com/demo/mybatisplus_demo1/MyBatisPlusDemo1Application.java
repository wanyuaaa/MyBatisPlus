package com.demo.mybatisplus_demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口所在的包
@MapperScan("com.demo.mybatisplus_demo1.mapper")
public class MyBatisPlusDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusDemo1Application.class, args);
    }

}
