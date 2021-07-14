package com.corejava.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
public class CorejavaWithSpringApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CorejavaWithSpringApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CorejavaWithSpringApplication.class);
	}
}
