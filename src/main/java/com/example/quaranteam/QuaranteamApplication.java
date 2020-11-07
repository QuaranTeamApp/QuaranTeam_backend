package com.example.quaranteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.quaranteam.services.entity"})
public class QuaranteamApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuaranteamApplication.class, args);
	}

}
