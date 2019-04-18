package com.clz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clz.modules.sys.domain.dao")
public class AccountApplication {

	public static void main(String[] args) {
		System.out.println("start");//test12
		SpringApplication.run(AccountApplication.class, args);
		System.out.println("success");//test12
	}

}
