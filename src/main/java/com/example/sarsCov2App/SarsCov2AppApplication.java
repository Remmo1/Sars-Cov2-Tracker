package com.example.sarsCov2App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SarsCov2AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SarsCov2AppApplication.class, args);
	}

}
