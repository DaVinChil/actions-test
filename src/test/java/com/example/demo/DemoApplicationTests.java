package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	private final BasicController controller;

	public DemoApplicationTests(@Autowired BasicController controller) {
		this.controller = controller;
	}

	@Test
	void testHello() {
		String actual = controller.getHello();
		Assertions.assertEquals("HELLO", actual);
	}

	@Test
	void testDivision() {
		Assertions.assertEquals(Double.POSITIVE_INFINITY, controller.divide(1, 0));
	}
}
