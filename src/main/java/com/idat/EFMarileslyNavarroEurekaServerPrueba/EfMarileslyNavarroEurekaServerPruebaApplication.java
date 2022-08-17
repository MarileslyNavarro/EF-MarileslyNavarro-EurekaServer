package com.idat.EFMarileslyNavarroEurekaServerPrueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfMarileslyNavarroEurekaServerPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfMarileslyNavarroEurekaServerPruebaApplication.class, args);
	}

}
