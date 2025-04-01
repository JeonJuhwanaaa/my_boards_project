package com.boards.boards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BoardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardsApplication.class, args);
	}
}

