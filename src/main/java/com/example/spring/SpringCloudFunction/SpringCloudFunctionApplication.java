package com.example.spring.SpringCloudFunction;

import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudFunctionApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> sayHello() {
		return name -> "Hello, " + name;
	}

	@Bean
	public Consumer<String> saveName() {
		return name -> logger.info("Save Name [Name={}]", name);
	}

	@Bean
	public Supplier<String> timeNow() {
		return () -> LocalTime.now().toString();
	}
}
