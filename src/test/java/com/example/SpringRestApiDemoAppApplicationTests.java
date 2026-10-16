package com.example;

import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringRestApiDemoAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void applicationClassIsAnnotatedAsSpringBootApplication() {
		assertThat(SpringRestApiDemoAppApplication.class)
				.hasAnnotation(SpringBootApplication.class);
	}

	@Test
	void mainMethodIsPublicStatic() throws NoSuchMethodException {
		var method = SpringRestApiDemoAppApplication.class.getDeclaredMethod("main", String[].class);

		assertThat(Modifier.isPublic(method.getModifiers())).isTrue();
		assertThat(Modifier.isStatic(method.getModifiers())).isTrue();
	}
}
