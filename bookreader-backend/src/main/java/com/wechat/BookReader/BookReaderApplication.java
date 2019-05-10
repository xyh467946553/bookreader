package com.wechat.BookReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookReaderApplication.class, args);
		System.out.println("启动成功！");
	}

}
