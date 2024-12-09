package com.tk.reactive_java;

import org.springframework.boot.SpringApplication;

public class TestReactiveJavaApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReactiveJavaApplication::main)
				.with(TestcontainersConfiguration.class)
				.run(args);
	}

}
