package com.github.timofeevvr.test.automation.framework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationContextTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void givenSpringBoot_whenAddAnnotations_thenContextIsLoaded() {
		//when

		//then
	}

}