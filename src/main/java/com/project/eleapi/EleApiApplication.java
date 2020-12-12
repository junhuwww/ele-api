package com.project.eleapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.eleapi.mapper")
public class EleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EleApiApplication.class, args);
    }

}
