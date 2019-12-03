package com.wuju.gmall.gmalluser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.wuju.gmall.gmalluser.mapper")
@SpringBootApplication
public class GmallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserApplication.class, args);
	}

}
