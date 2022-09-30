package com.example.se.jpamysqltuan4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
@RequiredArgsConstructor
public class JpaMysqlTuan4Application {

	private static final Logger log = LoggerFactory.getLogger(JpaMysqlTuan4Application.class);
	public static void main(String[] args) {
		SpringApplication.run(JpaMysqlTuan4Application.class, args);
	}

}
