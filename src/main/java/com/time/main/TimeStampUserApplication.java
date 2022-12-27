package com.time.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
//(exclude=DataSourceAutoConfiguration.class)
public class TimeStampUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeStampUserApplication.class, args);
	}

}
