package com.example.CI_Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemoApplication {

	static Logger logger = LoggerFactory.getLogger(CiDemoApplication.class);
	public static void main(String[] args) {
		logger.info("This is a running job.");
		SpringApplication.run(CiDemoApplication.class, args);
	}

}
