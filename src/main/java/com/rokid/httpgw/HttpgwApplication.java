package com.rokid.httpgw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rokid.httpgw.mapper")
public class HttpgwApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpgwApplication.class, args);
	}
}

