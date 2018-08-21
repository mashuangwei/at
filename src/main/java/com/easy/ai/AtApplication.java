package com.easy.ai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.easy.ai.mapper")
public class AtApplication {
	public static void main(String[] args) {
		SpringApplication.run(AtApplication.class, args);
	}
}
