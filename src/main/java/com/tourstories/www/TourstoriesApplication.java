package com.tourstories.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class TourstoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourstoriesApplication.class, args);
	}

}
