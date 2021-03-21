package com.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.server.mapper")
public class RfidServiceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RfidServiceBackendApplication.class, args);
    }

}
