package com.gra.builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.gra.builder.repository.WeaponRepository;
import com.gra.builder.service.WeaponService;

@SpringBootApplication
@ComponentScan 
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
	}


}
