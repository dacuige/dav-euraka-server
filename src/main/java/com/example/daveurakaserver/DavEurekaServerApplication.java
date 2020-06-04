package com.example.daveurakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DavEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavEurekaServerApplication.class, args);
	}

}
