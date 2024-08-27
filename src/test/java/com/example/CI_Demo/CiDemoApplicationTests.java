package com.example.CI_Demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiDemoApplicationTests {
	static Logger logger = LoggerFactory.getLogger(CiDemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("It's a test class");
		assertEquals(true, true);
	}

	@Test
	void demoTest() {
		logger.info("It's a second test");
		assertEquals(true, true);
	}
}
