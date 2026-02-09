package com.nailbook.nailbook_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class NailbookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NailbookApiApplication.class, args);
	}

}
