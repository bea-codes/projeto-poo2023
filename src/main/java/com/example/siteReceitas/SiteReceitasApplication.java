package com.example.siteReceitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.siteReceitas.repository")
public class SiteReceitasApplication {

	public static void main(String[] args) {

		SpringApplication.run(SiteReceitasApplication.class, args);
	}

}
