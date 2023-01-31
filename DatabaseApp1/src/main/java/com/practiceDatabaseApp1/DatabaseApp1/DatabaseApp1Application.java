package com.practiceDatabaseApp1.DatabaseApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DatabaseApp1Application {

	public static void main(String[] args) {

		//SpringApplication.run(DatabaseApp1Application.class, args);
		ConfigurableApplicationContext run = SpringApplication.run(DatabaseApp1Application.class, args);
	}

}
