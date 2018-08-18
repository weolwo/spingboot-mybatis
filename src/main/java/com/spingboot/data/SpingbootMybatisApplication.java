package com.spingboot.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages="com.spingboot.data.mapper")//使用批量扫描
@SpringBootApplication
public class SpingbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingbootMybatisApplication.class, args);
    }
}
