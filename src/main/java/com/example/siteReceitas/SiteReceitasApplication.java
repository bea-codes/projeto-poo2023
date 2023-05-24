package com.example.siteReceitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SiteReceitasApplication {

	public static void main(String[] args) {

		SpringApplication.run(SiteReceitasApplication.class, args);
	}

}
