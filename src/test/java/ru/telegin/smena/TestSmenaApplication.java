package ru.telegin.smena;

import org.springframework.boot.SpringApplication;

public class TestSmenaApplication {

	public static void main(String[] args) {
		SpringApplication.from(SmenaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
