package com.library.mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LibraryMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMgmtApplication.class, args);
	}

}
