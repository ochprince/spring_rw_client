package com.colasoft.spider_rw_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpiderRwClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiderRwClientApplication.class, args);
	}
}
