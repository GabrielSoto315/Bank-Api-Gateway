package com.Bank.BankApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApiGatewayApplication.class, args);
	}

}
