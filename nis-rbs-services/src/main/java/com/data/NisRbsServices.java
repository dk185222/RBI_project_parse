package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "application-base-package", "com.data" })
public class NisRbsServices {
	public static void main(final String[] args) {
		SpringApplication.run(NisRbsServices.class, args);
	}
}
