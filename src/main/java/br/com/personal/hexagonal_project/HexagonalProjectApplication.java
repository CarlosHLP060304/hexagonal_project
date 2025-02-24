package br.com.personal.hexagonal_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexagonalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalProjectApplication.class, args);
	}

}
